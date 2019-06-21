package com.tencent.xweb.xwalk;

import android.net.Uri;
import android.net.http.SslError;
import android.webkit.ValueCallback;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.xweb.WebView;
import com.tencent.xweb.a.a;
import com.tencent.xweb.l;
import com.tencent.xweb.o;
import com.tencent.xweb.s;
import com.tencent.xweb.util.f;
import java.util.Map;
import org.xwalk.core.ClientCertRequest;
import org.xwalk.core.Log;
import org.xwalk.core.XWalkHttpAuthHandler;
import org.xwalk.core.XWalkView;
import org.xwalk.core.XWalkWebResourceRequest;
import org.xwalk.core.XWalkWebResourceResponse;

final class j$2 extends m
{
  int ASt = 0;

  j$2(j paramj, XWalkView paramXWalkView)
  {
    super(paramXWalkView);
  }

  public final void doUpdateVisitedHistory(XWalkView paramXWalkView, String paramString, boolean paramBoolean)
  {
    AppMethodBeat.i(85288);
    if ((paramString != null) && (paramString.startsWith("data:text/html;charset=utf-8")))
      AppMethodBeat.o(85288);
    while (true)
    {
      return;
      this.ASs.iuo.a(this.ASs.APS, paramString, paramBoolean);
      AppMethodBeat.o(85288);
    }
  }

  public final void onDocumentLoadedInFrame(XWalkView paramXWalkView, long paramLong)
  {
    AppMethodBeat.i(85284);
    super.onDocumentLoadedInFrame(paramXWalkView, paramLong);
    AppMethodBeat.o(85284);
  }

  public final void onLoadFinished(XWalkView paramXWalkView, String paramString)
  {
    AppMethodBeat.i(85285);
    super.onLoadFinished(paramXWalkView, paramString);
    AppMethodBeat.o(85285);
  }

  public final void onLoadStarted(XWalkView paramXWalkView, String paramString)
  {
    AppMethodBeat.i(85279);
    this.ASs.iuo.h(this.ASs.APS, paramString);
    AppMethodBeat.o(85279);
  }

  public final void onProgressChanged(XWalkView paramXWalkView, int paramInt)
  {
    AppMethodBeat.i(85283);
    if ((Math.abs(paramInt - this.ASt) > 5) || (paramInt == 100))
    {
      this.ASt = paramInt;
      Log.i("XWWebView", "onProgressChanged, progress = ".concat(String.valueOf(paramInt)));
    }
    this.ASs.iup.a(this.ASs.APS, paramInt);
    AppMethodBeat.o(85283);
  }

  public final void onReceivedClientCertRequest(XWalkView paramXWalkView, ClientCertRequest paramClientCertRequest)
  {
    AppMethodBeat.i(85286);
    super.onReceivedClientCertRequest(paramXWalkView, paramClientCertRequest);
    AppMethodBeat.o(85286);
  }

  public final void onReceivedHttpAuthRequest(XWalkView paramXWalkView, XWalkHttpAuthHandler paramXWalkHttpAuthHandler, String paramString1, String paramString2)
  {
    AppMethodBeat.i(85289);
    super.onReceivedHttpAuthRequest(paramXWalkView, paramXWalkHttpAuthHandler, paramString1, paramString2);
    AppMethodBeat.o(85289);
  }

