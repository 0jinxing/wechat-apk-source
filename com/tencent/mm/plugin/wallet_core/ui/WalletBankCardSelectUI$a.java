package com.tencent.mm.plugin.wallet_core.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.base.sortview.d;
import java.text.Collator;
import java.util.Comparator;
import java.util.Locale;

final class WalletBankCardSelectUI$a
  implements Comparator<d>
{
  private Collator tEg;

  private WalletBankCardSelectUI$a()
  {
    AppMethodBeat.i(47147);
    this.tEg = Collator.getInstance(Locale.getDefault());
    AppMethodBeat.o(47147);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_core.ui.WalletBankCardSelectUI.a
 * JD-Core Version:    0.6.2
 */