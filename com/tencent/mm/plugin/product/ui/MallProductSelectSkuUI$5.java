package com.tencent.mm.plugin.product.ui;

import android.graphics.Bitmap;
import android.widget.ImageView;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class MallProductSelectSkuUI$5
  implements Runnable
{
  MallProductSelectSkuUI$5(MallProductSelectSkuUI paramMallProductSelectSkuUI, Bitmap paramBitmap)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(44110);
    MallProductSelectSkuUI.e(this.pju).setImageBitmap(this.val$bitmap);
    AppMethodBeat.o(44110);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.product.ui.MallProductSelectSkuUI.5
 * JD-Core Version:    0.6.2
 */