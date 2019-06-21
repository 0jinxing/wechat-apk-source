package com.tencent.mm.plugin.fav.ui;

import android.content.Context;
import android.content.res.Resources;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;

public final class k
{
  public static String K(Context paramContext, int paramInt)
  {
    AppMethodBeat.i(74184);
    if (paramInt <= 0)
    {
      paramContext = paramContext.getString(2131299763, new Object[] { Integer.valueOf(0) });
      AppMethodBeat.o(74184);
    }
    while (true)
    {
      return paramContext;
      int i = paramInt / 60;
      paramInt %= 60;
      if (i == 0)
      {
        paramContext = paramContext.getString(2131299763, new Object[] { Integer.valueOf(paramInt) });
        AppMethodBeat.o(74184);
      }
      else
      {
        paramContext = paramContext.getString(2131299762, new Object[] { Integer.valueOf(i), Integer.valueOf(paramInt) });
        AppMethodBeat.o(74184);
      }
    }
  }

  public static String L(Context paramContext, int paramInt)
  {
    AppMethodBeat.i(74186);
    paramContext = "[" + paramContext.getResources().getString(paramInt) + "]";
    AppMethodBeat.o(74186);
    return paramContext;
  }

  public static boolean Md(String paramString)
  {
    boolean bool = false;
    AppMethodBeat.i(74185);
    if (bo.isNullOrNil(paramString))
      AppMethodBeat.o(74185);
    while (true)
    {
      return bool;
      if (!paramString.equals(ah.getContext().getResources().getString(2131300997)))
      {
        bool = true;
        AppMethodBeat.o(74185);
      }
      else
      {
        AppMethodBeat.o(74185);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fav.ui.k
 * JD-Core Version:    0.6.2
 */