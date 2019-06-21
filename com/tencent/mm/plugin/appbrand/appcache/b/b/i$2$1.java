package com.tencent.mm.plugin.appbrand.appcache.b.b;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.a.a;
import com.tencent.mm.plugin.appbrand.app.f;
import com.tencent.mm.plugin.appbrand.appcache.WxaPkgWrappingInfo;
import com.tencent.mm.plugin.appbrand.appcache.b.e.d;
import com.tencent.mm.plugin.appbrand.launching.n.c;
import com.tencent.mm.protocal.protobuf.arc;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.concurrent.atomic.AtomicBoolean;

final class i$2$1 extends n.c
{
  i$2$1(i.2 param2, boolean paramBoolean, int paramInt, AtomicBoolean paramAtomicBoolean, com.tencent.mm.vending.g.b paramb)
  {
  }

  public final void a(a.a<arc> parama)
  {
    AppMethodBeat.i(129479);
    if (!com.tencent.mm.plugin.appbrand.k.a.b(parama))
      if (!this.gVR)
        break label59;
    label59: for (int i = 50; ; i = 49)
    {
      parama = com.tencent.mm.plugin.appbrand.appcache.b.c.a.gWl;
      com.tencent.mm.plugin.appbrand.appcache.b.c.a.z(this.gVS, i);
      this.gWj.set(true);
      this.gVT.resume();
      AppMethodBeat.o(129479);
      return;
    }
  }

  public final void b(WxaPkgWrappingInfo paramWxaPkgWrappingInfo)
  {
    AppMethodBeat.i(129480);
    com.tencent.mm.plugin.appbrand.appcache.b.d.a locala;
    int i;
    com.tencent.mm.plugin.appbrand.appcache.b.d.b localb;
    if (paramWxaPkgWrappingInfo != null)
    {
      ab.i("MicroMsg.AppBrand.Predownload.GetCodeRetryLogic", "predownload normal pkg succeed, appId[%s], version[%d]", new Object[] { this.gWk.gWi.field_appId, Integer.valueOf(this.gWk.gWi.field_version) });
      ((d)f.E(d.class)).a(this.gWk.gWi, new String[0]);
      locala = (com.tencent.mm.plugin.appbrand.appcache.b.d.a)f.E(com.tencent.mm.plugin.appbrand.appcache.b.d.a.class);
      String str = this.gWk.gWi.field_appId;
      i = this.gWk.gWi.field_version;
      localb = new com.tencent.mm.plugin.appbrand.appcache.b.d.b();
      localb.field_appId = str;
      localb.field_version = i;
      boolean bool = locala.b((com.tencent.mm.sdk.e.c)localb, new String[0]);
      localb.field_source = 1;
      localb.field_hitCount = 0;
      if (bool)
        locala.c((com.tencent.mm.sdk.e.c)localb, new String[0]);
    }
    while (this.gWj.get())
    {
      AppMethodBeat.o(129480);
      return;
      locala.b((com.tencent.mm.sdk.e.c)localb);
      continue;
      ab.e("MicroMsg.AppBrand.Predownload.GetCodeRetryLogic", "predownload normal pkg failed, appId[%s], version[%d]", new Object[] { this.gWk.gWi.field_appId, Integer.valueOf(this.gWk.gWi.field_version) });
    }
    if (paramWxaPkgWrappingInfo != null)
      if (this.gVR)
        i = 52;
    while (true)
    {
      paramWxaPkgWrappingInfo = com.tencent.mm.plugin.appbrand.appcache.b.c.a.gWl;
      com.tencent.mm.plugin.appbrand.appcache.b.c.a.z(this.gVS, i);
      this.gVT.resume();
      AppMethodBeat.o(129480);
      break;
      i = 47;
      continue;
      if (this.gVR)
        i = 53;
      else
        i = 48;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.appcache.b.b.i.2.1
 * JD-Core Version:    0.6.2
 */