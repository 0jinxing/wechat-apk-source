package com.tencent.mm.plugin.wallet.pay;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;

final class b$8
  implements DialogInterface.OnClickListener
{
  b$8(b paramb, WalletBaseUI paramWalletBaseUI)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(45873);
    this.tnW.b(this.tnX, b.A(this.tnW));
    if (this.tnX.bwP())
      this.tnX.finish();
    AppMethodBeat.o(45873);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet.pay.b.8
 * JD-Core Version:    0.6.2
 */