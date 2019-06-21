package com.tencent.qqmusic.mediaplayer;

abstract interface BaseDecodeDataComponent$HandleDecodeDataCallback
{
  public abstract long getCurPositionByDecoder();

  public abstract long getMinPcmBufferSize();

  public abstract void onPullDecodeDataEndOrFailed(int paramInt1, int paramInt2);

  public abstract int pullDecodeData(int paramInt, byte[] paramArrayOfByte);

  public abstract int seekTo(int paramInt);
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.qqmusic.mediaplayer.BaseDecodeDataComponent.HandleDecodeDataCallback
 * JD-Core Version:    0.6.2
 */