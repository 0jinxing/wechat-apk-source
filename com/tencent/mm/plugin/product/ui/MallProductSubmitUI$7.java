package com.tencent.mm.plugin.product.ui;

import android.graphics.Bitmap;
import android.widget.ImageView;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class MallProductSubmitUI$7
  implements Runnable
{
  MallProductSubmitUI$7(MallProductSubmitUI paramMallProductSubmitUI, Bitmap paramBitmap)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(44145);
    MallProductSubmitUI.e(this.pjU).setImageBitmap(this.val$bitmap);
    AppMethodBeat.o(44145);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.product.ui.MallProductSubmitUI.7
 * JD-Core Version:    0.6.2
 */