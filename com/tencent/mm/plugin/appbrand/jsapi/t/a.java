package com.tencent.mm.plugin.appbrand.jsapi.t;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.webkit.URLUtil;
import android.widget.FrameLayout;
import com.tencent.luggage.a.e;
import com.tencent.luggage.sdk.config.AppBrandInitConfigLU;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.appcache.WxaPkgWrappingInfo;
import com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC;
import com.tencent.mm.plugin.appbrand.config.AppBrandSysConfigWC;
import com.tencent.mm.plugin.appbrand.config.h;
import com.tencent.mm.plugin.appbrand.i;
import com.tencent.mm.plugin.appbrand.jsapi.ah;
import com.tencent.mm.plugin.appbrand.o;
import com.tencent.mm.plugin.appbrand.page.w;
import com.tencent.mm.plugin.appbrand.page.y;
import com.tencent.mm.plugin.appbrand.report.AppBrandStatObject;
import com.tencent.mm.plugin.appbrand.report.c;
import com.tencent.mm.plugin.appbrand.report.model.g;
import com.tencent.mm.plugin.appbrand.widget.input.n;
import com.tencent.mm.plugin.appbrand.widget.input.u.c;
import com.tencent.mm.plugin.webview.ui.tools.widget.f;
import com.tencent.mm.plugin.webview.ui.tools.widget.f.a;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.base.MMFalseProgressBar;
import com.tencent.mm.ui.widget.MMWebView;
import java.io.File;
import java.util.LinkedList;
import org.json.JSONObject;

