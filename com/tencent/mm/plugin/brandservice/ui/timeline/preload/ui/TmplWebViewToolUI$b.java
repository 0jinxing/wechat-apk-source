package com.tencent.mm.plugin.brandservice.ui.timeline.preload.ui;

import a.f.a.q;
import a.k.m;
import a.v;
import a.y;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Process;
import android.view.View;
import android.view.View.OnLongClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.b.g.a;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.brandservice.ui.timeline.preload.PreloadLogic;
import com.tencent.mm.plugin.brandservice.ui.timeline.preload.PreloadLogic.PreloadSession;
import com.tencent.mm.plugin.brandservice.ui.timeline.preload.PreloadLogic.h;
import com.tencent.mm.plugin.webview.preload.TmplParams;
import com.tencent.mm.pluginsdk.s;
import com.tencent.mm.protocal.GeneralControlWrapper;
import com.tencent.mm.protocal.JsapiPermissionWrapper;
import com.tencent.mm.protocal.protobuf.ef;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.ui.e.m;
import com.tencent.xweb.WebView;
import com.tencent.xweb.WebView.d;
import com.tencent.xweb.p;
import java.lang.ref.WeakReference;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

@a.l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/brandservice/ui/timeline/preload/ui/TmplWebViewToolUI$TmplController;", "Lcom/tencent/mm/plugin/brandservice/ui/timeline/preload/ui/ITmplController;", "webViewUI", "Lcom/tencent/mm/plugin/brandservice/ui/timeline/preload/ui/TmplWebViewToolUI;", "(Lcom/tencent/mm/plugin/brandservice/ui/timeline/preload/ui/TmplWebViewToolUI;Lcom/tencent/mm/plugin/brandservice/ui/timeline/preload/ui/TmplWebViewToolUI;)V", "TIMEOUT_TIME", "", "checkInjectDataRunnable", "Ljava/lang/Runnable;", "checkNotifyPageRunnable", "isNextWebViewPreloaded", "", "isUseDataCache", "isUsePreloadWebView", "kv15862", "Lcom/tencent/mm/plugin/brandservice/ui/timeline/preload/Kv15862;", "receivePageData", "", "showProgressBarRunnable", "startGetPageData", "startLoadPage", "getWebViewUI", "()Lcom/tencent/mm/plugin/brandservice/ui/timeline/preload/ui/TmplWebViewToolUI;", "adjustFullUrl", "", "fullUrl", "afterCreate", "", "beforeCreate", "checkNotifyPage", "createJsApiHandler", "createWebView", "createWebViewClient", "finishAllCheck", "fixProgressBar", "notifyPageInfo", "pageInfo", "preloadWebview", "processCommonGetA8KeyFullUrl", "reqUrl", "httpHeader", "", "processData", "processGetA8Key", "data", "Landroid/os/Bundle;", "processGetA8KeyFail", "processGetAppContext", "result", "Lcom/tencent/mm/plugin/brandservice/ui/timeline/preload/PreloadLogic$MountableCGIResult;", "appMsgContext", "Lcom/tencent/mm/protocal/protobuf/AppMsgContext;", "processLongClick", "processReport", "removeShowProcess", "showBackBtnRes", "startGetA8Key", "url", "force", "supplyPageFinishInvoke", "tryPreloadNextWebView", "updateKV", "updatePageAuth", "plugin-brandservice_release"})
final class TmplWebViewToolUI$b
  implements a
{
  private long jUU;
  private boolean jUV;
  boolean jUW;
  final int jUX;
  final com.tencent.mm.plugin.brandservice.ui.timeline.preload.f jUY;
  final Runnable jUZ;
  long jUd;
  long jUe;
  private final Runnable jVa;
  final Runnable jVb;
  private boolean jVc;
  final TmplWebViewToolUI jVd;

  public TmplWebViewToolUI$b(TmplWebViewToolUI paramTmplWebViewToolUI)
  {
    AppMethodBeat.i(15069);
    this.jVd = localObject;
    this.jUX = 5000;
    this.jUY = new com.tencent.mm.plugin.brandservice.ui.timeline.preload.f();
    this.jUZ = ((Runnable)new TmplWebViewToolUI.b.c(this));
    this.jVa = ((Runnable)new TmplWebViewToolUI.b.d(this));
    this.jVb = ((Runnable)new TmplWebViewToolUI.b.i(this));
    AppMethodBeat.o(15069);
  }

  private static String Gb(String paramString)
  {
    AppMethodBeat.i(15066);
    paramString = (CharSequence)paramString;
    paramString = new a.k.k("http://").c(paramString, "https://");
    AppMethodBeat.o(15066);
    return paramString;
  }

  public final void F(Bundle paramBundle)
  {
    AppMethodBeat.i(15063);
    a.f.b.j.p(paramBundle, "data");
    String str = paramBundle.getString("geta8key_result_full_url");
    if (str == null)
      a.f.b.j.dWJ();
    if (m.jb(str, "http://"))
    {
      JsapiPermissionWrapper localJsapiPermissionWrapper = new JsapiPermissionWrapper(paramBundle.getByteArray("geta8key_result_jsapi_perm_control_bytes"));
      paramBundle = new GeneralControlWrapper(paramBundle.getInt("geta8key_result_general_ctrl_b1"));
      TmplWebViewToolUI.k(this.jVe).a(Gb(str), localJsapiPermissionWrapper, paramBundle);
    }
    AppMethodBeat.o(15063);
  }

  public final void FX(String paramString)
  {
    AppMethodBeat.i(15062);
    if ((paramString != null) && (a.f.b.j.j(paramString, TmplWebViewToolUI.d(this.jVe))))
    {
      com.tencent.mm.plugin.webview.preload.a.gu(TmplWebViewToolUI.c(this.jVe).upQ, 116);
      this.jUY.jRt = System.currentTimeMillis();
    }
    AppMethodBeat.o(15062);
  }

  public final void FY(String paramString)
  {
    AppMethodBeat.i(15068);
    a.f.b.j.p(paramString, "pageInfo");
    ab.i(TmplWebViewToolUI.b(this.jVe), "[notifyPageInfo]pageInfo:".concat(String.valueOf(paramString)));
    try
    {
      JSONObject localJSONObject = new org/json/JSONObject;
      localJSONObject.<init>(paramString);
      paramString = new org/json/JSONObject;
      paramString.<init>(localJSONObject.optString("performance"));
      long l1 = paramString.getLong("compileTime");
      long l2 = paramString.getLong("receivePageDataTimestamp");
      long l3 = paramString.getLong("firstScreenTimestamp");
      long l4 = paramString.getLong("firstScreenTime");
      this.jUY.jRn = l1;
      this.jUY.jRo = l2;
      this.jUY.jRk = l3;
      this.jUY.jRm = l4;
      paramString = localJSONObject.optString("injectPageDataResult", "fail");
      aYg();
      if (a.f.b.j.j(paramString, "ok"))
      {
        TmplWebViewToolUI.a(this.jVe).setNotifyPageSuccess(true);
        this.jUY.jSe = true;
        al.af(this.jUZ);
        al.af(this.jVa);
        this.jUY.IF();
        com.tencent.mm.plugin.webview.preload.a.gu(TmplWebViewToolUI.c(this.jVe).upQ, 131);
        com.tencent.mm.plugin.webview.preload.a.IU(108);
      }
      while (true)
      {
        this.jUY.jRC = System.currentTimeMillis();
        al.n((Runnable)new TmplWebViewToolUI.b.e(this), 300L);
        AppMethodBeat.o(15068);
        return;
        this.jUY.jSt = true;
        TmplWebViewToolUI.f(this.jVe);
      }
    }
    catch (JSONException paramString)
    {
      while (true)
      {
        ab.printErrStackTrace(TmplWebViewToolUI.b(this.jVe), (Throwable)paramString, "", new Object[0]);
        this.jUY.jSt = true;
        TmplWebViewToolUI.f(this.jVe);
      }
    }
  }

  public final void G(Bundle paramBundle)
  {
    AppMethodBeat.i(15067);
    a.f.b.j.p(paramBundle, "data");
    com.tencent.mm.plugin.webview.preload.a.gu(TmplWebViewToolUI.c(this.jVe).upQ, 118);
    this.jUY.jRu = System.currentTimeMillis();
    b.a(TmplWebViewToolUI.a(this.jVe), "");
    if (TmplWebViewToolUI.n(this.jVe) != null)
    {
      paramBundle = TmplWebViewToolUI.n(this.jVe);
      a.f.b.j.o(paramBundle, "this@TmplWebViewToolUI.refreshMask");
      paramBundle.setVisibility(8);
    }
    AppMethodBeat.o(15067);
  }

  public final boolean a(String paramString1, String paramString2, Map<String, String> paramMap)
  {
    AppMethodBeat.i(15064);
    a.f.b.j.p(paramString1, "reqUrl");
    a.f.b.j.p(paramString2, "fullUrl");
    a.f.b.j.p(paramMap, "httpHeader");
    com.tencent.mm.plugin.webview.preload.a.gu(TmplWebViewToolUI.c(this.jVe).upQ, 117);
    this.jUY.jRu = System.currentTimeMillis();
    this.jUY.jSd = true;
    aYg();
    this.jUY.IF();
    b(paramString1, paramString2, paramMap);
    TmplWebViewToolUI.a(this.jVe).a(true, Gb(paramString2), TmplWebViewToolUI.e(this.jVe));
    TmplWebViewToolUI.l(this.jVe).afE(Gb(paramString2));
    AppMethodBeat.o(15064);
    return true;
  }

  public final void aXG()
  {
    boolean bool1 = false;
    AppMethodBeat.i(15059);
    this.jVe.getIntent().putExtra("show_native_web_view", true);
    al.n(this.jVb, 500L);
    Object localObject1 = (b)c.a((Context)this.jVe, TmplWebViewToolUI.c(this.jVe));
    Object localObject2;
    if (localObject1 == null)
    {
      localObject1 = c.b((Context)this.jVe, TmplWebViewToolUI.c(this.jVe));
      if (localObject1 == null)
      {
        localObject1 = new v("null cannot be cast to non-null type com.tencent.mm.plugin.brandservice.ui.timeline.preload.ui.TmplWebView");
        AppMethodBeat.o(15059);
        throw ((Throwable)localObject1);
      }
      localObject1 = (b)localObject1;
      this.jUV = false;
      com.tencent.mm.plugin.webview.preload.a.gu(TmplWebViewToolUI.c(this.jVe).upQ, 111);
      if (com.tencent.mm.plugin.webview.ui.tools.jsapi.f.c((WebView)localObject1))
        com.tencent.mm.plugin.webview.preload.a.IU(112);
      localObject2 = this.jVe;
      if (localObject1 == null)
        a.f.b.j.dWJ();
      TmplWebViewToolUI.a((TmplWebViewToolUI)localObject2, (b)localObject1);
      localObject1 = TmplWebViewToolUI.a(this.jVe);
      localObject2 = (a.f.a.b)TmplWebViewToolUI.b.f.jVg;
      a.f.b.j.p(this, "context");
      a.f.b.j.p(localObject2, "callback");
      if (!((b)localObject1).jUm)
        break label479;
      ((a.f.a.b)localObject2).am(new WeakReference(this));
    }
    Object localObject3;
    while (true)
    {
      ab.v(TmplWebViewToolUI.b(this.jVe), "processData");
      this.jUU = System.currentTimeMillis();
      this.jUd = this.jVe.getIntent().getLongExtra(e.m.ygg, 0L);
      localObject1 = g.RM().Rn();
      a.f.b.j.o(localObject1, "MMKernel.process().current()");
      localObject3 = ((com.tencent.mm.kernel.b.h)localObject1).SF();
      localObject2 = this.jVe.getIntent().getStringExtra(e.m.ygi);
      if (localObject2 != null)
        break label498;
      localObject1 = TmplWebViewToolUI.b(this.jVe);
      localObject3 = new StringBuilder("dataKey is null, ");
      localObject2 = this.jVe.getIntent();
      a.f.b.j.o(localObject2, "intent");
      ab.e((String)localObject1, com.tencent.mm.plugin.brandservice.ui.timeline.preload.d.Q((Intent)localObject2));
      com.tencent.mm.plugin.webview.preload.a.IU(151);
      localObject2 = com.tencent.mm.plugin.report.service.h.pYm;
      localObject1 = this.jVe.getIntent();
      a.f.b.j.o(localObject1, "intent");
      ((com.tencent.mm.plugin.report.service.h)localObject2).e(17260, new Object[] { Integer.valueOf(1), com.tencent.mm.plugin.brandservice.ui.timeline.preload.d.Q((Intent)localObject1) });
      this.jVe.finish();
      if ((com.tencent.mm.sdk.platformtools.f.DEBUG) || (com.tencent.mm.sdk.platformtools.f.IS_FLAVOR_RED) || (1 >= ab.getLogLevel()))
        TmplWebViewToolUI.a(this.jVe, (View.OnLongClickListener)new TmplWebViewToolUI.b.h(this));
      AppMethodBeat.o(15059);
      return;
      if (((b)localObject1).getState() >= 2);
      for (bool2 = true; ; bool2 = false)
      {
        this.jUV = bool2;
        com.tencent.mm.plugin.webview.preload.a.gu(TmplWebViewToolUI.c(this.jVe).upQ, 110);
        break;
      }
      label479: ((b)localObject1).jUn = ((a.f.a.a)new b.d((a.f.a.b)localObject2, this));
    }
    label498: localObject1 = this.jUY;
    boolean bool2 = bool1;
    if (((g.a)localObject3).eMy < this.jUd)
      bool2 = true;
    ((com.tencent.mm.plugin.brandservice.ui.timeline.preload.f)localObject1).jSb = bool2;
    int i;
    if (this.jUY.jSb)
    {
      i = 104;
      label542: com.tencent.mm.plugin.webview.preload.a.IU(i);
      switch (com.tencent.mm.plugin.brandservice.ui.timeline.preload.l.a(this.jVe.getIntent().getIntExtra(e.m.ygn, -1), this.jUd, Process.myPid(), ((g.a)localObject3).eMq))
      {
      default:
      case 1:
      case 2:
      }
    }
    while (true)
    {
      this.jUY.jRX = TmplWebViewToolUI.e(this.jVe).jTb;
      this.jUY.jRY = TmplWebViewToolUI.e(this.jVe).jTc;
      this.jUY.jRZ = com.tencent.mm.plugin.webview.ui.tools.jsapi.f.c((WebView)TmplWebViewToolUI.a(this.jVe));
      this.jUY.jSa = TmplWebViewToolUI.e(this.jVe).jSa;
      this.jUY.jRJ = ((g.a)localObject3).eMq;
      this.jUY.jRK = ((g.a)localObject3).eMr;
      this.jUY.jRL = ((g.a)localObject3).eMs;
      this.jUY.jRM = ((g.a)localObject3).eMt;
      this.jUY.jRN = ((g.a)localObject3).eMu;
      this.jUY.jRO = ((g.a)localObject3).eMv;
      this.jUY.jRP = ((g.a)localObject3).eMw;
      this.jUY.jRQ = ((g.a)localObject3).eMx;
      this.jUY.jRR = ((g.a)localObject3).eMy;
      this.jUY.jRj = this.jUd;
      this.jUY.jRp = this.jUU;
      this.jUY.jSu = TmplWebViewToolUI.e(this.jVe).jSu;
      PreloadLogic.jSS.a(this, (String)localObject2, TmplWebViewToolUI.e(this.jVe), (q)g.jVh);
      break;
      i = 103;
      break label542;
      this.jUY.jSc = 1;
      this.jUd = ((g.a)localObject3).eMq;
      continue;
      this.jUY.jSc = 2;
      this.jUd = -1L;
    }
  }

  public final void aXH()
  {
    AppMethodBeat.i(15061);
    ab.i(TmplWebViewToolUI.b(this.jVe), "afterCreate isWebViewCreated:" + this.jUV + " state:" + TmplWebViewToolUI.a(this.jVe).getState());
    TmplWebViewToolUI.a(this.jVe).c((a.f.a.b)new TmplWebViewToolUI.b.a(this));
    if (this.jUV)
      al.n((Runnable)new TmplWebViewToolUI.b.b(this), 1000L);
    com.tencent.mm.plugin.brandservice.ui.timeline.preload.f localf = this.jUY;
    Object localObject = TmplWebViewToolUI.c(this.jVe);
    a.f.b.j.p(localObject, "<set-?>");
    localf.jRb = ((TmplParams)localObject);
    localf = this.jUY;
    localObject = TmplWebViewToolUI.d(this.jVe);
    a.f.b.j.o(localObject, "getRawUrl()");
    a.f.b.j.p(localObject, "<set-?>");
    localf.url = ((String)localObject);
    this.jUY.jRT = this.jUV;
    this.jUY.jRS = this.jUW;
    this.jUY.jSr = TmplWebViewToolUI.a(this.jVe).getWebCoreType().name();
    if (this.jUV);
    for (int i = 106; ; i = 105)
    {
      com.tencent.mm.plugin.webview.preload.a.IU(i);
      com.tencent.mm.plugin.brandservice.ui.timeline.preload.j.FQ("use preloaded webview:true");
      AppMethodBeat.o(15061);
      return;
    }
  }

  public final boolean aXI()
  {
    return true;
  }

  public final boolean aXJ()
  {
    return true;
  }

  public final boolean aXK()
  {
    return true;
  }

  public final boolean aXL()
  {
    return true;
  }

  final void aYg()
  {
    AppMethodBeat.i(15060);
    this.jUY.jRD = TmplWebViewToolUI.g(this.jVe).ais("onCreate");
    this.jUY.jRE = TmplWebViewToolUI.g(this.jVe).ais("onUIInitStart");
    this.jUY.jRF = TmplWebViewToolUI.g(this.jVe).ais("onUIInitEnd");
    this.jUY.jRG = TmplWebViewToolUI.g(this.jVe).ais("onTryBindServiceStart");
    this.jUY.jRG = TmplWebViewToolUI.g(this.jVe).ais("onTryBindServiceEnd");
    this.jUY.jRH = TmplWebViewToolUI.g(this.jVe).ais("onPostBindedStart");
    this.jUY.jRI = TmplWebViewToolUI.g(this.jVe).ais("onPostBindedEnd");
    Object localObject = TmplWebViewToolUI.a(this.jVe);
    com.tencent.mm.plugin.brandservice.ui.timeline.preload.f localf = this.jUY;
    a.f.b.j.p(localf, "kv");
    ab.v(((b)localObject).getTAG(), "terry trace updateKV");
    localf.jRx = ((b)localObject).getPerformanceHelper().ais("onInjectStart");
    localf.jRy = ((b)localObject).getPerformanceHelper().ais("onInjectEnd");
    localf.jRA = ((b)localObject).getPerformanceHelper().ais("onTmplLoadStart");
    localf.jRB = ((b)localObject).getPerformanceHelper().ais("onTmplLoadEnd");
    localf.jRv = ((b)localObject).getPerformanceHelper().ais("onCreateStart");
    localf.jRw = ((b)localObject).getPerformanceHelper().ais("onCreateEnd");
    localf.jRV = ((b)localObject).jUk;
    localf.jRz = ((b)localObject).getPerformanceHelper().ais("onWebInjectEnd");
    localObject = ((b)localObject).getRandomStr();
    a.f.b.j.o(localObject, "randomStr");
    a.f.b.j.p(localObject, "<set-?>");
    localf.key = ((String)localObject);
    AppMethodBeat.o(15060);
  }

  public final void b(String paramString1, String paramString2, Map<String, String> paramMap)
  {
    AppMethodBeat.i(15065);
    a.f.b.j.p(paramString1, "reqUrl");
    a.f.b.j.p(paramString2, "fullUrl");
    a.f.b.j.p(paramMap, "httpHeader");
    ab.i(TmplWebViewToolUI.b(this.jVe), "[updatePageAuth]reqUrl:" + paramString1 + " fullUrl:" + paramString2 + " httpHeader:" + paramMap);
    TmplWebViewToolUI.a(this.jVe).evaluateJavascript("history.replaceState({},\"\",\"" + Gb(paramString2) + "\");", null);
    paramString1 = TmplWebViewToolUI.a(this.jVe).getSettings();
    a.f.b.j.o(paramString1, "tmplWebView.settings");
    paramString1 = paramString1.getUserAgentString();
    a.f.b.j.o(paramString1, "tmplWebView.settings.userAgentString");
    paramMap.put("User-agent", paramString1);
    TmplWebViewToolUI.m(this.jVe).agm(new JSONObject(paramMap).toString());
    paramString1 = Uri.parse(paramString2).getQueryParameter("pass_ticket");
    TmplWebViewToolUI.m(this.jVe).agl(paramString1);
    AppMethodBeat.o(15065);
  }

  @a.l(dWo={1, 1, 13}, dWp={""}, dWq={"<anonymous>", "", "context", "Ljava/lang/ref/WeakReference;", "", "result", "Lcom/tencent/mm/plugin/brandservice/ui/timeline/preload/PreloadLogic$MountableCGIResult;", "appMsgContext", "Lcom/tencent/mm/protocal/protobuf/AppMsgContext;", "invoke"})
  static final class g extends a.f.b.k
    implements q<WeakReference<Object>, PreloadLogic.h, ef, y>
  {
    public static final g jVh;

    static
    {
      AppMethodBeat.i(15055);
      jVh = new g();
      AppMethodBeat.o(15055);
    }

    g()
    {
      super();
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.brandservice.ui.timeline.preload.ui.TmplWebViewToolUI.b
 * JD-Core Version:    0.6.2
 */