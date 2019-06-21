package com.tencent.mm.plugin.wallet.balance.ui;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.view.MenuItem;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.base.l;
import java.util.HashMap;

final class WalletBalanceSaveUI$4$1$1
  implements Runnable
{
  WalletBalanceSaveUI$4$1$1(WalletBalanceSaveUI.4.1 param1, String paramString, Bitmap paramBitmap)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(45472);
    ab.i("MicroMsg.WalletBalanceSaveUI", "dancy test get picture finish, notifyKey:%s, finalIconUrl:%s", new Object[] { this.paQ, this.thO.paN });
    if (WalletBalanceSaveUI.d(this.thO.thN.thL).containsKey(this.paQ))
    {
      int i = ((Integer)WalletBalanceSaveUI.d(this.thO.thN.thL).get(this.paQ)).intValue();
      if (this.thO.paO.getItem(i) != null)
      {
        this.thO.paO.getItem(i).setIcon(new BitmapDrawable(com.tencent.mm.sdk.platformtools.d.a(this.val$bitmap, this.thO.thN.thL.getResources().getDimensionPixelOffset(2131428760), this.thO.thN.thL.getResources().getDimensionPixelOffset(2131428760), true, false)));
        this.thO.thN.thM.dKX();
      }
    }
    AppMethodBeat.o(45472);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet.balance.ui.WalletBalanceSaveUI.4.1.1
 * JD-Core Version:    0.6.2
 */