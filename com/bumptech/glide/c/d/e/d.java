package com.bumptech.glide.c.d.e;

import android.util.Log;
import com.bumptech.glide.c.b.u;
import com.bumptech.glide.c.j;
import com.bumptech.glide.c.l;
import com.bumptech.glide.h.a;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.File;
import java.io.IOException;

public final class d
  implements l<c>
{
  private static boolean a(u<c> paramu, File paramFile)
  {
    AppMethodBeat.i(92332);
    paramu = (c)paramu.get();
    try
    {
      a.b(paramu.getBuffer(), paramFile);
      bool = true;
      AppMethodBeat.o(92332);
      return bool;
    }
    catch (IOException paramu)
    {
      while (true)
      {
        Log.isLoggable("GifEncoder", 5);
        boolean bool = false;
      }
    }
  }

  public final com.bumptech.glide.c.c b(j paramj)
  {
    return com.bumptech.glide.c.c.ayO;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.bumptech.glide.c.d.e.d
 * JD-Core Version:    0.6.2
 */