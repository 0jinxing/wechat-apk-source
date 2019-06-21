package com.tencent.mm.plugin.websearch.widget;

import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.AbsoluteLayout.LayoutParams;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.b.a.ad;
import com.tencent.mm.ipcinvoker.j;
import com.tencent.mm.kernel.g;
import com.tencent.mm.loader.j.b;
import com.tencent.mm.modelappbrand.u;
import com.tencent.mm.modelappbrand.v;
import com.tencent.mm.plugin.appbrand.r.p;
import com.tencent.mm.plugin.websearch.api.WidgetData;
import com.tencent.mm.plugin.websearch.api.WidgetData.Info;
import com.tencent.mm.plugin.websearch.api.r;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.at;
import com.tencent.mm.sdk.platformtools.bo;
import java.io.File;
import java.io.FileFilter;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.json.JSONObject;

public final class a
  implements com.tencent.mm.plugin.websearch.api.f
{
  private static u ucD;
  private Context context;
  private Map<String, WidgetData> ucA;
  public boolean ucB;
  private r ucC;
  private WidgetData ucE;
  private Runnable ucF;
  private String ucG;
  private volatile String ucH;
  private HashMap<String, Object> ucs;
  private HashMap<String, Object> uct;
  private HashMap<String, Object> ucu;
  private Map<String, String> ucv;
  private int ucw;
  private com.tencent.mm.modelappbrand.e ucx;
  private Map<String, a.e> ucy;
  private Map<String, a.d> ucz;

  static
  {
    AppMethodBeat.i(91427);
    ucD = new u();
    AppMethodBeat.o(91427);
  }

  public a(Context paramContext, final r paramr)
  {
    AppMethodBeat.i(91408);
    this.ucs = new HashMap();
    this.uct = new HashMap();
    this.ucu = new HashMap();
    this.ucv = new HashMap();
    this.ucw = -1;
    this.ucy = new HashMap();
    this.ucz = new HashMap();
    this.ucA = new HashMap();
    this.ucB = true;
    this.ucH = null;
    this.context = paramContext;
    this.ucC = paramr;
    this.ucx = ((com.tencent.mm.modelappbrand.e)g.K(com.tencent.mm.modelappbrand.e.class));
    if ((this.ucB) && (new File(com.tencent.mm.compatible.util.e.eSn, "websearch-widget-not-use-tools").exists()))
      this.ucB = false;
    if (ah.bqo())
      com.tencent.mm.ipcinvoker.f.a("com.tencent.mm:support", new j()
      {
        public final void onDisconnect()
        {
          AppMethodBeat.i(91378);
          if ("com.tencent.mm:support".equals(a.a(a.this)))
          {
            u.i("FTSSearchWidgetMgr", "support process dead", new Object[0]);
            if (a.b(a.this) != null)
            {
              ad localad = new ad().eZ(a.b(a.this).ubs.fpS);
              localad.cYw = a.b(a.this).ubs.fmr;
              localad.cYs = 21L;
              localad.cYt = System.currentTimeMillis();
              localad.fa(at.gB(ah.getContext())).ajK();
              v.kT(30);
              paramr.cUV();
            }
          }
          AppMethodBeat.o(91378);
        }
      });
    AppMethodBeat.o(91408);
  }

  private void a(View paramView1, View paramView2, int paramInt1, int paramInt2, int paramInt3, int paramInt4, String paramString)
  {
    AppMethodBeat.i(91420);
    al.d(new a.8(this, paramInt1, paramInt2, paramInt3, paramInt4, paramView1, paramView2, paramString));
    AppMethodBeat.o(91420);
  }

  private void adS(String paramString)
  {
    AppMethodBeat.i(91413);
    Object localObject1;
    Object localObject2;
    if ((paramString != null) && (paramString.length() > 0))
    {
      localObject1 = (WidgetData)this.ucA.get(paramString);
      localObject2 = (a.d)this.ucz.get(paramString);
      if ((localObject1 != null) && (localObject2 != null) && (((a.d)localObject2).isLoading))
      {
        localObject2 = new ad().eZ(((WidgetData)localObject1).ubs.fpS);
        ((ad)localObject2).cYw = ((WidgetData)localObject1).ubs.fmr;
        ((ad)localObject2).cYs = 24L;
        localObject1 = ((ad)localObject2).eY(paramString);
        ((ad)localObject1).cYt = System.currentTimeMillis();
        ((ad)localObject1).fa(at.gB(ah.getContext())).ajK();
      }
      localObject2 = (View)this.ucs.get(paramString);
      if (localObject2 == null)
      {
        ab.i("FTSSearchWidgetMgr", "removeWidget cacheKey %s, can not find view", new Object[] { paramString });
        AppMethodBeat.o(91413);
      }
    }
    while (true)
    {
      return;
      ab.i("FTSSearchWidgetMgr", "removing widget sessionId %s", new Object[] { ((View)localObject2).getTag().toString() });
      if (this.ucx != null)
      {
        localObject1 = (String)((View)localObject2).getTag();
        this.ucx.a((String)localObject1, (View)localObject2);
      }
      this.ucs.remove(paramString);
      this.ucu.remove(paramString);
      localObject1 = (View)this.uct.get(paramString);
      if (localObject1 != null)
      {
        this.ucC.removeView((View)localObject1);
        this.uct.remove(paramString);
      }
      AppMethodBeat.o(91413);
    }
  }

  public static u cVO()
  {
    return ucD;
  }

  public final void a(WidgetData paramWidgetData, String paramString)
  {
    AppMethodBeat.i(91415);
    if (paramString != null);
    try
    {
      if (paramString.length() > 0)
      {
        a.6 local6 = new com/tencent/mm/plugin/websearch/widget/a$6;
        local6.<init>(this, paramString, paramWidgetData);
        al.d(local6);
      }
      AppMethodBeat.o(91415);
      return;
    }
    catch (Exception paramWidgetData)
    {
      while (true)
      {
        ab.printErrStackTrace("FTSSearchWidgetMgr", paramWidgetData, "", new Object[0]);
        AppMethodBeat.o(91415);
      }
    }
  }

  public final void a(WidgetData paramWidgetData, String paramString, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(91410);
    com.tencent.mm.ipcinvoker.l.s(new a.2(this, paramWidgetData, paramString, paramInt2, paramInt1));
    AppMethodBeat.o(91410);
  }

  public final void adD(String paramString)
  {
    AppMethodBeat.i(91409);
    a.d locald = (a.d)this.ucz.get(paramString);
    if (locald != null)
    {
      paramString = new Bundle();
      paramString.putString("app_id", locald.csB);
      paramString.putString("msg_id", locald.hlE);
      paramString.putInt("pkg_type", locald.cBc);
      paramString.putInt("pkg_version", locald.gVu);
      ((com.tencent.mm.modelappbrand.e)g.K(com.tencent.mm.modelappbrand.e.class)).abz().e(this.context, paramString);
    }
    AppMethodBeat.o(91409);
  }

  public final void adE(String paramString)
  {
    AppMethodBeat.i(91412);
    adS(paramString);
    d.cVP();
    d.c(this.ucE);
    AppMethodBeat.o(91412);
  }

  public final void cUS()
  {
    this.ucB = false;
  }

  public final void f(int paramInt1, int paramInt2, String paramString1, String paramString2)
  {
    AppMethodBeat.i(91419);
    u.v("FTSSearchWidgetMgr", "tapSearchWAWidgetView x %d, y %d, widgetId %s, eventId %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString1, paramString2 });
    View localView = (View)this.ucs.get(paramString1);
    if (localView != null)
    {
      com.tencent.mm.sdk.g.d.post(new a.7(this, paramInt1, paramInt2, paramString2, this.ucx.ch(localView), paramString1), "tapSearchWAWidgetView");
      AppMethodBeat.o(91419);
    }
    while (true)
    {
      return;
      ab.i("FTSSearchWidgetMgr", "onTap fail: can not find Widget by widgetId %s", new Object[] { paramString1 });
      this.ucC.a(paramString2, false, "onTap fail: can not find Widget by widgetId ".concat(String.valueOf(paramString1)), paramString1);
      AppMethodBeat.o(91419);
    }
  }

  public final void gR(String paramString1, String paramString2)
  {
    AppMethodBeat.i(91414);
    ab.i("FTSSearchWidgetMgr", "updating widget: widgetId %s, jsonData %s", new Object[] { paramString2, paramString1 });
    try
    {
      JSONObject localJSONObject = new org/json/JSONObject;
      localJSONObject.<init>(paramString1);
      if ((paramString2 != null) && (paramString2.length() > 0))
      {
        localView = (View)this.ucs.get(paramString2);
        paramString1 = (View)this.uct.get(paramString2);
        if (localView != null)
        {
          AbsoluteLayout.LayoutParams localLayoutParams1 = (AbsoluteLayout.LayoutParams)localView.getLayoutParams();
          AbsoluteLayout.LayoutParams localLayoutParams2 = (AbsoluteLayout.LayoutParams)paramString1.getLayoutParams();
          if ((localJSONObject.has("width")) || (localJSONObject.has("height")))
          {
            int i = localLayoutParams1.height;
            int j = p.qd(localJSONObject.optInt("height"));
            int k = localLayoutParams1.width;
            int m = p.qd(localJSONObject.optInt("width"));
            a(localView, (View)this.ucu.get(paramString2), i, j, k, m, paramString2);
          }
          if (localJSONObject.has("offsetX"))
            localLayoutParams2.x = p.qd(localJSONObject.optInt("offsetX"));
          if (localJSONObject.has("offsetY"))
            localLayoutParams2.y = p.qd(localJSONObject.optInt("offsetY"));
          paramString1.setLayoutParams(localLayoutParams2);
          bool = localJSONObject.has("backgroundColor");
          if (bool);
          try
          {
            localView.setBackgroundColor(Color.parseColor(localJSONObject.getString("backgroundColor")));
            if (localJSONObject.has("show"))
              if (localJSONObject.has("show"))
              {
                bool = localJSONObject.optBoolean("show");
                if (!bool)
                  break label353;
                localView.setVisibility(0);
                paramString1.setVisibility(0);
                AppMethodBeat.o(91414);
              }
          }
          catch (Exception paramString2)
          {
            while (true)
              ab.e("FTSSearchWidgetMgr", bo.l(paramString2));
          }
        }
      }
    }
    catch (Exception paramString1)
    {
      while (true)
      {
        View localView;
        ab.e("FTSSearchWidgetMgr", "the error is e");
        AppMethodBeat.o(91414);
        continue;
        boolean bool = false;
        continue;
        label353: localView.setVisibility(8);
        paramString1.setVisibility(8);
        AppMethodBeat.o(91414);
      }
    }
  }

  public final void m(String paramString1, String paramString2, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(91411);
    a(WidgetData.adQ(paramString1), paramString2, paramInt1, paramInt2);
    AppMethodBeat.o(91411);
  }

  public final void onDestroy()
  {
    int i = 0;
    AppMethodBeat.i(91418);
    try
    {
      Object localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>();
      Object localObject2 = b.eSk.replace("/data/user/0", "/data/data") + "/fts_cache";
      localObject1 = new java/io/File;
      ((File)localObject1).<init>((String)localObject2);
      localObject2 = new com/tencent/mm/plugin/websearch/widget/a$4;
      ((4)localObject2).<init>(this, "");
      localObject2 = ((File)localObject1).listFiles((FileFilter)localObject2);
      if (localObject2 != null)
      {
        int j = localObject2.length;
        while (i < j)
        {
          localObject1 = localObject2[i];
          u.i("FTSSearchWidgetMgr", "deleting %s", new Object[] { ((File)localObject1).getAbsoluteFile() });
          ((File)localObject1).delete();
          i++;
        }
      }
      if (this.ucx != null)
      {
        ab.i("FTSSearchWidgetMgr", "remove all widget count %d", new Object[] { Integer.valueOf(this.ucs.size()) });
        localObject1 = new java/util/HashMap;
        ((HashMap)localObject1).<init>(this.ucs);
        localObject2 = ((HashMap)localObject1).keySet().iterator();
        while (((Iterator)localObject2).hasNext())
        {
          localObject1 = (String)((Iterator)localObject2).next();
          if ((localObject1 != null) && (((String)localObject1).length() > 0))
          {
            String str = (String)((View)this.ucs.get(localObject1)).getTag();
            this.ucx.pm(str);
            if ((View)this.uct.get(localObject1) != null)
            {
              adS((String)localObject1);
              this.uct.remove(localObject1);
            }
          }
        }
      }
    }
    catch (Exception localException)
    {
      ab.e("FTSSearchWidgetMgr", bo.l(localException));
      AppMethodBeat.o(91418);
    }
    while (true)
    {
      return;
      this.ucs.clear();
      this.ucu.clear();
      this.ucE = null;
      AppMethodBeat.o(91418);
    }
  }

  public final void onPause()
  {
    AppMethodBeat.i(91417);
    if (this.ucx != null)
    {
      Iterator localIterator = this.ucs.keySet().iterator();
      while (localIterator.hasNext())
      {
        String str = (String)localIterator.next();
        if ((str != null) && (str.length() > 0))
        {
          str = (String)((View)this.ucs.get(str)).getTag();
          ((com.tencent.mm.modelappbrand.e)g.K(com.tencent.mm.modelappbrand.e.class)).aby().pk(str);
        }
      }
    }
    AppMethodBeat.o(91417);
  }

  public final void onResume()
  {
    AppMethodBeat.i(91416);
    if (this.ucx != null)
    {
      Iterator localIterator = this.ucs.keySet().iterator();
      while (localIterator.hasNext())
      {
        String str = (String)localIterator.next();
        if ((str != null) && (str.length() > 0))
        {
          str = (String)((View)this.ucs.get(str)).getTag();
          ((com.tencent.mm.modelappbrand.e)g.K(com.tencent.mm.modelappbrand.e.class)).aby().pl(str);
        }
      }
    }
    AppMethodBeat.o(91416);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.websearch.widget.a
 * JD-Core Version:    0.6.2
 */