package com.tencent.ttpic.ar.sensor.representation;

import com.tencent.matrix.trace.core.AppMethodBeat;

public class Matrix
{
  private static final float[] TEMP_MATRIX_ARRAY = new float[32];

  public static void frustumM(float[] paramArrayOfFloat, int paramInt, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6)
  {
    AppMethodBeat.i(81684);
    if (paramFloat1 == paramFloat2)
    {
      paramArrayOfFloat = new IllegalArgumentException("left == right");
      AppMethodBeat.o(81684);
      throw paramArrayOfFloat;
    }
    if (paramFloat4 == paramFloat3)
    {
      paramArrayOfFloat = new IllegalArgumentException("top == bottom");
      AppMethodBeat.o(81684);
      throw paramArrayOfFloat;
    }
    if (paramFloat5 == paramFloat6)
    {
      paramArrayOfFloat = new IllegalArgumentException("near == far");
      AppMethodBeat.o(81684);
      throw paramArrayOfFloat;
    }
    if (paramFloat5 <= 0.0F)
    {
      paramArrayOfFloat = new IllegalArgumentException("near <= 0.0f");
      AppMethodBeat.o(81684);
      throw paramArrayOfFloat;
    }
    if (paramFloat6 <= 0.0F)
    {
      paramArrayOfFloat = new IllegalArgumentException("far <= 0.0f");
      AppMethodBeat.o(81684);
      throw paramArrayOfFloat;
    }
    float f1 = 1.0F / (paramFloat2 - paramFloat1);
    float f2 = 1.0F / (paramFloat4 - paramFloat3);
    float f3 = 1.0F / (paramFloat5 - paramFloat6);
    paramArrayOfFloat[(paramInt + 0)] = (2.0F * (paramFloat5 * f1));
    paramArrayOfFloat[(paramInt + 5)] = (2.0F * (paramFloat5 * f2));
    paramArrayOfFloat[(paramInt + 8)] = (f1 * (paramFloat2 + paramFloat1) * 2.0F);
    paramArrayOfFloat[(paramInt + 9)] = (f2 * (paramFloat4 + paramFloat3));
    paramArrayOfFloat[(paramInt + 10)] = ((paramFloat6 + paramFloat5) * f3);
    paramArrayOfFloat[(paramInt + 14)] = (f3 * (paramFloat6 * paramFloat5) * 2.0F);
    paramArrayOfFloat[(paramInt + 11)] = -1.0F;
    paramArrayOfFloat[(paramInt + 1)] = 0.0F;
    paramArrayOfFloat[(paramInt + 2)] = 0.0F;
    paramArrayOfFloat[(paramInt + 3)] = 0.0F;
    paramArrayOfFloat[(paramInt + 4)] = 0.0F;
    paramArrayOfFloat[(paramInt + 6)] = 0.0F;
    paramArrayOfFloat[(paramInt + 7)] = 0.0F;
    paramArrayOfFloat[(paramInt + 12)] = 0.0F;
    paramArrayOfFloat[(paramInt + 13)] = 0.0F;
    paramArrayOfFloat[(paramInt + 15)] = 0.0F;
    AppMethodBeat.o(81684);
  }

  public static boolean invertM(float[] paramArrayOfFloat1, int paramInt1, float[] paramArrayOfFloat2, int paramInt2)
  {
    float f1 = paramArrayOfFloat2[(paramInt2 + 0)];
    float f2 = paramArrayOfFloat2[(paramInt2 + 1)];
    float f3 = paramArrayOfFloat2[(paramInt2 + 2)];
    float f4 = paramArrayOfFloat2[(paramInt2 + 3)];
    float f5 = paramArrayOfFloat2[(paramInt2 + 4)];
    float f6 = paramArrayOfFloat2[(paramInt2 + 5)];
    float f7 = paramArrayOfFloat2[(paramInt2 + 6)];
    float f8 = paramArrayOfFloat2[(paramInt2 + 7)];
    float f9 = paramArrayOfFloat2[(paramInt2 + 8)];
    float f10 = paramArrayOfFloat2[(paramInt2 + 9)];
    float f11 = paramArrayOfFloat2[(paramInt2 + 10)];
    float f12 = paramArrayOfFloat2[(paramInt2 + 11)];
    float f13 = paramArrayOfFloat2[(paramInt2 + 12)];
    float f14 = paramArrayOfFloat2[(paramInt2 + 13)];
    float f15 = paramArrayOfFloat2[(paramInt2 + 14)];
    float f16 = paramArrayOfFloat2[(paramInt2 + 15)];
    float f17 = f11 * f16;
    float f18 = f15 * f12;
    float f19 = f7 * f16;
    float f20 = f15 * f8;
    float f21 = f7 * f12;
    float f22 = f11 * f8;
    float f23 = f3 * f16;
    float f24 = f15 * f4;
    float f25 = f3 * f12;
    float f26 = f11 * f4;
    float f27 = f3 * f8;
    float f28 = f7 * f4;
    float f29 = f17 * f6 + f20 * f10 + f21 * f14 - (f18 * f6 + f19 * f10 + f22 * f14);
    float f30 = f18 * f2 + f23 * f10 + f26 * f14 - (f17 * f2 + f24 * f10 + f25 * f14);
    float f31 = f19 * f2 + f24 * f6 + f27 * f14 - (f20 * f2 + f23 * f6 + f28 * f14);
    float f32 = f22 * f2 + f25 * f6 + f28 * f10 - (f21 * f2 + f26 * f6 + f27 * f10);
    float f33 = f9 * f14;
    float f34 = f13 * f10;
    float f35 = f5 * f14;
    float f36 = f13 * f6;
    float f37 = f5 * f10;
    float f38 = f9 * f6;
    float f39 = f14 * f1;
    f14 = f13 * f2;
    float f40 = f10 * f1;
    f10 = f9 * f2;
    f6 *= f1;
    f2 *= f5;
    float f41 = f1 * f29 + f5 * f30 + f9 * f31 + f13 * f32;
    if (f41 == 0.0F);
    for (boolean bool = false; ; bool = true)
    {
      return bool;
      f41 = 1.0F / f41;
      paramArrayOfFloat1[paramInt1] = (f29 * f41);
      paramArrayOfFloat1[(paramInt1 + 1)] = (f30 * f41);
      paramArrayOfFloat1[(paramInt1 + 2)] = (f31 * f41);
      paramArrayOfFloat1[(paramInt1 + 3)] = (f32 * f41);
      paramArrayOfFloat1[(paramInt1 + 4)] = ((f18 * f5 + f19 * f9 + f22 * f13 - (f17 * f5 + f20 * f9 + f21 * f13)) * f41);
      paramArrayOfFloat1[(paramInt1 + 5)] = ((f17 * f1 + f24 * f9 + f25 * f13 - (f18 * f1 + f23 * f9 + f26 * f13)) * f41);
      paramArrayOfFloat1[(paramInt1 + 6)] = ((f20 * f1 + f23 * f5 + f28 * f13 - (f19 * f1 + f24 * f5 + f27 * f13)) * f41);
      paramArrayOfFloat1[(paramInt1 + 7)] = ((f21 * f1 + f26 * f5 + f27 * f9 - (f22 * f1 + f25 * f5 + f28 * f9)) * f41);
      paramArrayOfFloat1[(paramInt1 + 8)] = ((f33 * f8 + f36 * f12 + f37 * f16 - (f34 * f8 + f35 * f12 + f38 * f16)) * f41);
      paramArrayOfFloat1[(paramInt1 + 9)] = ((f34 * f4 + f39 * f12 + f10 * f16 - (f33 * f4 + f14 * f12 + f40 * f16)) * f41);
      paramArrayOfFloat1[(paramInt1 + 10)] = ((f35 * f4 + f14 * f8 + f6 * f16 - (f16 * f2 + (f36 * f4 + f39 * f8))) * f41);
      paramArrayOfFloat1[(paramInt1 + 11)] = ((f38 * f4 + f40 * f8 + f2 * f12 - (f4 * f37 + f8 * f10 + f6 * f12)) * f41);
      paramArrayOfFloat1[(paramInt1 + 12)] = ((f35 * f11 + f38 * f15 + f34 * f7 - (f37 * f15 + f33 * f7 + f36 * f11)) * f41);
      paramArrayOfFloat1[(paramInt1 + 13)] = ((f40 * f15 + f33 * f3 + f14 * f11 - (f39 * f11 + f10 * f15 + f34 * f3)) * f41);
      paramArrayOfFloat1[(paramInt1 + 14)] = ((f39 * f7 + f2 * f15 + f36 * f3 - (f15 * f6 + f35 * f3 + f14 * f7)) * f41);
      paramArrayOfFloat1[(paramInt1 + 15)] = (f41 * (f6 * f11 + f37 * f3 + f10 * f7 - (f2 * f11 + f7 * f40 + f3 * f38)));
    }
  }

