package com.tencent.mm.plugin.wallet_core.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.wallet_core.model.e;
import com.tencent.mm.plugin.wallet_core.utils.a.a;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.Map;

final class WalletBankCardSelectUI$3
  implements a.a
{
  WalletBankCardSelectUI$3(WalletBankCardSelectUI paramWalletBankCardSelectUI)
  {
  }

  public final void am(Map<String, e> paramMap)
  {
    AppMethodBeat.i(47145);
    ab.i("WalletBankCardSelectUI", "get logo callback: %s", new Object[] { Integer.valueOf(paramMap.size()) });
    WalletBankCardSelectUI.a(this.tEf, paramMap);
    AppMethodBeat.o(47145);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_core.ui.WalletBankCardSelectUI.3
 * JD-Core Version:    0.6.2
 */