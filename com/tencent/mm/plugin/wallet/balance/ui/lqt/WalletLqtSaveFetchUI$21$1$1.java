package com.tencent.mm.plugin.wallet.balance.ui.lqt;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.view.MenuItem;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.base.l;
import java.util.HashMap;

final class WalletLqtSaveFetchUI$21$1$1
  implements Runnable
{
  WalletLqtSaveFetchUI$21$1$1(WalletLqtSaveFetchUI.21.1 param1, String paramString, Bitmap paramBitmap)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(45672);
    ab.i("MicroMsg.WalletLqtSaveFetchUI", "dancy test get picture finish, notifyKey:%s, finalIconUrl:%s", new Object[] { this.paQ, this.tla.paN });
    if (WalletLqtSaveFetchUI.g(this.tla.tkZ.tkP).containsKey(this.paQ))
    {
      int i = ((Integer)WalletLqtSaveFetchUI.g(this.tla.tkZ.tkP).get(this.paQ)).intValue();
      if (this.tla.paO.getItem(i) != null)
      {
        this.tla.paO.getItem(i).setIcon(new BitmapDrawable(com.tencent.mm.sdk.platformtools.d.a(this.val$bitmap, this.tla.tkZ.tkP.getResources().getDimensionPixelOffset(2131428760), this.tla.tkZ.tkP.getResources().getDimensionPixelOffset(2131428760), true, false)));
        this.tla.tkZ.gCw.dKX();
      }
    }
    AppMethodBeat.o(45672);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtSaveFetchUI.21.1.1
 * JD-Core Version:    0.6.2
 */