  public static float length(float paramFloat1, float paramFloat2, float paramFloat3)
  {
    AppMethodBeat.i(81686);
    paramFloat1 = (float)Math.sqrt(paramFloat1 * paramFloat1 + paramFloat2 * paramFloat2 + paramFloat3 * paramFloat3);
    AppMethodBeat.o(81686);
    return paramFloat1;
  }

  public static void multiplyMM(float[] paramArrayOfFloat1, int paramInt1, float[] paramArrayOfFloat2, int paramInt2, float[] paramArrayOfFloat3, int paramInt3)
  {
    paramArrayOfFloat1[(paramInt1 + 0)] = (paramArrayOfFloat2[(paramInt2 + 0)] * paramArrayOfFloat3[(paramInt3 + 0)] + paramArrayOfFloat2[(paramInt2 + 4)] * paramArrayOfFloat3[(paramInt3 + 1)] + paramArrayOfFloat2[(paramInt2 + 8)] * paramArrayOfFloat3[(paramInt3 + 2)] + paramArrayOfFloat2[(paramInt2 + 12)] * paramArrayOfFloat3[(paramInt3 + 3)]);
    paramArrayOfFloat1[(paramInt1 + 1)] = (paramArrayOfFloat2[(paramInt2 + 1)] * paramArrayOfFloat3[(paramInt3 + 0)] + paramArrayOfFloat2[(paramInt2 + 5)] * paramArrayOfFloat3[(paramInt3 + 1)] + paramArrayOfFloat2[(paramInt2 + 9)] * paramArrayOfFloat3[(paramInt3 + 2)] + paramArrayOfFloat2[(paramInt2 + 13)] * paramArrayOfFloat3[(paramInt3 + 3)]);
    paramArrayOfFloat1[(paramInt1 + 2)] = (paramArrayOfFloat2[(paramInt2 + 2)] * paramArrayOfFloat3[(paramInt3 + 0)] + paramArrayOfFloat2[(paramInt2 + 6)] * paramArrayOfFloat3[(paramInt3 + 1)] + paramArrayOfFloat2[(paramInt2 + 10)] * paramArrayOfFloat3[(paramInt3 + 2)] + paramArrayOfFloat2[(paramInt2 + 14)] * paramArrayOfFloat3[(paramInt3 + 3)]);
    paramArrayOfFloat1[(paramInt1 + 3)] = (paramArrayOfFloat2[(paramInt2 + 3)] * paramArrayOfFloat3[(paramInt3 + 0)] + paramArrayOfFloat2[(paramInt2 + 7)] * paramArrayOfFloat3[(paramInt3 + 1)] + paramArrayOfFloat2[(paramInt2 + 11)] * paramArrayOfFloat3[(paramInt3 + 2)] + paramArrayOfFloat2[(paramInt2 + 15)] * paramArrayOfFloat3[(paramInt3 + 3)]);
    paramArrayOfFloat1[(paramInt1 + 4)] = (paramArrayOfFloat2[(paramInt2 + 0)] * paramArrayOfFloat3[(paramInt3 + 4)] + paramArrayOfFloat2[(paramInt2 + 4)] * paramArrayOfFloat3[(paramInt3 + 5)] + paramArrayOfFloat2[(paramInt2 + 8)] * paramArrayOfFloat3[(paramInt3 + 6)] + paramArrayOfFloat2[(paramInt2 + 12)] * paramArrayOfFloat3[(paramInt3 + 7)]);
    paramArrayOfFloat1[(paramInt1 + 5)] = (paramArrayOfFloat2[(paramInt2 + 1)] * paramArrayOfFloat3[(paramInt3 + 4)] + paramArrayOfFloat2[(paramInt2 + 5)] * paramArrayOfFloat3[(paramInt3 + 5)] + paramArrayOfFloat2[(paramInt2 + 9)] * paramArrayOfFloat3[(paramInt3 + 6)] + paramArrayOfFloat2[(paramInt2 + 13)] * paramArrayOfFloat3[(paramInt3 + 7)]);
    paramArrayOfFloat1[(paramInt1 + 6)] = (paramArrayOfFloat2[(paramInt2 + 2)] * paramArrayOfFloat3[(paramInt3 + 4)] + paramArrayOfFloat2[(paramInt2 + 6)] * paramArrayOfFloat3[(paramInt3 + 5)] + paramArrayOfFloat2[(paramInt2 + 10)] * paramArrayOfFloat3[(paramInt3 + 6)] + paramArrayOfFloat2[(paramInt2 + 14)] * paramArrayOfFloat3[(paramInt3 + 7)]);
    paramArrayOfFloat1[(paramInt1 + 7)] = (paramArrayOfFloat2[(paramInt2 + 3)] * paramArrayOfFloat3[(paramInt3 + 4)] + paramArrayOfFloat2[(paramInt2 + 7)] * paramArrayOfFloat3[(paramInt3 + 5)] + paramArrayOfFloat2[(paramInt2 + 11)] * paramArrayOfFloat3[(paramInt3 + 6)] + paramArrayOfFloat2[(paramInt2 + 15)] * paramArrayOfFloat3[(paramInt3 + 7)]);
    paramArrayOfFloat1[(paramInt1 + 8)] = (paramArrayOfFloat2[(paramInt2 + 0)] * paramArrayOfFloat3[(paramInt3 + 8)] + paramArrayOfFloat2[(paramInt2 + 4)] * paramArrayOfFloat3[(paramInt3 + 9)] + paramArrayOfFloat2[(paramInt2 + 8)] * paramArrayOfFloat3[(paramInt3 + 10)] + paramArrayOfFloat2[(paramInt2 + 12)] * paramArrayOfFloat3[(paramInt3 + 11)]);
    paramArrayOfFloat1[(paramInt1 + 9)] = (paramArrayOfFloat2[(paramInt2 + 1)] * paramArrayOfFloat3[(paramInt3 + 8)] + paramArrayOfFloat2[(paramInt2 + 5)] * paramArrayOfFloat3[(paramInt3 + 9)] + paramArrayOfFloat2[(paramInt2 + 9)] * paramArrayOfFloat3[(paramInt3 + 10)] + paramArrayOfFloat2[(paramInt2 + 13)] * paramArrayOfFloat3[(paramInt3 + 11)]);
    paramArrayOfFloat1[(paramInt1 + 10)] = (paramArrayOfFloat2[(paramInt2 + 2)] * paramArrayOfFloat3[(paramInt3 + 8)] + paramArrayOfFloat2[(paramInt2 + 6)] * paramArrayOfFloat3[(paramInt3 + 9)] + paramArrayOfFloat2[(paramInt2 + 10)] * paramArrayOfFloat3[(paramInt3 + 10)] + paramArrayOfFloat2[(paramInt2 + 14)] * paramArrayOfFloat3[(paramInt3 + 11)]);
    paramArrayOfFloat1[(paramInt1 + 11)] = (paramArrayOfFloat2[(paramInt2 + 3)] * paramArrayOfFloat3[(paramInt3 + 8)] + paramArrayOfFloat2[(paramInt2 + 7)] * paramArrayOfFloat3[(paramInt3 + 9)] + paramArrayOfFloat2[(paramInt2 + 11)] * paramArrayOfFloat3[(paramInt3 + 10)] + paramArrayOfFloat2[(paramInt2 + 15)] * paramArrayOfFloat3[(paramInt3 + 11)]);
    paramArrayOfFloat1[(paramInt1 + 12)] = (paramArrayOfFloat2[(paramInt2 + 0)] * paramArrayOfFloat3[(paramInt3 + 12)] + paramArrayOfFloat2[(paramInt2 + 4)] * paramArrayOfFloat3[(paramInt3 + 13)] + paramArrayOfFloat2[(paramInt2 + 8)] * paramArrayOfFloat3[(paramInt3 + 14)] + paramArrayOfFloat2[(paramInt2 + 12)] * paramArrayOfFloat3[(paramInt3 + 15)]);
    paramArrayOfFloat1[(paramInt1 + 13)] = (paramArrayOfFloat2[(paramInt2 + 1)] * paramArrayOfFloat3[(paramInt3 + 12)] + paramArrayOfFloat2[(paramInt2 + 5)] * paramArrayOfFloat3[(paramInt3 + 13)] + paramArrayOfFloat2[(paramInt2 + 9)] * paramArrayOfFloat3[(paramInt3 + 14)] + paramArrayOfFloat2[(paramInt2 + 13)] * paramArrayOfFloat3[(paramInt3 + 15)]);
    paramArrayOfFloat1[(paramInt1 + 14)] = (paramArrayOfFloat2[(paramInt2 + 2)] * paramArrayOfFloat3[(paramInt3 + 12)] + paramArrayOfFloat2[(paramInt2 + 6)] * paramArrayOfFloat3[(paramInt3 + 13)] + paramArrayOfFloat2[(paramInt2 + 10)] * paramArrayOfFloat3[(paramInt3 + 14)] + paramArrayOfFloat2[(paramInt2 + 14)] * paramArrayOfFloat3[(paramInt3 + 15)]);
    paramArrayOfFloat1[(paramInt1 + 15)] = (paramArrayOfFloat2[(paramInt2 + 3)] * paramArrayOfFloat3[(paramInt3 + 12)] + paramArrayOfFloat2[(paramInt2 + 7)] * paramArrayOfFloat3[(paramInt3 + 13)] + paramArrayOfFloat2[(paramInt2 + 11)] * paramArrayOfFloat3[(paramInt3 + 14)] + paramArrayOfFloat2[(paramInt2 + 15)] * paramArrayOfFloat3[(paramInt3 + 15)]);
  }

