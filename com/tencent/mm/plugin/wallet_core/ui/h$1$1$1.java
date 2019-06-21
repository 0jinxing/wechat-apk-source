package com.tencent.mm.plugin.wallet_core.ui;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.view.MenuItem;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.ui.base.l;
import java.util.HashMap;

final class h$1$1$1
  implements Runnable
{
  h$1$1$1(h.1.1 param1, String paramString, Bitmap paramBitmap)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(47154);
    ab.i("MicroMsg.WalletBankcardBottomSheetHelper", "dancy test get picture finish, notifyKey:%s, finalIconUrl:%s", new Object[] { this.paQ, this.tEo.tEm });
    if (this.tEo.tEn.tEh.containsKey(this.paQ))
    {
      int i = ((Integer)this.tEo.tEn.tEh.get(this.paQ)).intValue();
      if (this.tEo.paO.getItem(i) != null)
      {
        this.tEo.paO.getItem(i).setIcon(new BitmapDrawable(com.tencent.mm.sdk.platformtools.d.a(this.val$bitmap, ah.getResources().getDimensionPixelOffset(2131428760), ah.getResources().getDimensionPixelOffset(2131428760), true, false)));
        this.tEo.tEn.tEi.dKX();
      }
    }
    AppMethodBeat.o(47154);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_core.ui.h.1.1.1
 * JD-Core Version:    0.6.2
 */