package com.tencent.mm.plugin.websearch.widget;

import android.graphics.Color;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.AbsoluteLayout;
import android.widget.AbsoluteLayout.LayoutParams;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.b.a.ad;
import com.tencent.mm.ipcinvoker.c;
import com.tencent.mm.modelappbrand.aa;
import com.tencent.mm.modelappbrand.ac;
import com.tencent.mm.modelappbrand.m;
import com.tencent.mm.modelappbrand.u;
import com.tencent.mm.plugin.appbrand.r.p;
import com.tencent.mm.plugin.expt.a.a.a;
import com.tencent.mm.plugin.websearch.api.WidgetData;
import com.tencent.mm.plugin.websearch.api.WidgetData.Info;
import com.tencent.mm.plugin.websearch.api.WidgetData.Style;
import com.tencent.mm.plugin.websearch.api.r;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.at;
import com.tencent.mm.ui.widget.ThreeDotsLoadingView;
import java.util.HashMap;
import java.util.Map;

final class a$2$2
  implements Runnable
{
  a$2$2(a.2 param2)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(91391);
    a.a(this.ucM.ucJ, this.ucM.ucK);
    a.d(this.ucM.ucJ).put(this.ucM.ucL, this.ucM.ucK);
    com.tencent.mm.modelappbrand.v.kT(0);
    String str = "sessionid_" + System.currentTimeMillis();
    u.i("FTSSearchWidgetMgr", "inserting widget: serviceType %d widgetId %s, sessionId %s, jsonData %s ", new Object[] { Integer.valueOf(this.ucM.ucK.ubs.fmr), this.ucM.ucL, str, this.ucM.ucK.toString() });
    Object localObject1 = (a.d)a.e(this.ucM.ucJ).get(this.ucM.ucL);
    if (localObject1 == null)
    {
      localObject1 = new a.d(this.ucM.ucJ, (byte)0);
      a.e(this.ucM.ucJ).put(this.ucM.ucL, localObject1);
    }
    while (true)
    {
      ((a.d)localObject1).isLoading = true;
      try
      {
        d.cVP();
        d.b(this.ucM.ucK);
        Object localObject2 = (a.e)a.f(this.ucM.ucJ).get(this.ucM.ucL);
        Object localObject3 = localObject2;
        if (localObject2 == null)
        {
          localObject3 = new com/tencent/mm/plugin/websearch/widget/a$e;
          ((a.e)localObject3).<init>(this.ucM.ucJ, (byte)0);
          a.f(this.ucM.ucJ).put(this.ucM.ucL, localObject3);
        }
        ((a.e)localObject3).udj = ((int)this.ucM.ucK.ubt.ubH);
        ((a.e)localObject3).ubI = this.ucM.ucK.ubt.ubI;
        com.tencent.mm.sdk.platformtools.ab.i("FTSSearchWidgetMgr", "update widgetSize %s", new Object[] { ((a.e)localObject3).toString() });
        a.cVO();
        u.pu(this.ucM.ucK.ubs.fpS);
        boolean bool1;
        if (!TextUtils.isEmpty((CharSequence)com.tencent.luggage.g.h.bP(this.ucM.ucK.ubs.csu).get("widgetData")))
          bool1 = true;
        while (true)
        {
          if (bool1)
          {
            a.cVO();
            u.abL();
          }
          localObject3 = new com/tencent/mm/g/b/a/ad;
          ((ad)localObject3).<init>();
          localObject3 = ((ad)localObject3).eZ(this.ucM.ucK.ubs.fpS);
          long l;
          Object localObject4;
          Object localObject5;
          if (bool1)
          {
            l = 1L;
            ((ad)localObject3).cYx = l;
            ((ad)localObject3).cYw = this.ucM.ucK.ubs.fmr;
            ((ad)localObject3).cYs = 1L;
            localObject3 = ((ad)localObject3).eY(this.ucM.ucL);
            ((ad)localObject3).cYt = System.currentTimeMillis();
            ((ad)localObject3).fa(at.gB(ah.getContext())).ajK();
            localObject2 = a.h(this.ucM.ucJ).bS(a.g(this.ucM.ucJ));
            localObject3 = (AbsoluteLayout)com.tencent.mm.ui.v.hu(a.g(this.ucM.ucJ)).inflate(2130969646, null);
            localObject4 = new android/widget/AbsoluteLayout$LayoutParams;
            ((AbsoluteLayout.LayoutParams)localObject4).<init>(-1, -2, p.qd(this.ucM.ucK.ubt.offsetX), p.qd(this.ucM.ucK.ubt.offsetY));
            ((AbsoluteLayout)localObject3).setLayoutParams((ViewGroup.LayoutParams)localObject4);
            localObject5 = new android/widget/AbsoluteLayout$LayoutParams;
            ((AbsoluteLayout.LayoutParams)localObject5).<init>(p.qd(this.ucM.ucK.ubt.width), p.qd(this.ucM.ucK.ubt.height), 0, 0);
            ((View)localObject2).setLayoutParams((ViewGroup.LayoutParams)localObject5);
            ((AbsoluteLayout)localObject3).addView((View)localObject2);
            localObject4 = (FrameLayout)((AbsoluteLayout)localObject3).findViewById(2131824289);
            ((FrameLayout)localObject4).setLayoutParams((ViewGroup.LayoutParams)localObject5);
            ((AbsoluteLayout)localObject3).removeView((View)localObject4);
            ((AbsoluteLayout)localObject3).addView((View)localObject4);
          }
          try
          {
            ((View)localObject2).setBackgroundColor(Color.parseColor(this.ucM.ucK.ubt.hfo));
            ((View)localObject2).setTag(str);
            a.i(this.ucM.ucJ).put(this.ucM.ucL, localObject2);
            a.j(this.ucM.ucJ).put(this.ucM.ucL, localObject3);
            a.k(this.ucM.ucJ).put(this.ucM.ucL, localObject4);
            localObject4 = (ThreeDotsLoadingView)((AbsoluteLayout)localObject3).findViewById(2131821325);
            Object localObject6 = (ImageView)((AbsoluteLayout)localObject3).findViewById(2131821842);
            localObject5 = new java/lang/StringBuilder;
            ((StringBuilder)localObject5).<init>();
            Object localObject7 = this.ucM.ucK.ubs.fpS + "_" + this.ucM.ucK.ubs.ubx.hashCode();
            localObject5 = new android/os/Bundle;
            ((Bundle)localObject5).<init>();
            if (this.ucM.ucJ.ucB)
            {
              a.a(this.ucM.ucJ, "com.tencent.mm:tools");
              ((Bundle)localObject5).putString("exec_process_name", a.a(this.ucM.ucJ));
              ((Bundle)localObject5).putString("app_id", this.ucM.ucK.ubs.csB);
              ((Bundle)localObject5).putString("src_app_id", this.ucM.ucK.ubs.fpS);
              ((Bundle)localObject5).putString("wxa_unique_id", this.ucM.ucL);
              ((Bundle)localObject5).putString("msg_id", (String)localObject7);
              ((Bundle)localObject5).putString("search_id", this.ucM.ucK.ubs.hlm);
              ((Bundle)localObject5).putString("cache_key", this.ucM.ucK.ubs.ubx);
              ((Bundle)localObject5).putString("msg_title", this.ucM.ucK.ubs.bCu);
              ((Bundle)localObject5).putString("msg_path", this.ucM.ucK.ubs.csu);
              ((Bundle)localObject5).putInt("pkg_version", this.ucM.ucK.ubs.version);
              ((Bundle)localObject5).putInt("msg_pkg_type", this.ucM.ucK.ubs.ubz);
              ((Bundle)localObject5).putString("init_data", this.ucM.ucK.ubs.ubw);
              ((Bundle)localObject5).putInt("widget_type", 1);
              ((Bundle)localObject5).putInt("service_type", this.ucM.ucK.ubs.fmr);
              i = this.ucM.fwD;
              if (i != 201)
                break label2131;
              i = 1006;
              ((Bundle)localObject5).putInt("scene", i);
              ((Bundle)localObject5).putInt("view_init_width", p.qd(this.ucM.ucK.ubt.width));
              ((Bundle)localObject5).putInt("view_init_height", p.qd(this.ucM.ucK.ubt.height));
              ((Bundle)localObject5).putString("query", this.ucM.ucK.ubs.ubx);
              ((Bundle)localObject5).putString("preload_launch_data", this.ucM.ucK.ubs.uby);
              ((Bundle)localObject5).putString("preload_download_data", this.ucM.ucK.ubs.downloadUrl);
              ((Bundle)localObject5).putInt("draw_strategy", this.ucM.hnH);
              if (((com.tencent.mm.plugin.expt.a.a)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.expt.a.a.class)).a(a.a.lFV, 0) != 1)
                break label2183;
              bool2 = true;
              ((Bundle)localObject5).putBoolean("use_predraw", bool2);
              ((ThreeDotsLoadingView)localObject4).setVisibility(0);
              ((ImageView)localObject6).setVisibility(4);
              ((ThreeDotsLoadingView)localObject4).dKS();
              ((a.d)localObject1).csB = this.ucM.ucK.ubs.csB;
              ((a.d)localObject1).cBc = this.ucM.ucK.ubs.ubz;
              ((a.d)localObject1).gVu = this.ucM.ucK.ubs.version;
              ((a.d)localObject1).hlE = ((String)localObject7);
              com.tencent.mm.sdk.platformtools.ab.i("FTSSearchWidgetMgr", "inserting widget %s", new Object[] { ((a.d)localObject1).toString() });
              l = System.currentTimeMillis();
              com.tencent.mm.plugin.report.service.h.pYm.a(867L, 0L, 1L, false);
              localObject1 = new com/tencent/mm/modelappbrand/ac;
              localObject7 = new com/tencent/mm/plugin/websearch/widget/a$2$2$9;
              ((a.2.2.9)localObject7).<init>(this, str, (ThreeDotsLoadingView)localObject4, (ImageView)localObject6, l, bool1);
              ((ac)localObject1).<init>((com.tencent.mm.modelappbrand.f)localObject7);
              localObject6 = new com/tencent/mm/plugin/websearch/widget/a$2$2$10;
              ((a.2.2.10)localObject6).<init>(this);
              ((ac)localObject1).a((m)localObject6);
              localObject6 = new com/tencent/mm/plugin/websearch/widget/g;
              ((g)localObject6).<init>(a.g(this.ucM.ucJ));
              ((ac)localObject1).a((m)localObject6);
              localObject6 = new com/tencent/mm/plugin/websearch/widget/a$2$2$11;
              ((a.2.2.11)localObject6).<init>(this);
              ((ac)localObject1).a((m)localObject6);
              localObject6 = new com/tencent/mm/plugin/websearch/widget/a$2$2$12;
              ((a.2.2.12)localObject6).<init>(this);
              ((ac)localObject1).a((m)localObject6);
              localObject6 = new com/tencent/mm/plugin/websearch/widget/a$2$2$13;
              ((a.2.2.13)localObject6).<init>(this, (View)localObject2);
              ((ac)localObject1).a((m)localObject6);
              localObject6 = new com/tencent/mm/plugin/websearch/widget/a$2$2$14;
              ((a.2.2.14)localObject6).<init>(this);
              ((ac)localObject1).a((m)localObject6);
              localObject6 = new com/tencent/mm/plugin/websearch/widget/a$2$2$2;
              ((a.2.2.2)localObject6).<init>(this);
              ((ac)localObject1).a((m)localObject6);
              localObject6 = new com/tencent/mm/plugin/websearch/widget/a$2$2$3;
              ((a.2.2.3)localObject6).<init>(this);
              ((ac)localObject1).a((m)localObject6);
              localObject6 = new com/tencent/mm/plugin/websearch/widget/a$2$2$4;
              ((a.2.2.4)localObject6).<init>(this);
              ((ac)localObject1).a((m)localObject6);
              localObject6 = new com/tencent/mm/plugin/websearch/widget/a$2$2$5;
              ((5)localObject6).<init>(this);
              ((ac)localObject1).a((m)localObject6);
              localObject6 = new com/tencent/mm/plugin/websearch/widget/a$2$2$6;
              ((a.2.2.6)localObject6).<init>(this);
              ((ac)localObject1).a((m)localObject6);
              localObject6 = new android/os/Bundle;
              ((Bundle)localObject6).<init>();
              ((Bundle)localObject6).putString("id", this.ucM.ucL);
              ((Bundle)localObject6).putString("appid", this.ucM.ucK.ubs.csB);
              ((Bundle)localObject6).putInt("serviceType", this.ucM.ucK.ubs.fmr);
              ((Bundle)localObject6).putInt("drawStrategy", this.ucM.hnH);
              ((Bundle)localObject6).putString("srcAppid", this.ucM.ucK.ubs.fpS);
              u.a(this.ucM.ucL, this.ucM.ucK.ubs.fmr, this.ucM.ucK.ubs.csB, this.ucM.ucK.ubs.fpS, this.ucM.hnH);
              localObject1 = a.h(this.ucM.ucJ).a(str, (View)localObject2, (Bundle)localObject5, (com.tencent.mm.modelappbrand.ab)localObject1);
              a.l(this.ucM.ucJ).put(localObject1, this.ucM.ucL);
              localObject1 = new com/tencent/mm/plugin/websearch/widget/a$2$2$1;
              ((a.2.2.1)localObject1).<init>(this);
              com.tencent.mm.ipcinvoker.f.a("com.tencent.mm", (Parcelable)localObject6, a.b.class, (c)localObject1);
              localObject5 = a.a(this.ucM.ucJ);
              localObject1 = new com/tencent/mm/plugin/websearch/widget/a$2$2$7;
              ((a.2.2.7)localObject1).<init>(this);
              com.tencent.mm.ipcinvoker.f.a((String)localObject5, (Parcelable)localObject6, a.b.class, (c)localObject1);
              localObject5 = com.tencent.mm.ipcinvoker.e.PN();
              localObject1 = new com/tencent/mm/plugin/websearch/widget/a$2$2$8;
              ((a.2.2.8)localObject1).<init>(this);
              com.tencent.mm.ipcinvoker.f.a((String)localObject5, (Parcelable)localObject6, a.b.class, (c)localObject1);
              a.a(this.ucM.ucJ, this.ucM.ucK, this.ucM.ucL, str, (View)localObject2, (AbsoluteLayout)localObject3, (ThreeDotsLoadingView)localObject4);
              a.c(this.ucM.ucJ).addView((View)localObject3);
              AppMethodBeat.o(91391);
              return;
              bool1 = false;
              continue;
              l = 2L;
            }
          }
          catch (Exception localException2)
          {
            while (true)
              com.tencent.mm.sdk.platformtools.ab.e("FTSSearchWidgetMgr", "the color is error : ");
          }
        }
      }
      catch (Exception localException1)
      {
        label2183: 
        while (true)
        {
          int i;
          boolean bool2;
          com.tencent.mm.sdk.platformtools.ab.printErrStackTrace("FTSSearchWidgetMgr", localException1, "", new Object[0]);
          AppMethodBeat.o(91391);
          continue;
          a.a(this.ucM.ucJ, "com.tencent.mm:support");
          continue;
          label2131: if (i == 3)
          {
            i = 1005;
          }
          else if (i == 16)
          {
            i = 1042;
          }
          else if (i == 20)
          {
            i = 1053;
          }
          else
          {
            i = 1000;
            continue;
            bool2 = false;
          }
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.websearch.widget.a.2.2
 * JD-Core Version:    0.6.2
 */