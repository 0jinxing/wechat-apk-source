package com.tencent.mm.plugin.offline.ui;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.view.MenuItem;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.base.l;
import java.util.HashMap;

final class WalletOfflineCoinPurseUI$30$1$1
  implements Runnable
{
  WalletOfflineCoinPurseUI$30$1$1(WalletOfflineCoinPurseUI.30.1 param1, String paramString, Bitmap paramBitmap)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(43537);
    ab.i("MicroMsg.WalletOfflineCoinPurseUI", "dancy test get picture finish, notifyKey:%s, finalIconUrl:%s", new Object[] { this.paQ, this.paR.paN });
    if (WalletOfflineCoinPurseUI.K(this.paR.paP.pav).containsKey(this.paQ))
    {
      int i = ((Integer)WalletOfflineCoinPurseUI.K(this.paR.paP.pav).get(this.paQ)).intValue();
      if (this.paR.paO.getItem(i) != null)
      {
        this.paR.paO.getItem(i).setIcon(new BitmapDrawable(com.tencent.mm.sdk.platformtools.d.a(this.val$bitmap, this.paR.paP.pav.getResources().getDimensionPixelOffset(2131428760), this.paR.paP.pav.getResources().getDimensionPixelOffset(2131428760), true, false)));
        this.paR.paP.gCw.dKX();
      }
    }
    AppMethodBeat.o(43537);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.offline.ui.WalletOfflineCoinPurseUI.30.1.1
 * JD-Core Version:    0.6.2
 */