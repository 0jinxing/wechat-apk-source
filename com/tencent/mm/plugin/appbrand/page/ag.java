package com.tencent.mm.plugin.appbrand.page;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.MutableContextWrapper;
import android.graphics.Canvas;
import android.os.Build.VERSION;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.animation.DecelerateInterpolator;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.jg.JgClassChecked;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.h.h;
import com.tencent.mm.plugin.appbrand.h.j;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bo;
import java.net.URL;

@JgClassChecked(author=10, fComment="checked", lastDate="20180817", reviewer=10, vComment={com.jg.EType.HTTPSCHECK})
public final class ag extends WebView
  implements aj
{
  private WebViewClient bOQ;
  private WebChromeClient bOR;
  private af iuQ;
  private ad iuR;
  private ab iuj;
  private Animator iuk;
  private String ium;

  public ag(Context paramContext, ab paramab)
  {
    super(paramContext);
    AppMethodBeat.i(87321);
    this.bOQ = new ag.3(this);
    this.bOR = new DefaultWebViewImpl.4(this);
    this.iuj = paramab;
    getSettings().setDomStorageEnabled(true);
    getSettings().setJavaScriptEnabled(true);
    getSettings().setMediaPlaybackRequiresUserGesture(false);
    if (Build.VERSION.SDK_INT >= 21)
      getSettings().setMixedContentMode(0);
    getSettings().setUserAgentString(getSettings().getUserAgentString() + "/ DEMO");
    this.ium = getSettings().getUserAgentString();
    setHorizontalScrollBarEnabled(false);
    setVerticalScrollBarEnabled(false);
    setWebViewClient(this.bOQ);
    setWebChromeClient(this.bOR);
    setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
    AppMethodBeat.o(87321);
  }

  public final void H(Runnable paramRunnable)
  {
    AppMethodBeat.i(87324);
    postOnAnimation(paramRunnable);
    AppMethodBeat.o(87324);
  }

  public final void a(URL paramURL, String paramString, ValueCallback<String> paramValueCallback)
  {
    AppMethodBeat.i(87330);
    evaluateJavascript(paramString, paramValueCallback);
    AppMethodBeat.o(87330);
  }

  public final void a(URL paramURL, String paramString1, String paramString2, String paramString3, ValueCallback<String> paramValueCallback)
  {
    AppMethodBeat.i(87331);
    evaluateJavascript(paramString3, paramValueCallback);
    AppMethodBeat.o(87331);
  }

  public final void aAM()
  {
    AppMethodBeat.i(87337);
    super.scrollTo(getScrollX(), 0);
    AppMethodBeat.o(87337);
  }

  public final boolean aAN()
  {
    return false;
  }

  public final boolean aAO()
  {
    AppMethodBeat.i(87339);
    boolean bool;
    if (getWebScrollY() == 0)
    {
      bool = true;
      AppMethodBeat.o(87339);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(87339);
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
    AppMethodBeat.i(87325);
    super.loadDataWithBaseURL(paramString1, paramString2, "text/html", "UTF-8", null);
    AppMethodBeat.o(87325);
  }

  public final void cE(Context paramContext)
  {
    AppMethodBeat.i(87322);
    if (!(getContext() instanceof MutableContextWrapper))
      AppMethodBeat.o(87322);
    while (true)
    {
      return;
      ((MutableContextWrapper)getContext()).setBaseContext(paramContext);
      AppMethodBeat.o(87322);
    }
  }

  public final void destroy()
  {
    AppMethodBeat.i(87332);
    super.destroy();
    AppMethodBeat.o(87332);
  }

  public final void evaluateJavascript(String paramString, ValueCallback<String> paramValueCallback)
  {
    AppMethodBeat.i(87329);
    paramString = new ag.1(this, paramString, paramValueCallback);
    if (Looper.getMainLooper().getThread() == Thread.currentThread())
    {
      paramString.run();
      AppMethodBeat.o(87329);
    }
    while (true)
    {
      return;
      al.d(paramString);
      AppMethodBeat.o(87329);
    }
  }

  public final boolean g(Canvas paramCanvas)
  {
    AppMethodBeat.i(87323);
    draw(paramCanvas);
    AppMethodBeat.o(87323);
    return true;
  }

  public final View getContentView()
  {
    return this;
  }

  public final String getUserAgentString()
  {
    return this.ium;
  }

  public final int getWebScrollX()
  {
    AppMethodBeat.i(87326);
    int i = getScrollX();
    AppMethodBeat.o(87326);
    return i;
  }

  public final int getWebScrollY()
  {
    AppMethodBeat.i(87327);
    int i = getScrollY();
    AppMethodBeat.o(87327);
    return i;
  }

  public final View getWrapperView()
  {
    return this;
  }

  protected final void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    AppMethodBeat.i(87335);
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
    if (this.iuR != null)
      this.iuR.c(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
    AppMethodBeat.o(87335);
  }

  protected final void onScrollChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    AppMethodBeat.i(87336);
    super.onScrollChanged(paramInt1, paramInt2, paramInt3, paramInt4);
    if (this.iuQ != null)
      this.iuQ.onScrollChanged(paramInt1, paramInt2, paramInt3, paramInt4, this);
    AppMethodBeat.o(87336);
  }

  public final void setFullscreenImpl(c paramc)
  {
  }

  public final void setJsExceptionHandler(h paramh)
  {
  }

  public final void setOnScrollChangedListener(af paramaf)
  {
    this.iuQ = paramaf;
  }

  public final void setOnTrimListener(ae paramae)
  {
  }

  public final void setTitle(String paramString)
  {
    AppMethodBeat.i(87328);
    if (bo.isNullOrNil(paramString))
      AppMethodBeat.o(87328);
    while (true)
    {
      return;
      evaluateJavascript("document.title=\"" + paramString + "\"", null);
      AppMethodBeat.o(87328);
    }
  }

  public final void setWebViewLayoutListener(ad paramad)
  {
    this.iuR = paramad;
  }

  public final void wU()
  {
    AppMethodBeat.i(87333);
    super.onResume();
    AppMethodBeat.o(87333);
  }

  public final void wW()
  {
    AppMethodBeat.i(87334);
    super.onPause();
    AppMethodBeat.o(87334);
  }

  public final void z(int paramInt, long paramLong)
  {
    AppMethodBeat.i(87338);
    if (this.iuk != null)
    {
      this.iuk.cancel();
      this.iuk = null;
    }
    ValueAnimator localValueAnimator = ValueAnimator.ofInt(new int[] { getContentView().getScrollY(), paramInt });
    localValueAnimator.addUpdateListener(new ag.2(this));
    localValueAnimator.setInterpolator(new DecelerateInterpolator());
    localValueAnimator.setDuration(paramLong);
    localValueAnimator.start();
    this.iuk = localValueAnimator;
    AppMethodBeat.o(87338);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.page.ag
 * JD-Core Version:    0.6.2
 */