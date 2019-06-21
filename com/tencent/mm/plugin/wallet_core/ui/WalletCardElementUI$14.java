package com.tencent.mm.plugin.wallet_core.ui;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;
import com.tencent.mm.ui.widget.picker.b;

final class WalletCardElementUI$14
  implements View.OnClickListener
{
  WalletCardElementUI$14(WalletCardElementUI paramWalletCardElementUI, String[] paramArrayOfString)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(47230);
    paramView = new b(this.tGf.mController.ylL, this.tGh);
    paramView.zSq = new WalletCardElementUI.14.1(this, paramView);
    paramView.Qq(WalletCardElementUI.i(this.tGf));
    paramView.show();
    AppMethodBeat.o(47230);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_core.ui.WalletCardElementUI.14
 * JD-Core Version:    0.6.2
 */