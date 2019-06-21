package com.tencent.mm.plugin.mmsight.model.a;

import android.graphics.Point;
import android.os.HandlerThread;
import android.os.Message;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.audio.b.c.a;
import com.tencent.mm.modelcontrol.VideoTransPara;
import com.tencent.mm.plugin.mmsight.model.CaptureMMProxy;
import com.tencent.mm.plugin.mmsight.model.b;
import com.tencent.mm.plugin.mmsight.model.f;
import com.tencent.mm.plugin.mmsight.model.o;
import com.tencent.mm.plugin.sight.base.SightVideoJNI;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.vfs.e;
import java.io.File;

public final class n
  implements d
{
  protected String cvZ;
  protected boolean eNa;
  protected int eTa;
  protected Point fbc;
  private final Object fcD;
  protected String fcE;
  protected int fcF;
  protected float fcG;
  private int fcH;
  private float fcI;
  protected c fcJ;
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
  protected b fcW;
  protected b fcX;
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
  protected f fdk;
  protected String mFileName;
  protected boolean ouL;
  protected volatile q owH;
  protected HandlerThread owI;
  protected ak owJ;
  protected int owK;
  protected String thumbPath;

  public n(VideoTransPara paramVideoTransPara)
  {
    AppMethodBeat.i(76639);
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
    this.fcS = null;
    this.owK = 0;
    this.ouL = false;
    this.fcT = false;
    this.thumbPath = null;
    this.fcU = null;
    this.fcV = false;
    this.fbc = null;
    this.fcW = new b("yuvRecorderWriteData");
    this.fcX = new b("frameCountCallback");
    this.eNa = false;
    this.fda = false;
    this.cvZ = "";
    this.fdb = false;
    this.fdc = 0;
    this.fde = null;
    this.fdf = false;
    this.fdg = true;
    this.fdh = false;
    this.fdk = new n.1(this);
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
      ab.d("MicroMsg.MMSightMediaCodecMP4MuxRecorder", "create MMSightMediaCodecMP4MuxRecorder, targetWidth: %s, targetHeight: %s, targetRate: %s", new Object[] { Integer.valueOf(this.fcL), Integer.valueOf(this.fcM), Integer.valueOf(this.fcN) });
      AppMethodBeat.o(76639);
      return;
    }
  }

  private boolean kn(int paramInt)
  {
    AppMethodBeat.i(76640);
    long l = bo.yz();
    this.ouL = com.tencent.mm.plugin.mmsight.model.j.ouz.ouL;
    int i = this.fcN;
    this.eTa = SightVideoJNI.initDataBufferForMMSightLock(this.fcO, this.fcP, paramInt, this.fcL, this.fcM, this.fcY.fps, i, this.fcY.fzV, 8, this.fcY.fzU, 23.0F, false, false, this.fcY.duration, false);
    ab.i("MicroMsg.MMSightMediaCodecMP4MuxRecorder", "init, bufId: %s", new Object[] { Integer.valueOf(this.eTa) });
    boolean bool;
    if (this.eTa < 0)
    {
      ab.e("MicroMsg.MMSightMediaCodecMP4MuxRecorder", "init failed!");
      com.tencent.mm.plugin.mmsight.model.k.bPz();
      bool = false;
      AppMethodBeat.o(76640);
    }
    while (true)
    {
      return bool;
      this.fcR = paramInt;
      this.owH = new q(this.fcO, this.fcP, this.fcL, this.fcM, this.fcN, this.fcY.fzT, this.fcY.fps, this.ouL);
      int j = this.owH.ew(this.eTa, paramInt);
      paramInt = 0;
      if (!this.fdh)
      {
        i = -1;
        if (CaptureMMProxy.getInstance() != null)
          i = CaptureMMProxy.getInstance().getInt(ac.a.xPo, -1);
        if (i < 0)
        {
          this.fcJ = new g(this.fcY.audioSampleRate, this.fcY.fzS);
          this.fcJ.iW(this.fdf);
          paramInt = this.fcJ.q(this.eTa, com.tencent.mm.plugin.sight.base.d.WP(this.fcE));
          if ((j < 0) || (paramInt < 0))
          {
            ab.e("MicroMsg.MMSightMediaCodecMP4MuxRecorder", "init yuv or aac recorder error!! %d %d", new Object[] { Integer.valueOf(j), Integer.valueOf(paramInt) });
            if ((paramInt < 0) && (j >= 0))
            {
              ab.w("MicroMsg.MMSightMediaCodecMP4MuxRecorder", "aac init error, try mediarecorder now");
              this.fcJ.clear();
              this.fcJ = new i(this.fcY.audioSampleRate, this.fcY.fzS);
              this.fcJ.iW(this.fdf);
              paramInt = this.fcJ.q(this.eTa, com.tencent.mm.plugin.sight.base.d.WP(this.fcE));
              ab.w("MicroMsg.MMSightMediaCodecMP4MuxRecorder", "MMSightAACMediaRecorder init ret: %s", new Object[] { Integer.valueOf(paramInt) });
              if (paramInt >= 0)
              {
                bool = true;
                AppMethodBeat.o(76640);
                continue;
              }
            }
            SightVideoJNI.releaseBigSightDataBufferLock(this.eTa);
            com.tencent.mm.plugin.mmsight.model.k.bPz();
            bool = false;
            AppMethodBeat.o(76640);
          }
        }
        else
        {
          if (i == 1)
          {
            this.fcJ = new g(this.fcY.audioSampleRate, this.fcY.fzS);
            this.fcJ.iW(this.fdf);
            paramInt = this.fcJ.q(this.eTa, com.tencent.mm.plugin.sight.base.d.WP(this.fcE));
          }
          while (true)
          {
            if ((j >= 0) && (paramInt >= 0))
              break label726;
            ab.e("MicroMsg.MMSightMediaCodecMP4MuxRecorder", "init yuv or aac recorder error!! %d %d", new Object[] { Integer.valueOf(j), Integer.valueOf(paramInt) });
            SightVideoJNI.releaseBigSightDataBufferLock(this.eTa);
            com.tencent.mm.plugin.mmsight.model.k.bPz();
            bool = false;
            AppMethodBeat.o(76640);
            break;
            if (i == 2)
            {
              this.fcJ = new i(this.fcY.audioSampleRate, this.fcY.fzS);
              this.fcJ.iW(this.fdf);
              paramInt = this.fcJ.q(this.eTa, com.tencent.mm.plugin.sight.base.d.WP(this.fcE));
            }
          }
        }
      }
      else if (j < 0)
      {
        ab.e("MicroMsg.MMSightMediaCodecMP4MuxRecorder", "mute init yuv recorder error!! %d %d", new Object[] { Integer.valueOf(j), Integer.valueOf(0) });
        SightVideoJNI.releaseBigSightDataBuffer(this.eTa);
        com.tencent.mm.plugin.mmsight.model.k.bPz();
        bool = false;
        AppMethodBeat.o(76640);
      }
      else
      {
        label726: ab.i("MicroMsg.MMSightMediaCodecMP4MuxRecorder", "initImpl used %sms", new Object[] { Long.valueOf(bo.az(l)) });
        bool = true;
        AppMethodBeat.o(76640);
      }
    }
  }

  public final String Aq()
  {
    AppMethodBeat.i(76646);
    String str = bo.bc(this.cvZ, "");
    AppMethodBeat.o(76646);
    return str;
  }

  public final void G(int paramInt1, int paramInt2, int paramInt3)
  {
    AppMethodBeat.i(76655);
    ab.i("MicroMsg.MMSightMediaCodecMP4MuxRecorder", "resume, cameraOrientation: %s", new Object[] { Integer.valueOf(paramInt1) });
    if ((this.fcQ != null) && (this.fcQ.oxa == d.c.ovJ))
    {
      if (this.owH != null)
      {
        q localq = this.owH;
        localq.owT = paramInt1;
        localq.owU = paramInt2;
        localq.owV = paramInt3;
        ab.i("MicroMsg.MMSightYUVMediaCodecRecorder", "resume, newRotation: %s, newFrameWidth: %s, newFrameHeight: %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
      }
      this.fcQ.a(d.c.ovB);
    }
    AppMethodBeat.o(76655);
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
    AppMethodBeat.i(76650);
    long l;
    if (this.owH != null)
    {
      l = this.owH.UQ();
      AppMethodBeat.o(76650);
    }
    while (true)
    {
      return l;
      l = 0L;
      AppMethodBeat.o(76650);
    }
  }

  public final d.c WL()
  {
    return this.fcQ.oxa;
  }

  public final int WM()
  {
    AppMethodBeat.i(76652);
    int i = Math.round(this.fcF / 1000.0F);
    AppMethodBeat.o(76652);
    return i;
  }

  public final Point WN()
  {
    AppMethodBeat.i(76653);
    Point localPoint = new Point(this.fcO, this.fcP);
    AppMethodBeat.o(76653);
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
    AppMethodBeat.i(76656);
    c.a locala;
    if (this.fcJ != null)
    {
      locala = this.fcJ.bPN();
      AppMethodBeat.o(76656);
    }
    while (true)
    {
      return locala;
      locala = null;
      AppMethodBeat.o(76656);
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

  protected final void aZ(byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(76641);
    if (this.owH != null)
    {
      Message localMessage = Message.obtain();
      localMessage.what = 1;
      localMessage.obj = paramArrayOfByte;
      if (this.owJ != null)
        this.owJ.sendMessage(localMessage);
    }
    AppMethodBeat.o(76641);
  }

  public final void af(float paramFloat)
  {
    AppMethodBeat.i(76658);
    ab.i("MicroMsg.MMSightMediaCodecMP4MuxRecorder", "overrideFps: %s", new Object[] { Float.valueOf(paramFloat) });
    this.fcI = paramFloat;
    AppMethodBeat.o(76658);
  }

  public final int b(int paramInt1, boolean paramBoolean, int paramInt2)
  {
    int i = -1;
    AppMethodBeat.i(76643);
    ab.i("MicroMsg.MMSightMediaCodecMP4MuxRecorder", "start, cameraOrientation: %s, isLandscape: %s, degree: %s", new Object[] { Integer.valueOf(paramInt1), Boolean.valueOf(paramBoolean), Integer.valueOf(paramInt2) });
    this.fcW.reset();
    this.fcF = 0;
    this.fcX.reset();
    this.fcT = false;
    this.fdb = paramBoolean;
    this.fdc = paramInt2;
    this.fcQ.a(d.c.ovA);
    if (bo.isNullOrNil(this.fcE))
    {
      ab.e("MicroMsg.MMSightMediaCodecMP4MuxRecorder", "start error, mCurRecordPath is null!!");
      AppMethodBeat.o(76643);
      paramInt1 = i;
    }
    while (true)
    {
      return paramInt1;
      try
      {
        this.mFileName = e.atd(this.fcE);
        Object localObject1 = e.atb(this.fcE);
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
        ab.i("MicroMsg.MMSightMediaCodecMP4MuxRecorder", "mCurRecordPath: %s, tempRotateFilePath: %s", new Object[] { this.fcE, this.fcS });
        this.fcR = paramInt1;
        this.owI = com.tencent.mm.sdk.g.d.ek("BigSightMediaCodecMP4MuxRecorder_writeYuvData_" + hashCode(), -1);
        this.owI.start();
        this.owJ = new n.2(this, this.owI.getLooper());
        if (!this.eNa)
        {
          kn(paramInt1);
          this.eNa = true;
        }
        if ((!this.fdh) && (!this.fdf))
        {
          paramInt1 = this.fcJ.a(new n.3(this));
          ab.i("MicroMsg.MMSightMediaCodecMP4MuxRecorder", "start aacRecorder ret: %s", new Object[] { Integer.valueOf(paramInt1) });
          this.fda = false;
          if (paramInt1 != 0)
          {
            this.fcQ.a(d.c.ovH);
            com.tencent.mm.plugin.mmsight.model.k.bPx();
            com.tencent.mm.plugin.mmsight.model.k.Vv();
            AppMethodBeat.o(76643);
          }
        }
      }
      catch (Exception localException)
      {
        while (true)
        {
          ab.e("MicroMsg.MMSightMediaCodecMP4MuxRecorder", "retrieve file name error: %s", new Object[] { localException.getMessage() });
          continue;
          this.fcQ.a(d.c.ovI);
          continue;
          ab.i("MicroMsg.MMSightMediaCodecMP4MuxRecorder", "start yuvRecorder with mute");
          this.owH.start();
          this.fcQ.a(d.c.ovB);
          this.fda = false;
          com.tencent.mm.plugin.mmsight.model.k.bPx();
          com.tencent.mm.plugin.mmsight.model.k.Vv();
          paramInt1 = 0;
        }
      }
    }
  }

  final boolean bPW()
  {
    AppMethodBeat.i(76645);
    long l = bo.yz();
    int i;
    String str;
    label208: label223: boolean bool;
    if ((this.owI != null) && (this.owJ != null))
    {
      if (com.tencent.mm.compatible.util.d.iW(18))
      {
        this.owI.quitSafely();
        this.owJ = null;
      }
    }
    else
    {
      i = this.owH.frameCount;
      this.fcG = (i * 1000.0F / this.fcF);
      ab.i("MicroMsg.MMSightMediaCodecMP4MuxRecorder", "stop, frameCount: %s, fps: %s, duration: %s, file: %s handlerrunning %s, overrideDurationMs: %s, overrideFps: %s", new Object[] { Integer.valueOf(i), Float.valueOf(this.fcG), Integer.valueOf(this.fcF), this.fcE, Long.valueOf(bo.az(l)), Integer.valueOf(this.fcH), Float.valueOf(this.fcI) });
      ab.i("MicroMsg.MMSightMediaCodecMP4MuxRecorder", "frameCountCallback %s", new Object[] { this.fcX.getValue() });
      ab.i("MicroMsg.MMSightMediaCodecMP4MuxRecorder", "yuvRecorderWriteDataCallback %s", new Object[] { this.fcW.getValue() });
      str = null;
      if (CaptureMMProxy.getInstance() == null)
        break label378;
      str = CaptureMMProxy.getInstance().getAccVideoPath();
      if (bo.isNullOrNil(str))
        break label410;
      str = com.tencent.mm.plugin.mmsight.d.RJ(str);
      i = this.fcF;
      if (this.fcH > 0)
        i = this.fcH;
      float f = this.fcG;
      if (this.fcI > 0.0F)
        f = this.fcI;
      this.fcZ = new m(this.eTa, str, f, this.fcN, i, this.fcY.audioSampleRate, this.fdh);
      l = bo.yz();
      bool = this.fcZ.bPO();
      ab.i("MicroMsg.MMSightMediaCodecMP4MuxRecorder", "mux used %sms, success: %s", new Object[] { Long.valueOf(bo.az(l)), Boolean.valueOf(bool) });
      if (bool)
        break label419;
      ab.e("MicroMsg.MMSightMediaCodecMP4MuxRecorder", "mux failed!");
      com.tencent.mm.plugin.mmsight.model.k.bPC();
      AppMethodBeat.o(76645);
      bool = false;
    }
    while (true)
    {
      return bool;
      this.owI.quit();
      break;
      label378: if (bo.isNullOrNil(this.fcE))
        break label208;
      str = new File(this.fcE).getParentFile().getAbsolutePath();
      break label208;
      label410: str = this.fcE;
      break label223;
      label419: if (((this.fdb) && (this.ouL)) || ((!this.ouL) && (!this.fdb)) || ((this.fdb) && (Math.abs(this.fcR - this.fdc) == 0)) || (this.fdc == 180))
      {
        l = bo.yz();
        if ((this.ouL) || (this.fdb))
          break label764;
        i = this.fcR;
        label502: int j = i;
        if (this.fdc == 180)
        {
          j = i;
          if (!this.ouL)
          {
            i += 180;
            j = i;
            if (i > 360)
              j = i - 360;
          }
        }
        if (j > 0)
        {
          SightVideoJNI.tagRotateVideo(str, this.fcS, j);
          this.fcV = true;
          ab.i("MicroMsg.MMSightMediaCodecMP4MuxRecorder", "tagRotateVideo used %sms, cameraOrientation: %s, isLandscape: %s, deviceDegree: %s, rotateDegree: %s", new Object[] { Long.valueOf(bo.az(l)), Integer.valueOf(this.fcR), Boolean.valueOf(this.fdb), Integer.valueOf(this.fdc), Integer.valueOf(j) });
          l = bo.yz();
        }
      }
      try
      {
        e.deleteFile(str);
        e.aQ(this.fcS, str);
        ab.i("MicroMsg.MMSightMediaCodecMP4MuxRecorder", "copyFile cost %s", new Object[] { Long.valueOf(bo.az(l)) });
        com.tencent.mm.sdk.g.d.post(new n.7(this, this.fcS), "BigSightMediaCodecMP4MuxRecorder_tagRotate_after_process");
        SightVideoJNI.releaseBigSightDataBufferLock(this.eTa);
        this.fcQ.a(d.c.ovE);
        this.cvZ = com.tencent.mm.c.g.cz(str);
        if ((!bo.isNullOrNil(str)) && (!str.equals(this.fcE)))
        {
          e.aQ(str, this.fcE);
          e.deleteFile(str);
        }
        AppMethodBeat.o(76645);
        bool = true;
        continue;
        label764: if (this.ouL)
        {
          i = this.fdc;
          break label502;
        }
        i = 180;
      }
      catch (Exception localException)
      {
        ab.e("MicroMsg.MMSightMediaCodecMP4MuxRecorder", "stop, copy file error");
        AppMethodBeat.o(76645);
        bool = false;
      }
    }
  }

  public final void cancel()
  {
    AppMethodBeat.i(76647);
    ab.i("MicroMsg.MMSightMediaCodecMP4MuxRecorder", "cancel record");
    if ((this.owH == null) || ((this.fcJ == null) && (!this.fdh)))
    {
      ab.e("MicroMsg.MMSightMediaCodecMP4MuxRecorder", "error, yuvRecorder or aacRecorder is null");
      AppMethodBeat.o(76647);
    }
    while (true)
    {
      return;
      this.fcQ.a(d.c.ovD);
      this.owH.a(null);
      if (this.fcJ != null)
        this.fcJ.a(new n.8(this));
      if ((this.owI != null) && (this.owJ != null))
      {
        this.owJ.removeMessages(0);
        this.owI.quit();
        this.owJ = null;
      }
      SightVideoJNI.releaseBigSightDataBufferLock(this.eTa);
      this.fcQ.a(d.c.ovE);
      reset();
      AppMethodBeat.o(76647);
    }
  }

  public final void clear()
  {
    AppMethodBeat.i(76648);
    try
    {
      ab.i("MicroMsg.MMSightMediaCodecMP4MuxRecorder", "clear");
      if (this.fcJ != null)
        this.fcJ.clear();
      if (this.owH != null)
        this.owH.clear();
      AppMethodBeat.o(76648);
      return;
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.MMSightMediaCodecMP4MuxRecorder", localException, "clear error: %s", new Object[] { localException.getMessage() });
        AppMethodBeat.o(76648);
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
    AppMethodBeat.i(76642);
    boolean bool;
    if (!this.eNa)
    {
      ab.i("MicroMsg.MMSightMediaCodecMP4MuxRecorder", "preInit, cameraOrientation");
      bool = kn(paramInt);
      this.eNa = true;
      ab.i("MicroMsg.MMSightMediaCodecMP4MuxRecorder", "initImpl result: %s", new Object[] { Boolean.valueOf(bool) });
      AppMethodBeat.o(76642);
    }
    while (true)
    {
      return bool;
      AppMethodBeat.o(76642);
      bool = true;
    }
  }

  public final void kp(int paramInt)
  {
    AppMethodBeat.i(76657);
    ab.i("MicroMsg.MMSightMediaCodecMP4MuxRecorder", "overrideDurationMs: %s", new Object[] { Integer.valueOf(paramInt) });
    this.fcH = paramInt;
    AppMethodBeat.o(76657);
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
    AppMethodBeat.i(76654);
    ab.i("MicroMsg.MMSightMediaCodecMP4MuxRecorder", "pause");
    if ((this.fcQ != null) && (this.fcQ.oxa == d.c.ovB))
      this.fcQ.a(d.c.ovJ);
    AppMethodBeat.o(76654);
  }

  public final void reset()
  {
    AppMethodBeat.i(76649);
    ab.i("MicroMsg.MMSightMediaCodecMP4MuxRecorder", "reset, yuvRecorder: %s, aacRecorder: %s, muxer: %s", new Object[] { this.owH, this.fcJ, this.fcZ });
    synchronized (this.fcD)
    {
      this.owH = null;
      this.fcJ = null;
      this.fcZ = null;
      this.eNa = false;
      this.fda = false;
      AppMethodBeat.o(76649);
      return;
    }
  }

  public final void s(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    AppMethodBeat.i(76651);
    ab.i("MicroMsg.MMSightMediaCodecMP4MuxRecorder", "setSize, width: %s, height: %s, targetWidth: %s, targetHeight: %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), Integer.valueOf(paramInt4) });
    ab.i("MicroMsg.MMSightMediaCodecMP4MuxRecorder", "setSize, after align, targetWidth: %d, targetHeight: %d", new Object[] { Integer.valueOf(paramInt3), Integer.valueOf(paramInt4) });
    this.fcL = paramInt3;
    this.fcM = paramInt4;
    this.fcO = paramInt1;
    this.fcP = paramInt2;
    if (j.owk.g(Integer.valueOf(paramInt1 * paramInt2 * 3 / 2)) == null)
    {
      ab.i("MicroMsg.MMSightMediaCodecMP4MuxRecorder", "preloadCameraData, width: %s, height: %s, count: %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(3) });
      long l = bo.yz();
      for (paramInt3 = 0; paramInt3 < 3; paramInt3++)
        j.owk.g(new byte[paramInt1 * paramInt2 * 3 / 2]);
      ab.i("MicroMsg.MMSightMediaCodecMP4MuxRecorder", "preloadCameraData used %sms", new Object[] { Long.valueOf(bo.az(l)) });
    }
    AppMethodBeat.o(76651);
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
    AppMethodBeat.i(76644);
    this.fde = paramRunnable;
    ab.i("MicroMsg.MMSightMediaCodecMP4MuxRecorder", "!!!!!stop, stopCallback: %s!!!", new Object[] { paramRunnable });
    if ((this.owH == null) || ((this.fcJ == null) && (!this.fdh)))
    {
      ab.i("MicroMsg.MMSightMediaCodecMP4MuxRecorder", "error, yuvRecorder or aacRecorder is null");
      if (paramRunnable != null)
        al.d(paramRunnable);
      AppMethodBeat.o(76644);
    }
    while (true)
    {
      return;
      if ((this.fcQ != null) && (this.fcQ.oxa == d.c.ovE))
      {
        ab.i("MicroMsg.MMSightMediaCodecMP4MuxRecorder", "stop, already in stop status");
        if (this.fcJ != null)
          this.fcJ.clear();
        if (this.owH != null)
          this.owH.clear();
        if (paramRunnable != null)
          al.d(paramRunnable);
        AppMethodBeat.o(76644);
      }
      else
      {
        this.fdk = null;
        this.fcF = ((int)this.owH.UQ());
        if (this.fcQ != null)
          this.fcQ.a(d.c.ovC);
        if (this.owH != null)
          this.owH.a(new n.4(this));
        if (this.fcJ != null)
          this.fcJ.a(new n.5(this));
        AppMethodBeat.o(76644);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.mmsight.model.a.n
 * JD-Core Version:    0.6.2
 */