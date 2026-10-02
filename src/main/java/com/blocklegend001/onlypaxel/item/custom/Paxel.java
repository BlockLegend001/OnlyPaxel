package com.blocklegend001.onlypaxel.item.custom;

import com.blocklegend001.onlypaxel.utils.ModTags;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.core.component.DataComponents;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ToolMaterial;
import net.minecraft.world.item.component.BlockTransformers;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.CampfireBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;

public class Paxel extends Item {

    private static TagKey<Block> paxelMineable = ModTags.Blocks.PAXEL_MINEABLE;
    private final ToolMaterial tier;

    public Paxel(ToolMaterial tier, float attackDamage, float attackSpeed, Item.Properties properties) {
        super(computeProperties(tier, ModTags.Blocks.PAXEL_MINEABLE, attackDamage, attackSpeed, properties));
        this.tier = tier;
    }

    public ToolMaterial getTier() {
        return tier;
    }

    @Override
    public float getDestroySpeed(ItemStack stack, BlockState state) {
        stack.get(DataComponents.TOOL);
        return state.is(paxelMineable) ? tier.speed() : 1.0F;
    }

    @Override
    public boolean mineBlock(ItemStack stack, Level world, BlockState state, BlockPos pos, LivingEntity user) {
        if (!world.isClientSide() && state.is(paxelMineable)) {
            world.setBlock(pos, state, 11);
            if (user != null) user.getMainHandItem().hurtAndBreak(1, user, InteractionHand.MAIN_HAND);
            return true;
        }
        return false;
    }

    private static Item.Properties computeProperties(ToolMaterial tier, TagKey<Block> paxelMineable, float attackDamage, float attackSpeed, Item.Properties properties) {
        Paxel.paxelMineable = paxelMineable;
        properties.pickaxe(wrapMaterial(tier, tier.durability()), attackDamage, attackSpeed);
        properties.shovel(wrapMaterial(tier, tier.durability()), attackDamage, attackSpeed);
        properties.axe(wrapMaterial(tier, tier.durability()), attackDamage, attackSpeed);
        properties.tool(tier, BlockTags.MINEABLE_WITH_PICKAXE, attackDamage, attackSpeed, 0.0F);
        return properties;
    }

    @Override
    public InteractionResult useOn(UseOnContext context) {
        if (playerHasShieldUseIntent(context)) return InteractionResult.PASS;

        Level world = context.getLevel();

        InteractionResult result = world.registryAccess()
                .getOrThrow(BlockTransformers.AXE)
                .value()
                .transformBlock(context);
        if (result.consumesAction()) return result;

        if (context.getClickedFace() == Direction.DOWN) return InteractionResult.PASS;

        result = world.registryAccess()
                .getOrThrow(BlockTransformers.SHOVEL)
                .value()
                .transformBlock(context);
        if (result.consumesAction()) return result;

        BlockPos pos = context.getClickedPos();
        BlockState state = world.getBlockState(pos);
        if (state.getBlock() instanceof CampfireBlock && state.getValue(CampfireBlock.LIT)) {
            Player player = context.getPlayer();
            if (!world.isClientSide()) {
                world.playSound(null, pos, SoundEvents.AXE_SCRAPE.value(), SoundSource.BLOCKS, 1.0F, 1.0F);
                world.setBlock(pos, state.setValue(CampfireBlock.LIT, false), 11);
                if (player != null) context.getItemInHand().hurtAndBreak(1, player, InteractionHand.MAIN_HAND);
            }
            return InteractionResult.SUCCESS;
        }

        return InteractionResult.PASS;
    }

    private static boolean playerHasShieldUseIntent(UseOnContext context) {
        Player player = context.getPlayer();
        return player != null
                && context.getHand().equals(InteractionHand.MAIN_HAND)
                && player.getOffhandItem().is(Items.SHIELD)
                && !player.isSecondaryUseActive();
    }

    private static ToolMaterial wrapMaterial(ToolMaterial toolMaterial, int durability) {
        return new ToolMaterial(
                toolMaterial.incorrectBlocksForDrops(),
                durability,
                toolMaterial.speed(),
                toolMaterial.attackDamageBonus(),
                toolMaterial.enchantmentValue(),
                toolMaterial.repairItems()
        );
    }
}