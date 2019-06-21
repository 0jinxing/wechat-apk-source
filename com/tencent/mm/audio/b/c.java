package com.tencent.mm.audio.b;

import android.content.Context;
import android.media.AudioManager;
import android.media.AudioRecord;
import android.os.Build.VERSION;
import android.os.SystemClock;
import com.tencent.mars.smc.IDKey;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.compatible.b.h.a;
import com.tencent.mm.compatible.b.i;
import com.tencent.mm.compatible.b.j;
import com.tencent.mm.compatible.e.k;
import com.tencent.mm.compatible.e.m;
import com.tencent.mm.compatible.e.q;
import com.tencent.mm.compatible.util.g.a;
import com.tencent.mm.g.a.jx;
import com.tencent.mm.g.a.mh;
import com.tencent.mm.g.a.mh.b;
import com.tencent.mm.g.a.mi;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import java.util.ArrayList;

public final class c
{
  private int cpA;
  public int cpB;
  private boolean cpC;
  long cpD;
  int cpE;
  boolean cpF;
  int cpG;
  private boolean cpH;
  int cpI;
  boolean cpJ;
  boolean cpK;
  private AudioRecord cpL;
  public c.a cpM;
  private f cpN;
  private com.tencent.mm.compatible.b.h cpO;
  com.tencent.mm.audio.d.b cpP;
  public int cpQ;
  public int cpR;
  public int cpS;
  private f.a cpT;
  public int cpq;
  int cpr;
  int cps;
  int cpt;
  public int cpu;
  private int cpv;
  public int cpw;
  private boolean cpx;
  boolean cpy;
  public int cpz;
  public int mSampleRate;

