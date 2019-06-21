package com.tencent.mm.plugin.offline.ui;

import android.graphics.Bitmap;
import android.widget.ImageView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.d;

final class WalletOfflineCoinPurseUI$19
  implements Runnable
{
  WalletOfflineCoinPurseUI$19(WalletOfflineCoinPurseUI paramWalletOfflineCoinPurseUI, Integer paramInteger, Bitmap paramBitmap, ImageView paramImageView)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(43525);
    int i = this.paL.intValue();
    Bitmap localBitmap = d.a(this.val$bitmap, i, i, true, false);
    this.krP.setImageBitmap(localBitmap);
    AppMethodBeat.o(43525);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.offline.ui.WalletOfflineCoinPurseUI.19
 * JD-Core Version:    0.6.2
 */