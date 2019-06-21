package com.tencent.liteav.basic.e;

import com.tencent.matrix.trace.core.AppMethodBeat;

public class k
{
  public static final float[] a = { 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F };
  public static final float[] b = { 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F };
  public static final float[] c = { 1.0F, 0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 0.0F, 1.0F };
  public static final float[] d = { 0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 0.0F, 1.0F, 1.0F };
  public static final float[] e = { -1.0F, -1.0F, 1.0F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F };

  private static float a(float paramFloat)
  {
    float f = 0.0F;
    if (paramFloat == 0.0F)
      f = 1.0F;
    return f;
  }

  public static float[] a(j paramj, boolean paramBoolean1, boolean paramBoolean2)
  {
    AppMethodBeat.i(66174);
    float[] arrayOfFloat;
    switch (k.1.a[paramj.ordinal()])
    {
    default:
      paramj = (float[])a.clone();
      if (paramBoolean1)
      {
        arrayOfFloat = new float[8];
        arrayOfFloat[0] = a(paramj[0]);
        arrayOfFloat[1] = paramj[1];
        arrayOfFloat[2] = a(paramj[2]);
        arrayOfFloat[3] = paramj[3];
        arrayOfFloat[4] = a(paramj[4]);
        arrayOfFloat[5] = paramj[5];
        arrayOfFloat[6] = a(paramj[6]);
        arrayOfFloat[7] = paramj[7];
        paramj = arrayOfFloat;
      }
      break;
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      if (paramBoolean2)
      {
        arrayOfFloat = new float[8];
        arrayOfFloat[0] = paramj[0];
        arrayOfFloat[1] = a(paramj[1]);
        arrayOfFloat[2] = paramj[2];
        arrayOfFloat[3] = a(paramj[3]);
        arrayOfFloat[4] = paramj[4];
        arrayOfFloat[5] = a(paramj[5]);
        arrayOfFloat[6] = paramj[6];
        arrayOfFloat[7] = a(paramj[7]);
        paramj = arrayOfFloat;
      }
      while (true)
      {
        AppMethodBeat.o(66174);
        return paramj;
        paramj = (float[])b.clone();
        break;
        paramj = (float[])c.clone();
        break;
        paramj = (float[])d.clone();
        break;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.liteav.basic.e.k
 * JD-Core Version:    0.6.2
 */