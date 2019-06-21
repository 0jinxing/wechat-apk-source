package com.tencent.mm.plugin.mmsight.model.a;

import android.graphics.Point;
import android.os.HandlerThread;
import android.os.Message;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.audio.b.c.a;
import com.tencent.mm.modelcontrol.VideoTransPara;
import com.tencent.mm.plugin.mmsight.model.CaptureMMProxy;
import com.tencent.mm.plugin.mmsight.model.f;
import com.tencent.mm.plugin.mmsight.model.o;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.plugin.sight.base.SightVideoJNI;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ac.a;

public final class l
  implements d
{
  private String cvZ;
  private boolean eNa;
  int fYT;
  String fcE;
  private int fcF;
  private float fcG;
  int fcH;
  float fcI;
  private int fcL;
  private int fcM;
  int fcN;
  int fcO;
  int fcP;
  s fcQ;
  int fcR;
  String fcS;
  boolean fcT;
  private String fcU;
  private boolean fcV;
  VideoTransPara fcY;
  boolean fda;
  boolean fdb;
  int fdc;
  d.a fdd;
  boolean fdg;
  private f fdk;
  private String mFileName;
  boolean ouL;
  c own;
  p owo;
  private l.a owp;
  e owq;
  private HandlerThread owr;
  ak ows;
  int owt;
  private int owu;
  private boolean owv;
  public boolean oww;
  String thumbPath;

  public l(VideoTransPara paramVideoTransPara)
  {
    AppMethodBeat.i(76606);
    this.owp = null;
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
    this.fcR = 0;
    this.fcS = null;
    this.owr = null;
    this.ows = null;
    this.owt = -1;
    this.fYT = -1;
    this.ouL = false;
    this.thumbPath = null;
    this.fcU = null;
    this.fcV = false;
    this.fcT = false;
    this.eNa = false;
    this.owu = -1;
    this.fda = false;
    this.cvZ = "";
    this.fdb = false;
    this.fdc = 0;
    this.owv = false;
    this.fdg = true;
    this.oww = false;
    this.fdk = new f()
    {
      public final boolean O(byte[] paramAnonymousArrayOfByte)
      {
        boolean bool = true;
        AppMethodBeat.i(76594);
        if ((paramAnonymousArrayOfByte == null) || (paramAnonymousArrayOfByte.length <= 0))
        {
          AppMethodBeat.o(76594);
          bool = false;
        }
        while (true)
        {
          return bool;
          if (l.this.fcQ.oxa == d.c.ovB)
          {
            Object localObject = l.this;
            if ((!((l)localObject).fcT) && (((l)localObject).fdg))
            {
              ((l)localObject).fcT = true;
              byte[] arrayOfByte = new byte[paramAnonymousArrayOfByte.length];
              System.arraycopy(paramAnonymousArrayOfByte, 0, arrayOfByte, 0, paramAnonymousArrayOfByte.length);
              com.tencent.mm.sdk.g.d.post(new l.7((l)localObject, arrayOfByte), "BigSightMediaCodecMP4MuxRecorder_saveThumb");
            }
            if (l.this.ows != null)
            {
              localObject = Message.obtain();
              ((Message)localObject).what = 1;
              ((Message)localObject).obj = paramAnonymousArrayOfByte;
              l.this.ows.sendMessage((Message)localObject);
            }
            AppMethodBeat.o(76594);
          }
          else
          {
            AppMethodBeat.o(76594);
            bool = false;
          }
        }
      }
    };
    this.fcY = paramVideoTransPara;
    this.fcL = paramVideoTransPara.width;
    this.fcM = paramVideoTransPara.height;
    this.fcN = paramVideoTransPara.videoBitrate;
    k.bPR();
    int i = k.bPT();
    if (i == -1);
    for (this.fcN = paramVideoTransPara.videoBitrate; ; this.fcN = i)
    {
      this.fcQ = new s();
      this.eNa = false;
      ab.d("MicroMsg.MMSightFFMpegRecorder", "create MMSightFFMpegRecorder, targetWidth: %s, targetHeight: %s, targetRate: %s,  defaultRate: %s", new Object[] { Integer.valueOf(this.fcL), Integer.valueOf(this.fcM), Integer.valueOf(this.fcN), Integer.valueOf(i) });
      AppMethodBeat.o(76606);
      return;
    }
  }

  private boolean kn(int paramInt)
  {
    AppMethodBeat.i(76615);
    long l = bo.yz();
    this.ouL = com.tencent.mm.plugin.mmsight.model.j.ouz.ouL;
    this.fcR = paramInt;
    int i;
    int j;
    label66: int k;
    int m;
    int n;
    label86: boolean bool;
    if (!this.ouL)
      if ((paramInt == 0) || (paramInt == 180))
      {
        i = this.fcO;
        if ((paramInt != 0) && (paramInt != 180))
          break label185;
        j = this.fcP;
        k = this.fcL;
        m = this.fcM;
        n = i;
        i = m;
        m = this.fcN;
        j = SightVideoJNI.initDataBufferForMMSight(n, j, paramInt, k, i, this.fcY.fps, m, this.fcY.fzV, 8, this.fcY.fzU, 23.0F, this.ouL, true, this.fcY.duration, false);
        if (j >= 0)
          break label317;
        ab.e("MicroMsg.MMSightFFMpegRecorder", "init failed!");
        com.tencent.mm.plugin.mmsight.model.k.bPy();
        bool = false;
        AppMethodBeat.o(76615);
      }
    while (true)
    {
      return bool;
      i = this.fcP;
      break;
      label185: j = this.fcO;
      break label66;
      if ((paramInt == 0) || (paramInt == 180))
      {
        i = this.fcO;
        label211: if ((paramInt != 0) && (paramInt != 180))
          break label282;
        j = this.fcP;
        label228: if ((paramInt != 0) && (paramInt != 180))
          break label291;
      }
      label282: label291: for (k = this.fcL; ; k = this.fcM)
      {
        if ((paramInt != 0) && (paramInt != 180))
          break label300;
        m = this.fcM;
        n = i;
        i = m;
        break;
        i = this.fcP;
        break label211;
        j = this.fcO;
        break label228;
      }
      label300: m = this.fcL;
      n = i;
      i = m;
      break label86;
      label317: this.owu = j;
      this.owo = new p(this.ouL, paramInt, k, i);
      k = this.owo.yU(j);
      paramInt = 0;
      i = -1;
      if (CaptureMMProxy.getInstance() != null)
        i = CaptureMMProxy.getInstance().getInt(ac.a.xPo, -1);
      if (i < 0)
      {
        this.own = new g(this.fcY.audioSampleRate, this.fcY.fzS);
        this.own.iW(this.owv);
        paramInt = this.own.q(j, com.tencent.mm.plugin.sight.base.d.WP(this.fcE));
        if ((k < 0) || (paramInt < 0))
        {
          ab.e("MicroMsg.MMSightFFMpegRecorder", "init yuv or aac recorder error!! %d %d", new Object[] { Integer.valueOf(k), Integer.valueOf(paramInt) });
          if ((paramInt < 0) && (k >= 0))
          {
            ab.w("MicroMsg.MMSightFFMpegRecorder", "aac init error, try mediarecorder now");
            this.own.clear();
            this.own = new i(this.fcY.audioSampleRate, this.fcY.fzS);
            this.own.iW(this.owv);
            paramInt = this.own.q(j, com.tencent.mm.plugin.sight.base.d.WP(this.fcE));
            ab.w("MicroMsg.MMSightFFMpegRecorder", "MMSightAACMediaRecorder init ret: %s", new Object[] { Integer.valueOf(paramInt) });
            if (paramInt >= 0)
            {
              bool = true;
              AppMethodBeat.o(76615);
              continue;
            }
          }
          SightVideoJNI.releaseBigSightDataBuffer(j);
          com.tencent.mm.plugin.mmsight.model.k.bPy();
          bool = false;
          AppMethodBeat.o(76615);
        }
      }
      else
      {
        if (i == 1)
        {
          this.own = new g(this.fcY.audioSampleRate, this.fcY.fzS);
          this.own.iW(this.owv);
          paramInt = this.own.q(j, com.tencent.mm.plugin.sight.base.d.WP(this.fcE));
        }
        while (true)
        {
          if ((k >= 0) && (paramInt >= 0))
            break label798;
          ab.e("MicroMsg.MMSightFFMpegRecorder", "init yuv or aac recorder error!! %d %d", new Object[] { Integer.valueOf(k), Integer.valueOf(paramInt) });
          SightVideoJNI.releaseBigSightDataBuffer(j);
          com.tencent.mm.plugin.mmsight.model.k.bPy();
          bool = false;
          AppMethodBeat.o(76615);
          break;
          if (i == 2)
          {
            this.own = new i(this.fcY.audioSampleRate, this.fcY.fzS);
            this.own.iW(this.owv);
            paramInt = this.own.q(j, com.tencent.mm.plugin.sight.base.d.WP(this.fcE));
          }
        }
        label798: ab.i("MicroMsg.MMSightFFMpegRecorder", "initImpl used %sms", new Object[] { Long.valueOf(bo.az(l)) });
        bool = true;
        AppMethodBeat.o(76615);
      }
    }
  }

  private boolean yT(int paramInt)
  {
    boolean bool = true;
    AppMethodBeat.i(76608);
    if ((this.owp != null) && (!this.owp.owD))
      if (!this.owp.owA)
      {
        this.owp.callback = null;
        this.owp.owC = true;
        this.owp.owB = true;
        com.tencent.mm.sdk.g.d.xDG.remove(this.owp);
      }
    while (true)
    {
      synchronized (this.owp.fYV)
      {
        SightVideoJNI.releaseBigSightDataBuffer(paramInt);
        if (this.owp.owy != paramInt)
          SightVideoJNI.releaseBigSightDataBuffer(this.owp.owy);
        AppMethodBeat.o(76608);
        return bool;
      }
      bool = false;
      AppMethodBeat.o(76608);
    }
  }

  public final String Aq()
  {
    AppMethodBeat.i(76612);
    String str = bo.bc(this.cvZ, "");
    AppMethodBeat.o(76612);
    return str;
  }

  public final void G(int paramInt1, int paramInt2, int paramInt3)
  {
    AppMethodBeat.i(76622);
    ab.i("MicroMsg.MMSightFFMpegRecorder", "resume, cameraOrientation: %s", new Object[] { Integer.valueOf(paramInt1) });
    if ((this.fcQ != null) && (this.fcQ.oxa == d.c.ovJ))
    {
      if (this.owo != null)
      {
        p localp = this.owo;
        ab.i("MicroMsg.MMSightX264YUVRecorder", "resume, newRotate: %s, frameWidth: %s, frameHeight: %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
        localp.owT = paramInt1;
        localp.owU = paramInt2;
        localp.owV = paramInt3;
      }
      this.fcQ.a(d.c.ovB);
    }
    AppMethodBeat.o(76622);
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
    AppMethodBeat.i(76613);
    long l = this.owo.UQ();
    AppMethodBeat.o(76613);
    return l;
  }

  public final d.c WL()
  {
    return this.fcQ.oxa;
  }

  public final int WM()
  {
    AppMethodBeat.i(76619);
    int i = Math.round(this.fcF / 1000.0F);
    AppMethodBeat.o(76619);
    return i;
  }

  public final Point WN()
  {
    AppMethodBeat.i(76620);
    Point localPoint = new Point(this.fcO, this.fcP);
    AppMethodBeat.o(76620);
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
    AppMethodBeat.i(76623);
    c.a locala;
    if (this.own != null)
    {
      locala = this.own.bPN();
      AppMethodBeat.o(76623);
    }
    while (true)
    {
      return locala;
      locala = null;
      AppMethodBeat.o(76623);
    }
  }

  public final void WR()
  {
    this.fdg = false;
  }

  final void WT()
  {
    if (this.owp != null)
      this.owp.owB = true;
  }

  final void WU()
  {
    AppMethodBeat.i(76618);
    ab.i("MicroMsg.MMSightFFMpegRecorder", "ashutest::pcm ready");
    if ((this.owp != null) && (!this.owp.owD))
      ab.e("MicroMsg.MMSightFFMpegRecorder", "ashutest::OnPcmReady, last encode thread[%s] status error!!! MUST NOT BE HERE", new Object[] { this.owp });
    while (true)
    {
      synchronized (this.owp.fYV)
      {
        yT(this.owp.owy);
        if (this.fcQ.oxa != d.c.ovI)
        {
          ab.w("MicroMsg.MMSightFFMpegRecorder", "ashutest::not MediaStatus.Initialized, maybe canceled by user");
          AppMethodBeat.o(76618);
          return;
        }
      }
      this.fcQ.a(d.c.ovB);
      this.owp = new l.a(this);
      this.owp.owy = this.owu;
      com.tencent.mm.sdk.g.d.f(this.owp, "SightCustomAsyncMediaRecorder_encode_" + bo.yz());
      AppMethodBeat.o(76618);
    }
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
    AppMethodBeat.i(76625);
    ab.i("MicroMsg.MMSightFFMpegRecorder", "overrideFps: %s", new Object[] { Float.valueOf(paramFloat) });
    this.fcI = paramFloat;
    AppMethodBeat.o(76625);
  }

  public final int b(int paramInt1, boolean paramBoolean, int paramInt2)
  {
    AppMethodBeat.i(76617);
    ab.i("MicroMsg.MMSightFFMpegRecorder", "request start, last status %s, cameraOrientation: %s, isLandscape: %s, degree: %s", new Object[] { this.fcQ.oxa, Integer.valueOf(paramInt1), Boolean.valueOf(paramBoolean), Integer.valueOf(paramInt2) });
    this.fdb = paramBoolean;
    this.fcF = 0;
    this.fdc = paramInt2;
    this.fcQ.a(d.c.ovA);
    Object localObject = this.fcE;
    boolean bool;
    if (this.owp == null)
    {
      paramBoolean = true;
      if ((this.owp != null) && (!this.owp.owD))
        break label181;
      bool = true;
      label109: ab.i("MicroMsg.MMSightFFMpegRecorder", "initialize: filePath[%s], encodeThread null[%B], encodeThreadFinish[%B]", new Object[] { localObject, Boolean.valueOf(paramBoolean), Boolean.valueOf(bool) });
      if ((this.owp == null) || (this.owp.owD))
        break label187;
      ab.w("MicroMsg.MMSightFFMpegRecorder", "ERROR, status, wait last encode thread finish!!! MUST NOT BE HERE");
      AppMethodBeat.o(76617);
    }
    for (paramInt1 = -1; ; paramInt1 = -1)
    {
      return paramInt1;
      paramBoolean = false;
      break;
      label181: bool = false;
      break label109;
      label187: if (!bo.isNullOrNil(this.fcE))
        break label216;
      ab.e("MicroMsg.MMSightFFMpegRecorder", "start error, mCurRecordPath is null!!");
      AppMethodBeat.o(76617);
    }
    label216: this.mFileName = com.tencent.mm.vfs.e.atd(this.fcE);
    ab.i("MicroMsg.MMSightFFMpegRecorder", "mCurRecordPath: %s", new Object[] { this.fcE });
    this.fcR = paramInt1;
    ab.i("MicroMsg.MMSightFFMpegRecorder", "start, cameraOrientation: %s", new Object[] { Integer.valueOf(this.fcR) });
    if (!this.eNa)
    {
      kn(paramInt1);
      this.eNa = true;
    }
    localObject = this.owo;
    if (0L == ((p)localObject).miD)
      ((p)localObject).miD = System.currentTimeMillis();
    if (!this.owv)
    {
      paramInt1 = this.own.a(new l.5(this));
      label340: ab.i("MicroMsg.MMSightFFMpegRecorder", "start aac recorder ret: %d", new Object[] { Integer.valueOf(paramInt1) });
      this.owr = com.tencent.mm.sdk.g.d.ek("BigSightWriteCameraData", 0);
      this.owr.start();
      this.ows = new l.6(this, this.owr.getLooper());
      this.fda = false;
      if (paramInt1 == 0)
        break label464;
      this.fcQ.a(d.c.ovH);
    }
    while (true)
    {
      com.tencent.mm.plugin.mmsight.model.k.bPx();
      ab.i("MicroMsg.MMSightRecorderIDKeyStat", "markFFMpegCapture");
      h.pYm.a(440L, 1L, 1L, false);
      if (this.owv)
        WU();
      AppMethodBeat.o(76617);
      break;
      paramInt1 = 0;
      break label340;
      label464: this.fcQ.a(d.c.ovI);
    }
  }

  public final void cancel()
  {
    AppMethodBeat.i(76610);
    ab.i("MicroMsg.MMSightFFMpegRecorder", "cancel");
    this.fcQ.a(d.c.ovD);
    clear();
    this.fcQ.a(d.c.ovE);
    AppMethodBeat.o(76610);
  }

  public final void clear()
  {
    boolean bool1 = true;
    AppMethodBeat.i(76609);
    int i = -1;
    if (this.owo != null)
    {
      i = this.owo.owR;
      if (i < 0)
      {
        ab.v("MicroMsg.MMSightFFMpegRecorder", "call clear, but bufID error");
        AppMethodBeat.o(76609);
        return;
      }
      this.owo.stop();
    }
    if (this.own != null)
      this.own.a(null);
    boolean bool2;
    if (this.owp == null)
    {
      bool2 = true;
      label78: if ((this.owp == null) || (!this.owp.owC))
        break label179;
    }
    while (true)
    {
      ab.v("MicroMsg.MMSightFFMpegRecorder", "ashutest::clear bufID %d, encodeRunnable null ? %B, markCancel %B", new Object[] { Integer.valueOf(i), Boolean.valueOf(bool2), Boolean.valueOf(bool1) });
      if ((i >= 0) && (!yT(i)))
      {
        SightVideoJNI.releaseRecorderBufferRef("clear");
        SightVideoJNI.releaseBigSightDataBuffer(i);
      }
      if (this.owr != null)
        this.owr.quit();
      AppMethodBeat.o(76609);
      break;
      bool2 = false;
      break label78;
      label179: bool1 = false;
    }
  }

  public final void cv(boolean paramBoolean)
  {
    this.owv = paramBoolean;
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
    AppMethodBeat.i(76616);
    boolean bool;
    if (!this.eNa)
    {
      ab.i("MicroMsg.MMSightFFMpegRecorder", "preInit, cameraOrientation: %s", new Object[] { Integer.valueOf(paramInt) });
      bool = kn(paramInt);
      this.eNa = true;
      ab.i("MicroMsg.MMSightFFMpegRecorder", "initImpl result: %s", new Object[] { Boolean.valueOf(bool) });
      AppMethodBeat.o(76616);
    }
    while (true)
    {
      return bool;
      AppMethodBeat.o(76616);
      bool = true;
    }
  }

  public final void kp(int paramInt)
  {
    AppMethodBeat.i(76624);
    ab.i("MicroMsg.MMSightFFMpegRecorder", "overrideDurationMs: %s", new Object[] { Integer.valueOf(paramInt) });
    this.fcH = paramInt;
    AppMethodBeat.o(76624);
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
    AppMethodBeat.i(76621);
    ab.i("MicroMsg.MMSightFFMpegRecorder", "pause");
    if ((this.fcQ != null) && (this.fcQ.oxa == d.c.ovB))
      this.fcQ.a(d.c.ovJ);
    AppMethodBeat.o(76621);
  }

  public final void reset()
  {
    AppMethodBeat.i(76614);
    ab.i("MicroMsg.MMSightFFMpegRecorder", "reset");
    this.fcQ.oxa = d.c.ovE;
    this.fda = false;
    if (this.own != null)
      this.own.clear();
    if (this.owo != null)
      this.owo.clear();
    clear();
    AppMethodBeat.o(76614);
  }

  public final void s(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    AppMethodBeat.i(76607);
    ab.i("MicroMsg.MMSightFFMpegRecorder", "setSize, width: %s, height: %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    this.fcL = paramInt3;
    this.fcM = paramInt4;
    this.fcO = paramInt1;
    this.fcP = paramInt2;
    if (j.owk.g(Integer.valueOf(paramInt1 * paramInt2 * 3 / 2)) == null)
    {
      ab.i("MicroMsg.MMSightFFMpegRecorder", "preloadCameraData, width: %s, height: %s, count: %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(3) });
      long l = bo.yz();
      for (paramInt3 = 0; paramInt3 < 3; paramInt3++)
        j.owk.g(new byte[paramInt1 * paramInt2 * 3 / 2]);
      ab.i("MicroMsg.MMSightFFMpegRecorder", "preloadCameraData used %sms", new Object[] { Long.valueOf(bo.az(l)) });
    }
    AppMethodBeat.o(76607);
  }

  public final void setFilePath(String paramString)
  {
    this.fcE = paramString;
  }

  public final void setMute(boolean paramBoolean)
  {
  }

  public final void v(final Runnable paramRunnable)
  {
    AppMethodBeat.i(76611);
    boolean bool1;
    boolean bool2;
    label34: boolean bool3;
    if (this.owp == null)
    {
      bool1 = true;
      if ((this.owp == null) || (!this.owp.owA))
        break label140;
      bool2 = true;
      if ((this.owp == null) || (!this.owp.owB))
        break label145;
      bool3 = true;
      ab.i("MicroMsg.MMSightFFMpegRecorder", "stop, encodeThread null ? %B, has trigger finish ? %B, has finish callback ? %B", new Object[] { Boolean.valueOf(bool1), Boolean.valueOf(bool2), Boolean.valueOf(bool3) });
      if ((this.owp == null) || (!this.owp.owA))
        break label163;
    }
    while (true)
    {
      synchronized (this.owp.fYV)
      {
        reset();
        al.d(paramRunnable);
        AppMethodBeat.o(76611);
        return;
        bool1 = false;
        break;
        label140: bool2 = false;
        break label34;
        label145: bool3 = false;
      }
      label163: ab.i("MicroMsg.MMSightFFMpegRecorder", "stopOnCameraDataThread: %s, writeCameraDataHandler: %s", new Object[] { Boolean.valueOf(this.oww), this.ows });
      if ((this.oww) && (this.ows != null))
      {
        this.ows.post(new Runnable()
        {
          public final void run()
          {
            AppMethodBeat.i(76595);
            l.a(l.this, paramRunnable);
            AppMethodBeat.o(76595);
          }
        });
        AppMethodBeat.o(76611);
      }
      else
      {
        com.tencent.mm.sdk.g.d.post(new l.3(this, paramRunnable), "MMSightFFMpegRecorder_stop");
        AppMethodBeat.o(76611);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.mmsight.model.a.l
 * JD-Core Version:    0.6.2
 */