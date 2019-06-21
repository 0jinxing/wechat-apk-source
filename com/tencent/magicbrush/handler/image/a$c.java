package com.tencent.magicbrush.handler.image;

import com.tencent.magicbrush.a.c.c;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.BufferedInputStream;
import java.io.InputStream;
import java.net.URL;

final class a$c extends a.d
{
  public a$c(IMBImageHandler paramIMBImageHandler)
  {
    super(paramIMBImageHandler);
  }

  public final boolean ca(String paramString)
  {
    AppMethodBeat.i(115966);
    boolean bool;
    if ((paramString != null) && ((paramString.startsWith("http://")) || (paramString.startsWith("https://"))))
    {
      bool = true;
      AppMethodBeat.o(115966);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(115966);
    }
  }

  public final InputStream cb(String paramString)
  {
    AppMethodBeat.i(115967);
    try
    {
      URL localURL = new java/net/URL;
      localURL.<init>(paramString);
      BufferedInputStream localBufferedInputStream = new java/io/BufferedInputStream;
      localBufferedInputStream.<init>(localURL.openStream());
      paramString = localBufferedInputStream;
      AppMethodBeat.o(115967);
      return paramString;
    }
    catch (Exception localException)
    {
      while (true)
      {
        c.c.e("HttpDecoder", "fetch error failed. path = [%s], error = [%s]", new Object[] { paramString, localException.toString() });
        paramString = null;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.magicbrush.handler.image.a.c
 * JD-Core Version:    0.6.2
 */