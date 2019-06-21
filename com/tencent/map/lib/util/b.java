package com.tencent.map.lib.util;

import android.graphics.Bitmap;
import android.os.Build.VERSION;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedHashMap;

public class b
{
  private static LinkedHashMap<String, b.a> a;

  static
  {
    AppMethodBeat.i(98245);
    a = new LinkedHashMap();
    AppMethodBeat.o(98245);
  }

  public static Bitmap a(String paramString)
  {
    while (true)
    {
      try
      {
        AppMethodBeat.i(98242);
        if (a == null)
        {
          AppMethodBeat.o(98242);
          paramString = null;
          return paramString;
        }
        paramString = (b.a)a.get(paramString);
        if (paramString != null)
        {
          paramString = paramString.b;
          AppMethodBeat.o(98242);
          continue;
        }
      }
      finally
      {
      }
      AppMethodBeat.o(98242);
      paramString = null;
    }
  }

  public static void a()
  {
    try
    {
      AppMethodBeat.i(98244);
      if (a != null)
        a.clear();
      AppMethodBeat.o(98244);
      return;
    }
    finally
    {
    }
  }

  public static void a(String paramString, Bitmap paramBitmap)
  {
    try
    {
      AppMethodBeat.i(98241);
      Object localObject;
      if (a == null)
      {
        localObject = new java/util/LinkedHashMap;
        ((LinkedHashMap)localObject).<init>();
        a = (LinkedHashMap)localObject;
      }
      if (a.containsKey(paramString))
      {
        paramString = (b.a)a.get(paramString);
        paramString.a += 1;
        AppMethodBeat.o(98241);
      }
      while (true)
      {
        return;
        localObject = new com/tencent/map/lib/util/b$a;
        ((b.a)localObject).<init>();
        ((b.a)localObject).b = paramBitmap;
        ((b.a)localObject).a = 1;
        a.put(paramString, localObject);
        AppMethodBeat.o(98241);
      }
    }
    finally
    {
    }
    throw paramString;
  }

  public static void b(String paramString)
  {
    try
    {
      AppMethodBeat.i(98243);
      if (a == null)
        AppMethodBeat.o(98243);
      while (true)
      {
        return;
        b.a locala = (b.a)a.get(paramString);
        if (locala != null)
        {
          locala.a -= 1;
          if (locala.a <= 0)
          {
            a.remove(paramString);
            if (Build.VERSION.SDK_INT <= 10)
            {
              paramString = locala.b;
              if ((paramString != null) && (!paramString.isRecycled()))
                paramString.recycle();
            }
          }
        }
        AppMethodBeat.o(98243);
      }
    }
    finally
    {
    }
    throw paramString;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.map.lib.util.b
 * JD-Core Version:    0.6.2
 */