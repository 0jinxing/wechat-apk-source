package com.tencent.mm.plugin.wallet.pwd.ui;

import android.app.Activity;
import com.tencent.matrix.trace.core.AppMethodBeat;

public class WalletForgotPwdBindNewUI extends WalletForgotPwdUI
{
  public final boolean cNR()
  {
    return false;
  }

  public final void initView()
  {
    AppMethodBeat.i(46264);
    super.initView();
    AppMethodBeat.o(46264);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet.pwd.ui.WalletForgotPwdBindNewUI
 * JD-Core Version:    0.6.2
 */