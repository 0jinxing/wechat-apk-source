package com.tencent.mm.plugin.wallet.pwd.ui;

import android.content.Intent;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.wallet_core.ui.d;

final class WalletDigitalCertUI$1 extends d
{
  WalletDigitalCertUI$1(WalletDigitalCertUI paramWalletDigitalCertUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(46251);
    paramView = new Intent();
    paramView.setClass(this.trr, WalletIdCardCheckUI.class);
    this.trr.startActivityForResult(paramView, 1);
    AppMethodBeat.o(46251);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet.pwd.ui.WalletDigitalCertUI.1
 * JD-Core Version:    0.6.2
 */