//Made with Blockbench
//Paste this code into your mod.

public static class Modelcustom_model extends ModelBase {
	private final ModelRenderer group;
	private final ModelRenderer body;
	private final ModelRenderer rightEye;
	private final ModelRenderer leftEye;
	private final ModelRenderer rightLeg1;
	private final ModelRenderer rightLeg2;
	private final ModelRenderer rightLeg3;
	private final ModelRenderer rightLeg4;
	private final ModelRenderer leftLeg1;
	private final ModelRenderer leftLeg2;
	private final ModelRenderer leftLeg3;
	private final ModelRenderer leftLeg4;
	private final ModelRenderer rightClaw;
	private final ModelRenderer leftClaw;

	public Modelcustom_model() {
		textureWidth = 32;
		textureHeight = 32;

		group = new ModelRenderer(this);
		group.setRotationPoint(0.0F, 0.0F, 0.0F);

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, 20.0F, 0.0F);
		group.addChild(body);
		body.cubeList.add(new ModelBox(body, 0, 0, -4.0F, -2.5F, -3.0F, 8, 5, 6, 0.0F, false));

		rightEye = new ModelRenderer(this);
		rightEye.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(rightEye, -0.3927F, 0.0F, 0.0F);
		body.addChild(rightEye);
		rightEye.cubeList.add(new ModelBox(rightEye, 0, 11, -3.0F, -3.5F, -2.85F, 1, 3, 1, 0.0F, false));

		leftEye = new ModelRenderer(this);
		leftEye.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(leftEye, -0.3927F, 0.0F, 0.0F);
		body.addChild(leftEye);
		leftEye.cubeList.add(new ModelBox(leftEye, 0, 11, 2.0F, -3.5F, -2.85F, 1, 3, 1, 0.0F, false));

		rightLeg1 = new ModelRenderer(this);
		rightLeg1.setRotationPoint(-3.0F, 20.0F, 2.0F);
		setRotationAngle(rightLeg1, 0.0F, 0.4363F, -0.7854F);
		group.addChild(rightLeg1);
		rightLeg1.cubeList.add(new ModelBox(rightLeg1, 0, 19, -6.0F, -0.5F, -0.5F, 6, 1, 1, 0.0F, false));

		rightLeg2 = new ModelRenderer(this);
		rightLeg2.setRotationPoint(-3.0F, 20.0F, 0.9F);
		setRotationAngle(rightLeg2, 0.0F, 0.2182F, -0.7854F);
		group.addChild(rightLeg2);
		rightLeg2.cubeList.add(new ModelBox(rightLeg2, 0, 19, -6.0F, -0.5F, -0.5F, 6, 1, 1, 0.0F, false));

		rightLeg3 = new ModelRenderer(this);
		rightLeg3.setRotationPoint(-3.0F, 20.0F, 0.0F);
		setRotationAngle(rightLeg3, 0.0F, -0.2182F, -0.7854F);
		group.addChild(rightLeg3);
		rightLeg3.cubeList.add(new ModelBox(rightLeg3, 0, 19, -6.0F, -0.5F, -0.5F, 6, 1, 1, 0.0F, false));

		rightLeg4 = new ModelRenderer(this);
		rightLeg4.setRotationPoint(-3.0F, 20.0F, -1.0F);
		setRotationAngle(rightLeg4, 0.0F, -0.4363F, -0.7854F);
		group.addChild(rightLeg4);
		rightLeg4.cubeList.add(new ModelBox(rightLeg4, 0, 19, -6.0F, -0.5F, -0.5F, 6, 1, 1, 0.0F, false));

		leftLeg1 = new ModelRenderer(this);
		leftLeg1.setRotationPoint(3.0F, 20.0F, 2.0F);
		setRotationAngle(leftLeg1, 0.0F, -0.4363F, 0.7854F);
		group.addChild(leftLeg1);
		leftLeg1.cubeList.add(new ModelBox(leftLeg1, 0, 19, 0.0F, -0.5F, -0.5F, 6, 1, 1, 0.0F, true));

		leftLeg2 = new ModelRenderer(this);
		leftLeg2.setRotationPoint(3.0F, 20.0F, 0.9F);
		setRotationAngle(leftLeg2, 0.0F, -0.2182F, 0.7854F);
		group.addChild(leftLeg2);
		leftLeg2.cubeList.add(new ModelBox(leftLeg2, 0, 19, 0.0F, -0.5F, -0.5F, 6, 1, 1, 0.0F, true));

		leftLeg3 = new ModelRenderer(this);
		leftLeg3.setRotationPoint(3.0F, 20.0F, 0.0F);
		setRotationAngle(leftLeg3, 0.0F, 0.2182F, 0.7854F);
		group.addChild(leftLeg3);
		leftLeg3.cubeList.add(new ModelBox(leftLeg3, 0, 19, 0.0F, -0.5F, -0.5F, 6, 1, 1, 0.0F, true));

		leftLeg4 = new ModelRenderer(this);
		leftLeg4.setRotationPoint(3.0F, 20.0F, -1.0F);
		setRotationAngle(leftLeg4, 0.0F, 0.4363F, 0.7854F);
		group.addChild(leftLeg4);
		leftLeg4.cubeList.add(new ModelBox(leftLeg4, 0, 19, 0.0F, -0.5F, -0.5F, 6, 1, 1, 0.0F, true));

		rightClaw = new ModelRenderer(this);
		rightClaw.setRotationPoint(-3.0F, 20.0F, -4.0F);
		setRotationAngle(rightClaw, 0.0F, 0.3927F, -0.3927F);
		group.addChild(rightClaw);
		rightClaw.cubeList.add(new ModelBox(rightClaw, 14, 11, -3.0F, -2.5F, -6.0F, 3, 5, 6, 0.0F, false));

		leftClaw = new ModelRenderer(this);
		leftClaw.setRotationPoint(3.0F, 20.0F, -4.0F);
		setRotationAngle(leftClaw, 0.0F, -0.3927F, 0.3927F);
		group.addChild(leftClaw);
		leftClaw.cubeList.add(new ModelBox(leftClaw, 14, 11, 0.0F, -2.5F, -6.0F, 3, 5, 6, 0.0F, true));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		group.render(f5);
	}
	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
		super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
	}
}