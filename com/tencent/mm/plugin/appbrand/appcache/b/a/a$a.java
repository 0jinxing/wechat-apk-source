package com.tencent.mm.plugin.appbrand.appcache.b.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.appcache.a.b.a;
import com.tencent.mm.plugin.appbrand.appcache.a.b.a.a;
import com.tencent.mm.plugin.appbrand.appcache.ap;
import com.tencent.mm.plugin.appbrand.appcache.az;
import com.tencent.mm.plugin.appbrand.appcache.k;
import com.tencent.mm.plugin.appbrand.appcache.y;
import com.tencent.mm.plugin.appbrand.r.i;
import com.tencent.mm.protocal.protobuf.arb;
import com.tencent.mm.protocal.protobuf.arc;
import com.tencent.mm.protocal.protobuf.bie;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.vending.g.f;
import com.tencent.mm.vending.j.c;

final class a$a
  implements com.tencent.mm.vending.c.a<Boolean, c<arb, arc>>
{
  private Boolean a(c<arb, arc> paramc)
  {
    AppMethodBeat.i(129457);
    Object localObject1 = (arb)paramc.get(0);
    Object localObject2 = (arc)paramc.get(1);
    Object localObject3;
    if (((arb)localObject1).type == 0)
    {
      paramc = new y(((arb)localObject1).csB);
      localObject3 = f.dMj();
      ((com.tencent.mm.vending.g.b)localObject3).dMi();
      localObject3 = new a.a.1(this, (com.tencent.mm.vending.g.b)localObject3);
      ab.i("MicroMsg.AppBrand.Predownload.ActionGetEncryptPkg.PlainActionDownloadPkg", "%s downloadPkg, patch_url(%s), full_url(%s)", new Object[] { paramc.toString(), ((arc)localObject2).cDL, ((arc)localObject2).url });
      localObject1 = new com.tencent.mm.plugin.appbrand.appcache.l(paramc.toString(), ((arb)localObject1).wuN.wLw, ((arb)localObject1).vOP, ((arc)localObject2).url);
      localObject2 = k.gSx;
      paramc = az.awq();
      if (paramc != null)
        break label231;
      ab.e("MicroMsg.AppBrand.Predownload.EncryptPkgDownloader", "startDownload, null updater");
      ((b.a)localObject3).a(((com.tencent.mm.plugin.appbrand.appcache.l)localObject1).appId, b.a.a.gVH, null);
    }
    while (true)
    {
      paramc = Boolean.FALSE;
      AppMethodBeat.o(129457);
      return paramc;
      if (((arb)localObject1).type == 4)
      {
        paramc = new y(((arb)localObject1).csB, ((arb)localObject1).wsY);
        break;
      }
      paramc = new IllegalArgumentException(String.format("not support request.type %d", new Object[] { Integer.valueOf(((arb)localObject1).type) }));
      AppMethodBeat.o(129457);
      throw paramc;
      label231: int i = paramc.gVr.b((com.tencent.mm.plugin.appbrand.appcache.a.a)localObject1);
      ab.i("MicroMsg.AppBrand.Predownload.EncryptPkgDownloader", "startDownload, addRequest(%s) ret = %d", new Object[] { ((com.tencent.mm.plugin.appbrand.appcache.l)localObject1).toShortString(), Integer.valueOf(i) });
      switch (i)
      {
      default:
        ((k)localObject2).gSy.f(((com.tencent.mm.pluginsdk.g.a.c.l)localObject1).vdC, localObject3);
        break;
      case 4:
        ((b.a)localObject3).a(((com.tencent.mm.plugin.appbrand.appcache.l)localObject1).appId, b.a.a.gVH, null);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.appcache.b.a.a.a
 * JD-Core Version:    0.6.2
 */