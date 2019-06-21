package com.tencent.mm.plugin.appbrand.dynamic.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.os.Bundle;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ipcinvoker.type.IPCBoolean;
import com.tencent.mm.modelappbrand.ad;
import com.tencent.mm.modelappbrand.af;
import com.tencent.mm.modelappbrand.ag;
import com.tencent.mm.modelappbrand.ah;
import com.tencent.mm.modelappbrand.ai;
import com.tencent.mm.modelappbrand.aj;
import com.tencent.mm.modelappbrand.n;
import com.tencent.mm.modelappbrand.t;
import com.tencent.mm.modelappbrand.y;
import com.tencent.mm.plugin.appbrand.canvas.widget.DrawCanvasArg;
import com.tencent.mm.plugin.appbrand.canvas.widget.a.a;
import com.tencent.mm.plugin.appbrand.dynamic.a.f;
import com.tencent.mm.plugin.appbrand.dynamic.a.g;
import com.tencent.mm.plugin.appbrand.dynamic.h;
import com.tencent.mm.plugin.appbrand.dynamic.i;
import com.tencent.mm.plugin.appbrand.widget.e;
import com.tencent.mm.sdk.platformtools.ak;
import org.json.JSONArray;

public class IPCDynamicPageView extends LinearLayout
  implements n, com.tencent.mm.plugin.appbrand.canvas.widget.a, h
{
  public static ak hlg;
  private static LinearLayout.LayoutParams hpv;
  public String eIq;
  private long hcu;
  private e hll;
  private Bundle hpn;
  private com.tencent.mm.plugin.appbrand.dynamic.a hpo;
  public com.tencent.mm.modelappbrand.ab hpp;
  public volatile boolean hpq;
  public long hpr;
  private com.tencent.mm.plugin.appbrand.canvas.widget.a hps;
  private Runnable hpt;
  private Runnable hpu;
  private volatile boolean mDetached;

  static
  {
    AppMethodBeat.i(11084);
    HandlerThread localHandlerThread = com.tencent.mm.sdk.g.d.anM("WxaWidget#UIActionThread");
    localHandlerThread.start();
    hlg = new ak(localHandlerThread.getLooper());
    hpv = new LinearLayout.LayoutParams(-1, -1);
    AppMethodBeat.o(11084);
  }

  public IPCDynamicPageView(Context paramContext)
  {
    super(paramContext);
    AppMethodBeat.i(11044);
    this.hpt = new IPCDynamicPageView.1(this);
    this.hpu = new IPCDynamicPageView.2(this);
    init(paramContext);
    AppMethodBeat.o(11044);
  }

  public IPCDynamicPageView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(11045);
    this.hpt = new IPCDynamicPageView.1(this);
    this.hpu = new IPCDynamicPageView.2(this);
    init(paramContext);
    AppMethodBeat.o(11045);
  }

  public IPCDynamicPageView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    AppMethodBeat.i(11046);
    this.hpt = new IPCDynamicPageView.1(this);
    this.hpu = new IPCDynamicPageView.2(this);
    init(paramContext);
    AppMethodBeat.o(11046);
  }

  private void init(Context paramContext)
  {
    AppMethodBeat.i(11047);
    this.hpo = new com.tencent.mm.plugin.appbrand.dynamic.a(this);
    paramContext = b.bS(paramContext);
    addView(paramContext, hpv);
    this.hps = ((com.tencent.mm.plugin.appbrand.canvas.widget.a)paramContext);
    this.hps.setTraceId(this.eIq);
    AppMethodBeat.o(11047);
  }

  private void nP(int paramInt)
  {
    AppMethodBeat.i(11079);
    if (this.hpp == null)
    {
      com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.IPCDynamicPageView", "publishOnWidgetStateChanged(id : %s, state : %d) failed, listener wrapper is null.", new Object[] { this.eIq, Integer.valueOf(paramInt) });
      AppMethodBeat.o(11079);
    }
    while (true)
    {
      return;
      com.tencent.mm.modelappbrand.f localf = this.hpp.abN();
      if (localf == null)
      {
        com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.IPCDynamicPageView", "publishOnWidgetStateChanged(id : %s, state : %d) failed, listener is null.", new Object[] { this.eIq, Integer.valueOf(paramInt) });
        AppMethodBeat.o(11079);
      }
      else if (Looper.getMainLooper() == Looper.myLooper())
      {
        localf.F(this, paramInt);
        AppMethodBeat.o(11079);
      }
      else
      {
        com.tencent.mm.plugin.appbrand.dynamic.b.E(new IPCDynamicPageView.7(this, localf, paramInt));
        AppMethodBeat.o(11079);
      }
    }
  }

  public final void C(Runnable paramRunnable)
  {
    AppMethodBeat.i(11066);
    this.hps.C(paramRunnable);
    AppMethodBeat.o(11066);
  }

  public final void a(DrawCanvasArg paramDrawCanvasArg, a.a parama)
  {
    AppMethodBeat.i(11063);
    this.hps.a(paramDrawCanvasArg, parama);
    AppMethodBeat.o(11063);
  }

  public final void a(String paramString, t paramt)
  {
    AppMethodBeat.i(11055);
    if (this.hpp == null)
    {
      paramt.b(false, "listener is null", null);
      AppMethodBeat.o(11055);
    }
    while (true)
    {
      return;
      ah localah = (ah)this.hpp.px("openApp");
      if (localah == null)
      {
        paramt.b(false, "listener is null", null);
        AppMethodBeat.o(11055);
      }
      else
      {
        localah.pz(paramString);
        AppMethodBeat.o(11055);
      }
    }
  }

  public final void a(String paramString1, String paramString2, t paramt)
  {
    AppMethodBeat.i(11057);
    if (this.hpp == null)
    {
      paramt.b(false, "listener is null", null);
      AppMethodBeat.o(11057);
    }
    while (true)
    {
      return;
      y localy = (y)this.hpp.px("showPicker");
      if (localy == null)
      {
        paramt.b(false, "listener is null", null);
        AppMethodBeat.o(11057);
      }
      else
      {
        localy.a(paramString1, paramString2, paramt);
        AppMethodBeat.o(11057);
      }
    }
  }

  public final void a(JSONArray paramJSONArray, a.a parama)
  {
    AppMethodBeat.i(11061);
    this.hps.a(paramJSONArray, parama);
    AppMethodBeat.o(11061);
  }

  public final void a(boolean paramBoolean1, String paramString, boolean paramBoolean2, t paramt)
  {
    AppMethodBeat.i(11056);
    if (this.hpp == null)
    {
      paramt.b(false, "listener is null", null);
      AppMethodBeat.o(11056);
    }
    while (true)
    {
      return;
      af localaf = (af)this.hpp.px("OnTapCallback");
      if (localaf == null)
      {
        paramt.b(false, "listener is null", null);
        AppMethodBeat.o(11056);
      }
      else
      {
        localaf.b(paramBoolean1, paramString, paramBoolean2);
        AppMethodBeat.o(11056);
      }
    }
  }

  public final boolean ap(String paramString1, String paramString2)
  {
    AppMethodBeat.i(11080);
    Object localObject = this.hpo;
    String str = this.eIq;
    boolean bool;
    if ((((com.tencent.mm.plugin.appbrand.dynamic.a)localObject).eIq == null) || (((com.tencent.mm.plugin.appbrand.dynamic.a)localObject).eIq.length() == 0) || (paramString1 == null) || (paramString1.length() == 0))
    {
      AppMethodBeat.o(11080);
      bool = false;
    }
    while (true)
    {
      return bool;
      localObject = new Bundle();
      ((Bundle)localObject).putString("id", str);
      ((Bundle)localObject).putString("event", paramString1);
      ((Bundle)localObject).putString("data", paramString2);
      paramString1 = (IPCBoolean)com.tencent.mm.ipcinvoker.f.a(i.azC().zV(str), (Parcelable)localObject, a.f.class);
      if (paramString1 != null)
      {
        bool = paramString1.value;
        AppMethodBeat.o(11080);
      }
      else
      {
        AppMethodBeat.o(11080);
        bool = false;
      }
    }
  }

  public final void ayc()
  {
    AppMethodBeat.i(11060);
    long l = System.currentTimeMillis() - this.hcu;
    hlg.removeCallbacks(this.hpt);
    if (l < 12L)
    {
      hlg.postDelayed(this.hpt, l);
      AppMethodBeat.o(11060);
    }
    while (true)
    {
      return;
      this.hpt.run();
      AppMethodBeat.o(11060);
    }
  }

  public final void ayd()
  {
    AppMethodBeat.i(11065);
    this.hps.ayd();
    AppMethodBeat.o(11065);
  }

  public final void aye()
  {
    AppMethodBeat.i(11077);
    this.hps.aye();
    AppMethodBeat.o(11077);
  }

  public final void azB()
  {
    AppMethodBeat.i(11052);
    if (this.hpp == null)
      AppMethodBeat.o(11052);
    while (true)
    {
      return;
      ag localag = (ag)this.hpp.px("onUiUpdate");
      if (localag == null)
      {
        AppMethodBeat.o(11052);
      }
      else
      {
        localag.abP();
        AppMethodBeat.o(11052);
      }
    }
  }

  public final void b(int paramInt, t paramt)
  {
    AppMethodBeat.i(11058);
    if (this.hpp == null)
    {
      paramt.b(false, "listener is null", null);
      AppMethodBeat.o(11058);
    }
    while (true)
    {
      return;
      aj localaj = (aj)this.hpp.px("setWidgetSize");
      if (localaj == null)
      {
        paramt.b(false, "listener is null", null);
        AppMethodBeat.o(11058);
      }
      else
      {
        localaj.a(paramInt, paramt);
        AppMethodBeat.o(11058);
      }
    }
  }

  public final void b(DrawCanvasArg paramDrawCanvasArg, a.a parama)
  {
    AppMethodBeat.i(11064);
    this.hps.b(paramDrawCanvasArg, parama);
    AppMethodBeat.o(11064);
  }

  public final void b(String paramString, t paramt)
  {
    AppMethodBeat.i(11053);
    if (this.hpp == null)
    {
      paramt.b(false, "listener is null", null);
      AppMethodBeat.o(11053);
    }
    while (true)
    {
      return;
      ad localad = (ad)this.hpp.px("makePhoneCall");
      if (localad == null)
      {
        paramt.b(false, "listener is null", null);
        AppMethodBeat.o(11053);
      }
      else
      {
        localad.py(paramString);
        AppMethodBeat.o(11053);
      }
    }
  }

  public final void b(JSONArray paramJSONArray, a.a parama)
  {
    AppMethodBeat.i(11062);
    this.hps.b(paramJSONArray, parama);
    AppMethodBeat.o(11062);
  }

  public final void c(String paramString, t paramt)
  {
    AppMethodBeat.i(11054);
    if (this.hpp == null)
    {
      paramt.b(false, "listener is null", null);
      AppMethodBeat.o(11054);
    }
    while (true)
    {
      return;
      ai localai = (ai)this.hpp.px("onSearchWAWidgetReloadData");
      if (localai == null)
      {
        paramt.b(false, "listener is null", null);
        AppMethodBeat.o(11054);
      }
      else
      {
        localai.pA(paramString);
        AppMethodBeat.o(11054);
      }
    }
  }

  public final void cleanup()
  {
    AppMethodBeat.i(11050);
    if (this.hll != null)
      com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.IPCDynamicPageView", "cleanup(id : %s, %s, %s, %s)", new Object[] { this.eIq, this.hll.field_id, this.hll.field_appId, this.hll.field_cacheKey });
    while (true)
    {
      ayd();
      AppMethodBeat.o(11050);
      return;
      com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.IPCDynamicPageView", "cleanup(id : %s)", new Object[] { this.eIq });
    }
  }

  public final void d(String paramString1, String paramString2, Bundle paramBundle)
  {
    AppMethodBeat.i(11048);
    hlg.post(new IPCDynamicPageView.4(this, paramBundle, paramString1, paramString2));
    AppMethodBeat.o(11048);
  }

  public final void detach()
  {
    AppMethodBeat.i(11049);
    if (Looper.myLooper() == hlg.getLooper())
    {
      this.hpu.run();
      AppMethodBeat.o(11049);
    }
    while (true)
    {
      return;
      hlg.post(this.hpu);
      AppMethodBeat.o(11049);
    }
  }

  public final boolean e(Canvas paramCanvas)
  {
    AppMethodBeat.i(11059);
    boolean bool = this.hps.e(paramCanvas);
    AppMethodBeat.o(11059);
    return bool;
  }

  public com.tencent.mm.plugin.appbrand.canvas.d getDrawContext()
  {
    AppMethodBeat.i(11067);
    com.tencent.mm.plugin.appbrand.canvas.d locald = this.hps.getDrawContext();
    AppMethodBeat.o(11067);
    return locald;
  }

  public Bundle getExtData()
  {
    return this.hpn;
  }

  public String getExtId()
  {
    return this.eIq;
  }

  public String getSessionId()
  {
    AppMethodBeat.i(11074);
    String str = this.hps.getSessionId();
    AppMethodBeat.o(11074);
    return str;
  }

  public String getTraceId()
  {
    AppMethodBeat.i(11070);
    String str = this.hps.getTraceId();
    AppMethodBeat.o(11070);
    return str;
  }

  public final boolean isPaused()
  {
    AppMethodBeat.i(11073);
    boolean bool = this.hps.isPaused();
    AppMethodBeat.o(11073);
    return bool;
  }

  public final void nK(int paramInt)
  {
    AppMethodBeat.i(11051);
    nP(paramInt);
    detach();
    AppMethodBeat.o(11051);
  }

  public final void nQ(int paramInt)
  {
    AppMethodBeat.i(11081);
    this.hpo.aY(this.eIq, paramInt);
    AppMethodBeat.o(11081);
  }

  public final void onPause()
  {
    AppMethodBeat.i(11071);
    com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.IPCDynamicPageView", "onPause(%s)", new Object[] { this.eIq });
    hlg.post(new IPCDynamicPageView.5(this));
    AppMethodBeat.o(11071);
  }

  public final void onResume()
  {
    AppMethodBeat.i(11072);
    com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.IPCDynamicPageView", "onResume(%s)", new Object[] { this.eIq });
    this.hps.onResume();
    hlg.post(new IPCDynamicPageView.6(this));
    AppMethodBeat.o(11072);
  }

  protected void onSizeChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    AppMethodBeat.i(11078);
    super.onSizeChanged(paramInt1, paramInt2, paramInt3, paramInt4);
    com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.IPCDynamicPageView", "onSizeChanged(w : %d, h : %d, oldw : %d, oldh : %d)", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), Integer.valueOf(paramInt4) });
    Bundle localBundle1 = new Bundle();
    localBundle1.putInt("__page_view_width", paramInt1);
    localBundle1.putInt("__page_view_height", paramInt2);
    String str = this.eIq;
    Bundle localBundle2 = new Bundle();
    localBundle2.putString("id", str);
    localBundle2.putBundle("__env_args", localBundle1);
    com.tencent.mm.ipcinvoker.f.a(i.azC().zV(str), localBundle2, a.g.class, null);
    AppMethodBeat.o(11078);
  }

  public void setDrawActionReportable(com.tencent.mm.plugin.appbrand.canvas.c.a parama)
  {
    AppMethodBeat.i(11068);
    this.hps.setDrawActionReportable(parama);
    AppMethodBeat.o(11068);
  }

  public void setSessionId(String paramString)
  {
    AppMethodBeat.i(11075);
    this.hps.setSessionId(paramString);
    AppMethodBeat.o(11075);
  }

  public void setStartTime(long paramLong)
  {
    AppMethodBeat.i(11076);
    this.hps.setStartTime(paramLong);
    AppMethodBeat.o(11076);
  }

  public void setTraceId(String paramString)
  {
    AppMethodBeat.i(11069);
    this.hps.setTraceId(paramString);
    AppMethodBeat.o(11069);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.dynamic.widget.IPCDynamicPageView
 * JD-Core Version:    0.6.2
 */