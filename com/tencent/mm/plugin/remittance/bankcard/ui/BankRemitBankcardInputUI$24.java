package com.tencent.mm.plugin.remittance.bankcard.ui;

import android.text.Editable;
import android.text.TextWatcher;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.al;

final class BankRemitBankcardInputUI$24
  implements TextWatcher
{
  BankRemitBankcardInputUI$24(BankRemitBankcardInputUI paramBankRemitBankcardInputUI)
  {
  }

  public final void afterTextChanged(Editable paramEditable)
  {
    AppMethodBeat.i(44540);
    BankRemitBankcardInputUI.q(this.pMO);
    al.n(new Runnable()
    {
      public final void run()
      {
        AppMethodBeat.i(44539);
        BankRemitBankcardInputUI.k(BankRemitBankcardInputUI.24.this.pMO);
        AppMethodBeat.o(44539);
      }
    }
    , 200L);
    AppMethodBeat.o(44540);
  }

  public final void beforeTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
  {
  }

  public final void onTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.remittance.bankcard.ui.BankRemitBankcardInputUI.24
 * JD-Core Version:    0.6.2
 */