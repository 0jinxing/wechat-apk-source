package com.tencent.mm.plugin.remittance.bankcard.ui;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class BankRemitBankcardInputUI$27$1
  implements DialogInterface.OnCancelListener
{
  BankRemitBankcardInputUI$27$1(BankRemitBankcardInputUI.27 param27)
  {
  }

  public final void onCancel(DialogInterface paramDialogInterface)
  {
    AppMethodBeat.i(44543);
    ab.i("MicroMsg.BankRemitBankcardInputUI", "coperationTipDialogNoTransparent onCancel()");
    BankRemitBankcardInputUI.b(this.pMY.pMO, false);
    BankRemitBankcardInputUI.C(this.pMY.pMO);
    if ((BankRemitBankcardInputUI.B(this.pMY.pMO) != null) && (BankRemitBankcardInputUI.B(this.pMY.pMO).isShowing()))
      BankRemitBankcardInputUI.B(this.pMY.pMO).dismiss();
    if ((BankRemitBankcardInputUI.D(this.pMY.pMO).getVisibility() == 8) || (BankRemitBankcardInputUI.E(this.pMY.pMO).getVisibility() == 4))
    {
      ab.i("MicroMsg.BankRemitBankcardInputUI", "usr cancel, & visibility not visiable, so finish");
      this.pMY.pMO.finish();
    }
    BankRemitBankcardInputUI.F(this.pMY.pMO);
    AppMethodBeat.o(44543);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.remittance.bankcard.ui.BankRemitBankcardInputUI.27.1
 * JD-Core Version:    0.6.2
 */