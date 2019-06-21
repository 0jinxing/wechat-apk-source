package com.tencent.mm.plugin.card.ui;

import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.pluginsdk.ui.tools.e;
import com.tencent.mm.sdk.platformtools.ap.a;

final class CardGiftVideoUI$10
  implements ap.a
{
  CardGiftVideoUI$10(CardGiftVideoUI paramCardGiftVideoUI)
  {
  }

  public final boolean BI()
  {
    AppMethodBeat.i(88458);
    if (CardGiftVideoUI.e(this.klx).isPlaying())
    {
      CardGiftVideoUI localCardGiftVideoUI = this.klx;
      int i = CardGiftVideoUI.e(this.klx).getCurrentPosition() / 1000;
      if ((localCardGiftVideoUI.klt != null) && (localCardGiftVideoUI.duration > 0))
      {
        int j = localCardGiftVideoUI.duration - i;
        i = j;
        if (j < 0)
          i = 0;
        localCardGiftVideoUI.klt.setText(i + "\"");
      }
    }
    AppMethodBeat.o(88458);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.card.ui.CardGiftVideoUI.10
 * JD-Core Version:    0.6.2
 */