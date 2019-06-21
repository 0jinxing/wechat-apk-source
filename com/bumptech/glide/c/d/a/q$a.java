package com.bumptech.glide.c.d.a;

import android.graphics.Bitmap;
import com.bumptech.glide.c.b.u;
import com.bumptech.glide.h.j;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class q$a
  implements u<Bitmap>
{
  private final Bitmap bitmap;

  q$a(Bitmap paramBitmap)
  {
    this.bitmap = paramBitmap;
  }

  public final int getSize()
  {
    AppMethodBeat.i(92268);
    int i = j.k(this.bitmap);
    AppMethodBeat.o(92268);
    return i;
  }

  public final Class<Bitmap> mK()
  {
    return Bitmap.class;
  }

  public final void recycle()
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.bumptech.glide.c.d.a.q.a
 * JD-Core Version:    0.6.2
 */