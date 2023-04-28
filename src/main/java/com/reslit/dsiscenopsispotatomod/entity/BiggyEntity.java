package com.reslit.dsiscenopsispotatomod.entity;

import javax.annotation.Nullable;

import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.AgeableMob;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.goal.BreedGoal;
import net.minecraft.world.entity.ai.goal.FloatGoal;
import net.minecraft.world.entity.ai.goal.FollowParentGoal;
import net.minecraft.world.entity.ai.goal.LookAtPlayerGoal;
import net.minecraft.world.entity.ai.goal.PanicGoal;
import net.minecraft.world.entity.ai.goal.RandomLookAroundGoal;
import net.minecraft.world.entity.ai.goal.WaterAvoidingRandomStrollGoal;
import net.minecraft.world.entity.animal.Animal;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraftforge.common.ForgeMod;

public class BiggyEntity extends Animal {
    public BiggyEntity(EntityType<? extends Animal> type, Level level) {
        super(type, level);
    }
    
    @Nullable
    @Override
    public AgeableMob getBreedOffspring(ServerLevel level, AgeableMob mob) {
        return ModEntities.BIGGY.get().create(level);
    }

    @Override
    protected void registerGoals() {
         this.goalSelector.addGoal(0, new FloatGoal(this));
         this.goalSelector.addGoal(1, new PanicGoal(this, 1.25D));
         this.goalSelector.addGoal(3, new BreedGoal(this, 1.0D));
         this.goalSelector.addGoal(5, new FollowParentGoal(this, 1.1D));
         this.goalSelector.addGoal(6, new WaterAvoidingRandomStrollGoal(this, 1.0D));
         this.goalSelector.addGoal(7, new LookAtPlayerGoal(this, Player.class, 6.0F));
         this.goalSelector.addGoal(8, new RandomLookAroundGoal(this));
    }

    public static AttributeSupplier.Builder getBiggyAttributes() {
        return Mob.createMobAttributes().add(ForgeMod.ENTITY_GRAVITY.get(), 1.5f)
            .add(Attributes.MAX_HEALTH, 9999999)
            .add(Attributes.MOVEMENT_SPEED, 0.8f);
    }
}
