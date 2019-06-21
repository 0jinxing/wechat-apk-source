package com.bumptech.glide.c.d.f;

import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import com.bumptech.glide.c.b.u;
import com.bumptech.glide.c.d.b.b;
import com.bumptech.glide.c.j;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.ByteArrayOutputStream;

public final class a
  implements e<Bitmap, byte[]>
{
  private final Bitmap.CompressFormat aGp;
  private final int quality;

  public a()
  {
    this(Bitmap.CompressFormat.JPEG);
  }

  private a(Bitmap.CompressFormat paramCompressFormat)
  {
    this.aGp = paramCompressFormat;
    this.quality = 100;
  }

  public final u<byte[]> a(u<Bitmap> paramu, j paramj)
  {
    AppMethodBeat.i(92360);
    paramj = new ByteArrayOutputStream();
    ((Bitmap)paramu.get()).compress(this.aGp, this.quality, paramj);
    paramu.recycle();
    paramu = new b(paramj.toByteArray());
    AppMethodBeat.o(92360);
    return paramu;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.bumptech.glide.c.d.f.a
 * JD-Core Version:    0.6.2
 */