  public final void onReceivedLoadError(XWalkView paramXWalkView, int paramInt, String paramString1, String paramString2)
  {
    AppMethodBeat.i(85281);
    Log.i("XWWebView", "onReceivedError ".concat(String.valueOf(paramString2)));
    super.onReceivedLoadError(paramXWalkView, paramInt, paramString1, paramString2);
    this.ASs.ASl = true;
    this.ASs.iuo.a(this.ASs.APS, paramInt, paramString1, paramString2);
    paramXWalkView = new StringBuilder(2000);
    paramXWalkView.append("<html>\n");
    paramXWalkView.append("<head>\n");
    paramXWalkView.append("<script type=\"text/javascript\">\n");
    paramXWalkView.append("function jumurl(){\n");
    paramXWalkView.append("　　window.location.href = '");
    paramXWalkView.append(paramString2);
    paramXWalkView.append("';\n");
    paramXWalkView.append("}\n");
    paramXWalkView.append("</script>\n");
    paramXWalkView.append("<title>无法打开页面</title>\n");
    paramXWalkView.append("<script >\n");
    paramXWalkView.append("var html = document.documentElement,");
    paramXWalkView.append("resizeEvt = 'orientationchange' in window ? 'orientationchange' : 'resize';");
    paramXWalkView.append("function setHtmlFontSize() {");
    paramXWalkView.append("var cliWidth = html.clientWidth;");
    paramXWalkView.append("html.style.fontSize = 100 * (cliWidth / 720) + 'px';}");
    paramXWalkView.append("window.addEventListener(resizeEvt, setHtmlFontSize, false);");
    paramXWalkView.append("</script>\n");
    paramXWalkView.append("<style>.exp{ text-align:center; margin-top:15rem; height=\"10rem\" width=\"10rem\"}</style>\n");
    paramXWalkView.append("<style>.fcolorfortitle{ color: rgba(0, 0, 0, 0.3); font-size:44px;}</style>\n");
    paramXWalkView.append("<style>.fcolorforsubtitle{ color: rgba(0, 0, 0, 0.3); font-size:34px;}</style>\n");
    paramXWalkView.append("</head>\n");
    paramXWalkView.append("<body bgcolor=\"#F2F2F2\" onclick=\"jumurl()\"'\">\n");
    paramXWalkView.append("<br></br>");
    paramXWalkView.append("<p></p>");
    paramXWalkView.append("<div class=\"exp\" ><img src=\"html/img/webview_404_refresh_icon.svg\" text-align:center /><div>");
    paramXWalkView.append("<br></br>");
    paramXWalkView.append("<font size=\"44px\" class=\"fcolorfortitle\">无法打开页面</font>");
    paramXWalkView.append("<br></br>");
    paramXWalkView.append("<font size=\"44px\" class=\"fcolorforsubtitle\">轻触屏幕重新加载</font>");
    paramXWalkView.append("</body>\n");
    paramXWalkView.append("</html>");
    paramXWalkView = paramXWalkView.toString();
    this.ASs.ARZ.loadDataWithBaseURL("file:///android_asset/", paramXWalkView, "text/html", "utf-8", null);
    com.tencent.xweb.c.j.dUB().dUC();
    f.b(paramString2, paramInt, System.currentTimeMillis() - this.ASs.APY, j.b(this.ASs));
    AppMethodBeat.o(85281);
  }

