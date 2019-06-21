package com.tencent.mm.wallet_core.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bp.d;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;

final class f$2
  implements DialogInterface.OnClickListener
{
  f$2(WalletBaseUI paramWalletBaseUI, String paramString)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(49330);
    f.e(this.AhM);
    paramDialogInterface = new Intent();
    paramDialogInterface.putExtra("rawUrl", this.AhN);
    d.b(this.AhM.mController.ylL, "webview", "com.tencent.mm.plugin.webview.ui.tools.WebViewUI", paramDialogInterface);
    e.QS(3);
    AppMethodBeat.o(49330);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.wallet_core.ui.f.2
 * JD-Core Version:    0.6.2
 */