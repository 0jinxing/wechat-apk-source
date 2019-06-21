package com.tencent.qqmusic.mediaplayer.network;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.qqmusic.mediaplayer.util.Logger;

public class DefaultMediaHTTPService
  implements IMediaHTTPService
{
  private static final String TAG = "DefaultMediaHTTPService";

  public IMediaHTTPConnection makeHTTPConnection()
  {
    AppMethodBeat.i(104799);
    Logger.d("DefaultMediaHTTPService", "makeHTTPConnection");
    DefaultMediaHTTPConnection localDefaultMediaHTTPConnection = new DefaultMediaHTTPConnection();
    AppMethodBeat.o(104799);
    return localDefaultMediaHTTPConnection;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.qqmusic.mediaplayer.network.DefaultMediaHTTPService
 * JD-Core Version:    0.6.2
 */