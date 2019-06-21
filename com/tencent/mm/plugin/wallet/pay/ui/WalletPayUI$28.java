package com.tencent.mm.plugin.wallet.pay.ui;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class WalletPayUI$28
  implements View.OnClickListener
{
  WalletPayUI$28(WalletPayUI paramWalletPayUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(46066);
    if (this.tqj.tpB)
      this.tqj.tpK.setImageResource(2130839776);
    for (this.tqj.tpB = false; ; this.tqj.tpB = true)
    {
      this.tqj.tpO.notifyDataSetChanged();
      AppMethodBeat.o(46066);
      return;
      this.tqj.tpK.setImageResource(2130839779);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet.pay.ui.WalletPayUI.28
 * JD-Core Version:    0.6.2
 */