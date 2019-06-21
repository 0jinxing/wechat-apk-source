package com.tencent.mm.plugin.wallet_core.ui;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

public final class m$3
  implements DialogInterface.OnCancelListener
{
  public m$3(Dialog paramDialog)
  {
  }

  public final void onCancel(DialogInterface paramDialogInterface)
  {
    AppMethodBeat.i(47394);
    ab.i("MicroMsg.WalletIdCardTip", "SnsLuckyMoneyNewYearTipsUI onCancel");
    if ((this.qHc != null) && (this.qHc.isShowing()))
      this.qHc.dismiss();
    AppMethodBeat.o(47394);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_core.ui.m.3
 * JD-Core Version:    0.6.2
 */