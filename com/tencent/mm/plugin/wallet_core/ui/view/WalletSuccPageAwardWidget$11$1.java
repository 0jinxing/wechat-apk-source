package com.tencent.mm.plugin.wallet_core.ui.view;

import android.graphics.Bitmap;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class WalletSuccPageAwardWidget$11$1
  implements Runnable
{
  WalletSuccPageAwardWidget$11$1(WalletSuccPageAwardWidget.11 param11, Bitmap paramBitmap)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(47955);
    WalletSuccPageAwardWidget.u(this.tOP.tOK).setScaleType(ImageView.ScaleType.CENTER_CROP);
    WalletSuccPageAwardWidget.u(this.tOP.tOK).setImageBitmap(this.val$bitmap);
    AppMethodBeat.o(47955);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_core.ui.view.WalletSuccPageAwardWidget.11.1
 * JD-Core Version:    0.6.2
 */