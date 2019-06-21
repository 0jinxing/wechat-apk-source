package com.google.android.exoplayer2;

import com.google.android.exoplayer2.i.h;
import com.google.android.exoplayer2.source.l;

public abstract interface r extends f.b
{
  public abstract void a(t paramt, Format[] paramArrayOfFormat, l paraml, long paramLong1, boolean paramBoolean, long paramLong2);

  public abstract void a(Format[] paramArrayOfFormat, l paraml, long paramLong);

  public abstract void disable();

  public abstract void f(long paramLong1, long paramLong2);

  public abstract int getState();

  public abstract int getTrackType();

  public abstract boolean isReady();

  public abstract s pC();

  public abstract h pD();

  public abstract l pE();

  public abstract boolean pF();

  public abstract void pG();

  public abstract boolean pH();

  public abstract void pI();

  public abstract boolean qf();

  public abstract void setIndex(int paramInt);

  public abstract void start();

  public abstract void stop();

  public abstract void v(long paramLong);
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.google.android.exoplayer2.r
 * JD-Core Version:    0.6.2
 */