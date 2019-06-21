package com.tencent.mm.plugin.card.ui;

import android.widget.ProgressBar;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class CardGiftImageUI$8
  implements Runnable
{
  CardGiftImageUI$8(CardGiftImageUI paramCardGiftImageUI, String paramString)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(88401);
    if (CardGiftImageUI.f(this.kkv).getVisibility() != 8)
      CardGiftImageUI.f(this.kkv).setVisibility(8);
    CardGiftImageUI.a(this.kkv, this.val$filePath);
    CardGiftImageUI.g(this.kkv);
    CardGiftImageUI.h(this.kkv).notifyDataSetChanged();
    AppMethodBeat.o(88401);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.card.ui.CardGiftImageUI.8
 * JD-Core Version:    0.6.2
 */