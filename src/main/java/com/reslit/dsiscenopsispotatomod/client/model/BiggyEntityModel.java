package com.reslit.dsiscenopsispotatomod.client.model;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import com.reslit.dsiscenopsispotatomod.DsiScenopsisPotatoMod;
import com.reslit.dsiscenopsispotatomod.entity.BiggyEntity;

import net.minecraft.client.model.EntityModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.resources.ResourceLocation;

public class BiggyEntityModel extends EntityModel<BiggyEntity> {
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation(DsiScenopsisPotatoMod.MODID, "biggy_entity"), "main");
	private final ModelPart biggy;

	public BiggyEntityModel(ModelPart root) {
		this.biggy = root.getChild("biggy");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition biggy = partdefinition.addOrReplaceChild("biggy", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition head = biggy.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offset(0.0F, -1.0F, 0.0F));

		PartDefinition layer6 = head.addOrReplaceChild("layer6", CubeListBuilder.create().texOffs(32, 26).addBox(-2.0F, -9.0F, -5.0F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(0, 31).addBox(-2.0F, -9.0F, 4.0F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(38, 31).addBox(1.0F, -9.0F, -4.0F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(24, 38).addBox(-4.0F, -9.0F, -4.0F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(38, 6).addBox(1.0F, -9.0F, 3.0F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(16, 38).addBox(-4.0F, -9.0F, 3.0F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -1.0F, 0.0F));

		PartDefinition cube_r1 = layer6.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(36, 44).addBox(1.0F, -2.0F, -4.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(44, 38).addBox(-3.0F, -2.0F, -4.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(42, 44).addBox(-3.0F, -2.0F, 3.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(45, 8).addBox(1.0F, -2.0F, 3.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(18, 31).addBox(-2.0F, -2.0F, 4.0F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -7.0F, 0.0F, 0.0F, 1.5708F, 0.0F));

		PartDefinition cube_r2 = layer6.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(28, 31).addBox(-2.0F, -2.0F, 4.0F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -7.0F, 0.0F, 0.0F, -1.5708F, 0.0F));

		PartDefinition layer7 = head.addOrReplaceChild("layer7", CubeListBuilder.create().texOffs(9, 29).addBox(-2.0F, -12.0F, -4.0F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(27, 15).addBox(-2.0F, -12.0F, 3.0F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(0, 38).addBox(0.0F, -12.0F, -3.0F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(37, 13).addBox(-3.0F, -12.0F, -3.0F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(37, 10).addBox(-3.0F, -12.0F, 2.0F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(36, 17).addBox(0.0F, -12.0F, 2.0F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition cube_r3 = layer7.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(44, 0).addBox(0.0F, -2.0F, -3.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(-2.0F, -2.0F, -2.0F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(5, 44).addBox(-2.0F, -2.0F, -3.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(44, 15).addBox(-2.0F, -2.0F, 2.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(30, 44).addBox(0.0F, -2.0F, 2.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(27, 19).addBox(-2.0F, -2.0F, 3.0F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -10.0F, 0.0F, 0.0F, 1.5708F, 0.0F));

		PartDefinition cube_r4 = layer7.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(28, 6).addBox(-2.0F, -2.0F, 3.0F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -10.0F, 0.0F, 0.0F, -1.5708F, 0.0F));

		PartDefinition layer8 = head.addOrReplaceChild("layer8", CubeListBuilder.create().texOffs(0, 19).addBox(-2.0F, -16.0F, -1.0F, 4.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(12, 24).addBox(-6.0F, -17.0F, -1.0F, 3.0F, 3.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(23, 22).addBox(3.0F, -17.0F, -1.0F, 3.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 2.0F, 0.0F));

		PartDefinition body = biggy.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition layer3 = body.addOrReplaceChild("layer3", CubeListBuilder.create().texOffs(14, 17).addBox(-3.0F, -3.0F, -8.0F, 6.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(14, 6).addBox(-3.0F, -3.0F, 7.0F, 6.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(8, 52).addBox(5.0F, -3.0F, -6.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(50, 39).addBox(5.0F, -3.0F, -5.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(4, 51).addBox(4.0F, -3.0F, -6.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(47, 5).addBox(3.0F, -3.0F, -7.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(51, 42).addBox(-6.0F, -3.0F, -6.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(51, 8).addBox(-5.0F, -3.0F, -6.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(51, 11).addBox(-6.0F, -3.0F, -5.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(46, 30).addBox(-5.0F, -3.0F, -7.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(41, 51).addBox(-6.0F, -3.0F, 5.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(51, 16).addBox(-5.0F, -3.0F, 5.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(25, 51).addBox(-6.0F, -3.0F, 4.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(46, 18).addBox(-5.0F, -3.0F, 6.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(11, 45).addBox(3.0F, -3.0F, 6.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -1.0F, 0.0F));

		PartDefinition cube_r5 = layer3.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(45, 11).addBox(3.0F, -2.0F, -7.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(17, 45).addBox(-5.0F, -2.0F, -7.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(23, 45).addBox(-5.0F, -2.0F, 6.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(33, 51).addBox(-5.0F, -2.0F, 5.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(29, 51).addBox(-6.0F, -2.0F, 4.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(37, 51).addBox(-6.0F, -2.0F, 5.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(0, 46).addBox(3.0F, -2.0F, 6.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(14, 9).addBox(-3.0F, -2.0F, 7.0F, 6.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0F, 0.0F, 0.0F, 1.5708F, 0.0F));

		PartDefinition cube_r6 = layer3.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(0, 16).addBox(-3.0F, -2.0F, 7.0F, 6.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0F, 0.0F, 0.0F, -1.5708F, 0.0F));

		PartDefinition layer4 = body.addOrReplaceChild("layer4", CubeListBuilder.create().texOffs(13, 13).addBox(-3.0F, -3.0F, -7.0F, 6.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(0, 6).addBox(-3.0F, -3.0F, 6.0F, 6.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(48, 49).addBox(4.0F, -3.0F, -5.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(0, 49).addBox(4.0F, -3.0F, -4.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(48, 45).addBox(3.0F, -3.0F, -5.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(25, 41).addBox(2.0F, -3.0F, -6.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(22, 48).addBox(-5.0F, -3.0F, -5.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(48, 21).addBox(-4.0F, -3.0F, -5.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(18, 48).addBox(-5.0F, -3.0F, -4.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(41, 20).addBox(-4.0F, -3.0F, -6.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(14, 48).addBox(-5.0F, -3.0F, 4.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(10, 48).addBox(-5.0F, -3.0F, 3.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(44, 47).addBox(-4.0F, -3.0F, 4.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(19, 41).addBox(-4.0F, -3.0F, 5.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(32, 38).addBox(2.0F, -3.0F, 5.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -3.0F, 0.0F));

		PartDefinition cube_r7 = layer4.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(38, 38).addBox(2.0F, -2.0F, -6.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(7, 40).addBox(-4.0F, -2.0F, -6.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(0, 41).addBox(-4.0F, -2.0F, 5.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(36, 47).addBox(-5.0F, -2.0F, 3.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(40, 47).addBox(-4.0F, -2.0F, 4.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(47, 41).addBox(-5.0F, -2.0F, 4.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(13, 41).addBox(2.0F, -2.0F, 5.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(0, 10).addBox(-3.0F, -2.0F, 6.0F, 6.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0F, 0.0F, 0.0F, 1.5708F, 0.0F));

		PartDefinition cube_r8 = layer4.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(12, 0).addBox(-3.0F, -2.0F, 6.0F, 6.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0F, 0.0F, 0.0F, -1.5708F, 0.0F));

		PartDefinition layer5 = body.addOrReplaceChild("layer5", CubeListBuilder.create().texOffs(22, 27).addBox(-2.0F, -3.0F, -6.0F, 4.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(0, 26).addBox(-2.0F, -3.0F, 5.0F, 4.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(8, 36).addBox(1.0F, -3.0F, -5.0F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(36, 0).addBox(-4.0F, -3.0F, -5.0F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(34, 34).addBox(-4.0F, -3.0F, 4.0F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(10, 32).addBox(1.0F, -3.0F, 4.0F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -6.0F, 0.0F));

		PartDefinition cube_r9 = layer5.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(33, 22).addBox(1.0F, -3.0F, -5.0F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(0, 34).addBox(-4.0F, -3.0F, -5.0F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(-4.0F, -3.0F, -4.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(6, 47).addBox(3.0F, -3.0F, -4.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(28, 47).addBox(3.0F, -3.0F, 3.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(32, 47).addBox(-4.0F, -3.0F, 3.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(18, 34).addBox(-4.0F, -3.0F, 4.0F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(26, 34).addBox(1.0F, -3.0F, 4.0F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(26, 0).addBox(-2.0F, -3.0F, 5.0F, 4.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 1.5708F, 0.0F));

		PartDefinition cube_r10 = layer5.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(27, 11).addBox(-2.0F, -3.0F, 5.0F, 4.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -1.5708F, 0.0F));

		PartDefinition bottom = biggy.addOrReplaceChild("bottom", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition layer1 = bottom.addOrReplaceChild("layer1", CubeListBuilder.create().texOffs(32, 29).addBox(-2.0F, -1.0F, -6.0F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(28, 9).addBox(-2.0F, -1.0F, 5.0F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(39, 42).addBox(0.0F, -1.0F, -5.0F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(42, 36).addBox(-4.0F, -1.0F, -5.0F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(42, 34).addBox(-4.0F, -1.0F, 4.0F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(42, 26).addBox(0.0F, -1.0F, 4.0F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(-6, -6).addBox(-3.0F, -1.0F, -4.0F, 6.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition cube_r11 = layer1.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(40, 4).addBox(0.0F, -1.0F, -5.0F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(41, 24).addBox(-4.0F, -1.0F, -5.0F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(37, 20).addBox(-4.0F, -1.0F, -4.0F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(51, 20).addBox(0.0F, -1.0F, -4.0F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(51, 29).addBox(0.0F, -1.0F, 3.0F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(51, 48).addBox(-4.0F, -1.0F, 3.0F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(41, 28).addBox(-4.0F, -1.0F, 4.0F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(31, 42).addBox(0.0F, -1.0F, 4.0F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(0, 14).addBox(-2.0F, -1.0F, 5.0F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 1.5708F, 0.0F));

		PartDefinition cube_r12 = layer1.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(30, 4).addBox(-2.0F, -1.0F, 5.0F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -1.5708F, 0.0F));

		PartDefinition layer2 = bottom.addOrReplaceChild("layer2", CubeListBuilder.create().texOffs(0, 24).addBox(-3.0F, -1.0F, -7.0F, 6.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(16, 4).addBox(-3.0F, -1.0F, 6.0F, 6.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(0, 53).addBox(4.0F, -1.0F, -5.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(52, 2).addBox(4.0F, -1.0F, -4.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(52, 4).addBox(3.0F, -1.0F, -5.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(47, 3).addBox(2.0F, -1.0F, -6.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(51, 52).addBox(-5.0F, -1.0F, -5.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(12, 52).addBox(-4.0F, -1.0F, -5.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(16, 52).addBox(-5.0F, -1.0F, -4.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(49, 27).addBox(-4.0F, -1.0F, -6.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(52, 50).addBox(-5.0F, -1.0F, 4.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(20, 52).addBox(-5.0F, -1.0F, 3.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(52, 22).addBox(-4.0F, -1.0F, 4.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(49, 25).addBox(-4.0F, -1.0F, 5.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(49, 33).addBox(2.0F, -1.0F, 5.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -1.0F, 0.0F));

		PartDefinition cube_r13 = layer2.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(49, 35).addBox(2.0F, -1.0F, -6.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(49, 37).addBox(-4.0F, -1.0F, -6.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(49, 14).addBox(-4.0F, -1.0F, 5.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(52, 31).addBox(-5.0F, -1.0F, 3.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(45, 52).addBox(-4.0F, -1.0F, 4.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(52, 45).addBox(-5.0F, -1.0F, 4.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(50, 0).addBox(2.0F, -1.0F, 5.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(12, 20).addBox(-3.0F, -1.0F, 6.0F, 6.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 1.5708F, 0.0F));

		PartDefinition cube_r14 = layer2.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(11, 22).addBox(-3.0F, -1.0F, 6.0F, 6.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -1.5708F, 0.0F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void setupAnim(BiggyEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		biggy.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}