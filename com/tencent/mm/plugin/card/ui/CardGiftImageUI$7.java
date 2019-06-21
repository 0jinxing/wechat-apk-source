package com.tencent.mm.plugin.card.ui;

import android.widget.ProgressBar;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class CardGiftImageUI$7
  implements Runnable
{
  CardGiftImageUI$7(CardGiftImageUI paramCardGiftImageUI)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(88400);
    if (CardGiftImageUI.f(this.kkv).getVisibility() != 0)
      CardGiftImageUI.f(this.kkv).setVisibility(0);
    AppMethodBeat.o(88400);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.card.ui.CardGiftImageUI.7
 * JD-Core Version:    0.6.2
 */