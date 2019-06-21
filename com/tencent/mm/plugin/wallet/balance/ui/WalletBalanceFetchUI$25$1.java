package com.tencent.mm.plugin.wallet.balance.ui;

import android.graphics.Bitmap;
import android.widget.ImageView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.wallet_core.model.Bankcard;

final class WalletBalanceFetchUI$25$1
  implements Runnable
{
  WalletBalanceFetchUI$25$1(WalletBalanceFetchUI.25 param25, Bitmap paramBitmap)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(45381);
    if ((WalletBalanceFetchUI.b(this.tho.the) != null) && (this.tho.thn != null) && (this.tho.thn.getTag() != null) && (this.tho.thn.getTag().equals(WalletBalanceFetchUI.b(this.tho.the).field_bindSerial)))
      this.tho.thn.setImageBitmap(this.val$bitmap);
    AppMethodBeat.o(45381);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet.balance.ui.WalletBalanceFetchUI.25.1
 * JD-Core Version:    0.6.2
 */