package com.tencent.mm.modelgeo;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class a$a
{
  private static double a = 6378245.0D;
  private static double fBt = 3.141592653589793D;
  private static double fBu = 0.006693421622965943D;

  public static double[] f(double paramDouble1, double paramDouble2)
  {
    AppMethodBeat.i(78103);
    int i;
    double[] arrayOfDouble;
    if ((paramDouble1 < 72.004000000000005D) || (paramDouble1 > 137.8347D))
    {
      i = 1;
      if (i == 0)
        break label80;
      arrayOfDouble = new double[2];
      arrayOfDouble[0] = paramDouble1;
      arrayOfDouble[1] = paramDouble2;
      AppMethodBeat.o(78103);
    }
    while (true)
    {
      return arrayOfDouble;
      if ((paramDouble2 < 0.8293D) || (paramDouble2 > 55.827100000000002D))
      {
        i = 1;
        break;
      }
      i = 0;
      break;
      label80: double d1 = paramDouble1 - 105.0D;
      double d2 = paramDouble2 - 35.0D;
      double d3 = Math.sqrt(Math.abs(d1));
      double d4 = Math.sin(6.0D * d1 * fBt);
      double d5 = (Math.sin(d1 * 2.0D * fBt) * 20.0D + 20.0D * d4) * 2.0D / 3.0D;
      double d6 = (20.0D * Math.sin(fBt * d2) + 40.0D * Math.sin(d2 / 3.0D * fBt)) * 2.0D / 3.0D;
      d4 = Math.sin(d2 / 12.0D * fBt);
      double d7 = (Math.sin(d2 * fBt / 30.0D) * 320.0D + 160.0D * d4) * 2.0D / 3.0D;
      double d8 = paramDouble1 - 105.0D;
      double d9 = paramDouble2 - 35.0D;
      double d10 = Math.sqrt(Math.abs(d8));
      d4 = (20.0D * Math.sin(6.0D * d8 * fBt) + 20.0D * Math.sin(2.0D * d8 * fBt)) * 2.0D / 3.0D;
      double d11 = (20.0D * Math.sin(fBt * d8) + 40.0D * Math.sin(d8 / 3.0D * fBt)) * 2.0D / 3.0D;
      double d12 = Math.sin(d8 / 12.0D * fBt);
      d12 = (Math.sin(d8 / 30.0D * fBt) * 300.0D + 150.0D * d12) * 2.0D / 3.0D;
      double d13 = paramDouble2 / 180.0D * fBt;
      double d14 = Math.sin(d13);
      double d15 = 1.0D - d14 * (fBu * d14);
      d14 = Math.sqrt(d15);
      d3 = (d5 + (-100.0D + 2.0D * d1 + 3.0D * d2 + 0.2D * d2 * d2 + 0.1D * d1 * d2 + 0.2D * d3) + d6 + d7) * 180.0D / (a * (1.0D - fBu) / (d15 * d14) * fBt);
      d1 = a / d14;
      d4 = (d12 + (d9 * (0.1D * d8) + (300.0D + d8 + 2.0D * d9 + 0.1D * d8 * d8) + 0.1D * d10 + d4 + d11)) * 180.0D / (Math.cos(d13) * d1 * fBt);
      arrayOfDouble = new double[2];
      arrayOfDouble[0] = (2.0D * paramDouble1 - (d4 + paramDouble1));
      arrayOfDouble[1] = (2.0D * paramDouble2 - (paramDouble2 + d3));
      AppMethodBeat.o(78103);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelgeo.a.a
 * JD-Core Version:    0.6.2
 */