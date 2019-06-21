package com.tencent.mm.plugin.appbrand.game.d;

import android.net.Uri;
import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.appcache.WxaCommLibRuntimeReader;
import com.tencent.xweb.WebView;
import com.tencent.xweb.n;
import com.tencent.xweb.o;
import com.tencent.xweb.s;
import java.util.Iterator;
import java.util.LinkedList;

final class b$2 extends s
{
  b$2(b paramb)
  {
  }

  private static o Aw(String paramString)
  {
    AppMethodBeat.i(130159);
    if ("wagame://WAGameVConsole.html".equals(paramString))
    {
      paramString = WxaCommLibRuntimeReader.xv("WAGameVConsole.html");
      AppMethodBeat.o(130159);
    }
    while (true)
    {
      return paramString;
      paramString = null;
      AppMethodBeat.o(130159);
    }
  }

  public final o a(WebView paramWebView, n paramn)
  {
    AppMethodBeat.i(130157);
    paramWebView = Aw(paramn.getUrl().toString());
    AppMethodBeat.o(130157);
    return paramWebView;
  }

  public final o a(WebView paramWebView, n paramn, Bundle paramBundle)
  {
    AppMethodBeat.i(130158);
    paramWebView = Aw(paramn.getUrl().toString());
    AppMethodBeat.o(130158);
    return paramWebView;
  }

  public final void b(WebView paramWebView, String paramString)
  {
    AppMethodBeat.i(130160);
    b.a(this.hrE);
    if ((b.b(this.hrE) != null) && (!b.b(this.hrE).isEmpty()))
    {
      paramWebView = b.b(this.hrE).iterator();
      while (paramWebView.hasNext())
      {
        paramString = (String)paramWebView.next();
        b.a(this.hrE, paramString);
      }
    }
    AppMethodBeat.o(130160);
  }

  public final o c(WebView paramWebView, String paramString)
  {
    AppMethodBeat.i(130156);
    paramWebView = Aw(paramString);
    AppMethodBeat.o(130156);
    return paramWebView;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.game.d.b.2
 * JD-Core Version:    0.6.2
 */