  public static void multiplyMM(float[] paramArrayOfFloat1, float[] paramArrayOfFloat2, float[] paramArrayOfFloat3)
  {
    paramArrayOfFloat1[0] = (paramArrayOfFloat2[0] * paramArrayOfFloat3[0] + paramArrayOfFloat2[4] * paramArrayOfFloat3[1] + paramArrayOfFloat2[8] * paramArrayOfFloat3[2] + paramArrayOfFloat2[12] * paramArrayOfFloat3[3]);
    paramArrayOfFloat1[1] = (paramArrayOfFloat2[1] * paramArrayOfFloat3[0] + paramArrayOfFloat2[5] * paramArrayOfFloat3[1] + paramArrayOfFloat2[9] * paramArrayOfFloat3[2] + paramArrayOfFloat2[13] * paramArrayOfFloat3[3]);
    paramArrayOfFloat1[2] = (paramArrayOfFloat2[2] * paramArrayOfFloat3[0] + paramArrayOfFloat2[6] * paramArrayOfFloat3[1] + paramArrayOfFloat2[10] * paramArrayOfFloat3[2] + paramArrayOfFloat2[14] * paramArrayOfFloat3[3]);
    paramArrayOfFloat1[3] = (paramArrayOfFloat2[3] * paramArrayOfFloat3[0] + paramArrayOfFloat2[7] * paramArrayOfFloat3[1] + paramArrayOfFloat2[11] * paramArrayOfFloat3[2] + paramArrayOfFloat2[15] * paramArrayOfFloat3[3]);
    paramArrayOfFloat1[4] = (paramArrayOfFloat2[0] * paramArrayOfFloat3[4] + paramArrayOfFloat2[4] * paramArrayOfFloat3[5] + paramArrayOfFloat2[8] * paramArrayOfFloat3[6] + paramArrayOfFloat2[12] * paramArrayOfFloat3[7]);
    paramArrayOfFloat1[5] = (paramArrayOfFloat2[1] * paramArrayOfFloat3[4] + paramArrayOfFloat2[5] * paramArrayOfFloat3[5] + paramArrayOfFloat2[9] * paramArrayOfFloat3[6] + paramArrayOfFloat2[13] * paramArrayOfFloat3[7]);
    paramArrayOfFloat1[6] = (paramArrayOfFloat2[2] * paramArrayOfFloat3[4] + paramArrayOfFloat2[6] * paramArrayOfFloat3[5] + paramArrayOfFloat2[10] * paramArrayOfFloat3[6] + paramArrayOfFloat2[14] * paramArrayOfFloat3[7]);
    paramArrayOfFloat1[7] = (paramArrayOfFloat2[3] * paramArrayOfFloat3[4] + paramArrayOfFloat2[7] * paramArrayOfFloat3[5] + paramArrayOfFloat2[11] * paramArrayOfFloat3[6] + paramArrayOfFloat2[15] * paramArrayOfFloat3[7]);
    paramArrayOfFloat1[8] = (paramArrayOfFloat2[0] * paramArrayOfFloat3[8] + paramArrayOfFloat2[4] * paramArrayOfFloat3[9] + paramArrayOfFloat2[8] * paramArrayOfFloat3[10] + paramArrayOfFloat2[12] * paramArrayOfFloat3[11]);
    paramArrayOfFloat1[9] = (paramArrayOfFloat2[1] * paramArrayOfFloat3[8] + paramArrayOfFloat2[5] * paramArrayOfFloat3[9] + paramArrayOfFloat2[9] * paramArrayOfFloat3[10] + paramArrayOfFloat2[13] * paramArrayOfFloat3[11]);
    paramArrayOfFloat1[10] = (paramArrayOfFloat2[2] * paramArrayOfFloat3[8] + paramArrayOfFloat2[6] * paramArrayOfFloat3[9] + paramArrayOfFloat2[10] * paramArrayOfFloat3[10] + paramArrayOfFloat2[14] * paramArrayOfFloat3[11]);
    paramArrayOfFloat1[11] = (paramArrayOfFloat2[3] * paramArrayOfFloat3[8] + paramArrayOfFloat2[7] * paramArrayOfFloat3[9] + paramArrayOfFloat2[11] * paramArrayOfFloat3[10] + paramArrayOfFloat2[15] * paramArrayOfFloat3[11]);
    paramArrayOfFloat1[12] = (paramArrayOfFloat2[0] * paramArrayOfFloat3[12] + paramArrayOfFloat2[4] * paramArrayOfFloat3[13] + paramArrayOfFloat2[8] * paramArrayOfFloat3[14] + paramArrayOfFloat2[12] * paramArrayOfFloat3[15]);
    paramArrayOfFloat1[13] = (paramArrayOfFloat2[1] * paramArrayOfFloat3[12] + paramArrayOfFloat2[5] * paramArrayOfFloat3[13] + paramArrayOfFloat2[9] * paramArrayOfFloat3[14] + paramArrayOfFloat2[13] * paramArrayOfFloat3[15]);
    paramArrayOfFloat1[14] = (paramArrayOfFloat2[2] * paramArrayOfFloat3[12] + paramArrayOfFloat2[6] * paramArrayOfFloat3[13] + paramArrayOfFloat2[10] * paramArrayOfFloat3[14] + paramArrayOfFloat2[14] * paramArrayOfFloat3[15]);
    paramArrayOfFloat1[15] = (paramArrayOfFloat2[3] * paramArrayOfFloat3[12] + paramArrayOfFloat2[7] * paramArrayOfFloat3[13] + paramArrayOfFloat2[11] * paramArrayOfFloat3[14] + paramArrayOfFloat2[15] * paramArrayOfFloat3[15]);
  }

