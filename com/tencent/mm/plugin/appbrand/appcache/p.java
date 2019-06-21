package com.tencent.mm.plugin.appbrand.appcache;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.appbrand.a.d;
import com.tencent.mm.plugin.appbrand.appcache.a.b.a.a;
import com.tencent.mm.pluginsdk.g.a.c.l;
import com.tencent.mm.pluginsdk.g.a.c.m;
import com.tencent.mm.sdk.platformtools.ab;

public final class p
{
  static int A(String paramString1, String paramString2, String paramString3)
  {
    int i = 1;
    AppMethodBeat.i(59441);
    try
    {
      int j = WABSPatch.bspatch(paramString1, paramString2, paramString3);
      i = j;
      AppMethodBeat.o(59441);
      return i;
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.e("MicroMsg.AppBrand.IncrementalPkgLogic[incremental]", "mergeDiffPkg e = %s, old[%s], new[%s], diff[%s]", new Object[] { localException, paramString1, paramString2, paramString3 });
        AppMethodBeat.o(59441);
      }
    }
  }

  static void a(al paramal, m paramm, z.a parama)
  {
    AppMethodBeat.i(59440);
    ab.e("MicroMsg.AppBrand.IncrementalPkgLogic[incremental]", "onIncrementalPkgDownloadFail, request(%s %d->%d)", new Object[] { paramal.appId, Integer.valueOf(paramal.gTP), Integer.valueOf(paramal.gTQ) });
    parama.a(paramm);
    paramm = ((d)g.K(d.class)).xF();
    if (paramm == null)
    {
      ab.e("MicroMsg.AppBrand.IncrementalPkgLogic[incremental]", "onIncrementalPkgDownloadFail, before fallback full_pkg, nil storage");
      az.a(paramal.vdC, paramal.appId, b.a.a.gVH, null);
      AppMethodBeat.o(59440);
    }
    while (true)
    {
      return;
      az.xJ(paramal.vdC);
      paramm = paramm.a(paramal.appId, paramal.gTQ, 0, new String[] { "downloadURL" });
      if (paramm == null)
      {
        ab.e("MicroMsg.AppBrand.IncrementalPkgLogic[incremental]", "onIncrementalPkgDownloadFail, before fallback full_pkg, nil record(%s %d)", new Object[] { paramal.appId, Integer.valueOf(paramal.gTQ) });
        AppMethodBeat.o(59440);
      }
      else
      {
        az.b(paramal.appId, 0, paramal.gTQ, paramm.field_downloadURL, paramal.gTR);
        AppMethodBeat.o(59440);
      }
    }
  }

  public static boolean a(String paramString1, int paramInt1, int paramInt2, String paramString2, az.a parama)
  {
    AppMethodBeat.i(59439);
    boolean bool = az.a(new al(paramString1, paramInt1, paramInt2, paramString2, parama), parama);
    AppMethodBeat.o(59439);
    return bool;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.appcache.p
 * JD-Core Version:    0.6.2
 */