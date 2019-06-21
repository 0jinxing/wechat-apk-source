package com.tencent.mm.plugin.wallet_index.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class WalletBrandUI$a$2
  implements DialogInterface.OnClickListener
{
  WalletBrandUI$a$2(WalletBrandUI.a parama)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(48250);
    this.tRW.tRU.setResult(0);
    this.tRW.tRU.finish();
    AppMethodBeat.o(48250);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_index.ui.WalletBrandUI.a.2
 * JD-Core Version:    0.6.2
 */