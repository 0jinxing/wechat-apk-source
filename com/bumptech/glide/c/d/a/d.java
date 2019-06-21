package com.bumptech.glide.c.d.a;

import android.graphics.Bitmap;
import com.bumptech.glide.c.b.a.e;
import com.bumptech.glide.c.b.q;
import com.bumptech.glide.c.b.u;
import com.bumptech.glide.h.i;
import com.bumptech.glide.h.j;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class d
  implements q, u<Bitmap>
{
  private final e awf;
  private final Bitmap bitmap;

  public d(Bitmap paramBitmap, e parame)
  {
    AppMethodBeat.i(92188);
    this.bitmap = ((Bitmap)i.d(paramBitmap, "Bitmap must not be null"));
    this.awf = ((e)i.d(parame, "BitmapPool must not be null"));
    AppMethodBeat.o(92188);
  }

  public static d a(Bitmap paramBitmap, e parame)
  {
    AppMethodBeat.i(92187);
    if (paramBitmap == null)
    {
      paramBitmap = null;
      AppMethodBeat.o(92187);
    }
    while (true)
    {
      return paramBitmap;
      paramBitmap = new d(paramBitmap, parame);
      AppMethodBeat.o(92187);
    }
  }

  public final int getSize()
  {
    AppMethodBeat.i(92189);
    int i = j.k(this.bitmap);
    AppMethodBeat.o(92189);
    return i;
  }

  public final void initialize()
  {
    AppMethodBeat.i(92191);
    this.bitmap.prepareToDraw();
    AppMethodBeat.o(92191);
  }

  public final Class<Bitmap> mK()
  {
    return Bitmap.class;
  }

  public final void recycle()
  {
    AppMethodBeat.i(92190);
    this.awf.g(this.bitmap);
    AppMethodBeat.o(92190);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.bumptech.glide.c.d.a.d
 * JD-Core Version:    0.6.2
 */