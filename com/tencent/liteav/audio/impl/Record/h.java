package com.tencent.liteav.audio.impl.Record;

public abstract interface h
{
  public abstract void onAudioRecordError(int paramInt, String paramString);

  public abstract void onAudioRecordPCM(byte[] paramArrayOfByte, int paramInt, long paramLong);

  public abstract void onAudioRecordStart();

  public abstract void onAudioRecordStop();
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.liteav.audio.impl.Record.h
 * JD-Core Version:    0.6.2
 */