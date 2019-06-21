package com.tencent.mm.plugin.card.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class CardShowWaringTransparentUI$1
  implements DialogInterface.OnClickListener
{
  CardShowWaringTransparentUI$1(CardShowWaringTransparentUI paramCardShowWaringTransparentUI)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(88651);
    paramDialogInterface.dismiss();
    this.knK.finish();
    AppMethodBeat.o(88651);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.card.ui.CardShowWaringTransparentUI.1
 * JD-Core Version:    0.6.2
 */