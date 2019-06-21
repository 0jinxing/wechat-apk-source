package com.tencent.mm.plugin.appbrand.jsapi.u.b.b;

import android.media.MediaPlayer.OnBufferingUpdateListener;
import android.media.MediaPlayer.OnCompletionListener;
import android.media.MediaPlayer.OnErrorListener;
import android.media.MediaPlayer.OnInfoListener;
import android.media.MediaPlayer.OnPreparedListener;
import android.media.MediaPlayer.OnSeekCompleteListener;
import android.media.MediaPlayer.OnVideoSizeChangedListener;
import android.view.Surface;

public abstract interface c
{
  public abstract boolean at(float paramFloat);

  public abstract void eu(boolean paramBoolean);

  public abstract int getCurrentPosition();

  public abstract int getDuration();

  public abstract int getState();

  public abstract int getVideoHeight();

  public abstract int getVideoWidth();

  public abstract boolean isPlaying();

  public abstract void oM(int paramInt);

  public abstract void pause();

  public abstract void prepareAsync();

  public abstract void release();

  public abstract void reset();

  public abstract void seekTo(int paramInt);

  public abstract void setDataSource(String paramString);

  public abstract void setLooping(boolean paramBoolean);

  public abstract void setMute(boolean paramBoolean);

  public abstract void setOnBufferingUpdateListener(MediaPlayer.OnBufferingUpdateListener paramOnBufferingUpdateListener);

  public abstract void setOnCompletionListener(MediaPlayer.OnCompletionListener paramOnCompletionListener);

  public abstract void setOnErrorListener(MediaPlayer.OnErrorListener paramOnErrorListener);

  public abstract void setOnInfoListener(MediaPlayer.OnInfoListener paramOnInfoListener);

  public abstract void setOnPreparedListener(MediaPlayer.OnPreparedListener paramOnPreparedListener);

  public abstract void setOnSeekCompleteListener(MediaPlayer.OnSeekCompleteListener paramOnSeekCompleteListener);

  public abstract void setOnVideoSizeChangedListener(MediaPlayer.OnVideoSizeChangedListener paramOnVideoSizeChangedListener);

  public abstract void setSurface(Surface paramSurface);

  public abstract void start();

  public abstract void stop();
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.u.b.b.c
 * JD-Core Version:    0.6.2
 */