package com.tencent.mm.plugin.wallet_core.ui.view;

import android.graphics.Bitmap;
import android.graphics.NinePatch;
import android.graphics.drawable.NinePatchDrawable;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.at.a.c.i;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bo;
import d.a.a.g;

final class WalletSuccPageAwardWidget$8
  implements i
{
  WalletSuccPageAwardWidget$8(WalletSuccPageAwardWidget paramWalletSuccPageAwardWidget)
  {
  }

  public final void a(String paramString, View paramView, Bitmap paramBitmap, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(47950);
    ab.i("MicroMsg.WalletSuccPageAwardWidget", "load background_img finish, url: %s, bitmap: %s", new Object[] { paramString, paramBitmap });
    if ((paramBitmap != null) && (WalletSuccPageAwardWidget.h(this.tOK) != null) && (!bo.isNullOrNil(WalletSuccPageAwardWidget.h(this.tOK).BTR)) && (WalletSuccPageAwardWidget.h(this.tOK).BTR.equals(paramString)))
    {
      paramString = new NinePatch(paramBitmap, WalletSuccPageAwardWidget.ac(paramBitmap), "widget_bg");
      al.d(new WalletSuccPageAwardWidget.8.1(this, new NinePatchDrawable(this.tOK.getResources(), paramString)));
    }
    AppMethodBeat.o(47950);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_core.ui.view.WalletSuccPageAwardWidget.8
 * JD-Core Version:    0.6.2
 */