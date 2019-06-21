package com.tencent.mm.plugin.wallet_payu.bind.ui;

import android.text.Editable;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class WalletPayUCardElementUI$3 extends WalletPayUCardElementUI.a
{
  WalletPayUCardElementUI$3(WalletPayUCardElementUI paramWalletPayUCardElementUI)
  {
    super(paramWalletPayUCardElementUI, (byte)0);
  }

  public final void afterTextChanged(Editable paramEditable)
  {
    AppMethodBeat.i(48362);
    WalletPayUCardElementUI.a(this.tSX, WalletPayUCardElementUI.c(this.tSX), paramEditable);
    AppMethodBeat.o(48362);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_payu.bind.ui.WalletPayUCardElementUI.3
 * JD-Core Version:    0.6.2
 */