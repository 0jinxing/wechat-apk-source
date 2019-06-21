package com.tencent.mm.plugin.webview;

import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.aa;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.base.p;
import com.tencent.xweb.WebView;
import org.a.a;

public final class b
{
  public p tipDialog;
  private final int uew = 0;
  private final int uex = 1;
  private final int uey = 2;

  public static int a(WebView paramWebView, boolean paramBoolean)
  {
    AppMethodBeat.i(5620);
    int i;
    if ((paramWebView == null) || (paramWebView.getX5WebViewExtension() == null))
    {
      AppMethodBeat.o(5620);
      i = 2;
    }
    while (true)
    {
      return i;
      Bundle localBundle = new Bundle();
      String str = aa.dor();
      localBundle.putString("destLanguage", str);
      if (paramBoolean)
        localBundle.putBoolean("isFastOpen", true);
      try
      {
        while (true)
        {
          paramWebView = (Bundle)a.ep(paramWebView.getX5WebViewExtension()).u("invokeMiscMethod", new Object[] { "detectTranslateWebSiteIsNeeded", localBundle }).object;
          if (paramWebView == null)
            break label164;
          i = paramWebView.getInt("errorCode", 2);
          ab.i("MicroMsg.WebViewTranslateHelper", "needTranslate errCode %d,languageCode %s", new Object[] { Integer.valueOf(i), str });
          AppMethodBeat.o(5620);
          break;
          localBundle.putBoolean("isFastOpen", false);
        }
      }
      catch (Exception paramWebView)
      {
        while (true)
        {
          ab.e("MicroMsg.WebViewTranslateHelper", "detectTranslateWebSiteIsNeeded error %s", new Object[] { paramWebView.getMessage() });
          label164: i = 2;
        }
      }
    }
  }

  public static boolean b(WebView paramWebView)
  {
    boolean bool = false;
    AppMethodBeat.i(5619);
    if (paramWebView.getX5WebViewExtension() == null)
      AppMethodBeat.o(5619);
    while (true)
    {
      return bool;
      try
      {
        paramWebView = (Bundle)a.ep(paramWebView.getX5WebViewExtension()).u("invokeMiscMethod", new Object[] { "supportTranslateWebSite", null }).object;
        if (paramWebView != null)
        {
          bool = paramWebView.getBoolean("result");
          ab.i("MicroMsg.WebViewTranslateHelper", "supportTranslate %b", new Object[] { Boolean.valueOf(bool) });
          AppMethodBeat.o(5619);
        }
      }
      catch (Exception paramWebView)
      {
        while (true)
        {
          ab.e("MicroMsg.WebViewTranslateHelper", "supportTranslateWebSite error %s", new Object[] { paramWebView.getMessage() });
          bool = false;
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.b
 * JD-Core Version:    0.6.2
 */