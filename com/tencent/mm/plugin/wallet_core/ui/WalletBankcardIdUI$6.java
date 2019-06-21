package com.tencent.mm.plugin.wallet_core.ui;

import android.text.Editable;
import android.text.TextWatcher;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.wallet_core.ui.formview.WalletFormView;

final class WalletBankcardIdUI$6
  implements TextWatcher
{
  WalletBankcardIdUI$6(WalletBankcardIdUI paramWalletBankcardIdUI)
  {
  }

  public final void afterTextChanged(Editable paramEditable)
  {
  }

  public final void beforeTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
  {
    AppMethodBeat.i(47166);
    if ((this.tEv.tEp.asa()) && (!WalletBankcardIdUI.b(this.tEv)))
    {
      WalletBankcardIdUI.c(this.tEv);
      this.tEv.tEp.cey();
    }
    AppMethodBeat.o(47166);
  }

  public final void onTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_core.ui.WalletBankcardIdUI.6
 * JD-Core Version:    0.6.2
 */