package com.tencent.qqmusic.mediaplayer.upstream;

public abstract interface UriLoader$Callback
{
  public abstract void onCancelled();

  public abstract void onFailed(Throwable paramThrowable);

  public abstract void onSucceed(StreamingRequest paramStreamingRequest);
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.qqmusic.mediaplayer.upstream.UriLoader.Callback
 * JD-Core Version:    0.6.2
 */