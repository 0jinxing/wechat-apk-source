package com.tencent.mm.plugin.card.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class CardHomePageUI$4
  implements Runnable
{
  CardHomePageUI$4(CardHomePageUI paramCardHomePageUI)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(88486);
    CardHomePageUI.c(this.klP);
    CardHomePageUI.d(this.klP);
    this.klP.khz = true;
    ab.d("MicroMsg.CardHomePageUI", "initLocation end");
    AppMethodBeat.o(88486);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.card.ui.CardHomePageUI.4
 * JD-Core Version:    0.6.2
 */