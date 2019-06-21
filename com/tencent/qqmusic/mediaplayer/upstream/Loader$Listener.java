package com.tencent.qqmusic.mediaplayer.upstream;

import java.io.IOException;

public abstract interface Loader$Listener
{
  public abstract void onLoadCancelled(boolean paramBoolean);

  public abstract void onLoadCompleted();

  public abstract void onLoadError(IOException paramIOException);

  public abstract void onLoadProgress(long paramLong1, long paramLong2);
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.qqmusic.mediaplayer.upstream.Loader.Listener
 * JD-Core Version:    0.6.2
 */