package com.tencent.mm.memory;

import android.app.ActivityManager;
import android.content.Context;
import android.graphics.Bitmap;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.compatible.util.d;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;

public final class c extends a<Bitmap>
{
  private static int fdw;
  public static final c fdx;

  static
  {
    AppMethodBeat.i(115369);
    fdw = 20971520;
    fdx = new c();
    AppMethodBeat.o(115369);
  }

  private c()
  {
    AppMethodBeat.i(115355);
    int i = ((ActivityManager)ah.getContext().getSystemService("activity")).getLargeMemoryClass();
    ab.i("MicroMsg.BitmapPool", "BitmapPool %dMB", new Object[] { Integer.valueOf(i) });
    if (i > 256)
      fdw = 20971520;
    while (true)
    {
      Dw();
      AppMethodBeat.o(115355);
      return;
      if (i > 128)
        fdw = 10485760;
      else
        fdw = 5242880;
    }
  }

  protected static Integer e(Integer paramInteger)
  {
    AppMethodBeat.i(115356);
    int i = paramInteger.intValue();
    AppMethodBeat.o(115356);
    return Integer.valueOf(i * 4);
  }

  private static Integer u(Bitmap paramBitmap)
  {
    AppMethodBeat.i(115358);
    if (paramBitmap == null)
    {
      paramBitmap = Integer.valueOf(0);
      AppMethodBeat.o(115358);
      return paramBitmap;
    }
    if (d.fP(19));
    for (int i = paramBitmap.getByteCount(); ; i = paramBitmap.getAllocationByteCount())
    {
      paramBitmap = Integer.valueOf(i);
      AppMethodBeat.o(115358);
      break;
    }
  }

  protected final long WW()
  {
    return fdw;
  }

  protected final long WX()
  {
    return 1048576L;
  }

  public final void WY()
  {
    AppMethodBeat.i(115360);
    super.WY();
    AppMethodBeat.o(115360);
  }

  public final Bitmap f(Integer paramInteger)
  {
    try
    {
      AppMethodBeat.i(115357);
      Bitmap localBitmap = (Bitmap)super.c(paramInteger);
      if ((localBitmap == null) || (localBitmap.isRecycled()) || (!localBitmap.isMutable()))
      {
        paramInteger = null;
        AppMethodBeat.o(115357);
      }
      while (true)
      {
        return paramInteger;
        ab.d("MicroMsg.BitmapPool", "get stored element: %s, width: %s, height: %s, size: %s, requireSize: %s", new Object[] { localBitmap, Integer.valueOf(localBitmap.getWidth()), Integer.valueOf(localBitmap.getHeight()), u(localBitmap), paramInteger });
        AppMethodBeat.o(115357);
        paramInteger = localBitmap;
      }
    }
    finally
    {
    }
    throw paramInteger;
  }

  public final void f(Bitmap paramBitmap)
  {
    try
    {
      AppMethodBeat.i(115359);
      if ((paramBitmap != null) && (paramBitmap.isMutable()) && (!paramBitmap.isRecycled()))
      {
        ab.i("MicroMsg.BitmapPool", "release: %s", new Object[] { paramBitmap });
        super.aR(paramBitmap);
      }
      AppMethodBeat.o(115359);
      return;
    }
    finally
    {
    }
    throw paramBitmap;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.memory.c
 * JD-Core Version:    0.6.2
 */