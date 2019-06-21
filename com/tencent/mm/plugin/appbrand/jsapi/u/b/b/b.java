package com.tencent.mm.plugin.appbrand.jsapi.u.b.b;

import android.media.MediaPlayer.OnBufferingUpdateListener;
import android.media.MediaPlayer.OnCompletionListener;
import android.media.MediaPlayer.OnErrorListener;
import android.media.MediaPlayer.OnInfoListener;
import android.media.MediaPlayer.OnPreparedListener;
import android.media.MediaPlayer.OnSeekCompleteListener;
import android.media.MediaPlayer.OnVideoSizeChangedListener;

public abstract class b
  implements c
{
  protected MediaPlayer.OnInfoListener ieL;
  protected MediaPlayer.OnErrorListener ieM;
  protected MediaPlayer.OnPreparedListener ieN;
  protected MediaPlayer.OnCompletionListener ieO;
  protected MediaPlayer.OnSeekCompleteListener ieP;
  protected MediaPlayer.OnBufferingUpdateListener ieQ;
  protected MediaPlayer.OnVideoSizeChangedListener ieR;
  int mCurrentState = 0;

  public final int getState()
  {
    return this.mCurrentState;
  }

  public final void setOnBufferingUpdateListener(MediaPlayer.OnBufferingUpdateListener paramOnBufferingUpdateListener)
  {
    this.ieQ = paramOnBufferingUpdateListener;
  }

  public final void setOnCompletionListener(MediaPlayer.OnCompletionListener paramOnCompletionListener)
  {
    this.ieO = paramOnCompletionListener;
  }

  public final void setOnErrorListener(MediaPlayer.OnErrorListener paramOnErrorListener)
  {
    this.ieM = paramOnErrorListener;
  }

  public final void setOnInfoListener(MediaPlayer.OnInfoListener paramOnInfoListener)
  {
    this.ieL = paramOnInfoListener;
  }

  public final void setOnPreparedListener(MediaPlayer.OnPreparedListener paramOnPreparedListener)
  {
    this.ieN = paramOnPreparedListener;
  }

  public final void setOnSeekCompleteListener(MediaPlayer.OnSeekCompleteListener paramOnSeekCompleteListener)
  {
    this.ieP = paramOnSeekCompleteListener;
  }

  public final void setOnVideoSizeChangedListener(MediaPlayer.OnVideoSizeChangedListener paramOnVideoSizeChangedListener)
  {
    this.ieR = paramOnVideoSizeChangedListener;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.u.b.b.b
 * JD-Core Version:    0.6.2
 */