package com.facebook.internal;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.BufferedInputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;

class ImageResponseCache$BufferedHttpInputStream extends BufferedInputStream
{
  HttpURLConnection connection;

  ImageResponseCache$BufferedHttpInputStream(InputStream paramInputStream, HttpURLConnection paramHttpURLConnection)
  {
    super(paramInputStream, 8192);
    this.connection = paramHttpURLConnection;
  }

  public void close()
  {
    AppMethodBeat.i(72392);
    super.close();
    Utility.disconnectQuietly(this.connection);
    AppMethodBeat.o(72392);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.facebook.internal.ImageResponseCache.BufferedHttpInputStream
 * JD-Core Version:    0.6.2
 */