  public c(int paramInt1, int paramInt2, int paramInt3)
  {
    AppMethodBeat.i(55732);
    this.cpq = 0;
    this.cpr = 0;
    this.cps = 0;
    this.cpt = 0;
    this.cpu = 1;
    this.cpv = 1;
    this.mSampleRate = 8000;
    this.cpw = 120;
    this.cpx = false;
    this.cpy = false;
    this.cpz = 10;
    this.cpA = -1;
    this.cpB = -123456789;
    this.cpC = false;
    this.cpD = -1L;
    this.cpF = false;
    this.cpH = false;
    this.cpI = 0;
    this.cpJ = false;
    this.cpK = false;
    this.cpQ = 2;
    this.cpR = 1;
    this.cpS = 0;
    this.cpT = new f.a()
    {
      public final void d(int paramAnonymousInt, byte[] paramAnonymousArrayOfByte)
      {
        AppMethodBeat.i(55731);
        c.this.cpI += 1;
        if ((c.this.cpK) && (System.currentTimeMillis() - c.this.cpD <= 1000L) && (c.this.cpI - 10 > (System.currentTimeMillis() - c.this.cpD) / c.this.cpw))
        {
          com.tencent.mm.plugin.report.service.h.pYm.a(151L, 0L, 1L, false);
          com.tencent.mm.plugin.report.service.h.pYm.a(151L, 4L, 1L, false);
          ab.e("MicroMsg.MMPcmRecorder", "return too many data, force stop, %d, %d", new Object[] { Integer.valueOf(c.this.cpI), Long.valueOf((System.currentTimeMillis() - c.this.cpD) / c.this.cpw) });
          c.this.cpJ = true;
        }
        if (c.this.cpP != null)
          c.this.cpP.y(paramAnonymousArrayOfByte, paramAnonymousInt);
        c localc;
        int i;
        int j;
        int k;
        int m;
        int n;
        if (paramAnonymousInt > 0)
        {
          localc = c.this;
          if ((!localc.cpF) || (-2 != localc.cps))
          {
            i = paramAnonymousInt / localc.cpE;
            j = 5;
            if (j <= localc.cpG + i)
            {
              k = (j - localc.cpG - 1) * localc.cpE;
              m = localc.cpE + k;
              if (k >= 0)
              {
                n = k;
                if (m <= paramAnonymousInt)
                  break label612;
              }
              ab.e("MicroMsg.MMPcmRecorder", "error start: %d, end: %d", new Object[] { Integer.valueOf(k), Integer.valueOf(m) });
            }
            localc.cpG = ((localc.cpG + i) % 5);
            if (localc.cps == 20)
            {
              localc.cpq = 6;
              ab.e("MicroMsg.MMPcmRecorder", "[error] RECORDER_DATAZERO_ERROR");
              if ((localc.cpr != -1) || (localc.cpt != -1))
                break label652;
              localc.cpq = 11;
              ab.e("MicroMsg.MMPcmRecorder", "[error] RECORDER_DATAZERO_DISTORTION_READRET_ERROR");
              label370: com.tencent.mm.plugin.report.service.h.pYm.a(151L, 0L, 1L, false);
              com.tencent.mm.plugin.report.service.h.pYm.a(151L, 5L, 1L, false);
              localc.cps = -2;
              localc.EN();
            }
          }
        }
        if (c.this.cpy)
        {
          if (paramAnonymousInt > 0)
          {
            localc = c.this;
            if (localc.cpr != -1)
            {
              k = 0;
              j = 0;
              label439: if (j < paramAnonymousInt / 2)
              {
                i = (short)(paramAnonymousArrayOfByte[(j * 2 + 1)] << 8 | paramAnonymousArrayOfByte[(j * 2 + 0)] & 0xFF);
                if (i < 32760)
                {
                  n = k;
                  if (i != -32768);
                }
                else
                {
                  n = k + 1;
                }
                if (n < 5)
                  break label700;
                localc.cpr += 1;
              }
              if (localc.cpr > 100)
              {
                localc.cpq = 7;
                ab.e("MicroMsg.MMPcmRecorder", "[error] RECORDER_DISTORTION_ERROR");
                if ((localc.cps != -2) || (localc.cpt != -1))
                  break label710;
                localc.cpq = 11;
                ab.e("MicroMsg.MMPcmRecorder", "[error] RECORDER_DATAZERO_DISTORTION_READRET_ERROR");
              }
            }
            while (true)
            {
              com.tencent.mm.plugin.report.service.h.pYm.a(151L, 0L, 1L, false);
              com.tencent.mm.plugin.report.service.h.pYm.a(151L, 6L, 1L, false);
              localc.EN();
              localc.cpr = -1;
              AppMethodBeat.o(55731);
              return;
              label612: 
              do
              {
                n++;
                if (n >= m)
                  break;
              }
              while (paramAnonymousArrayOfByte[n] == 0);
              localc.cps = -1;
              localc.cpF = true;
              localc.cps += 1;
              j += 5;
              break;
              label652: if (localc.cpr == -1)
              {
                localc.cpq = 8;
                ab.e("MicroMsg.MMPcmRecorder", "[error] RECORDER_DATAZERO_DISTORTION_ERROR");
                break label370;
              }
              if (localc.cpt != -1)
                break label370;
              localc.cpq = 9;
              ab.e("MicroMsg.MMPcmRecorder", "[error] RECORDER_DATAZERO_READRET_ERROR");
              break label370;
              label700: j++;
              k = n;
              break label439;
              label710: if (localc.cps == -2)
              {
                localc.cpq = 8;
                ab.e("MicroMsg.MMPcmRecorder", "[error] RECORDER_DATAZERO_DISTORTION_ERROR");
              }
              else if (localc.cpt == -1)
              {
                localc.cpq = 10;
                ab.e("MicroMsg.MMPcmRecorder", "[error] RECORDER_DISTORTION_READRET_ERROR");
              }
            }
          }
          paramAnonymousArrayOfByte = c.this;
          if ((paramAnonymousArrayOfByte.cpt != -1) && (paramAnonymousInt < 0))
          {
            paramAnonymousArrayOfByte.cpt += 1;
            if (paramAnonymousArrayOfByte.cpt >= 50)
            {
              paramAnonymousArrayOfByte.cpq = 5;
              ab.e("MicroMsg.MMPcmRecorder", "[error] RECORDER_READRET_ERROR");
              if ((paramAnonymousArrayOfByte.cps != -2) || (paramAnonymousArrayOfByte.cpr != -1))
                break label880;
              paramAnonymousArrayOfByte.cpq = 11;
              ab.e("MicroMsg.MMPcmRecorder", "[error] RECORDER_DATAZERO_DISTORTION_READRET_ERROR");
            }
          }
        }
        while (true)
        {
          com.tencent.mm.plugin.report.service.h.pYm.a(151L, 0L, 1L, false);
          com.tencent.mm.plugin.report.service.h.pYm.a(151L, 7L, 1L, false);
          paramAnonymousArrayOfByte.EN();
          paramAnonymousArrayOfByte.cpt = -1;
          AppMethodBeat.o(55731);
          break;
          label880: if (paramAnonymousArrayOfByte.cps == -2)
          {
            paramAnonymousArrayOfByte.cpq = 9;
            ab.e("MicroMsg.MMPcmRecorder", "[error] RECORDER_DATAZERO_READRET_ERROR");
          }
          else if (paramAnonymousArrayOfByte.cpr == -1)
          {
            paramAnonymousArrayOfByte.cpq = 10;
            ab.e("MicroMsg.MMPcmRecorder", "[error] RECORDER_DISTORTION_READRET_ERROR");
          }
        }
      }
    };
    this.cpv = paramInt2;
    this.mSampleRate = paramInt1;
    this.cpA = paramInt3;
    if (this.cpv == 2)
    {
      this.cpQ = 3;
      if ((this.cpA == 0) && (q.etn.erT > 0))
        this.cpw = q.etn.erT;
      if (q.etn.ese > 0)
        this.cpQ = q.etn.ese;
      if (q.etn.erO > 0)
        this.cpz = q.etn.erO;
      if (q.etd.eql)
        this.cpP = new com.tencent.mm.audio.d.b(g.cqq, this.cpv, this.mSampleRate);
      if (1 != g.x("EnableRecorderCheckUnreasonableData", 1))
        break label360;
    }
    label360: for (boolean bool = true; ; bool = false)
    {
      this.cpK = bool;
      ab.i("MicroMsg.MMPcmRecorder", "MMPcmRecorder sampleRate:%d channelCnt:%d durationPreFrame:%d newBufPreFrame:%b Biz:%d", new Object[] { Integer.valueOf(this.mSampleRate), Integer.valueOf(this.cpv), Integer.valueOf(this.cpw), Boolean.valueOf(this.cpx), Integer.valueOf(this.cpA) });
      AppMethodBeat.o(55732);
      return;
      this.cpQ = 2;
      break;
    }
  }

