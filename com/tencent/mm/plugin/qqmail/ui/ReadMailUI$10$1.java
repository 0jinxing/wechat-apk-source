package com.tencent.mm.plugin.qqmail.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.webview.ui.tools.widget.h;
import com.tencent.mm.ui.widget.MMWebView;
import com.tencent.xweb.p;

final class ReadMailUI$10$1
  implements Runnable
{
  ReadMailUI$10$1(ReadMailUI.10 param10)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(68430);
    ReadMailUI.g(this.pAe.pzZ).getSettings().setLoadsImagesAutomatically(true);
    ReadMailUI.g(this.pAe.pzZ).getSettings().setSupportZoom(true);
    ReadMailUI.g(this.pAe.pzZ).getSettings().setBuiltInZoomControls(true);
    ((h)ReadMailUI.g(this.pAe.pzZ)).dcS();
    ((h)ReadMailUI.g(this.pAe.pzZ)).dcT();
    AppMethodBeat.o(68430);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.qqmail.ui.ReadMailUI.10.1
 * JD-Core Version:    0.6.2
 */