  public static void multiplyMV(float[] paramArrayOfFloat1, int paramInt1, float[] paramArrayOfFloat2, int paramInt2, float[] paramArrayOfFloat3, int paramInt3)
  {
    paramArrayOfFloat1[(paramInt1 + 0)] = (paramArrayOfFloat2[(paramInt2 + 0)] * paramArrayOfFloat3[(paramInt3 + 0)] + paramArrayOfFloat2[(paramInt2 + 4)] * paramArrayOfFloat3[(paramInt3 + 1)] + paramArrayOfFloat2[(paramInt2 + 8)] * paramArrayOfFloat3[(paramInt3 + 2)] + paramArrayOfFloat2[(paramInt2 + 12)] * paramArrayOfFloat3[(paramInt3 + 3)]);
    paramArrayOfFloat1[(paramInt1 + 1)] = (paramArrayOfFloat2[(paramInt2 + 1)] * paramArrayOfFloat3[(paramInt3 + 0)] + paramArrayOfFloat2[(paramInt2 + 5)] * paramArrayOfFloat3[(paramInt3 + 1)] + paramArrayOfFloat2[(paramInt2 + 9)] * paramArrayOfFloat3[(paramInt3 + 2)] + paramArrayOfFloat2[(paramInt2 + 13)] * paramArrayOfFloat3[(paramInt3 + 3)]);
    paramArrayOfFloat1[(paramInt1 + 2)] = (paramArrayOfFloat2[(paramInt2 + 2)] * paramArrayOfFloat3[(paramInt3 + 0)] + paramArrayOfFloat2[(paramInt2 + 6)] * paramArrayOfFloat3[(paramInt3 + 1)] + paramArrayOfFloat2[(paramInt2 + 10)] * paramArrayOfFloat3[(paramInt3 + 2)] + paramArrayOfFloat2[(paramInt2 + 14)] * paramArrayOfFloat3[(paramInt3 + 3)]);
    paramArrayOfFloat1[(paramInt1 + 3)] = (paramArrayOfFloat2[(paramInt2 + 3)] * paramArrayOfFloat3[(paramInt3 + 0)] + paramArrayOfFloat2[(paramInt2 + 7)] * paramArrayOfFloat3[(paramInt3 + 1)] + paramArrayOfFloat2[(paramInt2 + 11)] * paramArrayOfFloat3[(paramInt3 + 2)] + paramArrayOfFloat2[(paramInt2 + 15)] * paramArrayOfFloat3[(paramInt3 + 3)]);
  }

