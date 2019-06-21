package com.tencent.mm.plugin.wallet_core.ui;

import android.widget.ScrollView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.wallet_core.ui.a;

final class WalletPwdConfirmUI$4
  implements a
{
  WalletPwdConfirmUI$4(WalletPwdConfirmUI paramWalletPwdConfirmUI, ScrollView paramScrollView)
  {
  }

  public final void ic(boolean paramBoolean)
  {
    AppMethodBeat.i(47541);
    if (paramBoolean)
    {
      WalletPwdConfirmUI.a(this.tJx, this.tJy, WalletPwdConfirmUI.b(this.tJx));
      AppMethodBeat.o(47541);
    }
    while (true)
    {
      return;
      this.tJy.scrollTo(0, 0);
      AppMethodBeat.o(47541);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_core.ui.WalletPwdConfirmUI.4
 * JD-Core Version:    0.6.2
 */