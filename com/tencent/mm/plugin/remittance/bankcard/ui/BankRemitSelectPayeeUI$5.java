package com.tencent.mm.plugin.remittance.bankcard.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.al;

final class BankRemitSelectPayeeUI$5
  implements DialogInterface.OnClickListener
{
  BankRemitSelectPayeeUI$5(BankRemitSelectPayeeUI paramBankRemitSelectPayeeUI)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(44676);
    al.n(new Runnable()
    {
      public final void run()
      {
        AppMethodBeat.i(44675);
        BankRemitSelectPayeeUI.5.this.pOo.aqX();
        AppMethodBeat.o(44675);
      }
    }
    , 500L);
    AppMethodBeat.o(44676);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.remittance.bankcard.ui.BankRemitSelectPayeeUI.5
 * JD-Core Version:    0.6.2
 */