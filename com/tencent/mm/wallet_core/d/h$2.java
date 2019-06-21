package com.tencent.mm.wallet_core.d;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bp.d;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;

final class h$2
  implements DialogInterface.OnClickListener
{
  h$2(WalletBaseUI paramWalletBaseUI)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(49126);
    paramDialogInterface = new Intent();
    paramDialogInterface.putExtra("rawUrl", "https://www.payu.co.za/wechat/contact-us/");
    d.b(this.tnX, "webview", ".ui.tools.WebViewUI", paramDialogInterface);
    if ((this.tnX.bwP()) || (this.tnX.mController.contentView.getVisibility() != 0))
      this.tnX.finish();
    AppMethodBeat.o(49126);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.wallet_core.d.h.2
 * JD-Core Version:    0.6.2
 */