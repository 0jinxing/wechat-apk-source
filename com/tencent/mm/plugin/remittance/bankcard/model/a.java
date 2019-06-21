package com.tencent.mm.plugin.remittance.bankcard.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.platformtools.SpellMap;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.math.BigDecimal;

public final class a
{
  public static double BJ(int paramInt)
  {
    AppMethodBeat.i(44488);
    double d = fL(String.valueOf(paramInt), "100");
    AppMethodBeat.o(44488);
    return d;
  }

  public static char VL(String paramString)
  {
    AppMethodBeat.i(44489);
    paramString = SpellMap.r(paramString.charAt(0));
    ab.d("MicroMsg.BankRemitUtil", "pinyin: %s", new Object[] { paramString });
    char c1;
    if (!bo.isNullOrNil(paramString))
    {
      c1 = paramString.toUpperCase().charAt(0);
      AppMethodBeat.o(44489);
    }
    for (char c2 = c1; ; c2 = c1)
    {
      return c2;
      c1 = '#';
      AppMethodBeat.o(44489);
    }
  }

  public static long fK(String paramString1, String paramString2)
  {
    AppMethodBeat.i(44485);
    try
    {
      double d = bo.getDouble(paramString1.trim(), 0.0D);
      BigDecimal localBigDecimal = new java/math/BigDecimal;
      if (d == 0.0D);
      for (paramString1 = "0"; ; paramString1 = paramString1.trim())
      {
        localBigDecimal.<init>(paramString1);
        paramString1 = new java/math/BigDecimal;
        paramString1.<init>(paramString2.trim());
        l = localBigDecimal.divide(paramString1, 0, 4).longValue();
        AppMethodBeat.o(44485);
        return l;
      }
    }
    catch (Exception paramString1)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.BankRemitUtil", paramString1, "", new Object[0]);
        long l = 0L;
        AppMethodBeat.o(44485);
      }
    }
  }

  public static double fL(String paramString1, String paramString2)
  {
    double d1 = 0.0D;
    AppMethodBeat.i(44486);
    try
    {
      double d2 = bo.getDouble(paramString1.trim(), 0.0D);
      BigDecimal localBigDecimal = new java/math/BigDecimal;
      if (d2 == 0.0D);
      for (paramString1 = "0"; ; paramString1 = paramString1.trim())
      {
        localBigDecimal.<init>(paramString1);
        paramString1 = new java/math/BigDecimal;
        paramString1.<init>(paramString2.trim());
        d2 = localBigDecimal.divide(paramString1, 2, 4).doubleValue();
        d1 = d2;
        AppMethodBeat.o(44486);
        return d1;
      }
    }
    catch (Exception paramString1)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.BankRemitUtil", paramString1, "", new Object[0]);
        AppMethodBeat.o(44486);
      }
    }
  }

  public static double fM(String paramString1, String paramString2)
  {
    double d1 = 0.0D;
    AppMethodBeat.i(44487);
    try
    {
      double d2 = bo.getDouble(paramString1, 0.0D);
      double d3 = bo.getDouble(paramString2, 0.0D);
      BigDecimal localBigDecimal = new java/math/BigDecimal;
      if (d2 == 0.0D)
        paramString1 = "0";
      localBigDecimal.<init>(paramString1);
      paramString1 = new java/math/BigDecimal;
      if (d3 == 0.0D)
        paramString2 = "0";
      paramString1.<init>(paramString2);
      d2 = localBigDecimal.multiply(paramString1).doubleValue();
      d1 = d2;
      AppMethodBeat.o(44487);
      return d1;
    }
    catch (Exception paramString1)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.BankRemitUtil", paramString1, "", new Object[0]);
        AppMethodBeat.o(44487);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.remittance.bankcard.model.a
 * JD-Core Version:    0.6.2
 */