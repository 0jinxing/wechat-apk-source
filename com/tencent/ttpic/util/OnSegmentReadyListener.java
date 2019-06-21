package com.tencent.ttpic.util;

import com.tencent.filter.h;

public abstract interface OnSegmentReadyListener
{
  public abstract boolean needWait();

  public abstract void onTextureReady(h paramh, boolean paramBoolean);

  public abstract void reset();
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.ttpic.util.OnSegmentReadyListener
 * JD-Core Version:    0.6.2
 */