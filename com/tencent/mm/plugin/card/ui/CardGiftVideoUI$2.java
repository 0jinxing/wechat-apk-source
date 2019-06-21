package com.tencent.mm.plugin.card.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.widget.MMPinProgressBtn;

final class CardGiftVideoUI$2
  implements Runnable
{
  CardGiftVideoUI$2(CardGiftVideoUI paramCardGiftVideoUI, int paramInt)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(88449);
    if (CardGiftVideoUI.h(this.klx) != null)
      if (this.fFn == 0)
      {
        CardGiftVideoUI.h(this.klx).setVisibility(8);
        AppMethodBeat.o(88449);
      }
    while (true)
    {
      return;
      if (CardGiftVideoUI.h(this.klx).getVisibility() != 0)
        CardGiftVideoUI.h(this.klx).setVisibility(0);
      ab.i("MicroMsg.CardGiftVideoUI", "update progress %d %d", new Object[] { Integer.valueOf(this.fzv), Integer.valueOf(this.fFn) });
      if ((CardGiftVideoUI.h(this.klx).getMax() != this.fFn) && (this.fFn > 0))
        CardGiftVideoUI.h(this.klx).setMax(this.fFn);
      CardGiftVideoUI.h(this.klx).setProgress(this.fzv);
      AppMethodBeat.o(88449);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.card.ui.CardGiftVideoUI.2
 * JD-Core Version:    0.6.2
 */