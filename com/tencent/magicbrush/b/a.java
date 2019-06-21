package com.tencent.magicbrush.b;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import com.tencent.magicbrush.a.c.c;
import com.tencent.matrix.trace.core.AppMethodBeat;

@SuppressLint({"LongLogTag"})
public class a
{
  private static volatile a bUq = null;
  public b bUr;

  private a()
  {
    AppMethodBeat.i(115987);
    this.bUr = new a((byte)0);
    this.bUr.init();
    AppMethodBeat.o(115987);
  }

  public static a yJ()
  {
    AppMethodBeat.i(115986);
    if (bUq == null);
    while (true)
    {
      try
      {
        if (bUq == null)
        {
          locala1 = new com/tencent/magicbrush/b/a;
          locala1.<init>();
          bUq = locala1;
        }
        a locala1 = bUq;
        return locala1;
      }
      finally
      {
        AppMethodBeat.o(115986);
      }
      a locala2 = bUq;
      AppMethodBeat.o(115986);
    }
  }

  final class a
    implements a.b
  {
    private a()
    {
    }

    public final Bitmap bK(int paramInt1, int paramInt2)
    {
      AppMethodBeat.i(115985);
      c.c.i("MiroMsg.MBBitmapPool", "hy: dummy getTask", new Object[0]);
      Bitmap localBitmap = Bitmap.createBitmap(paramInt1, paramInt2, Bitmap.Config.ARGB_8888);
      AppMethodBeat.o(115985);
      return localBitmap;
    }

    public final void init()
    {
      AppMethodBeat.i(115984);
      c.c.i("MiroMsg.MBBitmapPool", "hy: dummy init", new Object[0]);
      AppMethodBeat.o(115984);
    }
  }

  public static abstract interface b
  {
    public abstract Bitmap bK(int paramInt1, int paramInt2);

    public abstract void init();
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.magicbrush.b.a
 * JD-Core Version:    0.6.2
 */