  public static void multiplyMV(float[] paramArrayOfFloat1, float[] paramArrayOfFloat2, float[] paramArrayOfFloat3)
  {
    paramArrayOfFloat1[0] = (paramArrayOfFloat2[0] * paramArrayOfFloat3[0] + paramArrayOfFloat2[4] * paramArrayOfFloat3[1] + paramArrayOfFloat2[8] * paramArrayOfFloat3[2] + paramArrayOfFloat2[12] * paramArrayOfFloat3[3]);
    paramArrayOfFloat1[1] = (paramArrayOfFloat2[1] * paramArrayOfFloat3[0] + paramArrayOfFloat2[5] * paramArrayOfFloat3[1] + paramArrayOfFloat2[9] * paramArrayOfFloat3[2] + paramArrayOfFloat2[13] * paramArrayOfFloat3[3]);
    paramArrayOfFloat1[2] = (paramArrayOfFloat2[2] * paramArrayOfFloat3[0] + paramArrayOfFloat2[6] * paramArrayOfFloat3[1] + paramArrayOfFloat2[10] * paramArrayOfFloat3[2] + paramArrayOfFloat2[14] * paramArrayOfFloat3[3]);
    paramArrayOfFloat1[3] = (paramArrayOfFloat2[3] * paramArrayOfFloat3[0] + paramArrayOfFloat2[7] * paramArrayOfFloat3[1] + paramArrayOfFloat2[11] * paramArrayOfFloat3[2] + paramArrayOfFloat2[15] * paramArrayOfFloat3[3]);
  }

  public static void multiplyMV3(float[] paramArrayOfFloat1, float[] paramArrayOfFloat2, float[] paramArrayOfFloat3, float paramFloat)
  {
    paramArrayOfFloat1[0] = (paramArrayOfFloat2[0] * paramArrayOfFloat3[0] + paramArrayOfFloat2[4] * paramArrayOfFloat3[1] + paramArrayOfFloat2[8] * paramArrayOfFloat3[2] + paramArrayOfFloat2[12] * paramFloat);
    paramArrayOfFloat1[1] = (paramArrayOfFloat2[1] * paramArrayOfFloat3[0] + paramArrayOfFloat2[5] * paramArrayOfFloat3[1] + paramArrayOfFloat2[9] * paramArrayOfFloat3[2] + paramArrayOfFloat2[13] * paramFloat);
    paramArrayOfFloat1[2] = (paramArrayOfFloat2[2] * paramArrayOfFloat3[0] + paramArrayOfFloat2[6] * paramArrayOfFloat3[1] + paramArrayOfFloat2[10] * paramArrayOfFloat3[2] + paramArrayOfFloat2[14] * paramFloat);
  }

