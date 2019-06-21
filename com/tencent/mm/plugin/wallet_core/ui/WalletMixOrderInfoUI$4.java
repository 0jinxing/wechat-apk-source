package com.tencent.mm.plugin.wallet_core.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.uv;
import com.tencent.mm.g.a.vs;
import com.tencent.mm.sdk.b.a;

final class WalletMixOrderInfoUI$4
  implements DialogInterface.OnClickListener
{
  WalletMixOrderInfoUI$4(WalletMixOrderInfoUI paramWalletMixOrderInfoUI)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(47415);
    paramDialogInterface.dismiss();
    if (WalletMixOrderInfoUI.k(this.tIa))
    {
      paramDialogInterface = new vs();
      paramDialogInterface.cSF.result = this.tIb;
      a.xxA.m(paramDialogInterface);
    }
    paramDialogInterface = new uv();
    paramDialogInterface.cRF.czZ = WalletMixOrderInfoUI.a(this.tIa);
    paramDialogInterface.cRF.result = this.tIb;
    a.xxA.m(paramDialogInterface);
    this.tIa.setResult(this.tIb);
    this.tIa.finish();
    AppMethodBeat.o(47415);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_core.ui.WalletMixOrderInfoUI.4
 * JD-Core Version:    0.6.2
 */