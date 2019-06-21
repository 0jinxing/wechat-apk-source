package com.tencent.mm.plugin.appbrand.dynamic.a;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.View.OnAttachStateChangeListener;
import com.tencent.luggage.g.h;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.modelappbrand.f;
import com.tencent.mm.modelappbrand.l;
import com.tencent.mm.modelappbrand.u;
import com.tencent.mm.modelappbrand.w;
import com.tencent.mm.plugin.appbrand.appcache.z;
import com.tencent.mm.plugin.appbrand.dynamic.WxaWidgetInitializer;
import com.tencent.mm.plugin.appbrand.dynamic.h.a.a;
import com.tencent.mm.plugin.appbrand.dynamic.i;
import com.tencent.mm.plugin.appbrand.dynamic.j.a.1;
import com.tencent.mm.plugin.appbrand.dynamic.widget.IPCDynamicPageView;
import com.tencent.mm.plugin.appbrand.dynamic.widget.IPCDynamicPageView.3;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.ao;
import com.tencent.mm.sdk.platformtools.ao.c;
import java.net.URLDecoder;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import junit.framework.Assert;
import org.json.JSONException;
import org.json.JSONObject;

public final class c
  implements View.OnAttachStateChangeListener, com.tencent.mm.modelappbrand.e, a.a, ao.c
{
  private String gtl;
  private volatile com.tencent.mm.modelappbrand.c hmc;
  private volatile b hmj;
  private volatile e hmk;

  private com.tencent.mm.modelappbrand.c azN()
  {
    AppMethodBeat.i(10749);
    if (this.hmc == null);
    try
    {
      if (this.hmc == null)
      {
        localObject1 = new com/tencent/mm/plugin/appbrand/dynamic/a/a;
        ((a)localObject1).<init>();
        this.hmc = ((com.tencent.mm.modelappbrand.c)localObject1);
      }
      Object localObject1 = this.hmc;
      AppMethodBeat.o(10749);
      return localObject1;
    }
    finally
    {
      AppMethodBeat.o(10749);
    }
  }

  public final String a(String paramString, View paramView, Bundle paramBundle, com.tencent.mm.modelappbrand.ab paramab)
  {
    AppMethodBeat.i(10745);
    if (!(paramView instanceof IPCDynamicPageView))
    {
      paramView = "";
      AppMethodBeat.o(10745);
      return paramView;
    }
    Object localObject1 = com.tencent.mm.plugin.appbrand.r.n.gv(System.nanoTime());
    com.tencent.mm.plugin.appbrand.collector.c.d("widget_launch", (String)localObject1, "on_bind_view", true);
    com.tencent.mm.plugin.appbrand.collector.c.bE((String)localObject1, "init_finish");
    IPCDynamicPageView localIPCDynamicPageView = (IPCDynamicPageView)paramView;
    Object localObject2 = null;
    String str1;
    if (paramBundle != null)
    {
      str1 = paramBundle.getString("app_id");
      localObject2 = paramBundle.getString("msg_id");
      paramBundle.putString("__session_id", paramString);
      paramBundle.putLong("__on_bind_nano_time", System.nanoTime());
      paramBundle.putString("__session_id", (String)localObject1);
      paramBundle.putParcelable("__cost_time_session", com.tencent.mm.plugin.appbrand.collector.c.yH((String)localObject1));
    }
    while (true)
    {
      while (true)
      {
        localObject1 = paramBundle.getString("wxa_unique_id");
        paramView = (View)localObject1;
        if (TextUtils.isEmpty((CharSequence)localObject1))
          paramView = WxaWidgetInitializer.bL(str1, (String)localObject2);
        localObject2 = paramBundle.getString("exec_process_name", "com.tencent.mm:support");
        i.azC().bK(paramView, (String)localObject2);
        u.i("MicroMsg.DynamicPageService", "onBindView(%s)", new Object[] { paramView });
        com.tencent.mm.plugin.appbrand.dynamic.e.azz().b(paramView, localIPCDynamicPageView);
        Object localObject4 = (String)h.bP(paramBundle.getString("msg_path", "")).get("widgetData");
        if (!TextUtils.isEmpty((CharSequence)localObject4));
        try
        {
          localObject1 = new org/json/JSONObject;
          ((JSONObject)localObject1).<init>(URLDecoder.decode((String)localObject4));
          if ((((JSONObject)localObject1).has("render_data")) && (((JSONObject)localObject1).getJSONObject("render_data").has("actions")))
          {
            u.i("MicroMsg.DynamicPageService", "get render_data and begin predraw", new Object[0]);
            localObject4 = ((JSONObject)localObject1).getJSONObject("render_data").getJSONArray("actions");
            localObject1 = new org/json/JSONObject;
            ((JSONObject)localObject1).<init>();
            ((JSONObject)localObject1).put("actions", localObject4);
            ((JSONObject)localObject1).put("reserve", false);
            String str2 = ((JSONObject)localObject1).toString();
            ((JSONObject)localObject1).put("__invoke_jsapi_timestamp", System.currentTimeMillis());
            localObject4 = new com/tencent/mm/plugin/appbrand/dynamic/d/b/b;
            ((com.tencent.mm.plugin.appbrand.dynamic.d.b.b)localObject4).<init>();
            ((com.tencent.mm.plugin.appbrand.dynamic.d.b.b)localObject4).a((String)localObject2, paramView, (JSONObject)localObject1, null, null, com.tencent.mm.plugin.appbrand.dynamic.d.b.a.bb(paramView, paramBundle.getInt("draw_strategy")), str2);
            com.tencent.mm.plugin.appbrand.dynamic.d.b.a.bb(paramView, paramBundle.getInt("draw_strategy")).a((com.tencent.mm.plugin.appbrand.dynamic.d.b.b)localObject4);
            localObject2 = (w)paramab.px("WidgetPreDrawCallback");
            if (localObject2 != null)
              ((w)localObject2).abM();
            u.pp(paramView);
          }
          localIPCDynamicPageView.removeOnAttachStateChangeListener(this);
          localIPCDynamicPageView.addOnAttachStateChangeListener(this);
          Assert.assertNotNull(paramView);
          localIPCDynamicPageView.hpr = System.currentTimeMillis();
          if (paramab != null)
          {
            localObject2 = paramab.abN();
            if ((localIPCDynamicPageView.eIq != null) && (!paramView.equals(localIPCDynamicPageView.eIq)))
              localIPCDynamicPageView.cleanup();
            if ((localObject2 != null) && ((!paramView.equals(localIPCDynamicPageView.eIq)) || (!localIPCDynamicPageView.hpq)))
              ((f)localObject2).F(localIPCDynamicPageView, 0);
            localIPCDynamicPageView.hpq = false;
            u.i("MicroMsg.IPCDynamicPageView", "attach (%s)", new Object[] { paramView });
            IPCDynamicPageView.hlg.post(new IPCDynamicPageView.3(localIPCDynamicPageView, paramView, paramBundle, paramab, str1));
            com.tencent.mm.sdk.platformtools.ab.v("MicroMsg.DynamicPageService", "onBindView(%s)", new Object[] { paramView });
            paramBundle = com.tencent.mm.plugin.appbrand.dynamic.h.a.aAb();
            if ((paramString != null) && (paramString.length() != 0))
              break label635;
            com.tencent.mm.plugin.appbrand.dynamic.h.a.aAb().c(paramString, localIPCDynamicPageView);
            azN().d(paramString, localIPCDynamicPageView);
            AppMethodBeat.o(10745);
          }
        }
        catch (JSONException localJSONException)
        {
          while (true)
          {
            com.tencent.mm.sdk.platformtools.ab.printErrStackTrace("MicroMsg.DynamicPageService", localJSONException, "", new Object[0]);
            continue;
            Object localObject3 = null;
            continue;
            label635: paramBundle.hoE.put(paramString, this);
          }
        }
      }
      str1 = null;
    }
  }

  public final void a(String paramString, View paramView)
  {
    AppMethodBeat.i(10746);
    if (!(paramView instanceof IPCDynamicPageView))
      AppMethodBeat.o(10746);
    while (true)
    {
      return;
      paramView = (IPCDynamicPageView)paramView;
      com.tencent.mm.sdk.platformtools.ab.v("MicroMsg.DynamicPageService", "onUnBindView(%s)", new Object[] { paramView.getExtId() });
      paramView.removeOnAttachStateChangeListener(this);
      azN().e(paramString, paramView);
      com.tencent.mm.plugin.appbrand.dynamic.h.a.aAb().b(paramString, paramView);
      paramView.detach();
      i.azC().zW(paramString);
      AppMethodBeat.o(10746);
    }
  }

  public final void a(String paramString, IPCDynamicPageView paramIPCDynamicPageView)
  {
    AppMethodBeat.i(10755);
    com.tencent.mm.sdk.platformtools.ab.v("MicroMsg.DynamicPageService", "onOverLength(sessionId : %s, view : %s)", new Object[] { paramString, paramIPCDynamicPageView.getExtId() });
    a(paramString, paramIPCDynamicPageView);
    AppMethodBeat.o(10755);
  }

  public final com.tencent.mm.modelappbrand.d aby()
  {
    AppMethodBeat.i(10750);
    if (this.hmj == null);
    try
    {
      if (this.hmj == null)
      {
        localb = new com/tencent/mm/plugin/appbrand/dynamic/a/b;
        localb.<init>(azN());
        this.hmj = localb;
      }
      b localb = this.hmj;
      AppMethodBeat.o(10750);
      return localb;
    }
    finally
    {
      AppMethodBeat.o(10750);
    }
  }

  public final l abz()
  {
    AppMethodBeat.i(10751);
    if (this.hmk == null);
    try
    {
      if (this.hmk == null)
      {
        locale = new com/tencent/mm/plugin/appbrand/dynamic/a/e;
        locale.<init>();
        this.hmk = locale;
      }
      e locale = this.hmk;
      AppMethodBeat.o(10751);
      return locale;
    }
    finally
    {
      AppMethodBeat.o(10751);
    }
  }

  public final void b(String paramString, Throwable paramThrowable)
  {
    AppMethodBeat.i(10752);
    com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.DynamicPageService", "uncaughtException(%s)", new Object[] { Log.getStackTraceString(paramThrowable) });
    shutdown();
    AppMethodBeat.o(10752);
  }

  public final View bS(Context paramContext)
  {
    AppMethodBeat.i(10744);
    paramContext = new IPCDynamicPageView(paramContext);
    AppMethodBeat.o(10744);
    return paramContext;
  }

  public final void cg(View paramView)
  {
    AppMethodBeat.i(10747);
    if (!(paramView instanceof IPCDynamicPageView))
      AppMethodBeat.o(10747);
    while (true)
    {
      return;
      ((IPCDynamicPageView)paramView).nQ(2104);
      AppMethodBeat.o(10747);
    }
  }

  public final com.tencent.mm.modelappbrand.n ch(View paramView)
  {
    if ((paramView instanceof IPCDynamicPageView));
    for (paramView = (com.tencent.mm.modelappbrand.n)paramView; ; paramView = null)
      return paramView;
  }

  public final void initialize()
  {
    AppMethodBeat.i(10742);
    if ((this.gtl != null) && (this.gtl.length() != 0))
      shutdown();
    this.gtl = ("Token#" + System.nanoTime());
    ao.a(this);
    z.a(new com.tencent.mm.plugin.appbrand.dynamic.b.d());
    AppMethodBeat.o(10742);
  }

  public final void onViewAttachedToWindow(View paramView)
  {
    AppMethodBeat.i(10753);
    if ((paramView == null) || (!(paramView instanceof IPCDynamicPageView)))
      AppMethodBeat.o(10753);
    while (true)
    {
      return;
      paramView = (IPCDynamicPageView)paramView;
      com.tencent.mm.sdk.platformtools.ab.d("MicroMsg.DynamicPageService", "onViewAttachedToWindow(%s)", new Object[] { paramView.getExtId() });
      paramView.onResume();
      AppMethodBeat.o(10753);
    }
  }

  public final void onViewDetachedFromWindow(View paramView)
  {
    AppMethodBeat.i(10754);
    if ((paramView == null) || (!(paramView instanceof IPCDynamicPageView)))
      AppMethodBeat.o(10754);
    while (true)
    {
      return;
      paramView = (IPCDynamicPageView)paramView;
      com.tencent.mm.sdk.platformtools.ab.d("MicroMsg.DynamicPageService", "onViewDetachedFromWindow(%s)", new Object[] { paramView.getExtId() });
      paramView.onPause();
      AppMethodBeat.o(10754);
    }
  }

  public final void pm(String paramString)
  {
    AppMethodBeat.i(10748);
    com.tencent.mm.plugin.appbrand.dynamic.h.a.aAb().hoD.remove(paramString);
    Object localObject1 = com.tencent.mm.plugin.appbrand.dynamic.h.a.aAb();
    if ((paramString == null) || (paramString.length() == 0))
    {
      localObject1 = azN().be(paramString);
      if ((localObject1 != null) && (!((Set)localObject1).isEmpty()))
        break label79;
      AppMethodBeat.o(10748);
    }
    while (true)
    {
      return;
      ((com.tencent.mm.plugin.appbrand.dynamic.h.a)localObject1).hoE.remove(paramString);
      break;
      label79: localObject1 = ((Set)localObject1).iterator();
      while (((Iterator)localObject1).hasNext())
      {
        Object localObject2 = (View)((Iterator)localObject1).next();
        if ((localObject2 != null) && ((localObject2 instanceof IPCDynamicPageView)))
        {
          localObject2 = (IPCDynamicPageView)localObject2;
          com.tencent.mm.sdk.platformtools.ab.v("MicroMsg.DynamicPageService", "onUnbindAllView, do unBindView(%s)", new Object[] { ((IPCDynamicPageView)localObject2).getExtId() });
          ((IPCDynamicPageView)localObject2).removeOnAttachStateChangeListener(this);
          ((IPCDynamicPageView)localObject2).detach();
        }
      }
      if (azN().abx().isEmpty())
        com.tencent.mm.ce.a.post(new a.1());
      i.azC().zW(paramString);
      AppMethodBeat.o(10748);
    }
  }

  public final void shutdown()
  {
    AppMethodBeat.i(10743);
    Object localObject = azN().abx();
    if ((localObject == null) || (((Map)localObject).isEmpty()))
      AppMethodBeat.o(10743);
    while (true)
    {
      return;
      Iterator localIterator = new LinkedHashSet(((Map)localObject).keySet()).iterator();
      while (localIterator.hasNext())
      {
        localObject = localIterator.next();
        if ((localObject != null) && ((localObject instanceof String)))
          pm((String)localObject);
      }
      AppMethodBeat.o(10743);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.dynamic.a.c
 * JD-Core Version:    0.6.2
 */