  private boolean EK()
  {
    AppMethodBeat.i(55738);
    this.cpR = 1;
    boolean bool1;
    int j;
    if (q.etn.erP == 2)
    {
      bool1 = false;
      i = m.Lw();
      j = q.etd.eqy;
      if ((i & 0x400) == 0)
        break label148;
      i = j;
      if (j <= 0)
        i = 0;
      ab.i("MicroMsg.MMPcmRecorder", "CPU ARMv7, enableRecTimerMode: ".concat(String.valueOf(i)));
      label63: if (i != 1)
        break label153;
    }
    int m;
    label148: label153: for (int k = 1; ; k = 0)
    {
      ab.d("MicroMsg.MMPcmRecorder", "init, start getMinBufferSize");
      m = AudioRecord.getMinBufferSize(this.mSampleRate, this.cpQ, 2);
      if ((m != -2) && (m != -1))
        break label159;
      this.cpR = 3;
      this.cpq = 1;
      ab.e("MicroMsg.MMPcmRecorder", "[error] RECORDER_MINBUFFER_ERROR ".concat(String.valueOf(m)));
      EN();
      bool1 = false;
      AppMethodBeat.o(55738);
      return bool1;
      bool1 = true;
      break;
      i = 1;
      break label63;
    }
    label159: ab.d("MicroMsg.MMPcmRecorder", "finish getMinBufferSize, minBufSize: %d", new Object[] { Integer.valueOf(m) });
    this.cpE = (this.mSampleRate * 20 * this.cpv * 2 / 1000);
    int n = this.mSampleRate * this.cpw * this.cpv / 1000;
    int i1 = n * 2;
    ab.i("MicroMsg.MMPcmRecorder", "Construct AudioRecord, minBufSize:%d, sampleRate:%d, sampleCntPreFrame:%d, sizePreFrame:%d, timesOfMinBuffer:%d, readMode:%b", new Object[] { Integer.valueOf(m), Integer.valueOf(this.mSampleRate), Integer.valueOf(n), Integer.valueOf(i1), Integer.valueOf(this.cpz), Boolean.valueOf(bool1) });
    int i2 = this.cpA;
    int i = this.cpu;
    if ((1 == i2) || (6 == i2) || (7 == i2))
      if (Build.VERSION.SDK_INT < 11)
      {
        j = 1;
        if (q.etd.epG)
          j = 1;
        if (q.etd.eqf >= 0)
          j = q.etd.eqf;
        i = j;
        if (6 != i2)
          break label1260;
        i = j;
        if (q.etd.eqI < 0)
          break label1260;
        i = q.etd.eqI;
      }
    label670: label675: label721: label741: label1260: 
    while (true)
    {
      ab.i("MicroMsg.MMPcmRecorder", "init audio source: %s", new Object[] { Integer.valueOf(i) });
      while (true)
      {
        try
        {
          com.tencent.mm.compatible.b.d locald = new com/tencent/mm/compatible/b/d;
          locald.<init>(i, this.mSampleRate, this.cpQ, this.cpz * m);
          this.cpL = locald;
          if (this.cpL.getState() == 0)
          {
            com.tencent.mm.plugin.report.service.h.pYm.a(151L, 0L, 1L, false);
            com.tencent.mm.plugin.report.service.h.pYm.a(151L, 2L, 1L, false);
            this.cpL.release();
            this.cpq = 2;
            ab.e("MicroMsg.MMPcmRecorder", "[error] RECORDER_NEWAUDIORECORD_ERROR");
            if (7 != i)
              break label670;
            i = 1;
            this.cpL = new com.tencent.mm.compatible.b.d(i, this.mSampleRate, this.cpQ, this.cpz * m);
          }
          if (this.cpL.getState() != 0)
            break label675;
          com.tencent.mm.plugin.report.service.h.pYm.a(151L, 0L, 1L, false);
          com.tencent.mm.plugin.report.service.h.pYm.a(151L, 2L, 1L, false);
          this.cpL.release();
          this.cpL = null;
          this.cpR = 2;
          this.cpq = 3;
          ab.e("MicroMsg.MMPcmRecorder", "[error] RECORDER_SECNEWAUDIORECORD_ERROR");
          EN();
          bool1 = false;
          AppMethodBeat.o(55738);
          break;
          j = 7;
        }
        catch (Exception localException)
        {
          ab.e("MicroMsg.MMPcmRecorder", "new AudioRecord failed");
          this.cpq = 12;
          ab.e("MicroMsg.MMPcmRecorder", "[error] RECORDER_NEW_AUDIORECORD_EXCEPTION");
          com.tencent.mm.plugin.report.service.h.pYm.a(151L, 0L, 1L, false);
          com.tencent.mm.plugin.report.service.h.pYm.a(151L, 1L, 1L, false);
          bool1 = false;
          AppMethodBeat.o(55738);
        }
        break;
        i = 0;
      }
      AudioRecord localAudioRecord;
      Object localObject;
      if (bool1)
      {
        localAudioRecord = this.cpL;
        boolean bool2 = this.cpx;
        localObject = this.cpM;
        if (((this.cpA == 1) || (this.cpA == 6)) && (k != 0))
        {
          bool1 = true;
          this.cpN = new e(localAudioRecord, bool2, i1, (c.a)localObject, bool1);
          this.cpN.a(this.cpT);
          if (-123456789 != this.cpB)
            this.cpN.gH(this.cpB);
          if (this.cpC)
          {
            this.cpO = new com.tencent.mm.compatible.b.h();
            localObject = this.cpO;
            localAudioRecord = this.cpL;
            i = this.cpA;
            ab.d("MicroMsg.MMAudioPreProcess", "api " + Build.VERSION.SDK_INT);
            if (!com.tencent.mm.compatible.util.d.fP(16))
            {
              if (localAudioRecord != null)
                break label899;
              ab.d("MicroMsg.MMAudioPreProcess", "audio is null");
            }
          }
        }
      }
      while (true)
      {
        bool1 = true;
        AppMethodBeat.o(55738);
        break;
        bool1 = false;
        break label721;
        this.cpN = new d(this.cpL, this.cpM, this.cpx, n, i1);
        break label741;
        if (1 == i)
        {
          if (q.etn.esl != 1)
          {
            ab.d("MicroMsg.MMAudioPreProcess", "disable by config");
          }
          else
          {
            if (q.etn.esm != 2)
            {
              ((com.tencent.mm.compatible.b.h)localObject).epw = new j(localAudioRecord);
              if ((((com.tencent.mm.compatible.b.h)localObject).epw != null) && (((com.tencent.mm.compatible.b.h)localObject).epw.isAvailable()))
                ((com.tencent.mm.compatible.b.h)localObject).epw.KJ();
            }
            if (q.etn.esn != 2)
            {
              ((com.tencent.mm.compatible.b.h)localObject).epx = new com.tencent.mm.compatible.b.f(localAudioRecord);
              if ((((com.tencent.mm.compatible.b.h)localObject).epx != null) && (((com.tencent.mm.compatible.b.h)localObject).epx.isAvailable()))
                ((com.tencent.mm.compatible.b.h)localObject).epx.KJ();
            }
            if (q.etn.eso != 2)
            {
              ((com.tencent.mm.compatible.b.h)localObject).epy = new i(localAudioRecord);
              if ((((com.tencent.mm.compatible.b.h)localObject).epy != null) && (((com.tencent.mm.compatible.b.h)localObject).epy.isAvailable()))
                ((com.tencent.mm.compatible.b.h)localObject).epy.KJ();
            }
          }
        }
        else if (q.etn.erS != 1)
        {
          ab.d("MicroMsg.MMAudioPreProcess", "disable by config");
        }
        else
        {
          ((com.tencent.mm.compatible.b.h)localObject).epw = new j(localAudioRecord);
          if ((((com.tencent.mm.compatible.b.h)localObject).epw != null) && (((com.tencent.mm.compatible.b.h)localObject).epw.isAvailable()))
            ((com.tencent.mm.compatible.b.h)localObject).epw.KJ();
          ((com.tencent.mm.compatible.b.h)localObject).epx = new com.tencent.mm.compatible.b.f(localAudioRecord);
          if ((((com.tencent.mm.compatible.b.h)localObject).epx != null) && (((com.tencent.mm.compatible.b.h)localObject).epx.isAvailable()))
            ((com.tencent.mm.compatible.b.h)localObject).epx.KJ();
          ((com.tencent.mm.compatible.b.h)localObject).epy = new i(localAudioRecord);
          if ((((com.tencent.mm.compatible.b.h)localObject).epy != null) && (((com.tencent.mm.compatible.b.h)localObject).epy.isAvailable()))
            ((com.tencent.mm.compatible.b.h)localObject).epy.KJ();
        }
      }
    }
  }

