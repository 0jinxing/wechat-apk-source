package com.tencent.qqmusic.mediaplayer.downstream;

import java.io.Closeable;

public abstract interface IDataSink extends Closeable
{
  public abstract void open();

  public abstract int write(long paramLong, byte[] paramArrayOfByte, int paramInt1, int paramInt2);
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.qqmusic.mediaplayer.downstream.IDataSink
 * JD-Core Version:    0.6.2
 */