package com.tencent.xweb.xwalk;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.DownloadListener;
import android.webkit.ValueCallback;
import android.webkit.WebView.FindListener;
import android.widget.AbsoluteLayout;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.xweb.WebView;
import com.tencent.xweb.WebView.a;
import com.tencent.xweb.WebView.b;
import com.tencent.xweb.a;
import com.tencent.xweb.c.h;
import com.tencent.xweb.extension.video.d;
import com.tencent.xweb.p;
import com.tencent.xweb.r;
import com.tencent.xweb.s;
import com.tencent.xweb.t;
import java.util.Map;
import org.xwalk.core.Log;
import org.xwalk.core.ReflectMethod;
import org.xwalk.core.XWalkCoreWrapper;
import org.xwalk.core.XWalkEnvironment;
import org.xwalk.core.XWalkHitTestResult;
import org.xwalk.core.XWalkHitTestResult.type;
import org.xwalk.core.XWalkLibraryLoader;
import org.xwalk.core.XWalkNavigationHistory;
import org.xwalk.core.XWalkNavigationHistory.Direction;
import org.xwalk.core.XWalkNavigationItem;
import org.xwalk.core.XWalkPreferences;
import org.xwalk.core.XWalkProxyWebViewClientExtension;
import org.xwalk.core.XWalkSettings;
import org.xwalk.core.XWalkView;
import org.xwalk.core.resource.XWalkContextWrapper;

