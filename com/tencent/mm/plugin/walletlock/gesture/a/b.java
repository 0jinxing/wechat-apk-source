package com.tencent.mm.plugin.walletlock.gesture.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.z;

public final class b
{
  public static boolean cTA()
  {
    boolean bool = true;
    AppMethodBeat.i(51549);
    g localg = d.cTB();
    ab.v("MicroMsg.GestureUtil", "alvinluo timeInfo: %d, %d", new Object[] { Long.valueOf(localg.tVD), Long.valueOf(localg.tVE) });
    if (localg.tVD != -1L)
    {
      e.a(localg);
      if (localg.tVE / 1000L < 600L)
      {
        d.ac(localg.tVD, localg.tVE);
        AppMethodBeat.o(51549);
      }
    }
    while (true)
    {
      return bool;
      d.cTC();
      AppMethodBeat.o(51549);
      bool = false;
    }
  }

  public static boolean cTz()
  {
    AppMethodBeat.i(51547);
    boolean bool = ((Boolean)com.tencent.mm.kernel.g.RP().Ry().get(ac.a.xTj, Boolean.FALSE)).booleanValue();
    AppMethodBeat.o(51547);
    return bool;
  }

  public static void nx(boolean paramBoolean)
  {
    AppMethodBeat.i(51548);
    ab.i("MicroMsg.GestureGuardManager", "alvinluo setUserSetGesturePwd: %b", new Object[] { Boolean.valueOf(paramBoolean) });
    com.tencent.mm.kernel.g.RP().Ry().set(ac.a.xTj, Boolean.valueOf(paramBoolean));
    com.tencent.mm.kernel.g.RP().Ry().dsb();
    AppMethodBeat.o(51548);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.walletlock.gesture.a.b
 * JD-Core Version:    0.6.2
 */