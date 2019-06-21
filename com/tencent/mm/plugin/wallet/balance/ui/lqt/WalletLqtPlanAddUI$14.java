package com.tencent.mm.plugin.wallet.balance.ui.lqt;

import android.text.Editable;
import android.text.TextWatcher;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class WalletLqtPlanAddUI$14
  implements TextWatcher
{
  WalletLqtPlanAddUI$14(WalletLqtPlanAddUI paramWalletLqtPlanAddUI)
  {
  }

  public final void afterTextChanged(Editable paramEditable)
  {
    AppMethodBeat.i(45572);
    if (paramEditable.toString().startsWith("."))
      paramEditable.insert(0, "0");
    String str = paramEditable.toString();
    int i = str.indexOf(".");
    int j = str.length();
    if ((i >= 0) && (j - i > 2))
      paramEditable.delete(i + 3, j);
    WalletLqtPlanAddUI.f(this.tjp);
    WalletLqtPlanAddUI.a(this.tjp);
    AppMethodBeat.o(45572);
  }

  public final void beforeTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
  {
  }

  public final void onTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtPlanAddUI.14
 * JD-Core Version:    0.6.2
 */