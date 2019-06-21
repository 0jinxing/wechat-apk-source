package com.tencent.mm.plugin.wallet.pay.ui;

import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.widget.a.c;

final class WalletPayUI$25
  implements CompoundButton.OnCheckedChangeListener
{
  WalletPayUI$25(WalletPayUI paramWalletPayUI, c paramc)
  {
  }

  public final void onCheckedChanged(CompoundButton paramCompoundButton, boolean paramBoolean)
  {
    AppMethodBeat.i(46063);
    paramCompoundButton = this.tqn.getButton(-2);
    if (paramBoolean)
    {
      paramCompoundButton.setEnabled(false);
      AppMethodBeat.o(46063);
    }
    while (true)
    {
      return;
      paramCompoundButton.setEnabled(true);
      AppMethodBeat.o(46063);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet.pay.ui.WalletPayUI.25
 * JD-Core Version:    0.6.2
 */