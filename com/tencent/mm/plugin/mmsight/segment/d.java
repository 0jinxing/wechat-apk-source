package com.tencent.mm.plugin.mmsight.segment;

import android.graphics.Bitmap;

public abstract interface d
{
  public abstract int getDurationMs();

  public abstract Bitmap getFrameAtTime(long paramLong);

  public abstract int getScaledHeight();

  public abstract int getScaledWidth();

  public abstract void init(String paramString, int paramInt1, int paramInt2, int paramInt3);

  public abstract void release();

  public abstract void reuseBitmap(Bitmap paramBitmap);
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.mmsight.segment.d
 * JD-Core Version:    0.6.2
 */