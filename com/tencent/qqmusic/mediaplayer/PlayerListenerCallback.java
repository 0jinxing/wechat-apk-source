package com.tencent.qqmusic.mediaplayer;

public abstract interface PlayerListenerCallback
{
  public abstract void onBufferingUpdate(BaseMediaPlayer paramBaseMediaPlayer, int paramInt);

  public abstract void onCompletion(BaseMediaPlayer paramBaseMediaPlayer);

  public abstract void onError(BaseMediaPlayer paramBaseMediaPlayer, int paramInt1, int paramInt2, int paramInt3);

  public abstract void onPrepared(BaseMediaPlayer paramBaseMediaPlayer);

  public abstract void onSeekComplete(BaseMediaPlayer paramBaseMediaPlayer, int paramInt);

  public abstract void onStarted(BaseMediaPlayer paramBaseMediaPlayer);

  public abstract void onStateChanged(BaseMediaPlayer paramBaseMediaPlayer, int paramInt);
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.qqmusic.mediaplayer.PlayerListenerCallback
 * JD-Core Version:    0.6.2
 */