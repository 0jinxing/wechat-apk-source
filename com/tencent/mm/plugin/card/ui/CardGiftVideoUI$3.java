package com.tencent.mm.plugin.card.ui;

import android.widget.ImageView;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class CardGiftVideoUI$3
  implements Runnable
{
  CardGiftVideoUI$3(CardGiftVideoUI paramCardGiftVideoUI, String paramString)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(88450);
    CardGiftVideoUI.f(this.klx).setVisibility(8);
    CardGiftVideoUI.a(this.klx, this.val$filePath);
    CardGiftVideoUI.b(this.klx, CardGiftVideoUI.a(this.klx));
    CardGiftVideoUI.i(this.klx);
    AppMethodBeat.o(88450);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.card.ui.CardGiftVideoUI.3
 * JD-Core Version:    0.6.2
 */