package com.tencent.mm.pluginsdk.ui.tools;

import android.content.Context;
import android.graphics.Bitmap;
import android.media.MediaPlayer;
import android.media.MediaPlayer.OnCompletionListener;
import android.media.MediaPlayer.OnErrorListener;
import android.media.MediaPlayer.OnPreparedListener;
import android.media.MediaPlayer.OnVideoSizeChangedListener;
import android.util.AttributeSet;
import android.view.SurfaceHolder;
import android.view.SurfaceHolder.Callback;
import android.view.SurfaceView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.compatible.b.k;
import com.tencent.mm.sdk.platformtools.ab;

public class VideoSurfaceView extends SurfaceView
  implements e
{
  private boolean eif;
  private MediaPlayer ieC;
  MediaPlayer.OnPreparedListener ieD;
  MediaPlayer.OnVideoSizeChangedListener ieE;
  private MediaPlayer.OnCompletionListener ieF;
  private MediaPlayer.OnErrorListener ieI;
  private boolean ief;
  private e.a llE;
  private int mDuration;
  private int mVideoHeight;
  private int mVideoWidth;
  private SurfaceHolder swG;
  private String vvD;
  private boolean vvE;
  SurfaceHolder.Callback vvF;

  public VideoSurfaceView(Context paramContext)
  {
    this(paramContext, null);
  }

  public VideoSurfaceView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }

  public VideoSurfaceView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    AppMethodBeat.i(70447);
    this.swG = null;
    this.ieC = null;
    this.ieE = new VideoSurfaceView.1(this);
    this.ieD = new MediaPlayer.OnPreparedListener()
    {
      public final void onPrepared(MediaPlayer paramAnonymousMediaPlayer)
      {
        AppMethodBeat.i(70441);
        VideoSurfaceView.d(VideoSurfaceView.this);
        if (VideoSurfaceView.e(VideoSurfaceView.this) != null)
          VideoSurfaceView.e(VideoSurfaceView.this).pL();
        VideoSurfaceView.a(VideoSurfaceView.this, paramAnonymousMediaPlayer.getVideoWidth());
        VideoSurfaceView.b(VideoSurfaceView.this, paramAnonymousMediaPlayer.getVideoHeight());
        VideoSurfaceView.c(VideoSurfaceView.this);
        if ((VideoSurfaceView.a(VideoSurfaceView.this) != 0) && (VideoSurfaceView.b(VideoSurfaceView.this) != 0))
        {
          if (!VideoSurfaceView.f(VideoSurfaceView.this))
            break label148;
          VideoSurfaceView.g(VideoSurfaceView.this).start();
          VideoSurfaceView.h(VideoSurfaceView.this);
          AppMethodBeat.o(70441);
        }
        while (true)
        {
          return;
          if (VideoSurfaceView.f(VideoSurfaceView.this))
          {
            VideoSurfaceView.g(VideoSurfaceView.this).start();
            VideoSurfaceView.h(VideoSurfaceView.this);
          }
          label148: AppMethodBeat.o(70441);
        }
      }
    };
    this.ieF = new VideoSurfaceView.3(this);
    this.ieI = new VideoSurfaceView.4(this);
    this.vvF = new VideoSurfaceView.5(this);
    this.eif = false;
    this.mVideoWidth = 0;
    this.mVideoHeight = 0;
    getHolder().addCallback(this.vvF);
    getHolder().setType(3);
    setFocusable(true);
    setFocusableInTouchMode(true);
    requestFocus();
    AppMethodBeat.o(70447);
  }

  private void bnS()
  {
    AppMethodBeat.i(70450);
    if ((this.vvD == null) || (this.swG == null))
      AppMethodBeat.o(70450);
    while (true)
    {
      return;
      if (this.ieC != null)
      {
        this.ieC.stop();
        this.ieC.release();
        this.ieC = null;
      }
      try
      {
        k localk = new com/tencent/mm/compatible/b/k;
        localk.<init>();
        this.ieC = localk;
        this.ieC.setOnPreparedListener(this.ieD);
        this.ieC.setOnVideoSizeChangedListener(this.ieE);
        this.vvE = false;
        ab.v("MicroMsg.VideoSurfaceView", "reset duration to -1 in openVideo");
        this.mDuration = -1;
        this.ieC.setOnCompletionListener(this.ieF);
        this.ieC.setOnErrorListener(this.ieI);
        this.ieC.setDataSource(this.vvD);
        this.ieC.setDisplay(this.swG);
        this.ieC.setAudioStreamType(3);
        this.ieC.setScreenOnWhilePlaying(true);
        this.ieC.prepareAsync();
        this.mVideoHeight = this.ieC.getVideoHeight();
        this.mVideoWidth = this.ieC.getVideoWidth();
        setMute(this.eif);
        AppMethodBeat.o(70450);
      }
      catch (Exception localException)
      {
        ab.printErrStackTrace("MicroMsg.VideoSurfaceView", localException, "prepare async error %s", new Object[] { localException.getMessage() });
        if (this.llE != null)
          this.llE.onError(-1, -1);
        AppMethodBeat.o(70450);
      }
    }
  }

  public final void B(double paramDouble)
  {
    AppMethodBeat.i(70458);
    if (this.ieC != null)
    {
      ab.d("MicroMsg.VideoSurfaceView", "seek to time: ".concat(String.valueOf(paramDouble)));
      this.ieC.seekTo((int)paramDouble);
      start();
    }
    AppMethodBeat.o(70458);
  }

  public final void d(double paramDouble, boolean paramBoolean)
  {
    AppMethodBeat.i(70460);
    B(paramDouble);
    AppMethodBeat.o(70460);
  }

  public int getCurrentPosition()
  {
    AppMethodBeat.i(70453);
    int i;
    if ((this.ieC != null) && (this.vvE))
    {
      i = this.ieC.getCurrentPosition();
      AppMethodBeat.o(70453);
    }
    while (true)
    {
      return i;
      i = 0;
      AppMethodBeat.o(70453);
    }
  }

  public int getDuration()
  {
    AppMethodBeat.i(70452);
    int i;
    if ((this.ieC != null) && (this.vvE))
      if (this.mDuration > 0)
      {
        i = this.mDuration;
        AppMethodBeat.o(70452);
      }
    while (true)
    {
      return i;
      this.mDuration = this.ieC.getDuration();
      i = this.mDuration;
      AppMethodBeat.o(70452);
      continue;
      this.mDuration = -1;
      i = this.mDuration;
      AppMethodBeat.o(70452);
    }
  }

  public double getLastProgresstime()
  {
    return 0.0D;
  }

  public long getLastSurfaceUpdateTime()
  {
    return 0L;
  }

  public String getVideoPath()
  {
    return this.vvD;
  }

  public final boolean isPlaying()
  {
    AppMethodBeat.i(70454);
    boolean bool;
    if ((this.ieC != null) && (this.vvE))
    {
      bool = this.ieC.isPlaying();
      AppMethodBeat.o(70454);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(70454);
    }
  }

  public final void onDetach()
  {
  }

  public final void pause()
  {
    AppMethodBeat.i(70451);
    if ((this.ieC != null) && (this.vvE) && (this.ieC.isPlaying()))
      this.ieC.pause();
    this.ief = false;
    AppMethodBeat.o(70451);
  }

  public void setForceScaleFullScreen(boolean paramBoolean)
  {
  }

  public void setLoop(boolean paramBoolean)
  {
    AppMethodBeat.i(70455);
    if (this.ieC != null)
      this.ieC.setLooping(paramBoolean);
    AppMethodBeat.o(70455);
  }

  public void setMute(boolean paramBoolean)
  {
    AppMethodBeat.i(70459);
    this.eif = paramBoolean;
    if (this.ieC != null)
      if (this.eif)
      {
        this.ieC.setVolume(0.0F, 0.0F);
        AppMethodBeat.o(70459);
      }
    while (true)
    {
      return;
      this.ieC.setVolume(0.5F, 0.5F);
      AppMethodBeat.o(70459);
    }
  }

  public void setOnInfoCallback(e.b paramb)
  {
  }

  public void setOnSeekCompleteCallback(e.c paramc)
  {
  }

  public void setOnSurfaceCallback(e.d paramd)
  {
  }

  public void setOneTimeVideoTextureUpdateCallback(e.e parame)
  {
  }

  public void setPlayProgressCallback(boolean paramBoolean)
  {
  }

  public void setThumb(Bitmap paramBitmap)
  {
  }

  public void setVideoCallback(e.a parama)
  {
    this.llE = parama;
  }

  public void setVideoPath(String paramString)
  {
    AppMethodBeat.i(70448);
    this.vvD = paramString;
    this.ief = false;
    bnS();
    requestLayout();
    AppMethodBeat.o(70448);
  }

  public final boolean start()
  {
    AppMethodBeat.i(70456);
    if ((this.ieC != null) && (this.vvE))
      this.ieC.start();
    for (this.ief = false; ; this.ief = true)
    {
      AppMethodBeat.o(70456);
      return true;
    }
  }

  public final void stop()
  {
    AppMethodBeat.i(70449);
    if (this.ieC != null)
    {
      this.ieC.stop();
      this.ieC.release();
      this.ieC = null;
    }
    AppMethodBeat.o(70449);
  }

  public final boolean w(Context paramContext, boolean paramBoolean)
  {
    AppMethodBeat.i(70457);
    paramBoolean = start();
    AppMethodBeat.o(70457);
    return paramBoolean;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.tools.VideoSurfaceView
 * JD-Core Version:    0.6.2
 */