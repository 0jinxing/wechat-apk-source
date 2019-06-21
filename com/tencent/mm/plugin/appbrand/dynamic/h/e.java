package com.tencent.mm.plugin.appbrand.dynamic.h;

import android.content.Context;
import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.b.a.ad;
import com.tencent.mm.modelappbrand.u;
import com.tencent.mm.modelappbrand.v;
import com.tencent.mm.plugin.appbrand.appcache.an;
import com.tencent.mm.plugin.appbrand.dynamic.WxaWidgetContext;
import com.tencent.mm.plugin.appbrand.dynamic.d.p;
import com.tencent.mm.plugin.appbrand.dynamic.debugger.DebuggerInfo;
import com.tencent.mm.plugin.appbrand.dynamic.launching.WidgetRuntimeConfig;
import com.tencent.mm.plugin.appbrand.dynamic.launching.WidgetSysConfig;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.at;
import com.tencent.mm.sdk.platformtools.bo;
import org.json.JSONObject;

public class e
{
  private static volatile com.tencent.mm.z.c.e hoH;
  private static volatile DebuggerInfo hoI;

  private static void G(Runnable paramRunnable)
  {
    AppMethodBeat.i(10967);
    paramRunnable = new e.1(paramRunnable);
    if (al.isMainThread())
    {
      paramRunnable.run();
      AppMethodBeat.o(10967);
    }
    while (true)
    {
      return;
      al.d(paramRunnable);
      AppMethodBeat.o(10967);
    }
  }

  private static com.tencent.mm.z.b.d a(com.tencent.mm.z.c.e parame)
  {
    AppMethodBeat.i(10970);
    parame = com.tencent.mm.plugin.appbrand.dynamic.e.b.bt(parame);
    h.pYm.a(639L, 2L, 1L, false);
    ab.i("MicroMsg.PreloadOptimizer", "Using v8 Javascript Engine");
    h.pYm.a(639L, 0L, 1L, false);
    AppMethodBeat.o(10970);
    return parame;
  }

