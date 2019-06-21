package com.tencent.mm.plugin.wallet.bind.ui;

import android.content.Intent;
import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;
import com.tencent.mm.wallet_core.c.a;

final class WalletBindUI$4
  implements c.a
{
  WalletBindUI$4(WalletBindUI paramWalletBindUI)
  {
  }

  public final Intent n(int paramInt, Bundle paramBundle)
  {
    AppMethodBeat.i(45799);
    paramBundle = new Intent(this.tml.mController.ylL, WalletBankcardManageUI.class);
    AppMethodBeat.o(45799);
    return paramBundle;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet.bind.ui.WalletBindUI.4
 * JD-Core Version:    0.6.2
 */