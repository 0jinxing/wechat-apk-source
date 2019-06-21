package com.tencent.mm.plugin.brandservice.ui.timeline.video;

import a.f.a.b;
import a.f.b.j;
import a.f.b.u.a;
import a.l;
import a.y;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.DisplayMetrics;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.aa.i;
import com.tencent.mm.plugin.webview.ui.tools.WebViewUI;
import com.tencent.mm.plugin.webview.ui.tools.jsapi.i.a;
import com.tencent.mm.plugin.webview.ui.tools.widget.MMWebViewWithJsApi;
import com.tencent.mm.plugin.webview.ui.tools.widget.k;
import com.tencent.mm.plugin.webview.ui.tools.widget.m;
import com.tencent.mm.protocal.c;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.f;
import com.tencent.mm.ui.widget.MMWebView;
import com.tencent.xweb.WebView.d;
import com.tencent.xweb.s;
import java.util.HashMap;
import java.util.Map;
import org.xwalk.core.XWalkEnvironment;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/brandservice/ui/timeline/video/AdWebViewManager;", "", "()V", "TAG", "", "initAdWebView", "Lcom/tencent/mm/plugin/webview/ui/tools/widget/MMWebViewWithJsApi;", "webView", "publishId", "setDensity", "Lkotlin/Function1;", "", "", "resize", "", "getA8KeyScene", "sendScrollEvent", "scrollViewHeight", "subViewOffsetTop", "plugin-brandservice_release"})
public final class a
{
  public static final a jVq;

  static
  {
    AppMethodBeat.i(15118);
    jVq = new a();
    AppMethodBeat.o(15118);
  }

  public static MMWebViewWithJsApi a(final MMWebViewWithJsApi paramMMWebViewWithJsApi, final String paramString, b<? super Float, y> paramb, final b<? super Integer, y> paramb1, final int paramInt)
  {
    AppMethodBeat.i(15117);
    j.p(paramMMWebViewWithJsApi, "webView");
    j.p(paramString, "publishId");
    j.p(paramb, "setDensity");
    j.p(paramb1, "resize");
    final u.a locala = new u.a();
    locala.AVC = com.tencent.mm.ca.a.dmO();
    if ((paramMMWebViewWithJsApi.getWebCoreType() == WebView.d.ANb) && (XWalkEnvironment.getUsingCustomContext()))
    {
      Resources localResources = paramMMWebViewWithJsApi.getResources();
      j.o(localResources, "webView.resources");
      locala.AVC = localResources.getDisplayMetrics().density;
    }
    paramb.am(Float.valueOf(locala.AVC));
    paramMMWebViewWithJsApi.setBackgroundColor(0);
    paramMMWebViewWithJsApi.setWebViewClient((s)new a(new c(paramMMWebViewWithJsApi, paramString, paramb1, locala), paramInt, paramMMWebViewWithJsApi, (MMWebView)paramMMWebViewWithJsApi));
    paramMMWebViewWithJsApi.addJavascriptInterface(new b(paramMMWebViewWithJsApi, locala), "__mp_ad_webview");
    ab.i("MicroMsg.AdWebViewManager", "init:".concat(String.valueOf(paramString)));
    AppMethodBeat.o(15117);
    return paramMMWebViewWithJsApi;
  }

  public static void a(MMWebViewWithJsApi paramMMWebViewWithJsApi, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(15116);
    j.p(paramMMWebViewWithJsApi, "webView");
    try
    {
      if (paramMMWebViewWithJsApi.getJsapi() != null)
      {
        Object localObject1 = new java/util/HashMap;
        ((HashMap)localObject1).<init>();
        ((Map)localObject1).put("scrollViewHeight", Integer.valueOf(paramInt1));
        ((Map)localObject1).put("subViewOffsetTop", Integer.valueOf(paramInt2));
        localObject1 = (Map)localObject1;
        Object localObject2 = paramMMWebViewWithJsApi.getJsapi();
        j.o(localObject2, "webView.jsapi");
        localObject1 = i.a.b("onScrollViewDidScroll", (Map)localObject1, true, ((com.tencent.mm.plugin.webview.ui.tools.jsapi.d)localObject2).dci());
        localObject2 = new java/lang/StringBuilder;
        ((StringBuilder)localObject2).<init>("javascript:WeixinJSBridge._handleMessageFromWeixin(");
        paramMMWebViewWithJsApi.evaluateJavascript((String)localObject1 + ')', null);
        AppMethodBeat.o(15116);
        return;
      }
    }
    catch (Exception paramMMWebViewWithJsApi)
    {
      while (true)
      {
        ab.e("MicroMsg.AdWebViewManager", "onScrollViewDidScroll fail, ex = %s", new Object[] { paramMMWebViewWithJsApi.getMessage() });
        AppMethodBeat.o(15116);
      }
    }
  }

