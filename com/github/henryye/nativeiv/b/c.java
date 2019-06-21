package com.github.henryye.nativeiv.b;

import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import com.tencent.magicbrush.a.c.c;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

public final class c
{
  private static final Map<String, com.github.henryye.nativeiv.bitmap.c> aMq;

  static
  {
    AppMethodBeat.i(115776);
    HashMap localHashMap = new HashMap(6);
    aMq = localHashMap;
    localHashMap.put("image/jpeg", com.github.henryye.nativeiv.bitmap.c.aMe);
    aMq.put("image/gif", com.github.henryye.nativeiv.bitmap.c.aMh);
    aMq.put("image/png", com.github.henryye.nativeiv.bitmap.c.aMf);
    aMq.put("image/x-ms-bmp", com.github.henryye.nativeiv.bitmap.c.aMg);
    aMq.put("image/bmp", com.github.henryye.nativeiv.bitmap.c.aMg);
    aMq.put("image/webp", com.github.henryye.nativeiv.bitmap.c.aMi);
    AppMethodBeat.o(115776);
  }

  public static com.github.henryye.nativeiv.bitmap.d g(InputStream paramInputStream)
  {
    AppMethodBeat.i(115775);
    BitmapFactory.Options localOptions = new BitmapFactory.Options();
    localOptions.inJustDecodeBounds = true;
    InputStream localInputStream = d.h(paramInputStream);
    d.i(localInputStream);
    BitmapFactory.decodeStream(localInputStream, null, localOptions);
    Object localObject = (com.github.henryye.nativeiv.bitmap.c)aMq.get(localOptions.outMimeType);
    paramInputStream = (InputStream)localObject;
    if (localObject == null)
      paramInputStream = com.github.henryye.nativeiv.bitmap.c.aMj;
    try
    {
      localInputStream.reset();
      localObject = new com.github.henryye.nativeiv.bitmap.d();
      ((com.github.henryye.nativeiv.bitmap.d)localObject).aMl = paramInputStream;
      ((com.github.henryye.nativeiv.bitmap.d)localObject).aMn = localOptions.outHeight;
      ((com.github.henryye.nativeiv.bitmap.d)localObject).aMm = localOptions.outWidth;
      AppMethodBeat.o(115775);
      return localObject;
    }
    catch (IOException paramInputStream)
    {
      while (true)
      {
        c.c.a("Ni.FormatUtil", paramInputStream, "hy: the given stream is markable, but still reset error. should not forward", new Object[0]);
        paramInputStream = com.github.henryye.nativeiv.bitmap.c.aMj;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.github.henryye.nativeiv.b.c
 * JD-Core Version:    0.6.2
 */