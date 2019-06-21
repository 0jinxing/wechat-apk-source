package com.tencent.qqmusic.mediaplayer.upstream;

public abstract interface TransferListener
{
  public abstract void onBytesTransferError(long paramLong1, long paramLong2, long paramLong3);

  public abstract void onBytesTransferred(long paramLong1, long paramLong2);

  public abstract void onBytesTransferring(long paramLong1, long paramLong2);

  public abstract void onTransferEnd();

  public abstract void onTransferStart();
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.qqmusic.mediaplayer.upstream.TransferListener
 * JD-Core Version:    0.6.2
 */