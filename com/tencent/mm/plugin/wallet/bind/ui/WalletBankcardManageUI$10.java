package com.tencent.mm.plugin.wallet.bind.ui;

import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.wallet_core.b.b;
import com.tencent.mm.wallet_core.a;

final class WalletBankcardManageUI$10
  implements Runnable
{
  WalletBankcardManageUI$10(WalletBankcardManageUI paramWalletBankcardManageUI, Bundle paramBundle)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(45774);
    this.tme.putInt("key_bind_scene", 15);
    this.tme.putBoolean("key_bind_show_change_card", true);
    a.a(this.tlZ, b.class, this.tme, null);
    AppMethodBeat.o(45774);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet.bind.ui.WalletBankcardManageUI.10
 * JD-Core Version:    0.6.2
 */