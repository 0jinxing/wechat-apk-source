package com.tencent.mm.plugin.sns.d;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory.Options;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.cf.b;
import com.tencent.mm.memory.l;
import com.tencent.mm.memory.n;
import com.tencent.mm.plugin.sns.data.i;
import com.tencent.mm.sdk.platformtools.ab;

public final class a
{
  public static Bitmap b(String paramString, BitmapFactory.Options paramOptions)
  {
    AppMethodBeat.i(35786);
    long l = System.currentTimeMillis();
    try
    {
      Bitmap localBitmap = l.Xf().a(paramString, paramOptions);
      paramOptions = localBitmap;
      if (localBitmap != null)
        paramOptions = i.s(paramString, localBitmap);
      ab.d("MicroMsg.SnsBitmapUtil", "decodeWithRotateByExif used %dms bitmap: %s", new Object[] { Long.valueOf(System.currentTimeMillis() - l), paramOptions });
      AppMethodBeat.o(35786);
      return paramOptions;
    }
    catch (OutOfMemoryError paramString)
    {
      while (true)
      {
        b.dvU();
        ab.e("MicroMsg.SnsBitmapUtil", "OutOfMemoryError e " + paramString.getMessage());
        AppMethodBeat.o(35786);
        paramOptions = null;
      }
    }
    catch (Exception paramString)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.SnsBitmapUtil", paramString, "", new Object[0]);
        AppMethodBeat.o(35786);
        paramOptions = null;
      }
    }
  }

  public static n c(String paramString, BitmapFactory.Options paramOptions)
  {
    AppMethodBeat.i(35785);
    long l = System.currentTimeMillis();
    try
    {
      Bitmap localBitmap = l.Xf().a(paramString, paramOptions);
      paramOptions = localBitmap;
      if (localBitmap != null)
        paramOptions = i.s(paramString, localBitmap);
      ab.d("MicroMsg.SnsBitmapUtil", "decodeWithRotateByExif used %dms bitmap: %s", new Object[] { Long.valueOf(System.currentTimeMillis() - l), paramOptions });
      paramString = n.w(paramOptions);
      AppMethodBeat.o(35785);
      return paramString;
    }
    catch (OutOfMemoryError paramString)
    {
      while (true)
      {
        b.dvU();
        ab.e("MicroMsg.SnsBitmapUtil", "OutOfMemoryError e " + paramString.getMessage());
        paramString = null;
        AppMethodBeat.o(35785);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.d.a
 * JD-Core Version:    0.6.2
 */