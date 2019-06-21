package com.bumptech.glide.c.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.net.HttpURLConnection;
import java.net.URL;

final class j$a
  implements j.b
{
  public final HttpURLConnection b(URL paramURL)
  {
    AppMethodBeat.i(91720);
    paramURL = (HttpURLConnection)paramURL.openConnection();
    AppMethodBeat.o(91720);
    return paramURL;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.bumptech.glide.c.a.j.a
 * JD-Core Version:    0.6.2
 */