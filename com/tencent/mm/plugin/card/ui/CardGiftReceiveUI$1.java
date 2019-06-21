package com.tencent.mm.plugin.card.ui;

import android.view.View;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.Window;
import android.widget.ScrollView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bz.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;

final class CardGiftReceiveUI$1
  implements ViewTreeObserver.OnGlobalLayoutListener
{
  CardGiftReceiveUI$1(CardGiftReceiveUI paramCardGiftReceiveUI)
  {
  }

  public final void onGlobalLayout()
  {
    AppMethodBeat.i(88415);
    int i = a.fromDPToPix(this.klk.mController.ylL, 67);
    int j = CardGiftReceiveUI.a(this.klk).getChildAt(0).getHeight() + i;
    int k = this.klk.getWindow().findViewById(16908290).getHeight();
    ab.i("MicroMsg.CardGiftReceiveUI", "bottomHeight: %d  totalViewHeight:%d  screenHeight:%d ", new Object[] { Integer.valueOf(i), Integer.valueOf(j), Integer.valueOf(k) });
    CardGiftReceiveUI.a(this.klk).setFillViewport(true);
    if (j > k)
      CardGiftReceiveUI.a(this.klk, true);
    while (true)
    {
      CardGiftReceiveUI.a(this.klk).getViewTreeObserver().removeOnGlobalLayoutListener(this);
      AppMethodBeat.o(88415);
      return;
      CardGiftReceiveUI.a(this.klk, false);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.card.ui.CardGiftReceiveUI.1
 * JD-Core Version:    0.6.2
 */