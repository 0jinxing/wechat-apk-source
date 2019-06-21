package com.tencent.mm.plugin.wallet.bind.ui;

import android.content.Intent;
import android.net.Uri;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.base.h.c;

final class WalletBankcardDetailUI$8
  implements h.c
{
  WalletBankcardDetailUI$8(WalletBankcardDetailUI paramWalletBankcardDetailUI)
  {
  }

  public final void iE(int paramInt)
  {
    AppMethodBeat.i(45748);
    switch (paramInt)
    {
    default:
    case 0:
    }
    while (true)
    {
      AppMethodBeat.o(45748);
      return;
      Intent localIntent = new Intent("android.intent.action.DIAL", Uri.parse("tel:" + this.tlK.getString(2131304585)));
      localIntent.addFlags(268435456);
      this.tlK.startActivity(localIntent);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet.bind.ui.WalletBankcardDetailUI.8
 * JD-Core Version:    0.6.2
 */