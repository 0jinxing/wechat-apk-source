package com.tencent.mm.plugin.wallet_payu.pwd.ui;

import android.app.Activity;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.wallet.pwd.ui.WalletPasswordSettingUI;
import com.tencent.mm.plugin.wallet_payu.pwd.a.g;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.base.preference.MMPreference;
import com.tencent.mm.wallet_core.a;

public class WalletPayUPasswordSettingUI extends WalletPasswordSettingUI
{
  public final int cOF()
  {
    return 2131165315;
  }

  public final void cOG()
  {
    AppMethodBeat.i(48521);
    ab.d("MicroMsg.WalletPayUPasswordSettingUI", "hy: start payu reset pwd");
    a.a(this, g.class, null);
    AppMethodBeat.o(48521);
  }

  public final void cOH()
  {
    AppMethodBeat.i(48520);
    ab.d("MicroMsg.WalletPayUPasswordSettingUI", "hy: start payu do forgot pwd");
    a.a(this, com.tencent.mm.plugin.wallet_payu.pwd.a.f.class, null);
    AppMethodBeat.o(48520);
  }

  public final void cOI()
  {
    AppMethodBeat.i(48522);
    this.yCw.ce("wallet_modify_gesture_password", true);
    this.yCw.ce("wallet_open_gesture_password", true);
    AppMethodBeat.o(48522);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_payu.pwd.ui.WalletPayUPasswordSettingUI
 * JD-Core Version:    0.6.2
 */