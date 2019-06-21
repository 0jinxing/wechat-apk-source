package com.tencent.mm.plugin.wallet_core.ui;

import android.content.Intent;
import android.net.Uri;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.base.h.c;

final class WalletOrderInfoOldUI$9
  implements h.c
{
  WalletOrderInfoOldUI$9(WalletOrderInfoOldUI paramWalletOrderInfoOldUI)
  {
  }

  public final void iE(int paramInt)
  {
    AppMethodBeat.i(47482);
    switch (paramInt)
    {
    default:
    case 0:
    }
    while (true)
    {
      AppMethodBeat.o(47482);
      return;
      WalletOrderInfoOldUI.a(this.tIW, false);
      Intent localIntent = new Intent("android.intent.action.DIAL", Uri.parse("tel:" + this.tIW.pdC));
      localIntent.addFlags(268435456);
      this.tIW.startActivity(localIntent);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_core.ui.WalletOrderInfoOldUI.9
 * JD-Core Version:    0.6.2
 */