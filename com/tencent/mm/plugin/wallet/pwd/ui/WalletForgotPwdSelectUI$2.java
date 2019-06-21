package com.tencent.mm.plugin.wallet.pwd.ui;

import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.wallet_core.c;

final class WalletForgotPwdSelectUI$2
  implements View.OnClickListener
{
  WalletForgotPwdSelectUI$2(WalletForgotPwdSelectUI paramWalletForgotPwdSelectUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(46266);
    if (this.trw.dOD() != null)
      h.pYm.e(15774, new Object[] { Integer.valueOf(this.trw.dOD().mqu.getInt("key_forgot_scene", 1)), Integer.valueOf(3) });
    WalletForgotPwdSelectUI.b(this.trw);
    AppMethodBeat.o(46266);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet.pwd.ui.WalletForgotPwdSelectUI.2
 * JD-Core Version:    0.6.2
 */