package com.tencent.mm.plugin.wallet_core.ui.view;

import android.graphics.Bitmap;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.at.a.c.i;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bo;
import d.a.a.c;

final class WalletSuccPageAwardWidget$11
  implements i
{
  WalletSuccPageAwardWidget$11(WalletSuccPageAwardWidget paramWalletSuccPageAwardWidget)
  {
  }

  public final void a(String paramString, View paramView, Bitmap paramBitmap, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(47956);
    ab.i("MicroMsg.WalletSuccPageAwardWidget", "load background_img_whole finish, url: %s, bitmap: %s", new Object[] { paramString, paramBitmap });
    if ((paramBitmap != null) && (WalletSuccPageAwardWidget.j(this.tOK) != null) && (!bo.isNullOrNil(WalletSuccPageAwardWidget.j(this.tOK).BTE)) && (WalletSuccPageAwardWidget.j(this.tOK).BTE.equals(paramString)))
      al.d(new WalletSuccPageAwardWidget.11.1(this, paramBitmap));
    AppMethodBeat.o(47956);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_core.ui.view.WalletSuccPageAwardWidget.11
 * JD-Core Version:    0.6.2
 */