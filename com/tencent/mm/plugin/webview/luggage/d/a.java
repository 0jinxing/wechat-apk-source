package com.tencent.mm.plugin.webview.luggage.d;

import android.content.Context;
import android.content.MutableContextWrapper;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.webkit.ValueCallback;
import com.tencent.luggage.d.k;
import com.tencent.luggage.g.i;
import com.tencent.luggage.webview.a.a;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.compatible.util.d;
import com.tencent.mm.plugin.webview.luggage.LuggageMMLocalResourceProvider;
import com.tencent.mm.plugin.webview.luggage.f;
import com.tencent.mm.plugin.webview.luggage.permission.LuggageGetA8Key;
import com.tencent.mm.pluginsdk.model.v.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.ui.widget.MMWebView;
import com.tencent.xweb.l;
import com.tencent.xweb.p;
import com.tencent.xweb.r;
import com.tencent.xweb.s;
import java.io.File;
import java.util.Map;

public class a extends MMWebView
  implements com.tencent.luggage.webview.a
{
  private k bPN;
  private r icr;
  public String nHU;
  private Handler oUA;
  protected LuggageGetA8Key uii;
  private f ulw;
  private com.tencent.mm.plugin.webview.luggage.c ulx;
  private com.tencent.mm.plugin.webview.luggage.e uly;

  public a(Context paramContext)
  {
    super(paramContext);
    AppMethodBeat.i(6534);
    this.ulw = new a.5(this);
    this.ulx = new a.6(this);
    this.uly = new a.7(this);
    this.icr = new a.8(this);
    this.uii = new LuggageGetA8Key();
    this.oUA = new Handler(Looper.getMainLooper());
    this.inited = true;
    boolean bool;
    if (getX5WebViewExtension() != null)
      bool = true;
    while (true)
    {
      this.isX5Kernel = bool;
      v.a.fH(getContext());
      if ((!getIsX5Kernel()) && (!d.iW(19)));
      try
      {
        paramContext = new com/tencent/mm/compatible/loader/c;
        paramContext.<init>(this, "mSysWebView", null);
        paramContext = paramContext.get();
        ab.d("MicroMsg.LuggageMMWebViewCoreImpl", "tryInterruptAwaitingWebCoreThread, mSysWebView = %s", new Object[] { paramContext });
        Object localObject = new com/tencent/mm/compatible/loader/c;
        ((com.tencent.mm.compatible.loader.c)localObject).<init>(paramContext, "mProvider", null);
        paramContext = ((com.tencent.mm.compatible.loader.c)localObject).get();
        ab.d("MicroMsg.LuggageMMWebViewCoreImpl", "tryInterruptAwaitingWebCoreThread, mWebViewClassic = %s", new Object[] { paramContext });
        localObject = new com/tencent/mm/compatible/loader/c;
        ((com.tencent.mm.compatible.loader.c)localObject).<init>(paramContext, "mWebViewCore", null);
        localObject = ((com.tencent.mm.compatible.loader.c)localObject).get();
        ab.d("MicroMsg.LuggageMMWebViewCoreImpl", "tryInterruptAwaitingWebCoreThread, mWebViewCore = %s", new Object[] { localObject });
        paramContext = new com/tencent/mm/compatible/loader/c;
        paramContext.<init>(localObject, "sWebCoreHandler", null);
        paramContext = paramContext.get();
        ab.d("MicroMsg.LuggageMMWebViewCoreImpl", "tryInterruptAwaitingWebCoreThread, sWebCoreHandler = %s", new Object[] { paramContext });
        localObject = new com/tencent/mm/compatible/loader/c;
        ((com.tencent.mm.compatible.loader.c)localObject).<init>(paramContext, "mLooper", null);
        localObject = ((com.tencent.mm.compatible.loader.c)localObject).get();
        ab.d("MicroMsg.LuggageMMWebViewCoreImpl", "tryInterruptAwaitingWebCoreThread, mLooper = %s", new Object[] { localObject });
        paramContext = new com/tencent/mm/compatible/loader/c;
        paramContext.<init>(localObject, "mThread", null);
        paramContext = paramContext.get();
        ab.d("MicroMsg.LuggageMMWebViewCoreImpl", "tryInterruptAwaitingWebCoreThread, mThread = %s", new Object[] { paramContext });
        if ((paramContext instanceof Thread))
        {
          paramContext = (Thread)paramContext;
          ab.i("MicroMsg.LuggageMMWebViewCoreImpl", "tryInterruptAwaitingWebCoreThread, webCoreThread.getState = %s", new Object[] { paramContext.getState() });
          if (paramContext.getState() == Thread.State.WAITING)
            paramContext.interrupt();
        }
        il(getContext());
        getSettings().setUseWideViewPort(true);
        getSettings().setLoadWithOverviewMode(true);
        getSettings().dUh();
        getSettings().dUc();
        getSettings().dUb();
        getSettings().setGeolocationEnabled(true);
        getSettings().setJavaScriptCanOpenWindowsAutomatically(true);
        getSettings().setJavaScriptEnabled(true);
        getSettings().setMediaPlaybackRequiresUserGesture(true);
        getSettings().dUj();
        getSettings().dUf();
        getSettings().setAppCachePath(getContext().getDir("webviewcache", 0).getAbsolutePath());
        getSettings().dUe();
        getSettings().dUg();
        getSettings().setDatabasePath(com.tencent.mm.compatible.util.e.eSi + "databases/");
        com.tencent.xweb.b.dTR().dTS();
        com.tencent.xweb.b.dTR().f(this);
        getSettings().setUserAgentString(com.tencent.mm.plugin.webview.luggage.c.b.bh(getContext(), getSettings().getUserAgentString()) + " Luggage");
        getView().setHorizontalScrollBarEnabled(false);
        getView().setVerticalScrollBarEnabled(false);
        setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        super.setWebViewClient(this.ulw);
        super.setWebChromeClient(this.ulx);
        if (getIsX5Kernel())
        {
          super.setWebViewCallbackClient(this.icr);
          super.setWebViewClientExtension(this.uly);
        }
        dKJ();
        AppMethodBeat.o(6534);
        return;
        bool = false;
      }
      catch (Exception paramContext)
      {
        while (true)
          ab.e("MicroMsg.LuggageMMWebViewCoreImpl", "tryInterruptAwaitingWebCoreThread, exception = %s", new Object[] { paramContext });
      }
    }
  }

  public void a(a.a parama)
  {
    AppMethodBeat.i(6542);
    runOnUiThread(new a.3(this, parama));
    AppMethodBeat.o(6542);
  }

  public void addJavascriptInterface(Object paramObject, String paramString)
  {
    AppMethodBeat.i(6537);
    super.addJavascriptInterface(paramObject, paramString);
    AppMethodBeat.o(6537);
  }

  public final void by(String paramString)
  {
    AppMethodBeat.i(6538);
    runOnUiThread(new a.1(this, paramString));
    AppMethodBeat.o(6538);
  }

  public boolean canGoBack()
  {
    AppMethodBeat.i(6550);
    boolean bool = super.canGoBack();
    AppMethodBeat.o(6550);
    return bool;
  }

  public void destroy()
  {
    AppMethodBeat.i(6551);
    super.destroy();
    AppMethodBeat.o(6551);
  }

  public void evaluateJavascript(final String paramString, final ValueCallback<String> paramValueCallback)
  {
    AppMethodBeat.i(6539);
    runOnUiThread(new Runnable()
    {
      public final void run()
      {
        AppMethodBeat.i(6508);
        a.a(a.this, paramString, paramValueCallback);
        AppMethodBeat.o(6508);
      }
    });
    AppMethodBeat.o(6539);
  }

  public String getTitle()
  {
    AppMethodBeat.i(6548);
    String str = super.getTitle();
    AppMethodBeat.o(6548);
    return str;
  }

  public String getUrl()
  {
    AppMethodBeat.i(6547);
    String str = super.getUrl();
    AppMethodBeat.o(6547);
    return str;
  }

  public View getView()
  {
    return this;
  }

  public k getWebCore()
  {
    return this.bPN;
  }

  public void goBack()
  {
    AppMethodBeat.i(6549);
    super.goBack();
    AppMethodBeat.o(6549);
  }

  public void loadData(String paramString1, String paramString2, String paramString3)
  {
    AppMethodBeat.i(6545);
    super.loadData(paramString1, paramString2, paramString3);
    AppMethodBeat.o(6545);
  }

  public void loadUrl(String paramString)
  {
    AppMethodBeat.i(6543);
    super.loadUrl(paramString);
    AppMethodBeat.o(6543);
  }

  public void loadUrl(String paramString, Map<String, String> paramMap)
  {
    AppMethodBeat.i(6544);
    super.loadUrl(paramString, paramMap);
    AppMethodBeat.o(6544);
  }

  protected final void runOnUiThread(Runnable paramRunnable)
  {
    AppMethodBeat.i(6536);
    if (Thread.currentThread() == Looper.getMainLooper().getThread())
    {
      paramRunnable.run();
      AppMethodBeat.o(6536);
    }
    while (true)
    {
      return;
      this.oUA.post(paramRunnable);
      AppMethodBeat.o(6536);
    }
  }

  public void setContext(Context paramContext)
  {
    AppMethodBeat.i(6535);
    if ((getContext() instanceof MutableContextWrapper))
      ((MutableContextWrapper)getContext()).setBaseContext(paramContext);
    AppMethodBeat.o(6535);
  }

  public void setSource(String paramString)
  {
    this.nHU = paramString;
  }

  public void setWebChromeClient(l paraml)
  {
    AppMethodBeat.i(6554);
    this.ulx.a(paraml);
    AppMethodBeat.o(6554);
  }

  protected void setWebChromeClientProxy(com.tencent.mm.plugin.webview.luggage.c paramc)
  {
    AppMethodBeat.i(6555);
    if (paramc != null)
    {
      this.ulx.a(paramc);
      this.ulx = paramc;
    }
    AppMethodBeat.o(6555);
  }

  public void setWebCore(k paramk)
  {
    AppMethodBeat.i(6540);
    this.bPN = paramk;
    xo();
    AppMethodBeat.o(6540);
  }

  public void setWebViewClient(s params)
  {
    AppMethodBeat.i(6552);
    this.ulw.a(params);
    AppMethodBeat.o(6552);
  }

  public void setWebViewClientExtension(com.tencent.xweb.x5.a.a.a.a.b paramb)
  {
    AppMethodBeat.i(6556);
    this.uly.a(paramb);
    AppMethodBeat.o(6556);
  }

  protected void setWebViewClientExtensionProxy(com.tencent.mm.plugin.webview.luggage.e parame)
  {
    AppMethodBeat.i(6557);
    if (parame != null)
    {
      this.uly.a(parame);
      this.uly = parame;
    }
    AppMethodBeat.o(6557);
  }

  protected void setWebViewClientProxy(f paramf)
  {
    AppMethodBeat.i(6553);
    if (paramf != null)
    {
      this.ulw.a(paramf);
      this.ulw = paramf;
    }
    AppMethodBeat.o(6553);
  }

  public void stopLoading()
  {
    AppMethodBeat.i(6546);
    super.stopLoading();
    AppMethodBeat.o(6546);
  }

  protected void xo()
  {
    AppMethodBeat.i(6541);
    if (getWebCore().bPD != null)
    {
      getWebCore().bPD.a(new LuggageMMLocalResourceProvider());
      getWebCore().bPD.a(new com.tencent.mm.plugin.webview.luggage.b(i.p(ah.getContext(), "luggage_mm_adapter.js")));
    }
    AppMethodBeat.o(6541);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.luggage.d.a
 * JD-Core Version:    0.6.2
 */