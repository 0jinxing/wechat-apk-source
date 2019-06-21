package com.bumptech.glide.c.b.a;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import com.bumptech.glide.h.j;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class c
  implements l
{
  private final c.b aCq;
  private final h<c.a, Bitmap> aCr;

  c()
  {
    AppMethodBeat.i(91902);
    this.aCq = new c.b();
    this.aCr = new h();
    AppMethodBeat.o(91902);
  }

  static String e(int paramInt1, int paramInt2, Bitmap.Config paramConfig)
  {
    AppMethodBeat.i(91910);
    paramConfig = "[" + paramInt1 + "x" + paramInt2 + "], " + paramConfig;
    AppMethodBeat.o(91910);
    return paramConfig;
  }

  public final Bitmap c(int paramInt1, int paramInt2, Bitmap.Config paramConfig)
  {
    AppMethodBeat.i(91904);
    paramConfig = this.aCq.g(paramInt1, paramInt2, paramConfig);
    paramConfig = (Bitmap)this.aCr.b(paramConfig);
    AppMethodBeat.o(91904);
    return paramConfig;
  }

  public final String d(int paramInt1, int paramInt2, Bitmap.Config paramConfig)
  {
    AppMethodBeat.i(91907);
    paramConfig = e(paramInt1, paramInt2, paramConfig);
    AppMethodBeat.o(91907);
    return paramConfig;
  }

  public final void g(Bitmap paramBitmap)
  {
    AppMethodBeat.i(91903);
    c.a locala = this.aCq.g(paramBitmap.getWidth(), paramBitmap.getHeight(), paramBitmap.getConfig());
    this.aCr.a(locala, paramBitmap);
    AppMethodBeat.o(91903);
  }

  public final String h(Bitmap paramBitmap)
  {
    AppMethodBeat.i(91906);
    paramBitmap = e(paramBitmap.getWidth(), paramBitmap.getHeight(), paramBitmap.getConfig());
    AppMethodBeat.o(91906);
    return paramBitmap;
  }

  public final int i(Bitmap paramBitmap)
  {
    AppMethodBeat.i(91908);
    int i = j.k(paramBitmap);
    AppMethodBeat.o(91908);
    return i;
  }

  public final Bitmap mP()
  {
    AppMethodBeat.i(91905);
    Bitmap localBitmap = (Bitmap)this.aCr.removeLast();
    AppMethodBeat.o(91905);
    return localBitmap;
  }

  public final String toString()
  {
    AppMethodBeat.i(91909);
    String str = "AttributeStrategy:\n  " + this.aCr;
    AppMethodBeat.o(91909);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.bumptech.glide.c.b.a.c
 * JD-Core Version:    0.6.2
 */