package com.tencent.mm.plugin.card.ui;

import android.widget.ProgressBar;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class CardGiftReceiveUI$4$1
  implements Runnable
{
  CardGiftReceiveUI$4$1(CardGiftReceiveUI.4 param4)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(88418);
    if (CardGiftReceiveUI.f(this.kll.klk).getVisibility() != 0)
      CardGiftReceiveUI.f(this.kll.klk).setVisibility(0);
    AppMethodBeat.o(88418);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.card.ui.CardGiftReceiveUI.4.1
 * JD-Core Version:    0.6.2
 */