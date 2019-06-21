package com.tencent.mm.plugin.wallet_core.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.uv;
import com.tencent.mm.sdk.b.a;

final class WalletMixOrderInfoUI$2
  implements DialogInterface.OnClickListener
{
  WalletMixOrderInfoUI$2(WalletMixOrderInfoUI paramWalletMixOrderInfoUI)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(47412);
    paramDialogInterface.dismiss();
    paramDialogInterface = new uv();
    paramDialogInterface.cRF.czZ = WalletMixOrderInfoUI.a(this.tIa);
    paramDialogInterface.cRF.result = 0;
    a.xxA.m(paramDialogInterface);
    this.tIa.finish();
    AppMethodBeat.o(47412);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_core.ui.WalletMixOrderInfoUI.2
 * JD-Core Version:    0.6.2
 */