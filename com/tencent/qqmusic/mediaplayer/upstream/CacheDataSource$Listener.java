package com.tencent.qqmusic.mediaplayer.upstream;

import java.io.IOException;

public abstract interface CacheDataSource$Listener extends TransferListener
{
  public abstract void onBufferEnded();

  public abstract void onBufferStarted(long paramLong);

  public abstract long onStreamingError(IOException paramIOException);

  public abstract void onStreamingFinished();

  public abstract void onUpStreamTransfer(long paramLong1, long paramLong2);
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.qqmusic.mediaplayer.upstream.CacheDataSource.Listener
 * JD-Core Version:    0.6.2
 */