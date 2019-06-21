package com.tencent.mm.plugin.card.ui;

import android.os.MessageQueue.IdleHandler;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.card.sharecard.a.b;
import com.tencent.mm.sdk.platformtools.ab;

final class CardHomePageUI$9
  implements MessageQueue.IdleHandler
{
  CardHomePageUI$9(CardHomePageUI paramCardHomePageUI)
  {
  }

  public final boolean queueIdle()
  {
    AppMethodBeat.i(88491);
    if (CardHomePageUI.g(this.klP) != null)
    {
      CardHomePageUI.g(this.klP);
      if (b.bbA())
      {
        ab.i("MicroMsg.CardHomePageUI", "try2UpdateCardType");
        CardHomePageUI.h(this.klP);
      }
    }
    AppMethodBeat.o(88491);
    return false;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.card.ui.CardHomePageUI.9
 * JD-Core Version:    0.6.2
 */