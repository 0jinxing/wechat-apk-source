package com.tencent.mm.plugin.webview.ui.tools.fts;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.List;

final class FTSSOSHomeWebViewUI$a$2
  implements Runnable
{
  FTSSOSHomeWebViewUI$a$2(FTSSOSHomeWebViewUI.a parama, FTSSOSHomeWebViewUI.c paramc)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(8449);
    FTSSOSHomeWebViewUI.a.a(this.uBM).remove(this.uBN);
    this.uBM.notifyDataSetChanged();
    AppMethodBeat.o(8449);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.fts.FTSSOSHomeWebViewUI.a.2
 * JD-Core Version:    0.6.2
 */