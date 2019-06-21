package com.tencent.qqmusic.mediaplayer.network;

import java.net.URL;
import java.util.Map;

public abstract interface IMediaHTTPConnection
{
  public abstract boolean connect(URL paramURL, Map<String, String> paramMap);

  public abstract void disconnect();

  public abstract String getMIMEType();

  public abstract long getSize();

  public abstract String getUri();

  public abstract int readAt(long paramLong, byte[] paramArrayOfByte, int paramInt1, int paramInt2);
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.qqmusic.mediaplayer.network.IMediaHTTPConnection
 * JD-Core Version:    0.6.2
 */