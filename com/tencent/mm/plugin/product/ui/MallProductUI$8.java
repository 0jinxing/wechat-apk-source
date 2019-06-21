package com.tencent.mm.plugin.product.ui;

import android.graphics.Bitmap;
import android.widget.ImageView;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class MallProductUI$8
  implements Runnable
{
  MallProductUI$8(MallProductUI paramMallProductUI, Bitmap paramBitmap)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(44165);
    MallProductUI.g(this.pke).setImageBitmap(this.val$bitmap);
    AppMethodBeat.o(44165);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.product.ui.MallProductUI.8
 * JD-Core Version:    0.6.2
 */