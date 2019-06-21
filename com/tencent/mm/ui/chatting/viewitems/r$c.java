package com.tencent.mm.ui.chatting.viewitems;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.model.v;
import com.tencent.mm.modelappbrand.d;
import com.tencent.mm.modelappbrand.e;
import com.tencent.mm.plugin.appbrand.r.n;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.chatting.d.a;
import com.tencent.mm.ui.l;
import java.lang.ref.WeakReference;

final class r$c
  implements l
{
  private WeakReference<a> zei;

  public final void dxA()
  {
    AppMethodBeat.i(33038);
    if (this.zei == null)
      AppMethodBeat.o(33038);
    while (true)
    {
      return;
      a locala = (a)this.zei.get();
      if (locala != null)
        ((e)com.tencent.mm.kernel.g.K(e.class)).aby().pl(n.bE(locala));
      AppMethodBeat.o(33038);
    }
  }

  public final void dxB()
  {
    AppMethodBeat.i(33039);
    if (this.zei == null)
      AppMethodBeat.o(33039);
    while (true)
    {
      return;
      a locala = (a)this.zei.get();
      if (locala != null)
        ((e)com.tencent.mm.kernel.g.K(e.class)).aby().pk(n.bE(locala));
      AppMethodBeat.o(33039);
    }
  }

  public final void dxC()
  {
    AppMethodBeat.i(33040);
    ab.i("MicroMsg.ChattingLifecycleChangedListener", "onChattingExitAnimStart, then detach DynamicPageView.");
    if (this.zei == null)
      AppMethodBeat.o(33040);
    while (true)
    {
      return;
      a locala = (a)this.zei.get();
      if (locala != null)
      {
        v.Zp().nV(n.bE(locala));
        ((com.tencent.mm.ui.chatting.c.b.g)locala.aF(com.tencent.mm.ui.chatting.c.b.g.class)).b(this);
        ((e)com.tencent.mm.kernel.g.K(e.class)).pm(n.bE(locala));
      }
      AppMethodBeat.o(33040);
    }
  }

  public final void dxD()
  {
  }

  public final void dxx()
  {
  }

  public final void dxy()
  {
  }

  public final void dxz()
  {
  }

  final void k(a parama)
  {
    AppMethodBeat.i(33037);
    this.zei = new WeakReference(parama);
    ((com.tencent.mm.ui.chatting.c.b.g)parama.aF(com.tencent.mm.ui.chatting.c.b.g.class)).a(this);
    AppMethodBeat.o(33037);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.viewitems.r.c
 * JD-Core Version:    0.6.2
 */