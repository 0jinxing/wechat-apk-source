package com.tencent.xweb.c;

import android.content.Context;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.xweb.WebView;
import com.tencent.xweb.WebView.c;
import com.tencent.xweb.WebView.d;
import com.tencent.xweb.util.e;
import com.tencent.xweb.util.f;
import org.xwalk.core.Log;
import org.xwalk.core.WebViewExtensionListener;
import org.xwalk.core.XWalkEnvironment;

public final class k
{
  static a APA;
  static a APB;
  static a APC;

  public static h a(WebView.d paramd, WebView paramWebView)
  {
    Object localObject1 = null;
    Object localObject2 = null;
    AppMethodBeat.i(3994);
    Log.i("WebViewWrapperFactory", "try to create webview  = ".concat(String.valueOf(paramd)));
    c localc = c.b("CREATE_WEBVIEW", paramd);
    localc.dUx();
    Object localObject3 = localObject1;
    try
    {
      if (f(paramd) == null)
      {
        localObject3 = localObject1;
        paramWebView = new java/lang/StringBuilder;
        localObject3 = localObject1;
        paramWebView.<init>("the kind of ");
        localObject3 = localObject1;
        Log.e("WebViewWrapperFactory", paramd + " this provider does not exist!");
        AppMethodBeat.o(3994);
        localObject3 = localObject2;
        return localObject3;
      }
      localObject3 = localObject1;
      paramWebView = f(paramd).createWebView(paramWebView);
      if (paramWebView != null)
      {
        localObject3 = paramWebView;
        localc.dUy();
      }
      for (localObject3 = paramWebView; ; localObject3 = paramWebView)
      {
        AppMethodBeat.o(3994);
        break;
        localObject3 = paramWebView;
        XWalkEnvironment.addXWalkInitializeLog("WebViewWrapperFactory", "create webview failed type = ".concat(String.valueOf(paramd)));
      }
    }
    catch (Exception paramWebView)
    {
      while (true)
      {
        XWalkEnvironment.addXWalkInitializeLog("WebViewWrapperFactory", "create webview with exception  type = " + paramd + ", error msg:" + paramWebView.getMessage());
        f.k(paramd);
      }
    }
  }

  public static a f(WebView.d paramd)
  {
    AppMethodBeat.i(3993);
    if (paramd == WebView.d.ANb)
      if (APA == null)
      {
        paramd = e.iJ("com.tencent.xweb.xwalk.XWalkWebFactory", "getInstance");
        if ((paramd == null) || (!(paramd instanceof a)))
        {
          Log.e("WebViewWrapperFactory", "find com.tencent.xweb.XWalkWebFactory failed");
          AppMethodBeat.o(3993);
          paramd = null;
        }
      }
    while (true)
    {
      return paramd;
      APA = (a)paramd;
      paramd = APA;
      AppMethodBeat.o(3993);
      continue;
      if (paramd == WebView.d.ANc)
      {
        if (APB == null)
        {
          paramd = e.iJ("com.tencent.xweb.x5.X5WebFactory", "getInstance");
          if ((paramd == null) || (!(paramd instanceof a)))
          {
            Log.e("WebViewWrapperFactory", "find X5WebFactory failed");
            AppMethodBeat.o(3993);
            paramd = null;
          }
          else
          {
            APB = (a)paramd;
          }
        }
        else
        {
          paramd = APB;
          AppMethodBeat.o(3993);
        }
      }
      else if (paramd == WebView.d.ANd)
      {
        if (APC == null)
        {
          paramd = e.iJ("com.tencent.xweb.sys.SysWebFactory", "getInstance");
          if ((paramd == null) || (!(paramd instanceof a)))
          {
            Log.e("WebViewWrapperFactory", "find SysWebFactory failed");
            AppMethodBeat.o(3993);
            paramd = null;
          }
          else
          {
            APC = (a)paramd;
          }
        }
        else
        {
          paramd = APC;
          AppMethodBeat.o(3993);
        }
      }
      else
      {
        AppMethodBeat.o(3993);
        paramd = null;
      }
    }
  }

  public static abstract interface a
  {
    public abstract void clearAllWebViewCache(Context paramContext, boolean paramBoolean);

    public abstract h createWebView(WebView paramWebView);

    public abstract g createWebviewStorage();

    public abstract Object excute(String paramString, Object[] paramArrayOfObject);

    public abstract b.a getCookieManager();

    public abstract b.b getCookieSyncManager();

    public abstract boolean hasInited();

    public abstract void initCallback(WebViewExtensionListener paramWebViewExtensionListener);

    public abstract void initEnviroment(Context paramContext);

    public abstract void initInterface();

    public abstract boolean initWebviewCore(Context paramContext, WebView.c paramc);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.xweb.c.k
 * JD-Core Version:    0.6.2
 */