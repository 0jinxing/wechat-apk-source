package com.tencent.mm.plugin.webview.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ipcinvoker.l;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.widget.MMWebView;

public final class a
{
  private static String[] ulE = null;

  public static void c(MMWebView paramMMWebView)
  {
    AppMethodBeat.i(6565);
    if (paramMMWebView == null)
    {
      ab.e("MicroMsg.AutoPlayLogic", "webView null");
      AppMethodBeat.o(6565);
    }
    while (true)
    {
      return;
      String str = paramMMWebView.getUrl();
      ab.i("MicroMsg.AutoPlayLogic", "currentUrl:%s", new Object[] { str });
      if (bo.isNullOrNil(str))
      {
        AppMethodBeat.o(6565);
      }
      else
      {
        l.post(new a.1(str, paramMMWebView));
        AppMethodBeat.o(6565);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.model.a
 * JD-Core Version:    0.6.2
 */