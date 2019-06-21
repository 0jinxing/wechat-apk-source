package com.tencent.mm.plugin.wallet.balance.ui.lqt;

import android.graphics.Bitmap;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.platformtools.x.a;
import com.tencent.mm.plugin.wallet_core.model.Bankcard;
import com.tencent.mm.sdk.platformtools.al;

final class WalletLqtPlanAddUI$8
  implements x.a
{
  WalletLqtPlanAddUI$8(WalletLqtPlanAddUI paramWalletLqtPlanAddUI, Bankcard paramBankcard)
  {
  }

  public final void m(String paramString, Bitmap paramBitmap)
  {
    AppMethodBeat.i(45566);
    al.d(new WalletLqtPlanAddUI.8.1(this, paramBitmap));
    AppMethodBeat.o(45566);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtPlanAddUI.8
 * JD-Core Version:    0.6.2
 */