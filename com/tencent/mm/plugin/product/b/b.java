package com.tencent.mm.plugin.product.b;

import android.content.Context;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.protocal.protobuf.ze;
import com.tencent.mm.sdk.platformtools.bo;

public final class b
{
  public static String a(Context paramContext, ze paramze)
  {
    AppMethodBeat.i(43950);
    if (paramze.vQt > 0)
    {
      paramContext = paramze.Name + " " + d(paramze.vQt, paramze.PriceType);
      AppMethodBeat.o(43950);
    }
    while (true)
    {
      return paramContext;
      paramContext = paramContext.getString(2131301377);
      AppMethodBeat.o(43950);
    }
  }

  public static String d(double paramDouble, String paramString)
  {
    AppMethodBeat.i(43949);
    if (("CNY".equals(paramString)) || ("1".equals(paramString)) || (bo.isNullOrNil(paramString)))
    {
      paramString = String.format("¥%.2f", new Object[] { Double.valueOf(paramDouble / 100.0D) });
      AppMethodBeat.o(43949);
    }
    while (true)
    {
      return paramString;
      paramString = String.format("%s%.2f", new Object[] { paramString, Double.valueOf(paramDouble / 100.0D) });
      AppMethodBeat.o(43949);
    }
  }

  public static String s(int paramInt1, int paramInt2, String paramString)
  {
    AppMethodBeat.i(43948);
    if (paramInt1 == paramInt2)
    {
      paramString = d(paramInt1, paramString);
      AppMethodBeat.o(43948);
    }
    while (true)
    {
      return paramString;
      paramString = String.format("%s~%s", new Object[] { d(paramInt2, paramString), d(paramInt1, paramString) });
      AppMethodBeat.o(43948);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.product.b.b
 * JD-Core Version:    0.6.2
 */