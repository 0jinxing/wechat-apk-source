package com.tencent.mm.emoji.loader.a;

import a.l;
import android.graphics.Bitmap;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.a.h;
import com.tencent.mm.sdk.platformtools.ab;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/emoji/loader/cache/CoverMemoryCache;", "", "()V", "cacheMap", "Lcom/tencent/mm/algorithm/MMLRUMap;", "", "Landroid/graphics/Bitmap;", "get", "key", "put", "", "bitmap", "plugin-emojisdk_release"})
public final class b
{
  private static final h<String, Bitmap> exA;
  public static final b exB;

  static
  {
    AppMethodBeat.i(63170);
    exB = new b();
    exA = new h(60);
    AppMethodBeat.o(63170);
  }

  public static void c(String paramString, Bitmap paramBitmap)
  {
    AppMethodBeat.i(63169);
    ab.i(c.Ow(), "put: " + paramString + ", " + paramBitmap);
    if (paramString != null)
      if ((paramBitmap != null) && (!paramBitmap.isRecycled()))
      {
        exA.put(paramString, paramBitmap);
        AppMethodBeat.o(63169);
      }
    while (true)
    {
      return;
      exA.remove(paramString);
      AppMethodBeat.o(63169);
    }
  }

  public static Bitmap kR(String paramString)
  {
    AppMethodBeat.i(63168);
    ab.i(c.Ow(), "get: ".concat(String.valueOf(paramString)));
    if (paramString == null)
    {
      AppMethodBeat.o(63168);
      paramString = null;
    }
    while (true)
    {
      return paramString;
      paramString = (Bitmap)exA.get(paramString);
      if ((paramString == null) || (paramString.isRecycled()))
      {
        AppMethodBeat.o(63168);
        paramString = null;
      }
      else
      {
        AppMethodBeat.o(63168);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.emoji.loader.a.b
 * JD-Core Version:    0.6.2
 */