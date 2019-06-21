package com.tencent.mm.plugin.brandservice.ui.timeline.preload.ui;

import a.f;
import a.f.b.j;
import a.f.b.t;
import a.g;
import a.l;
import a.y;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.brandservice.ui.timeline.preload.PreloadLogic.PreloadSession;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.plugin.webview.preload.TmplParams;
import com.tencent.mm.plugin.webview.ui.tools.WebViewUI;
import com.tencent.mm.plugin.webview.ui.tools.WebViewUI.h;
import com.tencent.mm.plugin.webview.ui.tools.WebViewUI.w;
import com.tencent.mm.protocal.GeneralControlWrapper;
import com.tencent.mm.protocal.JsapiPermissionWrapper;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.at;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.e.m;
import com.tencent.mm.ui.widget.MMWebView;
import com.tencent.xweb.WebView;
import com.tencent.xweb.s;
import java.util.Map;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/brandservice/ui/timeline/preload/ui/TmplWebViewToolUI;", "Lcom/tencent/mm/plugin/webview/ui/tools/WebViewUI;", "()V", "TAG", "", "getTAG", "()Ljava/lang/String;", "httpHeader", "", "isA8KeyDone", "", "isDestroied", "isRefreshWebViewByGetA8Key", "isTmplWebView", "openType", "", "getOpenType", "()I", "openType$delegate", "Lkotlin/Lazy;", "pfullUrl", "session", "Lcom/tencent/mm/plugin/brandservice/ui/timeline/preload/PreloadLogic$PreloadSession;", "getSession", "()Lcom/tencent/mm/plugin/brandservice/ui/timeline/preload/PreloadLogic$PreloadSession;", "session$delegate", "tempWebViewClient", "Lcom/tencent/mm/plugin/webview/ui/tools/WebViewUI$DefaultWebViewClient;", "getTempWebViewClient", "()Lcom/tencent/mm/plugin/webview/ui/tools/WebViewUI$DefaultWebViewClient;", "setTempWebViewClient", "(Lcom/tencent/mm/plugin/webview/ui/tools/WebViewUI$DefaultWebViewClient;)V", "tmplController", "Lcom/tencent/mm/plugin/brandservice/ui/timeline/preload/ui/ITmplController;", "tmplParams", "Lcom/tencent/mm/plugin/webview/preload/TmplParams;", "getTmplParams", "()Lcom/tencent/mm/plugin/webview/preload/TmplParams;", "tmplParams$delegate", "tmplWebView", "Lcom/tencent/mm/plugin/brandservice/ui/timeline/preload/ui/TmplWebView;", "tmplWebViewId", "createJsApiHandler", "Lcom/tencent/mm/plugin/webview/ui/tools/jsapi/JsApiHandler;", "createWebView", "Lcom/tencent/mm/ui/widget/MMWebView;", "createWebViewClient", "Lcom/tencent/xweb/WebViewClient;", "enableMinimize", "enableWvSHA1", "finish", "", "forceUseOriWebViewUI", "initTmplWebView", "isFastLoadPage", "isWebViewPreloaded", "needInvokePageFinished", "notifyPageInfo", "pageInfo", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "processCommonGetA8KeyFullUrl", "reqUrl", "fullUrl", "processGetA8Key", "data", "processGetA8KeyFail", "refreshWebView", "showBackBtnRes", "startGetA8Key", "Lcom/tencent/mm/plugin/webview/ui/tools/WebViewUI$StartGetA8KeyResult;", "url", "force", "updatePageAuth", "Companion", "TmplController", "plugin-brandservice_release"})
public class TmplWebViewToolUI extends WebViewUI
{
  public static final TmplWebViewToolUI.a jUT;
  private int jUG;
  private b jUH;
  private a jUI;
  private final f jUJ;
  private final f jUK;
  private final f jUL;
  private boolean jUM;
  private boolean jUN;
  private String jUO;
  private Map<String, String> jUP;
  private boolean jUQ;
  private WebViewUI.h jUR;
  private boolean jUS;

