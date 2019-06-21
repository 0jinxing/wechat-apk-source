package com.tencent.mm.plugin.brandservice.ui.timeline.preload.ui;

import a.f.b.j;
import a.l;
import a.y;
import android.content.Context;
import android.webkit.ValueCallback;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.brandservice.ui.timeline.preload.PreloadLogic.PreloadSession;
import com.tencent.mm.plugin.webview.preload.TmplParams;
import com.tencent.mm.plugin.webview.ui.tools.jsapi.f;
import com.tencent.mm.pluginsdk.s;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mmkv.d;
import com.tencent.xweb.WebView;
import java.util.Iterator;
import java.util.LinkedList;
import org.json.JSONObject;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/brandservice/ui/timeline/preload/ui/TmplWebView;", "Lcom/tencent/mm/plugin/brandservice/ui/timeline/preload/ui/TmplWxJsWebView;", "context", "Landroid/content/Context;", "tmplParams", "Lcom/tencent/mm/plugin/webview/preload/TmplParams;", "delayInitJsAPI", "", "(Landroid/content/Context;Lcom/tencent/mm/plugin/webview/preload/TmplParams;Z)V", "TAG", "", "getTAG", "()Ljava/lang/String;", "contentId", "curUrl", "getDelayInitJsAPI", "()Z", "fullUrl", "hasAuthData", "hasUpdateData", "isCheckingInject", "isEvalFinished", "<set-?>", "isInjectDataSuccess", "setInjectDataSuccess", "(Z)V", "isNotifyPageSuccess", "setNotifyPageSuccess", "isSuccess", "onEvalFinished", "Lkotlin/Function0;", "", "onStateChangeListeners", "Ljava/util/LinkedList;", "Lkotlin/Function1;", "", "rawUrl", "receivePageData", "", "recodeInject", "session", "Lcom/tencent/mm/plugin/brandservice/ui/timeline/preload/PreloadLogic$PreloadSession;", "startLoadPage", "state", "getState", "()I", "setState", "(I)V", "addOnStateChangeListener", "onStateChange", "adjustInnerWidth", "checkInject", "clearOnStateChange", "getPageString", "getUrl", "initJsEnvironment", "loadUrlAndData", "onInjectReady", "onPageReady", "setOnEvalFinished", "T", "", "callback", "Ljava/lang/ref/WeakReference;", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)V", "transferToState", "newState", "updateAuth", "updateData", "updateKV", "kv", "Lcom/tencent/mm/plugin/brandservice/ui/timeline/preload/Kv15862;", "Companion", "OnStateChange", "plugin-brandservice_release"})
public final class b extends e
{
  public static final b.a jUr;
  private String cOG;
  private boolean cxT;
  private boolean jUb;
  private String jUc;
  private long jUd;
  private long jUe;
  private boolean jUf;
  private String jUg;
  private PreloadLogic.PreloadSession jUh;
  private String jUi;
  LinkedList<a.f.a.b<Integer, y>> jUj;
  boolean jUk;
  boolean jUl;
  boolean jUm;
  a.f.a.a<y> jUn;
  private boolean jUo;
  private boolean jUp;
  private final boolean jUq;
  private int state;

  static
  {
    AppMethodBeat.i(15028);
    jUr = new b.a((byte)0);
    AppMethodBeat.o(15028);
  }

  public b(Context paramContext, TmplParams paramTmplParams, boolean paramBoolean)
  {
    super(paramContext, paramTmplParams);
    AppMethodBeat.i(15027);
    this.jUq = paramBoolean;
    this.state = 1;
    this.jUj = new LinkedList();
    this.jUn = ((a.f.a.a)b.c.jUt);
    getPerformanceHelper().aI("onTmplLoadStart", System.currentTimeMillis());
    ab.i(getTAG(), "terry trace 1.1 createTmplWebView:delayInitJsAPI=%b", new Object[] { Boolean.valueOf(this.jUq) });
    aXM();
    if (!this.jUq)
      aXN();
    AppMethodBeat.o(15027);
  }

  private final void aXP()
  {
    AppMethodBeat.i(15021);
    if (this.jUo)
      AppMethodBeat.o(15021);
    while (true)
    {
      return;
      this.jUo = true;
      try
      {
        if (this.state != 1)
        {
          ab.w(getTAG(), "[onPageReady] state:%d alreay preload", new Object[] { Integer.valueOf(this.state) });
          AppMethodBeat.o(15021);
          continue;
        }
        y localy = y.AUy;
        com.tencent.mm.plugin.webview.preload.a.gu(this.jRb.upQ, 113);
        evaluateJavascript("javascript:JSON.stringify(window.__appmsg_skeleton_success__)", (ValueCallback)new b.b(this));
        aXQ();
        ab.i(getTAG(), "[onPageReady]");
        AppMethodBeat.o(15021);
      }
      finally
      {
        AppMethodBeat.o(15021);
      }
    }
  }

