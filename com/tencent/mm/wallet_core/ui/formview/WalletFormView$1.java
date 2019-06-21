package com.tencent.mm.wallet_core.ui.formview;

import android.text.Editable;
import android.text.TextWatcher;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class WalletFormView$1
  implements TextWatcher
{
  private boolean pIR = false;

  WalletFormView$1(WalletFormView paramWalletFormView)
  {
  }

  public final void afterTextChanged(Editable paramEditable)
  {
    AppMethodBeat.i(49410);
    boolean bool = this.Ais.asa();
    if (WalletFormView.h(this.Ais) != null)
    {
      if (bool != this.pIR)
      {
        WalletFormView.h(this.Ais).hY(bool);
        this.pIR = this.Ais.asa();
      }
      if (((WalletFormView.h(this.Ais) instanceof WalletFormView.b)) && (bool))
        WalletFormView.h(this.Ais);
    }
    WalletFormView.i(this.Ais);
    AppMethodBeat.o(49410);
  }

  public final void beforeTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
  {
  }

  public final void onTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.wallet_core.ui.formview.WalletFormView.1
 * JD-Core Version:    0.6.2
 */