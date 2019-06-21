package com.tencent.mm.plugin.card.ui;

import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnPreDrawListener;
import android.widget.RelativeLayout;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.tools.e;

final class CardGiftImageUI$5
  implements ViewTreeObserver.OnPreDrawListener
{
  CardGiftImageUI$5(CardGiftImageUI paramCardGiftImageUI)
  {
  }

  public final boolean onPreDraw()
  {
    AppMethodBeat.i(88397);
    CardGiftImageUI.c(this.kkv).getViewTreeObserver().removeOnPreDrawListener(this);
    CardGiftImageUI.e(this.kkv).a(CardGiftImageUI.c(this.kkv), CardGiftImageUI.d(this.kkv), null);
    AppMethodBeat.o(88397);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.card.ui.CardGiftImageUI.5
 * JD-Core Version:    0.6.2
 */