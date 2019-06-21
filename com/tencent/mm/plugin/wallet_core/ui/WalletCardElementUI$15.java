package com.tencent.mm.plugin.wallet_core.ui;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;
import com.tencent.mm.ui.widget.picker.a;

final class WalletCardElementUI$15
  implements View.OnClickListener
{
  WalletCardElementUI$15(WalletCardElementUI paramWalletCardElementUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(47232);
    paramView = new a(this.tGf.mController.ylL);
    paramView.zSj = new WalletCardElementUI.15.1(this, paramView);
    if ((WalletCardElementUI.k(this.tGf) > 0) && (WalletCardElementUI.l(this.tGf) > 0) && (WalletCardElementUI.m(this.tGf) > 0))
      paramView.aB(WalletCardElementUI.k(this.tGf), WalletCardElementUI.l(this.tGf), WalletCardElementUI.m(this.tGf));
    paramView.show();
    AppMethodBeat.o(47232);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_core.ui.WalletCardElementUI.15
 * JD-Core Version:    0.6.2
 */