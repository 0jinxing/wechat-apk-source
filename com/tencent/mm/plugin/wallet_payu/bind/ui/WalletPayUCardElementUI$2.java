package com.tencent.mm.plugin.wallet_payu.bind.ui;

import android.text.Editable;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class WalletPayUCardElementUI$2 extends WalletPayUCardElementUI.a
{
  WalletPayUCardElementUI$2(WalletPayUCardElementUI paramWalletPayUCardElementUI)
  {
    super(paramWalletPayUCardElementUI, (byte)0);
  }

  public final void afterTextChanged(Editable paramEditable)
  {
    AppMethodBeat.i(48361);
    WalletPayUCardElementUI.a(this.tSX, WalletPayUCardElementUI.b(this.tSX), paramEditable);
    AppMethodBeat.o(48361);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_payu.bind.ui.WalletPayUCardElementUI.2
 * JD-Core Version:    0.6.2
 */