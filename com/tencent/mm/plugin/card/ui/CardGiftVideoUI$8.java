package com.tencent.mm.plugin.card.ui;

import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnPreDrawListener;
import android.widget.RelativeLayout;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.tools.e;

final class CardGiftVideoUI$8
  implements ViewTreeObserver.OnPreDrawListener
{
  CardGiftVideoUI$8(CardGiftVideoUI paramCardGiftVideoUI)
  {
  }

  public final boolean onPreDraw()
  {
    AppMethodBeat.i(88455);
    CardGiftVideoUI.b(this.klx).getViewTreeObserver().removeOnPreDrawListener(this);
    CardGiftVideoUI.d(this.klx).a(CardGiftVideoUI.b(this.klx), CardGiftVideoUI.c(this.klx), null);
    AppMethodBeat.o(88455);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.card.ui.CardGiftVideoUI.8
 * JD-Core Version:    0.6.2
 */