  public static void orthoM(float[] paramArrayOfFloat, int paramInt, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6)
  {
    AppMethodBeat.i(81683);
    if (paramFloat1 == paramFloat2)
    {
      paramArrayOfFloat = new IllegalArgumentException("left == right");
      AppMethodBeat.o(81683);
      throw paramArrayOfFloat;
    }
    if (paramFloat3 == paramFloat4)
    {
      paramArrayOfFloat = new IllegalArgumentException("bottom == top");
      AppMethodBeat.o(81683);
      throw paramArrayOfFloat;
    }
    if (paramFloat5 == paramFloat6)
    {
      paramArrayOfFloat = new IllegalArgumentException("near == far");
      AppMethodBeat.o(81683);
      throw paramArrayOfFloat;
    }
    float f1 = 1.0F / (paramFloat2 - paramFloat1);
    float f2 = 1.0F / (paramFloat4 - paramFloat3);
    float f3 = 1.0F / (paramFloat6 - paramFloat5);
    paramFloat1 = -(paramFloat2 + paramFloat1);
    paramFloat2 = -(paramFloat4 + paramFloat3);
    paramFloat3 = -(paramFloat6 + paramFloat5);
    paramArrayOfFloat[(paramInt + 0)] = (2.0F * f1);
    paramArrayOfFloat[(paramInt + 5)] = (2.0F * f2);
    paramArrayOfFloat[(paramInt + 10)] = (-2.0F * f3);
    paramArrayOfFloat[(paramInt + 12)] = (f1 * paramFloat1);
    paramArrayOfFloat[(paramInt + 13)] = (f2 * paramFloat2);
    paramArrayOfFloat[(paramInt + 14)] = (f3 * paramFloat3);
    paramArrayOfFloat[(paramInt + 15)] = 1.0F;
    paramArrayOfFloat[(paramInt + 1)] = 0.0F;
    paramArrayOfFloat[(paramInt + 2)] = 0.0F;
    paramArrayOfFloat[(paramInt + 3)] = 0.0F;
    paramArrayOfFloat[(paramInt + 4)] = 0.0F;
    paramArrayOfFloat[(paramInt + 6)] = 0.0F;
    paramArrayOfFloat[(paramInt + 7)] = 0.0F;
    paramArrayOfFloat[(paramInt + 8)] = 0.0F;
    paramArrayOfFloat[(paramInt + 9)] = 0.0F;
    paramArrayOfFloat[(paramInt + 11)] = 0.0F;
    AppMethodBeat.o(81683);
  }

  public static void perspectiveM(float[] paramArrayOfFloat, int paramInt, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4)
  {
    AppMethodBeat.i(81685);
    paramFloat1 = 1.0F / (float)Math.tan(paramFloat1 * 0.008726646259971648D);
    float f = 1.0F / (paramFloat3 - paramFloat4);
    paramArrayOfFloat[(paramInt + 0)] = (paramFloat1 / paramFloat2);
    paramArrayOfFloat[(paramInt + 1)] = 0.0F;
    paramArrayOfFloat[(paramInt + 2)] = 0.0F;
    paramArrayOfFloat[(paramInt + 3)] = 0.0F;
    paramArrayOfFloat[(paramInt + 4)] = 0.0F;
    paramArrayOfFloat[(paramInt + 5)] = paramFloat1;
    paramArrayOfFloat[(paramInt + 6)] = 0.0F;
    paramArrayOfFloat[(paramInt + 7)] = 0.0F;
    paramArrayOfFloat[(paramInt + 8)] = 0.0F;
    paramArrayOfFloat[(paramInt + 9)] = 0.0F;
    paramArrayOfFloat[(paramInt + 10)] = ((paramFloat4 + paramFloat3) * f);
    paramArrayOfFloat[(paramInt + 11)] = -1.0F;
    paramArrayOfFloat[(paramInt + 12)] = 0.0F;
    paramArrayOfFloat[(paramInt + 13)] = 0.0F;
    paramArrayOfFloat[(paramInt + 14)] = (f * (2.0F * paramFloat4 * paramFloat3));
    paramArrayOfFloat[(paramInt + 15)] = 0.0F;
    AppMethodBeat.o(81685);
  }

  public static void rotateM(float[] paramArrayOfFloat, int paramInt, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4)
  {
    AppMethodBeat.i(81688);
    synchronized (TEMP_MATRIX_ARRAY)
    {
      setRotateM(TEMP_MATRIX_ARRAY, 0, paramFloat1, paramFloat2, paramFloat3, paramFloat4);
      multiplyMM(TEMP_MATRIX_ARRAY, 16, paramArrayOfFloat, paramInt, TEMP_MATRIX_ARRAY, 0);
      System.arraycopy(TEMP_MATRIX_ARRAY, 16, paramArrayOfFloat, paramInt, 16);
      AppMethodBeat.o(81688);
      return;
    }
  }

  public static void rotateM(float[] paramArrayOfFloat1, int paramInt1, float[] paramArrayOfFloat2, int paramInt2, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4)
  {
    AppMethodBeat.i(81687);
    synchronized (TEMP_MATRIX_ARRAY)
    {
      setRotateM(TEMP_MATRIX_ARRAY, 0, paramFloat1, paramFloat2, paramFloat3, paramFloat4);
      multiplyMM(paramArrayOfFloat1, paramInt1, paramArrayOfFloat2, paramInt2, TEMP_MATRIX_ARRAY, 0);
      AppMethodBeat.o(81687);
      return;
    }
  }

  public static void scaleM(float[] paramArrayOfFloat, int paramInt, float paramFloat1, float paramFloat2, float paramFloat3)
  {
    for (int i = 0; i < 4; i++)
    {
      int j = paramInt + i;
      paramArrayOfFloat[j] *= paramFloat1;
      int k = j + 4;
      paramArrayOfFloat[k] *= paramFloat2;
      j += 8;
      paramArrayOfFloat[j] *= paramFloat3;
    }
  }

  public static void scaleM(float[] paramArrayOfFloat1, int paramInt1, float[] paramArrayOfFloat2, int paramInt2, float paramFloat1, float paramFloat2, float paramFloat3)
  {
    for (int i = 0; i < 4; i++)
    {
      int j = paramInt1 + i;
      int k = paramInt2 + i;
      paramArrayOfFloat2[k] *= paramFloat1;
      paramArrayOfFloat2[(k + 4)] *= paramFloat2;
      paramArrayOfFloat2[(k + 8)] *= paramFloat3;
      paramArrayOfFloat1[(j + 12)] = paramArrayOfFloat2[(k + 12)];
    }
  }

  public static void setIdentityM(float[] paramArrayOfFloat, int paramInt)
  {
    int i = 0;
    int k;
    for (int j = 0; ; j++)
    {
      k = i;
      if (j >= 16)
        break;
      paramArrayOfFloat[(paramInt + j)] = 0.0F;
    }
    while (k < 16)
    {
      paramArrayOfFloat[(paramInt + k)] = 1.0F;
      k += 5;
    }
  }

