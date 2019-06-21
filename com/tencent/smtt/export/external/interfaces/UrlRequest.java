package com.tencent.smtt.export.external.interfaces;

import java.nio.ByteBuffer;

public abstract class UrlRequest
{
  public abstract void cancel();

  public abstract void followRedirect();

  public abstract boolean isDone();

  public abstract void read(ByteBuffer paramByteBuffer);

  public abstract void start();
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.smtt.export.external.interfaces.UrlRequest
 * JD-Core Version:    0.6.2
 */