package com.google.android.exoplayer2.a;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public abstract interface d
{
  public static final ByteBuffer aPG = ByteBuffer.allocateDirect(0).order(ByteOrder.nativeOrder());

  public abstract void flush();

  public abstract void g(ByteBuffer paramByteBuffer);

  public abstract boolean isActive();

  public abstract boolean qf();

  public abstract int qk();

  public abstract void ql();

  public abstract ByteBuffer qm();

  public abstract boolean r(int paramInt1, int paramInt2, int paramInt3);

  public abstract void reset();
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.google.android.exoplayer2.a.d
 * JD-Core Version:    0.6.2
 */