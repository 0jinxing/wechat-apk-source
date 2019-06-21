package com.tencent.qqmusic.mediaplayer.upstream;

import java.io.IOException;

public class SourceReadException extends Exception
{
  private final String source;

  public SourceReadException(IOException paramIOException, String paramString)
  {
    super(paramIOException);
    this.source = paramString;
  }

  public SourceReadException(String paramString1, String paramString2)
  {
    super(paramString1);
    this.source = paramString2;
  }

  public String getSource()
  {
    return this.source;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.qqmusic.mediaplayer.upstream.SourceReadException
 * JD-Core Version:    0.6.2
 */