package com.tencent.mm.plugin.wallet.balance.ui;

import android.graphics.Bitmap;
import android.widget.ImageView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.wallet_core.model.Bankcard;

final class WalletBalanceSaveUI$7$1
  implements Runnable
{
  WalletBalanceSaveUI$7$1(WalletBalanceSaveUI.7 param7, Bitmap paramBitmap)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(45477);
    if ((this.thP.thL.tgC != null) && (this.thP.thn != null) && (this.thP.thn.getTag() != null) && (this.thP.thn.getTag().equals(this.thP.thL.tgC.field_bindSerial)))
      this.thP.thn.setImageBitmap(this.val$bitmap);
    AppMethodBeat.o(45477);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet.balance.ui.WalletBalanceSaveUI.7.1
 * JD-Core Version:    0.6.2
 */