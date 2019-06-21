package com.tencent.mm.plugin.card.sharecard.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class ShareCardListUI$1
  implements Runnable
{
  ShareCardListUI$1(ShareCardListUI paramShareCardListUI)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(88166);
    ShareCardListUI.a(this.khB);
    ShareCardListUI.b(this.khB);
    this.khB.khz = true;
    ab.d("MicroMsg.ShareCardListUI", "initLocation end");
    AppMethodBeat.o(88166);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.card.sharecard.ui.ShareCardListUI.1
 * JD-Core Version:    0.6.2
 */