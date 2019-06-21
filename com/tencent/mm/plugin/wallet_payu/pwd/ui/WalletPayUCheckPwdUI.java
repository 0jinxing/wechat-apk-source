package com.tencent.mm.plugin.wallet_payu.pwd.ui;

import android.app.Activity;
import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.wallet_core.ui.WalletCheckPwdUI;

@com.tencent.mm.ui.base.a(3)
public class WalletPayUCheckPwdUI extends WalletCheckPwdUI
{
  public final boolean cNR()
  {
    return true;
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(48519);
    super.onCreate(paramBundle);
    com.tencent.mm.wallet_core.ui.formview.a.a(this.nrZ, true);
    AppMethodBeat.o(48519);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_payu.pwd.ui.WalletPayUCheckPwdUI
 * JD-Core Version:    0.6.2
 */