  private boolean EM()
  {
    boolean bool = false;
    AppMethodBeat.i(55741);
    g.a locala = new g.a();
    ab.i("MicroMsg.MMPcmRecorder", "startRecord, " + java.lang.Thread.currentThread().getStackTrace()[2].getMethodName());
    if (this.cpL != null)
    {
      ab.e("MicroMsg.MMPcmRecorder", "start error ,is recording ");
      AppMethodBeat.o(55741);
    }
    while (true)
    {
      return bool;
      locala.evE = SystemClock.elapsedRealtime();
      ab.d("MicroMsg.MMPcmRecorder", "startRecordInternal, start init");
      if (!EK())
      {
        ab.e("MicroMsg.MMPcmRecorder", "startRecord init error");
        AppMethodBeat.o(55741);
      }
      else
      {
        ab.i("MicroMsg.MMPcmRecorder", "init cost: " + locala.Mr() + "ms");
        locala.evE = SystemClock.elapsedRealtime();
        this.cpL.startRecording();
        ab.i("MicroMsg.MMPcmRecorder", "startRecording cost: " + locala.Mr());
        if (this.cpL.getRecordingState() != 3)
        {
          com.tencent.mm.plugin.report.service.h.pYm.a(151L, 0L, 1L, false);
          com.tencent.mm.plugin.report.service.h.pYm.a(151L, 3L, 1L, false);
          this.cpR = 2;
          this.cpq = 4;
          ab.e("MicroMsg.MMPcmRecorder", "[error] RECORDER_STARTRECORDING_ERROR");
          EN();
          AppMethodBeat.o(55741);
        }
        else if (this.cpN != null)
        {
          bool = this.cpN.EL();
          AppMethodBeat.o(55741);
        }
        else
        {
          ab.e("MicroMsg.MMPcmRecorder", "mRecordMode is null");
          AppMethodBeat.o(55741);
        }
      }
    }
  }

