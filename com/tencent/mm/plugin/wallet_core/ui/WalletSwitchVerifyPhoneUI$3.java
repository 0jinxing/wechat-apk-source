package com.tencent.mm.plugin.wallet_core.ui;

import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.protocal.protobuf.gz;
import com.tencent.mm.sdk.platformtools.ab;

final class WalletSwitchVerifyPhoneUI$3
  implements j.a
{
  WalletSwitchVerifyPhoneUI$3(WalletSwitchVerifyPhoneUI paramWalletSwitchVerifyPhoneUI, gz paramgz)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(47672);
    ab.d("MicroMsg.WalletSwitchVerifyPhoneUI", "span click");
    WalletSwitchVerifyPhoneUI.a(this.tKP, this.tKQ);
    AppMethodBeat.o(47672);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_core.ui.WalletSwitchVerifyPhoneUI.3
 * JD-Core Version:    0.6.2
 */