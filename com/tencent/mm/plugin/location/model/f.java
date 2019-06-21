package com.tencent.mm.plugin.location.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.pluginsdk.t;

public final class f
{
  private static double hOA = -85.0D;
  private static double hOB = -1000.0D;
  private static double hOC = -85.0D;
  private static double hOD = -1000.0D;

  public static boolean a(double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, int paramInt, double paramDouble5)
  {
    AppMethodBeat.i(113310);
    boolean bool = false;
    if (paramInt == 0)
    {
      if (paramDouble5 == 0.0D)
        bool = false;
      while (paramDouble5 <= 0.0D)
      {
        AppMethodBeat.o(113310);
        return bool;
      }
    }
    label130: 
    while (true)
    {
      bool = true;
      break;
      if (paramInt != 1)
        break;
      if ((paramDouble2 == -85.0D) || (paramDouble1 == -1000.0D))
        paramInt = 0;
      while (true)
      {
        if (paramInt != 0)
          break label130;
        bool = false;
        break;
        if ((paramDouble3 == -1000.0D) || (paramDouble4 == -85.0D))
          paramInt = 0;
        else if (t.c(paramDouble2, paramDouble1, paramDouble4, paramDouble3) >= 5.0D)
          paramInt = 1;
        else
          paramInt = 0;
      }
    }
  }

  public static double h(double paramDouble1, double paramDouble2)
  {
    AppMethodBeat.i(113309);
    hOC = paramDouble1;
    hOD = paramDouble2;
    if ((hOA == -85.0D) || (hOB == -1000.0D));
    for (paramDouble1 = 0.0D; ; paramDouble1 = Math.atan2(hOD - hOB, hOC - hOA) * 180.0D / 3.141592D)
    {
      hOA = hOC;
      hOB = hOD;
      AppMethodBeat.o(113309);
      return paramDouble1;
    }
  }

  public static boolean x(double paramDouble)
  {
    if (paramDouble >= 4.0D);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public static double z(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    AppMethodBeat.i(113311);
    double d = Math.sqrt((paramInt1 - paramInt3) * (paramInt1 - paramInt3) + (paramInt2 - paramInt4) * (paramInt2 - paramInt4));
    AppMethodBeat.o(113311);
    return d;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.location.model.f
 * JD-Core Version:    0.6.2
 */