package com.tencent.mm.ui.tools;

public final class l
{
  public static float[] c(float[][] paramArrayOfFloat, float[] paramArrayOfFloat1)
  {
    float[] arrayOfFloat = new float[3];
    for (int i = 0; i < 3; i++)
    {
      float f = 0.0F;
      for (int j = 0; j < 3; j++)
        f += paramArrayOfFloat[i][j] * paramArrayOfFloat1[j];
      arrayOfFloat[i] = f;
    }
    return arrayOfFloat;
  }

  public static float[][] c(float[][] paramArrayOfFloat)
  {
    float[][] arrayOfFloat = new float[3][3];
    int j;
    float f1;
    for (int i = 0; i < 3; i++)
    {
      j = 0;
      if (j < 3)
      {
        float[] arrayOfFloat1 = arrayOfFloat[i];
        if (i == j);
        for (f1 = 1.0F; ; f1 = 0.0F)
        {
          arrayOfFloat1[j] = f1;
          j++;
          break;
        }
      }
    }
    for (i = 0; i < 3; i++)
    {
      float f2 = paramArrayOfFloat[i][i];
      f1 = f2;
      int k;
      if (f2 == 0.0F)
      {
        for (j = i + 1; j < 3; j++)
          if (paramArrayOfFloat[j][i] != 0.0F)
            for (k = 0; k < 3; k++)
            {
              f1 = paramArrayOfFloat[j][k];
              paramArrayOfFloat[j][k] = paramArrayOfFloat[i][k];
              paramArrayOfFloat[i][k] = f1;
              f1 = arrayOfFloat[j][k];
              arrayOfFloat[j][k] = arrayOfFloat[i][k];
              arrayOfFloat[i][k] = f1;
            }
        f1 = paramArrayOfFloat[i][i];
      }
      for (j = 0; j < 3; j++)
      {
        paramArrayOfFloat[i][j] /= f1;
        arrayOfFloat[i][j] /= f1;
      }
      for (j = 0; j < 3; j++)
        if (j != i)
        {
          f1 = paramArrayOfFloat[j][i];
          for (k = 0; k < 3; k++)
          {
            paramArrayOfFloat[j][k] -= paramArrayOfFloat[i][k] * f1;
            arrayOfFloat[j][k] -= arrayOfFloat[i][k] * f1;
          }
        }
    }
    return arrayOfFloat;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.tools.l
 * JD-Core Version:    0.6.2
 */