package com.tencent.mm.plugin.brandservice.ui.timeline.preload.ui;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Looper;
import android.util.Pair;
import android.webkit.ValueCallback;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.webview.preload.TmplParams;
import com.tencent.mm.plugin.webview.ui.tools.jsapi.d;
import com.tencent.mm.plugin.webview.ui.tools.jsapi.f;
import com.tencent.mm.plugin.webview.ui.tools.k;
import com.tencent.mm.pluginsdk.ui.tools.u;
import com.tencent.mm.protocal.GeneralControlWrapper;
import com.tencent.mm.protocal.JsapiPermissionWrapper;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.ui.widget.MMWebView;
import com.tencent.xweb.WebView;
import com.tencent.xweb.b;
import com.tencent.xweb.p;
import com.tencent.xweb.s;
import java.io.File;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;

public class e extends MMWebView
{
  private s iuo;
  public TmplParams jRb;
  private int jUG;
  public String jVi;
  public int jVj;
  public String jVk;
  private boolean jVl;
  private LinkedList<Pair<String, ValueCallback<String>>> jVm;
  protected d jVn;

  public e(Context paramContext, TmplParams paramTmplParams)
  {
    super(paramContext);
    AppMethodBeat.i(14436);
    this.jVm = new LinkedList();
    this.iuo = new e.2(this);
    this.jUG = ((int)(System.currentTimeMillis() % 1000L));
    this.inited = true;
    this.isX5Kernel = getIsX5Kernel();
    this.jVi = paramTmplParams.jVi;
    this.jVk = paramTmplParams.upO;
    this.jVj = paramTmplParams.version;
    this.jRb = paramTmplParams;
    ab.i(getTagName(), "[initParams]tmplParams:%s", new Object[] { this.jRb });
    if (ah.bqo())
    {
      ab.i(getTagName(), "[initWebviewCore] current process is mm");
      WebView.initWebviewCore(paramContext, zNq, "mm", null);
    }
    while (true)
    {
      il(paramContext);
      ab.i(getTagName(), "[initWebViewSetting]");
      getSettings().setJavaScriptEnabled(true);
      getSettings().setPluginsEnabled(true);
      getSettings().dUh();
      getSettings().setBuiltInZoomControls(false);
      getSettings().setUseWideViewPort(true);
      getSettings().setLoadWithOverviewMode(true);
      getSettings().dUc();
      getSettings().dUb();
      getSettings().setGeolocationEnabled(true);
      getSettings().setJavaScriptCanOpenWindowsAutomatically(true);
      getSettings().dUj();
      getSettings().dUf();
      getSettings().setAppCachePath(getContext().getDir("webviewcache", 0).getAbsolutePath());
      getSettings().dUe();
      getSettings().dUi();
      getSettings().dUg();
      getSettings().setDatabasePath(com.tencent.mm.compatible.util.e.eSi + "databases/");
      b.dTR().dTS();
      b.dTR().f(this);
      paramContext = u.bh(getContext(), getSettings().getUserAgentString());
      getSettings().setUserAgentString(paramContext);
      addJavascriptInterface(new e.3(this, this), "__tmpl_webview_inject_data");
      ab.i(getTagName(), "[initJsApiHandler]");
      paramContext = new k(JsapiPermissionWrapper.vxI, GeneralControlWrapper.vxF, new e.4(this));
      paramTmplParams = new HashMap();
      paramTmplParams.put("webview_type", "1");
      paramTmplParams.put("init_url", getUrl());
      paramTmplParams.put("init_font_size", "1");
      this.jVn = new d(this, paramContext, paramTmplParams);
      addJavascriptInterface(this.jVn, "__wx");
      boolean bool = ah.getContext().getSharedPreferences("com.tencent.mm_webview_x5_preferences", 4).getBoolean("wvsha1", true);
      ab.i(getTagName(), "[initJsApiHandler]enableWvSHA1:%b", new Object[] { Boolean.valueOf(bool) });
      if (bool)
      {
        this.jVn.dch();
        setRandomStr(this.jVn.uFw);
      }
      setWebViewClient(this.iuo);
      AppMethodBeat.o(14436);
      return;
      if (ah.doF())
      {
        ab.i(getTagName(), "[initWebviewCore] current process is tool");
        WebView.initWebviewCore(paramContext, zNq, "tools", null);
      }
      else if (ah.doG())
      {
        ab.i(getTagName(), "[initWebviewCore] current process is toolmp");
        WebView.initWebviewCore(paramContext, zNq, "toolsmp", null);
      }
    }
  }

  private void aYi()
  {
    try
    {
      AppMethodBeat.i(14438);
      Iterator localIterator = this.jVm.iterator();
      while (localIterator.hasNext())
      {
        Pair localPair = (Pair)localIterator.next();
        super.evaluateJavascript((String)localPair.first, (ValueCallback)localPair.second);
        ab.v(getTagName(), "[evaluateJavascript]%s", new Object[] { localPair.first });
      }
    }
    finally
    {
    }
    this.jVm.clear();
    AppMethodBeat.o(14438);
  }

  private String getTagName()
  {
    AppMethodBeat.i(14442);
    String str = "MicroMsg.TmplWxJsWebView:" + getTmplWebViewId();
    AppMethodBeat.o(14442);
    return str;
  }

  protected void aJq()
  {
    AppMethodBeat.i(14441);
    ab.i(getTagName(), "[onPageReady]");
    AppMethodBeat.o(14441);
  }

  public void aXM()
  {
    AppMethodBeat.i(14439);
    ab.i(getTagName(), "[loadUrlAndData] url:%s", new Object[] { this.jVi });
    loadUrl(this.jVi);
    AppMethodBeat.o(14439);
  }

  protected void aXN()
  {
    AppMethodBeat.i(14440);
    ab.i(getTagName(), "[initJsEnvironment]");
    new f(this, this.jVn, new e.5(this)).dcs();
    AppMethodBeat.o(14440);
  }

  protected void aXO()
  {
  }

  public void evaluateJavascript(String paramString, ValueCallback<String> paramValueCallback)
  {
    while (true)
    {
      Object localObject;
      try
      {
        AppMethodBeat.i(14437);
        if (!this.jVl)
        {
          localObject = this.jVm;
          Pair localPair = new android/util/Pair;
          localPair.<init>(paramString, paramValueCallback);
          ((LinkedList)localObject).add(localPair);
          AppMethodBeat.o(14437);
          return;
        }
        localObject = new com/tencent/mm/plugin/brandservice/ui/timeline/preload/ui/e$1;
        ((e.1)localObject).<init>(this, paramString, paramValueCallback);
        if (Looper.getMainLooper().getThread() == Thread.currentThread())
        {
          ((Runnable)localObject).run();
          AppMethodBeat.o(14437);
          continue;
        }
      }
      finally
      {
      }
      al.d((Runnable)localObject);
      AppMethodBeat.o(14437);
    }
  }

  protected final String getInjectAPI()
  {
    return "__tmpl_webview_inject_data.getString()";
  }

  public d getJsApiHandler()
  {
    return this.jVn;
  }

  protected String getPageString()
  {
    return "";
  }

  protected int getTmplWebViewId()
  {
    return this.jUG;
  }

  public s getWebViewClient()
  {
    return this.iuo;
  }

  public final boolean isReady()
  {
    return this.jVl;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.brandservice.ui.timeline.preload.ui.e
 * JD-Core Version:    0.6.2
 */