package com.tencent.mm.wallet_core.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.wallet_core.a;

final class WalletBaseUI$1
  implements DialogInterface.OnClickListener
{
  WalletBaseUI$1(WalletBaseUI paramWalletBaseUI)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(49241);
    a.b(this.AhA, null, -10000);
    AppMethodBeat.o(49241);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.wallet_core.ui.WalletBaseUI.1
 * JD-Core Version:    0.6.2
 */