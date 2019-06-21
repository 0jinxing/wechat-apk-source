package com.tencent.mm.plugin.wallet_core.ui;

import android.os.Bundle;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.wallet_core.ui.view.SwitchPhoneItemGroupView.a;
import com.tencent.mm.protocal.protobuf.gz;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.wallet_core.a;
import com.tencent.mm.wallet_core.d.g;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;
import java.util.List;

final class WalletSwitchVerifyPhoneUI$1
  implements SwitchPhoneItemGroupView.a
{
  WalletSwitchVerifyPhoneUI$1(WalletSwitchVerifyPhoneUI paramWalletSwitchVerifyPhoneUI)
  {
  }

  public final void eo(View paramView)
  {
    AppMethodBeat.i(47670);
    int i;
    if (paramView.getTag() != null)
    {
      i = ((Integer)paramView.getTag()).intValue();
      ab.d("MicroMsg.WalletSwitchVerifyPhoneUI", "index: %d", new Object[] { Integer.valueOf(i) });
      if (i == -1)
      {
        ab.i("MicroMsg.WalletSwitchVerifyPhoneUI", "do bind new card");
        WalletSwitchVerifyPhoneUI.a(this.tKP);
        AppMethodBeat.o(47670);
      }
    }
    while (true)
    {
      return;
      if (i == -2)
      {
        ab.i("MicroMsg.WalletSwitchVerifyPhoneUI", "do verify idcard tail");
        this.tKP.mBundle.putBoolean("key_forward_to_id_verify", true);
        a.j(this.tKP, this.tKP.mBundle);
        AppMethodBeat.o(47670);
      }
      else
      {
        paramView = (gz)WalletSwitchVerifyPhoneUI.b(this.tKP).get(i);
        this.tKP.mBundle.putBoolean("key_balance_change_phone_need_confirm_phone", false);
        this.tKP.mBundle.putBoolean("key_forward_to_id_verify", false);
        ab.i("MicroMsg.WalletSwitchVerifyPhoneUI", "select wx phone: %s", new Object[] { Boolean.valueOf(paramView.vJB.equals("wx")) });
        this.tKP.dOE().p(new Object[] { paramView });
        AppMethodBeat.o(47670);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_core.ui.WalletSwitchVerifyPhoneUI.1
 * JD-Core Version:    0.6.2
 */