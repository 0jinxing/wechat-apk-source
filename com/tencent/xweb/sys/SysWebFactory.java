package com.tencent.xweb.sys;

import android.content.Context;
import android.os.Build.VERSION;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import android.webkit.WebIconDatabase;
import android.webkit.WebStorage;
import android.webkit.WebViewDatabase;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.xweb.WebView.c;
import com.tencent.xweb.c.b.a;
import com.tencent.xweb.c.b.b;
import com.tencent.xweb.c.f;
import com.tencent.xweb.c.g;
import com.tencent.xweb.c.h;
import com.tencent.xweb.c.k.a;
import com.tencent.xweb.i.a;
import org.xwalk.core.Log;
import org.xwalk.core.WebViewExtensionListener;

public class SysWebFactory
  implements k.a
{
  static SysWebFactory sInstance;

  public static SysWebFactory getInstance()
  {
    AppMethodBeat.i(84662);
    if (sInstance == null)
      sInstance = new SysWebFactory();
    SysWebFactory localSysWebFactory = sInstance;
    AppMethodBeat.o(84662);
    return localSysWebFactory;
  }

  public void clearAllWebViewCache(Context paramContext, boolean paramBoolean)
  {
    AppMethodBeat.i(84668);
    try
    {
      android.webkit.WebView localWebView = new android/webkit/WebView;
      localWebView.<init>(paramContext);
      if (Build.VERSION.SDK_INT >= 11)
      {
        localWebView.removeJavascriptInterface("searchBoxJavaBridge_");
        localWebView.removeJavascriptInterface("accessibility");
        localWebView.removeJavascriptInterface("accessibilityTraversal");
      }
      localWebView.clearCache(true);
      if (paramBoolean)
      {
        CookieSyncManager.createInstance(paramContext);
        CookieManager.getInstance().removeAllCookie();
      }
      WebViewDatabase.getInstance(paramContext).clearUsernamePassword();
      WebViewDatabase.getInstance(paramContext).clearHttpAuthUsernamePassword();
      WebViewDatabase.getInstance(paramContext).clearFormData();
      WebStorage.getInstance().deleteAllData();
      WebIconDatabase.getInstance().removeAllIcons();
      AppMethodBeat.o(84668);
      return;
    }
    catch (Exception paramContext)
    {
      while (true)
      {
        Log.e("SysWebFactory", "clearAllWebViewCache failed " + paramContext.getMessage());
        AppMethodBeat.o(84668);
      }
    }
  }

  public h createWebView(com.tencent.xweb.WebView paramWebView)
  {
    AppMethodBeat.i(84664);
    paramWebView = new e(paramWebView);
    AppMethodBeat.o(84664);
    return paramWebView;
  }

  public g createWebviewStorage()
  {
    return null;
  }

  public Object excute(String paramString, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(84663);
    if ((paramString == null) || (paramString.isEmpty()))
      AppMethodBeat.o(84663);
    while (true)
    {
      return null;
      if ((!paramString.equals("STR_CMD_GET_DEBUG_VIEW")) && (paramString.equals("STR_CMD_GET_UPDATER")))
        AppMethodBeat.o(84663);
      else
        AppMethodBeat.o(84663);
    }
  }

  public b.a getCookieManager()
  {
    AppMethodBeat.i(84669);
    a locala = new a();
    AppMethodBeat.o(84669);
    return locala;
  }

  public b.b getCookieSyncManager()
  {
    AppMethodBeat.i(84670);
    b localb = new b();
    AppMethodBeat.o(84670);
    return localb;
  }

  public f getJsCore(i.a parama, Context paramContext)
  {
    return null;
  }

  public boolean hasInited()
  {
    return true;
  }

  public boolean hasInitedCallback()
  {
    AppMethodBeat.i(84667);
    boolean bool = SysWebFactory.a.hasInitedCallback();
    AppMethodBeat.o(84667);
    return bool;
  }

  public void initCallback(WebViewExtensionListener paramWebViewExtensionListener)
  {
    AppMethodBeat.i(84666);
    SysWebFactory.a.dUJ();
    AppMethodBeat.o(84666);
  }

  public void initEnviroment(Context paramContext)
  {
  }

  public void initInterface()
  {
  }

  public boolean initWebviewCore(Context paramContext, WebView.c paramc)
  {
    AppMethodBeat.i(84665);
    if (paramc != null)
      paramc.onCoreInitFinished();
    AppMethodBeat.o(84665);
    return true;
  }

  public boolean isCoreReady()
  {
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.xweb.sys.SysWebFactory
 * JD-Core Version:    0.6.2
 */