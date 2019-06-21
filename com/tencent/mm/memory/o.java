package com.tencent.mm.memory;

import android.graphics.Bitmap;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class o extends e<Bitmap, o.b>
{
  public static o fdT;

  static
  {
    AppMethodBeat.i(115417);
    fdT = new o();
    AppMethodBeat.o(115417);
  }

  private static Bitmap b(o.b paramb)
  {
    AppMethodBeat.i(115410);
    paramb = Bitmap.createBitmap(paramb.width, paramb.height, k.fdG);
    AppMethodBeat.o(115410);
    return paramb;
  }

  protected final long WW()
  {
    return 1228800L;
  }

  protected final long WX()
  {
    return 307200L;
  }

  public final Bitmap a(o.b paramb)
  {
    try
    {
      AppMethodBeat.i(115408);
      Bitmap localBitmap1 = (Bitmap)super.a(paramb);
      Bitmap localBitmap2;
      if (localBitmap1 != null)
      {
        localBitmap2 = localBitmap1;
        if (!localBitmap1.isRecycled());
      }
      else
      {
        localBitmap2 = b(paramb);
      }
      AppMethodBeat.o(115408);
      return localBitmap2;
    }
    finally
    {
    }
    throw paramb;
  }

  public final void f(Bitmap paramBitmap)
  {
    try
    {
      AppMethodBeat.i(115409);
      if ((paramBitmap != null) && (!paramBitmap.isRecycled()))
        super.aR(paramBitmap);
      AppMethodBeat.o(115409);
      return;
    }
    finally
    {
    }
    throw paramBitmap;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.memory.o
 * JD-Core Version:    0.6.2
 */