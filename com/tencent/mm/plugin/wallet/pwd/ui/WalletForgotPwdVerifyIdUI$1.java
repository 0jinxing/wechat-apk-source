package com.tencent.mm.plugin.wallet.pwd.ui;

import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.wallet_core.model.ak;
import com.tencent.mm.plugin.wallet_core.model.r;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.widget.MMEditText;
import com.tencent.mm.wallet_core.c;
import com.tencent.mm.wallet_core.d.g;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;
import com.tencent.mm.wallet_core.ui.formview.WalletFormView;

final class WalletForgotPwdVerifyIdUI$1
  implements View.OnClickListener
{
  WalletForgotPwdVerifyIdUI$1(WalletForgotPwdVerifyIdUI paramWalletForgotPwdVerifyIdUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(46306);
    String str = WalletForgotPwdVerifyIdUI.a(this.trW).getText();
    int i = r.cPI().cQq();
    paramView = WalletForgotPwdVerifyIdUI.b(this.trW).getText().toString();
    if ((!bo.isNullOrNil(str)) && (!bo.isNullOrNil(paramView)))
    {
      this.trW.mBundle.putString("key_identity", str);
      this.trW.mBundle.putInt("key_id_type", i);
      this.trW.mBundle.putString("key_true_name", paramView);
      if (this.trW.dOD() != null)
      {
        this.trW.dOD().mqu.putString("key_identity", str);
        this.trW.dOD().mqu.putInt("key_id_type", i);
        this.trW.dOD().mqu.putString("key_true_name", paramView);
      }
      this.trW.dOE().p(new Object[] { str, Integer.valueOf(i), paramView });
    }
    AppMethodBeat.o(46306);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet.pwd.ui.WalletForgotPwdVerifyIdUI.1
 * JD-Core Version:    0.6.2
 */