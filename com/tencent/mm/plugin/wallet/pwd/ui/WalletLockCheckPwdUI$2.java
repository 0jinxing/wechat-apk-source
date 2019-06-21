package com.tencent.mm.plugin.wallet.pwd.ui;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class WalletLockCheckPwdUI$2
  implements View.OnClickListener
{
  WalletLockCheckPwdUI$2(WalletLockCheckPwdUI paramWalletLockCheckPwdUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(46338);
    ab.i("MicroMsg.WalletLockCheckPwdUI", "alvinluo cancel by BackBtn");
    WalletLockCheckPwdUI.a(this.tsf);
    AppMethodBeat.o(46338);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet.pwd.ui.WalletLockCheckPwdUI.2
 * JD-Core Version:    0.6.2
 */