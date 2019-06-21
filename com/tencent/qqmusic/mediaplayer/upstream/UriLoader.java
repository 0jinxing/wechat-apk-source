package com.tencent.qqmusic.mediaplayer.upstream;

import java.util.concurrent.TimeUnit;

public abstract interface UriLoader
{
  public abstract void cancelLoading();

  public abstract boolean isLoading();

  public abstract void startLoading(int paramInt, TimeUnit paramTimeUnit, UriLoader.Callback paramCallback);
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.qqmusic.mediaplayer.upstream.UriLoader
 * JD-Core Version:    0.6.2
 */