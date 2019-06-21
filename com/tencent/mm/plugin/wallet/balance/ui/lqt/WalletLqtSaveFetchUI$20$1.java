package com.tencent.mm.plugin.wallet.balance.ui.lqt;

import android.graphics.Bitmap;
import android.widget.ImageView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.wallet_core.model.Bankcard;

final class WalletLqtSaveFetchUI$20$1
  implements Runnable
{
  WalletLqtSaveFetchUI$20$1(WalletLqtSaveFetchUI.20 param20, Bitmap paramBitmap)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(45670);
    if ((WalletLqtSaveFetchUI.d(this.tkY.tkP) != null) && (WalletLqtSaveFetchUI.e(this.tkY.tkP) != null) && (WalletLqtSaveFetchUI.e(this.tkY.tkP).getTag() != null) && (WalletLqtSaveFetchUI.e(this.tkY.tkP).getTag().equals(WalletLqtSaveFetchUI.d(this.tkY.tkP).field_bindSerial)))
      WalletLqtSaveFetchUI.e(this.tkY.tkP).setImageBitmap(this.val$bitmap);
    AppMethodBeat.o(45670);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtSaveFetchUI.20.1
 * JD-Core Version:    0.6.2
 */