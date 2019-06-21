package com.tencent.mm.plugin.appbrand.game.c;

import com.tencent.magicbrush.a.b;
import com.tencent.magicbrush.a.c.c;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;

public final class d
{
  static
  {
    AppMethodBeat.i(130149);
    long l1 = bo.yz();
    b.yB();
    long l2 = bo.yz();
    b.loadLibrary("gamelog_delegate");
    ab.i("MicroMsg.MBLogDelegateRegistry", "dl: load magicbrush & gamelog_delegate cost = [%d]ms magicbrush cost [%d]ms", new Object[] { Long.valueOf(bo.az(l1)), Long.valueOf(l2 - l1) });
    AppMethodBeat.o(130149);
  }

  public static void axy()
  {
    AppMethodBeat.i(130148);
    c.c.a(new d.1());
    AppMethodBeat.o(130148);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.game.c.d
 * JD-Core Version:    0.6.2
 */