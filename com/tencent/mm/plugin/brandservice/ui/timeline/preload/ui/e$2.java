package com.tencent.mm.plugin.brandservice.ui.timeline.preload.ui;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.brandservice.ui.timeline.preload.k;
import com.tencent.mm.plugin.webview.preload.TmplParams;
import com.tencent.mm.plugin.webview.preload.a;
import com.tencent.mm.plugin.webview.ui.tools.jsapi.f;
import com.tencent.mm.plugin.webview.ui.tools.jsapi.m;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.xweb.WebView;
import com.tencent.xweb.n;
import com.tencent.xweb.o;
import com.tencent.xweb.s;
import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;

final class e$2 extends s
{
  e$2(e parame)
  {
  }

  private o f(WebView paramWebView, String paramString)
  {
    int i = 0;
    AppMethodBeat.i(14428);
    ab.i(e.a(this.jVo), "getResourceResponse, requrl:%s, url:%s", new Object[] { paramString, this.jVo.jVi });
    if (paramString.equals(this.jVo.jVi))
    {
      paramString = this.jVo.jVk;
      ab.v(e.a(this.jVo), "response path:" + bo.bc(paramString, "null"));
      paramWebView = g(paramWebView, paramString);
      if (paramWebView == null)
        break label241;
      ab.i(e.a(this.jVo), "return intercepted success");
      AppMethodBeat.o(14428);
    }
    while (true)
    {
      return paramWebView;
      if (paramString.startsWith(com.tencent.mm.plugin.brandservice.ui.timeline.preload.b.b.aXB()))
      {
        paramString = k.q(this.jVo.jRb.jSV, this.jVo.jRb.jSY, paramString.replaceFirst(com.tencent.mm.plugin.brandservice.ui.timeline.preload.b.b.aXB(), ""));
        i = 1;
        break;
      }
      if (paramString.startsWith(com.tencent.mm.plugin.brandservice.ui.timeline.preload.b.b.getPrefix()))
      {
        paramString = k.q(this.jVo.jRb.jSV, this.jVo.jRb.jSY, paramString.replaceFirst(com.tencent.mm.plugin.brandservice.ui.timeline.preload.b.b.getPrefix(), ""));
        i = 1;
        break;
      }
      ab.e(e.a(this.jVo), "return null");
      AppMethodBeat.o(14428);
      paramWebView = null;
      continue;
      label241: ab.e(e.a(this.jVo), "return intercepted null");
      a.e(this.jVo.jRb.upQ, 126, 1, true);
      if (i != 0)
        a.e(this.jVo.jRb.upQ, 233, 1, true);
      AppMethodBeat.o(14428);
      paramWebView = null;
    }
  }

  private o g(WebView paramWebView, String paramString)
  {
    String str1 = null;
    String str2 = null;
    AppMethodBeat.i(14429);
    Object localObject = com.tencent.mm.sdk.f.b.ako(paramString);
    if ((paramString.endsWith(".js")) && (f.c(paramWebView)))
    {
      str2 = new m(paramString).toString();
      paramWebView = new o((String)localObject, "UTF-8", new ByteArrayInputStream(str2.getBytes(StandardCharsets.UTF_8)));
    }
    while (true)
    {
      localObject = new HashMap();
      str1 = Integer.toHexString(paramString.hashCode() & 0xFFFFFFFF).toLowerCase();
      ((Map)localObject).put("Cache-Control", "max-age=31536000");
      ((Map)localObject).put("ETag", str1);
      if (str2 != null)
        ((Map)localObject).put("RunLocalJS", str2);
      paramWebView.mResponseHeaders = ((Map)localObject);
      ab.i("MicroMsg.TmplWxJsWebView", "readFileWebResp:%s\nETag:%s", new Object[] { paramString, str1 });
      AppMethodBeat.o(14429);
      while (true)
      {
        return paramWebView;
        try
        {
          paramWebView = new java/io/FileInputStream;
          paramWebView.<init>(paramString);
          if (paramWebView == null)
          {
            ab.e(e.a(this.jVo), "stream is null, err");
            AppMethodBeat.o(14429);
            paramWebView = str1;
          }
        }
        catch (FileNotFoundException paramWebView)
        {
          while (true)
          {
            ab.printErrStackTrace(e.a(this.jVo), paramWebView, "", new Object[0]);
            paramWebView = null;
          }
          paramWebView = new o((String)localObject, "UTF-8", paramWebView);
        }
      }
    }
  }

  public final o a(WebView paramWebView, n paramn)
  {
    AppMethodBeat.i(14432);
    if ((paramn == null) || (paramn.getUrl() == null) || (bo.isNullOrNil(paramn.getUrl().toString())))
    {
      ab.e(e.a(this.jVo), "shouldInterceptRequest, url is null");
      paramWebView = null;
      AppMethodBeat.o(14432);
    }
    while (true)
    {
      return paramWebView;
      ab.v(e.a(this.jVo), "shouldInterceptRequest, url = %s, method = %s, isForMainFrame = %b", new Object[] { paramn.getUrl(), paramn.getMethod(), Boolean.valueOf(paramn.isForMainFrame()) });
      paramWebView = f(paramWebView, paramn.getUrl().toString());
      AppMethodBeat.o(14432);
    }
  }

  public final o a(WebView paramWebView, n paramn, Bundle paramBundle)
  {
    AppMethodBeat.i(14431);
    if ((paramn == null) || (paramn.getUrl() == null) || (bo.isNullOrNil(paramn.getUrl().toString())))
    {
      ab.e(e.a(this.jVo), "shouldInterceptRequest, webResourceRequest is null");
      paramWebView = null;
      AppMethodBeat.o(14431);
    }
    while (true)
    {
      return paramWebView;
      ab.v(e.a(this.jVo), "shouldInterceptRequest, url = %s, method = %s, isForMainFrame = %b", new Object[] { paramn.getUrl(), paramn.getMethod(), Boolean.valueOf(paramn.isForMainFrame()) });
      paramn = paramn.getUrl().toString();
      ab.v(e.a(this.jVo), "shouldInterceptRequest, url = %s", new Object[] { paramn });
      paramWebView = f(paramWebView, paramn);
      AppMethodBeat.o(14431);
    }
  }

  public final void b(WebView paramWebView, String paramString)
  {
    AppMethodBeat.i(14427);
    ab.i(e.a(this.jVo), "[onPageFinished] url:%s", new Object[] { paramString });
    super.b(paramWebView, paramString);
    e.b(this.jVo);
    e.a(this.jVo, true);
    this.jVo.aJq();
    AppMethodBeat.o(14427);
  }

  public final void b(WebView paramWebView, String paramString, Bitmap paramBitmap)
  {
    AppMethodBeat.i(14426);
    ab.i(e.a(this.jVo), "[onPageStarted] url:%s", new Object[] { paramString });
    super.b(paramWebView, paramString, paramBitmap);
    e.a(this.jVo, false);
    AppMethodBeat.o(14426);
  }

  public final o c(WebView paramWebView, String paramString)
  {
    AppMethodBeat.i(14430);
    if (bo.isNullOrNil(paramString))
    {
      ab.i(e.a(this.jVo), "shouldInterceptRequest, url is null");
      paramWebView = null;
      AppMethodBeat.o(14430);
    }
    while (true)
    {
      return paramWebView;
      ab.v(e.a(this.jVo), "shouldInterceptRequest, url = %s", new Object[] { paramString });
      paramWebView = f(paramWebView, paramString);
      AppMethodBeat.o(14430);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.brandservice.ui.timeline.preload.ui.e.2
 * JD-Core Version:    0.6.2
 */