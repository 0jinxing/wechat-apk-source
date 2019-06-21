package com.tencent.mm.plugin.wallet_ecard.ui;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.wallet_core.model.ElementQuery;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.wallet_core.d.g;

final class WalletECardElementInputUI$2
  implements View.OnClickListener
{
  WalletECardElementInputUI$2(WalletECardElementInputUI paramWalletECardElementInputUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(48139);
    ab.i("MicroMsg.WalletECardElementInputUI", "goto next: %s", new Object[] { WalletECardElementInputUI.b(this.tQH).pbn });
    this.tQH.dOE().p(new Object[] { WalletECardElementInputUI.b(this.tQH) });
    AppMethodBeat.o(48139);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_ecard.ui.WalletECardElementInputUI.2
 * JD-Core Version:    0.6.2
 */