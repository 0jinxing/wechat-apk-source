package com.tencent.mm.plugin.wallet.balance.ui.lqt;

import android.app.Dialog;
import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.vending.g.d.a;

final class WalletLqtDetailUI$10
  implements d.a
{
  WalletLqtDetailUI$10(WalletLqtDetailUI paramWalletLqtDetailUI)
  {
  }

  public final void bi(Object paramObject)
  {
    AppMethodBeat.i(45534);
    if (WalletLqtDetailUI.a(this.tiH) != null)
      WalletLqtDetailUI.a(this.tiH).dismiss();
    ab.i("MicroMsg.WalletLqtDetailUI", "close account failed: %s", new Object[] { paramObject });
    if (paramObject != null)
      if (!(paramObject instanceof String))
        break label74;
    label74: for (paramObject = paramObject.toString(); ; paramObject = this.tiH.getString(2131304945))
    {
      Toast.makeText(this.tiH, paramObject, 1).show();
      AppMethodBeat.o(45534);
      return;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtDetailUI.10
 * JD-Core Version:    0.6.2
 */