  public static void setLookAtM(float[] paramArrayOfFloat, int paramInt, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6, float paramFloat7, float paramFloat8, float paramFloat9)
  {
    AppMethodBeat.i(81691);
    paramFloat4 -= paramFloat1;
    paramFloat5 -= paramFloat2;
    paramFloat6 -= paramFloat3;
    float f1 = 1.0F / length(paramFloat4, paramFloat5, paramFloat6);
    paramFloat4 *= f1;
    paramFloat5 *= f1;
    paramFloat6 *= f1;
    f1 = paramFloat5 * paramFloat9 - paramFloat6 * paramFloat8;
    paramFloat9 = paramFloat6 * paramFloat7 - paramFloat4 * paramFloat9;
    paramFloat8 = paramFloat4 * paramFloat8 - paramFloat5 * paramFloat7;
    float f2 = 1.0F / length(f1, paramFloat9, paramFloat8);
    paramFloat7 = f1 * f2;
    paramFloat9 *= f2;
    paramFloat8 *= f2;
    paramArrayOfFloat[(paramInt + 0)] = paramFloat7;
    paramArrayOfFloat[(paramInt + 1)] = (paramFloat9 * paramFloat6 - paramFloat8 * paramFloat5);
    paramArrayOfFloat[(paramInt + 2)] = (-paramFloat4);
    paramArrayOfFloat[(paramInt + 3)] = 0.0F;
    paramArrayOfFloat[(paramInt + 4)] = paramFloat9;
    paramArrayOfFloat[(paramInt + 5)] = (paramFloat8 * paramFloat4 - paramFloat7 * paramFloat6);
    paramArrayOfFloat[(paramInt + 6)] = (-paramFloat5);
    paramArrayOfFloat[(paramInt + 7)] = 0.0F;
    paramArrayOfFloat[(paramInt + 8)] = paramFloat8;
    paramArrayOfFloat[(paramInt + 9)] = (paramFloat7 * paramFloat5 - paramFloat9 * paramFloat4);
    paramArrayOfFloat[(paramInt + 10)] = (-paramFloat6);
    paramArrayOfFloat[(paramInt + 11)] = 0.0F;
    paramArrayOfFloat[(paramInt + 12)] = 0.0F;
    paramArrayOfFloat[(paramInt + 13)] = 0.0F;
    paramArrayOfFloat[(paramInt + 14)] = 0.0F;
    paramArrayOfFloat[(paramInt + 15)] = 1.0F;
    translateM(paramArrayOfFloat, paramInt, -paramFloat1, -paramFloat2, -paramFloat3);
    AppMethodBeat.o(81691);
  }

  public static void setRotateEulerM(float[] paramArrayOfFloat, int paramInt, float paramFloat1, float paramFloat2, float paramFloat3)
  {
    AppMethodBeat.i(81690);
    float f1 = 0.01745329F * paramFloat1;
    float f2 = 0.01745329F * paramFloat2;
    float f3 = 0.01745329F * paramFloat3;
    paramFloat1 = (float)Math.cos(f1);
    paramFloat2 = (float)Math.sin(f1);
    paramFloat3 = (float)Math.cos(f2);
    f2 = (float)Math.sin(f2);
    f1 = (float)Math.cos(f3);
    f3 = (float)Math.sin(f3);
    float f4 = paramFloat1 * f2;
    float f5 = paramFloat2 * f2;
    paramArrayOfFloat[(paramInt + 0)] = (paramFloat3 * f1);
    paramArrayOfFloat[(paramInt + 1)] = (-paramFloat3 * f3);
    paramArrayOfFloat[(paramInt + 2)] = f2;
    paramArrayOfFloat[(paramInt + 3)] = 0.0F;
    paramArrayOfFloat[(paramInt + 4)] = (f4 * f1 + paramFloat1 * f3);
    paramArrayOfFloat[(paramInt + 5)] = (-f4 * f3 + paramFloat1 * f1);
    paramArrayOfFloat[(paramInt + 6)] = (-paramFloat2 * paramFloat3);
    paramArrayOfFloat[(paramInt + 7)] = 0.0F;
    paramArrayOfFloat[(paramInt + 8)] = (-f5 * f1 + paramFloat2 * f3);
    paramArrayOfFloat[(paramInt + 9)] = (paramFloat2 * f1 + f3 * f5);
    paramArrayOfFloat[(paramInt + 10)] = (paramFloat1 * paramFloat3);
    paramArrayOfFloat[(paramInt + 11)] = 0.0F;
    paramArrayOfFloat[(paramInt + 12)] = 0.0F;
    paramArrayOfFloat[(paramInt + 13)] = 0.0F;
    paramArrayOfFloat[(paramInt + 14)] = 0.0F;
    paramArrayOfFloat[(paramInt + 15)] = 1.0F;
    AppMethodBeat.o(81690);
  }