  static
  {
    AppMethodBeat.i(15083);
    eQB = new a.i.k[] { (a.i.k)a.f.b.v.a(new t(a.f.b.v.aN(TmplWebViewToolUI.class), "openType", "getOpenType()I")), (a.i.k)a.f.b.v.a(new t(a.f.b.v.aN(TmplWebViewToolUI.class), "session", "getSession()Lcom/tencent/mm/plugin/brandservice/ui/timeline/preload/PreloadLogic$PreloadSession;")), (a.i.k)a.f.b.v.a(new t(a.f.b.v.aN(TmplWebViewToolUI.class), "tmplParams", "getTmplParams()Lcom/tencent/mm/plugin/webview/preload/TmplParams;")) };
    jUT = new TmplWebViewToolUI.a((byte)0);
    AppMethodBeat.o(15083);
  }

  public TmplWebViewToolUI()
  {
    AppMethodBeat.i(15101);
    this.jUJ = g.g((a.f.a.a)new TmplWebViewToolUI.d(this));
    this.jUK = g.g((a.f.a.a)new e(this));
    this.jUL = g.g((a.f.a.a)new g(this));
    this.jUR = ((WebViewUI.h)new TmplWebViewToolUI.f(this));
    this.jUS = true;
    AppMethodBeat.o(15101);
  }

  private final TmplParams aWY()
  {
    AppMethodBeat.i(15086);
    TmplParams localTmplParams = (TmplParams)this.jUL.getValue();
    AppMethodBeat.o(15086);
    return localTmplParams;
  }

  private final int aXV()
  {
    AppMethodBeat.i(15085);
    int i = ((Number)this.jUJ.getValue()).intValue();
    AppMethodBeat.o(15085);
    return i;
  }

  private final PreloadLogic.PreloadSession aXW()
  {
    AppMethodBeat.i(138518);
    PreloadLogic.PreloadSession localPreloadSession = (PreloadLogic.PreloadSession)this.jUK.getValue();
    AppMethodBeat.o(138518);
    return localPreloadSession;
  }

  private final String getTAG()
  {
    AppMethodBeat.i(15084);
    String str = "MicroMsg.TmplWebViewToolUI:" + this.jUG;
    AppMethodBeat.o(15084);
    return str;
  }

  public final void FY(String paramString)
  {
    AppMethodBeat.i(15099);
    j.p(paramString, "pageInfo");
    a locala = this.jUI;
    if (locala == null)
      j.avw("tmplController");
    locala.FY(paramString);
    AppMethodBeat.o(15099);
  }

  public final void G(Bundle paramBundle)
  {
    AppMethodBeat.i(15095);
    j.p(paramBundle, "data");
    a locala = this.jUI;
    if (locala == null)
      j.avw("tmplController");
    locala.G(paramBundle);
    AppMethodBeat.o(15095);
  }

  public final boolean H(Bundle paramBundle)
  {
    AppMethodBeat.i(15092);
    j.p(paramBundle, "data");
    a locala = this.jUI;
    if (locala == null)
      j.avw("tmplController");
    locala.F(paramBundle);
    String str = paramBundle.getString("geta8key_result_req_url");
    locala = this.jUI;
    if (locala == null)
      j.avw("tmplController");
    if (((locala instanceof TmplWebViewToolUI.b)) && (str != null) && (j.j(str, cWL())))
      d.m(str, paramBundle);
    boolean bool = super.H(paramBundle);
    AppMethodBeat.o(15092);
    return bool;
  }

  public final boolean aXL()
  {
    AppMethodBeat.i(15098);
    a locala = this.jUI;
    if (locala == null)
      j.avw("tmplController");
    boolean bool;
    if (locala.aXL())
    {
      bool = false;
      AppMethodBeat.o(15098);
    }
    while (true)
    {
      return bool;
      bool = super.aXL();
      AppMethodBeat.o(15098);
    }
  }

