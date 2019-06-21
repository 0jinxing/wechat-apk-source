package com.bumptech.glide.c.d.e;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import com.bumptech.glide.b.a.a;
import com.bumptech.glide.c.b.a.e;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class b
  implements a.a
{
  private final e awf;
  private final com.bumptech.glide.c.b.a.b awk;

  public b(e parame, com.bumptech.glide.c.b.a.b paramb)
  {
    this.awf = parame;
    this.awk = paramb;
  }

  public final Bitmap b(int paramInt1, int paramInt2, Bitmap.Config paramConfig)
  {
    AppMethodBeat.i(92307);
    paramConfig = this.awf.h(paramInt1, paramInt2, paramConfig);
    AppMethodBeat.o(92307);
    return paramConfig;
  }

  public final byte[] da(int paramInt)
  {
    AppMethodBeat.i(92309);
    byte[] arrayOfByte;
    if (this.awk == null)
    {
      arrayOfByte = new byte[paramInt];
      AppMethodBeat.o(92309);
    }
    while (true)
    {
      return arrayOfByte;
      arrayOfByte = (byte[])this.awk.a(paramInt, [B.class);
      AppMethodBeat.o(92309);
    }
  }

  public final int[] db(int paramInt)
  {
    AppMethodBeat.i(92311);
    int[] arrayOfInt;
    if (this.awk == null)
    {
      arrayOfInt = new int[paramInt];
      AppMethodBeat.o(92311);
    }
    while (true)
    {
      return arrayOfInt;
      arrayOfInt = (int[])this.awk.a(paramInt, [I.class);
      AppMethodBeat.o(92311);
    }
  }

  public final void f(Bitmap paramBitmap)
  {
    AppMethodBeat.i(92308);
    this.awf.g(paramBitmap);
    AppMethodBeat.o(92308);
  }

  public final void g(byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(92310);
    if (this.awk == null)
      AppMethodBeat.o(92310);
    while (true)
    {
      return;
      this.awk.put(paramArrayOfByte);
      AppMethodBeat.o(92310);
    }
  }

  public final void k(int[] paramArrayOfInt)
  {
    AppMethodBeat.i(92312);
    if (this.awk == null)
      AppMethodBeat.o(92312);
    while (true)
    {
      return;
      this.awk.put(paramArrayOfInt);
      AppMethodBeat.o(92312);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.bumptech.glide.c.d.e.b
 * JD-Core Version:    0.6.2
 */