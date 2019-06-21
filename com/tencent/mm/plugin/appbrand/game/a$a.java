package com.tencent.mm.plugin.appbrand.game;

import com.tencent.magicbrush.d.b;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.h.m.a;

final class a$a extends b
  implements m.a
{
  a$a(a parama, Runnable paramRunnable)
  {
    super(paramRunnable);
  }

  public final void onDestroy()
  {
    AppMethodBeat.i(129994);
    run();
    AppMethodBeat.o(129994);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.game.a.a
 * JD-Core Version:    0.6.2
 */