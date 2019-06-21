package com.tencent.mm.plugin.wallet.pay.ui;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.CheckedTextView;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class WalletPayUI$32
  implements View.OnClickListener
{
  WalletPayUI$32(WalletPayUI paramWalletPayUI, CheckedTextView paramCheckedTextView1, CheckedTextView paramCheckedTextView2)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(46074);
    this.tqq.setChecked(false);
    this.tqr.setChecked(true);
    WalletPayUI.a(this.tqj, true);
    WalletPayUI.e(this.tqj);
    AppMethodBeat.o(46074);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet.pay.ui.WalletPayUI.32
 * JD-Core Version:    0.6.2
 */