  private final void aXQ()
  {
    AppMethodBeat.i(15022);
    int i = com.tencent.mm.bz.a.gd(getContext());
    float f = com.tencent.mm.bz.a.getDensity(getContext());
    ab.i(getTAG(), "adjustInnerWidth() screenWidth:" + i + ", density:" + f);
    if ((i > 0) && (f > 0.0F))
    {
      i = (int)(i / f);
      ab.i(getTAG(), "adjustInnerWidth() innerWidth:".concat(String.valueOf(i)));
      evaluateJavascript("javascript:window.innerWidth = ".concat(String.valueOf(i)), null);
    }
    AppMethodBeat.o(15022);
  }

  private final void setInjectDataSuccess(boolean paramBoolean)
  {
    this.jUk = paramBoolean;
  }

  private final void setState(int paramInt)
  {
    this.state = paramInt;
  }

  private final void sz(int paramInt)
  {
    AppMethodBeat.i(15018);
    ab.i(getTAG(), "transferToState() state:%d, newState:%d", new Object[] { Integer.valueOf(this.state), Integer.valueOf(paramInt) });
    this.state = paramInt;
    Iterator localIterator = ((Iterable)this.jUj).iterator();
    while (localIterator.hasNext())
      ((a.f.a.b)localIterator.next()).am(Integer.valueOf(paramInt));
    AppMethodBeat.o(15018);
  }

  public final void a(boolean paramBoolean, String paramString, PreloadLogic.PreloadSession paramPreloadSession)
  {
    AppMethodBeat.i(138515);
    while (true)
    {
      try
      {
        if (this.state != 4)
        {
          ab.w(getTAG(), "[updateAuth]delay update auth, return, state:%d", new Object[] { Integer.valueOf(this.state) });
          this.jUf = true;
          this.cxT = paramBoolean;
          this.jUg = paramString;
          if (paramPreloadSession != null)
            this.jUh = paramPreloadSession;
          return;
        }
        this.jUi = paramString;
        sz(5);
        Object localObject = y.AUy;
        if (paramBoolean)
        {
          localObject = paramPreloadSession;
          if (paramPreloadSession == null)
            localObject = this.jUh;
          paramPreloadSession = paramString;
          if (paramString != null)
          {
            paramPreloadSession = paramString;
            if (localObject != null)
              paramPreloadSession = com.tencent.mm.plugin.brandservice.ui.timeline.preload.m.a(paramString, (PreloadLogic.PreloadSession)localObject);
          }
          ab.i(getTAG(), "terry trace 2.2 updateAuth");
          ab.i(getTAG(), "[updateAuth]ok fullUrl:%s", new Object[] { paramPreloadSession });
          evaluateJavascript("javascript:window.onPageAuthOK(" + new JSONObject().put("fullUrl", paramPreloadSession) + ')', (ValueCallback)new e(this));
          com.tencent.mm.plugin.webview.preload.a.gu(this.jRb.upQ, 133);
          AppMethodBeat.o(138515);
          continue;
        }
      }
      finally
      {
        AppMethodBeat.o(138515);
      }
      ab.i(getTAG(), "[updateAuth]fail");
      evaluateJavascript("javascript:window.onPageAuthFail()", (ValueCallback)new b.f(this));
      com.tencent.mm.plugin.webview.preload.a.gu(this.jRb.upQ, 134);
      AppMethodBeat.o(138515);
    }
  }

  protected final void aJq()
  {
    AppMethodBeat.i(15019);
    ab.v(getTAG(), "onPageReady");
    super.aJq();
    aXP();
    AppMethodBeat.o(15019);
  }

  public final void aXM()
  {
    AppMethodBeat.i(15015);
    ab.i(getTAG(), "terry trace 1.2 loadUrlAndData");
    ab.i(getTAG(), "[loadUrlAndData]");
    super.aXM();
    com.tencent.mm.plugin.webview.preload.a.gu(this.jRb.upQ, 112);
    AppMethodBeat.o(15015);
  }

  protected final void aXN()
  {
    AppMethodBeat.i(15016);
    ab.i(getTAG(), "terry trace 1.3 initJsEnvironment");
    ab.i(getTAG(), "[initJsEnvironment]");
    super.aXN();
    AppMethodBeat.o(15016);
  }

  protected final void aXO()
  {
    AppMethodBeat.i(15020);
    ab.v(getTAG(), "onInjectReady");
    aXP();
    AppMethodBeat.o(15020);
  }

