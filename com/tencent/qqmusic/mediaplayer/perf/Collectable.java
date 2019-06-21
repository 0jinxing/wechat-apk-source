package com.tencent.qqmusic.mediaplayer.perf;

public abstract interface Collectable
{
  public abstract void accept(ErrorUploadCollector paramErrorUploadCollector);

  public abstract void accept(PlayerInfoCollector paramPlayerInfoCollector);
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.qqmusic.mediaplayer.perf.Collectable
 * JD-Core Version:    0.6.2
 */