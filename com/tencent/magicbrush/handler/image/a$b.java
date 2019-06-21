package com.tencent.magicbrush.handler.image;

import android.util.Base64;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.ByteArrayInputStream;
import java.io.InputStream;

final class a$b extends a.d
{
  public a$b(IMBImageHandler paramIMBImageHandler)
  {
    super(paramIMBImageHandler);
  }

  private static int bZ(String paramString)
  {
    int i = 14;
    AppMethodBeat.i(115963);
    int j;
    if (paramString == null)
    {
      AppMethodBeat.o(115963);
      j = 0;
    }
    while (true)
    {
      return j;
      if (!paramString.startsWith("data:image/"))
      {
        AppMethodBeat.o(115963);
        j = 0;
      }
      else
      {
        if (paramString.startsWith("jpeg", 11))
          j = 15;
        while (true)
          if (!paramString.startsWith(";base64,", j))
          {
            AppMethodBeat.o(115963);
            j = 0;
            break;
            j = i;
            if (!paramString.startsWith("png", 11))
            {
              j = i;
              if (!paramString.startsWith("gif", 11))
              {
                AppMethodBeat.o(115963);
                j = 0;
                break;
              }
            }
          }
        j += 8;
        AppMethodBeat.o(115963);
      }
    }
  }

  public final boolean ca(String paramString)
  {
    AppMethodBeat.i(115964);
    boolean bool;
    if (bZ(paramString) > 0)
    {
      bool = true;
      AppMethodBeat.o(115964);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(115964);
    }
  }

  public final InputStream cb(String paramString)
  {
    AppMethodBeat.i(115965);
    paramString = new ByteArrayInputStream(Base64.decode(paramString.substring(bZ(paramString)), 2));
    AppMethodBeat.o(115965);
    return paramString;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.magicbrush.handler.image.a.b
 * JD-Core Version:    0.6.2
 */