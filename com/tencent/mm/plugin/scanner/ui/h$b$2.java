package com.tencent.mm.plugin.scanner.ui;

import android.graphics.Bitmap;
import android.widget.ImageView;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class h$b$2
  implements Runnable
{
  h$b$2(h.b paramb, ImageView paramImageView, Bitmap paramBitmap)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(81062);
    this.lvs.setImageBitmap(this.val$bitmap);
    this.lvs.setBackgroundColor(0);
    AppMethodBeat.o(81062);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.scanner.ui.h.b.2
 * JD-Core Version:    0.6.2
 */