  public final MMWebView aXX()
  {
    AppMethodBeat.i(15089);
    Object localObject = this.jUI;
    if (localObject == null)
      j.avw("tmplController");
    if (!((a)localObject).aXI())
    {
      localObject = super.aXX();
      AppMethodBeat.o(15089);
    }
    while (true)
    {
      return localObject;
      localObject = this.jUH;
      if (localObject == null)
        j.avw("tmplWebView");
      localObject = (MMWebView)localObject;
      AppMethodBeat.o(15089);
    }
  }

  public final com.tencent.mm.plugin.webview.ui.tools.jsapi.d aXY()
  {
    AppMethodBeat.i(15096);
    Object localObject = this.jUI;
    if (localObject == null)
      j.avw("tmplController");
    if (!((a)localObject).aXJ())
    {
      localObject = super.aXY();
      j.o(localObject, "super.createJsApiHandler()");
      AppMethodBeat.o(15096);
    }
    while (true)
    {
      return localObject;
      localObject = this.jUH;
      if (localObject == null)
        j.avw("tmplWebView");
      ((b)localObject).getJsApiHandler().e(this.icy);
      localObject = this.jUH;
      if (localObject == null)
        j.avw("tmplWebView");
      ((b)localObject).getJsApiHandler().JJ(hashCode());
      localObject = this.jUH;
      if (localObject == null)
        j.avw("tmplWebView");
      ((b)localObject).getJsApiHandler().a(this.icz);
      localObject = this.icz;
      b localb = this.jUH;
      if (localb == null)
        j.avw("tmplWebView");
      ((com.tencent.mm.plugin.webview.ui.tools.k)localObject).a(localb.jVi, JsapiPermissionWrapper.vxI, GeneralControlWrapper.vxF);
      localObject = this.jUH;
      if (localObject == null)
        j.avw("tmplWebView");
      localObject = ((b)localObject).getJsApiHandler();
      j.o(localObject, "tmplWebView.jsApiHandler");
      AppMethodBeat.o(15096);
    }
  }

  public final s aXZ()
  {
    AppMethodBeat.i(15097);
    Object localObject = this.jUI;
    if (localObject == null)
      j.avw("tmplController");
    if (!((a)localObject).aXK())
    {
      localObject = super.aXZ();
      j.o(localObject, "super.createWebViewClient()");
      AppMethodBeat.o(15097);
    }
    while (true)
    {
      return localObject;
      localObject = (s)this.jUR;
      AppMethodBeat.o(15097);
    }
  }

  public final boolean aYa()
  {
    return false;
  }

  public final boolean aYb()
  {
    return false;
  }

  public final boolean aYc()
  {
    return true;
  }

  public final boolean aYd()
  {
    return true;
  }

  public final void aYe()
  {
    AppMethodBeat.i(15100);
    Object localObject = this.jUI;
    if (localObject == null)
      j.avw("tmplController");
    if (!(localObject instanceof a.a))
    {
      this.jUS = false;
      this.jUI = ((a)new a.a());
      localObject = cWL();
      j.o(localObject, "getRawUrl()");
      as((String)localObject, true);
      this.jUQ = true;
      AppMethodBeat.o(15100);
    }
    while (true)
    {
      return;
      super.aYe();
      AppMethodBeat.o(15100);
    }
  }

  public final boolean aYf()
  {
    return this.jUS;
  }

