package com.tencent.mm.plugin.wallet_core.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.wallet_core.model.Bankcard;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;

final class WalletSelectBankcardUI$2$2
  implements DialogInterface.OnClickListener
{
  WalletSelectBankcardUI$2$2(WalletSelectBankcardUI.2 param2, Bankcard paramBankcard)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(47654);
    this.tKH.tKF.mBundle.putBoolean("key_balance_change_phone_need_confirm_phone", true);
    WalletSelectBankcardUI.a(this.tKH.tKF, this.tKG);
    AppMethodBeat.o(47654);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_core.ui.WalletSelectBankcardUI.2.2
 * JD-Core Version:    0.6.2
 */