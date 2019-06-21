package com.tencent.mm.plugin.wallet.balance.ui.lqt;

import android.text.Editable;
import android.text.TextWatcher;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class WalletLqtSaveFetchUI$7
  implements TextWatcher
{
  WalletLqtSaveFetchUI$7(WalletLqtSaveFetchUI paramWalletLqtSaveFetchUI)
  {
  }

  public final void afterTextChanged(Editable paramEditable)
  {
    AppMethodBeat.i(45652);
    if (paramEditable.toString().startsWith("."))
      paramEditable.insert(0, "0");
    String str = paramEditable.toString();
    int i = str.indexOf(".");
    int j = str.length();
    if ((i >= 0) && (j - i > 3))
      paramEditable.delete(i + 3, j);
    while (true)
    {
      paramEditable = paramEditable.toString();
      WalletLqtSaveFetchUI.b(this.tkP, paramEditable);
      AppMethodBeat.o(45652);
      return;
      if (i > 12)
        paramEditable.delete(12, i);
      else if ((i == -1) && (j > 12))
        paramEditable.delete(12, j);
    }
  }

  public final void beforeTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
  {
  }

  public final void onTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtSaveFetchUI.7
 * JD-Core Version:    0.6.2
 */