  public final void onReceivedResponseHeaders(XWalkView paramXWalkView, XWalkWebResourceRequest paramXWalkWebResourceRequest, XWalkWebResourceResponse paramXWalkWebResourceResponse)
  {
    AppMethodBeat.i(85287);
    if (paramXWalkWebResourceResponse.getStatusCode() == 302)
    {
      localObject1 = (String)paramXWalkWebResourceResponse.getResponseHeaders().get("location");
      if (localObject1 != null)
      {
        localObject2 = localObject1;
        if (!((String)localObject1).isEmpty());
      }
      else
      {
        localObject2 = (String)paramXWalkWebResourceResponse.getResponseHeaders().get("Location");
      }
      if ((localObject2 != null) && (((String)localObject2).trim().startsWith("weixin://")))
      {
        this.ASs.iuo.b(this.ASs.APS, (String)localObject2, null);
        this.ASs.ARZ.postDelayed(new j.2.1(this, (String)localObject2), 300L);
      }
    }
    while (paramXWalkWebResourceResponse.getStatusCode() < 400)
    {
      super.onReceivedResponseHeaders(paramXWalkView, paramXWalkWebResourceRequest, paramXWalkWebResourceResponse);
      AppMethodBeat.o(85287);
      return;
    }
    Log.i("XWWebView", "onReceivedHttpError code:" + paramXWalkWebResourceResponse.getStatusCode());
    Object localObject1 = this.ASs.iuo;
    WebView localWebView = this.ASs.APS;
    f.h localh = new f.h(paramXWalkWebResourceRequest);
    if (paramXWalkWebResourceResponse == null)
    {
      localObject2 = null;
      label212: ((s)localObject1).a(localWebView, localh, (o)localObject2);
      if (paramXWalkWebResourceRequest.getUrl() == null)
        break label308;
    }
    label308: for (Object localObject2 = paramXWalkWebResourceRequest.getUrl().toString(); ; localObject2 = "")
    {
      this.ASs.iuo.a(this.ASs.APS, paramXWalkWebResourceResponse.getStatusCode(), "", (String)localObject2);
      break;
      localObject2 = new o(paramXWalkWebResourceResponse.getMimeType(), paramXWalkWebResourceResponse.getEncoding(), paramXWalkWebResourceResponse.getStatusCode(), paramXWalkWebResourceResponse.getReasonPhrase(), paramXWalkWebResourceResponse.getResponseHeaders(), paramXWalkWebResourceResponse.getData());
      break label212;
    }
  }

  public final void onReceivedSslError(XWalkView paramXWalkView, ValueCallback<Boolean> paramValueCallback, SslError paramSslError)
  {
    AppMethodBeat.i(85282);
    Log.i("XWWebView", "onReceivedSslError " + paramSslError.getPrimaryError());
    this.ASs.iuo.a(this.ASs.APS, new f.g(paramValueCallback), paramSslError);
    AppMethodBeat.o(85282);
  }

  public final XWalkWebResourceResponse shouldInterceptLoadRequest(XWalkView paramXWalkView, XWalkWebResourceRequest paramXWalkWebResourceRequest)
  {
    Object localObject1 = null;
    AppMethodBeat.i(85280);
    f.h localh = new f.h(paramXWalkWebResourceRequest);
    if (localh.APN == null)
    {
      paramXWalkView = null;
      if (paramXWalkView == null)
        break label188;
    }
    label188: for (paramXWalkView = this.ASs.iuo.a(this.ASs.APS, localh, paramXWalkView); ; paramXWalkView = null)
    {
      Object localObject2 = paramXWalkView;
      if (paramXWalkView == null)
        localObject2 = this.ASs.iuo.a(this.ASs.APS, localh);
      if (localObject2 == null)
        localObject2 = this.ASs.iuo.c(this.ASs.APS, paramXWalkWebResourceRequest.getUrl().toString());
      while (true)
      {
        if (localObject2 != null)
        {
          paramXWalkView = createXWalkWebResourceResponse(((o)localObject2).mMimeType, ((o)localObject2).mEncoding, ((o)localObject2).mInputStream, ((o)localObject2).mStatusCode, ((o)localObject2).mReasonPhrase, ((o)localObject2).mResponseHeaders);
          AppMethodBeat.o(85280);
        }
        while (true)
        {
          return paramXWalkView;
          paramXWalkView = localh.APN.getBundle();
          break;
          AppMethodBeat.o(85280);
          paramXWalkView = localObject1;
        }
      }
    }
  }

  public final boolean shouldOverrideUrlLoading(XWalkView paramXWalkView, String paramString)
  {
    AppMethodBeat.i(85278);
    boolean bool = this.ASs.iuo.a(this.ASs.APS, paramString);
    Log.i("XWWebView", "shouldOverrideUrlLoading ret =  " + bool + " url = " + paramString);
    AppMethodBeat.o(85278);
    return bool;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.xweb.xwalk.j.2
 * JD-Core Version:    0.6.2
 */