public final class j
  implements h, com.tencent.xweb.c.i
{
  static int ASp = 0;
  WebView APS;
  long APY;
  private com.tencent.xweb.extension.video.b APZ;
  l ARX;
  m ARY;
  XWalkView ARZ;
  k ASi;
  AbsoluteLayout ASj;
  g ASk;
  boolean ASl;
  private String ASm;
  private com.tencent.xweb.x5.a.a.a.a.b ASn;
  private t ASo;
  private boolean ASq;
  r icr;
  s iuo;
  com.tencent.xweb.l iup;
  int mApkVersion;
  private int type;

  public j(WebView paramWebView)
  {
    AppMethodBeat.i(85299);
    this.iuo = new s();
    this.iup = new com.tencent.xweb.l();
    this.APY = 0L;
    this.type = 0;
    this.ASl = false;
    this.ASm = null;
    this.ASn = new com.tencent.xweb.x5.a.a.a.a.b();
    this.ASo = null;
    this.ASq = false;
    this.mApkVersion = XWalkEnvironment.getAvailableVersion();
    XWalkContextWrapper localXWalkContextWrapper = new XWalkContextWrapper(paramWebView.getContext(), this.mApkVersion);
    XWalkLibraryLoader.prepareToInit(localXWalkContextWrapper);
    try
    {
      XWalkPreferences.setValue("xweb-version", String.valueOf(this.mApkVersion));
      XWalkPreferences.setValue("xwebsdk-version", "190301");
      this.ARZ = new j.a(this, localXWalkContextWrapper);
      this.ARZ.setBackgroundColor(0);
      this.ASj = new AbsoluteLayout(localXWalkContextWrapper);
      this.ARZ.getXWalkContentView().addView(this.ASj);
      this.ARZ.setCustomOnScrollChangedListener(new j.4(this));
      this.ARZ.setCustomOnOverScrolledListener(new j.5(this));
      this.ASk = new g(this.ARZ);
      this.APS = paramWebView;
      this.ASi = new k(this.ARZ);
      this.ARZ.getSettings().SetLogCallBack(new j.6(this));
      paramWebView = jC(paramWebView.getContext());
      Log.i("XWWebView", "initFullscreenVideo:" + getFullscreenVideoKind() + ",activity:" + paramWebView);
      this.APZ = com.tencent.xweb.extension.video.e.a(paramWebView, this.APS, this.ARZ, d.dUq());
      if (getFullscreenVideoKind() == WebView.a.AMY)
        this.APZ.dh(this.ARZ);
      AppMethodBeat.o(85299);
      return;
    }
    catch (Exception localException)
    {
      while (true)
        Log.e("XWWebView", localException.getMessage());
    }
  }

  private void dVJ()
  {
    AppMethodBeat.i(85298);
    if (this.ARX != null)
      AppMethodBeat.o(85298);
    while (true)
    {
      return;
      this.ARX = new j.1(this, this.ARZ);
      this.ASk.ARX = this.ARX;
      this.ARZ.setUIClient(this.ARX);
      this.ARY = new j.2(this, this.ARZ);
      this.ASk.ARY = this.ARY;
      this.ARZ.setResourceClient(this.ARY);
      XWalkProxyWebViewClientExtension local3 = new XWalkProxyWebViewClientExtension()
      {
        public final Object onMiscCallBack(String paramAnonymousString, Bundle paramAnonymousBundle)
        {
          AppMethodBeat.i(85290);
          if (j.d(j.this) != null)
          {
            paramAnonymousString = j.d(j.this).onMiscCallBack(paramAnonymousString, paramAnonymousBundle);
            AppMethodBeat.o(85290);
          }
          while (true)
          {
            return paramAnonymousString;
            paramAnonymousString = null;
            AppMethodBeat.o(85290);
          }
        }
      };
      this.ARZ.setProxyWebViewClientExtension(local3);
      AppMethodBeat.o(85298);
    }
  }

  public static boolean fE(Context paramContext)
  {
    try
    {
      AppMethodBeat.i(85297);
      com.tencent.xweb.xwalk.b.e.jF(paramContext);
      boolean bool = com.tencent.xweb.xwalk.b.e.isXWalkReady();
      AppMethodBeat.o(85297);
      return bool;
    }
    finally
    {
      paramContext = finally;
    }
    throw paramContext;
  }

  private static Activity jC(Context paramContext)
  {
    AppMethodBeat.i(85300);
    if ((paramContext instanceof Activity))
    {
      paramContext = (Activity)paramContext;
      AppMethodBeat.o(85300);
    }
    while (true)
    {
      return paramContext;
      if ((paramContext instanceof ContextWrapper))
      {
        Context localContext = ((ContextWrapper)paramContext).getBaseContext();
        if (localContext != paramContext)
        {
          paramContext = localContext;
          break;
        }
        AppMethodBeat.o(85300);
        paramContext = null;
        continue;
      }
      AppMethodBeat.o(85300);
      paramContext = null;
    }
  }

  public final void addJavascriptInterface(Object paramObject, String paramString)
  {
    AppMethodBeat.i(85322);
    this.ARZ.addJavascriptInterface(paramObject, paramString);
    AppMethodBeat.o(85322);
  }

  public final boolean canGoBack()
  {
    AppMethodBeat.i(85306);
    boolean bool;
    if ((!this.ASl) && (this.ARZ.getNavigationHistory().canGoBack()))
    {
      bool = true;
      AppMethodBeat.o(85306);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(85306);
    }
  }

  public final boolean canGoForward()
  {
    AppMethodBeat.i(85343);
    boolean bool;
    if (this.ARZ.getNavigationHistory() != null)
    {
      bool = this.ARZ.getNavigationHistory().canGoForward();
      AppMethodBeat.o(85343);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(85343);
    }
  }

  public final void clearHistory()
  {
    AppMethodBeat.i(85342);
    if (this.ARZ.getNavigationHistory() != null)
      this.ARZ.getNavigationHistory().clear();
    AppMethodBeat.o(85342);
  }

  public final void clearMatches()
  {
    AppMethodBeat.i(85328);
    this.ARZ.clearMatches();
    AppMethodBeat.o(85328);
  }

  public final void clearSslPreferences()
  {
    AppMethodBeat.i(85313);
    this.ARZ.clearSslPreferences();
    AppMethodBeat.o(85313);
  }

  public final void clearView()
  {
  }

  public final void destroy()
  {
    AppMethodBeat.i(85310);
    this.ARZ.onDestroy();
    AppMethodBeat.o(85310);
  }

  public final void eU(String paramString, int paramInt)
  {
    AppMethodBeat.i(85341);
    if (XWalkCoreWrapper.getInstance().hasFeature(0));
    while (true)
    {
      try
      {
        Object localObject = XWalkCoreWrapper.getInstance().getClass("com.tencent.xweb.xprofile.XProfileManager");
        if (localObject == null)
        {
          AppMethodBeat.o(85341);
          return;
        }
        ReflectMethod localReflectMethod = new org/xwalk/core/ReflectMethod;
        localReflectMethod.<init>((Class)localObject, "setProfileConfig", new Class[] { Bundle.class });
        localObject = new android/os/Bundle;
        ((Bundle)localObject).<init>();
        ((Bundle)localObject).putString("enabledTraceCategory", paramString);
        ((Bundle)localObject).putInt("traceSampleRatio", paramInt);
        localReflectMethod.invoke(new Object[] { localObject });
        AppMethodBeat.o(85341);
        continue;
      }
      catch (Exception paramString)
      {
        Log.e("XWWebView", "setProfileConfig reflect failed");
      }
      AppMethodBeat.o(85341);
    }
  }

  public final void evaluateJavascript(String paramString, ValueCallback<String> paramValueCallback)
  {
    AppMethodBeat.i(85311);
    this.ARZ.evaluateJavascript(paramString, paramValueCallback);
    AppMethodBeat.o(85311);
  }

  public final void findAllAsync(String paramString)
  {
    AppMethodBeat.i(85330);
    this.ARZ.findAllAsync(paramString);
    AppMethodBeat.o(85330);
  }

  public final void findNext(boolean paramBoolean)
  {
    AppMethodBeat.i(85329);
    this.ARZ.findNext(paramBoolean);
    AppMethodBeat.o(85329);
  }

  public final String getAbstractInfo()
  {
    AppMethodBeat.i(85332);
    String str = "webviewtype = xwalk, sdkver = 190301\n apkver = " + XWalkEnvironment.getAvailableVersion();
    AppMethodBeat.o(85332);
    return str;
  }

  public final int getContentHeight()
  {
    AppMethodBeat.i(85315);
    int i = this.ARZ.getContentHeight();
    AppMethodBeat.o(85315);
    return i;
  }

  public final com.tencent.xweb.l getCurWebChromeClient()
  {
    return this.iup;
  }

  public final s getCurWebviewClient()
  {
    return this.iuo;
  }

  public final com.tencent.xweb.c.e getDefalutOpProvider()
  {
    return this.ASk;
  }

  public final WebView.a getFullscreenVideoKind()
  {
    AppMethodBeat.i(85339);
    WebView.a locala = a.auW(WebView.getCurStrModule());
    AppMethodBeat.o(85339);
    return locala;
  }

  public final WebView.b getHitTestResult()
  {
    AppMethodBeat.i(85326);
    WebView.b localb = new WebView.b();
    XWalkHitTestResult localXWalkHitTestResult = this.ARZ.getHitTestResult();
    localb.mType = localXWalkHitTestResult.getType().ordinal();
    localb.mExtra = localXWalkHitTestResult.getExtra();
    AppMethodBeat.o(85326);
    return localb;
  }

  public final float getScale()
  {
    AppMethodBeat.i(85316);
    float f = this.ARZ.getScale();
    AppMethodBeat.o(85316);
    return f;
  }

  public final p getSettings()
  {
    return this.ASi;
  }

  public final String getTitle()
  {
    AppMethodBeat.i(85327);
    String str = this.ARZ.getTitle();
    AppMethodBeat.o(85327);
    return str;
  }

  public final ViewGroup getTopView()
  {
    return this.ASj;
  }

  public final String getUrl()
  {
    AppMethodBeat.i(85323);
    String str = this.ARZ.getUrl();
    AppMethodBeat.o(85323);
    return str;
  }

  public final String getVersionInfo()
  {
    AppMethodBeat.i(85331);
    String str = "webviewType = WV_KIND_CW,V8 type=" + com.tencent.xweb.i.dTV() + " ,apkversion = " + this.mApkVersion + " , " + XWalkEnvironment.getAvailableVersionDetail() + " sdk = 190301";
    AppMethodBeat.o(85331);
    return str;
  }

  public final View getView()
  {
    return this.ARZ;
  }

  public final int getVisibleTitleHeight()
  {
    return 0;
  }

  public final int getWebScrollX()
  {
    AppMethodBeat.i(85335);
    View localView = getWebViewUI();
    int i;
    if ((localView instanceof XWalkView))
    {
      i = ((XWalkView)localView).computeHorizontalScrollOffset();
      AppMethodBeat.o(85335);
    }
    while (true)
    {
      return i;
      i = localView.getScrollX();
      AppMethodBeat.o(85335);
    }
  }

  public final int getWebScrollY()
  {
    AppMethodBeat.i(85334);
    int i = this.ARZ.computeVerticalScrollOffset();
    AppMethodBeat.o(85334);
    return i;
  }

  public final View getWebViewUI()
  {
    return this.ARZ;
  }

  public final Object getX5WebViewExtension()
  {
    return null;
  }

  public final void goBack()
  {
    AppMethodBeat.i(85307);
    if (this.ARZ.getNavigationHistory().canGoBack())
    {
      this.ARZ.getNavigationHistory().navigate(XWalkNavigationHistory.Direction.BACKWARD, 1);
      if ((this.ARZ.getNavigationHistory() != null) && (this.ARZ.getNavigationHistory().getCurrentItem() != null))
        this.iup.d(this.APS, this.ARZ.getNavigationHistory().getCurrentItem().getTitle());
    }
    AppMethodBeat.o(85307);
  }

  public final boolean hasEnteredFullscreen()
  {
    AppMethodBeat.i(85308);
    boolean bool = this.ARZ.hasEnteredFullscreen();
    AppMethodBeat.o(85308);
    return bool;
  }

  public final boolean isOverScrollStart()
  {
    AppMethodBeat.i(85336);
    boolean bool = this.ASq;
    View localView = getWebViewUI();
    int i;
    if ((localView instanceof XWalkView))
    {
      i = ((XWalkView)localView).computeVerticalScrollOffset();
      if ((i != 0) || (!bool))
        break label57;
      bool = true;
      AppMethodBeat.o(85336);
    }
    while (true)
    {
      return bool;
      i = localView.getScrollY();
      break;
      label57: bool = false;
      AppMethodBeat.o(85336);
    }
  }

  public final boolean isSupportExtendPluginForAppbrand()
  {
    AppMethodBeat.i(85333);
    boolean bool = this.ARZ.isSupportExtendPluginForAppbrand();
    AppMethodBeat.o(85333);
    return bool;
  }

  public final void leaveFullscreen()
  {
    AppMethodBeat.i(85309);
    this.ARZ.leaveFullscreen();
    AppMethodBeat.o(85309);
  }

  public final void loadData(String paramString1, String paramString2, String paramString3)
  {
    AppMethodBeat.i(85314);
    this.ARZ.loadData(paramString1, paramString2, paramString3);
    AppMethodBeat.o(85314);
  }

  public final void loadDataWithBaseURL(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5)
  {
    AppMethodBeat.i(85318);
    this.ARZ.loadDataWithBaseURL(paramString1, paramString2, paramString3, paramString4, paramString5);
    AppMethodBeat.o(85318);
  }

  public final void loadUrl(String paramString)
  {
    AppMethodBeat.i(85305);
    if ((paramString != null) && (paramString.trim().startsWith("javascript:")))
    {
      this.ARZ.evaluateJavascript(paramString, null);
      AppMethodBeat.o(85305);
    }
    while (true)
    {
      return;
      this.ASl = false;
      this.ARZ.loadUrl(paramString);
      AppMethodBeat.o(85305);
    }
  }

  public final void loadUrl(String paramString, Map<String, String> paramMap)
  {
    AppMethodBeat.i(85321);
    this.ARZ.loadUrl(paramString, paramMap);
    AppMethodBeat.o(85321);
  }

  public final void onPause()
  {
    AppMethodBeat.i(85338);
    this.ARZ.onPause();
    AppMethodBeat.o(85338);
  }

  public final void onResume()
  {
    AppMethodBeat.i(85337);
    this.ARZ.onResume();
    AppMethodBeat.o(85337);
  }

  public final boolean overlayHorizontalScrollbar()
  {
    AppMethodBeat.i(85317);
    int i = this.ARZ.getScrollBarStyle();
    boolean bool;
    if ((i == 0) || (i == 33554432))
    {
      bool = true;
      AppMethodBeat.o(85317);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(85317);
    }
  }

  public final void reload()
  {
    AppMethodBeat.i(85312);
    this.ARZ.reload(0);
    AppMethodBeat.o(85312);
  }

  public final void removeJavascriptInterface(String paramString)
  {
    AppMethodBeat.i(85324);
    this.ARZ.removeJavascriptInterface(paramString);
    AppMethodBeat.o(85324);
  }

  public final boolean savePage(String paramString1, String paramString2, int paramInt)
  {
    AppMethodBeat.i(85340);
    View localView = getWebViewUI();
    boolean bool;
    if ((localView instanceof XWalkView))
    {
      bool = ((XWalkView)localView).savePage(paramString1, paramString2, paramInt);
      AppMethodBeat.o(85340);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(85340);
    }
  }

  public final void setDownloadListener(DownloadListener paramDownloadListener)
  {
    AppMethodBeat.i(85303);
    this.ARZ.setDownloadListener(new f.e(this.APS.getContext(), paramDownloadListener));
    AppMethodBeat.o(85303);
  }

  public final void setFindListener(WebView.FindListener paramFindListener)
  {
    AppMethodBeat.i(85304);
    this.ARZ.setFindListener(new f.f(paramFindListener));
    AppMethodBeat.o(85304);
  }

  public final void setHorizontalScrollBarEnabled(boolean paramBoolean)
  {
    AppMethodBeat.i(85346);
    this.ARZ.setHorizontalScrollBarEnable(paramBoolean);
    AppMethodBeat.o(85346);
  }

  public final void setJSExceptionListener(t paramt)
  {
    this.ASo = paramt;
  }

  public final void setVerticalScrollBarEnabled(boolean paramBoolean)
  {
    AppMethodBeat.i(85345);
    this.ARZ.setVerticalScrollBarEnable(paramBoolean);
    AppMethodBeat.o(85345);
  }

  public final void setWebChromeClient(com.tencent.xweb.l paraml)
  {
    AppMethodBeat.i(85302);
    if (paraml == null)
    {
      this.iup = new com.tencent.xweb.l();
      AppMethodBeat.o(85302);
    }
    while (true)
    {
      return;
      dVJ();
      this.iup = paraml;
      AppMethodBeat.o(85302);
    }
  }

  public final void setWebViewCallbackClient(r paramr)
  {
    this.icr = paramr;
  }

  public final void setWebViewClient(s params)
  {
    AppMethodBeat.i(85301);
    if (params == null)
    {
      this.iuo = new s();
      this.iuo.AMp = this.ASk;
      AppMethodBeat.o(85301);
    }
    while (true)
    {
      return;
      dVJ();
      this.iuo = params;
      AppMethodBeat.o(85301);
    }
  }

  public final void setWebViewClientExtension(com.tencent.xweb.x5.a.a.a.a.b paramb)
  {
    this.ASn = paramb;
  }

  public final void stopLoading()
  {
    AppMethodBeat.i(85325);
    this.ARZ.stopLoading();
    AppMethodBeat.o(85325);
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
    AppMethodBeat.i(85344);
    boolean bool = XWalkCoreWrapper.getInstance().hasFeature(paramInt);
    AppMethodBeat.o(85344);
    return bool;
  }

  public final boolean zoomIn()
  {
    AppMethodBeat.i(85320);
    boolean bool = this.ARZ.zoomIn();
    AppMethodBeat.o(85320);
    return bool;
  }

  public final boolean zoomOut()
  {
    AppMethodBeat.i(85319);
    boolean bool = this.ARZ.zoomOut();
    AppMethodBeat.o(85319);
    return bool;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.xweb.xwalk.j
 * JD-Core Version:    0.6.2
 */