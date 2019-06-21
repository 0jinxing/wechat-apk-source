package com.tencent.mm.plugin.wallet_core.utils;

import android.graphics.Bitmap;
import android.widget.ImageView;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class a$b$1
  implements Runnable
{
  a$b$1(a.b paramb, ImageView paramImageView, Bitmap paramBitmap)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(47995);
    this.lvs.setImageBitmap(this.val$bitmap);
    AppMethodBeat.o(47995);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_core.utils.a.b.1
 * JD-Core Version:    0.6.2
 */