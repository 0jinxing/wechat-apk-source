package com.tencent.mm.plugin.account.bind.ui;

import android.webkit.ConsoleMessage;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.pluginsdk.ui.tools.u;
import com.tencent.xweb.l;

final class BindGoogleContactUI$3 extends l
{
  BindGoogleContactUI$3(BindGoogleContactUI paramBindGoogleContactUI)
  {
  }

  public final boolean onConsoleMessage(ConsoleMessage paramConsoleMessage)
  {
    AppMethodBeat.i(13350);
    String str;
    boolean bool;
    if (paramConsoleMessage != null)
    {
      str = paramConsoleMessage.message();
      str = u.akn(str);
      if (!str.toLowerCase().startsWith("weixin://private/googlegetcode"))
        break label55;
      BindGoogleContactUI.a(this.gqC, str);
      bool = true;
      AppMethodBeat.o(13350);
    }
    while (true)
    {
      return bool;
      str = null;
      break;
      label55: bool = super.onConsoleMessage(paramConsoleMessage);
      AppMethodBeat.o(13350);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.bind.ui.BindGoogleContactUI.3
 * JD-Core Version:    0.6.2
 */