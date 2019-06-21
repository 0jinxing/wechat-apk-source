package com.tencent.mm.ui.chatting.gallery;

import android.graphics.Bitmap;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;

final class f$5
  implements Runnable
{
  f$5(f paramf, int paramInt)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(32139);
    if (f.b(this.yVu) == null)
    {
      ab.e("MicroMsg.ImageGalleryLazyLoader", "loader is null!");
      AppMethodBeat.o(32139);
    }
    while (true)
    {
      return;
      Bitmap localBitmap = f.b(this.yVu).OY(this.sN);
      if (localBitmap == null)
      {
        AppMethodBeat.o(32139);
      }
      else
      {
        f.c(this.yVu).post(new f.5.1(this, localBitmap));
        AppMethodBeat.o(32139);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.gallery.f.5
 * JD-Core Version:    0.6.2
 */