  public static void setRotateM(float[] paramArrayOfFloat, int paramInt, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4)
  {
    AppMethodBeat.i(81689);
    paramArrayOfFloat[(paramInt + 3)] = 0.0F;
    paramArrayOfFloat[(paramInt + 7)] = 0.0F;
    paramArrayOfFloat[(paramInt + 11)] = 0.0F;
    paramArrayOfFloat[(paramInt + 12)] = 0.0F;
    paramArrayOfFloat[(paramInt + 13)] = 0.0F;
    paramArrayOfFloat[(paramInt + 14)] = 0.0F;
    paramArrayOfFloat[(paramInt + 15)] = 1.0F;
    paramFloat1 = 0.01745329F * paramFloat1;
    float f1 = (float)Math.sin(paramFloat1);
    float f2 = (float)Math.cos(paramFloat1);
    if ((1.0F == paramFloat2) && (0.0F == paramFloat3) && (0.0F == paramFloat4))
    {
      paramArrayOfFloat[(paramInt + 5)] = f2;
      paramArrayOfFloat[(paramInt + 10)] = f2;
      paramArrayOfFloat[(paramInt + 6)] = f1;
      paramArrayOfFloat[(paramInt + 9)] = (-f1);
      paramArrayOfFloat[(paramInt + 1)] = 0.0F;
      paramArrayOfFloat[(paramInt + 2)] = 0.0F;
      paramArrayOfFloat[(paramInt + 4)] = 0.0F;
      paramArrayOfFloat[(paramInt + 8)] = 0.0F;
      paramArrayOfFloat[(paramInt + 0)] = 1.0F;
      AppMethodBeat.o(81689);
    }
    while (true)
    {
      return;
      if ((0.0F == paramFloat2) && (1.0F == paramFloat3) && (0.0F == paramFloat4))
      {
        paramArrayOfFloat[(paramInt + 0)] = f2;
        paramArrayOfFloat[(paramInt + 10)] = f2;
        paramArrayOfFloat[(paramInt + 8)] = f1;
        paramArrayOfFloat[(paramInt + 2)] = (-f1);
        paramArrayOfFloat[(paramInt + 1)] = 0.0F;
        paramArrayOfFloat[(paramInt + 4)] = 0.0F;
        paramArrayOfFloat[(paramInt + 6)] = 0.0F;
        paramArrayOfFloat[(paramInt + 9)] = 0.0F;
        paramArrayOfFloat[(paramInt + 5)] = 1.0F;
        AppMethodBeat.o(81689);
      }
      else if ((0.0F == paramFloat2) && (0.0F == paramFloat3) && (1.0F == paramFloat4))
      {
        paramArrayOfFloat[(paramInt + 0)] = f2;
        paramArrayOfFloat[(paramInt + 5)] = f2;
        paramArrayOfFloat[(paramInt + 1)] = f1;
        paramArrayOfFloat[(paramInt + 4)] = (-f1);
        paramArrayOfFloat[(paramInt + 2)] = 0.0F;
        paramArrayOfFloat[(paramInt + 6)] = 0.0F;
        paramArrayOfFloat[(paramInt + 8)] = 0.0F;
        paramArrayOfFloat[(paramInt + 9)] = 0.0F;
        paramArrayOfFloat[(paramInt + 10)] = 1.0F;
        AppMethodBeat.o(81689);
      }
      else
      {
        float f3 = length(paramFloat2, paramFloat3, paramFloat4);
        float f4 = paramFloat2;
        float f5 = paramFloat3;
        paramFloat1 = paramFloat4;
        if (1.0F != f3)
        {
          paramFloat1 = 1.0F / f3;
          f4 = paramFloat2 * paramFloat1;
          f5 = paramFloat3 * paramFloat1;
          paramFloat1 = paramFloat4 * paramFloat1;
        }
        float f6 = 1.0F - f2;
        paramFloat4 = f4 * f5;
        f3 = f5 * paramFloat1;
        paramFloat2 = paramFloat1 * f4;
        float f7 = f4 * f1;
        paramFloat3 = f5 * f1;
        f1 *= paramFloat1;
        paramArrayOfFloat[(paramInt + 0)] = (f4 * f4 * f6 + f2);
        paramArrayOfFloat[(paramInt + 4)] = (paramFloat4 * f6 - f1);
        paramArrayOfFloat[(paramInt + 8)] = (paramFloat2 * f6 + paramFloat3);
        paramArrayOfFloat[(paramInt + 1)] = (f1 + paramFloat4 * f6);
        paramArrayOfFloat[(paramInt + 5)] = (f5 * f5 * f6 + f2);
        paramArrayOfFloat[(paramInt + 9)] = (f3 * f6 - f7);
        paramArrayOfFloat[(paramInt + 2)] = (paramFloat2 * f6 - paramFloat3);
        paramArrayOfFloat[(paramInt + 6)] = (f3 * f6 + f7);
        paramArrayOfFloat[(paramInt + 10)] = (f2 + f6 * (paramFloat1 * paramFloat1));
        AppMethodBeat.o(81689);
      }
    }
  }

  public static void translateM(float[] paramArrayOfFloat, int paramInt, float paramFloat1, float paramFloat2, float paramFloat3)
  {
    for (int i = 0; i < 4; i++)
    {
      int j = paramInt + i;
      int k = j + 12;
      float f1 = paramArrayOfFloat[k];
      float f2 = paramArrayOfFloat[j];
      float f3 = paramArrayOfFloat[(j + 4)];
      paramArrayOfFloat[k] = (paramArrayOfFloat[(j + 8)] * paramFloat3 + (f2 * paramFloat1 + f3 * paramFloat2) + f1);
    }
  }

  public static void translateM(float[] paramArrayOfFloat1, int paramInt1, float[] paramArrayOfFloat2, int paramInt2, float paramFloat1, float paramFloat2, float paramFloat3)
  {
    int i = 0;
    int k;
    for (int j = 0; ; j++)
    {
      k = i;
      if (j >= 12)
        break;
      paramArrayOfFloat1[(paramInt1 + j)] = paramArrayOfFloat2[(paramInt2 + j)];
    }
    while (k < 4)
    {
      j = paramInt2 + k;
      float f1 = paramArrayOfFloat2[j];
      float f2 = paramArrayOfFloat2[(j + 4)];
      float f3 = paramArrayOfFloat2[(j + 8)];
      paramArrayOfFloat1[(paramInt1 + k + 12)] = (paramArrayOfFloat2[(j + 12)] + (f1 * paramFloat1 + f2 * paramFloat2 + f3 * paramFloat3));
      k++;
    }
  }

  public static void transposeM(float[] paramArrayOfFloat1, int paramInt1, float[] paramArrayOfFloat2, int paramInt2)
  {
    for (int i = 0; i < 4; i++)
    {
      int j = i * 4 + paramInt2;
      paramArrayOfFloat1[(i + paramInt1)] = paramArrayOfFloat2[j];
      paramArrayOfFloat1[(i + 4 + paramInt1)] = paramArrayOfFloat2[(j + 1)];
      paramArrayOfFloat1[(i + 8 + paramInt1)] = paramArrayOfFloat2[(j + 2)];
      paramArrayOfFloat1[(i + 12 + paramInt1)] = paramArrayOfFloat2[(j + 3)];
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.ttpic.ar.sensor.representation.Matrix
 * JD-Core Version:    0.6.2
 */