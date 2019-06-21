package com.tencent.mm.plugin.appbrand.widget.i;

import android.graphics.Bitmap;
import android.widget.ImageView;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class a$4
  implements Runnable
{
  a$4(a parama, ImageView paramImageView, Bitmap paramBitmap)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(87533);
    this.jpj.setImageBitmap(this.val$bitmap);
    AppMethodBeat.o(87533);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.widget.i.a.4
 * JD-Core Version:    0.6.2
 */