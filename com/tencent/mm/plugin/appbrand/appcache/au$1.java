package com.tencent.mm.plugin.appbrand.appcache;

import android.database.Cursor;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.appbrand.task.h;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

final class au$1
  implements n
{
  private void awm()
  {
    AppMethodBeat.i(129426);
    Object localObject1 = new File(ap.avY());
    if ((!((File)localObject1).exists()) || (!((File)localObject1).isDirectory()))
      AppMethodBeat.o(129426);
    while (true)
    {
      return;
      for (Object localObject2 : ((File)localObject1).listFiles(new au.1.1(this)))
        if (!com.tencent.mm.plugin.appbrand.app.f.auV().xH(localObject2.getAbsolutePath()))
          n.a.xo(localObject2.getAbsolutePath());
      AppMethodBeat.o(129426);
    }
  }

  public final void run()
  {
    AppMethodBeat.i(129427);
    Object localObject3;
    try
    {
      Object localObject1 = com.tencent.mm.plugin.appbrand.app.f.auV().awo();
      if (!com.tencent.mm.sdk.platformtools.bo.ek((List)localObject1))
      {
        long l = com.tencent.mm.sdk.platformtools.bo.anT();
        localObject3 = ((List)localObject1).iterator();
        while (((Iterator)localObject3).hasNext())
        {
          localObject1 = (at)((Iterator)localObject3).next();
          if ((((at)localObject1).field_endTime > 0L) && (((at)localObject1).field_endTime <= l) && (((at)localObject1).field_debugType == 999))
          {
            n.a.xo(((at)localObject1).field_pkgPath);
            com.tencent.mm.plugin.appbrand.app.f.auV().a((at)localObject1);
            h.bt(((at)localObject1).field_appId, ((at)localObject1).field_debugType);
          }
        }
      }
    }
    catch (Exception localException)
    {
      com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.AppBrand.WxaPkgPruner", "prune running, exp = %s", new Object[] { com.tencent.mm.sdk.platformtools.bo.l(localException) });
      AppMethodBeat.o(129427);
    }
    while (true)
    {
      return;
      if (g.RK())
      {
        localObject3 = com.tencent.mm.plugin.appbrand.app.f.auV();
        Object localObject2 = ((ax)localObject3).gVj.a(String.format("select distinct %s from %s ", new Object[] { "appId", "AppBrandWxaPkgManifestRecord" }), null, 2);
        Object localObject4 = new java/util/ArrayList;
        ((ArrayList)localObject4).<init>();
        while (((Cursor)localObject2).moveToNext())
          ((List)localObject4).add(((Cursor)localObject2).getString(0));
        ((Cursor)localObject2).close();
        if (com.tencent.mm.sdk.platformtools.bo.ek((List)localObject4))
          localObject2 = null;
        while (!com.tencent.mm.sdk.platformtools.bo.ek((List)localObject2))
        {
          localObject2 = ((List)localObject2).iterator();
          while (((Iterator)localObject2).hasNext())
          {
            localObject3 = (at)((Iterator)localObject2).next();
            if ((((at)localObject3).field_appId.indexOf('$') <= 0) && (!h.DS(((at)localObject3).field_appId)))
            {
              n.a.xo(((at)localObject3).field_pkgPath);
              com.tencent.mm.plugin.appbrand.app.f.auV().a((at)localObject3);
              com.tencent.mm.plugin.appbrand.app.f.ava().ao(((at)localObject3).field_appId, ((at)localObject3).field_version);
              localObject4 = new com/tencent/mm/g/b/a/bo;
              ((com.tencent.mm.g.b.a.bo)localObject4).<init>();
              ((com.tencent.mm.g.b.a.bo)localObject4).dcY = 2L;
              localObject3 = ((com.tencent.mm.g.b.a.bo)localObject4).gk(((at)localObject3).field_appId);
              ((com.tencent.mm.g.b.a.bo)localObject3).dda = 0L;
              ((com.tencent.mm.g.b.a.bo)localObject3).ddb = 1L;
              ((com.tencent.mm.g.b.a.bo)localObject3).dcW = 0L;
              ((com.tencent.mm.g.b.a.bo)localObject3).ajK();
            }
          }
          localObject2 = new java/util/LinkedList;
          ((LinkedList)localObject2).<init>();
          localObject4 = ((List)localObject4).iterator();
          while (((Iterator)localObject4).hasNext())
          {
            List localList = ((ax)localObject3).xI((String)((Iterator)localObject4).next());
            if (!com.tencent.mm.sdk.platformtools.bo.ek(localList))
              ((List)localObject2).addAll(localList);
          }
        }
      }
      awm();
      AppMethodBeat.o(129427);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.appcache.au.1
 * JD-Core Version:    0.6.2
 */