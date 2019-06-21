package com.tencent.mm.plugin.order.ui;

import android.graphics.Bitmap;
import android.widget.ImageView;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class MallOrderProductListUI$b$1
  implements Runnable
{
  MallOrderProductListUI$b$1(MallOrderProductListUI.b paramb, Bitmap paramBitmap)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(43840);
    this.pdY.knb.setImageBitmap(this.val$bmp);
    AppMethodBeat.o(43840);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.order.ui.MallOrderProductListUI.b.1
 * JD-Core Version:    0.6.2
 */