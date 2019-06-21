package com.tencent.mm.plugin.wallet_core.ui;

import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class WalletCardImportUI$1$1
  implements Runnable
{
  WalletCardImportUI$1$1(WalletCardImportUI.1 param1, int paramInt)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(47264);
    if (this.tGu != WalletCardImportUI.a(this.tGv.tGt).getVisibility())
      WalletCardImportUI.a(this.tGv.tGt).setVisibility(this.tGu);
    AppMethodBeat.o(47264);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_core.ui.WalletCardImportUI.1.1
 * JD-Core Version:    0.6.2
 */