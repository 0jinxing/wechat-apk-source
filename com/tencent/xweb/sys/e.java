package com.tencent.xweb.sys;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Build.VERSION;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.DownloadListener;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebView.FindListener;
import android.webkit.WebView.HitTestResult;
import android.webkit.WebViewClient;
import com.jg.JgClassChecked;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.xweb.WebView;
import com.tencent.xweb.WebView.a;
import com.tencent.xweb.WebView.b;
import com.tencent.xweb.a;
import com.tencent.xweb.c.h;
import com.tencent.xweb.i;
import com.tencent.xweb.l;
import com.tencent.xweb.p;
import com.tencent.xweb.r;
import com.tencent.xweb.s;
import com.tencent.xweb.t;
import java.util.HashMap;
import java.util.Map;
import org.xwalk.core.Log;
import org.xwalk.core.XWalkEnvironment;

@JgClassChecked(author=30, fComment="checked", lastDate="20171020", reviewer=30, vComment={com.jg.EType.JSEXECUTECHECK})
public final class e
  implements h
{
  WebView APS;
  e.a APT;
  s APU;
  l APV;
  d APW;
  f APX;
  long APY;
  com.tencent.xweb.extension.video.b APZ;
  e.b AQa;
  final String AQb;
  private WebViewClient bOQ;
  private WebChromeClient bOR;

  public e(WebView paramWebView)
  {
    AppMethodBeat.i(84701);
    this.APY = 0L;
    this.bOR = new SysWebView.1(this);
    this.bOQ = new e.1(this);
    this.AQb = "xwalkTempCallBack";
    this.APS = paramWebView;
    this.APT = new e.a(this, paramWebView.getContext());
    this.APT.setBackgroundColor(0);
    getSettings();
    this.APW = new d(this.APT);
    this.APT.setWebChromeClient(this.bOR);
    this.APT.setWebViewClient(this.bOQ);
    if (Build.VERSION.SDK_INT < 19)
    {
      this.AQa = new e.b();
      this.APT.addJavascriptInterface(this.AQa, "xwalkTempCallBack");
    }
    if ((paramWebView.getContext() instanceof Activity))
    {
      aH((Activity)paramWebView.getContext());
      AppMethodBeat.o(84701);
    }
    while (true)
    {
      return;
      aH(null);
      AppMethodBeat.o(84701);
    }
  }

  private void aH(Activity paramActivity)
  {
    AppMethodBeat.i(84702);
    Log.i("SysWebView", "initFullscreenVideo:" + getFullscreenVideoKind() + ",activity:" + paramActivity);
    if (getFullscreenVideoKind() == WebView.a.AMW)
      AppMethodBeat.o(84702);
    while (true)
    {
      return;
      this.APZ = com.tencent.xweb.extension.video.e.a(paramActivity, this.APS, this.APT, com.tencent.xweb.extension.video.d.dUq());
      if (getFullscreenVideoKind() == WebView.a.AMY)
        this.APZ.dh(this.APT);
      AppMethodBeat.o(84702);
    }
  }

  @SuppressLint({"JavascriptInterface"})
  public final void addJavascriptInterface(Object paramObject, String paramString)
  {
    AppMethodBeat.i(84725);
    this.APT.addJavascriptInterface(paramObject, paramString);
    AppMethodBeat.o(84725);
  }

  public final boolean canGoBack()
  {
    AppMethodBeat.i(84707);
    boolean bool = this.APT.canGoBack();
    AppMethodBeat.o(84707);
    return bool;
  }

  public final boolean canGoForward()
  {
    AppMethodBeat.i(84743);
    boolean bool = this.APT.canGoForward();
    AppMethodBeat.o(84743);
    return bool;
  }

  public final void clearHistory()
  {
    AppMethodBeat.i(84742);
    this.APT.clearHistory();
    AppMethodBeat.o(84742);
  }

  public final void clearMatches()
  {
    AppMethodBeat.i(84731);
    this.APT.clearMatches();
    AppMethodBeat.o(84731);
  }

  public final void clearSslPreferences()
  {
    AppMethodBeat.i(84715);
    this.APT.clearSslPreferences();
    AppMethodBeat.o(84715);
  }

  public final void clearView()
  {
    AppMethodBeat.i(84711);
    this.APT.clearView();
    AppMethodBeat.o(84711);
  }

  public final void destroy()
  {
    AppMethodBeat.i(84712);
    this.APT.destroy();
    AppMethodBeat.o(84712);
  }

  public final void evaluateJavascript(String paramString, ValueCallback<String> paramValueCallback)
  {
    AppMethodBeat.i(84713);
    if (paramString == null)
      AppMethodBeat.o(84713);
    while (true)
    {
      return;
      if (Build.VERSION.SDK_INT >= 19)
      {
        this.APT.evaluateJavascript(paramString, paramValueCallback);
        AppMethodBeat.o(84713);
      }
      else
      {
        if (paramValueCallback != null)
          break;
        this.APT.loadUrl(paramString);
        AppMethodBeat.o(84713);
      }
    }
    String str = paramString;
    if (paramString.trim().startsWith("javascript:"))
      str = paramString.replaceFirst("javascript:", "");
    if (this.AQa == null)
    {
      this.AQa = new e.b();
      this.APT.addJavascriptInterface(this.AQa, "xwalkTempCallBack");
    }
    e.b localb = this.AQa;
    if (paramValueCallback != null)
    {
      paramString = new StringBuilder();
      int i = localb.AQe;
      localb.AQe = (i + 1);
      paramString = i;
      localb.AQd.put(paramString, paramValueCallback);
    }
    while (true)
    {
      paramString = "javascript:xwalkTempCallBack.notifyJava(" + paramString + ", " + str + ")";
      this.APT.loadUrl(paramString);
      AppMethodBeat.o(84713);
      break;
      paramString = "";
    }
  }

  public final void findAllAsync(String paramString)
  {
    AppMethodBeat.i(84733);
    this.APT.findAllAsync(paramString);
    AppMethodBeat.o(84733);
  }

  public final void findNext(boolean paramBoolean)
  {
    AppMethodBeat.i(84732);
    this.APT.findNext(paramBoolean);
    AppMethodBeat.o(84732);
  }

  public final String getAbstractInfo()
  {
    AppMethodBeat.i(84735);
    String str = getVersionInfo();
    AppMethodBeat.o(84735);
    return str;
  }

  public final int getContentHeight()
  {
    AppMethodBeat.i(84717);
    int i = this.APT.getContentHeight();
    AppMethodBeat.o(84717);
    return i;
  }

  public final l getCurWebChromeClient()
  {
    return this.APV;
  }

  public final s getCurWebviewClient()
  {
    return this.APU;
  }

  public final com.tencent.xweb.c.e getDefalutOpProvider()
  {
    return this.APW;
  }

  public final WebView.a getFullscreenVideoKind()
  {
    AppMethodBeat.i(84741);
    WebView.a locala = a.auW(WebView.getCurStrModule());
    AppMethodBeat.o(84741);
    return locala;
  }

  public final WebView.b getHitTestResult()
  {
    AppMethodBeat.i(84729);
    WebView.HitTestResult localHitTestResult = this.APT.getHitTestResult();
    WebView.b localb = new WebView.b();
    localb.mType = localHitTestResult.getType();
    localb.mExtra = localHitTestResult.getExtra();
    AppMethodBeat.o(84729);
    return localb;
  }

  public final float getScale()
  {
    AppMethodBeat.i(84718);
    float f = this.APT.getScale();
    AppMethodBeat.o(84718);
    return f;
  }

  public final p getSettings()
  {
    AppMethodBeat.i(84703);
    f localf;
    if (this.APX != null)
    {
      localf = this.APX;
      AppMethodBeat.o(84703);
    }
    while (true)
    {
      return localf;
      if (this.APT == null)
      {
        localf = null;
        AppMethodBeat.o(84703);
      }
      else
      {
        this.APX = new f(this.APT);
        localf = this.APX;
        AppMethodBeat.o(84703);
      }
    }
  }

  public final String getTitle()
  {
    AppMethodBeat.i(84730);
    String str = this.APT.getTitle();
    AppMethodBeat.o(84730);
    return str;
  }

  public final ViewGroup getTopView()
  {
    return this.APT;
  }

  public final String getUrl()
  {
    AppMethodBeat.i(84726);
    String str = this.APT.getUrl();
    AppMethodBeat.o(84726);
    return str;
  }

  public final String getVersionInfo()
  {
    AppMethodBeat.i(84734);
    String str = "webviewtype = WV_KIND_SYS, version = " + XWalkEnvironment.getChromiunVersion() + ", V8 type=" + i.dTV();
    AppMethodBeat.o(84734);
    return str;
  }

  public final View getView()
  {
    return this.APT;
  }

  public final int getVisibleTitleHeight()
  {
    AppMethodBeat.i(84719);
    Object localObject = com.tencent.xweb.util.e.n(this.APT, "getVisibleTitleHeight");
    int i;
    if (localObject == null)
    {
      i = 0;
      AppMethodBeat.o(84719);
    }
    while (true)
    {
      return i;
      i = ((Integer)localObject).intValue();
      AppMethodBeat.o(84719);
    }
  }

  public final int getWebScrollX()
  {
    AppMethodBeat.i(84737);
    int i = getWebViewUI().getScrollX();
    AppMethodBeat.o(84737);
    return i;
  }

  public final int getWebScrollY()
  {
    AppMethodBeat.i(84736);
    int i = this.APT.getScrollY();
    AppMethodBeat.o(84736);
    return i;
  }

  public final View getWebViewUI()
  {
    return this.APT;
  }

  public final Object getX5WebViewExtension()
  {
    return null;
  }

  public final void goBack()
  {
    AppMethodBeat.i(84708);
    this.APT.goBack();
    AppMethodBeat.o(84708);
  }

  public final boolean hasEnteredFullscreen()
  {
    AppMethodBeat.i(84709);
    boolean bool;
    if (this.APZ == null)
    {
      bool = false;
      AppMethodBeat.o(84709);
    }
    while (true)
    {
      return bool;
      bool = this.APZ.hasEnteredFullscreen();
      AppMethodBeat.o(84709);
    }
  }

  public final boolean isOverScrollStart()
  {
    AppMethodBeat.i(84738);
    boolean bool;
    if (getWebViewUI().getScrollY() == 0)
    {
      bool = true;
      AppMethodBeat.o(84738);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(84738);
    }
  }

  public final boolean isSupportExtendPluginForAppbrand()
  {
    return false;
  }

  public final void leaveFullscreen()
  {
    AppMethodBeat.i(84710);
    if (this.bOR != null)
      this.bOR.onHideCustomView();
    AppMethodBeat.o(84710);
  }

  public final void loadData(String paramString1, String paramString2, String paramString3)
  {
    AppMethodBeat.i(84716);
    this.APT.loadData(paramString1, paramString2, paramString3);
    AppMethodBeat.o(84716);
  }

  public final void loadDataWithBaseURL(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5)
  {
    AppMethodBeat.i(84721);
    this.APT.loadDataWithBaseURL(paramString1, paramString2, paramString3, paramString4, paramString5);
    AppMethodBeat.o(84721);
  }

  public final void loadUrl(String paramString)
  {
    AppMethodBeat.i(84706);
    this.APT.loadUrl(paramString);
    AppMethodBeat.o(84706);
  }

  public final void loadUrl(String paramString, Map<String, String> paramMap)
  {
    AppMethodBeat.i(84724);
    this.APT.loadUrl(paramString, paramMap);
    AppMethodBeat.o(84724);
  }

  public final void onPause()
  {
    AppMethodBeat.i(84740);
    this.APT.onPause();
    AppMethodBeat.o(84740);
  }

  public final void onResume()
  {
    AppMethodBeat.i(84739);
    this.APT.onResume();
    AppMethodBeat.o(84739);
  }

  public final boolean overlayHorizontalScrollbar()
  {
    AppMethodBeat.i(84720);
    boolean bool = this.APT.overlayHorizontalScrollbar();
    AppMethodBeat.o(84720);
    return bool;
  }

  public final void reload()
  {
    AppMethodBeat.i(84714);
    this.APT.reload();
    AppMethodBeat.o(84714);
  }

  public final void removeJavascriptInterface(String paramString)
  {
    AppMethodBeat.i(84727);
    this.APT.removeJavascriptInterface(paramString);
    AppMethodBeat.o(84727);
  }

  public final boolean savePage(String paramString1, String paramString2, int paramInt)
  {
    return false;
  }

  public final void setDownloadListener(DownloadListener paramDownloadListener)
  {
    AppMethodBeat.i(84704);
    this.APT.setDownloadListener(paramDownloadListener);
    AppMethodBeat.o(84704);
  }

  public final void setFindListener(WebView.FindListener paramFindListener)
  {
    AppMethodBeat.i(84705);
    this.APT.setFindListener(paramFindListener);
    AppMethodBeat.o(84705);
  }

  public final void setHorizontalScrollBarEnabled(boolean paramBoolean)
  {
    AppMethodBeat.i(84745);
    this.APT.setHorizontalScrollBarEnabled(paramBoolean);
    AppMethodBeat.o(84745);
  }

  public final void setJSExceptionListener(t paramt)
  {
  }

  public final void setVerticalScrollBarEnabled(boolean paramBoolean)
  {
    AppMethodBeat.i(84744);
    this.APT.setVerticalScrollBarEnabled(paramBoolean);
    AppMethodBeat.o(84744);
  }

  public final void setWebChromeClient(l paraml)
  {
    this.APV = paraml;
  }

  public final void setWebViewCallbackClient(r paramr)
  {
    if (this.APT != null)
      this.APT.icr = paramr;
  }

  public final void setWebViewClient(s params)
  {
    this.APU = params;
  }

  public final void setWebViewClientExtension(com.tencent.xweb.x5.a.a.a.a.b paramb)
  {
  }

  public final void stopLoading()
  {
    AppMethodBeat.i(84728);
    this.APT.stopLoading();
    AppMethodBeat.o(84728);
  }

  public final void super_computeScroll()
  {
  }

  public final boolean super_dispatchTouchEvent(MotionEvent paramMotionEvent)
  {
    return false;
  }

  public final boolean super_onInterceptTouchEvent(MotionEvent paramMotionEvent)
  {
    return false;
  }

  public final void super_onOverScrolled(int paramInt1, int paramInt2, boolean paramBoolean1, boolean paramBoolean2)
  {
  }

  public final void super_onScrollChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
  }

  public final boolean super_onTouchEvent(MotionEvent paramMotionEvent)
  {
    return false;
  }

  public final boolean super_overScrollBy(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, boolean paramBoolean)
  {
    return false;
  }

  public final boolean supportFeature(int paramInt)
  {
    return false;
  }

  public final boolean zoomIn()
  {
    AppMethodBeat.i(84723);
    boolean bool = this.APT.zoomIn();
    AppMethodBeat.o(84723);
    return bool;
  }

  public final boolean zoomOut()
  {
    AppMethodBeat.i(84722);
    boolean bool = this.APT.zoomOut();
    AppMethodBeat.o(84722);
    return bool;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.xweb.sys.e
 * JD-Core Version:    0.6.2
 */