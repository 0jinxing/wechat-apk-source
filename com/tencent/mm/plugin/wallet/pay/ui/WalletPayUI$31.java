package com.tencent.mm.plugin.wallet.pay.ui;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.CheckedTextView;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class WalletPayUI$31
  implements View.OnClickListener
{
  WalletPayUI$31(WalletPayUI paramWalletPayUI, CheckedTextView paramCheckedTextView1, CheckedTextView paramCheckedTextView2)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(46073);
    this.tqq.setChecked(true);
    this.tqr.setChecked(false);
    WalletPayUI.a(this.tqj, false);
    WalletPayUI.e(this.tqj);
    AppMethodBeat.o(46073);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet.pay.ui.WalletPayUI.31
 * JD-Core Version:    0.6.2
 */