  public final boolean EB()
  {
    boolean bool1 = true;
    boolean bool2 = true;
    while (true)
    {
      try
      {
        AppMethodBeat.i(55742);
        if (true == this.cpH)
        {
          ab.i("MicroMsg.MMPcmRecorder", "already have stopped");
          AppMethodBeat.o(55742);
          return bool2;
        }
        this.cpH = true;
        Object localObject1 = new com/tencent/mm/compatible/util/g$a;
        ((g.a)localObject1).<init>();
        if (this.cpP != null)
        {
          this.cpP.Fg();
          this.cpP = null;
        }
        ((g.a)localObject1).evE = SystemClock.elapsedRealtime();
        if (this.cpN != null)
        {
          this.cpN.stopRecord();
          this.cpN = null;
        }
        localObject3 = new java/lang/StringBuilder;
        ((StringBuilder)localObject3).<init>("cost ");
        ab.i("MicroMsg.MMPcmRecorder", ((g.a)localObject1).Mr() + "ms to call stopRecord");
        localObject3 = new java/lang/StringBuilder;
        ((StringBuilder)localObject3).<init>("stopRecord, ");
        ab.i("MicroMsg.MMPcmRecorder", java.lang.Thread.currentThread().getStackTrace()[2].getMethodName());
        if (this.cpL == null)
        {
          ab.e("MicroMsg.MMPcmRecorder", "audioRecord is null");
          bool2 = false;
          if (((!this.cpF) && (-1L != this.cpD) && (System.currentTimeMillis() - this.cpD >= 2000L)) || (this.cpJ))
          {
            ab.i("MicroMsg.MMPcmRecorder", "stopRecord publish PermissionShowDlgEvent");
            localObject1 = new com/tencent/mm/g/a/mi;
            ((mi)localObject1).<init>();
            ((mi)localObject1).cIm.type = 1;
            a.xxA.m((com.tencent.mm.sdk.b.b)localObject1);
            bool1 = false;
          }
          localObject1 = new com/tencent/mm/g/a/mh;
          ((mh)localObject1).<init>();
          ((mh)localObject1).cIh.type = 1;
          ((mh)localObject1).cIh.cIj = false;
          ((mh)localObject1).cIh.cIk = bool1;
          a.xxA.m((com.tencent.mm.sdk.b.b)localObject1);
          ab.i("MicroMsg.MMPcmRecorder", "doNewIDKeyStatOnStopRecord, mRecordDetailState: %d", new Object[] { Integer.valueOf(this.cpq) });
          localObject1 = new java/util/ArrayList;
          ((ArrayList)localObject1).<init>();
          localObject3 = new com/tencent/mars/smc/IDKey;
          ((IDKey)localObject3).<init>(357, 0, 1);
          ((ArrayList)localObject1).add(localObject3);
          if (this.cpq != 0)
          {
            localObject3 = new com/tencent/mars/smc/IDKey;
            ((IDKey)localObject3).<init>(357, 1, 1);
            ((ArrayList)localObject1).add(localObject3);
          }
        }
        switch (this.cpq)
        {
        default:
          ab.i("MicroMsg.MMPcmRecorder", "do idkey, infolist size: %d", new Object[] { Integer.valueOf(((ArrayList)localObject1).size()) });
          com.tencent.mm.plugin.report.service.h.pYm.b((ArrayList)localObject1, false);
          AppMethodBeat.o(55742);
          continue;
          if (this.cpL.getState() != 1)
          {
            localObject1 = new java/lang/StringBuilder;
            ((StringBuilder)localObject1).<init>("audioRecord sate error ");
            ab.e("MicroMsg.MMPcmRecorder", this.cpL.getState());
            bool2 = false;
            continue;
          }
          ((g.a)localObject1).evE = SystemClock.elapsedRealtime();
          this.cpL.stop();
          this.cpL.release();
          this.cpL = null;
          localObject3 = new java/lang/StringBuilder;
          ((StringBuilder)localObject3).<init>("cost ");
          ab.i("MicroMsg.MMPcmRecorder", ((g.a)localObject1).Mr() + "ms to call stop and release");
          bool2 = true;
          break;
        case 1:
          localObject3 = new com/tencent/mars/smc/IDKey;
          ((IDKey)localObject3).<init>(357, 2, 1);
          ((ArrayList)localObject1).add(localObject3);
          continue;
        case 2:
        case 3:
        case 4:
        case 5:
        case 6:
        case 7:
        case 8:
        case 9:
        case 10:
        case 11:
        case 12:
        }
      }
      finally
      {
      }
      Object localObject3 = new com/tencent/mars/smc/IDKey;
      ((IDKey)localObject3).<init>(357, 3, 1);
      localObject2.add(localObject3);
      continue;
      localObject3 = new com/tencent/mars/smc/IDKey;
      ((IDKey)localObject3).<init>(357, 4, 1);
      localObject2.add(localObject3);
      continue;
      localObject3 = new com/tencent/mars/smc/IDKey;
      ((IDKey)localObject3).<init>(357, 5, 1);
      localObject2.add(localObject3);
      continue;
      localObject3 = new com/tencent/mars/smc/IDKey;
      ((IDKey)localObject3).<init>(357, 6, 1);
      localObject2.add(localObject3);
      continue;
      localObject3 = new com/tencent/mars/smc/IDKey;
      ((IDKey)localObject3).<init>(357, 7, 1);
      localObject2.add(localObject3);
      continue;
      localObject3 = new com/tencent/mars/smc/IDKey;
      ((IDKey)localObject3).<init>(357, 8, 1);
      localObject2.add(localObject3);
      continue;
      localObject3 = new com/tencent/mars/smc/IDKey;
      ((IDKey)localObject3).<init>(357, 9, 1);
      localObject2.add(localObject3);
      continue;
      localObject3 = new com/tencent/mars/smc/IDKey;
      ((IDKey)localObject3).<init>(357, 10, 1);
      localObject2.add(localObject3);
      continue;
      localObject3 = new com/tencent/mars/smc/IDKey;
      ((IDKey)localObject3).<init>(357, 11, 1);
      localObject2.add(localObject3);
      continue;
      localObject3 = new com/tencent/mars/smc/IDKey;
      ((IDKey)localObject3).<init>(357, 12, 1);
      localObject2.add(localObject3);
      continue;
      localObject3 = new com/tencent/mars/smc/IDKey;
      ((IDKey)localObject3).<init>(357, 13, 1);
      localObject2.add(localObject3);
    }
  }

