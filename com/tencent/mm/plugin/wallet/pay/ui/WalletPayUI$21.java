package com.tencent.mm.plugin.wallet.pay.ui;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.CheckBox;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class WalletPayUI$21
  implements View.OnClickListener
{
  WalletPayUI$21(WalletPayUI paramWalletPayUI, CheckBox paramCheckBox)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(46059);
    paramView = this.tqm;
    if (!this.tqm.isChecked());
    for (boolean bool = true; ; bool = false)
    {
      paramView.setChecked(bool);
      AppMethodBeat.o(46059);
      return;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet.pay.ui.WalletPayUI.21
 * JD-Core Version:    0.6.2
 */