  public final WebViewUI.w as(String paramString, boolean paramBoolean)
  {
    AppMethodBeat.i(15091);
    j.p(paramString, "url");
    Object localObject = this.jUI;
    if (localObject == null)
      j.avw("tmplController");
    ((a)localObject).FX(paramString);
    localObject = this.jUI;
    if (localObject == null)
      j.avw("tmplController");
    if (((localObject instanceof TmplWebViewToolUI.b)) && (j.j(paramString, cWL())))
    {
      localObject = d.FZ(paramString);
      if ((localObject != null) && (!at.isConnected(ah.getContext())))
      {
        this.uwI.utI = true;
        H((Bundle)localObject);
        paramString = this.jUH;
        if (paramString == null)
          j.avw("tmplWebView");
        b.a(paramString, "");
        paramString = WebViewUI.w.uxS;
        AppMethodBeat.o(15091);
      }
    }
    while (true)
    {
      return paramString;
      paramString = super.as(paramString, paramBoolean);
      j.o(paramString, "super.startGetA8Key(url, force)");
      AppMethodBeat.o(15091);
    }
  }

  public final void b(String paramString1, String paramString2, Map<String, String> paramMap)
  {
    AppMethodBeat.i(15094);
    j.p(paramString1, "reqUrl");
    j.p(paramString2, "fullUrl");
    j.p(paramMap, "httpHeader");
    a locala = this.jUI;
    if (locala == null)
      j.avw("tmplController");
    locala.b(paramString1, paramString2, paramMap);
    com.tencent.mm.plugin.webview.preload.a.IU(109);
    AppMethodBeat.o(15094);
  }

  public final void c(String paramString1, String paramString2, Map<String, String> paramMap)
  {
    AppMethodBeat.i(15093);
    j.p(paramString1, "reqUrl");
    j.p(paramString2, "fullUrl");
    j.p(paramMap, "httpHeader");
    ab.v(getTAG(), "processCommonGetA8KeyFullUrl:".concat(String.valueOf(paramString1)));
    a locala = this.jUI;
    if (locala == null)
      j.avw("tmplController");
    if (locala.a(paramString1, paramString2, paramMap))
    {
      this.jUN = true;
      this.jUO = paramString2;
      this.jUP = paramMap;
      AppMethodBeat.o(15093);
    }
    while (true)
    {
      return;
      super.c(paramString1, paramString2, paramMap);
      AppMethodBeat.o(15093);
    }
  }

  public void finish()
  {
    AppMethodBeat.i(15088);
    super.finish();
    if ((aXV() != -1) && (aXV() == 1))
      daG();
    AppMethodBeat.o(15088);
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(15087);
    if ((aWY().jSV == -1) || (bo.isNullOrNil(aWY().upO)))
    {
      ab.i(getTAG(), "initTmpl() tmplParams is null");
      this.jUI = ((a)new a.a());
      com.tencent.mm.plugin.webview.preload.a.kT(109);
      com.tencent.mm.plugin.webview.preload.a.IU(101);
    }
    while (true)
    {
      a locala = this.jUI;
      if (locala == null)
        j.avw("tmplController");
      locala.aXG();
      super.onCreate(paramBundle);
      paramBundle = this.jUI;
      if (paramBundle == null)
        j.avw("tmplController");
      paramBundle.aXH();
      AppMethodBeat.o(15087);
      return;
      ab.i(getTAG(), "initTmpl() TmplController");
      this.jUI = ((a)new TmplWebViewToolUI.b(this, this));
    }
  }

  public void onDestroy()
  {
    AppMethodBeat.i(15090);
    this.jUM = true;
    super.onDestroy();
    AppMethodBeat.o(15090);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }

  @l(dWo={1, 1, 13}, dWp={""}, dWq={"<anonymous>", "", "run"})
  static final class b$d
    implements Runnable
  {
    b$d(TmplWebViewToolUI.b paramb)
    {
    }

    public final void run()
    {
      AppMethodBeat.i(15050);
      if (!TmplWebViewToolUI.a(this.jVf.jVe).jUl)
      {
        com.tencent.mm.plugin.webview.preload.a.kT(92);
        ab.e(TmplWebViewToolUI.b(this.jVf.jVe), "check notifyPage timeout");
      }
      AppMethodBeat.o(15050);
    }
  }

