package com.tencent.mm.plugin.appbrand.luggage.export.functionalpage;

import a.v;
import android.app.Activity;
import android.util.SparseArray;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.backgroundfetch.f;
import com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC;
import com.tencent.mm.plugin.appbrand.config.AppBrandLaunchReferrer;
import com.tencent.mm.plugin.appbrand.j.a.c;
import com.tencent.mm.plugin.appbrand.jsapi.l;
import com.tencent.mm.plugin.appbrand.o;
import com.tencent.mm.plugin.appbrand.page.r;
import com.tencent.mm.plugin.appbrand.permission.e;
import com.tencent.mm.plugin.appbrand.task.AppBrandRemoteTaskController;
import com.tencent.mm.plugin.appbrand.ui.q;

public class j extends o
{
  volatile c ikA;
  private volatile e ikz;

  public j(Activity paramActivity, com.tencent.mm.plugin.appbrand.ab paramab)
  {
    super(paramActivity, paramab);
  }

  public final com.tencent.mm.plugin.appbrand.j.a asX()
  {
    AppMethodBeat.i(132149);
    a.c localc = new a.c();
    AppMethodBeat.o(132149);
    return localc;
  }

  public final q ata()
  {
    AppMethodBeat.i(132146);
    g localg = new g(atM());
    AppMethodBeat.o(132146);
    return localg;
  }

  public final void onCreate()
  {
    AppMethodBeat.i(132147);
    atE();
    com.tencent.mm.plugin.appbrand.report.quality.a.o(this);
    a(new j.1(this));
    atF();
    this.gPp.a(this.mAppId, atI().gVs, com.tencent.mm.plugin.appbrand.task.g.c(atI()));
    com.tencent.mm.plugin.appbrand.media.a.a.onCreate(this.mAppId);
    com.tencent.mm.plugin.appbrand.media.record.c.onCreate();
    com.tencent.mm.plugin.appbrand.jsapi.h5_interact.a.k(this);
    f.k(this);
    AppMethodBeat.o(132147);
  }

  public final void onReady()
  {
    AppMethodBeat.i(132148);
    Object localObject1 = this.ikA;
    String str1 = atI().hgF.hgT;
    a.f.b.j.p(str1, "invokeData");
    com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.AppBrand.FunctionalAPIInvokeManager", "performInvoke with appId(" + ((c)localObject1).ikq.mAppId + ") data(" + str1 + ')');
    String str2;
    String str3;
    Object localObject5;
    int i;
    label179: label185: Object localObject4;
    try
    {
      Object localObject2 = new com/tencent/mm/aa/i;
      ((com.tencent.mm.aa.i)localObject2).<init>(str1);
      str1 = ((com.tencent.mm.aa.i)localObject2).optString("name");
      str2 = ((com.tencent.mm.aa.i)localObject2).optString("args");
      str3 = ((com.tencent.mm.aa.i)localObject2).optString("transitiveData");
      localObject5 = (CharSequence)str1;
      if ((localObject5 == null) || (((CharSequence)localObject5).length() == 0))
      {
        i = 1;
        if (i == 0)
        {
          localObject5 = (CharSequence)str2;
          if ((localObject5 != null) && (((CharSequence)localObject5).length() != 0))
            break label179;
        }
      }
      for (i = 1; ; i = 0)
      {
        if (i == 0)
          break label185;
        ((c)localObject1).cy(str3, "fail invalid args");
        AppMethodBeat.o(132148);
        return;
        i = 0;
        break;
      }
      localObject2 = ((com.tencent.mm.aa.i)localObject2).optString("jsapiType");
      if (localObject2 == null)
      {
        ((c)localObject1).cy(str3, "fail invalid args");
        localObject2 = new java/lang/RuntimeException;
        ((RuntimeException)localObject2).<init>();
        localObject2 = (Throwable)localObject2;
        AppMethodBeat.o(132148);
        throw ((Throwable)localObject2);
      }
    }
    catch (com.tencent.mm.aa.g localg)
    {
      do
        while (true)
        {
          com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.AppBrand.FunctionalAPIInvokeManager", "performInvoke, json parse e = ".concat(String.valueOf(localg)));
          AppMethodBeat.o(132148);
          continue;
          switch (localg.hashCode())
          {
          default:
          case 1224424441:
          case 1452004724:
          }
        }
      while (!localg.equals("webview"));
      Object localObject3 = ((c)localObject1).ikq.atJ();
      a.f.b.j.o(localObject3, "runtime.pageContainer");
      localObject3 = ((r)localObject3).getPageView();
      if (localObject3 == null)
      {
        localObject3 = new a/v;
        ((v)localObject3).<init>("null cannot be cast to non-null type com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.FunctionalPageView");
        AppMethodBeat.o(132148);
        throw ((Throwable)localObject3);
      }
    }
    catch (RuntimeException localRuntimeException)
    {
      do
        while (true)
          AppMethodBeat.o(132148);
      while (!localRuntimeException.equals("appservice"));
      localObject4 = ((c)localObject1).ikq.atK();
      if (localObject4 == null)
      {
        localObject4 = new a/v;
        ((v)localObject4).<init>("null cannot be cast to non-null type com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.FunctionalAppService");
        AppMethodBeat.o(132148);
        throw ((Throwable)localObject4);
      }
      localObject4 = (m)localObject4;
    }
    while (true)
    {
      ((c)localObject1).iko += 1;
      i = ((c)localObject1).iko;
      localObject1 = ((c)localObject1).ikp;
      localObject5 = new com/tencent/mm/plugin/appbrand/luggage/export/functionalpage/n;
      ((n)localObject5).<init>(str3);
      ((SparseArray)localObject1).put(i, localObject5);
      ((m)localObject4).aHR().invokeHandler(str1, str2, i);
      AppMethodBeat.o(132148);
      break;
      localObject4 = (m)localObject4;
    }
  }

  public final e xY()
  {
    return this.ikz;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.j
 * JD-Core Version:    0.6.2
 */