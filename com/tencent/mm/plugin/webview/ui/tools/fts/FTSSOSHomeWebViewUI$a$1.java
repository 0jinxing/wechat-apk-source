package com.tencent.mm.plugin.webview.ui.tools.fts;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Iterator;
import java.util.List;

final class FTSSOSHomeWebViewUI$a$1
  implements Runnable
{
  FTSSOSHomeWebViewUI$a$1(FTSSOSHomeWebViewUI.a parama, List paramList)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(8448);
    if (FTSSOSHomeWebViewUI.a.a(this.uBM).size() > 0)
    {
      Iterator localIterator = FTSSOSHomeWebViewUI.a.a(this.uBM).iterator();
      while (localIterator.hasNext())
      {
        FTSSOSHomeWebViewUI.c localc = (FTSSOSHomeWebViewUI.c)localIterator.next();
        if (!this.uBL.contains(localc))
          this.uBL.add(localc);
      }
    }
    FTSSOSHomeWebViewUI.a.a(this.uBM, this.uBL);
    this.uBM.notifyDataSetChanged();
    AppMethodBeat.o(8448);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.fts.FTSSOSHomeWebViewUI.a.1
 * JD-Core Version:    0.6.2
 */