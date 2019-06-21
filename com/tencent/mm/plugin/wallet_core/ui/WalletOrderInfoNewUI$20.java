package com.tencent.mm.plugin.wallet_core.ui;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.CheckBox;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.Set;

final class WalletOrderInfoNewUI$20
  implements View.OnClickListener
{
  WalletOrderInfoNewUI$20(WalletOrderInfoNewUI paramWalletOrderInfoNewUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(47446);
    if (!bo.isNullOrNil(WalletOrderInfoNewUI.k(this.tIz)))
      if (this.tIz.tIc.contains(WalletOrderInfoNewUI.k(this.tIz)))
      {
        this.tIz.tIc.remove(WalletOrderInfoNewUI.k(this.tIz));
        WalletOrderInfoNewUI.l(this.tIz).setChecked(false);
        AppMethodBeat.o(47446);
      }
    while (true)
    {
      return;
      this.tIz.tIc.add(WalletOrderInfoNewUI.k(this.tIz));
      WalletOrderInfoNewUI.l(this.tIz).setChecked(true);
      AppMethodBeat.o(47446);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_core.ui.WalletOrderInfoNewUI.20
 * JD-Core Version:    0.6.2
 */