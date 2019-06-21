package com.tencent.mm.plugin.appbrand.appcache;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.expt.a.a;
import com.tencent.mm.plugin.expt.a.a.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.sdk.platformtools.f;
import com.tencent.mm.storage.d;
import java.util.Map;

public final class r
{
  public static boolean avD()
  {
    AppMethodBeat.i(129363);
    boolean bool;
    if (!g.RK())
    {
      bool = false;
      AppMethodBeat.o(129363);
    }
    while (true)
    {
      return bool;
      bool = true;
      AppMethodBeat.o(129363);
    }
  }

  public static boolean avE()
  {
    AppMethodBeat.i(129364);
    boolean bool;
    if (!g.RK())
    {
      bool = false;
      AppMethodBeat.o(129364);
    }
    while (true)
    {
      return bool;
      bool = true;
      AppMethodBeat.o(129364);
    }
  }

  public static boolean avF()
  {
    AppMethodBeat.i(129365);
    boolean bool;
    if (!g.RK())
    {
      bool = false;
      AppMethodBeat.o(129365);
    }
    while (true)
    {
      return bool;
      bool = true;
      AppMethodBeat.o(129365);
    }
  }

  public static boolean avG()
  {
    boolean bool = false;
    AppMethodBeat.i(129366);
    if (!g.RK())
      AppMethodBeat.o(129366);
    while (true)
    {
      return bool;
      com.tencent.mm.storage.c localc = com.tencent.mm.model.c.c.abi().ll("100399");
      if (f.IS_FLAVOR_RED);
      for (bool = true; ; bool = false)
      {
        if ((!localc.isValid()) || (bo.getInt((String)localc.dru().get("isUseNewPackageLogic"), 0) <= 0))
          break label80;
        AppMethodBeat.o(129366);
        bool = true;
        break;
      }
      label80: AppMethodBeat.o(129366);
    }
  }

  public static boolean avH()
  {
    AppMethodBeat.i(129367);
    boolean bool = ((a)g.K(a.class)).a(a.a.lHo, false);
    if (bool);
    for (int i = 1; ; i = 0)
    {
      ab.i("MicroMsg.PkgABTest", "openSplitCodeLib exp:%d", new Object[] { Integer.valueOf(i) });
      AppMethodBeat.o(129367);
      return bool;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.appcache.r
 * JD-Core Version:    0.6.2
 */