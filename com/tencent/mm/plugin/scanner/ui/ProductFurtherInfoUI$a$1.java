package com.tencent.mm.plugin.scanner.ui;

import android.graphics.Bitmap;
import android.widget.ImageView;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class ProductFurtherInfoUI$a$1
  implements Runnable
{
  ProductFurtherInfoUI$a$1(ProductFurtherInfoUI.a parama, ImageView paramImageView, Bitmap paramBitmap)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(81048);
    this.lvs.setImageBitmap(this.val$bitmap);
    this.lvs.setBackgroundColor(0);
    AppMethodBeat.o(81048);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.scanner.ui.ProductFurtherInfoUI.a.1
 * JD-Core Version:    0.6.2
 */