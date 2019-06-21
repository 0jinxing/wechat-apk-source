package com.bumptech.glide.c.d.a;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import com.bumptech.glide.c.b.a.e;
import com.bumptech.glide.c.c;
import com.bumptech.glide.c.j;
import com.bumptech.glide.c.l;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class b
  implements l<BitmapDrawable>
{
  private final l<Bitmap> aAN;
  private final e awf;

  public b(e parame, l<Bitmap> paraml)
  {
    this.awf = parame;
    this.aAN = paraml;
  }

  public final c b(j paramj)
  {
    AppMethodBeat.i(92182);
    paramj = this.aAN.b(paramj);
    AppMethodBeat.o(92182);
    return paramj;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.bumptech.glide.c.d.a.b
 * JD-Core Version:    0.6.2
 */