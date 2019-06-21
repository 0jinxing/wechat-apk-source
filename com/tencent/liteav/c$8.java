package com.tencent.liteav;

import android.graphics.Bitmap;
import com.tencent.liteav.basic.e.n;
import com.tencent.matrix.trace.core.AppMethodBeat;

class c$8
  implements n
{
  c$8(c paramc, n paramn)
  {
  }

  public void onTakePhotoComplete(Bitmap paramBitmap)
  {
    AppMethodBeat.i(66386);
    if (this.a != null)
      this.a.onTakePhotoComplete(paramBitmap);
    AppMethodBeat.o(66386);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.liteav.c.8
 * JD-Core Version:    0.6.2
 */