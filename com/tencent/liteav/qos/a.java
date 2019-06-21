package com.tencent.liteav.qos;

public abstract interface a
{
  public abstract void onEnableDropStatusChanged(boolean paramBoolean);

  public abstract void onEncoderParamsChanged(int paramInt1, int paramInt2, int paramInt3);

  public abstract int onGetEncoderRealBitrate();

  public abstract int onGetQueueInputSize();

  public abstract int onGetQueueOutputSize();

  public abstract int onGetVideoDropCount();

  public abstract int onGetVideoQueueCurrentCount();

  public abstract int onGetVideoQueueMaxCount();
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.liteav.qos.a
 * JD-Core Version:    0.6.2
 */