  public static com.tencent.mm.z.c.e a(Context paramContext, WxaWidgetContext paramWxaWidgetContext, com.tencent.mm.z.d.a parama, Bundle paramBundle)
  {
    AppMethodBeat.i(10966);
    label702: label705: 
    while (true)
    {
      try
      {
        com.tencent.mm.z.c.e locale = hoH;
        hoH = null;
        if (locale != null)
        {
          bool = true;
          u.i("MicroMsg.PreloadOptimizer", "hit preloaded jsBridge %b", new Object[] { Boolean.valueOf(bool) });
          if (locale != null)
            break label705;
          locale = aAf();
          int i = paramBundle.getInt("widget_type");
          Object localObject = new com.tencent.mm.plugin.appbrand.dynamic.d.a.c();
          ((com.tencent.mm.plugin.appbrand.dynamic.d.a.c)localObject).eIq = paramWxaWidgetContext.getId();
          if (i == 1)
            ((com.tencent.mm.plugin.appbrand.dynamic.d.a.c)localObject).hnl = new com.tencent.mm.plugin.appbrand.dynamic.i.c(paramWxaWidgetContext.getAppId(), paramBundle.getString("search_id"));
          paramBundle = new com.tencent.mm.z.c.c(paramContext, locale, parama, (com.tencent.mm.z.c.b)localObject);
          paramBundle.eIj = p.nM(i);
          locale.eIr = paramBundle;
          paramBundle = locale.eIt;
          locale.eIs = new com.tencent.mm.z.c.f(paramBundle, com.tencent.mm.plugin.appbrand.dynamic.f.a.nN(i), parama);
          locale.eIv = com.tencent.mm.plugin.appbrand.dynamic.debugger.a.azQ();
          localObject = paramWxaWidgetContext.azM();
          JSONObject localJSONObject = new JSONObject();
          a(localJSONObject, "widgetType", Integer.valueOf(((WidgetRuntimeConfig)localObject).hog));
          a(localJSONObject, "platform", "android");
          a(localJSONObject, "debug", Boolean.valueOf(paramWxaWidgetContext.azK().hmD));
          if (paramWxaWidgetContext.azL() != null)
            a(localJSONObject, "drawMinInterval", Integer.valueOf(paramWxaWidgetContext.azL().hfW));
          a(localJSONObject, "clientVersion", Integer.valueOf(com.tencent.mm.protocal.d.vxo));
          parama = new JSONObject();
          a(parama, "drawMinInterval", Integer.valueOf(((WidgetRuntimeConfig)localObject).hox));
          a(parama, "timerEnabled", Boolean.valueOf(((WidgetRuntimeConfig)localObject).hoy));
          a(parama, "drawLock", Boolean.valueOf(((WidgetRuntimeConfig)localObject).hoz));
          parama = String.format("var __widgetConfig__ = %s;var __wxConfig = %s;var __wxIndexPage = \"%s\"", new Object[] { parama.toString(), localJSONObject.toString(), "" });
          paramBundle.evaluateJavascript(parama, null);
          ab.v("MicroMsg.PreloadOptimizer", "injectConfig(%s, %s)", new Object[] { paramWxaWidgetContext.getId(), parama });
          v.kT(10);
          parama = new ad().eZ(u.pr(paramWxaWidgetContext.getId()));
          parama.cYw = u.pq(paramWxaWidgetContext.getId());
          parama.cYs = 5L;
          parama = parama.eY(paramWxaWidgetContext.getId());
          parama.cYt = System.currentTimeMillis();
          parama.fa(at.gB(ah.getContext())).ajK();
          parama = com.tencent.mm.plugin.appbrand.dynamic.j.c.bR(paramWxaWidgetContext.getId(), "WAWidget.js");
          if (!bo.isNullOrNil(parama))
            break label702;
          u.i("MicroMsg.PreloadOptimizer", "read WAWidget.js", new Object[0]);
          parama = com.tencent.mm.plugin.appbrand.r.d.convertStreamToString(an.openRead("WAWidget.js"));
          if (bo.isNullOrNil(parama))
            ab.e("MicroMsg.PreloadOptimizer", "get Null Or Nil widget js");
          h.pYm.a(636L, 0L, 1L, false);
          com.tencent.mm.z.a.a(paramBundle, parama, new e.3(paramWxaWidgetContext));
          ab.v("MicroMsg.PreloadOptimizer", "injectWAWidget(%s)", new Object[] { paramWxaWidgetContext.getId() });
          v.kT(13);
          parama = com.tencent.mm.plugin.appbrand.dynamic.j.c.bR(paramWxaWidgetContext.getId(), "widget.js");
          if (bo.isNullOrNil(parama))
          {
            ab.e("MicroMsg.PreloadOptimizer", "get Null Or Nil widget js");
            com.tencent.mm.plugin.appbrand.dynamic.f.azA().aZ(paramWxaWidgetContext.getId(), 2102);
          }
          h.pYm.a(636L, 3L, 1L, false);
          com.tencent.mm.z.a.a(paramBundle, parama, new e.4(paramWxaWidgetContext));
          ab.v("MicroMsg.PreloadOptimizer", "injectWidget(%s)", new Object[] { paramWxaWidgetContext.getId() });
          cC(paramContext);
          AppMethodBeat.o(10966);
          return locale;
        }
      }
      finally
      {
        AppMethodBeat.o(10966);
      }
      boolean bool = false;
      continue;
    }
  }

  private static void a(JSONObject paramJSONObject, String paramString, Object paramObject)
  {
    AppMethodBeat.i(10971);
    try
    {
      paramJSONObject.put(paramString, paramObject);
      AppMethodBeat.o(10971);
      return;
    }
    catch (Exception paramJSONObject)
    {
      while (true)
      {
        ab.e("MicroMsg.PreloadOptimizer", "put env arguments error, %s", new Object[] { paramJSONObject });
        AppMethodBeat.o(10971);
      }
    }
  }

  private static com.tencent.mm.z.c.e aAf()
  {
    AppMethodBeat.i(10969);
    com.tencent.mm.z.c.e locale = new com.tencent.mm.z.c.e();
    locale.a(a(locale));
    AppMethodBeat.o(10969);
    return locale;
  }

  public static void cC(Context paramContext)
  {
    AppMethodBeat.i(10968);
    G(new e.2(paramContext));
    AppMethodBeat.o(10968);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.dynamic.h.e
 * JD-Core Version:    0.6.2
 */