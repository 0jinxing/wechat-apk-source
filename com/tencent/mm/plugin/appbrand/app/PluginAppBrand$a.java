package com.tencent.mm.plugin.appbrand.app;

import android.content.Context;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.a.b.a.a;
import com.tencent.mm.kernel.e.c;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.bz;
import com.tencent.mm.model.q;
import com.tencent.mm.plugin.appbrand.appusage.af;
import com.tencent.mm.plugin.appbrand.appusage.ag;
import com.tencent.mm.plugin.appbrand.debugger.j;
import com.tencent.mm.plugin.fts.a.n;
import com.tencent.mm.sdk.platformtools.ah;
import java.io.File;

final class PluginAppBrand$a extends q
  implements com.tencent.mm.kernel.a.b.b
{
  private com.tencent.mm.plugin.appbrand.jsapi.appdownload.a gQZ;
  private final com.tencent.mm.sdk.b.c gRa;
  private j gRb;

  PluginAppBrand$a()
  {
    super(f.class);
    AppMethodBeat.i(129222);
    this.gRa = new PluginAppBrand.a.1(this);
    this.gRb = new j();
    AppMethodBeat.o(129222);
  }

  public final void onAccountInitialized(e.c paramc)
  {
    AppMethodBeat.i(129223);
    super.onAccountInitialized(paramc);
    if (com.tencent.mm.sdk.platformtools.f.IS_FLAVOR_RED)
    {
      paramc = new com.tencent.mm.plugin.appbrand.appusage.e();
      if (paramc.kw(com.tencent.mm.protocal.d.vxo))
        paramc.transfer(com.tencent.mm.protocal.d.vxo);
    }
    g.a(com.tencent.mm.plugin.appbrand.appusage.c.class, new com.tencent.mm.kernel.c.e(new com.tencent.mm.plugin.appbrand.appusage.c()));
    com.tencent.mm.plugin.appbrand.dynamic.widget.b.initialize();
    ((com.tencent.mm.plugin.messenger.a.e)g.K(com.tencent.mm.plugin.messenger.a.e.class)).a("link_view_wxapp", new com.tencent.mm.plugin.appbrand.i.d());
    ((com.tencent.mm.plugin.messenger.a.e)g.K(com.tencent.mm.plugin.messenger.a.e.class)).a("link_view_wxapp", new com.tencent.mm.plugin.appbrand.i.c());
    g.a(com.tencent.mm.plugin.appbrand.a.b.class, new com.tencent.mm.kernel.c.e(com.tencent.mm.plugin.appbrand.appcache.t.gTk));
    g.a(ag.class, new com.tencent.mm.kernel.c.e(new com.tencent.mm.plugin.appbrand.appusage.p()));
    g.a(af.class, new com.tencent.mm.kernel.c.e(new com.tencent.mm.plugin.appbrand.appusage.f()));
    g.a(com.tencent.mm.plugin.appbrand.widget.recentview.d.class, new com.tencent.mm.kernel.c.e(new com.tencent.mm.plugin.appbrand.widget.b()));
    g.a(com.tencent.mm.modelappbrand.b.a.class, new com.tencent.mm.kernel.c.e(com.tencent.mm.plugin.appbrand.t.auu()));
    g.a(com.tencent.mm.plugin.appbrand.backgroundfetch.h.class, new com.tencent.mm.kernel.c.e(new com.tencent.mm.plugin.appbrand.backgroundfetch.e()));
    g.a(com.tencent.mm.plugin.appbrand.service.h.class, new com.tencent.mm.kernel.c.e(new com.tencent.mm.plugin.appbrand.appcache.b.c()));
    com.tencent.mm.vfs.e.N(ah.getContext().getFilesDir().getParent() + File.separator + "voice_split_joint/", true);
    ((com.tencent.mm.plugin.messenger.foundation.a.p)g.M(com.tencent.mm.plugin.messenger.foundation.a.p.class)).getSysCmdMsgExtension().a("WeAppSyncCommand", com.tencent.mm.plugin.appbrand.appcache.b.e.gVO);
    ((com.tencent.mm.plugin.messenger.foundation.a.p)g.M(com.tencent.mm.plugin.messenger.foundation.a.p.class)).getSysCmdMsgExtension().a("subscribesysmsg", com.tencent.mm.plugin.appbrand.i.b.int);
    ((com.tencent.mm.plugin.messenger.foundation.a.p)g.M(com.tencent.mm.plugin.messenger.foundation.a.p.class)).getSysCmdMsgExtension().a("WeAppPushCommand", com.tencent.mm.plugin.appbrand.i.f.inF);
    this.gQZ = new com.tencent.mm.plugin.appbrand.jsapi.appdownload.a();
    com.tencent.mm.plugin.downloader.model.d.bij();
    com.tencent.mm.plugin.downloader.model.b.a(this.gQZ);
    ((com.tencent.mm.plugin.messenger.foundation.a.p)g.M(com.tencent.mm.plugin.messenger.foundation.a.p.class)).getSysCmdMsgExtension().a("DebugAppCodeUpdated", this.gRb);
    AppMethodBeat.o(129223);
  }

  public final void onAccountRelease()
  {
    AppMethodBeat.i(129225);
    g.L(ag.class);
    g.L(af.class);
    g.L(com.tencent.mm.plugin.appbrand.widget.recentview.d.class);
    g.L(com.tencent.mm.plugin.appbrand.backgroundfetch.h.class);
    g.L(com.tencent.mm.plugin.appbrand.appusage.c.class);
    super.onAccountRelease();
    ((com.tencent.mm.plugin.messenger.a.e)g.K(com.tencent.mm.plugin.messenger.a.e.class)).QB("link_view_wxapp");
    ((com.tencent.mm.plugin.messenger.a.e)g.K(com.tencent.mm.plugin.messenger.a.e.class)).QC("link_view_wxapp");
    ((com.tencent.mm.plugin.messenger.foundation.a.p)g.M(com.tencent.mm.plugin.messenger.foundation.a.p.class)).getSysCmdMsgExtension().b("WeAppSyncCommand", com.tencent.mm.plugin.appbrand.appcache.b.e.gVO);
    ((com.tencent.mm.plugin.messenger.foundation.a.p)g.M(com.tencent.mm.plugin.messenger.foundation.a.p.class)).getSysCmdMsgExtension().b("subscribesysmsg", com.tencent.mm.plugin.appbrand.i.b.int);
    com.tencent.mm.plugin.downloader.model.d.bij();
    com.tencent.mm.plugin.downloader.model.b.b(this.gQZ);
    ((com.tencent.mm.plugin.messenger.foundation.a.p)g.M(com.tencent.mm.plugin.messenger.foundation.a.p.class)).getSysCmdMsgExtension().b("DebugAppCodeUpdated", this.gRb);
    AppMethodBeat.o(129225);
  }

  public final void parallelsDependency()
  {
    AppMethodBeat.i(129224);
    com.tencent.mm.kernel.a.b.a.a(this, com.tencent.mm.kernel.api.c.class).aJ(g.M(n.class));
    com.tencent.mm.kernel.a.b.a.a(this, com.tencent.mm.kernel.api.c.class).aJ(g.M(com.tencent.mm.plugin.appbrand.a.c.class));
    AppMethodBeat.o(129224);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.app.PluginAppBrand.a
 * JD-Core Version:    0.6.2
 */