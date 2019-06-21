package com.tencent.xweb.x5;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.DownloadListener;
import android.webkit.ValueCallback;
import android.webkit.WebView.FindListener;
import com.jg.JgClassChecked;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.smtt.export.external.extension.interfaces.IX5WebViewExtension;
import com.tencent.smtt.sdk.QbSdk;
import com.tencent.smtt.sdk.WebView.HitTestResult;
import com.tencent.smtt.sdk.X5JsCore;
import com.tencent.xweb.WebView.a;
import com.tencent.xweb.WebView.b;
import com.tencent.xweb.c.e;
import com.tencent.xweb.c.h;
import com.tencent.xweb.p;
import com.tencent.xweb.r;
import com.tencent.xweb.s;
import com.tencent.xweb.t;
import com.tencent.xweb.x5.sdk.ProxyWebViewSuperWrapper;
import java.util.Map;
import org.xwalk.core.XWalkEnvironment;

@JgClassChecked(author=30, fComment="checked", lastDate="20171020", reviewer=30, vComment={com.jg.EType.JSEXECUTECHECK})
public final class k
  implements h
{
  com.tencent.xweb.WebView APS;
  s APU;
  com.tencent.xweb.l APV;
  long APY;
  com.tencent.smtt.sdk.WebView AQH;
  i AQN;
  l AQO;
  String AQP;
  private b AQQ;
  private c AQR;

  public k(com.tencent.xweb.WebView paramWebView)
  {
    AppMethodBeat.i(84909);
    this.APY = 0L;
    this.AQP = "";
    this.AQQ = new k.1(this);
    this.AQR = new k.2(this);
    this.APS = paramWebView;
    this.AQH = new k.a(this, paramWebView.getContext());
    this.AQH.setBackgroundColor(0);
    this.AQN = new i(this.AQH);
    this.AQH.setWebChromeClient(this.AQQ);
    this.AQH.setWebViewClient(this.AQR);
    this.AQN.AQF = this.AQR;
    this.AQN.AQG = this.AQQ;
    AppMethodBeat.o(84909);
  }

  public final void addJavascriptInterface(Object paramObject, String paramString)
  {
    AppMethodBeat.i(84943);
    this.AQH.addJavascriptInterface(paramObject, paramString);
    AppMethodBeat.o(84943);
  }

  public final boolean canGoBack()
  {
    AppMethodBeat.i(84927);
    boolean bool = this.AQH.canGoBack();
    AppMethodBeat.o(84927);
    return bool;
  }

  public final boolean canGoForward()
  {
    AppMethodBeat.i(84959);
    boolean bool = this.AQH.canGoForward();
    AppMethodBeat.o(84959);
    return bool;
  }

  public final void clearHistory()
  {
    AppMethodBeat.i(84958);
    this.AQH.clearHistory();
    AppMethodBeat.o(84958);
  }

  public final void clearMatches()
  {
    AppMethodBeat.i(84950);
    this.AQH.clearMatches();
    AppMethodBeat.o(84950);
  }

  public final void clearSslPreferences()
  {
    AppMethodBeat.i(84933);
    this.AQH.clearSslPreferences();
    AppMethodBeat.o(84933);
  }

  public final void clearView()
  {
    AppMethodBeat.i(84929);
    this.AQH.clearView();
    AppMethodBeat.o(84929);
  }

  public final void destroy()
  {
    AppMethodBeat.i(84930);
    this.AQH.destroy();
    AppMethodBeat.o(84930);
  }

  public final void evaluateJavascript(String paramString, ValueCallback<String> paramValueCallback)
  {
    AppMethodBeat.i(84931);
    this.AQH.evaluateJavascript(paramString, new a.d(paramValueCallback));
    AppMethodBeat.o(84931);
  }

  public final void findAllAsync(String paramString)
  {
    AppMethodBeat.i(84952);
    this.AQH.findAllAsync(paramString);
    AppMethodBeat.o(84952);
  }

  public final void findNext(boolean paramBoolean)
  {
    AppMethodBeat.i(84951);
    this.AQH.findNext(paramBoolean);
    AppMethodBeat.o(84951);
  }

  public final String getAbstractInfo()
  {
    AppMethodBeat.i(84954);
    Object localObject = new StringBuilder("webviewtype = x5, is using x5 core = ");
    if (this.AQH.getX5WebViewExtension() != null);
    for (boolean bool = true; ; bool = false)
    {
      localObject = bool + "\n core version = " + QbSdk.getTbsVersion(this.APS.getContext()) + "\n miniqbversion = " + QbSdk.getMiniQBVersion(this.APS.getContext()) + "\n canUseX5JsCore = " + X5JsCore.canUseX5JsCore(this.APS.getContext()) + "\n canUseNativeBuffer = " + X5JsCore.canX5JsCoreUseNativeBuffer(this.APS.getContext());
      AppMethodBeat.o(84954);
      return localObject;
    }
  }

  public final int getContentHeight()
  {
    AppMethodBeat.i(84935);
    int i = this.AQH.getContentHeight();
    AppMethodBeat.o(84935);
    return i;
  }

  public final com.tencent.xweb.l getCurWebChromeClient()
  {
    return this.APV;
  }

  public final s getCurWebviewClient()
  {
    return this.APU;
  }

  public final e getDefalutOpProvider()
  {
    return this.AQN;
  }

  public final WebView.a getFullscreenVideoKind()
  {
    return WebView.a.AMW;
  }

  public final WebView.b getHitTestResult()
  {
    AppMethodBeat.i(84948);
    WebView.HitTestResult localHitTestResult = this.AQH.getHitTestResult();
    WebView.b localb = new WebView.b();
    localb.mType = localHitTestResult.getType();
    localb.mExtra = localHitTestResult.getExtra();
    AppMethodBeat.o(84948);
    return localb;
  }

  public final float getScale()
  {
    AppMethodBeat.i(84936);
    float f = this.AQH.getScale();
    AppMethodBeat.o(84936);
    return f;
  }

  public final p getSettings()
  {
    AppMethodBeat.i(84921);
    l locall;
    if (this.AQO != null)
    {
      locall = this.AQO;
      AppMethodBeat.o(84921);
    }
    while (true)
    {
      return locall;
      if (this.AQH == null)
      {
        locall = null;
        AppMethodBeat.o(84921);
      }
      else
      {
        this.AQO = new l(this.AQH);
        locall = this.AQO;
        AppMethodBeat.o(84921);
      }
    }
  }

  public final String getTitle()
  {
    AppMethodBeat.i(84949);
    String str = this.AQH.getTitle();
    AppMethodBeat.o(84949);
    return str;
  }

  public final ViewGroup getTopView()
  {
    AppMethodBeat.i(84923);
    ViewGroup localViewGroup = (ViewGroup)this.AQH.getView();
    AppMethodBeat.o(84923);
    return localViewGroup;
  }

  public final String getUrl()
  {
    AppMethodBeat.i(84944);
    String str = this.AQH.getUrl();
    AppMethodBeat.o(84944);
    return str;
  }

  public final String getVersionInfo()
  {
    AppMethodBeat.i(84953);
    int i;
    String str;
    if (this.AQH.getX5WebViewExtension() != null)
    {
      i = 1;
      if (i == 0)
        break label85;
      str = "use x5 and x5 kernel, sdk ver = " + com.tencent.xweb.WebView.getTbsSDKVersion(XWalkEnvironment.getApplicationContext()) + ", core ver = " + com.tencent.xweb.WebView.getInstalledTbsCoreVersion(XWalkEnvironment.getApplicationContext()) + ", V8 type=" + com.tencent.xweb.i.dTV();
      AppMethodBeat.o(84953);
    }
    while (true)
    {
      return str;
      i = 0;
      break;
      label85: str = "use x5 wrapped sys kernel, sdk ver = " + com.tencent.xweb.WebView.getTbsSDKVersion(XWalkEnvironment.getApplicationContext()) + ", core ver = " + com.tencent.xweb.WebView.getInstalledTbsCoreVersion(XWalkEnvironment.getApplicationContext()) + ", V8 type=" + com.tencent.xweb.i.dTV();
      AppMethodBeat.o(84953);
    }
  }

  public final View getView()
  {
    AppMethodBeat.i(84922);
    View localView = this.AQH.getView();
    AppMethodBeat.o(84922);
    return localView;
  }

  public final int getVisibleTitleHeight()
  {
    AppMethodBeat.i(84937);
    int i = this.AQH.getVisibleTitleHeight();
    AppMethodBeat.o(84937);
    return i;
  }

  public final int getWebScrollX()
  {
    AppMethodBeat.i(84956);
    int i = getWebViewUI().getScrollX();
    AppMethodBeat.o(84956);
    return i;
  }

  public final int getWebScrollY()
  {
    AppMethodBeat.i(84955);
    int i = this.AQH.getWebScrollY();
    AppMethodBeat.o(84955);
    return i;
  }

  public final View getWebViewUI()
  {
    return this.AQH;
  }

  public final Object getX5WebViewExtension()
  {
    AppMethodBeat.i(84910);
    IX5WebViewExtension localIX5WebViewExtension = this.AQH.getX5WebViewExtension();
    AppMethodBeat.o(84910);
    return localIX5WebViewExtension;
  }

  public final void goBack()
  {
    AppMethodBeat.i(84928);
    this.AQH.goBack();
    AppMethodBeat.o(84928);
  }

  public final boolean hasEnteredFullscreen()
  {
    return false;
  }

  public final boolean isOverScrollStart()
  {
    AppMethodBeat.i(84957);
    boolean bool;
    if (getView().getScrollY() == 0)
    {
      bool = true;
      AppMethodBeat.o(84957);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(84957);
    }
  }

  public final boolean isSupportExtendPluginForAppbrand()
  {
    return false;
  }

  public final void leaveFullscreen()
  {
  }

  public final void loadData(String paramString1, String paramString2, String paramString3)
  {
    AppMethodBeat.i(84934);
    this.AQH.loadData(paramString1, paramString2, paramString3);
    AppMethodBeat.o(84934);
  }

  public final void loadDataWithBaseURL(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5)
  {
    AppMethodBeat.i(84939);
    this.AQH.loadDataWithBaseURL(paramString1, paramString2, paramString3, paramString4, paramString5);
    AppMethodBeat.o(84939);
  }

  public final void loadUrl(String paramString)
  {
    AppMethodBeat.i(84926);
    this.AQH.loadUrl(paramString);
    AppMethodBeat.o(84926);
  }

  public final void loadUrl(String paramString, Map<String, String> paramMap)
  {
    AppMethodBeat.i(84942);
    this.AQH.loadUrl(paramString, paramMap);
    AppMethodBeat.o(84942);
  }

  public final void onPause()
  {
    AppMethodBeat.i(84920);
    this.AQH.onPause();
    AppMethodBeat.o(84920);
  }

  public final void onResume()
  {
    AppMethodBeat.i(84919);
    this.AQH.onResume();
    AppMethodBeat.o(84919);
  }

  public final boolean overlayHorizontalScrollbar()
  {
    AppMethodBeat.i(84938);
    boolean bool = this.AQH.overlayHorizontalScrollbar();
    AppMethodBeat.o(84938);
    return bool;
  }

  public final void reload()
  {
    AppMethodBeat.i(84932);
    this.AQH.reload();
    AppMethodBeat.o(84932);
  }

  public final void removeJavascriptInterface(String paramString)
  {
    AppMethodBeat.i(84945);
    this.AQH.removeJavascriptInterface(paramString);
    AppMethodBeat.o(84945);
  }

  public final boolean savePage(String paramString1, String paramString2, int paramInt)
  {
    return false;
  }

  public final void setDownloadListener(DownloadListener paramDownloadListener)
  {
    AppMethodBeat.i(84924);
    this.AQH.setDownloadListener(new a.a(paramDownloadListener));
    AppMethodBeat.o(84924);
  }

  public final void setFindListener(WebView.FindListener paramFindListener)
  {
    AppMethodBeat.i(84925);
    this.AQH.setFindListener(new a.b(paramFindListener));
    AppMethodBeat.o(84925);
  }

  public final void setHorizontalScrollBarEnabled(boolean paramBoolean)
  {
    AppMethodBeat.i(84961);
    this.AQH.getView().setHorizontalScrollBarEnabled(paramBoolean);
    AppMethodBeat.o(84961);
  }

  public final void setJSExceptionListener(t paramt)
  {
  }

  public final void setVerticalScrollBarEnabled(boolean paramBoolean)
  {
    AppMethodBeat.i(84960);
    this.AQH.getView().setVerticalScrollBarEnabled(paramBoolean);
    AppMethodBeat.o(84960);
  }

  public final void setWebChromeClient(com.tencent.xweb.l paraml)
  {
    this.APV = paraml;
  }

  public final void setWebViewCallbackClient(r paramr)
  {
    AppMethodBeat.i(84947);
    this.AQH.setWebViewCallbackClient(new a.f(paramr));
    AppMethodBeat.o(84947);
  }

  public final void setWebViewClient(s params)
  {
    this.APU = params;
  }

  public final void setWebViewClientExtension(com.tencent.xweb.x5.a.a.a.a.b paramb)
  {
    AppMethodBeat.i(84911);
    if (paramb == null)
    {
      this.AQH.setWebViewClientExtension(null);
      AppMethodBeat.o(84911);
    }
    while (true)
    {
      return;
      this.AQH.setWebViewClientExtension(new ProxyWebViewSuperWrapper(paramb));
      AppMethodBeat.o(84911);
    }
  }

  public final void stopLoading()
  {
    AppMethodBeat.i(84946);
    this.AQH.stopLoading();
    AppMethodBeat.o(84946);
  }

  public final void super_computeScroll()
  {
    AppMethodBeat.i(84916);
    this.AQH.super_computeScroll();
    AppMethodBeat.o(84916);
  }

  public final boolean super_dispatchTouchEvent(MotionEvent paramMotionEvent)
  {
    AppMethodBeat.i(84915);
    boolean bool = this.AQH.super_dispatchTouchEvent(paramMotionEvent);
    AppMethodBeat.o(84915);
    return bool;
  }

  public final boolean super_onInterceptTouchEvent(MotionEvent paramMotionEvent)
  {
    AppMethodBeat.i(84913);
    boolean bool = this.AQH.super_onInterceptTouchEvent(paramMotionEvent);
    AppMethodBeat.o(84913);
    return bool;
  }

  public final void super_onOverScrolled(int paramInt1, int paramInt2, boolean paramBoolean1, boolean paramBoolean2)
  {
    AppMethodBeat.i(84914);
    this.AQH.super_onOverScrolled(paramInt1, paramInt2, paramBoolean1, paramBoolean2);
    AppMethodBeat.o(84914);
  }

  public final void super_onScrollChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    AppMethodBeat.i(84917);
    this.AQH.super_onScrollChanged(paramInt1, paramInt2, paramInt3, paramInt4);
    AppMethodBeat.o(84917);
  }

  public final boolean super_onTouchEvent(MotionEvent paramMotionEvent)
  {
    AppMethodBeat.i(84912);
    boolean bool = this.AQH.super_onTouchEvent(paramMotionEvent);
    AppMethodBeat.o(84912);
    return bool;
  }

  public final boolean super_overScrollBy(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, boolean paramBoolean)
  {
    AppMethodBeat.i(84918);
    paramBoolean = this.AQH.super_overScrollBy(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6, paramInt7, paramInt8, paramBoolean);
    AppMethodBeat.o(84918);
    return paramBoolean;
  }

  public final boolean supportFeature(int paramInt)
  {
    return false;
  }

  public final boolean zoomIn()
  {
    AppMethodBeat.i(84941);
    boolean bool = this.AQH.zoomIn();
    AppMethodBeat.o(84941);
    return bool;
  }

  public final boolean zoomOut()
  {
    AppMethodBeat.i(84940);
    boolean bool = this.AQH.zoomOut();
    AppMethodBeat.o(84940);
    return bool;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.xweb.x5.k
 * JD-Core Version:    0.6.2
 */