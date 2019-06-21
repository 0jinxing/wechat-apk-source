package com.tencent.mm.plugin.wallet_core.ui;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;
import com.tencent.mm.ui.widget.picker.a;

final class WalletCardElementUI$18
  implements View.OnClickListener
{
  WalletCardElementUI$18(WalletCardElementUI paramWalletCardElementUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(47236);
    paramView = new a(this.tGf.mController.ylL);
    paramView.zSj = new WalletCardElementUI.18.1(this, paramView);
    if ((WalletCardElementUI.q(this.tGf) > 0) && (WalletCardElementUI.r(this.tGf) > 0) && (WalletCardElementUI.s(this.tGf) > 0))
      paramView.aB(WalletCardElementUI.q(this.tGf), WalletCardElementUI.r(this.tGf), WalletCardElementUI.s(this.tGf));
    paramView.show();
    AppMethodBeat.o(47236);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_core.ui.WalletCardElementUI.18
 * JD-Core Version:    0.6.2
 */