  public final boolean b(String paramString1, String paramString2, long paramLong1, long paramLong2)
  {
    AppMethodBeat.i(15024);
    j.p(paramString1, "contentId");
    j.p(paramString2, "rawUrl");
    while (true)
    {
      try
      {
        boolean bool;
        if (this.state != 2)
        {
          localObject = getTAG();
          StringBuilder localStringBuilder = new java/lang/StringBuilder;
          localStringBuilder.<init>("[updateData]delay update data state:");
          ab.w((String)localObject, this.state + ", return");
          this.jUc = paramString1;
          this.cOG = paramString2;
          this.jUd = paramLong1;
          this.jUe = paramLong2;
          this.jUb = true;
          bool = false;
          AppMethodBeat.o(15024);
          return bool;
        }
        sz(3);
        Object localObject = y.AUy;
        final long l = System.currentTimeMillis();
        getPerformanceHelper().aI("onInjectStart", l);
        ab.i(getTAG(), "[updateData]data contentId:" + paramString1 + " startLoadPage:" + paramLong1 + " receivePageData:" + paramLong2);
        this.jUc = paramString1;
        this.cOG = paramString2;
        paramString2 = new JSONObject().put("data", "@param").put("timestamp", new JSONObject().put("startLoadPage", paramLong1).put("receivePageData", paramLong2)).put("url", paramString2).put("key", getRandomStr()).toString();
        j.o(paramString2, "JSONObject()\n//         …              .toString()");
        paramString2 = "[window.onReceivePageData(" + paramString2 + "),Date.now()].join(',')";
        int i = 0;
        if (!f.c((WebView)this))
          break label525;
        int j = com.tencent.mm.plugin.brandservice.ui.timeline.preload.b.FN(paramString1);
        localObject = c.sA(j);
        int k = com.tencent.mm.plugin.brandservice.ui.timeline.preload.b.a(paramString1, (d)localObject);
        if (k != j)
          break label525;
        if (this.jRb.version >= 4503325)
        {
          paramString1 = a.k.m.aI(paramString2, "\"@param\"", "@param");
          ab.i(getTAG(), "onReceivePageData buff parse native:".concat(String.valueOf(paramString1)));
          paramString1 = new com.tencent.mm.plugin.webview.ui.tools.jsapi.m(paramString1, ((d)localObject).AiQ, k).toString();
          j.o(paramString1, "XWebCodeCacheMeta(script…pointer, size).toString()");
          i = 1;
          if (i != 0)
            break label522;
          paramString2 = new StringBuilder("javascript:");
          localObject = getInjectAPI();
          j.o(localObject, "injectAPI");
          paramString1 = a.k.m.aI(paramString1, "\"@param\"", (String)localObject);
          evaluateJavascript(paramString1, (ValueCallback)new g(this, l));
          bool = true;
          AppMethodBeat.o(15024);
          continue;
        }
      }
      finally
      {
        AppMethodBeat.o(15024);
      }
      paramString1 = a.k.m.aI(paramString2, "\"@param\"", "JSON.stringify(@param)");
      ab.i(getTAG(), "onReceivePageData buff parse stringify:".concat(String.valueOf(paramString1)));
      continue;
      label522: continue;
      label525: paramString1 = paramString2;
    }
  }

  public final void c(a.f.a.b<? super Integer, y> paramb)
  {
    AppMethodBeat.i(15017);
    j.p(paramb, "onStateChange");
    this.jUj.add(paramb);
    AppMethodBeat.o(15017);
  }

  public final boolean getDelayInitJsAPI()
  {
    return this.jUq;
  }

  protected final String getPageString()
  {
    AppMethodBeat.i(15023);
    Object localObject = this.jUc;
    if (localObject != null)
    {
      String str = com.tencent.mm.plugin.brandservice.ui.timeline.preload.b.FM((String)localObject);
      localObject = str;
      if (str != null);
    }
    else
    {
      localObject = "";
    }
    AppMethodBeat.o(15023);
    return localObject;
  }

  public final int getState()
  {
    return this.state;
  }

  final String getTAG()
  {
    AppMethodBeat.i(15014);
    String str = "MicroMsg.Preload.WebView:" + getTmplWebViewId();
    AppMethodBeat.o(15014);
    return str;
  }

  public final String getUrl()
  {
    AppMethodBeat.i(15026);
    String str = super.getUrl();
    if ((this.state == 5) && (str != null) && (com.tencent.mm.plugin.brandservice.ui.timeline.preload.m.FC(str) == true))
    {
      str = this.jUi;
      AppMethodBeat.o(15026);
    }
    while (true)
    {
      return str;
      AppMethodBeat.o(15026);
    }
  }

  public final void setNotifyPageSuccess(boolean paramBoolean)
  {
    this.jUl = paramBoolean;
  }

  @l(dWo={1, 1, 13}, dWp={""}, dWq={"<anonymous>", "", "value", "", "kotlin.jvm.PlatformType", "onReceiveValue"})
  static final class e<T>
    implements ValueCallback<String>
  {
    e(b paramb)
    {
    }
  }

  @l(dWo={1, 1, 13}, dWp={""}, dWq={"<anonymous>", "", "value", "", "kotlin.jvm.PlatformType", "onReceiveValue"})
  static final class g<T>
    implements ValueCallback<String>
  {
    g(b paramb, long paramLong)
    {
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.brandservice.ui.timeline.preload.ui.b
 * JD-Core Version:    0.6.2
 */