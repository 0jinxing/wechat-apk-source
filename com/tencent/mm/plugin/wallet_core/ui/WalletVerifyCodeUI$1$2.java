package com.tencent.mm.plugin.wallet_core.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.plugin.wallet_core.model.Bankcard;
import com.tencent.mm.wallet_core.a;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;

final class WalletVerifyCodeUI$1$2
  implements DialogInterface.OnClickListener
{
  WalletVerifyCodeUI$1$2(WalletVerifyCodeUI.1 param1, int paramInt)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(47690);
    paramDialogInterface = this.tLp.tLn.mBundle;
    paramDialogInterface.putInt("key_err_code", 417);
    paramDialogInterface.putBoolean("key_need_show_switch_phone", true);
    if ((this.tLp.tgn == null) || (this.tLp.tgn.cPc()));
    for (boolean bool = true; ; bool = false)
    {
      paramDialogInterface.putBoolean("key_isbalance", bool);
      a.j(this.tLp.tLn, paramDialogInterface);
      h.pYm.e(15443, new Object[] { Integer.valueOf(2), Integer.valueOf(2), Integer.valueOf(this.tLo) });
      AppMethodBeat.o(47690);
      return;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_core.ui.WalletVerifyCodeUI.1.2
 * JD-Core Version:    0.6.2
 */