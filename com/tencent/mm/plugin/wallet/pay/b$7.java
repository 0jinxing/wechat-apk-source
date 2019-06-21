package com.tencent.mm.plugin.wallet.pay;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.wallet_core.c;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;

final class b$7
  implements DialogInterface.OnClickListener
{
  b$7(b paramb, WalletBaseUI paramWalletBaseUI)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(45872);
    b.y(this.tnW).putInt("key_err_code", -1003);
    this.tnW.a(this.tnX, 0, b.z(this.tnW));
    if (this.tnX.bwP())
      this.tnX.finish();
    AppMethodBeat.o(45872);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet.pay.b.7
 * JD-Core Version:    0.6.2
 */