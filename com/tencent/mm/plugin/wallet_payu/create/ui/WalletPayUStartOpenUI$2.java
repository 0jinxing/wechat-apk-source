package com.tencent.mm.plugin.wallet_payu.create.ui;

import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.base.MMFormMobileInputView;
import com.tencent.mm.wallet_core.d.g;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;

final class WalletPayUStartOpenUI$2
  implements View.OnClickListener
{
  WalletPayUStartOpenUI$2(WalletPayUStartOpenUI paramWalletPayUStartOpenUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(48396);
    if (WalletPayUStartOpenUI.b(this.tTw).getVisibility() == 0)
    {
      this.tTw.mBundle.putString("key_mobile", WalletPayUStartOpenUI.c(this.tTw));
      this.tTw.mBundle.putString("dial_code", WalletPayUStartOpenUI.d(this.tTw));
    }
    this.tTw.dOE().p(new Object[0]);
    AppMethodBeat.o(48396);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_payu.create.ui.WalletPayUStartOpenUI.2
 * JD-Core Version:    0.6.2
 */