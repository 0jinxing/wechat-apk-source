package com.tencent.mm.plugin.remittance.bankcard.ui;

import android.view.KeyEvent;
import android.widget.TextView;
import android.widget.TextView.OnEditorActionListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.al;

final class BankRemitBankcardInputUI$23
  implements TextView.OnEditorActionListener
{
  BankRemitBankcardInputUI$23(BankRemitBankcardInputUI paramBankRemitBankcardInputUI)
  {
  }

  public final boolean onEditorAction(TextView paramTextView, int paramInt, KeyEvent paramKeyEvent)
  {
    AppMethodBeat.i(44538);
    if (paramInt == 5)
    {
      this.pMO.aqX();
      if (!BankRemitBankcardInputUI.p(this.pMO))
        al.n(new BankRemitBankcardInputUI.23.1(this), 200L);
    }
    AppMethodBeat.o(44538);
    return false;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.remittance.bankcard.ui.BankRemitBankcardInputUI.23
 * JD-Core Version:    0.6.2
 */