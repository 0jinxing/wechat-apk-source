package com.tencent.tencentmap.mapsdk.maps.a;

import android.opengl.GLU;
import android.opengl.Matrix;
import com.tencent.map.lib.gl.model.c;
import com.tencent.map.lib.gl.model.d;
import com.tencent.matrix.trace.core.AppMethodBeat;

public class hd
{
  private static final String[] a = { "北", "东北", "东", "东南", "南", "西南", "西", "西北" };

  private static d a(float[] paramArrayOfFloat)
  {
    AppMethodBeat.i(99527);
    float f1 = paramArrayOfFloat[0];
    float f2 = paramArrayOfFloat[1];
    float f3 = paramArrayOfFloat[2];
    float f4 = paramArrayOfFloat[3];
    float f5 = paramArrayOfFloat[4];
    float f6 = paramArrayOfFloat[5];
    float f7 = paramArrayOfFloat[6];
    float f8 = paramArrayOfFloat[7];
    float f9 = paramArrayOfFloat[8];
    float[] arrayOfFloat1 = new float[3];
    paramArrayOfFloat = new float[3];
    float[] arrayOfFloat2 = new float[3];
    paramArrayOfFloat[0] = (f4 - f1);
    paramArrayOfFloat[1] = (f5 - f2);
    paramArrayOfFloat[2] = (f6 - f3);
    arrayOfFloat2[0] = (f7 - f1);
    arrayOfFloat2[1] = (f8 - f2);
    arrayOfFloat2[2] = (f9 - f3);
    arrayOfFloat1[0] = (paramArrayOfFloat[1] * arrayOfFloat2[2] - paramArrayOfFloat[2] * arrayOfFloat2[1]);
    arrayOfFloat1[1] = (paramArrayOfFloat[2] * arrayOfFloat2[0] - paramArrayOfFloat[0] * arrayOfFloat2[2]);
    arrayOfFloat1[2] = (paramArrayOfFloat[0] * arrayOfFloat2[1] - paramArrayOfFloat[1] * arrayOfFloat2[0]);
    paramArrayOfFloat = new d(arrayOfFloat1[0], arrayOfFloat1[1], arrayOfFloat1[2]);
    AppMethodBeat.o(99527);
    return paramArrayOfFloat;
  }

  public static boolean a(float paramFloat1, float paramFloat2, float[] paramArrayOfFloat1, float[] paramArrayOfFloat2, int[] paramArrayOfInt)
  {
    AppMethodBeat.i(99525);
    d locald = a(paramArrayOfFloat1);
    float[] arrayOfFloat1 = new float[16];
    Matrix.setIdentityM(arrayOfFloat1, 0);
    float[] arrayOfFloat2 = a(paramFloat1, paramFloat2, 0.0F, arrayOfFloat1, paramArrayOfFloat2, paramArrayOfInt);
    paramArrayOfFloat2 = a(paramFloat1, paramFloat2, 1.0F, arrayOfFloat1, paramArrayOfFloat2, paramArrayOfInt);
    for (int i = 0; i < 3; i++)
    {
      arrayOfFloat2[i] /= arrayOfFloat2[3];
      paramArrayOfFloat2[i] /= paramArrayOfFloat2[3];
    }
    paramArrayOfInt = new d(paramArrayOfFloat2[0] - arrayOfFloat2[0], paramArrayOfFloat2[1] - arrayOfFloat2[1], paramArrayOfFloat2[2] - arrayOfFloat2[2]);
    paramArrayOfFloat2 = locald.a();
    float f1 = paramArrayOfFloat1[0];
    paramFloat2 = paramArrayOfFloat1[1];
    paramFloat1 = paramArrayOfFloat1[2];
    paramArrayOfInt = paramArrayOfInt.a();
    float f2 = arrayOfFloat2[0];
    float f3 = arrayOfFloat2[1];
    float f4 = arrayOfFloat2[2];
    paramArrayOfFloat2 = a(paramArrayOfFloat2, new float[] { f1, paramFloat2, paramFloat1 }, paramArrayOfInt, new float[] { f2, f3, f4 });
    boolean bool;
    if (paramArrayOfFloat2 == null)
    {
      bool = false;
      AppMethodBeat.o(99525);
    }
    while (true)
    {
      return bool;
      bool = a(paramArrayOfFloat2, paramArrayOfFloat1);
      AppMethodBeat.o(99525);
    }
  }

  private static boolean a(float[] paramArrayOfFloat1, float[] paramArrayOfFloat2)
  {
    AppMethodBeat.i(99528);
    boolean bool = new c(paramArrayOfFloat2).a(paramArrayOfFloat1);
    AppMethodBeat.o(99528);
    return bool;
  }

  public static float[] a(float paramFloat1, float paramFloat2, float paramFloat3, float[] paramArrayOfFloat1, float[] paramArrayOfFloat2, int[] paramArrayOfInt)
  {
    AppMethodBeat.i(99526);
    float[] arrayOfFloat = new float[4];
    if (GLU.gluUnProject(paramFloat1, paramArrayOfInt[3] - paramFloat2, paramFloat3, paramArrayOfFloat1, 0, paramArrayOfFloat2, 0, paramArrayOfInt, 0, arrayOfFloat, 0) != 1)
    {
      paramArrayOfFloat1 = new RuntimeException("unProject fail");
      AppMethodBeat.o(99526);
      throw paramArrayOfFloat1;
    }
    AppMethodBeat.o(99526);
    return arrayOfFloat;
  }

  public static float[] a(float[] paramArrayOfFloat1, float[] paramArrayOfFloat2, float[] paramArrayOfFloat3, float[] paramArrayOfFloat4)
  {
    float[] arrayOfFloat = new float[3];
    float f1 = paramArrayOfFloat1[0];
    float f2 = paramArrayOfFloat1[1];
    float f3 = paramArrayOfFloat1[2];
    float f4 = paramArrayOfFloat2[0];
    float f5 = paramArrayOfFloat2[1];
    float f6 = paramArrayOfFloat2[2];
    float f7 = paramArrayOfFloat3[0];
    float f8 = paramArrayOfFloat3[1];
    float f9 = paramArrayOfFloat3[2];
    float f10 = paramArrayOfFloat4[0];
    float f11 = paramArrayOfFloat4[1];
    float f12 = paramArrayOfFloat4[2];
    float f13 = f7 * f1 + f8 * f2 + f9 * f3;
    if (f13 == 0.0F);
    for (paramArrayOfFloat1 = null; ; paramArrayOfFloat1 = arrayOfFloat)
    {
      return paramArrayOfFloat1;
      f5 = (f1 * (f4 - f10) + f2 * (f5 - f11) + (f6 - f12) * f3) / f13;
      arrayOfFloat[0] = (f7 * f5 + f10);
      arrayOfFloat[1] = (f8 * f5 + f11);
      arrayOfFloat[2] = (f5 * f9 + f12);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.tencentmap.mapsdk.maps.a.hd
 * JD-Core Version:    0.6.2
 */