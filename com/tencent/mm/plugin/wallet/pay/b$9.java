package com.tencent.mm.plugin.wallet.pay;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.wallet_core.model.Bankcard;
import com.tencent.mm.pluginsdk.wallet.PayInfo;
import com.tencent.mm.wallet_core.c;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;

final class b$9
  implements DialogInterface.OnClickListener
{
  b$9(b paramb, WalletBaseUI paramWalletBaseUI)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(45874);
    paramDialogInterface = (Bankcard)b.B(this.tnW).getParcelable("key_bankcard");
    PayInfo localPayInfo = (PayInfo)b.C(this.tnW).getParcelable("key_pay_info");
    if ((paramDialogInterface != null) && (localPayInfo != null))
      paramDialogInterface.twR = localPayInfo.czZ;
    b.D(this.tnW).putInt("key_err_code", -1004);
    this.tnW.a(this.tnX, 0, b.E(this.tnW));
    if (this.tnX.bwP())
      this.tnX.finish();
    AppMethodBeat.o(45874);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet.pay.b.9
 * JD-Core Version:    0.6.2
 */