  @l(dWo={1, 1, 13}, dWp={""}, dWq={"com/tencent/mm/plugin/brandservice/ui/timeline/preload/ui/TmplWebViewToolUI$TmplController$supplyPageFinishInvoke$1", "Ljava/lang/Runnable;", "run", "", "plugin-brandservice_release"})
  public static final class b$j
    implements Runnable
  {
    public final void run()
    {
      AppMethodBeat.i(15058);
      int i = 0;
      try
      {
        boolean bool = TmplWebViewToolUI.h(this.jVf.jVe);
        if (bool);
        while (true)
        {
          return;
          ab.i(TmplWebViewToolUI.b(this.jVf.jVe), "[supplyPageFinishInvoke]");
          if (TmplWebViewToolUI.a(this.jVf.jVe) != null)
          {
            TmplWebViewToolUI.i(this.jVf.jVe);
            i = 1;
          }
          y localy = y.AUy;
          if (i != 0)
            TmplWebViewToolUI.a(this.jVf.jVe).getCurWebviewClient().b((WebView)TmplWebViewToolUI.a(this.jVf.jVe), TmplWebViewToolUI.a(this.jVf.jVe).getUrl());
          if (TmplWebViewToolUI.a(this.jVf.jVe).getDelayInitJsAPI())
            TmplWebViewToolUI.j(this.jVf.jVe);
          AppMethodBeat.o(15058);
        }
      }
      finally
      {
        AppMethodBeat.o(15058);
      }
    }
  }

  @l(dWo={1, 1, 13}, dWp={""}, dWq={"<anonymous>", "Lcom/tencent/mm/plugin/brandservice/ui/timeline/preload/PreloadLogic$PreloadSession;", "invoke"})
  static final class e extends a.f.b.k
    implements a.f.a.a<PreloadLogic.PreloadSession>
  {
    e(TmplWebViewToolUI paramTmplWebViewToolUI)
    {
      super();
    }
  }

  @l(dWo={1, 1, 13}, dWp={""}, dWq={"<anonymous>", "Lcom/tencent/mm/plugin/webview/preload/TmplParams;", "invoke"})
  static final class g extends a.f.b.k
    implements a.f.a.a<TmplParams>
  {
    g(TmplWebViewToolUI paramTmplWebViewToolUI)
    {
      super();
    }

    private TmplParams aYh()
    {
      AppMethodBeat.i(138517);
      Object localObject2;
      try
      {
        Object localObject1 = this.jVe.getIntent().getParcelableExtra(e.m.yge);
        if (localObject1 == null)
        {
          localObject1 = new a/v;
          ((a.v)localObject1).<init>("null cannot be cast to non-null type com.tencent.mm.plugin.webview.preload.TmplParams");
          AppMethodBeat.o(138517);
          throw ((Throwable)localObject1);
        }
      }
      catch (Exception localException)
      {
        localObject2 = TmplWebViewToolUI.b(this.jVe);
        StringBuilder localStringBuilder = new StringBuilder("tmplParam is null, ");
        Object localObject3 = this.jVe.getIntent();
        j.o(localObject3, "intent");
        ab.e((String)localObject2, com.tencent.mm.plugin.brandservice.ui.timeline.preload.d.Q((Intent)localObject3));
        com.tencent.mm.plugin.webview.preload.a.IU(150);
        localObject3 = h.pYm;
        localObject2 = this.jVe.getIntent();
        j.o(localObject2, "intent");
        ((h)localObject3).e(17260, new Object[] { Integer.valueOf(2), com.tencent.mm.plugin.brandservice.ui.timeline.preload.d.Q((Intent)localObject2) });
        this.jVe.finish();
        localObject2 = new TmplParams();
      }
      while (true)
      {
        AppMethodBeat.o(138517);
        return localObject2;
        localObject2 = (TmplParams)localObject2;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.brandservice.ui.timeline.preload.ui.TmplWebViewToolUI
 * JD-Core Version:    0.6.2
 */