public final class a extends FrameLayout
  implements c.c
{
  private int eO;
  private MMFalseProgressBar fou;
  MMWebView fow;
  w hyU;
  private b icj;
  private final c.b ick;
  private String icl;
  private boolean icm;
  boolean icn;
  private com.tencent.mm.plugin.appbrand.widget.input.u ico;
  private final u.c icp;
  private a.c icq;
  private com.tencent.xweb.r icr;
  private com.tencent.xweb.x5.a.a.a.a.b ics;
  private String mAppId;

  @SuppressLint({"SetJavaScriptEnabled"})
  public a(Context paramContext, i parami, w paramw)
  {
    super(paramContext);
    AppMethodBeat.i(131650);
    this.eO = 0;
    this.icl = "";
    this.icm = true;
    this.icn = false;
    this.ico = null;
    this.icp = new a.1(this);
    this.icr = new a.3(this);
    this.ics = new a.4(this);
    this.mAppId = parami.mAppId;
    this.icj = new b();
    this.icj.i(paramw);
    this.hyU = paramw;
    this.fow = f.a.uJi.du(paramContext);
    this.fow.getSettings().dUh();
    this.fow.getSettings().setJavaScriptEnabled(true);
    this.fow.getSettings().setMediaPlaybackRequiresUserGesture(false);
    this.fow.getSettings().dUj();
    paramw = this.fow.getSettings().getUserAgentString();
    parami = paramw;
    if (!com.tencent.mm.pluginsdk.ui.tools.u.akj(paramw))
      parami = com.tencent.mm.pluginsdk.ui.tools.u.bh(getContext(), paramw);
    parami = parami + " miniProgram";
    this.fow.getSettings().setUserAgentString(parami);
    this.fow.getView().setHorizontalScrollBarEnabled(false);
    this.fow.getView().setVerticalScrollBarEnabled(false);
    this.fow.getSettings().setBuiltInZoomControls(true);
    this.fow.getSettings().setUseWideViewPort(true);
    this.fow.getSettings().setLoadWithOverviewMode(true);
    this.fow.getSettings().dUc();
    this.fow.getSettings().dUb();
    this.fow.getSettings().setGeolocationEnabled(true);
    this.fow.getSettings().setJavaScriptCanOpenWindowsAutomatically(true);
    this.fow.getSettings().dUf();
    this.fow.getSettings().setAppCachePath(getContext().getDir("webviewcache", 0).getAbsolutePath());
    this.fow.getSettings().dUe();
    this.fow.getSettings().dUg();
    this.fow.getSettings().setDatabasePath(com.tencent.mm.loader.j.b.eSi + "databases/");
    this.fow.setWebViewCallbackClient(this.icr);
    if (this.fow.getIsX5Kernel())
      this.fow.setWebViewClientExtension(this.ics);
    this.fow.getSettings().setUsingForAppBrand(2);
    addView(this.fow, new ViewGroup.LayoutParams(-1, -1));
    this.fou = new MMFalseProgressBar(paramContext);
    this.fou.setProgressDrawable(com.tencent.mm.bz.a.g(paramContext, 2130839564));
    addView(this.fou, new ViewGroup.LayoutParams(-1, com.tencent.mm.bz.a.fromDPToPix(paramContext, 3)));
    this.ick = ((c.a)e.B(c.a.class)).a(this);
    this.hyU.a(new a.2(this));
    getReporter().iCA = true;
    AppMethodBeat.o(131650);
  }

  private void a(com.tencent.mm.plugin.appbrand.page.u paramu, String paramString)
  {
    AppMethodBeat.i(131665);
    runOnUiThread(new a.5(this, paramu, paramString));
    AppMethodBeat.o(131665);
  }

  private void aGq()
  {
    AppMethodBeat.i(131662);
    this.fow.evaluateJavascript("window.__wxjs_environment = \"miniprogram\";", null);
    AppMethodBeat.o(131662);
  }

  private void setCurrentURL(String paramString)
  {
    AppMethodBeat.i(131664);
    this.icl = paramString;
    if (!bo.isNullOrNil(paramString))
    {
      paramString = Uri.parse(paramString).getHost();
      if (!bo.isNullOrNil(paramString))
      {
        paramString = getContext().getString(2131305572, new Object[] { paramString });
        a(this.hyU, paramString);
        AppMethodBeat.o(131664);
      }
    }
    while (true)
    {
      return;
      a(this.hyU, "");
      AppMethodBeat.o(131664);
    }
  }

  public final void BV(String paramString)
  {
    AppMethodBeat.i(131657);
    if ((TextUtils.isEmpty(paramString)) || (URLUtil.isValidUrl(paramString)))
      AppMethodBeat.o(131657);
    while (true)
    {
      return;
      this.hyU.AB(paramString);
      AppMethodBeat.o(131657);
    }
  }

  public final void BW(String paramString)
  {
    AppMethodBeat.i(131658);
    aGq();
    this.fou.start();
    new a.b((byte)0).i(this.hyU).n("src", paramString).n("htmlId", Integer.valueOf(this.eO)).aCj();
    AppMethodBeat.o(131658);
  }

  public final void D(JSONObject paramJSONObject)
  {
    AppMethodBeat.i(131656);
    this.icj.a(this.hyU.getRuntime().atK(), this.hyU.hashCode()).AL(paramJSONObject.toString()).aCj();
    AppMethodBeat.o(131656);
  }

  public final void aGp()
  {
    AppMethodBeat.i(131661);
    this.hyU.getRuntime().atJ().aAU();
    AppMethodBeat.o(131661);
  }

  public final boolean aGr()
  {
    AppMethodBeat.i(131667);
    try
    {
      if (this.hyU.getRuntime().atH().bQf)
      {
        bool = this.hyU.getRuntime().atH().bQs;
        AppMethodBeat.o(131667);
      }
      while (true)
      {
        return bool;
        bool = this.hyU.getRuntime().atH().bQp;
        AppMethodBeat.o(131667);
      }
    }
    catch (NullPointerException localNullPointerException)
    {
      while (true)
      {
        boolean bool = false;
        AppMethodBeat.o(131667);
      }
    }
  }

  public final void bF(String paramString)
  {
    AppMethodBeat.i(131659);
    aGq();
    this.fou.finish();
    if ((!this.icm) && (!this.icn))
    {
      com.tencent.mm.plugin.appbrand.report.model.p localp = getReporter();
      w localw = this.hyU;
      String str = this.icl;
      localp.iBB = ((String)localp.iCy.peekFirst());
      localp.iBC = 2;
      localp.iBD = paramString;
      localp.iCy.push(str);
      localp.q(localw);
    }
    this.icm = false;
    this.icn = false;
    setCurrentURL(paramString);
    new a.a((byte)0).i(this.hyU).n("src", paramString).n("htmlId", Integer.valueOf(this.eO)).aCj();
    AppMethodBeat.o(131659);
  }

  public final boolean dispatchTouchEvent(MotionEvent paramMotionEvent)
  {
    AppMethodBeat.i(131651);
    switch (paramMotionEvent.getActionMasked())
    {
    case 2:
    default:
    case 0:
    case 1:
    case 3:
    }
    while (true)
    {
      boolean bool = super.dispatchTouchEvent(paramMotionEvent);
      if (!bool)
        this.hyU.isK.requestDisallowInterceptTouchEvent(false);
      AppMethodBeat.o(131651);
      return bool;
      this.hyU.isK.requestDisallowInterceptTouchEvent(true);
      continue;
      this.hyU.isK.requestDisallowInterceptTouchEvent(false);
    }
  }

  public final String getAppId()
  {
    return this.mAppId;
  }

  public final String[] getJsApiReportArgs()
  {
    AppMethodBeat.i(131666);
    Object localObject1 = this.hyU;
    Object localObject2 = ((w)localObject1).getRuntime();
    Object localObject3 = ((com.tencent.luggage.sdk.b.b)localObject2).ya().bQn;
    Object localObject4 = ((o)localObject2).atI();
    Object localObject5 = ((w)localObject1).aJS();
    String str1 = ((AppBrandStatObject)localObject3).scene;
    String str2 = ((AppBrandStatObject)localObject3).cst;
    String str3 = ((i)localObject2).mAppId;
    String str4 = ((o)localObject2).atH().hhd.gVu;
    localObject4 = ((AppBrandInitConfigWC)localObject4).xz();
    String str5 = ((o)localObject2).atH().hhd.gVt + 1;
    String str6 = ((AppBrandStatObject)localObject3).iAo;
    String str7 = ((w)localObject1).getURL();
    if (localObject5 == null);
    for (localObject5 = ""; ; localObject5 = ((a)localObject5).getWebView().getUrl())
    {
      String str8 = c.cV(((com.tencent.mm.plugin.appbrand.page.u)localObject1).mContext);
      localObject1 = ((AppBrandStatObject)localObject3).cOq;
      localObject3 = ((AppBrandStatObject)localObject3).cOr;
      localObject2 = ((o)localObject2).atI().bQe + 1000;
      AppMethodBeat.o(131666);
      return new String[] { str1, str2, str3, str4, localObject4, str5, str6, str7, localObject5, str8, "", "", "", "", "", "", localObject1, localObject3, localObject2 };
    }
  }

  final com.tencent.mm.plugin.appbrand.report.model.p getReporter()
  {
    AppMethodBeat.i(131663);
    com.tencent.mm.plugin.appbrand.report.model.p localp = this.hyU.getRuntime().atJ().getReporter().aHZ();
    AppMethodBeat.o(131663);
    return localp;
  }

  public final MMWebView getWebView()
  {
    return this.fow;
  }

  public final void m(String paramString1, int paramInt, String paramString2)
  {
    AppMethodBeat.i(131660);
    new a.d((byte)0).i(this.hyU).n("htmlId", Integer.valueOf(this.eO)).n("errorCode", Integer.valueOf(paramInt)).n("description", paramString2).n("src", paramString1).aCj();
    AppMethodBeat.o(131660);
  }

  protected final void onAttachedToWindow()
  {
    AppMethodBeat.i(131653);
    super.onAttachedToWindow();
    this.ico = n.cI(this);
    if (this.ico != null)
      this.ico.a(this.icp);
    this.icq = new a.c(this, (byte)0);
    a.c localc = this.icq;
    localc.icu.hyU.a(localc);
    localc.icu.hyU.a(localc);
    this.icq.wU();
    AppMethodBeat.o(131653);
  }

  protected final void onDetachedFromWindow()
  {
    AppMethodBeat.i(131654);
    super.onDetachedFromWindow();
    if (!this.hyU.isRunning())
      getWebView().destroy();
    if (this.ico != null)
      this.ico.b(this.icp);
    if (this.icq != null)
    {
      this.icq.wW();
      a.c localc = this.icq;
      localc.icu.hyU.b(localc);
      localc.icu.hyU.b(localc);
      this.icq = null;
    }
    AppMethodBeat.o(131654);
  }

  protected final void onMeasure(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(131652);
    int i = paramInt2;
    ViewGroup localViewGroup;
    if ((getParent() instanceof ViewGroup))
    {
      localViewGroup = (ViewGroup)getParent();
      switch (View.MeasureSpec.getMode(paramInt2))
      {
      default:
        i = paramInt2;
      case 0:
      case -2147483648:
      case 1073741824:
      }
    }
    while (true)
    {
      super.onMeasure(paramInt1, i);
      AppMethodBeat.o(131652);
      return;
      i = View.MeasureSpec.makeMeasureSpec(localViewGroup.getMeasuredHeight(), -2147483648);
      continue;
      i = View.MeasureSpec.makeMeasureSpec(Math.max(0, Math.min(localViewGroup.getMeasuredHeight(), View.MeasureSpec.getSize(paramInt2))), -2147483648);
      continue;
      i = paramInt2;
      if (View.MeasureSpec.getSize(paramInt2) > localViewGroup.getMeasuredHeight())
        i = View.MeasureSpec.makeMeasureSpec(localViewGroup.getMeasuredHeight(), 1073741824);
    }
  }

  public final void runOnUiThread(Runnable paramRunnable)
  {
    AppMethodBeat.i(131655);
    if (al.isMainThread())
    {
      paramRunnable.run();
      AppMethodBeat.o(131655);
    }
    while (true)
    {
      return;
      post(paramRunnable);
      AppMethodBeat.o(131655);
    }
  }

  public final void setViewId(int paramInt)
  {
    this.eO = paramInt;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.t.a
 * JD-Core Version:    0.6.2
 */