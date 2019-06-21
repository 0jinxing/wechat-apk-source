package com.tencent.mm.plugin.appbrand.appcache;

import android.os.HandlerThread;
import android.os.SystemClock;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.appbrand.a.d;
import com.tencent.mm.plugin.appbrand.appcache.a.b.a.a;
import com.tencent.mm.pluginsdk.g.a.c.c;
import com.tencent.mm.pluginsdk.g.a.c.m;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;

final class ap$d
  implements c
{
  final ak gUz;

  ap$d(ap paramap)
  {
    AppMethodBeat.i(59500);
    this.gUz = new ak(new com.tencent.mm.sdk.platformtools.al("WxaPkgDownloadPerformerEventDispatchThread").oAl.getLooper());
    AppMethodBeat.o(59500);
  }

  private static void a(ap.c paramc, m paramm)
  {
    AppMethodBeat.i(59506);
    com.tencent.mm.vfs.e.deleteFile(paramm.filePath);
    if ((paramc.avZ() instanceof l))
    {
      k.gSx.a((l)paramc.avZ(), paramm);
      AppMethodBeat.o(59506);
    }
    while (true)
    {
      return;
      if ((paramc.avZ() instanceof al))
      {
        p.a((al)paramc.avZ(), paramm, paramc.gUy);
        AppMethodBeat.o(59506);
      }
      else
      {
        if (!(paramc.avZ() instanceof bc))
          break;
        bd.a((bc)paramc.avZ(), paramm, paramc.gUy);
        AppMethodBeat.o(59506);
      }
    }
    String str = paramc.avZ().appId;
    if ((paramm.vfo instanceof com.tencent.mm.pluginsdk.g.a.b.a))
      paramc = b.a.a.gVG;
    while (true)
    {
      az.a(paramm.vdC, str, paramc);
      AppMethodBeat.o(59506);
      break;
      switch (paramm.httpStatusCode)
      {
      default:
        paramc = b.a.a.gVB;
        break;
      case 403:
      case 404:
        paramc = b.a.a.gVF;
      }
    }
  }

  public static void b(com.tencent.mm.pluginsdk.g.a.c.e parame, m paramm)
  {
    AppMethodBeat.i(59502);
    a((ap.c)parame, paramm);
    AppMethodBeat.o(59502);
  }

  public static void c(com.tencent.mm.pluginsdk.g.a.c.e parame, m paramm)
  {
    AppMethodBeat.i(59503);
    Object localObject1 = ((ap.c)parame).avZ();
    if ((localObject1 instanceof al))
    {
      paramm = (al)localObject1;
      parame = ((ap.c)parame).gUy;
      localObject1 = ((d)g.K(d.class)).xF();
      if (localObject1 == null)
      {
        az.a(paramm.vdC, paramm.appId, b.a.a.gVH, null);
        AppMethodBeat.o(59503);
      }
    }
    while (true)
    {
      return;
      Object localObject2 = paramm.appId;
      int i = paramm.gTP;
      int j = paramm.gTQ;
      String str = paramm.avR();
      at localat = ((ax)localObject1).a((String)localObject2, i, 0, new String[] { "pkgPath" });
      localObject2 = ((ax)localObject1).a((String)localObject2, j, 0, new String[] { "versionMd5" });
      if ((localat == null) || (localObject2 == null))
      {
        az.a(paramm.vdC, paramm.appId, b.a.a.gVH, null);
        AppMethodBeat.o(59503);
      }
      else
      {
        parame.avs();
        long l1 = SystemClock.elapsedRealtime();
        i = p.A(localat.field_pkgPath, str, paramm.getFilePath());
        long l2 = SystemClock.elapsedRealtime();
        ab.i("MicroMsg.AppBrand.IncrementalPkgLogic[incremental]", "applyPkgPatch, appId[%s], oldPath[%s], newPath[%s], patchPath[%s], cost %d, ret %d", new Object[] { paramm.appId, localat.field_pkgPath, str, paramm.getFilePath(), Long.valueOf(l2 - l1), Integer.valueOf(i) });
        parame.nq(i);
        if (i == 0)
        {
          az.a(paramm.vdC, paramm.appId, str, j, 0, parame);
          AppMethodBeat.o(59503);
        }
        else
        {
          com.tencent.mm.vfs.e.deleteFile(str);
          parame = ((ax)localObject1).a(paramm.appId, paramm.gTQ, 0, new String[] { "downloadURL" });
          if (parame == null)
          {
            az.a(paramm.vdC, paramm.appId, b.a.a.gVH, null);
            AppMethodBeat.o(59503);
          }
          else
          {
            az.xJ(paramm.vdC);
            az.b(paramm.appId, 0, paramm.gTQ, parame.field_downloadURL, paramm.gTR);
            AppMethodBeat.o(59503);
            continue;
            if ((localObject1 instanceof bc))
            {
              paramm = (bc)localObject1;
              parame = ((ap.c)parame).gUy;
              localObject1 = ((d)g.K(d.class)).xF();
              if (localObject1 == null)
              {
                az.a(paramm.vdC, paramm.appId, b.a.a.gVH, null);
                AppMethodBeat.o(59503);
              }
              else
              {
                parame.avv();
                boolean bool = bd.a(paramm);
                parame.dA(bool);
                ab.i("MicroMsg.AppBrand.ZstdLogic", "processZstd suc:%b", new Object[] { Boolean.valueOf(bool) });
                if (bool)
                {
                  az.a(paramm.vdC, paramm.appId, paramm.aws(), paramm.gVu, paramm.cBc, parame);
                  AppMethodBeat.o(59503);
                }
                else
                {
                  com.tencent.mm.vfs.e.deleteFile(paramm.aws());
                  parame = ((ax)localObject1).a(paramm.appId, paramm.gVu, paramm.cBc, new String[] { "downloadURL" });
                  if (parame == null)
                  {
                    az.a(paramm.vdC, paramm.appId, b.a.a.gVH, null);
                    AppMethodBeat.o(59503);
                  }
                  else
                  {
                    az.xJ(paramm.vdC);
                    az.b(paramm.appId, paramm.cBc, paramm.gVu, parame.field_downloadURL, paramm.gTR);
                    AppMethodBeat.o(59503);
                  }
                }
              }
            }
            else if ((localObject1 instanceof l))
            {
              k.gSx.a((l)localObject1, paramm);
              AppMethodBeat.o(59503);
            }
            else
            {
              localObject1 = ((ap.c)parame).avZ().appId;
              j = ((ap.c)parame).avZ().version;
              i = ((ap.c)parame).avZ().cBc;
              try
              {
                az.a(paramm.vdC, (String)localObject1, paramm.filePath, j, i, ((ap.c)parame).gUy);
                AppMethodBeat.o(59503);
              }
              catch (Exception parame)
              {
                ab.printErrStackTrace("MicroMsg.AppBrandWxaPkgDownloadPerformer", parame, "dispatchComplete", new Object[0]);
                az.br(paramm.vdC, (String)localObject1);
                AppMethodBeat.o(59503);
              }
            }
          }
        }
      }
    }
  }

  public static void d(com.tencent.mm.pluginsdk.g.a.c.e parame, m paramm)
  {
    AppMethodBeat.i(59504);
    a((ap.c)parame, paramm);
    AppMethodBeat.o(59504);
  }

  public final void a(com.tencent.mm.pluginsdk.g.a.c.e parame, m paramm)
  {
    AppMethodBeat.i(59501);
    this.gUz.post(new ap.d.1(this, paramm, parame));
    AppMethodBeat.o(59501);
  }

  public final void a(String paramString, com.tencent.mm.pluginsdk.g.a.c.k paramk)
  {
    AppMethodBeat.i(59505);
    az.a(paramString, (WxaPkgLoadProgress)paramk);
    AppMethodBeat.o(59505);
  }

  public final void u(String paramString, int paramInt1, int paramInt2)
  {
  }

  public final void w(String paramString, long paramLong)
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.appcache.ap.d
 * JD-Core Version:    0.6.2
 */