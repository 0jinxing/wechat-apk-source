package com.tencent.qqmusic.mediaplayer.upstream;

import java.io.IOException;

public class SinkWriteException extends Exception
{
  public SinkWriteException(IOException paramIOException)
  {
    super(paramIOException);
  }

  public SinkWriteException(String paramString)
  {
    super(paramString);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.qqmusic.mediaplayer.upstream.SinkWriteException
 * JD-Core Version:    0.6.2
 */