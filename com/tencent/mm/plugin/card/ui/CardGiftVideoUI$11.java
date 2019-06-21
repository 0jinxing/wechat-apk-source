package com.tencent.mm.plugin.card.ui;

import android.view.View;
import android.widget.ImageView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class CardGiftVideoUI$11
  implements Runnable
{
  CardGiftVideoUI$11(CardGiftVideoUI paramCardGiftVideoUI)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(88459);
    ab.i("MicroMsg.CardGiftVideoUI", "%d switch video model isVideoPlay %b", new Object[] { Integer.valueOf(this.klx.hashCode()), Boolean.valueOf(this.klz) });
    if (this.klz)
    {
      ((View)CardGiftVideoUI.e(this.klx)).setVisibility(0);
      CardGiftVideoUI.f(this.klx).setVisibility(8);
      AppMethodBeat.o(88459);
    }
    while (true)
    {
      return;
      ((View)CardGiftVideoUI.e(this.klx)).setVisibility(8);
      CardGiftVideoUI.f(this.klx).setVisibility(0);
      AppMethodBeat.o(88459);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.card.ui.CardGiftVideoUI.11
 * JD-Core Version:    0.6.2
 */