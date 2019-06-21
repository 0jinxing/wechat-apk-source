package com.tencent.mm.plugin.card.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.base.p;

final class CardGiftReceiveUI$3
  implements DialogInterface.OnCancelListener
{
  CardGiftReceiveUI$3(CardGiftReceiveUI paramCardGiftReceiveUI)
  {
  }

  public final void onCancel(DialogInterface paramDialogInterface)
  {
    AppMethodBeat.i(88417);
    if ((CardGiftReceiveUI.c(this.klk) != null) && (CardGiftReceiveUI.c(this.klk).isShowing()))
      CardGiftReceiveUI.c(this.klk).dismiss();
    if ((CardGiftReceiveUI.d(this.klk).getVisibility() == 8) || (CardGiftReceiveUI.e(this.klk).getVisibility() == 4))
    {
      ab.i("MicroMsg.CardGiftReceiveUI", "user cancel & finish");
      this.klk.finish();
    }
    AppMethodBeat.o(88417);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.card.ui.CardGiftReceiveUI.3
 * JD-Core Version:    0.6.2
 */