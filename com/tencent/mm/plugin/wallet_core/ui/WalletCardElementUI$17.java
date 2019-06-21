package com.tencent.mm.plugin.wallet_core.ui;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;

final class WalletCardElementUI$17
  implements View.OnClickListener
{
  WalletCardElementUI$17(WalletCardElementUI paramWalletCardElementUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(47234);
    paramView = new Intent(this.tGf.mController.ylL, WalletSelectProfessionUI.class);
    paramView.putExtra("key_profession_list", WalletCardElementUI.o(this.tGf));
    this.tGf.startActivityForResult(paramView, 5);
    AppMethodBeat.o(47234);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_core.ui.WalletCardElementUI.17
 * JD-Core Version:    0.6.2
 */