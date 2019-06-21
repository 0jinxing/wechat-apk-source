package com.tencent.mm.plugin.qqmail.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.webview.ui.tools.widget.h;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.widget.MMWebView;

final class ReadMailUI$10$2
  implements Runnable
{
  ReadMailUI$10$2(ReadMailUI.10 param10)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(68431);
    int i = (int)(ReadMailUI.g(this.pAe.pzZ).getContentHeight() * ReadMailUI.g(this.pAe.pzZ).getScale());
    ab.d("MicroMsg.ReadMailUI", ReadMailUI.g(this.pAe.pzZ).getContentHeight() + "," + ReadMailUI.g(this.pAe.pzZ).getHeight() + "," + ReadMailUI.g(this.pAe.pzZ).getScale());
    if (Math.abs(i - ReadMailUI.g(this.pAe.pzZ).getHeight()) < 10)
      ((h)ReadMailUI.g(this.pAe.pzZ)).oe(true);
    AppMethodBeat.o(68431);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.qqmail.ui.ReadMailUI.10.2
 * JD-Core Version:    0.6.2
 */