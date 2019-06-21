package com.tencent.mm.plugin.card.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.base.p;

final class CardGiftAcceptUI$1
  implements DialogInterface.OnCancelListener
{
  CardGiftAcceptUI$1(CardGiftAcceptUI paramCardGiftAcceptUI)
  {
  }

  public final void onCancel(DialogInterface paramDialogInterface)
  {
    AppMethodBeat.i(88382);
    if ((CardGiftAcceptUI.a(this.kkj) != null) && (CardGiftAcceptUI.a(this.kkj).isShowing()))
      CardGiftAcceptUI.a(this.kkj).dismiss();
    ab.i("MicroMsg.CardGiftAcceptUI", "user cancel & finish");
    this.kkj.finish();
    AppMethodBeat.o(88382);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.card.ui.CardGiftAcceptUI.1
 * JD-Core Version:    0.6.2
 */