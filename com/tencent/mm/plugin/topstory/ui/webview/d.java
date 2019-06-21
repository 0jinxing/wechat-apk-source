package com.tencent.mm.plugin.topstory.ui.webview;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.protocal.protobuf.chn;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.xweb.WebView;
import com.tencent.xweb.n;
import com.tencent.xweb.o;
import com.tencent.xweb.s;
import java.io.ByteArrayInputStream;

public final class d extends s
{
  private chn cPu;
  private c sHF;

  public d(chn paramchn, c paramc)
  {
    this.cPu = paramchn;
    this.sHF = paramc;
  }

  private o abL(String paramString)
  {
    o localo = null;
    AppMethodBeat.i(2174);
    byte[] arrayOfByte;
    boolean bool;
    if (paramString.startsWith("file:///data/data/com.tencent.mm/files/public/fts_browse/res/app.html"))
    {
      arrayOfByte = this.sHF.sHw;
      this.sHF.sHw = null;
      if (arrayOfByte == null)
        break label206;
      localo = new o("text/html", "utf8", new ByteArrayInputStream(arrayOfByte));
      bool = true;
    }
    while (true)
    {
      if (bool)
        ab.i("MicroMsg.TopStory.TopStoryWebViewClient", "tryToGetResourceFromCache useMemoryCache: %b url: %s", new Object[] { Boolean.valueOf(bool), paramString });
      AppMethodBeat.o(2174);
      return localo;
      if (paramString.startsWith("file:///data/data/com.tencent.mm/files/public/fts_browse/res/dist/style.css"))
      {
        arrayOfByte = this.sHF.sHy;
        this.sHF.sHy = null;
        if (arrayOfByte != null)
        {
          localo = new o("text/css", "utf8", new ByteArrayInputStream(arrayOfByte));
          bool = true;
        }
      }
      else if (paramString.startsWith("file:///data/data/com.tencent.mm/files/public/fts_browse/res/dist/build.js"))
      {
        arrayOfByte = this.sHF.sHx;
        this.sHF.sHx = null;
        if (arrayOfByte != null)
        {
          localo = new o("application/x-javascript", "utf8", new ByteArrayInputStream(arrayOfByte));
          bool = true;
        }
      }
      else
      {
        label206: bool = false;
      }
    }
  }

  public final o a(WebView paramWebView, n paramn)
  {
    AppMethodBeat.i(2172);
    o localo1 = abL(paramn.getUrl().toString());
    o localo2 = localo1;
    if (localo1 == null)
      localo2 = super.a(paramWebView, paramn);
    AppMethodBeat.o(2172);
    return localo2;
  }

  public final o a(WebView paramWebView, n paramn, Bundle paramBundle)
  {
    AppMethodBeat.i(2173);
    o localo1 = abL(paramn.getUrl().toString());
    o localo2 = localo1;
    if (localo1 == null)
      localo2 = super.a(paramWebView, paramn, paramBundle);
    AppMethodBeat.o(2173);
    return localo2;
  }

  public final boolean a(WebView paramWebView, String paramString)
  {
    AppMethodBeat.i(2170);
    ab.i("MicroMsg.TopStory.TopStoryWebViewClient", "shouldOverrideUrlLoading %s", new Object[] { paramString });
    boolean bool = super.a(paramWebView, paramString);
    AppMethodBeat.o(2170);
    return bool;
  }

  public final void b(WebView paramWebView, String paramString)
  {
    AppMethodBeat.i(2169);
    ab.i("MicroMsg.TopStory.TopStoryWebViewClient", "onPageFinished %s  %d", new Object[] { paramString, Long.valueOf(Thread.currentThread().getId()) });
    super.b(paramWebView, paramString);
    com.tencent.mm.plugin.topstory.ui.c.c(this.cPu, "pageFinish", System.currentTimeMillis());
    AppMethodBeat.o(2169);
  }

  public final void b(WebView paramWebView, String paramString, Bitmap paramBitmap)
  {
    AppMethodBeat.i(2168);
    com.tencent.mm.plugin.topstory.ui.c.c(this.cPu, "pageStart", System.currentTimeMillis());
    ab.i("MicroMsg.TopStory.TopStoryWebViewClient", "onPageStarted %s %d", new Object[] { paramString, Long.valueOf(Thread.currentThread().getId()) });
    super.b(paramWebView, paramString, paramBitmap);
    AppMethodBeat.o(2168);
  }

  public final o c(WebView paramWebView, String paramString)
  {
    AppMethodBeat.i(2171);
    o localo1 = abL(paramString);
    o localo2 = localo1;
    if (localo1 == null)
      localo2 = super.c(paramWebView, paramString);
    AppMethodBeat.o(2171);
    return localo2;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.topstory.ui.webview.d
 * JD-Core Version:    0.6.2
 */