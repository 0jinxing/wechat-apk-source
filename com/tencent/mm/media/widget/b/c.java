package com.tencent.mm.media.widget.b;

import android.graphics.Point;
import android.graphics.SurfaceTexture;
import android.opengl.EGLContext;
import android.view.Surface;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.audio.b.c.a;
import com.tencent.mm.media.g.a.d;
import com.tencent.mm.media.g.a.i;
import com.tencent.mm.modelcontrol.VideoTransPara;
import com.tencent.mm.plugin.mmsight.model.a.d.a;
import com.tencent.mm.plugin.mmsight.model.a.d.c;
import com.tencent.mm.plugin.mmsight.model.a.m;
import com.tencent.mm.plugin.mmsight.model.a.s;
import com.tencent.mm.plugin.mmsight.model.f;
import com.tencent.mm.plugin.sight.base.SightVideoJNI;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bo;

public final class c
  implements b
{
  private static final Object fdj;
  private int bMU;
  private SurfaceTexture bsb;
  protected String cvZ;
  protected boolean eNa;
  protected int eTa;
  private EGLContext fag;
  private final Object fcD;
  protected String fcE;
  protected int fcF;
  protected float fcG;
  private int fcH;
  private float fcI;
  protected com.tencent.mm.plugin.mmsight.model.a.c fcJ;
  protected com.tencent.mm.media.d.b fcK;
  protected int fcL;
  protected int fcM;
  protected int fcN;
  protected int fcO;
  protected int fcP;
  protected s fcQ;
  protected int fcR;
  protected String fcS;
  protected boolean fcT;
  protected String fcU;
  protected boolean fcV;
  protected com.tencent.mm.plugin.mmsight.model.b fcW;
  protected com.tencent.mm.plugin.mmsight.model.b fcX;
  protected VideoTransPara fcY;
  protected m fcZ;
  protected boolean fda;
  protected boolean fdb;
  protected int fdc;
  protected d.a fdd;
  protected Runnable fde;
  protected boolean fdf;
  protected boolean fdg;
  protected boolean fdh;
  private com.tencent.mm.media.g.a fdi;
  protected f fdk;
  private boolean isRecording;
  protected String mFileName;
  protected String thumbPath;

  static
  {
    AppMethodBeat.i(12776);
    fdj = new Object();
    AppMethodBeat.o(12776);
  }

  public c(VideoTransPara paramVideoTransPara, com.tencent.mm.media.h.a parama)
  {
    this(paramVideoTransPara, parama, null, -1);
  }

  public c(VideoTransPara paramVideoTransPara, com.tencent.mm.media.h.a parama, EGLContext paramEGLContext, int paramInt)
  {
    AppMethodBeat.i(12751);
    this.fcD = new Object();
    this.fcE = "";
    this.fcF = 0;
    this.fcG = 0.0F;
    this.fcH = -1;
    this.fcI = -1.0F;
    this.fcL = 480;
    this.fcM = 640;
    this.fcN = 1600000;
    this.fcO = 480;
    this.fcP = 640;
    this.eTa = -1;
    this.fcS = null;
    this.fcT = false;
    this.thumbPath = null;
    this.fcU = null;
    this.fcV = false;
    this.fcW = new com.tencent.mm.plugin.mmsight.model.b("yuvRecorderWriteData");
    this.fcX = new com.tencent.mm.plugin.mmsight.model.b("frameCountCallback");
    this.eNa = false;
    this.fda = false;
    this.cvZ = "";
    this.fdb = false;
    this.fdc = 0;
    this.fde = null;
    this.fdf = false;
    this.fdg = true;
    this.fdh = false;
    this.isRecording = false;
    this.fdi = null;
    this.fag = null;
    this.bMU = -1;
    this.fdk = new c.1(this);
    this.fcY = paramVideoTransPara;
    this.fcL = paramVideoTransPara.width;
    this.fcM = paramVideoTransPara.height;
    this.fcQ = new s();
    paramVideoTransPara = com.tencent.mm.media.i.c.faj;
    com.tencent.mm.media.i.c.Vv();
    ab.i("MicroMsg.Media.MediaCodecMP4MuxRecorder", "create MediaCodecMP4MuxRecorder, targetWidth: %s, targetHeight: %s", new Object[] { Integer.valueOf(this.fcL), Integer.valueOf(this.fcM) });
    this.fag = paramEGLContext;
    this.fdi = new com.tencent.mm.media.g.a(parama);
    this.bMU = paramInt;
    ab.c("MicroMsg.Media.MediaCodecMP4MuxRecorder", "textureId : ".concat(String.valueOf(paramInt)), new Object[0]);
    AppMethodBeat.o(12751);
  }

  private void WH()
  {
    AppMethodBeat.i(12753);
    int i = this.fcL;
    int j = this.fcM;
    this.fdi.cg(i, j);
    this.fdi.ka(this.fcR);
    this.fdi.ch(this.fcO, this.fcP);
    ab.i("MicroMsg.Media.MediaCodecMP4MuxRecorder", "outputWidth: %s, outputHeight: %s, cameraPreviewWidth: %s, cameraPreviewHeight: %s, getDataRotate: %s", new Object[] { Integer.valueOf(i), Integer.valueOf(j), Integer.valueOf(this.fcO), Integer.valueOf(this.fcP), Integer.valueOf(this.fcR) });
    AppMethodBeat.o(12753);
  }

  private boolean WS()
  {
    boolean bool = false;
    AppMethodBeat.i(12771);
    if ((this.fcQ.oxa == d.c.ovB) || (this.fcQ.oxa == d.c.ovC))
    {
      if (this.fcQ.oxa == d.c.ovC)
      {
        this.fcQ.oxa = d.c.ovD;
        ab.c("MicroMsg.Media.MediaCodecMP4MuxRecorder", "forward one more frame", new Object[0]);
      }
      if (this.fcJ != null)
        this.fcJ.bPM();
      this.fcX.jl(1L);
      this.fcW.jl(1L);
      bool = true;
      AppMethodBeat.o(12771);
    }
    while (true)
    {
      return bool;
      AppMethodBeat.o(12771);
    }
  }

  private boolean kn(int paramInt)
  {
    AppMethodBeat.i(12752);
    long l = bo.yz();
    this.fcN = this.fcY.videoBitrate;
    this.eTa = SightVideoJNI.initDataBufferForMMSightLock(this.fcO, this.fcP, paramInt, this.fcL, this.fcM, this.fcY.fps, this.fcN, this.fcY.fzV, 8, this.fcY.fzU, 23.0F, false, false, this.fcY.duration, false);
    ab.i("MicroMsg.Media.MediaCodecMP4MuxRecorder", "init, bufId: %s", new Object[] { Integer.valueOf(this.eTa) });
    boolean bool;
    if (this.eTa < 0)
    {
      ab.e("MicroMsg.Media.MediaCodecMP4MuxRecorder", "init failed!");
      bool = false;
      AppMethodBeat.o(12752);
    }
    while (true)
    {
      return bool;
      this.fcR = paramInt;
      ??? = new com.tencent.mm.media.b.c();
      if (((com.tencent.mm.media.b.c)???).eTn)
      {
        ab.e("MicroMsg.Media.MediaCodecMP4MuxRecorder", "encodeConfig  InitError");
        bool = false;
        AppMethodBeat.o(12752);
      }
      else
      {
        ab.i("MicroMsg.Media.MediaCodecMP4MuxRecorder", "mTargetRate " + this.fcN + "  videoParams.fps: " + this.fcY.fps + " mTargetHeight:" + this.fcM + " mTargetWidth:" + this.fcL);
        ((com.tencent.mm.media.b.c)???).bitrate = this.fcN;
        ((com.tencent.mm.media.b.c)???).eTk = this.fcY.fps;
        ((com.tencent.mm.media.b.c)???).eTj = this.fcM;
        ((com.tencent.mm.media.b.c)???).eTi = this.fcL;
        try
        {
          Object localObject2 = new com/tencent/mm/media/d/e;
          Object localObject4 = new com/tencent/mm/media/widget/b/c$2;
          ((c.2)localObject4).<init>(this);
          ((com.tencent.mm.media.d.e)localObject2).<init>((com.tencent.mm.media.b.c)???, true, (a.f.a.b)localObject4);
          this.fcK = ((com.tencent.mm.media.d.b)localObject2);
          com.tencent.mm.media.g.a locala = this.fdi;
          localObject2 = this.fcK.getInputSurface();
          ??? = this.fag;
          localObject4 = new com/tencent/mm/media/widget/b/c$3;
          ((c.3)localObject4).<init>(this);
          a.f.b.j.p(localObject2, "surface");
          locala.aOO = ((Surface)localObject2);
          Object localObject5 = locala.TAG;
          StringBuilder localStringBuilder = new java/lang/StringBuilder;
          localStringBuilder.<init>();
          ab.i((String)localObject5, locala.hashCode() + " initWithSurface, eglContext:" + ??? + ", surface:" + localObject2 + ", waitNewFrame:false, callback:false");
          localObject5 = new com/tencent/mm/media/g/a$d;
          ((a.d)localObject5).<init>(locala, (EGLContext)???, (Surface)localObject2, (a.f.a.b)localObject4);
          locala.b((a.f.a.a)localObject5);
          synchronized (fdj)
          {
            try
            {
              fdj.wait(500L);
              ??? = this.fdi;
              localObject2 = new com/tencent/mm/media/widget/b/c$4;
              ((c.4)localObject2).<init>(this);
              ((com.tencent.mm.media.g.a)???).eXd = ((a.f.a.b)localObject2);
              WH();
              ??? = new com/tencent/mm/media/widget/b/a;
              ((a)???).<init>(this.fcY.audioSampleRate, this.fcY.fzS);
              this.fcJ = ((com.tencent.mm.plugin.mmsight.model.a.c)???);
              this.fcJ.iW(this.fdf);
              paramInt = this.fcJ.q(this.eTa, com.tencent.mm.plugin.sight.base.d.WP(this.fcE));
              ab.i("MicroMsg.Media.MediaCodecMP4MuxRecorder", "initImpl used %sms", new Object[] { Long.valueOf(bo.az(l)) });
              if (paramInt == 0)
                break label680;
              ??? = com.tencent.mm.media.i.c.faj;
              com.tencent.mm.media.i.c.Vy();
              bool = false;
              AppMethodBeat.o(12752);
            }
            catch (Exception localException2)
            {
              while (true)
                ab.printErrStackTrace("MicroMsg.Media.MediaCodecMP4MuxRecorder", localException2, "initSurfaceLock wait error", new Object[0]);
            }
          }
        }
        catch (Exception localException1)
        {
          ab.printErrStackTrace("MicroMsg.Media.MediaCodecMP4MuxRecorder", localException1, "init encoder error", new Object[0]);
          com.tencent.mm.media.i.c localc = com.tencent.mm.media.i.c.faj;
          com.tencent.mm.media.i.c.Vw();
          bool = false;
          AppMethodBeat.o(12752);
        }
        continue;
        label680: bool = true;
        AppMethodBeat.o(12752);
      }
    }
  }

  public final String Aq()
  {
    AppMethodBeat.i(12757);
    String str = bo.bc(this.cvZ, "");
    AppMethodBeat.o(12757);
    return str;
  }

  public final void G(int paramInt1, int paramInt2, int paramInt3)
  {
    AppMethodBeat.i(12766);
    ab.i("MicroMsg.Media.MediaCodecMP4MuxRecorder", "resume, cameraOrientation: %s, cameraPreviewWidth:%s, cameraPreviewHeight:%s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
    this.fcR = paramInt1;
    this.fcO = paramInt2;
    this.fcP = paramInt3;
    this.fdi.ka(this.fcR);
    WH();
    if ((this.fcQ != null) && (this.fcQ.oxa == d.c.ovJ))
      this.fcQ.a(d.c.ovB);
    AppMethodBeat.o(12766);
  }

  public final void WG()
  {
    AppMethodBeat.i(12770);
    if ((this.bMU < 0) || (!WS()))
    {
      if ((this.bsb != null) && (WS()))
        break label58;
      AppMethodBeat.o(12770);
    }
    while (true)
    {
      return;
      this.fdi.s(this.bMU, System.nanoTime());
      break;
      label58: com.tencent.mm.media.g.a locala = this.fdi;
      SurfaceTexture localSurfaceTexture = this.bsb;
      a.f.b.j.p(localSurfaceTexture, "surfaceTexture");
      locala.b((a.f.a.a)new a.i(locala, localSurfaceTexture));
      AppMethodBeat.o(12770);
    }
  }

  public final String WI()
  {
    return this.fcU;
  }

  public final float WJ()
  {
    return this.fcG;
  }

  public final long WK()
  {
    AppMethodBeat.i(12761);
    long l;
    if (this.fcK != null)
    {
      l = this.fcK.UQ();
      AppMethodBeat.o(12761);
    }
    while (true)
    {
      return l;
      l = 0L;
      AppMethodBeat.o(12761);
    }
  }

  public final d.c WL()
  {
    return this.fcQ.oxa;
  }

  public final int WM()
  {
    AppMethodBeat.i(12763);
    int i = Math.round(this.fcF / 1000.0F);
    AppMethodBeat.o(12763);
    return i;
  }

  public final Point WN()
  {
    AppMethodBeat.i(12764);
    Point localPoint = new Point(this.fcO, this.fcP);
    AppMethodBeat.o(12764);
    return localPoint;
  }

  public final int WO()
  {
    return this.fcR;
  }

  public final boolean WP()
  {
    return this.fda;
  }

  public final c.a WQ()
  {
    AppMethodBeat.i(12767);
    c.a locala;
    if (this.fcJ != null)
    {
      locala = this.fcJ.bPN();
      AppMethodBeat.o(12767);
    }
    while (true)
    {
      return locala;
      locala = null;
      AppMethodBeat.o(12767);
    }
  }

  public final void WR()
  {
    this.fdg = false;
  }

  public final String Wy()
  {
    return this.thumbPath;
  }

  public final void a(d.a parama)
  {
    this.fdd = parama;
  }

  public final void af(float paramFloat)
  {
    AppMethodBeat.i(12769);
    ab.i("MicroMsg.Media.MediaCodecMP4MuxRecorder", "overrideFps: %s", new Object[] { Float.valueOf(paramFloat) });
    this.fcI = paramFloat;
    AppMethodBeat.o(12769);
  }

  public final int b(int paramInt1, boolean paramBoolean, int paramInt2)
  {
    AppMethodBeat.i(12755);
    ab.i("MicroMsg.Media.MediaCodecMP4MuxRecorder", "start, cameraOrientation: %s, isLandscape: %s, degree: %s", new Object[] { Integer.valueOf(paramInt1), Boolean.valueOf(paramBoolean), Integer.valueOf(paramInt2) });
    this.fcW.reset();
    this.fcF = 0;
    this.fcX.reset();
    this.fcT = false;
    this.fdb = paramBoolean;
    this.fdc = paramInt2;
    this.fcQ.a(d.c.ovA);
    if (bo.isNullOrNil(this.fcE))
    {
      ab.e("MicroMsg.Media.MediaCodecMP4MuxRecorder", "start error, mCurRecordPath is null!!");
      paramInt1 = -1;
      AppMethodBeat.o(12755);
    }
    while (true)
    {
      return paramInt1;
      try
      {
        this.mFileName = com.tencent.mm.vfs.e.atd(this.fcE);
        Object localObject1 = com.tencent.mm.vfs.e.atb(this.fcE);
        Object localObject2 = localObject1;
        if (!((String)localObject1).endsWith("/"))
        {
          localObject2 = new java/lang/StringBuilder;
          ((StringBuilder)localObject2).<init>();
          localObject2 = (String)localObject1 + "/";
        }
        localObject1 = new java/lang/StringBuilder;
        ((StringBuilder)localObject1).<init>();
        this.fcS = ((String)localObject2 + "tempRotate.mp4");
        ab.i("MicroMsg.Media.MediaCodecMP4MuxRecorder", "mCurRecordPath: %s, tempRotateFilePath: %s", new Object[] { this.fcE, this.fcS });
        this.fcR = paramInt1;
        if (!this.eNa)
        {
          kn(paramInt1);
          this.eNa = true;
        }
        if ((!this.fdh) && (!this.fdf) && (this.fcJ != null))
        {
          paramInt1 = this.fcJ.a(new c.5(this));
          ab.i("MicroMsg.Media.MediaCodecMP4MuxRecorder", "start aacRecorder ret: %s", new Object[] { Integer.valueOf(paramInt1) });
          this.fda = false;
          if (paramInt1 != 0)
          {
            this.fcQ.a(d.c.ovH);
            AppMethodBeat.o(12755);
          }
        }
      }
      catch (Exception localException)
      {
        while (true)
        {
          ab.e("MicroMsg.Media.MediaCodecMP4MuxRecorder", "retrieve file name error: %s", new Object[] { localException.getMessage() });
          continue;
          this.fcQ.a(d.c.ovI);
          continue;
          ab.i("MicroMsg.Media.MediaCodecMP4MuxRecorder", "start yuvRecorder with mute");
          this.fcQ.a(d.c.ovB);
          this.fda = false;
          paramInt1 = 0;
        }
      }
    }
  }

  public final void cancel()
  {
    AppMethodBeat.i(12758);
    ab.i("MicroMsg.Media.MediaCodecMP4MuxRecorder", "cancel record");
    if ((this.fcK == null) || ((this.fcJ == null) && (!this.fdh)))
    {
      ab.e("MicroMsg.Media.MediaCodecMP4MuxRecorder", "error, yuvRecorder or aacRecorder is null");
      AppMethodBeat.o(12758);
      return;
    }
    this.fcQ.a(d.c.ovD);
    this.fcK.UO();
    if (this.fcJ != null)
      this.fcJ.a(new c.7(this));
    if (this.eTa >= 0)
      SightVideoJNI.releaseBigSightDataBufferLock(this.eTa);
    while (true)
    {
      this.fcQ.a(d.c.ovE);
      reset();
      AppMethodBeat.o(12758);
      break;
      ab.e("MicroMsg.Media.MediaCodecMP4MuxRecorder", "why buf id < 0 ? %d", new Object[] { Integer.valueOf(this.eTa) });
    }
  }

  public final void clear()
  {
    AppMethodBeat.i(12759);
    try
    {
      ab.i("MicroMsg.Media.MediaCodecMP4MuxRecorder", "clear");
      if (this.fcJ != null)
        this.fcJ.clear();
      if (this.fdi != null)
        this.fdi.release();
      if (this.fcK != null)
        this.fcK.release();
      AppMethodBeat.o(12759);
      return;
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.Media.MediaCodecMP4MuxRecorder", localException, "clear error: %s", new Object[] { localException.getMessage() });
        AppMethodBeat.o(12759);
      }
    }
  }

  public final void cv(boolean paramBoolean)
  {
    this.fdf = paramBoolean;
  }

  public final String getFileName()
  {
    return this.mFileName;
  }

  public final String getFilePath()
  {
    return this.fcE;
  }

  public final f getFrameDataCallback()
  {
    return this.fdk;
  }

  public final boolean isLandscape()
  {
    return this.fdb;
  }

  public final boolean ko(int paramInt)
  {
    AppMethodBeat.i(12754);
    boolean bool;
    if (!this.eNa)
    {
      ab.i("MicroMsg.Media.MediaCodecMP4MuxRecorder", "preInit, cameraOrientation %d", new Object[] { Integer.valueOf(paramInt) });
      bool = kn(paramInt);
      this.eNa = true;
      ab.i("MicroMsg.Media.MediaCodecMP4MuxRecorder", "initImpl result: %s", new Object[] { Boolean.valueOf(bool) });
      AppMethodBeat.o(12754);
    }
    while (true)
    {
      return bool;
      AppMethodBeat.o(12754);
      bool = true;
    }
  }

  public final void kp(int paramInt)
  {
    AppMethodBeat.i(12768);
    ab.i("MicroMsg.Media.MediaCodecMP4MuxRecorder", "overrideDurationMs: %s", new Object[] { Integer.valueOf(paramInt) });
    this.fcH = paramInt;
    AppMethodBeat.o(12768);
  }

  public final void mb(String paramString)
  {
    this.thumbPath = paramString;
  }

  public final void mc(String paramString)
  {
    this.fcU = paramString;
  }

  public final void pause()
  {
    AppMethodBeat.i(12765);
    ab.i("MicroMsg.Media.MediaCodecMP4MuxRecorder", "pause");
    if ((this.fcQ != null) && (this.fcQ.oxa == d.c.ovB))
      this.fcQ.a(d.c.ovJ);
    AppMethodBeat.o(12765);
  }

  public final void reset()
  {
    AppMethodBeat.i(12760);
    ab.i("MicroMsg.Media.MediaCodecMP4MuxRecorder", "reset, yuvRecorder: %s, aacRecorder: %s, muxer: %s", new Object[] { this.fcK, this.fcJ, this.fcZ });
    ab.i("MicroMsg.Media.MediaCodecMP4MuxRecorder", "reset, yuvRecorder: %s, aacRecorder: %s", new Object[] { this.fcK, this.fcJ });
    synchronized (this.fcD)
    {
      this.fcK = null;
      this.fcJ = null;
      this.fcZ = null;
      this.eNa = false;
      this.fda = false;
      AppMethodBeat.o(12760);
      return;
    }
  }

  public final void s(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    AppMethodBeat.i(12762);
    ab.i("MicroMsg.Media.MediaCodecMP4MuxRecorder", "setSize, width: %s, height: %s, targetWidth: %s, targetHeight: %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), Integer.valueOf(paramInt4) });
    int i = paramInt3;
    if (paramInt3 % 16 != 0)
      i = com.tencent.mm.plugin.mmsight.d.yN(paramInt3);
    paramInt3 = paramInt4;
    if (paramInt4 % 16 != 0)
      paramInt3 = com.tencent.mm.plugin.mmsight.d.yN(paramInt4);
    ab.i("MicroMsg.Media.MediaCodecMP4MuxRecorder", "setSize, after align, targetWidth: %d, targetHeight: %d", new Object[] { Integer.valueOf(i), Integer.valueOf(paramInt3) });
    this.fcO = paramInt1;
    this.fcP = paramInt2;
    if (com.tencent.mm.plugin.mmsight.model.a.j.owk.g(Integer.valueOf(paramInt1 * paramInt2 * 3 / 2)) == null)
    {
      ab.i("MicroMsg.Media.MediaCodecMP4MuxRecorder", "preloadCameraData, width: %s, height: %s, count: %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(3) });
      long l = bo.yz();
      for (paramInt3 = 0; paramInt3 < 3; paramInt3++)
        com.tencent.mm.plugin.mmsight.model.a.j.owk.g(new byte[paramInt1 * paramInt2 * 3 / 2]);
      ab.i("MicroMsg.Media.MediaCodecMP4MuxRecorder", "preloadCameraData used %sms", new Object[] { Long.valueOf(bo.az(l)) });
    }
    AppMethodBeat.o(12762);
  }

  public final void setFilePath(String paramString)
  {
    this.fcE = paramString;
  }

  public final void setMute(boolean paramBoolean)
  {
    this.fdh = paramBoolean;
  }

  public final void v(Runnable paramRunnable)
  {
    AppMethodBeat.i(12756);
    this.fde = paramRunnable;
    ab.i("MicroMsg.Media.MediaCodecMP4MuxRecorder", "!!!!!stop, stopCallback: %s !!!", new Object[] { paramRunnable });
    if ((this.fcK == null) || ((this.fcJ == null) && (!this.fdh)))
    {
      ab.i("MicroMsg.Media.MediaCodecMP4MuxRecorder", "error, yuvRecorder or aacRecorder is null");
      if (paramRunnable != null)
        al.d(paramRunnable);
      AppMethodBeat.o(12756);
    }
    while (true)
    {
      return;
      if ((this.fcQ != null) && (this.fcQ.oxa == d.c.ovE))
      {
        ab.i("MicroMsg.Media.MediaCodecMP4MuxRecorder", "stop, already in stop videoRecordStatus");
        if (this.fcJ != null)
          this.fcJ.clear();
        if (paramRunnable != null)
          al.d(paramRunnable);
        AppMethodBeat.o(12756);
      }
      else
      {
        this.fcF = ((int)this.fcK.UQ());
        paramRunnable = com.tencent.mm.media.i.c.faj;
        com.tencent.mm.media.i.c.Vz();
        if (this.fcQ != null)
          this.fcQ.a(d.c.ovC);
        AppMethodBeat.o(12756);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.media.widget.b.c
 * JD-Core Version:    0.6.2
 */