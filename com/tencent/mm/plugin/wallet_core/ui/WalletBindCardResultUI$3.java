package com.tencent.mm.plugin.wallet_core.ui;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class WalletBindCardResultUI$3
  implements View.OnClickListener
{
  WalletBindCardResultUI$3(WalletBindCardResultUI paramWalletBindCardResultUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(47188);
    ab.i("MicroMsg.WalletBindCardResultUI", "click activity button");
    WalletBindCardResultUI.b(this.tEY);
    AppMethodBeat.o(47188);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_core.ui.WalletBindCardResultUI.3
 * JD-Core Version:    0.6.2
 */