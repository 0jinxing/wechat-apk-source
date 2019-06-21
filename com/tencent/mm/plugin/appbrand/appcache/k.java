package com.tencent.mm.plugin.appbrand.appcache;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.appbrand.a.d;
import com.tencent.mm.plugin.appbrand.appcache.a.b;
import com.tencent.mm.plugin.appbrand.appcache.a.b.a;
import com.tencent.mm.plugin.appbrand.appcache.a.b.a.a;
import com.tencent.mm.plugin.appbrand.r.i;
import com.tencent.mm.pluginsdk.g.a.b.a;
import com.tencent.mm.pluginsdk.g.a.c.m;
import com.tencent.mm.sdk.e.c;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.Iterator;
import java.util.Set;

public enum k
  implements b<l, m, com.tencent.mm.pluginsdk.g.a.c.k>
{
  public final i<String, b.a<m, com.tencent.mm.pluginsdk.g.a.c.k>> gSy;

  static
  {
    AppMethodBeat.i(59435);
    gSx = new k("INSTANCE");
    gSz = new k[] { gSx };
    AppMethodBeat.o(59435);
  }

  private k()
  {
    AppMethodBeat.i(59433);
    this.gSy = new i();
    AppMethodBeat.o(59433);
  }

  public final void a(l paraml, m paramm)
  {
    AppMethodBeat.i(59434);
    Object localObject1;
    Object localObject2;
    if (paramm.status == 2)
    {
      localObject1 = ((d)g.K(d.class)).auC();
      if (localObject1 == null)
      {
        ab.e("MicroMsg.AppBrand.Predownload.EncryptPkgDownloader", "onDownloadResult complete, null storage");
        localObject2 = b.a.a.gVH;
      }
    }
    while (true)
    {
      localObject1 = this.gSy.bD(paraml.vdC);
      if (localObject1 == null)
        break;
      localObject1 = ((Set)localObject1).iterator();
      while (((Iterator)localObject1).hasNext())
        ((b.a)((Iterator)localObject1).next()).a(paraml.appId, (b.a.a)localObject2, paramm);
      localObject2 = ((af)localObject1).r(paraml.appId, paraml.gSA, paraml.version);
      if (localObject2 == null)
      {
        ab.e("MicroMsg.AppBrand.Predownload.EncryptPkgDownloader", "onDownloadResult complete, null record with %s", new Object[] { paraml.toShortString() });
        localObject2 = b.a.a.gVH;
      }
      else
      {
        ((ae)localObject2).field_pkgPath = paraml.getFilePath();
        boolean bool = af.a((ae)localObject2);
        ab.i("MicroMsg.AppBrand.Predownload.EncryptPkgDownloader", "onDownloadResult complete, integrityOk %b, with %s", new Object[] { Boolean.valueOf(bool), paraml.toShortString() });
        if (bool)
        {
          ((af)localObject1).c((c)localObject2, new String[0]);
          localObject2 = b.a.a.gVA;
        }
        else
        {
          localObject2 = b.a.a.gVD;
          continue;
          ab.e("MicroMsg.AppBrand.Predownload.EncryptPkgDownloader", "onDownloadResult %s", new Object[] { paramm });
          if ((paramm.vfo instanceof a))
            localObject2 = b.a.a.gVG;
          else
            switch (paramm.httpStatusCode)
            {
            default:
              localObject2 = b.a.a.gVB;
              break;
            case 403:
            case 404:
              localObject2 = b.a.a.gVF;
            }
        }
      }
    }
    AppMethodBeat.o(59434);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.appcache.k
 * JD-Core Version:    0.6.2
 */