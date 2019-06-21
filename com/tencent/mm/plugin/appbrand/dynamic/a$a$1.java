package com.tencent.mm.plugin.appbrand.dynamic;

import android.content.Context;
import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.d.a.l;
import com.tencent.mm.d.a.n;
import com.tencent.mm.d.a.p;
import com.tencent.mm.g.b.a.ad;
import com.tencent.mm.modelappbrand.u;
import com.tencent.mm.plugin.appbrand.collector.CollectSession;
import com.tencent.mm.plugin.appbrand.dynamic.f.f;
import com.tencent.mm.plugin.appbrand.dynamic.f.g;
import com.tencent.mm.plugin.appbrand.h.x;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.at;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import junit.framework.Assert;

final class a$a$1
  implements Runnable
{
  a$a$1(a.a parama, c paramc, String paramString1, String paramString2, Bundle paramBundle)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(10642);
    u.i("MicroMsg.IPCInvoke_AttachTo", "ui thread attach", new Object[0]);
    c localc = this.hla;
    String str1 = this.val$id;
    Object localObject1 = this.val$appId;
    Bundle localBundle = this.hkY;
    Assert.assertNotNull(str1);
    if ((!str1.equals(localc.eIq)) && (localc.eIn != null))
    {
      localc.cleanup();
      localc.apg = false;
      localc.eIn = null;
    }
    localc.eIq = str1;
    localc.appId = ((String)localObject1);
    Object localObject2 = "";
    long l;
    if (localBundle != null)
    {
      localObject2 = localBundle.getString("cache_key", "");
      localc.Kg = localBundle.getString("query");
      localc.hlk = localBundle.getBoolean("is_testing_ui");
      localc.mUrl = localBundle.getString("url");
      localc.hlj = localBundle.getInt("widget_type");
      localc.hlm = localBundle.getString("search_id");
      localc.hcl = localBundle.getString("__session_id");
      l = localBundle.getLong("__on_bind_nano_time");
      if (!bo.isNullOrNil(localc.hcl))
        com.tencent.mm.plugin.appbrand.collector.c.a((CollectSession)localBundle.getParcelable("__cost_time_session"));
    }
    while (true)
    {
      u.i("MicroMsg.DynamicPageViewIPCProxy", "attach(%s, %s)", new Object[] { str1, localObject1 });
      int i = 1;
      if (localc.hlj == 1)
      {
        i = 0;
        if (localc.hll != null)
          break label1333;
        localc.hll = new com.tencent.mm.plugin.appbrand.widget.e();
      }
      label917: label1333: for (int j = 0; ; j = i)
      {
        localc.hll.field_id = str1;
        localc.hll.field_cacheKey = ((String)localObject2);
        localc.hll.field_appId = u.pr(localc.eIq);
        if (localc.eIn == null)
        {
          u.i("MicroMsg.DynamicPageViewIPCProxy", "jsbridge is null", new Object[0]);
          com.tencent.mm.plugin.appbrand.collector.c.bD(localc.hcl, "before_init_js_engine");
          localObject2 = localc.mContext;
          localObject1 = localc.eIq;
          Object localObject3 = k.Aa((String)localObject1);
          if ((localObject3 == null) || (localBundle == null))
            ab.w("MicroMsg.WxaWidgetInitializer", "FwContext is null(id : %s)", new Object[] { localObject1 });
          for (localObject2 = null; ; localObject2 = com.tencent.mm.plugin.appbrand.dynamic.h.e.a((Context)localObject2, (WxaWidgetContext)localObject3, new com.tencent.mm.plugin.appbrand.dynamic.d.c.a((String)localObject1, ((WxaWidgetContext)localObject3).azI()), localBundle))
          {
            localc.eIn = ((com.tencent.mm.z.c.e)localObject2);
            com.tencent.mm.plugin.appbrand.collector.c.bD(localc.hcl, "after_init_js_engine");
            localc.eIn.eIq = localc.eIq;
            if (!(localc.eIn.eIt instanceof com.tencent.mm.plugin.appbrand.dynamic.e.a))
              break label578;
            localObject1 = (com.tencent.mm.plugin.appbrand.dynamic.e.a)localc.eIn.eIt;
            localObject2 = new c.3(localc);
            if (((com.tencent.mm.plugin.appbrand.dynamic.e.a)localObject1).hoa != null)
              ((com.tencent.mm.plugin.appbrand.dynamic.e.a)localObject1).hoa.setJsExceptionHandler((com.tencent.mm.plugin.appbrand.h.h)localObject2);
            localObject1 = (com.tencent.mm.plugin.appbrand.dynamic.e.a)localc.eIn.eIt;
            localObject2 = new c.4(localc);
            localObject1 = ((com.tencent.mm.plugin.appbrand.dynamic.e.a)localObject1).hoa;
            if (((com.tencent.mm.plugin.appbrand.h.a)localObject1).ieS == null)
              break label578;
            localObject1 = ((com.tencent.mm.plugin.appbrand.h.a)localObject1).ieS.chQ.iterator();
            while (((Iterator)localObject1).hasNext())
            {
              localObject3 = (n)((Iterator)localObject1).next();
              if ((localObject3 instanceof p))
                ((p)localObject3).cij = ((x)localObject2);
            }
            localc.hll = com.tencent.mm.plugin.appbrand.dynamic.j.b.Am(str1);
            break;
            ab.i("MicroMsg.WxaWidgetInitializer", "initJsBridge(%s)", new Object[] { localObject1 });
          }
          label578: if (localBundle != null)
            localc.q(localBundle.getBundle("__env_args"));
          localc.eIn.onStart();
          if (localc.hln)
          {
            localObject2 = localc.eIn;
            new f();
            ((com.tencent.mm.z.c.e)localObject2).Qz();
            u.i("MicroMsg.DynamicPageViewIPCProxy", "before dispatch onCanvasInsertJsEvent", new Object[0]);
            com.tencent.mm.z.c.e locale = localc.eIn;
            localObject3 = "";
            localObject1 = "";
            String str2 = "";
            localObject2 = null;
            int k = 0;
            i = 0;
            if (localBundle != null)
            {
              k = localBundle.getInt("view_init_width");
              i = localBundle.getInt("view_init_height");
              localObject3 = localBundle.getString("cache_key", "");
              localObject1 = localBundle.getString("msg_title", "");
              localObject2 = localBundle.getString("msg_path", "");
              str2 = com.tencent.luggage.g.h.bO((String)localObject2);
              localObject2 = com.tencent.luggage.g.h.bP((String)localObject2);
            }
            com.tencent.mm.plugin.appbrand.dynamic.f.b localb = new com.tencent.mm.plugin.appbrand.dynamic.f.b();
            localb.cacheKey = ((String)localObject3);
            localb.title = ((String)localObject1);
            localb.path = str2;
            localb.hod = ((Map)localObject2);
            localb.hoe = k;
            localb.hof = i;
            locale.a(localb, new c.5(localc));
            u.i("MicroMsg.DynamicPageViewIPCProxy", "after dispatch onCanvasInsertJsEvent", new Object[0]);
            localObject2 = new ad().eZ(u.pr(str1));
            ((ad)localObject2).cYw = u.pq(str1);
            ((ad)localObject2).cYs = 8L;
            localObject2 = ((ad)localObject2).eY(str1);
            ((ad)localObject2).cYt = System.currentTimeMillis();
            ((ad)localObject2).fa(at.gB(ah.getContext())).ajK();
            if (l > 0L)
            {
              l = (System.nanoTime() - l) / 1000000L;
              i = 22;
              if (l > 50L)
                break label1030;
              i = 0;
              com.tencent.mm.plugin.report.service.h.pYm.a(677L, i, 1L, false);
              com.tencent.mm.plugin.report.service.h.pYm.a(677L, 8L, 1L, false);
            }
            com.tencent.mm.plugin.appbrand.collector.c.bD(localc.hcl, "init_finish");
            com.tencent.mm.plugin.appbrand.collector.c.print(localc.hcl);
            u.i("MicroMsg.DynamicPageViewIPCProxy", "jsbridge init complete", new Object[0]);
            label975: localc.apg = true;
            if (j == 0)
              break label1296;
            localc.a(localc.eIn, localc.hll);
          }
        }
        while (true)
        {
          localc.azx();
          AppMethodBeat.o(10642);
          return;
          localObject2 = localc.eIn;
          new g();
          ((com.tencent.mm.z.c.e)localObject2).QA();
          break;
          if (l <= 100L)
          {
            i = 1;
            break label917;
          }
          if (l <= 200L)
          {
            i = 2;
            break label917;
          }
          if (l <= 300L)
          {
            i = 3;
            break label917;
          }
          if (l <= 400L)
          {
            i = 4;
            break label917;
          }
          if (l <= 500L)
          {
            i = 5;
            break label917;
          }
          if (l <= 600L)
          {
            i = 6;
            break label917;
          }
          if (l <= 1000L)
          {
            i = 17;
            break label917;
          }
          if (l <= 1500L)
          {
            i = 18;
            break label917;
          }
          if (l <= 2000L)
          {
            i = 19;
            break label917;
          }
          if (l <= 2500L)
          {
            i = 20;
            break label917;
          }
          if (l > 3000L)
            break label917;
          i = 21;
          break label917;
          u.i("MicroMsg.DynamicPageViewIPCProxy", "jsbridge not null", new Object[0]);
          com.tencent.mm.plugin.appbrand.collector.c.yI(localc.hcl);
          if (localBundle != null)
            localc.q(localBundle.getBundle("__env_args"));
          localc.eIn.onStart();
          if (localc.hln)
          {
            localObject2 = localc.eIn;
            new f();
            ((com.tencent.mm.z.c.e)localObject2).Qz();
            break label975;
          }
          localObject2 = localc.eIn;
          new g();
          ((com.tencent.mm.z.c.e)localObject2).QA();
          break label975;
          if (localc.hlk)
          {
            localc.hll.field_data = localBundle.getString("init_data");
            localc.a(localc.eIn, localc.hll);
          }
        }
      }
      label1030: label1296: l = 0L;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.dynamic.a.a.1
 * JD-Core Version:    0.6.2
 */