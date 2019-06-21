package com.tencent.tencentmap.mapsdk.maps.a;

import android.opengl.Matrix;
import com.tencent.matrix.trace.core.AppMethodBeat;

public class he
{
  public static boolean a(float[][] paramArrayOfFloat, float[] paramArrayOfFloat1)
  {
    AppMethodBeat.i(99529);
    boolean bool = b(paramArrayOfFloat, paramArrayOfFloat1);
    AppMethodBeat.o(99529);
    return bool;
  }

  public static float[][] a(float[] paramArrayOfFloat1, float[] paramArrayOfFloat2)
  {
    AppMethodBeat.i(99530);
    float[] arrayOfFloat = new float[16];
    Matrix.multiplyMM(arrayOfFloat, 0, paramArrayOfFloat2, 0, paramArrayOfFloat1, 0);
    paramArrayOfFloat1 = new float[6][4];
    paramArrayOfFloat1[0][0] = (arrayOfFloat[3] - arrayOfFloat[0]);
    paramArrayOfFloat1[0][1] = (arrayOfFloat[7] - arrayOfFloat[4]);
    paramArrayOfFloat1[0][2] = (arrayOfFloat[11] - arrayOfFloat[8]);
    paramArrayOfFloat1[0][3] = (arrayOfFloat[15] - arrayOfFloat[12]);
    double d = Math.sqrt(paramArrayOfFloat1[0][0] * paramArrayOfFloat1[0][0] + paramArrayOfFloat1[0][1] * paramArrayOfFloat1[0][1] + paramArrayOfFloat1[0][2] * paramArrayOfFloat1[0][2]);
    paramArrayOfFloat2 = paramArrayOfFloat1[0];
    paramArrayOfFloat2[0] = ((float)(paramArrayOfFloat2[0] / d));
    paramArrayOfFloat2 = paramArrayOfFloat1[0];
    paramArrayOfFloat2[1] = ((float)(paramArrayOfFloat2[1] / d));
    paramArrayOfFloat2 = paramArrayOfFloat1[0];
    paramArrayOfFloat2[2] = ((float)(paramArrayOfFloat2[2] / d));
    paramArrayOfFloat2 = paramArrayOfFloat1[0];
    paramArrayOfFloat2[3] = ((float)(paramArrayOfFloat2[3] / d));
    paramArrayOfFloat1[1][0] = (arrayOfFloat[3] + arrayOfFloat[0]);
    paramArrayOfFloat1[1][1] = (arrayOfFloat[7] + arrayOfFloat[4]);
    paramArrayOfFloat1[1][2] = (arrayOfFloat[11] + arrayOfFloat[8]);
    paramArrayOfFloat1[1][3] = (arrayOfFloat[15] + arrayOfFloat[12]);
    d = Math.sqrt(paramArrayOfFloat1[1][0] * paramArrayOfFloat1[1][0] + paramArrayOfFloat1[1][1] * paramArrayOfFloat1[1][1] + paramArrayOfFloat1[1][2] * paramArrayOfFloat1[1][2]);
    paramArrayOfFloat2 = paramArrayOfFloat1[1];
    paramArrayOfFloat2[0] = ((float)(paramArrayOfFloat2[0] / d));
    paramArrayOfFloat2 = paramArrayOfFloat1[1];
    paramArrayOfFloat2[1] = ((float)(paramArrayOfFloat2[1] / d));
    paramArrayOfFloat2 = paramArrayOfFloat1[1];
    paramArrayOfFloat2[2] = ((float)(paramArrayOfFloat2[2] / d));
    paramArrayOfFloat2 = paramArrayOfFloat1[1];
    paramArrayOfFloat2[3] = ((float)(paramArrayOfFloat2[3] / d));
    paramArrayOfFloat1[2][0] = (arrayOfFloat[3] + arrayOfFloat[1]);
    paramArrayOfFloat1[2][1] = (arrayOfFloat[7] + arrayOfFloat[5]);
    paramArrayOfFloat1[2][2] = (arrayOfFloat[11] + arrayOfFloat[9]);
    paramArrayOfFloat1[2][3] = (arrayOfFloat[15] + arrayOfFloat[13]);
    d = Math.sqrt(paramArrayOfFloat1[2][0] * paramArrayOfFloat1[2][0] + paramArrayOfFloat1[2][1] * paramArrayOfFloat1[2][1] + paramArrayOfFloat1[2][2] * paramArrayOfFloat1[2][2]);
    paramArrayOfFloat2 = paramArrayOfFloat1[2];
    paramArrayOfFloat2[0] = ((float)(paramArrayOfFloat2[0] / d));
    paramArrayOfFloat2 = paramArrayOfFloat1[2];
    paramArrayOfFloat2[1] = ((float)(paramArrayOfFloat2[1] / d));
    paramArrayOfFloat2 = paramArrayOfFloat1[2];
    paramArrayOfFloat2[2] = ((float)(paramArrayOfFloat2[2] / d));
    paramArrayOfFloat2 = paramArrayOfFloat1[2];
    paramArrayOfFloat2[3] = ((float)(paramArrayOfFloat2[3] / d));
    paramArrayOfFloat1[3][0] = (arrayOfFloat[3] - arrayOfFloat[1]);
    paramArrayOfFloat1[3][1] = (arrayOfFloat[7] - arrayOfFloat[5]);
    paramArrayOfFloat1[3][2] = (arrayOfFloat[11] - arrayOfFloat[9]);
    paramArrayOfFloat1[3][3] = (arrayOfFloat[15] - arrayOfFloat[13]);
    d = Math.sqrt(paramArrayOfFloat1[3][0] * paramArrayOfFloat1[3][0] + paramArrayOfFloat1[3][1] * paramArrayOfFloat1[3][1] + paramArrayOfFloat1[3][2] * paramArrayOfFloat1[3][2]);
    paramArrayOfFloat2 = paramArrayOfFloat1[3];
    paramArrayOfFloat2[0] = ((float)(paramArrayOfFloat2[0] / d));
    paramArrayOfFloat2 = paramArrayOfFloat1[3];
    paramArrayOfFloat2[1] = ((float)(paramArrayOfFloat2[1] / d));
    paramArrayOfFloat2 = paramArrayOfFloat1[3];
    paramArrayOfFloat2[2] = ((float)(paramArrayOfFloat2[2] / d));
    paramArrayOfFloat2 = paramArrayOfFloat1[3];
    paramArrayOfFloat2[3] = ((float)(paramArrayOfFloat2[3] / d));
    paramArrayOfFloat1[4][0] = (arrayOfFloat[3] - arrayOfFloat[2]);
    paramArrayOfFloat1[4][1] = (arrayOfFloat[7] - arrayOfFloat[6]);
    paramArrayOfFloat1[4][2] = (arrayOfFloat[11] - arrayOfFloat[10]);
    paramArrayOfFloat1[4][3] = (arrayOfFloat[15] - arrayOfFloat[14]);
    d = Math.sqrt(paramArrayOfFloat1[4][0] * paramArrayOfFloat1[4][0] + paramArrayOfFloat1[4][1] * paramArrayOfFloat1[4][1] + paramArrayOfFloat1[4][2] * paramArrayOfFloat1[4][2]);
    paramArrayOfFloat2 = paramArrayOfFloat1[4];
    paramArrayOfFloat2[0] = ((float)(paramArrayOfFloat2[0] / d));
    paramArrayOfFloat2 = paramArrayOfFloat1[4];
    paramArrayOfFloat2[1] = ((float)(paramArrayOfFloat2[1] / d));
    paramArrayOfFloat2 = paramArrayOfFloat1[4];
    paramArrayOfFloat2[2] = ((float)(paramArrayOfFloat2[2] / d));
    paramArrayOfFloat2 = paramArrayOfFloat1[4];
    paramArrayOfFloat2[3] = ((float)(paramArrayOfFloat2[3] / d));
    paramArrayOfFloat1[5][0] = (arrayOfFloat[3] + arrayOfFloat[2]);
    paramArrayOfFloat1[5][1] = (arrayOfFloat[7] + arrayOfFloat[6]);
    paramArrayOfFloat1[5][2] = (arrayOfFloat[11] + arrayOfFloat[10]);
    paramArrayOfFloat2 = paramArrayOfFloat1[5];
    float f = arrayOfFloat[15];
    paramArrayOfFloat2[3] = (arrayOfFloat[14] + f);
    d = Math.sqrt(paramArrayOfFloat1[5][0] * paramArrayOfFloat1[5][0] + paramArrayOfFloat1[5][1] * paramArrayOfFloat1[5][1] + paramArrayOfFloat1[5][2] * paramArrayOfFloat1[5][2]);
    paramArrayOfFloat2 = paramArrayOfFloat1[5];
    paramArrayOfFloat2[0] = ((float)(paramArrayOfFloat2[0] / d));
    paramArrayOfFloat2 = paramArrayOfFloat1[5];
    paramArrayOfFloat2[1] = ((float)(paramArrayOfFloat2[1] / d));
    paramArrayOfFloat2 = paramArrayOfFloat1[5];
    paramArrayOfFloat2[2] = ((float)(paramArrayOfFloat2[2] / d));
    paramArrayOfFloat2 = paramArrayOfFloat1[5];
    paramArrayOfFloat2[3] = ((float)(paramArrayOfFloat2[3] / d));
    AppMethodBeat.o(99530);
    return paramArrayOfFloat1;
  }

  private static boolean b(float[][] paramArrayOfFloat, float[] paramArrayOfFloat1)
  {
    boolean bool = false;
    int i = paramArrayOfFloat1.length / 3;
    int j = 0;
    if (j < 6)
    {
      int k = 0;
      for (int m = 0; m < i; m++)
      {
        float f1 = paramArrayOfFloat[j][0];
        int n = k + 1;
        float f2 = paramArrayOfFloat1[k];
        float f3 = paramArrayOfFloat[j][1];
        int i1 = n + 1;
        float f4 = paramArrayOfFloat1[n];
        float f5 = paramArrayOfFloat[j][2];
        k = i1 + 1;
        if (f3 * f4 + f2 * f1 + f5 * paramArrayOfFloat1[i1] + paramArrayOfFloat[j][3] > 0.0F)
          break;
      }
      if (m != i);
    }
    while (true)
    {
      return bool;
      j++;
      break;
      bool = true;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.tencentmap.mapsdk.maps.a.he
 * JD-Core Version:    0.6.2
 */