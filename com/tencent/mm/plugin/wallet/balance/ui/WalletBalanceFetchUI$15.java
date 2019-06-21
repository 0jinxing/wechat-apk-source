package com.tencent.mm.plugin.wallet.balance.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bp.d;
import com.tencent.mm.plugin.report.service.h;

final class WalletBalanceFetchUI$15
  implements DialogInterface.OnClickListener
{
  WalletBalanceFetchUI$15(WalletBalanceFetchUI paramWalletBalanceFetchUI)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(45370);
    Intent localIntent = new Intent();
    localIntent.putExtra("rawUrl", this.the.getString(2131304798));
    localIntent.putExtra("showShare", false);
    d.b(this.the, "webview", ".ui.tools.WebViewUI", localIntent);
    paramDialogInterface.dismiss();
    h.pYm.e(16398, new Object[] { WalletBalanceFetchUI.d(this.the), Integer.valueOf(3), "", "" });
    AppMethodBeat.o(45370);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet.balance.ui.WalletBalanceFetchUI.15
 * JD-Core Version:    0.6.2
 */