  public final void EJ()
  {
    AppMethodBeat.i(55735);
    this.cpy = true;
    ab.i("MicroMsg.MMPcmRecorder", "mCheckAudioQuality: " + this.cpy);
    AppMethodBeat.o(55735);
  }

  public final boolean EL()
  {
    boolean bool = false;
    AppMethodBeat.i(55740);
    ab.i("MicroMsg.MMPcmRecorder", "startRecord");
    Object localObject = new mh();
    ((mh)localObject).cIh.type = 1;
    ((mh)localObject).cIh.cIj = true;
    a.xxA.m((com.tencent.mm.sdk.b.b)localObject);
    this.cpD = System.currentTimeMillis();
    this.cpF = false;
    if (((mh)localObject).cIi.cIl)
    {
      ab.e("MicroMsg.MMPcmRecorder", "can't start record due to permission tips policy");
      this.cpq = 13;
      AppMethodBeat.o(55740);
    }
    while (true)
    {
      return bool;
      localObject = (AudioManager)ah.getContext().getSystemService("audio");
      if ((localObject != null) && (((AudioManager)localObject).isMicrophoneMute()))
      {
        ab.e("MicroMsg.MMPcmRecorder", "microphone is mute");
        this.cpq = 14;
        localObject = new jx();
        a.xxA.m((com.tencent.mm.sdk.b.b)localObject);
        com.tencent.mm.plugin.report.service.h.pYm.a(151L, 0L, 1L, false);
        com.tencent.mm.plugin.report.service.h.pYm.a(151L, 8L, 1L, false);
        AppMethodBeat.o(55740);
      }
      else
      {
        this.cpH = false;
        bool = EM();
        if (!bool)
        {
          EB();
          localObject = new mi();
          ((mi)localObject).cIm.type = 1;
          a.xxA.m((com.tencent.mm.sdk.b.b)localObject);
        }
        AppMethodBeat.o(55740);
      }
    }
  }

