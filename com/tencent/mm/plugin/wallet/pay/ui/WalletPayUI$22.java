package com.tencent.mm.plugin.wallet.pay.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.widget.CheckBox;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.storage.z;

final class WalletPayUI$22
  implements DialogInterface.OnClickListener
{
  WalletPayUI$22(WalletPayUI paramWalletPayUI, CheckBox paramCheckBox)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(46060);
    if (this.tqm.isChecked())
    {
      g.RQ();
      g.RP().Ry().set(196614, Boolean.FALSE);
    }
    this.tqj.mY(false);
    AppMethodBeat.o(46060);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet.pay.ui.WalletPayUI.22
 * JD-Core Version:    0.6.2
 */