package com.tencent.luggage.bridge.impl.a;

import android.graphics.Bitmap;
import android.graphics.Rect;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.d.a.c;

public class c extends a
{
  public Bitmap b(String paramString, Rect paramRect, a.c paramc)
  {
    return null;
  }

  public boolean match(String paramString)
  {
    boolean bool = false;
    AppMethodBeat.i(90767);
    if ((paramString == null) || (paramString.length() == 0))
      AppMethodBeat.o(90767);
    while (true)
    {
      return bool;
      paramString = paramString.toLowerCase();
      if ((paramString.startsWith("http://")) || (paramString.startsWith("https://")))
      {
        bool = true;
        AppMethodBeat.o(90767);
      }
      else
      {
        AppMethodBeat.o(90767);
      }
    }
  }

  public final String wP()
  {
    return "NetworkImageReader";
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.luggage.bridge.impl.a.c
 * JD-Core Version:    0.6.2
 */