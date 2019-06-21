package com.tencent.mm.plugin.card.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.ui.tools.e.b;

final class CardGiftVideoUI$9
  implements e.b
{
  CardGiftVideoUI$9(CardGiftVideoUI paramCardGiftVideoUI)
  {
  }

  public final void onAnimationEnd()
  {
    AppMethodBeat.i(88457);
    new ak().post(new CardGiftVideoUI.9.1(this));
    AppMethodBeat.o(88457);
  }

  public final void onAnimationStart()
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.card.ui.CardGiftVideoUI.9
 * JD-Core Version:    0.6.2
 */