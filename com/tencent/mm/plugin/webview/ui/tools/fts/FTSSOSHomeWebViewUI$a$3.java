package com.tencent.mm.plugin.webview.ui.tools.fts;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Iterator;
import java.util.List;

final class FTSSOSHomeWebViewUI$a$3
  implements Runnable
{
  FTSSOSHomeWebViewUI$a$3(FTSSOSHomeWebViewUI.a parama, List paramList)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(8450);
    Iterator localIterator = this.uBL.iterator();
    while (localIterator.hasNext())
    {
      FTSSOSHomeWebViewUI.c localc = (FTSSOSHomeWebViewUI.c)localIterator.next();
      if (!FTSSOSHomeWebViewUI.a.a(this.uBM).contains(localc))
        FTSSOSHomeWebViewUI.a.a(this.uBM).add(localc);
    }
    this.uBM.notifyDataSetChanged();
    AppMethodBeat.o(8450);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.fts.FTSSOSHomeWebViewUI.a.3
 * JD-Core Version:    0.6.2
 */