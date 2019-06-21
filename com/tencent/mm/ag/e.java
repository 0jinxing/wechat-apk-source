package com.tencent.mm.ag;

import java.io.Closeable;

public abstract interface e extends Closeable
{
  public abstract int acc();

  public abstract long getSize();

  public abstract boolean isOpen();

  public abstract void open();

  public abstract int readAt(long paramLong, byte[] paramArrayOfByte, int paramInt1, int paramInt2);
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ag.e
 * JD-Core Version:    0.6.2
 */