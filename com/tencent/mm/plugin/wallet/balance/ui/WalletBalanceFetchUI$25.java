package com.tencent.mm.plugin.wallet.balance.ui;

import android.graphics.Bitmap;
import android.widget.ImageView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.platformtools.x.a;
import com.tencent.mm.sdk.platformtools.al;

final class WalletBalanceFetchUI$25
  implements x.a
{
  WalletBalanceFetchUI$25(WalletBalanceFetchUI paramWalletBalanceFetchUI, ImageView paramImageView)
  {
  }

  public final void m(String paramString, Bitmap paramBitmap)
  {
    AppMethodBeat.i(45382);
    al.d(new WalletBalanceFetchUI.25.1(this, paramBitmap));
    AppMethodBeat.o(45382);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet.balance.ui.WalletBalanceFetchUI.25
 * JD-Core Version:    0.6.2
 */