package com.tencent.mm.plugin.appbrand.appusage.a;

import a.f.a.a;
import a.f.b.j;
import a.l;
import a.y;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.r.m;
import com.tencent.mm.sdk.platformtools.al;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"runOnWorkThread", "", "action", "Lkotlin/Function0;", "plugin-appbrand-integration_release"})
public final class e
{
  public static final void d(a<y> parama)
  {
    AppMethodBeat.i(134594);
    j.p(parama, "action");
    m.aNS().aa((Runnable)new a(parama));
    AppMethodBeat.o(134594);
  }

  @l(dWo={1, 1, 13}, dWp={""}, dWq={"<anonymous>", "", "run"})
  static final class a
    implements Runnable
  {
    a(a parama)
    {
    }

    public final void run()
    {
      AppMethodBeat.i(134593);
      this.hbA.invoke();
      AppMethodBeat.o(134593);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.appusage.a.e
 * JD-Core Version:    0.6.2
 */