  final void EN()
  {
    AppMethodBeat.i(55743);
    if (this.cpM != null)
      this.cpM.bN(this.cpR, this.cpq);
    AppMethodBeat.o(55743);
  }

  public final int EO()
  {
    AppMethodBeat.i(55744);
    int i;
    if (this.cpN != null)
    {
      i = this.cpN.EO();
      AppMethodBeat.o(55744);
    }
    while (true)
    {
      return i;
      i = -1;
      AppMethodBeat.o(55744);
    }
  }

  public final void bq(boolean paramBoolean)
  {
    AppMethodBeat.i(55734);
    this.cpx = paramBoolean;
    ab.i("MicroMsg.MMPcmRecorder", "mNewBufPreFrame: " + this.cpx);
    AppMethodBeat.o(55734);
  }

  public final void br(boolean paramBoolean)
  {
    AppMethodBeat.i(55737);
    this.cpC = paramBoolean;
    ab.i("MicroMsg.MMPcmRecorder", "mUsePreProcess: " + this.cpC);
    AppMethodBeat.o(55737);
  }

  public final void bs(boolean paramBoolean)
  {
    AppMethodBeat.i(55739);
    ab.i("MicroMsg.MMPcmRecorder", "switchMute mute:".concat(String.valueOf(paramBoolean)));
    if (this.cpN != null)
      this.cpN.bs(paramBoolean);
    AppMethodBeat.o(55739);
  }

  public final void gG(int paramInt)
  {
    AppMethodBeat.i(55733);
    this.cpw = paramInt;
    ab.i("MicroMsg.MMPcmRecorder", "mDurationPreFrame: " + this.cpw);
    AppMethodBeat.o(55733);
  }

  public final void v(int paramInt, boolean paramBoolean)
  {
    AppMethodBeat.i(55736);
    if ((10 == this.cpz) || (paramBoolean))
    {
      this.cpz = paramInt;
      ab.i("MicroMsg.MMPcmRecorder", "mMultipleOfMinBuffer: " + this.cpz);
    }
    AppMethodBeat.o(55736);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.audio.b.c
 * JD-Core Version:    0.6.2
 */