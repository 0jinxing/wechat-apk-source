package com.tencent.mm.pluginsdk.ui.tools;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.SurfaceTexture;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.Surface;
import android.view.TextureView.SurfaceTextureListener;
import android.widget.RelativeLayout.LayoutParams;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.n.b;
import com.tencent.mm.plugin.n.c;
import com.tencent.mm.plugin.n.i;
import com.tencent.mm.plugin.n.j;
import com.tencent.mm.plugin.n.k;
import com.tencent.mm.pluginsdk.ui.h.d;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.base.MMTextureView;
import java.io.FileDescriptor;

public class VideoPlayerTextureView extends MMTextureView
  implements e
{
  protected boolean VN;
  protected long bfp;
  protected long bgY;
  protected boolean eif;
  protected FileDescriptor fd;
  protected i llA;
  protected boolean llB;
  protected long llC;
  protected boolean llD;
  protected e.a llE;
  protected e.d llH;
  protected boolean llI;
  protected boolean llJ;
  protected boolean llK;
  protected boolean llL;
  protected boolean llM;
  protected c llO;
  protected Surface mSurface;
  protected int mVideoHeight;
  protected int mVideoWidth;
  protected b orK;
  protected String path;
  protected int vvp;
  protected boolean vvq;
  protected e.e vvr;
  private e.c vvs;
  private TextureView.SurfaceTextureListener vvt;
  protected r vvu;

  public VideoPlayerTextureView(Context paramContext)
  {
    this(paramContext, null);
  }

  public VideoPlayerTextureView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }

  public VideoPlayerTextureView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    AppMethodBeat.i(117988);
    this.mVideoHeight = 0;
    this.mVideoWidth = 0;
    this.vvp = 0;
    this.VN = false;
    this.llB = true;
    this.llC = 0L;
    this.vvq = false;
    this.llD = false;
    this.llI = false;
    this.llJ = false;
    this.llK = false;
    this.llL = false;
    this.llM = false;
    this.llO = new VideoPlayerTextureView.1(this);
    this.vvt = new TextureView.SurfaceTextureListener()
    {
      public final void onSurfaceTextureAvailable(SurfaceTexture paramAnonymousSurfaceTexture, int paramAnonymousInt1, int paramAnonymousInt2)
      {
        AppMethodBeat.i(117984);
        VideoPlayerTextureView.this.b(paramAnonymousSurfaceTexture, paramAnonymousInt1, paramAnonymousInt2);
        AppMethodBeat.o(117984);
      }

      public final boolean onSurfaceTextureDestroyed(SurfaceTexture paramAnonymousSurfaceTexture)
      {
        AppMethodBeat.i(117986);
        ab.i("MicroMsg.VideoPlayerTextureView", "%d surface[%d] destroyed", new Object[] { Integer.valueOf(VideoPlayerTextureView.this.hashCode()), Integer.valueOf(paramAnonymousSurfaceTexture.hashCode()) });
        VideoPlayerTextureView.this.mSurface = null;
        VideoPlayerTextureView.this.llL = false;
        VideoPlayerTextureView.this.llM = false;
        if (VideoPlayerTextureView.this.llA != null)
          if (VideoPlayerTextureView.this.isPlaying())
          {
            VideoPlayerTextureView.this.llL = true;
            VideoPlayerTextureView.this.llA.pause();
          }
        while (true)
        {
          AppMethodBeat.o(117986);
          return false;
          VideoPlayerTextureView.this.llL = false;
        }
      }

      public final void onSurfaceTextureSizeChanged(SurfaceTexture paramAnonymousSurfaceTexture, int paramAnonymousInt1, int paramAnonymousInt2)
      {
        AppMethodBeat.i(117985);
        ab.d("MicroMsg.VideoPlayerTextureView", "surface[%d] size changed [%d, %d]", new Object[] { Integer.valueOf(paramAnonymousSurfaceTexture.hashCode()), Integer.valueOf(paramAnonymousInt1), Integer.valueOf(paramAnonymousInt2) });
        VideoPlayerTextureView.this.dlB();
        AppMethodBeat.o(117985);
      }

      public final void onSurfaceTextureUpdated(SurfaceTexture paramAnonymousSurfaceTexture)
      {
        AppMethodBeat.i(117987);
        VideoPlayerTextureView.this.i(paramAnonymousSurfaceTexture);
        AppMethodBeat.o(117987);
      }
    };
    this.vvu = new r();
    this.mVideoWidth = 0;
    this.mVideoHeight = 0;
    setSurfaceTextureListener(this.vvt);
    setFocusable(true);
    setFocusableInTouchMode(true);
    AppMethodBeat.o(117988);
  }

  public void B(double paramDouble)
  {
    AppMethodBeat.i(117999);
    if (this.llA != null)
      this.llA.yI((int)paramDouble);
    AppMethodBeat.o(117999);
  }

  protected void b(SurfaceTexture paramSurfaceTexture, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(118004);
    ab.i("MicroMsg.VideoPlayerTextureView", "%d surface[%d] available [%d, %d] pauseByDestroyed[%b]", new Object[] { Integer.valueOf(hashCode()), Integer.valueOf(paramSurfaceTexture.hashCode()), Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Boolean.valueOf(this.llL) });
    try
    {
      dAh();
      Surface localSurface = new android/view/Surface;
      localSurface.<init>(paramSurfaceTexture);
      this.mSurface = localSurface;
      if ((this.llA == null) || (!this.VN))
        bnS();
      while (true)
      {
        dlB();
        if (this.llH != null)
          this.llH.akY();
        AppMethodBeat.o(118004);
        return;
        this.llA.f(this.mSurface);
        if (!this.llL)
          break;
        this.llA.start();
        this.llL = false;
      }
    }
    catch (Exception paramSurfaceTexture)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.VideoPlayerTextureView", paramSurfaceTexture, "onSurfaceTextureAvailable failed", new Object[0]);
        AppMethodBeat.o(118004);
        continue;
        this.llM = true;
        this.llC = 0L;
        this.llA.setMute(true);
        this.llA.start();
      }
    }
  }

  public final void bPd()
  {
    AppMethodBeat.i(118003);
    if ((this.llA != null) && (this.VN) && (this.mSurface != null))
    {
      ab.i("MicroMsg.VideoPlayerTextureView", "%d flush surface start ", new Object[] { Integer.valueOf(hashCode()) });
      i locali = this.llA;
      if (locali.orX != null)
        locali.orX.bPd();
    }
    AppMethodBeat.o(118003);
  }

  protected void bnS()
  {
    AppMethodBeat.i(118002);
    ab.i("MicroMsg.VideoPlayerTextureView", "%d open video [%s] [%s]", new Object[] { Integer.valueOf(hashCode()), this.path, this.mSurface });
    if (this.llA != null)
    {
      this.llA.orY = null;
      this.llA.orX.stop();
      this.llA.release();
      this.llA = null;
    }
    if (((bo.isNullOrNil(this.path)) && ((this.fd == null) || (!this.fd.valid()))) || (this.mSurface == null))
    {
      ab.w("MicroMsg.VideoPlayerTextureView", "%d open video but path is null or mSurface is null", new Object[] { Integer.valueOf(hashCode()) });
      AppMethodBeat.o(118002);
    }
    while (true)
    {
      return;
      while (true)
      {
        try
        {
          this.VN = false;
          i locali1 = new com/tencent/mm/plugin/n/i;
          locali1.<init>(Looper.getMainLooper());
          this.llA = locali1;
          if (bo.isNullOrNil(this.path))
            break label316;
          this.llA.setPath(this.path);
          this.llA.setIOnlineCache(this.orK);
          this.llA.setNeedResetExtractor(this.llI);
          this.llA.setIsOnlineVideoType(this.llJ);
          this.llA.orY = this.llO;
          this.llA.setSurface(this.mSurface);
          this.llA.iU(this.llK);
          if (this.mSurface == null)
            break label371;
          this.llA.prepare();
          AppMethodBeat.o(118002);
        }
        catch (Exception localException)
        {
          ab.printErrStackTrace("MicroMsg.VideoPlayerTextureView", localException, "prepare async error %s", new Object[] { localException.getMessage() });
          if (this.llE != null)
            this.llE.onError(-1, -1);
          AppMethodBeat.o(118002);
        }
        break;
        label316: if ((this.fd != null) && (this.fd.valid()))
        {
          i locali2 = this.llA;
          FileDescriptor localFileDescriptor = this.fd;
          long l1 = this.bfp;
          long l2 = this.bgY;
          locali2.orX.osg.a(localFileDescriptor, l1, l2);
        }
      }
      label371: if (this.llD)
        this.llA.prepare();
      AppMethodBeat.o(118002);
    }
  }

  public final void d(double paramDouble, boolean paramBoolean)
  {
    AppMethodBeat.i(118000);
    this.llB = paramBoolean;
    B(paramDouble);
    AppMethodBeat.o(118000);
  }

  public final void dlA()
  {
    AppMethodBeat.i(117993);
    ab.i("MicroMsg.VideoPlayerTextureView", "%d reset source ", new Object[] { Integer.valueOf(hashCode()) });
    if (this.llA != null)
    {
      i locali = this.llA;
      if (locali.orX != null)
        locali.orX.bPc();
    }
    AppMethodBeat.o(117993);
  }

  protected final void dlB()
  {
    AppMethodBeat.i(118006);
    RelativeLayout.LayoutParams localLayoutParams = (RelativeLayout.LayoutParams)getLayoutParams();
    if (localLayoutParams != null)
    {
      localLayoutParams.addRule(13);
      setLayoutParams(localLayoutParams);
    }
    AppMethodBeat.o(118006);
  }

  protected void finalize()
  {
    AppMethodBeat.i(138351);
    if ((this.mSurface != null) && (this.mSurface.isValid()))
      this.mSurface.release();
    AppMethodBeat.o(138351);
  }

  public int getCurrentPosition()
  {
    AppMethodBeat.i(117998);
    int i;
    if (this.llA != null)
    {
      i = this.llA.bPb();
      AppMethodBeat.o(117998);
    }
    while (true)
    {
      return i;
      i = 0;
      AppMethodBeat.o(117998);
    }
  }

  public int getDuration()
  {
    if (this.llA != null);
    for (int i = (int)this.llA.orX.bfi; ; i = 0)
      return i;
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
    return this.path;
  }

  protected void i(SurfaceTexture paramSurfaceTexture)
  {
    AppMethodBeat.i(118005);
    if ((this.llM) && (this.llC > 0L) && (this.llA != null))
    {
      this.llA.pause();
      this.llA.setMute(this.eif);
      this.llM = false;
    }
    if ((this.llC > 0L) && (this.vvr != null))
    {
      ab.i("MicroMsg.VideoPlayerTextureView", "%d notify surface update", new Object[] { Integer.valueOf(hashCode()) });
      this.vvr.bQL();
      this.vvr = null;
    }
    this.llC = System.currentTimeMillis();
    AppMethodBeat.o(118005);
  }

  public final boolean isPlaying()
  {
    AppMethodBeat.i(117991);
    boolean bool;
    if (this.llA != null)
    {
      bool = this.llA.isPlaying();
      AppMethodBeat.o(117991);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(117991);
    }
  }

  public final void onDetach()
  {
  }

  protected void onMeasure(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(118008);
    if ((this.mVideoWidth == 0) || (this.mVideoHeight == 0))
    {
      setMeasuredDimension(1, 1);
      AppMethodBeat.o(118008);
    }
    while (true)
    {
      return;
      paramInt1 = getDefaultSize(1, paramInt1);
      int i = getDefaultSize(1, paramInt2);
      int j = this.mVideoWidth;
      paramInt2 = this.mVideoHeight;
      this.vvu.I(paramInt1, i, j, paramInt2);
      paramInt2 = this.vvu.iew;
      paramInt1 = this.vvu.iex;
      if ((this.vvp == 90) || (this.vvp == 270))
      {
        Matrix localMatrix = new Matrix();
        localMatrix.set(getMatrix());
        float f1 = paramInt2 / 2.0F;
        float f2 = paramInt1 / 2.0F;
        float f3 = paramInt1 / paramInt2;
        if ((getScaleX() != 1.0F) || (getScaleY() != 1.0F))
          localMatrix.setScale(getScaleX(), getScaleY(), f1, f2);
        localMatrix.postRotate(this.vvp, f1, f2);
        localMatrix.postScale(1.0F / f3, f3, f1, f2);
        setTransform(localMatrix);
      }
      setMeasuredDimension(paramInt2, paramInt1);
      AppMethodBeat.o(118008);
    }
  }

  public void pause()
  {
    AppMethodBeat.i(117997);
    if ((this.llA != null) && (this.llA.isPlaying()))
      this.llA.pause();
    this.llL = false;
    AppMethodBeat.o(117997);
  }

  public void setForceScaleFullScreen(boolean paramBoolean)
  {
    this.vvq = paramBoolean;
    this.vvu.vvq = this.vvq;
  }

  public void setIOnlineCache(b paramb)
  {
    this.orK = paramb;
  }

  public void setIsOnlineVideoType(boolean paramBoolean)
  {
    AppMethodBeat.i(117990);
    this.llJ = paramBoolean;
    if (this.llA != null)
      this.llA.setIsOnlineVideoType(paramBoolean);
    AppMethodBeat.o(117990);
  }

  public void setLoop(boolean paramBoolean)
  {
  }

  public void setMute(boolean paramBoolean)
  {
    AppMethodBeat.i(118001);
    this.eif = paramBoolean;
    if (this.llA != null)
    {
      ab.i("MicroMsg.VideoPlayerTextureView", "%d set mute [%b]", new Object[] { Integer.valueOf(hashCode()), Boolean.valueOf(paramBoolean) });
      this.llA.setMute(paramBoolean);
    }
    AppMethodBeat.o(118001);
  }

  public void setNeedResetExtractor(boolean paramBoolean)
  {
    AppMethodBeat.i(117989);
    this.llI = paramBoolean;
    if (this.llA != null)
      this.llA.setNeedResetExtractor(paramBoolean);
    AppMethodBeat.o(117989);
  }

  public void setOnInfoCallback(e.b paramb)
  {
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

  public void setOpenWithNoneSurface(boolean paramBoolean)
  {
    this.llD = paramBoolean;
  }

  public void setPlayProgressCallback(boolean paramBoolean)
  {
  }

  public void setScaleType(h.d paramd)
  {
    AppMethodBeat.i(118007);
    this.vvu.setScaleType(paramd);
    requestLayout();
    AppMethodBeat.o(118007);
  }

  public void setThumb(Bitmap paramBitmap)
  {
  }

  public void setUseMp4Extrator(boolean paramBoolean)
  {
    if (this.llA != null)
      this.llK = paramBoolean;
  }

  public void setVideoCallback(e.a parama)
  {
    this.llE = parama;
  }

  public void setVideoPath(String paramString)
  {
    AppMethodBeat.i(117992);
    ab.i("MicroMsg.VideoPlayerTextureView", "%d set video path [%s]", new Object[] { Integer.valueOf(hashCode()), paramString });
    this.path = paramString;
    bnS();
    requestLayout();
    AppMethodBeat.o(117992);
  }

  public boolean start()
  {
    boolean bool1 = true;
    AppMethodBeat.i(117994);
    if ((this.llA != null) && (this.VN))
    {
      i = hashCode();
      boolean bool2 = this.llM;
      boolean bool3 = this.llL;
      if (this.mSurface != null)
      {
        bool4 = true;
        ab.i("MicroMsg.VideoPlayerTextureView", "%d player start pauseWhenUpdated[%b] pauseByDestroyed[%b] surface[%b]", new Object[] { Integer.valueOf(i), Boolean.valueOf(bool2), Boolean.valueOf(bool3), Boolean.valueOf(bool4) });
        if (this.mSurface != null)
          break label120;
        this.llL = true;
        AppMethodBeat.o(117994);
        bool4 = bool1;
      }
      while (true)
      {
        return bool4;
        bool4 = false;
        break;
        label120: if (this.llM)
        {
          this.llL = true;
          this.llM = false;
          setMute(this.eif);
          AppMethodBeat.o(117994);
          bool4 = bool1;
        }
        else
        {
          this.llA.start();
          AppMethodBeat.o(117994);
          bool4 = bool1;
        }
      }
    }
    int i = hashCode();
    if (this.llA == null);
    for (boolean bool4 = true; ; bool4 = false)
    {
      ab.w("MicroMsg.VideoPlayerTextureView", "%d player is null[%b] or it prepared [%b]", new Object[] { Integer.valueOf(i), Boolean.valueOf(bool4), Boolean.valueOf(this.VN) });
      AppMethodBeat.o(117994);
      bool4 = false;
      break;
    }
  }

  public void stop()
  {
    AppMethodBeat.i(117996);
    ab.i("MicroMsg.VideoPlayerTextureView", "%d player stop [%s]", new Object[] { Integer.valueOf(hashCode()), bo.dpG() });
    if (this.llA != null)
    {
      this.llA.orY = null;
      this.llA.orX.stop();
      this.llA.release();
      this.llA = null;
    }
    this.vvp = 0;
    this.mVideoHeight = 0;
    this.mVideoWidth = 0;
    this.vvu.reset();
    this.VN = false;
    this.path = null;
    this.fd = null;
    this.llC = 0L;
    AppMethodBeat.o(117996);
  }

  public final boolean w(Context paramContext, boolean paramBoolean)
  {
    AppMethodBeat.i(117995);
    paramBoolean = start();
    AppMethodBeat.o(117995);
    return paramBoolean;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.tools.VideoPlayerTextureView
 * JD-Core Version:    0.6.2
 */