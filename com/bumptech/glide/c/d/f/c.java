package com.bumptech.glide.c.d.f;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.c.b.u;
import com.bumptech.glide.c.d.a.d;
import com.bumptech.glide.c.j;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class c
  implements e<Drawable, byte[]>
{
  private final e<Bitmap, byte[]> aGq;
  private final e<com.bumptech.glide.c.d.e.c, byte[]> aGr;
  private final com.bumptech.glide.c.b.a.e awf;

  public c(com.bumptech.glide.c.b.a.e parame, e<Bitmap, byte[]> parame1, e<com.bumptech.glide.c.d.e.c, byte[]> parame2)
  {
    this.awf = parame;
    this.aGq = parame1;
    this.aGr = parame2;
  }

  public final u<byte[]> a(u<Drawable> paramu, j paramj)
  {
    AppMethodBeat.i(92363);
    Drawable localDrawable = (Drawable)paramu.get();
    if ((localDrawable instanceof BitmapDrawable))
    {
      paramu = this.aGq.a(d.a(((BitmapDrawable)localDrawable).getBitmap(), this.awf), paramj);
      AppMethodBeat.o(92363);
    }
    while (true)
    {
      return paramu;
      if ((localDrawable instanceof com.bumptech.glide.c.d.e.c))
      {
        paramu = this.aGr.a(paramu, paramj);
        AppMethodBeat.o(92363);
      }
      else
      {
        paramu = null;
        AppMethodBeat.o(92363);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.bumptech.glide.c.d.f.c
 * JD-Core Version:    0.6.2
 */