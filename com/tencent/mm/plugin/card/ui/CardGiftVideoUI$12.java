package com.tencent.mm.plugin.card.ui;

import android.widget.ProgressBar;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.widget.MMPinProgressBtn;

final class CardGiftVideoUI$12
  implements Runnable
{
  CardGiftVideoUI$12(CardGiftVideoUI paramCardGiftVideoUI)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(88460);
    ab.d("MicroMsg.CardGiftVideoUI", "hide loading.");
    if ((CardGiftVideoUI.g(this.klx) != null) && (CardGiftVideoUI.g(this.klx).getVisibility() != 8))
      CardGiftVideoUI.g(this.klx).setVisibility(8);
    if ((CardGiftVideoUI.h(this.klx) != null) && (CardGiftVideoUI.h(this.klx).getVisibility() != 8))
      CardGiftVideoUI.h(this.klx).setVisibility(8);
    AppMethodBeat.o(88460);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.card.ui.CardGiftVideoUI.12
 * JD-Core Version:    0.6.2
 */