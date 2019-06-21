package com.tencent.mm.pluginsdk.ui.tools;

import android.content.Context;
import android.graphics.Bitmap;
import android.media.MediaPlayer;
import android.media.MediaPlayer.OnBufferingUpdateListener;
import android.media.MediaPlayer.OnCompletionListener;
import android.media.MediaPlayer.OnErrorListener;
import android.media.MediaPlayer.OnInfoListener;
import android.media.MediaPlayer.OnPreparedListener;
import android.media.MediaPlayer.OnSeekCompleteListener;
import android.media.MediaPlayer.OnVideoSizeChangedListener;
import android.media.PlaybackParams;
import android.opengl.GLES20;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.view.Surface;
import android.view.TextureView.SurfaceTextureListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.compatible.b.k;
import com.tencent.mm.compatible.util.d;
import com.tencent.mm.pluginsdk.ui.h.d;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.base.MMTextureView;
import java.io.FileDescriptor;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;

public class VideoTextureView extends MMTextureView
  implements e
{
  protected long bfp;
  protected long bgY;
  private boolean eif;
  private boolean fVc;
  protected FileDescriptor fd;
  private MediaPlayer ieC;
  MediaPlayer.OnPreparedListener ieD;
  MediaPlayer.OnVideoSizeChangedListener ieE;
  private MediaPlayer.OnCompletionListener ieF;
  private MediaPlayer.OnErrorListener ieI;
  private boolean ief;
  private int ieu;
  private int iev;
  private long llC;
  private e.a llE;
  private e.d llH;
  private boolean llL;
  private boolean llM;
  private int mDuration;
  private Surface mSurface;
  private int mVideoHeight;
  private int mVideoWidth;
  private float speed;
  private long startTime;
  private String vvD;
  private boolean vvE;
  private e.b vvH;
  private long vvI;
  private int vvJ;
  private MediaPlayer.OnSeekCompleteListener vvK;
  private MediaPlayer.OnBufferingUpdateListener vvL;
  private MediaPlayer.OnInfoListener vvM;
  private boolean vvN;
  private boolean vvq;
  private e.e vvr;
  private e.c vvs;
  TextureView.SurfaceTextureListener vvt;
  private r vvu;

  public VideoTextureView(Context paramContext)
  {
    this(paramContext, null);
  }

  public VideoTextureView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }

  public VideoTextureView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    AppMethodBeat.i(118021);
    this.mSurface = null;
    this.ieC = null;
    this.startTime = 0L;
    this.vvI = 0L;
    this.ieu = 0;
    this.iev = 0;
    this.vvJ = 0;
    this.fVc = false;
    this.vvq = false;
    this.ieE = new VideoTextureView.2(this);
    this.ieD = new VideoTextureView.3(this);
    this.vvK = new VideoTextureView.4(this);
    this.vvL = new VideoTextureView.5(this);
    this.vvM = new VideoTextureView.6(this);
    this.ieF = new VideoTextureView.7(this);
    this.ieI = new VideoTextureView.8(this);
    this.llC = 0L;
    this.llL = false;
    this.llM = false;
    this.vvN = false;
    this.vvt = new VideoTextureView.9(this);
    this.eif = false;
    this.vvu = new r();
    this.speed = -1.0F;
    this.mVideoWidth = 0;
    this.mVideoHeight = 0;
    setSurfaceTextureListener(this.vvt);
    setFocusable(true);
    setFocusableInTouchMode(true);
    AppMethodBeat.o(118021);
  }

  private boolean bj(float paramFloat)
  {
    boolean bool = false;
    AppMethodBeat.i(118040);
    if (Build.VERSION.SDK_INT >= 23);
    try
    {
      if ((this.ieC != null) && (d.iW(23)))
      {
        PlaybackParams localPlaybackParams1 = this.ieC.getPlaybackParams();
        PlaybackParams localPlaybackParams2 = localPlaybackParams1;
        if (localPlaybackParams1 == null)
        {
          localPlaybackParams2 = new android/media/PlaybackParams;
          localPlaybackParams2.<init>();
        }
        this.ieC.setPlaybackParams(localPlaybackParams2.setSpeed(paramFloat));
      }
      AppMethodBeat.o(118040);
      bool = true;
      return bool;
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.VideoTextureView", localException, "%s handle play rate error", new Object[] { Integer.valueOf(hashCode()) });
        AppMethodBeat.o(118040);
      }
    }
  }

  private void bnS()
  {
    AppMethodBeat.i(118025);
    if (((bo.isNullOrNil(this.vvD)) && ((this.fd == null) || (!this.fd.valid()))) || (this.mSurface == null))
      AppMethodBeat.o(118025);
    while (true)
    {
      return;
      dlC();
      ab.i("MicroMsg.VideoTextureView", "%d open video %s", new Object[] { Integer.valueOf(hashCode()), this.vvD });
      try
      {
        k localk = new com/tencent/mm/compatible/b/k;
        localk.<init>();
        this.ieC = localk;
        this.ieC.setOnPreparedListener(this.ieD);
        this.ieC.setOnVideoSizeChangedListener(this.ieE);
        this.vvE = false;
        ab.v("MicroMsg.VideoTextureView", "reset duration to -1 in openVideo");
        this.mDuration = -1;
        this.vvJ = 0;
        this.ieC.setOnCompletionListener(this.ieF);
        this.ieC.setOnErrorListener(this.ieI);
        this.ieC.setOnSeekCompleteListener(this.vvK);
        this.ieC.setOnBufferingUpdateListener(this.vvL);
        this.ieC.setOnInfoListener(this.vvM);
        if (!bo.isNullOrNil(this.vvD))
          this.ieC.setDataSource(this.vvD);
        while (true)
        {
          this.ieC.setSurface(this.mSurface);
          this.ieC.setAudioStreamType(3);
          this.ieC.setScreenOnWhilePlaying(true);
          this.ieC.prepareAsync();
          this.mVideoHeight = this.ieC.getVideoHeight();
          this.mVideoWidth = this.ieC.getVideoWidth();
          setMute(this.eif);
          as(this.speed);
          ab.i("MicroMsg.VideoTextureView", "%d open video success player[%s] ", new Object[] { Integer.valueOf(hashCode()), Integer.valueOf(this.ieC.hashCode()) });
          AppMethodBeat.o(118025);
          break;
          if (this.fd != null)
            this.ieC.setDataSource(this.fd, this.bfp, this.bgY);
        }
      }
      catch (Exception localException)
      {
        ab.printErrStackTrace("MicroMsg.VideoTextureView", localException, "prepare async error path", new Object[0]);
        if (this.llE != null)
          this.llE.onError(-1, -1);
        AppMethodBeat.o(118025);
      }
    }
  }

  private void dlC()
  {
    boolean bool1 = true;
    AppMethodBeat.i(118024);
    int i = hashCode();
    boolean bool2 = this.vvE;
    if (this.ieC == null);
    while (true)
    {
      ab.i("MicroMsg.VideoTextureView", "%d release media player isPrepared[%b] player is null[%b] ", new Object[] { Integer.valueOf(i), Boolean.valueOf(bool2), Boolean.valueOf(bool1) });
      if (this.ieC != null)
      {
        this.ieC.setOnErrorListener(null);
        this.ieC.setOnVideoSizeChangedListener(null);
      }
      try
      {
        this.ieC.stop();
      }
      catch (Exception localException1)
      {
        try
        {
          while (true)
          {
            this.ieC.reset();
            this.ieC.release();
            this.ieC = null;
            AppMethodBeat.o(118024);
            return;
            bool1 = false;
            break;
            localException1 = localException1;
            ab.printErrStackTrace("MicroMsg.VideoTextureView", localException1, "stop media player error", new Object[0]);
          }
        }
        catch (Exception localException2)
        {
          while (true)
            ab.printErrStackTrace("MicroMsg.VideoTextureView", localException2, "reset media player error", new Object[0]);
        }
      }
    }
  }

  public final void B(double paramDouble)
  {
    AppMethodBeat.i(118034);
    if (this.ieC != null)
    {
      this.ieC.seekTo((int)paramDouble);
      this.ief = true;
      ab.d("MicroMsg.VideoTextureView", "seek to time: " + paramDouble + " curr pos : " + this.ieC.getCurrentPosition());
    }
    AppMethodBeat.o(118034);
  }

  public final boolean as(float paramFloat)
  {
    boolean bool = false;
    AppMethodBeat.i(118039);
    if (paramFloat <= 0.0F)
      AppMethodBeat.o(118039);
    while (true)
    {
      return bool;
      this.speed = paramFloat;
      if (d.iW(23))
      {
        bool = bj(this.speed);
        AppMethodBeat.o(118039);
      }
      else
      {
        AppMethodBeat.o(118039);
      }
    }
  }

  public final void bPd()
  {
    AppMethodBeat.i(118026);
    if ((this.ieC != null) && (this.vvE) && (this.mSurface != null) && (this.mSurface.isValid()))
    {
      ab.i("MicroMsg.VideoTextureView", "%d flush surface start time[%d] ", new Object[] { Integer.valueOf(hashCode()), Integer.valueOf(getCurrentPosition()) });
      this.vvN = true;
      this.ieC.setVolume(0.0F, 0.0F);
      this.ieC.start();
    }
    AppMethodBeat.o(118026);
  }

  public final void d(double paramDouble, boolean paramBoolean)
  {
    AppMethodBeat.i(118035);
    B(paramDouble);
    this.ief = paramBoolean;
    AppMethodBeat.o(118035);
  }

  public int getCurrentPosition()
  {
    AppMethodBeat.i(118029);
    int i;
    if ((this.ieC != null) && (this.vvE))
    {
      i = this.ieC.getCurrentPosition();
      AppMethodBeat.o(118029);
    }
    while (true)
    {
      return i;
      if (this.ieC == null)
      {
        i = -1;
        AppMethodBeat.o(118029);
      }
      else
      {
        i = 0;
        AppMethodBeat.o(118029);
      }
    }
  }

  public int getDownloadPercent()
  {
    return this.vvJ;
  }

  public int getDuration()
  {
    AppMethodBeat.i(118028);
    int i;
    if ((this.ieC != null) && (this.vvE))
      if (this.mDuration > 0)
      {
        i = this.mDuration;
        AppMethodBeat.o(118028);
      }
    while (true)
    {
      return i;
      this.mDuration = this.ieC.getDuration();
      i = this.mDuration;
      AppMethodBeat.o(118028);
      continue;
      this.mDuration = -1;
      i = this.mDuration;
      AppMethodBeat.o(118028);
    }
  }

  public double getLastProgresstime()
  {
    return 0.0D;
  }

  public long getLastSurfaceUpdateTime()
  {
    return this.llC;
  }

  public String getVideoPath()
  {
    return this.vvD;
  }

  public final boolean isPlaying()
  {
    AppMethodBeat.i(118030);
    if ((this.ieC != null) && (this.vvE) && (!this.llM));
    for (boolean bool = this.ieC.isPlaying(); ; bool = false)
    {
      ab.d("MicroMsg.VideoTextureView", "%d is playing result [%b] pauseWhenUpdated[%b] mIsPrepared[%b]", new Object[] { Integer.valueOf(hashCode()), Boolean.valueOf(bool), Boolean.valueOf(this.llM), Boolean.valueOf(this.vvE) });
      AppMethodBeat.o(118030);
      return bool;
    }
  }

  public final void onDetach()
  {
  }

  protected void onMeasure(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(118038);
    if ((this.mVideoWidth == 0) || (this.mVideoHeight == 0))
    {
      setMeasuredDimension(1, 1);
      AppMethodBeat.o(118038);
    }
    while (true)
    {
      return;
      paramInt1 = getDefaultSize(1, paramInt1);
      int i = getDefaultSize(1, paramInt2);
      paramInt2 = this.mVideoWidth;
      int j = this.mVideoHeight;
      this.vvu.I(paramInt1, i, paramInt2, j);
      setMeasuredDimension(this.vvu.iew, this.vvu.iex);
      AppMethodBeat.o(118038);
    }
  }

  public final void pause()
  {
    AppMethodBeat.i(118027);
    if ((this.ieC != null) && (this.vvE) && (this.ieC.isPlaying()))
    {
      ab.d("MicroMsg.VideoTextureView", "pause video.");
      this.ieC.pause();
    }
    this.ief = false;
    AppMethodBeat.o(118027);
  }

  public void setForceScaleFullScreen(boolean paramBoolean)
  {
    this.vvq = paramBoolean;
    this.vvu.vvq = this.vvq;
  }

  public void setLoop(boolean paramBoolean)
  {
    AppMethodBeat.i(118031);
    if (this.ieC != null)
      this.ieC.setLooping(paramBoolean);
    this.fVc = true;
    AppMethodBeat.o(118031);
  }

  public void setMute(boolean paramBoolean)
  {
    AppMethodBeat.i(118036);
    ab.i("MicroMsg.VideoTextureView", "%d set mute %b", new Object[] { Integer.valueOf(hashCode()), Boolean.valueOf(paramBoolean) });
    this.eif = paramBoolean;
    if (this.ieC != null)
      if (this.eif)
      {
        this.ieC.setVolume(0.0F, 0.0F);
        AppMethodBeat.o(118036);
      }
    while (true)
    {
      return;
      this.ieC.setVolume(1.0F, 1.0F);
      AppMethodBeat.o(118036);
    }
  }

  public void setOnInfoCallback(e.b paramb)
  {
    this.vvH = paramb;
  }

  public void setOnSeekCompleteCallback(e.c paramc)
  {
    this.vvs = paramc;
  }

  public void setOnSurfaceCallback(e.d paramd)
  {
    this.llH = paramd;
  }

  public void setOneTimeVideoTextureUpdateCallback(e.e parame)
  {
    this.vvr = parame;
  }

  public void setPlayProgressCallback(boolean paramBoolean)
  {
  }

  public void setScaleType(h.d paramd)
  {
    AppMethodBeat.i(118037);
    this.vvu.setScaleType(paramd);
    requestLayout();
    AppMethodBeat.o(118037);
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
    AppMethodBeat.i(118022);
    this.vvD = paramString;
    this.ief = false;
    bnS();
    requestLayout();
    AppMethodBeat.o(118022);
  }

  public final boolean start()
  {
    AppMethodBeat.i(118032);
    boolean bool;
    if (this.mSurface == null)
    {
      ab.w("MicroMsg.VideoTextureView", "%d it surface not ready, do not start", new Object[] { Integer.valueOf(hashCode()) });
      this.llL = true;
      this.ief = true;
      AppMethodBeat.o(118032);
      bool = false;
    }
    while (true)
    {
      return bool;
      if (this.startTime == 0L);
      for (long l = bo.anT(); ; l = this.startTime)
      {
        this.startTime = l;
        ab.i("MicroMsg.VideoTextureView", "start %d mIsPrepared %b pauseWhenUpdated %b", new Object[] { Long.valueOf(this.startTime), Boolean.valueOf(this.vvE), Boolean.valueOf(this.llM) });
        if ((this.ieC == null) || (!this.vvE))
          break label180;
        if (this.llM)
        {
          this.llM = false;
          setMute(this.eif);
        }
        this.ieC.start();
        this.ief = true;
        AppMethodBeat.o(118032);
        bool = true;
        break;
      }
      label180: if ((this.ieC == null) && (this.vvE))
      {
        this.ief = true;
        bnS();
        requestLayout();
        AppMethodBeat.o(118032);
        bool = true;
      }
      else
      {
        this.ief = true;
        AppMethodBeat.o(118032);
        bool = false;
      }
    }
  }

  public final void stop()
  {
    AppMethodBeat.i(118023);
    long l1;
    if (this.vvI > 0L)
      l1 = this.vvI - this.startTime;
    while (true)
    {
      long l2 = bo.anT() - this.startTime;
      long l3;
      if (l1 > l2)
      {
        l3 = l2;
        int i = (int)l3 * 1000;
        int j = i;
        if (i > getDuration())
          j = getDuration();
        ab.i("MicroMsg.VideoTextureView", "stop : dur:%d stop:%d comp:%d", new Object[] { Integer.valueOf(getDuration()), Long.valueOf(l2), Long.valueOf(l1) });
        if (this.llE != null)
          this.llE.dG(j, getDuration());
        dlC();
        this.vvu.reset();
      }
      try
      {
        if ((this.mSurface != null) && (this.vvE))
        {
          Object localObject1 = getSurfaceTexture();
          if (localObject1 != null)
          {
            ab.i("MicroMsg.VideoTextureView", "%d releaseSurface", new Object[] { Integer.valueOf(hashCode()) });
            EGL10 localEGL10 = (EGL10)EGLContext.getEGL();
            EGLDisplay localEGLDisplay = localEGL10.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
            localEGL10.eglInitialize(localEGLDisplay, null);
            Object localObject2 = new EGLConfig[1];
            int[] arrayOfInt = new int[1];
            localEGL10.eglChooseConfig(localEGLDisplay, new int[] { 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12352, 4, 12344, 0, 12344 }, (EGLConfig[])localObject2, 1, arrayOfInt);
            arrayOfInt = localObject2[0];
            localObject2 = localEGL10.eglCreateContext(localEGLDisplay, arrayOfInt, EGL10.EGL_NO_CONTEXT, new int[] { 12440, 2, 12344 });
            localObject1 = localEGL10.eglCreateWindowSurface(localEGLDisplay, arrayOfInt, localObject1, new int[] { 12344 });
            localEGL10.eglMakeCurrent(localEGLDisplay, (EGLSurface)localObject1, (EGLSurface)localObject1, (EGLContext)localObject2);
            GLES20.glClearColor(0.0F, 0.0F, 0.0F, 1.0F);
            GLES20.glClear(16384);
            localEGL10.eglSwapBuffers(localEGLDisplay, (EGLSurface)localObject1);
            localEGL10.eglDestroySurface(localEGLDisplay, (EGLSurface)localObject1);
            localObject1 = EGL10.EGL_NO_SURFACE;
            localEGL10.eglMakeCurrent(localEGLDisplay, (EGLSurface)localObject1, (EGLSurface)localObject1, EGL10.EGL_NO_CONTEXT);
            localEGL10.eglDestroyContext(localEGLDisplay, (EGLContext)localObject2);
            localEGL10.eglTerminate(localEGLDisplay);
          }
        }
        this.vvD = "";
        this.vvJ = 0;
        this.vvE = false;
        this.ief = false;
        this.llC = 0L;
        AppMethodBeat.o(118023);
        return;
        l1 = 2147483647L;
        continue;
        l3 = l1;
      }
      catch (Exception localException)
      {
        while (true)
          ab.printErrStackTrace("MicroMsg.VideoTextureView", localException, "release surface", new Object[0]);
      }
    }
  }

  public final boolean w(Context paramContext, boolean paramBoolean)
  {
    AppMethodBeat.i(118033);
    paramBoolean = start();
    AppMethodBeat.o(118033);
    return paramBoolean;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.tools.VideoTextureView
 * JD-Core Version:    0.6.2
 */