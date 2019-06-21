package com.tencent.mm.plugin.bbom;

import android.content.Context;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.webview.ui.tools.widget.MailMMWebView;
import com.tencent.mm.plugin.webview.ui.tools.widget.g;
import com.tencent.mm.ui.widget.MMWebView;

final class PluginBigBallOfMudAsync$5
  implements g
{
  PluginBigBallOfMudAsync$5(PluginBigBallOfMudAsync paramPluginBigBallOfMudAsync)
  {
  }

  public final MMWebView du(Context paramContext)
  {
    AppMethodBeat.i(18311);
    MailMMWebView.fu(paramContext);
    paramContext = new MailMMWebView(paramContext);
    MailMMWebView.a(paramContext);
    AppMethodBeat.o(18311);
    return paramContext;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.bbom.PluginBigBallOfMudAsync.5
 * JD-Core Version:    0.6.2
 */