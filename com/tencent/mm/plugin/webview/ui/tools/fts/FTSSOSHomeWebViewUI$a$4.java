package com.tencent.mm.plugin.webview.ui.tools.fts;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.List;

final class FTSSOSHomeWebViewUI$a$4
  implements Runnable
{
  FTSSOSHomeWebViewUI$a$4(FTSSOSHomeWebViewUI.a parama)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(8451);
    FTSSOSHomeWebViewUI.a.a(this.uBM).clear();
    this.uBM.notifyDataSetChanged();
    AppMethodBeat.o(8451);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.fts.FTSSOSHomeWebViewUI.a.4
 * JD-Core Version:    0.6.2
 */