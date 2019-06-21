package com.bumptech.glide.c.d.a;

import android.graphics.Bitmap;
import com.bumptech.glide.c.b.a.b;
import com.bumptech.glide.c.b.u;
import com.bumptech.glide.c.j;
import com.bumptech.glide.c.k;
import com.bumptech.glide.h.d;
import com.bumptech.glide.h.g;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.InputStream;

public final class o
  implements k<InputStream, Bitmap>
{
  private final h aEV;
  private final b azx;

  public o(h paramh, b paramb)
  {
    this.aEV = paramh;
    this.azx = paramb;
  }

  private u<Bitmap> a(InputStream paramInputStream, int paramInt1, int paramInt2, j paramj)
  {
    AppMethodBeat.i(92263);
    int i;
    if ((paramInputStream instanceof m))
    {
      paramInputStream = (m)paramInputStream;
      i = 0;
    }
    while (true)
    {
      d locald = d.e(paramInputStream);
      g localg = new g(locald);
      o.a locala = new o.a(paramInputStream, locald);
      try
      {
        paramj = this.aEV.a(localg, paramInt1, paramInt2, paramj, locala);
        return paramj;
        paramInputStream = new m(paramInputStream, this.azx);
        i = 1;
      }
      finally
      {
        locald.release();
        if (i != 0)
          paramInputStream.release();
        AppMethodBeat.o(92263);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.bumptech.glide.c.d.a.o
 * JD-Core Version:    0.6.2
 */