package com.tencent.mm.ui.video;

import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.media.MediaPlayer.OnBufferingUpdateListener;
import android.media.MediaPlayer.OnCompletionListener;
import android.media.MediaPlayer.OnErrorListener;
import android.media.MediaPlayer.OnPreparedListener;
import android.media.MediaPlayer.OnVideoSizeChangedListener;
import android.util.AttributeSet;
import android.view.SurfaceHolder;
import android.view.SurfaceHolder.Callback;
import android.view.SurfaceView;
import android.widget.RelativeLayout.LayoutParams;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.compatible.b.k;
import com.tencent.mm.sdk.platformtools.ab;
import java.io.IOException;

public class VideoView extends SurfaceView
{
  private MediaPlayer.OnCompletionListener fZE;
  private MediaPlayer.OnErrorListener fZF;
  public MediaPlayer ieC;
  MediaPlayer.OnPreparedListener ieD;
  MediaPlayer.OnVideoSizeChangedListener ieE;
  private MediaPlayer.OnCompletionListener ieF;
  private MediaPlayer.OnErrorListener ieI;
  private MediaPlayer.OnBufferingUpdateListener ieJ;
  public boolean ief;
  private Context mContext;
  private int mDuration;
  private int mSurfaceHeight;
  private int mSurfaceWidth;
  private int mVideoHeight;
  private int mVideoWidth;
  private SurfaceHolder swG;
  private String vvD;
  public boolean vvE;
  SurfaceHolder.Callback vvF;
  private MediaPlayer.OnPreparedListener zLk;
  private int zLl;
  private int zLm;
  private VideoView.a zLn;

