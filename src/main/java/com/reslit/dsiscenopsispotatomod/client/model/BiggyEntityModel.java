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
	private final ModelPart layer1;
	private final ModelPart layer2;
	private final ModelPart layer3;
	private final ModelPart layer5;
	private final ModelPart layer7;

	public BiggyEntityModel(ModelPart root) {
		this.layer1 = root.getChild("layer1");
		this.layer2 = root.getChild("layer2");
		this.layer3 = root.getChild("layer3");
		this.layer5 = root.getChild("layer5");
		this.layer7 = root.getChild("layer7");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition layer1 = partdefinition.addOrReplaceChild("layer1", CubeListBuilder.create().texOffs(1, 1).addBox(-6.0F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(1, 1).addBox(-6.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(1, 1).addBox(-6.0F, 0.0F, -2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(-3, -3).addBox(-5.0F, 0.0F, -3.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F))
		.texOffs(1, 1).addBox(-5.0F, 0.0F, -4.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(1, 1).addBox(-4.0F, 0.0F, -5.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(1, 1).addBox(-3.0F, 0.0F, -5.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(1, 1).addBox(-2.0F, 0.0F, -6.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(1, 1).addBox(-1.0F, 0.0F, -6.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(1, 1).addBox(0.0F, 0.0F, -6.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(1, 1).addBox(1.0F, 0.0F, -6.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(1, 1).addBox(2.0F, 0.0F, -5.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(1, 1).addBox(3.0F, 0.0F, -5.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(1, 1).addBox(-6.0F, 0.0F, 1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(1, 1).addBox(-5.0F, 0.0F, 2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(1, 1).addBox(-5.0F, 0.0F, 3.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(1, 1).addBox(-4.0F, 0.0F, 4.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(1, 1).addBox(-3.0F, 0.0F, 4.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(1, 1).addBox(-2.0F, 0.0F, 5.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(1, 1).addBox(0.0F, 0.0F, 5.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(1, 1).addBox(-1.0F, 0.0F, 5.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(1, 1).addBox(1.0F, 0.0F, 5.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(1, 1).addBox(-1.0F, 0.0F, 4.0F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(1, 1).addBox(3.0F, 0.0F, 4.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(1, 1).addBox(4.0F, 0.0F, 3.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(1, 1).addBox(4.0F, 0.0F, 2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(-2, -2).addBox(4.0F, 0.0F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(-6, -6).addBox(-4.0F, 0.0F, -4.0F, 8.0F, 1.0F, 8.0F, new CubeDeformation(0.0F))
		.texOffs(1, 1).addBox(-2.0F, 0.0F, 4.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(1, 1).addBox(-2.0F, 0.0F, -5.0F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(1, 1).addBox(5.0F, 0.0F, 1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(1, 1).addBox(5.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(1, 1).addBox(5.0F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(1, 1).addBox(5.0F, 0.0F, -2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(1, 1).addBox(4.0F, 0.0F, -3.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(1, 1).addBox(4.0F, 0.0F, -4.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 23.0F, 0.0F));

		PartDefinition layer2 = partdefinition.addOrReplaceChild("layer2", CubeListBuilder.create().texOffs(1, 1).addBox(-5.0F, -2.0F, -5.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(1, 1).addBox(-5.0F, -2.0F, 4.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(1, 1).addBox(4.0F, -2.0F, 4.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(1, 1).addBox(-7.0F, -2.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(1, 1).addBox(-7.0F, -2.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(1, 1).addBox(-7.0F, -2.0F, -2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(1, 1).addBox(-6.0F, -2.0F, -3.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(1, 1).addBox(-6.0F, -2.0F, -4.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(1, 1).addBox(-4.0F, -2.0F, -6.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(1, 1).addBox(-3.0F, -2.0F, -6.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(1, 1).addBox(-2.0F, -2.0F, -7.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(1, 1).addBox(-1.0F, -2.0F, -7.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(1, 1).addBox(0.0F, -2.0F, -7.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(1, 1).addBox(1.0F, -2.0F, -7.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(1, 1).addBox(2.0F, -2.0F, -6.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(1, 1).addBox(3.0F, -2.0F, -6.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(1, 1).addBox(-7.0F, -2.0F, 1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(1, 1).addBox(-6.0F, -2.0F, 2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(1, 1).addBox(-6.0F, -2.0F, 3.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(1, 1).addBox(-4.0F, -2.0F, 5.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(1, 1).addBox(-3.0F, -2.0F, 5.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(1, 1).addBox(-2.0F, -2.0F, 6.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(1, 1).addBox(0.0F, -2.0F, 6.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(1, 1).addBox(-1.0F, -2.0F, 6.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(1, 1).addBox(1.0F, -2.0F, 6.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(1, 1).addBox(2.0F, -2.0F, 5.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(1, 1).addBox(3.0F, -2.0F, 5.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(1, 1).addBox(5.0F, -2.0F, 3.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(1, 1).addBox(5.0F, -2.0F, 2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(1, 1).addBox(6.0F, -2.0F, 1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(1, 1).addBox(6.0F, -2.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(1, 1).addBox(6.0F, -2.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(1, 1).addBox(6.0F, -2.0F, -2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(1, 1).addBox(5.0F, -2.0F, -3.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(1, 1).addBox(5.0F, -2.0F, -4.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(1, 1).addBox(4.0F, -2.0F, -5.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition layer3 = partdefinition.addOrReplaceChild("layer3", CubeListBuilder.create().texOffs(1, 1).addBox(-6.0F, -4.0F, -6.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(1, 1).addBox(-5.0F, -4.0F, -6.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(1, 1).addBox(-6.0F, -4.0F, -5.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(1, 1).addBox(-6.0F, -4.0F, 5.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(1, 1).addBox(-5.0F, -4.0F, 5.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(1, 1).addBox(-6.0F, -4.0F, 4.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(1, 1).addBox(5.0F, -4.0F, 5.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(1, 1).addBox(4.0F, -4.0F, 5.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(1, 1).addBox(5.0F, -4.0F, 4.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(1, 1).addBox(-8.0F, -4.0F, -1.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(1, 1).addBox(-8.0F, -4.0F, 0.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(1, 1).addBox(-8.0F, -4.0F, -2.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(1, 1).addBox(-7.0F, -6.0F, -3.0F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(1, 1).addBox(-7.0F, -4.0F, -4.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(1, 1).addBox(-4.0F, -4.0F, -7.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(1, 1).addBox(-3.0F, -4.0F, -7.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(1, 1).addBox(-2.0F, -4.0F, -8.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(1, 1).addBox(-1.0F, -4.0F, -8.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(1, 1).addBox(0.0F, -4.0F, -8.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(1, 1).addBox(1.0F, -4.0F, -8.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(1, 1).addBox(2.0F, -4.0F, -7.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(1, 1).addBox(3.0F, -4.0F, -7.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(1, 1).addBox(-8.0F, -4.0F, 1.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(1, 1).addBox(-7.0F, -6.0F, 2.0F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(1, 1).addBox(-7.0F, -4.0F, 3.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(1, 1).addBox(-4.0F, -4.0F, 6.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(1, 1).addBox(-3.0F, -4.0F, 6.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(1, 1).addBox(-2.0F, -4.0F, 7.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(1, 1).addBox(0.0F, -4.0F, 7.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(1, 1).addBox(-1.0F, -4.0F, 7.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(1, 1).addBox(1.0F, -4.0F, 7.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(1, 1).addBox(2.0F, -4.0F, 6.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(1, 1).addBox(3.0F, -4.0F, 6.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(1, 1).addBox(6.0F, -4.0F, 3.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(1, 1).addBox(6.0F, -6.0F, 2.0F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(1, 1).addBox(7.0F, -4.0F, 1.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(1, 1).addBox(7.0F, -4.0F, 0.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(1, 1).addBox(7.0F, -4.0F, -1.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(1, 1).addBox(7.0F, -4.0F, -2.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(1, 1).addBox(6.0F, -6.0F, -3.0F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(1, 1).addBox(6.0F, -4.0F, -4.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(1, 1).addBox(5.0F, -4.0F, -6.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(1, 1).addBox(5.0F, -4.0F, -5.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(1, 1).addBox(4.0F, -4.0F, -6.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 23.0F, 0.0F));

		PartDefinition layer5 = partdefinition.addOrReplaceChild("layer5", CubeListBuilder.create().texOffs(1, 1).addBox(-5.0F, -3.0F, -5.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(1, 1).addBox(-5.0F, -3.0F, 4.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(1, 1).addBox(4.0F, -3.0F, 4.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(1, 1).addBox(-6.0F, -5.0F, -3.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(1, 1).addBox(-6.0F, -3.0F, -4.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(1, 1).addBox(-4.0F, -3.0F, -6.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(1, 1).addBox(-3.0F, -3.0F, -6.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(1, 1).addBox(-2.0F, -3.0F, -7.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(1, 1).addBox(-1.0F, -3.0F, -7.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(1, 1).addBox(0.0F, -3.0F, -7.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(1, 1).addBox(1.0F, -3.0F, -7.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(1, 1).addBox(2.0F, -3.0F, -6.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(1, 1).addBox(3.0F, -3.0F, -6.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(-2, -2).addBox(-8.0F, -3.0F, -2.0F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(1, 1).addBox(-6.0F, -5.0F, 2.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(1, 1).addBox(-6.0F, -3.0F, 3.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(1, 1).addBox(-4.0F, -3.0F, 5.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(1, 1).addBox(-3.0F, -3.0F, 5.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(1, 1).addBox(-2.0F, -3.0F, 6.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(1, 1).addBox(0.0F, -3.0F, 6.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(1, 1).addBox(-1.0F, -3.0F, 6.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(1, 1).addBox(1.0F, -3.0F, 6.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(1, 1).addBox(2.0F, -3.0F, 5.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(1, 1).addBox(3.0F, -3.0F, 5.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(1, 1).addBox(5.0F, -3.0F, 3.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(1, 1).addBox(5.0F, -5.0F, 2.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(-2, -2).addBox(6.0F, -3.0F, -2.0F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(1, 1).addBox(5.0F, -5.0F, -3.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(1, 1).addBox(5.0F, -3.0F, -4.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(1, 1).addBox(4.0F, -3.0F, -5.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 20.0F, 0.0F));

		PartDefinition layer7 = partdefinition.addOrReplaceChild("layer7", CubeListBuilder.create().texOffs(-2, -2).addBox(-7.0F, -2.0F, -2.0F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(-3, -3).addBox(-5.0F, -2.0F, -3.0F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.0F))
		.texOffs(1, 1).addBox(-5.0F, -2.0F, -4.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(1, 1).addBox(-4.0F, -2.0F, -5.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(1, 1).addBox(-3.0F, -2.0F, -5.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(1, 1).addBox(-2.0F, -2.0F, -6.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(1, 1).addBox(-1.0F, -2.0F, -6.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(1, 1).addBox(0.0F, -2.0F, -6.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(1, 1).addBox(1.0F, -2.0F, -6.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(1, 1).addBox(2.0F, -2.0F, -5.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(1, 1).addBox(3.0F, -2.0F, -5.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(1, 1).addBox(-5.0F, -2.0F, 2.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(1, 1).addBox(-5.0F, -2.0F, 3.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(1, 1).addBox(-4.0F, -2.0F, 4.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(1, 1).addBox(-2.0F, -2.0F, 5.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(1, 1).addBox(0.0F, -2.0F, 5.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(1, 1).addBox(-1.0F, -2.0F, 5.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(1, 1).addBox(1.0F, -2.0F, 5.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(1, 1).addBox(-3.0F, -3.0F, 4.0F, 6.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(1, 1).addBox(3.0F, -2.0F, 4.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(1, 1).addBox(4.0F, -2.0F, 3.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(1, 1).addBox(4.0F, -2.0F, 2.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(-2, -2).addBox(4.0F, -2.0F, -2.0F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(-6, -6).addBox(-4.0F, -4.0F, -4.0F, 8.0F, 4.0F, 8.0F, new CubeDeformation(0.0F))
		.texOffs(1, 1).addBox(-2.0F, -3.0F, -5.0F, 4.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(-2, -2).addBox(5.0F, -2.0F, -2.0F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(1, 1).addBox(4.0F, -2.0F, -3.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(1, 1).addBox(4.0F, -2.0F, -4.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(-2, -2).addBox(5.0F, -3.0F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(-2, -2).addBox(-6.0F, -3.0F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(-4, -4).addBox(4.0F, -4.0F, -3.0F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.0F))
		.texOffs(-4, -4).addBox(-5.0F, -4.0F, -3.0F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.0F))
		.texOffs(-2, -2).addBox(-3.0F, -6.0F, -2.0F, 6.0F, 2.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(-2.0F, -8.0F, -1.0F, 4.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(3.0F, -6.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(-5.0F, -6.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(-6.0F, -7.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(4.0F, -7.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 17.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 32, 32);
	}

	@Override
	public void setupAnim(BiggyEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		layer1.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		layer2.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		layer3.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		layer5.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		layer7.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}