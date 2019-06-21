package com.tencent.mm.plugin.appbrand.page;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.MutableContextWrapper;
import android.graphics.Canvas;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.animation.DecelerateInterpolator;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient.CustomViewCallback;
import com.jg.JgClassChecked;
import com.tencent.luggage.i.a.a;
import com.tencent.luggage.i.a.e;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.e.f;
import com.tencent.mm.plugin.appbrand.h.h;
import com.tencent.mm.plugin.appbrand.h.j;
import com.tencent.mm.pluginsdk.ui.tools.u;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.widget.MMWebView;
import com.tencent.xweb.WebView;
import com.tencent.xweb.l;
import com.tencent.xweb.p;
import com.tencent.xweb.r;
import com.tencent.xweb.s;
import java.net.URL;
import java.util.Set;
import org.xwalk.core.XWalkEnvironment;
import org.xwalk.core.XWalkView;

@SuppressLint({"ViewConstructor"})
@JgClassChecked(author=10000, fComment="checked", lastDate="20180919", reviewer=10000, vComment={com.jg.EType.HTTPSCHECK})
public final class aa extends MMWebView
  implements com.tencent.mm.plugin.appbrand.jsapi.u.c, aj
{
  private r icr;
  private com.tencent.xweb.x5.a.a.a.a.b ics;
  private c isR;
  private af iug;
  private ad iuh;
  private ae iui;
  private ab iuj;
  private Animator iuk;
  private boolean iul;
  private String ium;
  private f iun;
  private s iuo;
  private l iup;

  public aa(Context paramContext, ab paramab)
  {
    super(new MutableContextWrapper(paramContext));
    AppMethodBeat.i(132472);
    this.iuh = null;
    this.iul = false;
    this.iuo = new aa.5(this);
    this.iup = new l()
    {
      public final void onHideCustomView()
      {
        AppMethodBeat.i(132453);
        try
        {
          if (aa.b(aa.this) != null)
            aa.b(aa.this).aIZ();
          AppMethodBeat.o(132453);
          return;
        }
        catch (Exception localException)
        {
          while (true)
          {
            com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.AppBrandWebView", "onHideCustomView error " + localException.getMessage());
            AppMethodBeat.o(132453);
          }
        }
      }

      public final void onShowCustomView(View paramAnonymousView, WebChromeClient.CustomViewCallback paramAnonymousCustomViewCallback)
      {
        AppMethodBeat.i(132452);
        try
        {
          if (aa.b(aa.this) != null)
          {
            aa.b(aa.this).G(paramAnonymousView, 90);
            aa.b(aa.this).iqP = paramAnonymousCustomViewCallback;
          }
          AppMethodBeat.o(132452);
          return;
        }
        catch (Exception paramAnonymousView)
        {
          while (true)
          {
            com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.AppBrandWebView", "onShowCustomView error " + paramAnonymousView.getMessage());
            AppMethodBeat.o(132452);
          }
        }
      }
    };
    this.icr = new aa.7(this);
    this.ics = new aa.8(this);
    this.inited = true;
    this.iuj = paramab;
    getSettings().dUh();
    getSettings().setJavaScriptEnabled(true);
    getSettings().setMediaPlaybackRequiresUserGesture(false);
    getSettings().dUj();
    getSettings().setUserAgentString(u.bh(getContext(), getSettings().getUserAgentString()));
    this.ium = getSettings().getUserAgentString();
    getView().setHorizontalScrollBarEnabled(false);
    getView().setVerticalScrollBarEnabled(false);
    setWebViewClient(this.iuo);
    setWebChromeClient(this.iup);
    setWebViewCallbackClient(this.icr);
    setWebViewClientExtension(this.ics);
    getIsX5Kernel();
    getSettings().setUsingForAppBrand(1);
    com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.AppBrandWebView", "Is the current browser kernel X5, " + getIsX5Kernel());
    if (com.tencent.mm.plugin.appbrand.e.b.hpK == null)
      com.tencent.mm.plugin.appbrand.e.b.hpK = new com.tencent.mm.plugin.appbrand.e.b();
    paramContext = com.tencent.mm.plugin.appbrand.e.b.hpK;
    if (!XWalkEnvironment.isCurrentVersionSupportExtendPluginForAppbrand())
      com.tencent.mm.sdk.platformtools.ab.w("MicroMsg.AppBrand.SameLayer.WebViewExtendPluginUtil", "applyExtendPluginClientIfNeed, current version not support extend plugin");
    while (true)
    {
      paramContext = null;
      while (true)
      {
        this.iun = ((f)paramContext);
        if (this.iun != null)
        {
          paramContext = this.iun;
          if (com.tencent.mm.plugin.appbrand.e.c.hpL == null)
            com.tencent.mm.plugin.appbrand.e.c.hpL = new com.tencent.mm.plugin.appbrand.e.c();
          paramContext.a(com.tencent.mm.plugin.appbrand.e.c.hpL);
        }
        setBackgroundColor(-1);
        setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        setOnLongClickListener(new aa.1(this));
        setDownloadListener(new aa.2(this));
        AppMethodBeat.o(132472);
        return;
        if (!isXWalkKernel())
          break label469;
        com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.AppBrand.SameLayer.WebViewExtendPluginUtil", "applyExtendPluginClientIfNeed, webview(%s) is xweb kernel", new Object[] { Integer.valueOf(hashCode()) });
        paramab = getWebViewUI();
        if ((paramab == null) || (!(paramab instanceof XWalkView)) || (paramContext == null))
          break;
        paramab = (XWalkView)paramab;
        paramContext = paramContext.yq();
        e locale = new e(paramab);
        locale.bSf = paramContext;
        paramContext.a(locale);
        paramab.setExtendPluginClient(locale);
        com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.AppBrand.SameLayer.WebViewExtendPluginUtil", "applyExtendPluginClientIfNeed, set extend plugin client success");
      }
      com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.AppBrand.SameLayer.WebViewExtendPluginUtil", "applyExtendPluginClientIfNeed, set extend plugin client fail");
      continue;
      label469: com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.AppBrand.SameLayer.WebViewExtendPluginUtil", "applyExtendPluginClientIfNeed, current webview is not xweb kernel");
    }
  }

  public final void H(Runnable paramRunnable)
  {
    AppMethodBeat.i(132476);
    if (isXWalkKernel())
    {
      postDelayed(paramRunnable, 200L);
      AppMethodBeat.o(132476);
    }
    while (true)
    {
      return;
      postOnAnimation(paramRunnable);
      AppMethodBeat.o(132476);
    }
  }

  public final void a(URL paramURL, String paramString, ValueCallback<String> paramValueCallback)
  {
    AppMethodBeat.i(132480);
    evaluateJavascript(paramString, paramValueCallback);
    AppMethodBeat.o(132480);
  }

  public final void a(URL paramURL, String paramString1, String paramString2, String paramString3, ValueCallback<String> paramValueCallback)
  {
    AppMethodBeat.i(132481);
    evaluateJavascript(paramString3, paramValueCallback);
    AppMethodBeat.o(132481);
  }

  public final void aAM()
  {
    AppMethodBeat.i(132486);
    getView().scrollTo(getWebScrollX(), 0);
    AppMethodBeat.o(132486);
  }

  public final boolean aAN()
  {
    return this.iul;
  }

  public final boolean aAO()
  {
    AppMethodBeat.i(132488);
    boolean bool;
    if ((isXWalkKernel()) && (XWalkEnvironment.getAvailableVersion() >= 472))
    {
      bool = isOverScrollStart();
      AppMethodBeat.o(132488);
    }
    while (true)
    {
      return bool;
      if (getWebScrollY() == 0)
      {
        bool = true;
        AppMethodBeat.o(132488);
      }
      else
      {
        bool = false;
        AppMethodBeat.o(132488);
      }
    }
  }

  public final boolean aAP()
  {
    return true;
  }

  public final <T extends j> T af(Class<T> paramClass)
  {
    return null;
  }

  public final void bU(String paramString1, String paramString2)
  {
    AppMethodBeat.i(132477);
    this.iul = false;
    super.loadDataWithBaseURL(paramString1, paramString2, "text/html", "UTF-8", null);
    AppMethodBeat.o(132477);
  }

  public final void cE(Context paramContext)
  {
    AppMethodBeat.i(132473);
    if (!(getContext() instanceof MutableContextWrapper))
      AppMethodBeat.o(132473);
    while (true)
    {
      return;
      ((MutableContextWrapper)getContext()).setBaseContext(paramContext);
      AppMethodBeat.o(132473);
    }
  }

  public final void destroy()
  {
    AppMethodBeat.i(132483);
    super.destroy();
    if (this.iuk != null)
    {
      this.iuk.cancel();
      this.iuk = null;
    }
    if (this.isR != null)
      this.isR.iqR.clear();
    this.isR = null;
    cE(getContext().getApplicationContext());
    AppMethodBeat.o(132483);
  }

  public final void evaluateJavascript(String paramString, ValueCallback<String> paramValueCallback)
  {
    AppMethodBeat.i(132479);
    paramString = new aa.3(this, paramString, paramValueCallback);
    if (Looper.getMainLooper().getThread() == Thread.currentThread())
    {
      paramString.run();
      AppMethodBeat.o(132479);
    }
    while (true)
    {
      return;
      al.d(paramString);
      AppMethodBeat.o(132479);
    }
  }

  public final boolean g(Canvas paramCanvas)
  {
    AppMethodBeat.i(132475);
    if (isXWalkKernel())
      drawCanvas(paramCanvas);
    while (true)
    {
      AppMethodBeat.o(132475);
      return true;
      draw(paramCanvas);
    }
  }

  public final View getContentView()
  {
    AppMethodBeat.i(132474);
    View localView = super.getView();
    AppMethodBeat.o(132474);
    return localView;
  }

  public final String getUserAgentString()
  {
    return this.ium;
  }

  public final f getWebViewPluginClientProxy()
  {
    return this.iun;
  }

  public final View getWrapperView()
  {
    return this;
  }

  protected final void onAttachedToWindow()
  {
    AppMethodBeat.i(132482);
    try
    {
      super.onAttachedToWindow();
      AppMethodBeat.o(132482);
      return;
    }
    catch (SecurityException localSecurityException)
    {
      while (true)
        AppMethodBeat.o(132482);
    }
  }

  protected final void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    AppMethodBeat.i(132489);
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
    if (this.iuh != null)
      this.iuh.c(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
    AppMethodBeat.o(132489);
  }

  public final void setFullscreenImpl(c paramc)
  {
    this.isR = paramc;
  }

  public final void setJsExceptionHandler(h paramh)
  {
  }

  public final void setOnScrollChangedListener(af paramaf)
  {
    this.iug = paramaf;
  }

  public final void setOnTrimListener(ae paramae)
  {
    this.iui = paramae;
  }

  public final void setTitle(String paramString)
  {
    AppMethodBeat.i(132478);
    if (bo.isNullOrNil(paramString))
      AppMethodBeat.o(132478);
    while (true)
    {
      return;
      evaluateJavascript("document.title=\"" + paramString + "\"", null);
      AppMethodBeat.o(132478);
    }
  }

  public final void setWebViewLayoutListener(ad paramad)
  {
    this.iuh = paramad;
  }

  public final void wU()
  {
    AppMethodBeat.i(132484);
    onResume();
    AppMethodBeat.o(132484);
  }

  public final void wW()
  {
    AppMethodBeat.i(132485);
    onPause();
    AppMethodBeat.o(132485);
  }

  public final void z(int paramInt, long paramLong)
  {
    AppMethodBeat.i(132487);
    if (this.iuk != null)
    {
      this.iuk.cancel();
      this.iuk = null;
    }
    ValueAnimator localValueAnimator = ValueAnimator.ofInt(new int[] { getWebScrollY(), paramInt });
    localValueAnimator.addUpdateListener(new aa.4(this));
    localValueAnimator.setInterpolator(new DecelerateInterpolator());
    localValueAnimator.setDuration(paramLong);
    localValueAnimator.start();
    this.iuk = localValueAnimator;
    AppMethodBeat.o(132487);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.page.aa
 * JD-Core Version:    0.6.2
 */