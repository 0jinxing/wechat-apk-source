package com.tencent.mm.plugin.wallet_core.ui;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.wallet_core.model.Bankcard;
import com.tencent.mm.ui.base.h;

final class WalletVerifyCodeUI$6
  implements View.OnClickListener
{
  WalletVerifyCodeUI$6(WalletVerifyCodeUI paramWalletVerifyCodeUI, Bankcard paramBankcard)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(47695);
    h.d(this.tLn, this.tLn.getString(2131305201, new Object[] { this.tgn.field_desc, this.tgn.field_mobile }), "", this.tLn.getString(2131305200), this.tLn.getString(2131296868), new WalletVerifyCodeUI.6.1(this), null);
    AppMethodBeat.o(47695);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_core.ui.WalletVerifyCodeUI.6
 * JD-Core Version:    0.6.2
 */