  public VideoView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
    AppMethodBeat.i(35292);
    this.mContext = paramContext;
    dKy();
    AppMethodBeat.o(35292);
  }

  public VideoView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    AppMethodBeat.i(35293);
    this.swG = null;
    this.ieC = null;
    this.ieE = new VideoView.1(this);
    this.ieD = new VideoView.2(this);
    this.ieF = new VideoView.3(this);
    this.ieI = new VideoView.4(this);
    this.ieJ = new VideoView.5(this);
    this.vvF = new SurfaceHolder.Callback()
    {
      public final void surfaceChanged(SurfaceHolder paramAnonymousSurfaceHolder, int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3)
      {
        AppMethodBeat.i(35288);
        VideoView.d(VideoView.this, paramAnonymousInt2);
        VideoView.e(VideoView.this, paramAnonymousInt3);
        if ((VideoView.e(VideoView.this) != null) && (VideoView.p(VideoView.this)) && (VideoView.a(VideoView.this) == paramAnonymousInt2) && (VideoView.b(VideoView.this) == paramAnonymousInt3))
        {
          if (VideoView.j(VideoView.this) != 0)
          {
            VideoView.e(VideoView.this).seekTo(VideoView.j(VideoView.this));
            VideoView.k(VideoView.this);
          }
          VideoView.e(VideoView.this).start();
        }
        AppMethodBeat.o(35288);
      }

      public final void surfaceCreated(SurfaceHolder paramAnonymousSurfaceHolder)
      {
        AppMethodBeat.i(35289);
        VideoView.a(VideoView.this, paramAnonymousSurfaceHolder);
        VideoView.q(VideoView.this);
        AppMethodBeat.o(35289);
      }

      public final void surfaceDestroyed(SurfaceHolder paramAnonymousSurfaceHolder)
      {
        AppMethodBeat.i(35290);
        VideoView.a(VideoView.this, null);
        if (VideoView.e(VideoView.this) != null)
        {
          VideoView.e(VideoView.this).reset();
          VideoView.e(VideoView.this).release();
          VideoView.r(VideoView.this);
        }
        AppMethodBeat.o(35290);
      }
    };
    this.mContext = paramContext;
    dKy();
    AppMethodBeat.o(35293);
  }

  private void bnS()
  {
    AppMethodBeat.i(35299);
    if ((this.vvD == null) || (this.swG == null))
      AppMethodBeat.o(35299);
    while (true)
    {
      return;
      Object localObject = new Intent("com.android.music.musicservicecommand");
      ((Intent)localObject).putExtra("command", "pause");
      this.mContext.sendBroadcast((Intent)localObject);
      if (this.ieC != null)
      {
        this.ieC.reset();
        this.ieC.release();
        this.ieC = null;
      }
      try
      {
        localObject = new com/tencent/mm/compatible/b/k;
        ((k)localObject).<init>();
        this.ieC = ((MediaPlayer)localObject);
        this.ieC.setOnPreparedListener(this.ieD);
        this.ieC.setOnVideoSizeChangedListener(this.ieE);
        this.vvE = false;
        ab.v("MicroMsg.VideoView", "reset duration to -1 in openVideo");
        this.mDuration = -1;
        this.ieC.setOnCompletionListener(this.ieF);
        this.ieC.setOnErrorListener(this.ieI);
        this.ieC.setOnBufferingUpdateListener(this.ieJ);
        this.zLl = 0;
        this.ieC.setDataSource(this.vvD);
        this.ieC.setDisplay(this.swG);
        this.ieC.setAudioStreamType(3);
        this.ieC.setScreenOnWhilePlaying(true);
        this.ieC.prepareAsync();
        this.mVideoHeight = this.ieC.getVideoHeight();
        this.mVideoWidth = this.ieC.getVideoWidth();
        AppMethodBeat.o(35299);
      }
      catch (IOException localIOException)
      {
        AppMethodBeat.o(35299);
      }
      catch (IllegalArgumentException localIllegalArgumentException)
      {
        AppMethodBeat.o(35299);
      }
    }
  }

  private void dKy()
  {
    AppMethodBeat.i(35294);
    this.mVideoWidth = 0;
    this.mVideoHeight = 0;
    getHolder().addCallback(this.vvF);
    getHolder().setType(3);
    setFocusable(true);
    setFocusableInTouchMode(true);
    requestFocus();
    AppMethodBeat.o(35294);
  }

  public final void dKx()
  {
    AppMethodBeat.i(35291);
    if ((this.mVideoHeight == 0) || (this.mVideoWidth == 0))
    {
      AppMethodBeat.o(35291);
      return;
    }
    int i = this.mVideoWidth;
    int j = this.mVideoHeight;
    ab.v("MicroMsg.VideoView", "video size before:" + i + "   " + j);
    ab.v("MicroMsg.VideoView", "layout size before:" + getWidth() + "   " + getHeight());
    int k = getWidth();
    int m = getHeight();
    if (k <= 0)
      k = i;
    while (true)
    {
      if (m <= 0)
        m = j;
      while (true)
      {
        float f1 = k * 1.0F / i;
        float f2 = m * 1.0F / j;
        RelativeLayout.LayoutParams localLayoutParams = (RelativeLayout.LayoutParams)getLayoutParams();
        if (f1 > f2)
          localLayoutParams.width = ((int)(i * f2));
        for (localLayoutParams.height = m; ; localLayoutParams.height = ((int)(j * f1)))
        {
          localLayoutParams.addRule(13);
          setLayoutParams(localLayoutParams);
          invalidate();
          ab.v("MicroMsg.VideoView", "video size after:" + this.ieC.getVideoWidth() + "   " + this.ieC.getVideoHeight());
          ab.v("MicroMsg.VideoView", "layout size after:" + localLayoutParams.width + "   " + localLayoutParams.height);
          AppMethodBeat.o(35291);
          break;
          localLayoutParams.width = k;
        }
      }
    }
  }

  public int getAudioSessionId()
  {
    return 0;
  }

  public int getBufferPercentage()
  {
    if (this.ieC != null);
    for (int i = this.zLl; ; i = 0)
      return i;
  }

  public int getCurrentPosition()
  {
    AppMethodBeat.i(35301);
    int i;
    if ((this.ieC != null) && (this.vvE))
    {
      i = this.ieC.getCurrentPosition();
      AppMethodBeat.o(35301);
    }
    while (true)
    {
      return i;
      i = 0;
      AppMethodBeat.o(35301);
    }
  }

  public int getDuration()
  {
    AppMethodBeat.i(35300);
    int i;
    if ((this.ieC != null) && (this.vvE))
      if (this.mDuration > 0)
      {
        i = this.mDuration;
        AppMethodBeat.o(35300);
      }
    while (true)
    {
      return i;
      this.mDuration = this.ieC.getDuration();
      i = this.mDuration;
      AppMethodBeat.o(35300);
      continue;
      this.mDuration = -1;
      i = this.mDuration;
      AppMethodBeat.o(35300);
    }
  }

  public int getVideoHeight()
  {
    return this.mVideoHeight;
  }

  public int getVideoTimeLeft()
  {
    AppMethodBeat.i(35298);
    int i;
    if (this.ieC == null)
    {
      i = 0;
      AppMethodBeat.o(35298);
    }
    while (true)
    {
      return i;
      i = this.ieC.getDuration() - this.ieC.getCurrentPosition();
      AppMethodBeat.o(35298);
    }
  }

  public String getVideoURI()
  {
    return this.vvD;
  }

  public int getVideoWidth()
  {
    return this.mVideoWidth;
  }

  public final boolean isPlaying()
  {
    AppMethodBeat.i(35302);
    boolean bool;
    if ((this.ieC != null) && (this.vvE))
    {
      bool = this.ieC.isPlaying();
      AppMethodBeat.o(35302);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(35302);
    }
  }

  public void setLooping(boolean paramBoolean)
  {
    AppMethodBeat.i(35296);
    if (this.ieC != null)
      this.ieC.setLooping(paramBoolean);
    AppMethodBeat.o(35296);
  }

  public void setOnCompletionListener(MediaPlayer.OnCompletionListener paramOnCompletionListener)
  {
    this.fZE = paramOnCompletionListener;
  }

  public void setOnErrorListener(MediaPlayer.OnErrorListener paramOnErrorListener)
  {
    this.fZF = paramOnErrorListener;
  }

  public void setOnPreparedListener(MediaPlayer.OnPreparedListener paramOnPreparedListener)
  {
    this.zLk = paramOnPreparedListener;
  }

  public void setVideoURI(String paramString)
  {
    AppMethodBeat.i(35295);
    this.vvD = paramString;
    this.ief = false;
    this.zLm = 0;
    bnS();
    requestLayout();
    invalidate();
    AppMethodBeat.o(35295);
  }

  public void setVideoViewIm(VideoView.a parama)
  {
    this.zLn = parama;
  }

  public final void stopPlayback()
  {
    AppMethodBeat.i(35297);
    if (this.ieC != null)
    {
      this.ieC.stop();
      this.ieC.release();
      this.ieC = null;
    }
    AppMethodBeat.o(35297);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.video.VideoView
 * JD-Core Version:    0.6.2
 */