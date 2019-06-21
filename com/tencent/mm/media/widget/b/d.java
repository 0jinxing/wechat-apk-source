package com.tencent.mm.media.widget.b;

import android.graphics.Point;
import android.opengl.EGLContext;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.audio.b.c.a;
import com.tencent.mm.media.d.g;
import com.tencent.mm.media.d.g.b;
import com.tencent.mm.media.g.a.c;
import com.tencent.mm.modelcontrol.VideoTransPara;
import com.tencent.mm.plugin.mmsight.model.a.d.a;
import com.tencent.mm.plugin.mmsight.model.a.d.c;
import com.tencent.mm.plugin.mmsight.model.a.j;
import com.tencent.mm.plugin.mmsight.model.a.m;
import com.tencent.mm.plugin.mmsight.model.a.s;
import com.tencent.mm.plugin.mmsight.model.f;
import com.tencent.mm.plugin.sight.base.SightVideoJNI;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.vfs.e;

public final class d
  implements b
{
  protected String cvZ;
  protected boolean eNa;
  protected int eTa;
  private EGLContext fag;
  final Object fcD;
  protected String fcE;
  protected int fcF;
  protected float fcG;
  private int fcH;
  private float fcI;
  protected com.tencent.mm.plugin.mmsight.model.a.c fcJ;
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
  com.tencent.mm.media.g.a fdi;
  protected f fdk;
  protected g fdp;
  com.tencent.mm.media.h.a fdq;
  public a.f.a.b fdr;
  private boolean isRecording;
  protected String mFileName;
  protected String thumbPath;

  private d(VideoTransPara paramVideoTransPara)
  {
    AppMethodBeat.i(12788);
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
    this.fdq = null;
    this.fdk = new d.1(this);
    this.fdr = new d.2(this);
    this.fcY = paramVideoTransPara;
    this.fcL = paramVideoTransPara.width;
    this.fcM = paramVideoTransPara.height;
    this.fcQ = new s();
    ab.d("MicroMsg.Media.X264MP4MuxRecorder", "create X264MP4MuxRecorder, targetWidth: %s, targetHeight: %s", new Object[] { Integer.valueOf(this.fcL), Integer.valueOf(this.fcM) });
    AppMethodBeat.o(12788);
  }

  public d(VideoTransPara paramVideoTransPara, com.tencent.mm.media.h.a parama)
  {
    this(paramVideoTransPara);
    AppMethodBeat.i(12789);
    this.fag = null;
    this.fdq = parama;
    this.fdi = new com.tencent.mm.media.g.a(parama);
    paramVideoTransPara = com.tencent.mm.media.i.c.faj;
    com.tencent.mm.media.i.c.Vn();
    AppMethodBeat.o(12789);
  }

  private void WH()
  {
    AppMethodBeat.i(12791);
    int i = this.fcL;
    int j = this.fcM;
    this.fdi.cg(i, j);
    this.fdi.ka(this.fcR);
    this.fdi.ch(this.fcO, this.fcP);
    ab.i("MicroMsg.Media.X264MP4MuxRecorder", "outputWidth: %s, outputHeight: %s, cameraPreviewWidth: %s, cameraPreviewHeight: %s, getDataRotate: %s", new Object[] { Integer.valueOf(i), Integer.valueOf(j), Integer.valueOf(this.fcO), Integer.valueOf(this.fcP), Integer.valueOf(this.fcR) });
    AppMethodBeat.o(12791);
  }

  private boolean kn(int paramInt)
  {
    AppMethodBeat.i(12790);
    long l = bo.yz();
    this.fcN = this.fcY.videoBitrate;
    this.eTa = SightVideoJNI.initDataBufferForMMSightLock(this.fcO, this.fcP, paramInt, this.fcL, this.fcM, this.fcY.fps, this.fcN, this.fcY.fzV, 8, this.fcY.fzU, 23.0F, false, true, this.fcY.duration, false);
    ab.i("MicroMsg.Media.X264MP4MuxRecorder", "init, bufId: %s", new Object[] { Integer.valueOf(this.eTa) });
    boolean bool;
    if (this.eTa < 0)
    {
      ab.e("MicroMsg.Media.X264MP4MuxRecorder", "init failed!");
      bool = false;
      AppMethodBeat.o(12790);
    }
    while (true)
    {
      return bool;
      this.fcR = paramInt;
      Object localObject = new com.tencent.mm.media.b.c();
      ab.i("MicroMsg.Media.X264MP4MuxRecorder", "mTargetRate " + this.fcN + "  videoParams.fps: " + this.fcY.fps + " mTargetHeight:" + this.fcM + " mTargetWidth:" + this.fcL);
      ((com.tencent.mm.media.b.c)localObject).bitrate = this.fcN;
      ((com.tencent.mm.media.b.c)localObject).eTk = this.fcY.fps;
      ((com.tencent.mm.media.b.c)localObject).eTj = this.fcM;
      ((com.tencent.mm.media.b.c)localObject).eTi = this.fcL;
      this.fdp = new g(this.eTa, this.fcL, this.fcM);
      localObject = this.fdi;
      EGLContext localEGLContext = this.fag;
      paramInt = this.fcL;
      int i = this.fcM;
      d.3 local3 = new d.3(this);
      ab.i(((com.tencent.mm.media.g.a)localObject).TAG, ((com.tencent.mm.media.g.a)localObject).hashCode() + " initWithSize, eglContext: " + localEGLContext + ", callback: false, width:" + paramInt + ", height:" + i);
      ((com.tencent.mm.media.g.a)localObject).b((a.f.a.a)new a.c((com.tencent.mm.media.g.a)localObject, localEGLContext, paramInt, i, local3));
      this.fdi.eXd = new d.4(this);
      WH();
      this.fcJ = new a(this.fcY.audioSampleRate, this.fcY.fzS);
      this.fcJ.iW(this.fdf);
      paramInt = this.fcJ.q(this.eTa, com.tencent.mm.plugin.sight.base.d.WP(this.fcE));
      ab.i("MicroMsg.Media.X264MP4MuxRecorder", "initImpl used %sms", new Object[] { Long.valueOf(bo.az(l)) });
      if (paramInt != 0)
      {
        localObject = com.tencent.mm.media.i.c.faj;
        com.tencent.mm.media.i.c.Vq();
        bool = false;
        AppMethodBeat.o(12790);
      }
      else
      {
        bool = true;
        AppMethodBeat.o(12790);
      }
    }
  }

  public final String Aq()
  {
    AppMethodBeat.i(12795);
    String str = bo.bc(this.cvZ, "");
    AppMethodBeat.o(12795);
    return str;
  }

  public final void G(int paramInt1, int paramInt2, int paramInt3)
  {
    AppMethodBeat.i(12804);
    ab.i("MicroMsg.Media.X264MP4MuxRecorder", "resume, cameraOrientation: %s", new Object[] { Integer.valueOf(paramInt1) });
    this.fcR = paramInt1;
    this.fcO = paramInt2;
    this.fcP = paramInt3;
    this.fdi.ka(this.fcR);
    WH();
    if ((this.fcQ != null) && (this.fcQ.oxa == d.c.ovJ))
      this.fcQ.a(d.c.ovB);
    AppMethodBeat.o(12804);
  }

  public final void WG()
  {
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
    AppMethodBeat.i(12799);
    synchronized (this.fcD)
    {
      if (this.fdp != null)
      {
        l = bo.az(this.fdp.startTime);
        AppMethodBeat.o(12799);
        return l;
      }
      long l = 0L;
      AppMethodBeat.o(12799);
    }
  }

  public final d.c WL()
  {
    return this.fcQ.oxa;
  }

  public final int WM()
  {
    AppMethodBeat.i(12801);
    int i = Math.round(this.fcF / 1000.0F);
    AppMethodBeat.o(12801);
    return i;
  }

  public final Point WN()
  {
    AppMethodBeat.i(12802);
    Point localPoint = new Point(this.fcO, this.fcP);
    AppMethodBeat.o(12802);
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
    AppMethodBeat.i(12805);
    c.a locala;
    if (this.fcJ != null)
    {
      locala = this.fcJ.bPN();
      AppMethodBeat.o(12805);
    }
    while (true)
    {
      return locala;
      locala = null;
      AppMethodBeat.o(12805);
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
    AppMethodBeat.i(12807);
    ab.i("MicroMsg.Media.X264MP4MuxRecorder", "overrideFps: %s", new Object[] { Float.valueOf(paramFloat) });
    this.fcI = paramFloat;
    AppMethodBeat.o(12807);
  }

  public final int b(int paramInt1, boolean paramBoolean, int paramInt2)
  {
    AppMethodBeat.i(12793);
    ab.i("MicroMsg.Media.X264MP4MuxRecorder", "start, cameraOrientation: %s, isLandscape: %s, degree: %s", new Object[] { Integer.valueOf(paramInt1), Boolean.valueOf(paramBoolean), Integer.valueOf(paramInt2) });
    this.fcW.reset();
    this.fcF = 0;
    this.fcX.reset();
    this.fcT = false;
    this.fdb = paramBoolean;
    this.fdc = paramInt2;
    this.fcQ.a(d.c.ovA);
    if (bo.isNullOrNil(this.fcE))
    {
      ab.e("MicroMsg.Media.X264MP4MuxRecorder", "start error, mCurRecordPath is null!!");
      paramInt1 = -1;
      AppMethodBeat.o(12793);
      return paramInt1;
    }
    while (true)
    {
      try
      {
        this.mFileName = e.atd(this.fcE);
        localObject1 = e.atb(this.fcE);
        ??? = localObject1;
        if (!((String)localObject1).endsWith("/"))
        {
          ??? = new java/lang/StringBuilder;
          ((StringBuilder)???).<init>();
          ??? = (String)localObject1 + "/";
        }
        localObject1 = new java/lang/StringBuilder;
        ((StringBuilder)localObject1).<init>();
        this.fcS = ((String)??? + "tempRotate.mp4");
        ab.i("MicroMsg.Media.X264MP4MuxRecorder", "mCurRecordPath: %s, tempRotateFilePath: %s", new Object[] { this.fcE, this.fcS });
        this.fcR = paramInt1;
        if (!this.eNa)
        {
          kn(paramInt1);
          this.eNa = true;
        }
      }
      catch (Exception localException)
      {
        synchronized (this.fcD)
        {
          Object localObject1 = this.fdp;
          ((g)localObject1).isStop = false;
          ((g)localObject1).eVT = false;
          ((g)localObject1).frameCount = 0;
          ((g)localObject1).startTime = bo.yz();
          SightVideoJNI.setRotateForBufId(((g)localObject1).eTa, 0);
          g.b localb = new com/tencent/mm/media/d/g$b;
          localb.<init>((g)localObject1);
          ((g)localObject1).eVR = com.tencent.mm.sdk.g.d.h((Runnable)localb, "X264TransEncoder_encodeThread");
          ((g)localObject1).eVV = false;
          ab.i("MicroMsg.X264TransEncoder", "start");
          if ((this.fdh) || (this.fdf))
            break label480;
          paramInt1 = this.fcJ.a(new d.5(this));
          ab.i("MicroMsg.Media.X264MP4MuxRecorder", "start aacRecorder ret: %s", new Object[] { Integer.valueOf(paramInt1) });
          this.fda = false;
          if (paramInt1 != 0)
          {
            this.fcQ.a(d.c.ovH);
            AppMethodBeat.o(12793);
            break;
            localException = localException;
            ab.e("MicroMsg.Media.X264MP4MuxRecorder", "retrieve file name error: %s", new Object[] { localException.getMessage() });
          }
        }
      }
      this.fcQ.a(d.c.ovI);
      continue;
      label480: ab.i("MicroMsg.Media.X264MP4MuxRecorder", "start yuvRecorder with mute");
      this.fcQ.a(d.c.ovB);
      this.fda = false;
      paramInt1 = 0;
    }
  }

  public final void cancel()
  {
    AppMethodBeat.i(12796);
    ab.i("MicroMsg.Media.X264MP4MuxRecorder", "cancel record");
    synchronized (this.fcD)
    {
      if ((this.fdp == null) || ((this.fcJ == null) && (!this.fdh)))
      {
        ab.e("MicroMsg.Media.X264MP4MuxRecorder", "error, yuvRecorder or aacRecorder is null");
        AppMethodBeat.o(12796);
      }
      while (true)
      {
        return;
        this.fcQ.a(d.c.ovD);
        this.fdp.stop(true);
        if (this.fcJ != null)
        {
          com.tencent.mm.plugin.mmsight.model.a.c localc = this.fcJ;
          d.7 local7 = new com/tencent/mm/media/widget/b/d$7;
          local7.<init>(this);
          localc.a(local7);
        }
        if (this.eTa < 0)
          break;
        SightVideoJNI.releaseBigSightDataBufferLock(this.eTa);
        this.fcQ.a(d.c.ovE);
        reset();
        AppMethodBeat.o(12796);
      }
      ab.e("MicroMsg.Media.X264MP4MuxRecorder", "why buf id < 0 ? %d", new Object[] { Integer.valueOf(this.eTa) });
    }
  }

  public final void clear()
  {
    AppMethodBeat.i(12797);
    try
    {
      ab.i("MicroMsg.Media.X264MP4MuxRecorder", "clear");
      if (this.fcJ != null)
        this.fcJ.clear();
      if (this.fdi != null)
        this.fdi.release();
      if (this.eTa >= 0)
        SightVideoJNI.releaseBigSightDataBufferLock(this.eTa);
      AppMethodBeat.o(12797);
      return;
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.Media.X264MP4MuxRecorder", localException, "clear error: %s", new Object[] { localException.getMessage() });
        AppMethodBeat.o(12797);
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
    AppMethodBeat.i(12792);
    boolean bool;
    if (!this.eNa)
    {
      ab.i("MicroMsg.Media.X264MP4MuxRecorder", "preInit, cameraOrientation");
      bool = kn(paramInt);
      this.eNa = true;
      ab.i("MicroMsg.Media.X264MP4MuxRecorder", "initImpl result: %s", new Object[] { Boolean.valueOf(bool) });
      AppMethodBeat.o(12792);
    }
    while (true)
    {
      return bool;
      com.tencent.mm.media.i.c localc = com.tencent.mm.media.i.c.faj;
      com.tencent.mm.media.i.c.Vo();
      AppMethodBeat.o(12792);
      bool = true;
    }
  }

  public final void kp(int paramInt)
  {
    AppMethodBeat.i(12806);
    ab.i("MicroMsg.Media.X264MP4MuxRecorder", "overrideDurationMs: %s", new Object[] { Integer.valueOf(paramInt) });
    this.fcH = paramInt;
    AppMethodBeat.o(12806);
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
    AppMethodBeat.i(12803);
    ab.i("MicroMsg.Media.X264MP4MuxRecorder", "pause");
    if ((this.fcQ != null) && (this.fcQ.oxa == d.c.ovB))
      this.fcQ.a(d.c.ovJ);
    AppMethodBeat.o(12803);
  }

  public final void reset()
  {
    AppMethodBeat.i(12798);
    ab.i("MicroMsg.Media.X264MP4MuxRecorder", "reset, yuvRecorder: %s, aacRecorder: %s, muxer: %s", new Object[] { this.fdp, this.fcJ, this.fcZ });
    ab.i("MicroMsg.Media.X264MP4MuxRecorder", "reset, yuvRecorder: %s, aacRecorder: %s", new Object[] { this.fdp, this.fcJ });
    synchronized (this.fcD)
    {
      this.fdp = null;
      this.fcJ = null;
      this.fcZ = null;
      this.eNa = false;
      this.fda = false;
      AppMethodBeat.o(12798);
      return;
    }
  }

  public final void s(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    AppMethodBeat.i(12800);
    ab.i("MicroMsg.Media.X264MP4MuxRecorder", "setSize, width: %s, height: %s, targetWidth: %s, targetHeight: %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), Integer.valueOf(paramInt4) });
    int i = paramInt3;
    if (paramInt3 % 16 != 0)
      i = com.tencent.mm.plugin.mmsight.d.yN(paramInt3);
    paramInt3 = paramInt4;
    if (paramInt4 % 16 != 0)
      paramInt3 = com.tencent.mm.plugin.mmsight.d.yN(paramInt4);
    ab.i("MicroMsg.Media.X264MP4MuxRecorder", "setSize, after align, targetWidth: %d, targetHeight: %d", new Object[] { Integer.valueOf(i), Integer.valueOf(paramInt3) });
    this.fcO = paramInt1;
    this.fcP = paramInt2;
    if (j.owk.g(Integer.valueOf(paramInt1 * paramInt2 * 3 / 2)) == null)
    {
      ab.i("MicroMsg.Media.X264MP4MuxRecorder", "preloadCameraData, width: %s, height: %s, count: %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(3) });
      long l = bo.yz();
      for (paramInt3 = 0; paramInt3 < 3; paramInt3++)
        j.owk.g(new byte[paramInt1 * paramInt2 * 3 / 2]);
      ab.i("MicroMsg.Media.X264MP4MuxRecorder", "preloadCameraData used %sms", new Object[] { Long.valueOf(bo.az(l)) });
    }
    AppMethodBeat.o(12800);
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
    AppMethodBeat.i(12794);
    synchronized (this.fcD)
    {
      this.fde = paramRunnable;
      ab.i("MicroMsg.Media.X264MP4MuxRecorder", "!!!!!stop, stopCallback: %s!!!", new Object[] { paramRunnable });
      if ((this.fdp == null) || ((this.fcJ == null) && (!this.fdh)))
      {
        ab.i("MicroMsg.Media.X264MP4MuxRecorder", "error, yuvRecorder or aacRecorder is null");
        if (paramRunnable != null)
          al.d(paramRunnable);
        AppMethodBeat.o(12794);
      }
      while (true)
      {
        return;
        if ((this.fcQ == null) || (this.fcQ.oxa != d.c.ovE))
          break;
        ab.i("MicroMsg.Media.X264MP4MuxRecorder", "stop, already in stop videoRecordStatus");
        if (this.fcJ != null)
          this.fcJ.clear();
        if (paramRunnable != null)
          al.d(paramRunnable);
        AppMethodBeat.o(12794);
      }
      this.fdk = null;
      this.fcF = ((int)bo.az(this.fdp.startTime));
      if (this.fcQ != null)
      {
        paramRunnable = com.tencent.mm.media.i.c.faj;
        com.tencent.mm.media.i.c.Vr();
        this.fcQ.a(d.c.ovC);
      }
      AppMethodBeat.o(12794);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.media.widget.b.d
 * JD-Core Version:    0.6.2
 */