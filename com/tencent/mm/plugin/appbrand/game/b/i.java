package com.tencent.mm.plugin.appbrand.game.b;

import android.os.HandlerThread;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.app.f;
import com.tencent.mm.plugin.appbrand.appusage.AppBrandRecentTaskInfo;
import com.tencent.mm.plugin.appbrand.appusage.w;
import com.tencent.mm.plugin.appbrand.config.p;
import com.tencent.mm.plugin.appbrand.game.b.a.a;
import com.tencent.mm.plugin.appbrand.game.b.a.b;
import com.tencent.mm.plugin.appbrand.game.b.a.c;
import com.tencent.mm.plugin.appbrand.s.e;
import com.tencent.mm.sdk.e.k.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

 enum i
{
  private static k.a hrj;
  private static k.a hrk;

  static
  {
    AppMethodBeat.i(130107);
    hrl = new i[0];
    hrj = new i.1();
    hrk = new i.2();
    AppMethodBeat.o(130107);
  }

  public static b As(String paramString)
  {
    AppMethodBeat.i(130102);
    if (f.avb() != null)
    {
      paramString = f.avb().As(paramString);
      AppMethodBeat.o(130102);
    }
    while (true)
    {
      return paramString;
      paramString = null;
      AppMethodBeat.o(130102);
    }
  }

  public static AppBrandRecentTaskInfo At(String paramString)
  {
    AppMethodBeat.i(130103);
    if (f.auT() == null)
    {
      paramString = null;
      AppMethodBeat.o(130103);
    }
    while (true)
    {
      return paramString;
      paramString = f.auT().yw(paramString);
      AppMethodBeat.o(130103);
    }
  }

  private static a a(AppBrandRecentTaskInfo paramAppBrandRecentTaskInfo)
  {
    AppMethodBeat.i(130104);
    if (paramAppBrandRecentTaskInfo == null)
    {
      paramAppBrandRecentTaskInfo = null;
      AppMethodBeat.o(130104);
    }
    while (true)
    {
      return paramAppBrandRecentTaskInfo;
      a locala = new a();
      locala.euD = paramAppBrandRecentTaskInfo.euD;
      locala.fKh = paramAppBrandRecentTaskInfo.appId;
      locala.ncH = paramAppBrandRecentTaskInfo.appName;
      locala.IconUrl = paramAppBrandRecentTaskInfo.hac;
      locala.jBB = paramAppBrandRecentTaskInfo.csl;
      locala.gVs = paramAppBrandRecentTaskInfo.gVs;
      AppMethodBeat.o(130104);
      paramAppBrandRecentTaskInfo = locala;
    }
  }

  public static List<b> aAG()
  {
    AppMethodBeat.i(130101);
    Object localObject1;
    if (f.avb() == null)
    {
      localObject1 = null;
      AppMethodBeat.o(130101);
    }
    while (true)
    {
      return localObject1;
      localObject1 = new LinkedList();
      if (f.auT() != null)
      {
        localObject2 = f.auT().axJ();
        if (!bo.ek((List)localObject2))
          ((List)localObject1).addAll((Collection)localObject2);
      }
      Object localObject2 = ((List)localObject1).iterator();
      while (((Iterator)localObject2).hasNext())
        if (!((AppBrandRecentTaskInfo)((Iterator)localObject2).next()).xy())
          ((Iterator)localObject2).remove();
      if (!bo.ek((List)localObject1))
      {
        localObject2 = new ArrayList();
        localObject1 = ((List)localObject1).iterator();
        while (((Iterator)localObject1).hasNext())
          ((List)localObject2).add(a((AppBrandRecentTaskInfo)((Iterator)localObject1).next()));
        f.avb().b((List)localObject2, false);
        ab.i("MicroMsg.SearchMiniGameQueryLogic", "AppBrandRecentTaskInfo convert to MiniGameStorage, size:%d", new Object[] { Integer.valueOf(((List)localObject2).size()) });
      }
      ab.i("MicroMsg.SearchMiniGameQueryLogic", "updateMiniGameList");
      localObject1 = f.avb().aAH();
      AppMethodBeat.o(130101);
    }
  }

  public static void e(k.a parama)
  {
    AppMethodBeat.i(130099);
    if (f.avb() != null)
      f.avb().c(parama);
    AppMethodBeat.o(130099);
  }

  public static void f(k.a parama)
  {
    AppMethodBeat.i(130100);
    if (f.avb() != null)
      f.avb().d(parama);
    AppMethodBeat.o(130100);
  }

  public static void onCreate()
  {
    AppMethodBeat.i(130097);
    p.ayH().a(hrj, e.aNS().oAl.getLooper());
    if (f.auT() != null)
      f.auT().c(hrk);
    AppMethodBeat.o(130097);
  }

  public static void onDestroy()
  {
    AppMethodBeat.i(130098);
    p.ayH().d(hrj);
    if (f.auT() != null)
      f.auT().d(hrk);
    AppMethodBeat.o(130098);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.game.b.i
 * JD-Core Version:    0.6.2
 */