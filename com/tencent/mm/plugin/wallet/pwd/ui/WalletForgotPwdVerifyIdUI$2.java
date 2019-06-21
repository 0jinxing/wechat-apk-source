package com.tencent.mm.plugin.wallet.pwd.ui;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.wallet_core.ui.e;

final class WalletForgotPwdVerifyIdUI$2
  implements View.OnClickListener
{
  WalletForgotPwdVerifyIdUI$2(WalletForgotPwdVerifyIdUI paramWalletForgotPwdVerifyIdUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(46307);
    e.n(this.trW, "https://kf.qq.com/touch/scene_product.html?scene_id=kf3258", false);
    AppMethodBeat.o(46307);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet.pwd.ui.WalletForgotPwdVerifyIdUI.2
 * JD-Core Version:    0.6.2
 */