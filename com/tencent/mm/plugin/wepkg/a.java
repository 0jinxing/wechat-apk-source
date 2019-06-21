package com.tencent.mm.plugin.wepkg;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.wepkg.model.WepkgVersion;
import com.tencent.mm.plugin.wepkg.model.f;
import com.tencent.mm.plugin.wepkg.model.h;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.xweb.o;

public final class a
{
  private static f uVn;
  private static boolean uVo = false;

  public static void aht(String paramString)
  {
    AppMethodBeat.i(63341);
    if (dga().equals(paramString))
      uVo = true;
    AppMethodBeat.o(63341);
  }

  public static o ahu(String paramString)
  {
    AppMethodBeat.i(63344);
    if ((!b.enable()) || (uVn == null))
    {
      ab.e("MicroMsg.CommJsLoader", "nativeJsCache is null");
      AppMethodBeat.o(63344);
      paramString = null;
    }
    while (true)
    {
      return paramString;
      paramString = uVn.ahS(paramString);
      if (paramString != null)
      {
        AppMethodBeat.o(63344);
      }
      else
      {
        AppMethodBeat.o(63344);
        paramString = null;
      }
    }
  }

  public static void bM(String paramString, boolean paramBoolean)
  {
    AppMethodBeat.i(63342);
    if ((dga().equals(paramString)) && ((uVo) || (b.dgf() == 0)))
    {
      uVo = false;
      if (paramBoolean)
        sg();
    }
    AppMethodBeat.o(63342);
  }

  public static void biO()
  {
    AppMethodBeat.i(63340);
    sg();
    AppMethodBeat.o(63340);
  }

  public static String dga()
  {
    AppMethodBeat.i(63339);
    String str = com.tencent.mm.plugin.game.commlib.a.bDi();
    if (!bo.isNullOrNil(str))
      AppMethodBeat.o(63339);
    while (true)
    {
      return str;
      str = "commlib";
      AppMethodBeat.o(63339);
    }
  }

  public static String dgb()
  {
    if ((uVn != null) && (uVn.uWY != null));
    for (String str = uVn.uWY.version; ; str = "")
      return str;
  }

  public static void sg()
  {
    AppMethodBeat.i(63343);
    ab.i("MicroMsg.CommJsLoader", "load");
    h.a(dga(), new a.1());
    AppMethodBeat.o(63343);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wepkg.a
 * JD-Core Version:    0.6.2
 */