  @l(dWo={1, 1, 13}, dWp={""}, dWq={"com/tencent/mm/plugin/brandservice/ui/timeline/video/AdWebViewManager$initAdWebView$1", "Lcom/tencent/mm/plugin/webview/ui/tools/widget/MMWebViewClient;", "getA8KeyScene", "", "getWebViewStubCallback", "Lcom/tencent/mm/plugin/webview/ui/tools/widget/MMWebViewStubCallback;", "plugin-brandservice_release"})
  public static final class a extends k
  {
    a(a.c paramc, int paramInt, MMWebViewWithJsApi paramMMWebViewWithJsApi, MMWebView paramMMWebView)
    {
      super();
    }

    public final m aGt()
    {
      return (m)this.jVr;
    }

    public final int aGu()
    {
      return paramInt;
    }
  }

  @l(dWo={1, 1, 13}, dWp={""}, dWq={"com/tencent/mm/plugin/brandservice/ui/timeline/video/AdWebViewManager$initAdWebView$2", "", "adWidth", "", "getAdWidth", "()I", "plugin-brandservice_release"})
  public static final class b
  {
    b(MMWebViewWithJsApi paramMMWebViewWithJsApi, u.a parama)
    {
    }

    @android.webkit.JavascriptInterface
    @org.xwalk.core.JavascriptInterface
    public final int getAdWidth()
    {
      AppMethodBeat.i(15112);
      int i = (int)(this.jVt.getMeasuredWidth() / locala.AVC);
      AppMethodBeat.o(15112);
      return i;
    }
  }

  @l(dWo={1, 1, 13}, dWp={""}, dWq={"com/tencent/mm/plugin/brandservice/ui/timeline/video/AdWebViewManager$initAdWebView$callback$1", "Lcom/tencent/mm/plugin/webview/ui/tools/widget/MMWebViewStubCallback;", "callback", "", "actionCode", "", "data", "Landroid/os/Bundle;", "handleMsg", "func", "", "param", "invokeAsResult", "plugin-brandservice_release"})
  public static final class c extends m
  {
    c(MMWebViewWithJsApi paramMMWebViewWithJsApi, String paramString, b paramb, u.a parama)
    {
    }

    public final boolean c(int paramInt, Bundle paramBundle)
    {
      AppMethodBeat.i(15113);
      j.p(paramBundle, "data");
      ab.i("MicroMsg.AdWebViewManager", "callback:".concat(String.valueOf(paramInt)));
      boolean bool = super.c(paramInt, paramBundle);
      AppMethodBeat.o(15113);
      return bool;
    }

    public final Bundle dj(String paramString1, String paramString2)
    {
      AppMethodBeat.i(15115);
      if (paramString1 == null)
      {
        paramString1 = super.dj(paramString1, paramString2);
        j.o(paramString1, "super.handleMsg(func, param)");
        AppMethodBeat.o(15115);
      }
      while (true)
      {
        return paramString1;
        switch (paramString1.hashCode())
        {
        default:
          break;
        case -1083168262:
          if (!paramString1.equals("configMpAdAttrs"))
            break;
          ab.i("MicroMsg.AdWebViewManager", "configMpAdAttrs:".concat(String.valueOf(paramString2)));
          int i = new i(paramString2).getInt("viewHeight");
          if (f.DEBUG);
          for (paramString1 = ",param:".concat(String.valueOf(paramString2)); ; paramString1 = "")
          {
            if (i <= 0)
              break label173;
            paramb1.am(Integer.valueOf((int)(i * locala.AVC + 0.5F)));
            paramString1 = c.akC("configMpAdAttrs:ok".concat(String.valueOf(paramString1)));
            j.o(paramString1, "ConstantsJSAPIFunc.creat…gMpAdAttrs:ok$debugInfo\")");
            AppMethodBeat.o(15115);
            break;
          }
          label173: paramString1 = c.akC("configMpAdAttrs:err height".concat(String.valueOf(paramString1)));
          j.o(paramString1, "ConstantsJSAPIFunc.creat…rs:err height$debugInfo\")");
          AppMethodBeat.o(15115);
        }
      }
    }

    public final Bundle g(int paramInt, Bundle paramBundle)
    {
      AppMethodBeat.i(15114);
      ab.i("MicroMsg.AdWebViewManager", "invokeAsResult:".concat(String.valueOf(paramInt)));
      switch (paramInt)
      {
      default:
      case 101:
      }
      while (true)
      {
        AppMethodBeat.o(15114);
        return null;
        if (paramBundle == null)
          j.dWJ();
        paramBundle.setClassLoader(WebViewUI.class.getClassLoader());
        Context localContext = this.jVt.getContext();
        String str1 = paramBundle.getString("open_ui_with_webview_ui_plugin_name");
        String str2 = paramBundle.getString("open_ui_with_webview_ui_plugin_entry");
        Intent localIntent = new Intent();
        paramBundle = paramBundle.getBundle("open_ui_with_webview_ui_extras");
        if (paramBundle == null)
          j.dWJ();
        com.tencent.mm.bp.d.b(localContext, str1, str2, localIntent.putExtras(paramBundle).putExtra("KPublisherId", paramString));
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.brandservice.ui.timeline.video.a
 * JD-Core Version:    0.6.2
 */