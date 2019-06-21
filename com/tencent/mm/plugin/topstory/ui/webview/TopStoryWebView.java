package com.tencent.mm.plugin.topstory.ui.webview;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.WindowManager;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.compatible.loader.c;
import com.tencent.mm.compatible.util.e;
import com.tencent.mm.plugin.topstory.a.g;
import com.tencent.mm.pluginsdk.ui.tools.u;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.ui.widget.MMWebView;
import com.tencent.xweb.p;
import java.io.File;
import java.lang.reflect.Field;

public class TopStoryWebView extends MMWebView
{
  private Context context;

  public TopStoryWebView(Context paramContext)
  {
    super(paramContext);
    AppMethodBeat.i(2160);
    this.context = paramContext;
    init();
    AppMethodBeat.o(2160);
  }

  public TopStoryWebView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(2161);
    this.context = paramContext;
    init();
    AppMethodBeat.o(2161);
  }

  public TopStoryWebView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    AppMethodBeat.i(2162);
    this.context = paramContext;
    init();
    AppMethodBeat.o(2162);
  }

  private void cHn()
  {
    AppMethodBeat.i(2164);
    if (getIsX5Kernel())
      AppMethodBeat.o(2164);
    while (true)
    {
      return;
      if (com.tencent.mm.compatible.util.d.iW(19))
        AppMethodBeat.o(2164);
      else
        try
        {
          Object localObject1 = new com/tencent/mm/compatible/loader/c;
          ((c)localObject1).<init>(this, "mSysWebView", null);
          localObject1 = ((c)localObject1).get();
          ab.d("MicroMsg.TopStory.TopStoryWebView", "tryInterruptAwaitingWebCoreThread, mSysWebView = %s", new Object[] { localObject1 });
          Object localObject2 = new com/tencent/mm/compatible/loader/c;
          ((c)localObject2).<init>(localObject1, "mProvider", null);
          localObject2 = ((c)localObject2).get();
          ab.d("MicroMsg.TopStory.TopStoryWebView", "tryInterruptAwaitingWebCoreThread, mWebViewClassic = %s", new Object[] { localObject2 });
          localObject1 = new com/tencent/mm/compatible/loader/c;
          ((c)localObject1).<init>(localObject2, "mWebViewCore", null);
          localObject2 = ((c)localObject1).get();
          ab.d("MicroMsg.TopStory.TopStoryWebView", "tryInterruptAwaitingWebCoreThread, mWebViewCore = %s", new Object[] { localObject2 });
          localObject1 = new com/tencent/mm/compatible/loader/c;
          ((c)localObject1).<init>(localObject2, "sWebCoreHandler", null);
          localObject1 = ((c)localObject1).get();
          ab.d("MicroMsg.TopStory.TopStoryWebView", "tryInterruptAwaitingWebCoreThread, sWebCoreHandler = %s", new Object[] { localObject1 });
          localObject2 = new com/tencent/mm/compatible/loader/c;
          ((c)localObject2).<init>(localObject1, "mLooper", null);
          localObject2 = ((c)localObject2).get();
          ab.d("MicroMsg.TopStory.TopStoryWebView", "tryInterruptAwaitingWebCoreThread, mLooper = %s", new Object[] { localObject2 });
          localObject1 = new com/tencent/mm/compatible/loader/c;
          ((c)localObject1).<init>(localObject2, "mThread", null);
          localObject1 = ((c)localObject1).get();
          ab.d("MicroMsg.TopStory.TopStoryWebView", "tryInterruptAwaitingWebCoreThread, mThread = %s", new Object[] { localObject1 });
          if ((localObject1 instanceof Thread))
          {
            localObject1 = (Thread)localObject1;
            ab.i("MicroMsg.TopStory.TopStoryWebView", "tryInterruptAwaitingWebCoreThread, webCoreThread.getState = %s", new Object[] { ((Thread)localObject1).getState() });
            if (((Thread)localObject1).getState() == Thread.State.WAITING)
              ((Thread)localObject1).interrupt();
          }
          AppMethodBeat.o(2164);
        }
        catch (Exception localException)
        {
          ab.e("MicroMsg.TopStory.TopStoryWebView", "tryInterruptAwaitingWebCoreThread, exception = %s", new Object[] { localException });
          AppMethodBeat.o(2164);
        }
    }
  }

  private void init()
  {
    AppMethodBeat.i(2163);
    ab.i("MicroMsg.TopStory.TopStoryWebView", "init TopStoryWebView");
    this.inited = true;
    il(this.context);
    cHn();
    AppMethodBeat.o(2163);
  }

  public final void a(b paramb, d paramd)
  {
    AppMethodBeat.i(2165);
    getSettings().dUh();
    getSettings().setJavaScriptEnabled(true);
    getSettings().setPluginsEnabled(true);
    getSettings().setBuiltInZoomControls(false);
    getSettings().setMediaPlaybackRequiresUserGesture(true);
    getSettings().dUj();
    getSettings().setUserAgentString(u.bh(getContext(), getSettings().getUserAgentString()));
    getSettings().setUseWideViewPort(true);
    getSettings().setLoadWithOverviewMode(true);
    getSettings().dUc();
    getSettings().dUb();
    getSettings().setGeolocationEnabled(true);
    getSettings().setJavaScriptCanOpenWindowsAutomatically(true);
    getSettings().dUj();
    getSettings().dUf();
    getSettings().setAppCachePath(this.context.getDir("webviewcache", 0).getAbsolutePath());
    getSettings().dUe();
    getSettings().dUg();
    getSettings().setDatabasePath(e.eSi + "databases/");
    com.tencent.xweb.b.dTR().dTS();
    com.tencent.xweb.b.dTR().f(this);
    getView().setHorizontalScrollBarEnabled(false);
    getView().setVerticalScrollBarEnabled(true);
    setConfigCallback((WindowManager)ah.getContext().getSystemService("window"));
    super.setWebChromeClient(paramb);
    super.setWebViewClient(paramd);
    ab.i("MicroMsg.TopStory.TopStoryWebView", "Is the current broswer kernel X5, " + getIsX5Kernel());
    setBackgroundColor(-1);
    setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
    dKH();
    try
    {
      if (Build.VERSION.SDK_INT >= 19)
      {
        if (!g.cFm())
          break label380;
        android.webkit.WebView.setWebContentsDebuggingEnabled(true);
      }
      while (true)
      {
        f = getContext().getSharedPreferences(ah.doA(), 0).getFloat("current_text_size_scale_key", 1.0F);
        if (f < 2.025F)
          break;
        getSettings().setTextZoom(160);
        ab.i("MicroMsg.TopStory.TopStoryWebView", "SetFontSize, fontSize = %f", new Object[] { Float.valueOf(f) });
        AppMethodBeat.o(2165);
        return;
        label380: android.webkit.WebView.setWebContentsDebuggingEnabled(false);
      }
    }
    catch (Exception paramb)
    {
      while (true)
      {
        float f;
        continue;
        if (f >= 1.875F)
          getSettings().setTextZoom(150);
        else if (f >= 1.625F)
          getSettings().setTextZoom(140);
        else if (f >= 1.375F)
          getSettings().setTextZoom(130);
        else if (f >= 1.25F)
          getSettings().setTextZoom(120);
        else if (f >= 1.125F)
          getSettings().setTextZoom(110);
        else if (f >= 1.0F)
          getSettings().setTextZoom(100);
        else if (f >= 0.875F)
          getSettings().setTextZoom(90);
        else
          getSettings().setTextZoom(80);
      }
    }
  }

  public final void onDestroy()
  {
    AppMethodBeat.i(2166);
    this.context = null;
    super.setWebChromeClient(null);
    super.setWebViewClient(null);
    destroy();
    removeJavascriptInterface("topStoryJSApi");
    try
    {
      destroy();
      AppMethodBeat.o(2166);
      return;
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.TopStory.TopStoryWebView", localException, "onDestroy", new Object[0]);
        AppMethodBeat.o(2166);
      }
    }
  }

  public void setConfigCallback(WindowManager paramWindowManager)
  {
    AppMethodBeat.i(2167);
    try
    {
      Field localField = com.tencent.xweb.WebView.class.getDeclaredField("mWebViewCore").getType().getDeclaredField("mBrowserFrame").getType().getDeclaredField("sConfigCallback");
      localField.setAccessible(true);
      Object localObject = localField.get(null);
      if (localObject == null)
        AppMethodBeat.o(2167);
      while (true)
      {
        return;
        localField = localField.getType().getDeclaredField("mWindowManager");
        localField.setAccessible(true);
        localField.set(localObject, paramWindowManager);
        AppMethodBeat.o(2167);
      }
    }
    catch (Exception paramWindowManager)
    {
      while (true)
        AppMethodBeat.o(2167);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.topstory.ui.webview.TopStoryWebView
 * JD-Core Version:    0.6.2
 */