package com.tencent.mm.plugin.card.sharecard.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class CardConsumeSuccessUI$4
  implements DialogInterface.OnClickListener
{
  CardConsumeSuccessUI$4(CardConsumeSuccessUI paramCardConsumeSuccessUI)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(88120);
    paramDialogInterface.dismiss();
    CardConsumeSuccessUI.bbG();
    this.kgU.finish();
    AppMethodBeat.o(88120);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.card.sharecard.ui.CardConsumeSuccessUI.4
 * JD-Core Version:    0.6.2
 */