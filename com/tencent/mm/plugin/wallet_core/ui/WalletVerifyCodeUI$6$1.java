package com.tencent.mm.plugin.wallet_core.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.wallet_core.a;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;

final class WalletVerifyCodeUI$6$1
  implements DialogInterface.OnClickListener
{
  WalletVerifyCodeUI$6$1(WalletVerifyCodeUI.6 param6)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(47694);
    ab.i("MicroMsg.WalletVertifyCodeUI", "forwardProcess2 and finish to reset mobile num!");
    paramDialogInterface = this.tLq.tLn.mBundle;
    paramDialogInterface.putInt("key_err_code", 408);
    a.j(this.tLq.tLn, paramDialogInterface);
    this.tLq.tLn.finish();
    AppMethodBeat.o(47694);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_core.ui.WalletVerifyCodeUI.6.1
 * JD-Core Version:    0.6.2
 */