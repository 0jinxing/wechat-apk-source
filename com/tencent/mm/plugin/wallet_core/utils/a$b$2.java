package com.tencent.mm.plugin.wallet_core.utils;

import android.graphics.Bitmap;
import android.widget.ImageView;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class a$b$2
  implements Runnable
{
  a$b$2(a.b paramb, ImageView paramImageView, Bitmap paramBitmap)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(47996);
    this.lvs.setImageBitmap(this.val$bitmap);
    AppMethodBeat.o(47996);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_core.utils.a.b.2
 * JD-Core Version:    0.6.2
 */