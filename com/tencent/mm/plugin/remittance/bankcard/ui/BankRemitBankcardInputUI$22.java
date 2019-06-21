package com.tencent.mm.plugin.remittance.bankcard.ui;

import android.text.Editable;
import android.text.InputFilter;
import android.text.InputFilter.LengthFilter;
import android.text.TextWatcher;
import android.widget.Filter;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.remittance.bankcard.model.c;
import com.tencent.mm.wallet_core.ui.formview.WalletFormView;

final class BankRemitBankcardInputUI$22
  implements TextWatcher
{
  BankRemitBankcardInputUI$22(BankRemitBankcardInputUI paramBankRemitBankcardInputUI)
  {
  }

  public final void afterTextChanged(Editable paramEditable)
  {
    AppMethodBeat.i(44536);
    BankRemitBankcardInputUI.c(this.pMO);
    BankRemitBankcardInputUI.d(this.pMO);
    if ((BankRemitBankcardInputUI.e(this.pMO)) && (BankRemitBankcardInputUI.f(this.pMO) != null))
      BankRemitBankcardInputUI.h(this.pMO).getFilter().filter(paramEditable.toString(), BankRemitBankcardInputUI.g(this.pMO));
    while (true)
    {
      if (BankRemitBankcardInputUI.i(this.pMO))
        BankRemitBankcardInputUI.j(this.pMO);
      BankRemitBankcardInputUI.k(this.pMO);
      BankRemitBankcardInputUI.l(this.pMO);
      if ((BankRemitBankcardInputUI.m(this.pMO)) && (BankRemitBankcardInputUI.n(this.pMO).getInputLength() <= BankRemitBankcardInputUI.o(this.pMO)))
      {
        BankRemitBankcardInputUI.n(this.pMO).setMaxInputLength(BankRemitBankcardInputUI.o(this.pMO));
        BankRemitBankcardInputUI.n(this.pMO).setFilters(new InputFilter[] { new InputFilter.LengthFilter(BankRemitBankcardInputUI.o(this.pMO)) });
      }
      AppMethodBeat.o(44536);
      return;
      BankRemitBankcardInputUI.a(this.pMO, true);
    }
  }

  public final void beforeTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
  {
  }

  public final void onTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.remittance.bankcard.ui.BankRemitBankcardInputUI.22
 * JD-Core Version:    0.6.2
 */