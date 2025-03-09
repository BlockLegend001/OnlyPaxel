package com.blocklegend001.onlypaxel.item.custom;

import com.blocklegend001.onlypaxel.utils.ModTags;
import net.minecraft.block.*;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.*;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.Map;
import java.util.Optional;

public class Paxel extends MiningToolItem {

    private static final Map<Block, BlockState> FLATTENABLES = Shovel.getFlattenables();
    private static final Map<Block, Block> STRIPPABLES = Axe.getStrippables();

    public Paxel(ToolMaterial tier, float attackDamage, float attackSpeed, Settings settings) {
        super(tier, ModTags.Blocks.PAXEL_MINEABLE, attackDamage, attackSpeed, settings);
    }

    @Override
    public ActionResult useOnBlock(ItemUsageContext context) {
        World world = context.getWorld();
        BlockPos pos = context.getBlockPos();
        BlockState state = world.getBlockState(pos);
        BlockState result = getModifiedBlockState(context, state, pos);
        PlayerEntity player = context.getPlayer();

        if (shouldCancelStripAttempt(context)) return ActionResult.PASS;

        if (result == null) return ActionResult.PASS;

        if (!world.isClient()) {
            world.setBlockState(pos, result, 11);
            if (player != null) context.getStack().damage(1, player,
                    LivingEntity.getSlotForHand(context.getHand()));
        }
        return ActionResult.SUCCESS;
    }

    private BlockState getModifiedBlockState(ItemUsageContext context, BlockState state, BlockPos pos) {
        World world = context.getWorld();
        PlayerEntity player = context.getPlayer();

        if (STRIPPABLES.containsKey(state.getBlock())) {
            world.playSound(player, pos, SoundEvents.ITEM_AXE_STRIP, SoundCategory.BLOCKS, 1.0F, 1.0F);
            return STRIPPABLES.get(state.getBlock()).getDefaultState()
                    .with(PillarBlock.AXIS, state.get(PillarBlock.AXIS));
        }

        Optional<BlockState> newState = evaluateNewBlockState(world, pos, player, state);
        if (newState.isPresent()) {
            return newState.get();
        }

        if (context.getSide() == Direction.DOWN) return null;

        if (FLATTENABLES.containsKey(state.getBlock()) && world.getBlockState(pos.up()).isAir()) {
            world.playSound(player, pos, SoundEvents.ITEM_SHOVEL_FLATTEN, SoundCategory.BLOCKS, 1.0F, 1.0F);
            return FLATTENABLES.get(state.getBlock());
        }

        if (state.getBlock() instanceof CampfireBlock && state.get(CampfireBlock.LIT)) {
            world.playSound(player, pos, SoundEvents.ITEM_AXE_SCRAPE, SoundCategory.BLOCKS, 1.0F, 1.0F);
            return state.with(CampfireBlock.LIT, false);
        }

        return null;
    }

    private static boolean shouldCancelStripAttempt(ItemUsageContext context) {
        PlayerEntity playerEntity = context.getPlayer();
        return context.getHand().equals(Hand.MAIN_HAND) && playerEntity.getOffHandStack().isOf(Items.SHIELD) && !playerEntity.shouldCancelInteraction();
    }

    private Optional<BlockState> evaluateNewBlockState(World world, BlockPos pos, @Nullable PlayerEntity player, BlockState state) {
        Optional<BlockState> optional = this.getStripped(state);
        if (optional.isPresent()) {
            world.playSound(player, pos, SoundEvents.ITEM_AXE_STRIP, SoundCategory.BLOCKS, 1.0F, 1.0F);
            return optional;
        } else {

            Optional<BlockState> optional1 = Oxidizable.getDecreasedOxidationState(state);
            if (optional1.isPresent()) {
                world.playSound(player, pos, SoundEvents.ITEM_AXE_SCRAPE, SoundCategory.BLOCKS, 1.0F, 1.0F);
                world.syncWorldEvent(player, 3005, pos, 0);
                return optional1;
            } else {

                Optional<BlockState> optional2 = Optional.ofNullable(HoneycombItem.WAXED_TO_UNWAXED_BLOCKS.get().get(state.getBlock()))
                        .map(block -> block.getStateWithProperties(state));
                if (optional2.isPresent()) {
                    world.playSound(player, pos, SoundEvents.ITEM_AXE_WAX_OFF, SoundCategory.BLOCKS, 1.0F, 1.0F);
                    world.syncWorldEvent(player, 3004, pos, 0);
                    return optional2;
                } else {

                    return Optional.empty();
                }
            }
        }
    }

    private Optional<BlockState> getStripped(BlockState state) {
        return Optional.ofNullable(STRIPPABLES.get(state.getBlock()))
                .map((block) -> block.getDefaultState().with(PillarBlock.AXIS, state.get(PillarBlock.AXIS)));
    }

    private static final class Axe extends AxeItem {
        public static Map<Block, Block> getStrippables() {
            return AxeItem.STRIPPED_BLOCKS;
        }

        private Axe(ToolMaterial tier, float attackDamage, float attackSpeed, Settings settings) {
            super(tier, attackDamage, attackSpeed, settings);
        }
    }

    private static final class Shovel extends ShovelItem {
        public static Map<Block, BlockState> getFlattenables() {
            return ShovelItem.PATH_STATES;
        }

        private Shovel(ToolMaterial tier, float attackDamage, float attackSpeed, Settings settings) {
            super(tier, attackDamage, attackSpeed, settings);
        }
    }
}
