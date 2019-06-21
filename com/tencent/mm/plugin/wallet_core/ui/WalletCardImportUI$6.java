package com.tencent.mm.plugin.wallet_core.ui;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class WalletCardImportUI$6
  implements View.OnClickListener
{
  WalletCardImportUI$6(WalletCardImportUI paramWalletCardImportUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(47271);
    this.tGt.startActivityForResult(new Intent("com.tencent.mm.action.GET_ADRESS").putExtra("GetAddress", true), 2);
    AppMethodBeat.o(47271);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_core.ui.WalletCardImportUI.6
 * JD-Core Version:    0.6.2
 */