package com.tencent.mm.plugin.wallet.pwd.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.wallet.pwd.a.p;
import com.tencent.mm.plugin.wallet_core.c.r;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;
import com.tencent.mm.wallet_core.ui.formview.EditHintPasswdView;
import com.tencent.mm.wallet_core.ui.formview.EditHintPasswdView.a;

final class WalletLockCheckPwdUI$3
  implements EditHintPasswdView.a
{
  WalletLockCheckPwdUI$3(WalletLockCheckPwdUI paramWalletLockCheckPwdUI)
  {
  }

  public final void hY(boolean paramBoolean)
  {
    int i = -1;
    AppMethodBeat.i(46339);
    if (paramBoolean)
      if (WalletLockCheckPwdUI.b(this.tsf) == null)
        AppMethodBeat.o(46339);
    while (true)
    {
      return;
      if (WalletLockCheckPwdUI.b(this.tsf).equals("action.close_wallet_lock"))
      {
        WalletLockCheckPwdUI.c(this.tsf);
        AppMethodBeat.o(46339);
      }
      else
      {
        if (WalletLockCheckPwdUI.b(this.tsf).equals("action.verify_paypwd"))
        {
          if (WalletLockCheckPwdUI.d(this.tsf) == 1)
            i = 6;
          while (true)
          {
            WalletLockCheckPwdUI.a(this.tsf, new r(WalletLockCheckPwdUI.e(this.tsf).getText(), i, this.tsf.cNH()));
            this.tsf.a(WalletLockCheckPwdUI.f(this.tsf), true, false);
            AppMethodBeat.o(46339);
            break;
            if (WalletLockCheckPwdUI.d(this.tsf) == 2)
              i = 8;
          }
        }
        if (WalletLockCheckPwdUI.b(this.tsf).equals("action.touchlock_verify_by_paypwd"))
        {
          p localp = new p(WalletLockCheckPwdUI.e(this.tsf).getText());
          this.tsf.a(localp, true, false);
          AppMethodBeat.o(46339);
        }
        else
        {
          if (WalletLockCheckPwdUI.b(this.tsf).equals("action.touchlock_need_verify_paypwd"))
          {
            if (WalletLockCheckPwdUI.d(this.tsf) == 2)
              i = 8;
            WalletLockCheckPwdUI.a(this.tsf, new r(WalletLockCheckPwdUI.e(this.tsf).getText(), i, this.tsf.cNH()));
            this.tsf.a(WalletLockCheckPwdUI.f(this.tsf), true, false);
          }
          AppMethodBeat.o(46339);
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet.pwd.ui.WalletLockCheckPwdUI.3
 * JD-Core Version:    0.6.2
 */