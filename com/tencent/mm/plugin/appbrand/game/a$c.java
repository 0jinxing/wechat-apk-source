package com.tencent.mm.plugin.appbrand.game;

import com.tencent.magicbrush.handler.a;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.h.i;
import com.tencent.mm.plugin.appbrand.h.n;

public final class a$c
  implements a
{
  private n hql;

  private a$c(i parami)
  {
    AppMethodBeat.i(129996);
    this.hql = ((n)parami.af(n.class));
    AppMethodBeat.o(129996);
  }

  public final void f(Runnable paramRunnable)
  {
    AppMethodBeat.i(129997);
    this.hql.f(paramRunnable);
    AppMethodBeat.o(129997);
  }

  public final boolean yE()
  {
    AppMethodBeat.i(129998);
    boolean bool = this.hql.yE();
    AppMethodBeat.o(129998);
    return bool;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.game.a.c
 * JD-Core Version:    0.6.2
 */