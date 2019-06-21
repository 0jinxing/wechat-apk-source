package com.tencent.mm.plugin.qqmail.ui;

import android.webkit.ConsoleMessage;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.pluginsdk.ui.tools.u;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.xweb.l;

final class MailWebViewUI$4 extends l
{
  MailWebViewUI$4(MailWebViewUI paramMailWebViewUI)
  {
  }

  public final boolean onConsoleMessage(ConsoleMessage paramConsoleMessage)
  {
    AppMethodBeat.i(68398);
    String str;
    boolean bool;
    if (paramConsoleMessage != null)
    {
      str = paramConsoleMessage.message();
      str = u.akn(str);
      if (!str.startsWith("weixin://private/getcontentwidth/"))
        break label64;
      ab.d("MicroMsg.QQMail.WebViewUI", "onConsoleMessage, url is getContentWidth scheme, url = ".concat(String.valueOf(str)));
      MailWebViewUI.b(this.pzh, str);
      bool = true;
      AppMethodBeat.o(68398);
    }
    while (true)
    {
      return bool;
      str = null;
      break;
      label64: bool = super.onConsoleMessage(paramConsoleMessage);
      AppMethodBeat.o(68398);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.qqmail.ui.MailWebViewUI.4
 * JD-Core Version:    0.6.2
 */