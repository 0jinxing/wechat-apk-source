package com.tencent.mm.plugin.wallet_core.ui.view;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ay;

final class WalletAwardShakeAnimView$3
  implements View.OnClickListener
{
  WalletAwardShakeAnimView$3(WalletAwardShakeAnimView paramWalletAwardShakeAnimView)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(47891);
    if (!WalletAwardShakeAnimView.e(this.tNM))
    {
      WalletAwardShakeAnimView.f(this.tNM);
      ay.au(this.tNM.getContext(), 2131303465);
      WalletAwardShakeAnimView.h(this.tNM);
      if (WalletAwardShakeAnimView.i(this.tNM) != null)
        WalletAwardShakeAnimView.i(this.tNM).ns(false);
    }
    AppMethodBeat.o(47891);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_core.ui.view.WalletAwardShakeAnimView.3
 * JD-Core Version:    0.6.2
 */