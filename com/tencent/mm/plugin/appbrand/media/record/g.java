package com.tencent.mm.plugin.appbrand.media.record;

import android.os.Looper;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.mb;
import com.tencent.mm.plugin.appbrand.media.record.a.c.a;
import com.tencent.mm.plugin.appbrand.media.record.record_imp.RecordParam;
import com.tencent.mm.plugin.appbrand.media.record.record_imp.a.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.ap;

public final class g
{
  private static Object cli;
  private static g ilA;
  private ap ikY;
  private e ilB;
  public com.tencent.mm.plugin.appbrand.media.record.record_imp.a ilm;
  private Object iln;
  public RecordParam ilo;
  g.a ilp;
  private com.tencent.mm.plugin.appbrand.media.record.a.c ilq;
  private boolean ilr;
  private int ils;
  private long ilt;
  private int ilu;
  private ak ilv;
  boolean ilw;
  boolean ilx;
  private a.a ily;
  private c.a ilz;
  private long mDuration;
  private String mFilePath;
  public boolean mIsRecording;
  private long mStartTime;

  static
  {
    AppMethodBeat.i(105634);
    cli = new Object();
    AppMethodBeat.o(105634);
  }

  private g()
  {
    AppMethodBeat.i(105619);
    this.ilm = null;
    this.mIsRecording = false;
    this.iln = new Object();
    this.ilp = g.a.ilE;
    this.ilq = null;
    this.ilr = false;
    this.ils = 0;
    this.ikY = null;
    this.mDuration = 0L;
    this.ilt = 0L;
    this.ilu = 0;
    this.mStartTime = 0L;
    this.ilw = false;
    this.ilx = false;
    this.ily = new g.1(this);
    this.ilz = new g.5(this);
    this.ilB = new g.4(this);
    AppMethodBeat.o(105619);
  }

  private boolean EM()
  {
    AppMethodBeat.i(105622);
    ab.i("MicroMsg.Record.AudioRecordMgr", "startRecordInternal");
    if (this.ilm != null)
    {
      this.ilm.EB();
      this.ilm = null;
      ab.i("MicroMsg.Record.AudioRecordMgr", "mRecorder is not null, stop it, and not callback stop event");
    }
    if (this.ilm == null)
    {
      this.ilm = new com.tencent.mm.plugin.appbrand.media.record.record_imp.a(this.ilo);
      this.ilm.imh = this.ily;
    }
    com.tencent.mm.plugin.appbrand.media.record.record_imp.a locala = this.ilm;
    ab.i("MicroMsg.Record.AppBrandRecorder", "startRecord");
    if (locala.coZ != null)
    {
      locala.coZ.EB();
      locala.coZ = null;
    }
    locala.img = System.currentTimeMillis();
    ab.i("MicroMsg.Record.AppBrandRecorder", "start time ticket:%d", new Object[] { Long.valueOf(locala.img) });
    locala.coZ = new com.tencent.mm.audio.b.c(locala.sampleRate, locala.aOn, locala.cpA);
    if ("mp3".equalsIgnoreCase(locala.imf.hAQ))
    {
      locala.coZ.gG(40);
      locala.coZ.bq(false);
      locala.coZ.cpM = locala.imi;
      com.tencent.mm.audio.b.c localc = locala.coZ;
      int i = locala.imf.imn.ilf;
      localc.cpu = i;
      ab.i("MicroMsg.MMPcmRecorder", "mAudioSource: ".concat(String.valueOf(i)));
      if (!locala.coZ.EL())
        break label285;
    }
    label285: for (boolean bool = true; ; bool = false)
    {
      ab.i("MicroMsg.Record.AudioRecordMgr", "record start:%b", new Object[] { Boolean.valueOf(bool) });
      AppMethodBeat.o(105622);
      return bool;
      locala.coZ.gG(20);
      break;
    }
  }

  public static g aIm()
  {
    AppMethodBeat.i(105620);
    synchronized (cli)
    {
      if (ilA == null)
      {
        localg = new com/tencent/mm/plugin/appbrand/media/record/g;
        localg.<init>();
        ilA = localg;
      }
      g localg = ilA;
      AppMethodBeat.o(105620);
      return localg;
    }
  }

  private boolean aIn()
  {
    Object localObject1 = null;
    AppMethodBeat.i(105623);
    ab.i("MicroMsg.Record.AudioRecordMgr", "initEncode");
    if (this.ilq != null)
    {
      this.ilq.close();
      this.ilq = null;
    }
    this.mFilePath = h.cE(this.ilo.hAQ, this.ilo.euD);
    ab.i("MicroMsg.Record.AudioRecordMgr", "mFilePath:%s", new Object[] { this.mFilePath });
    String str = this.ilo.hAQ;
    ab.i("MicroMsg.Record.AudioEncodeFactory", "createEncodeByType:%s", new Object[] { str });
    Object localObject2 = localObject1;
    boolean bool;
    if (h.Cz(str))
    {
      if ("aac".equalsIgnoreCase(str))
        localObject2 = new com.tencent.mm.plugin.appbrand.media.record.a.a();
    }
    else
    {
      this.ilq = ((com.tencent.mm.plugin.appbrand.media.record.a.c)localObject2);
      if (this.ilq == null)
        break label293;
      bool = h.CA(this.mFilePath);
      if (bool)
        break label215;
      ab.e("MicroMsg.Record.AudioRecordMgr", "prepare cache file fail");
      AppMethodBeat.o(105623);
    }
    while (true)
    {
      return bool;
      if ("mp3".equalsIgnoreCase(str))
      {
        localObject2 = new com.tencent.mm.plugin.appbrand.media.record.a.d();
        break;
      }
      localObject2 = localObject1;
      if (!"wav".equalsIgnoreCase(str))
        break;
      localObject2 = new com.tencent.mm.plugin.appbrand.media.record.a.e();
      break;
      try
      {
        label215: bool = this.ilq.h(this.mFilePath, this.ilo.sampleRate, this.ilo.imk, this.ilo.iml);
        this.ilq.a(this.ilz);
        AppMethodBeat.o(105623);
      }
      catch (Exception localException)
      {
        while (true)
        {
          ab.printErrStackTrace("MicroMsg.Record.AudioRecordMgr", localException, "init encoder fail", new Object[0]);
          bool = false;
        }
      }
      label293: AppMethodBeat.o(105623);
      bool = false;
    }
  }

  private void aIp()
  {
    AppMethodBeat.i(105625);
    ab.i("MicroMsg.Record.AudioRecordMgr", "stop record in runnable");
    try
    {
      if (DB())
      {
        ab.e("MicroMsg.Record.AudioRecordMgr", "is stopped, don't stop again");
        AppMethodBeat.o(105625);
        return;
      }
      label56: Object localObject;
      if (this.ilm != null)
      {
        bool = this.ilm.EB();
        this.ilm = null;
        this.ilr = true;
        ab.i("MicroMsg.Record.AudioRecordMgr", "mPcmDuration:%d", new Object[] { Integer.valueOf(this.ils) });
        if (this.ilq != null)
        {
          this.ilq.flush();
          this.ilq.close();
          this.ilq = null;
        }
        localObject = aIq();
        g.3 local3 = new com/tencent/mm/plugin/appbrand/media/record/g$3;
        local3.<init>(this);
        ((ak)localObject).post(local3);
        if (!DA())
          break label362;
        ab.e("MicroMsg.Record.AudioRecordMgr", "don't calculate time again if it is pause state");
      }
      while (true)
      {
        ab.i("MicroMsg.Record.AudioRecordMgr", "stop:%b", new Object[] { Boolean.valueOf(bool) });
        if (!bool)
          break label496;
        ab.i("MicroMsg.Record.AudioRecordMgr", "onStop");
        this.ilp = g.a.ilI;
        this.mIsRecording = false;
        localObject = new mb();
        ((mb)localObject).cHS.action = 2;
        ((mb)localObject).cHS.state = "stop";
        if (this.ilo != null)
          ((mb)localObject).cHS.appId = this.ilo.appId;
        ab.i("MicroMsg.Record.AudioRecordMgr", "mPcmDuration:%d, mRealRecordedTime%d", new Object[] { Integer.valueOf(this.ils), Integer.valueOf(this.ilu) });
        ((mb)localObject).cHS.duration = Math.min(this.ils, this.ilu);
        ((mb)localObject).cHS.filePath = this.mFilePath;
        ((mb)localObject).cHS.fileSize = ((int)h.CB(this.mFilePath));
        com.tencent.mm.sdk.b.a.xxA.a((com.tencent.mm.sdk.b.b)localObject, Looper.getMainLooper());
        ab.i("MicroMsg.Record.AudioRecordMgr", "stop record success");
        this.ilo = null;
        d.aIg();
        AppMethodBeat.o(105625);
        break;
        ab.e("MicroMsg.Record.AudioRecordMgr", "mRecorder is null, has stop record!");
        bool = true;
        break label56;
        label362: long l1 = System.currentTimeMillis();
        long l2 = System.currentTimeMillis() - this.mStartTime;
        ab.i("MicroMsg.Record.AudioRecordMgr", "currentTime:%d, interval:%d, mRealRecordedTime:%d", new Object[] { Long.valueOf(l1), Long.valueOf(l2), Integer.valueOf(this.ilu) });
        this.ilu = ((int)(this.ilu + l2));
        this.ilt = (this.mDuration - this.ilu);
        ab.i("MicroMsg.Record.AudioRecordMgr", "mLimitTime:%d, mRealRecordTime:%d", new Object[] { Long.valueOf(this.ilt), Integer.valueOf(this.ilu) });
      }
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.Record.AudioRecordMgr", localException, "_stop", new Object[0]);
        boolean bool = false;
        continue;
        label496: onError(9);
        ab.e("MicroMsg.Record.AudioRecordMgr", "stop record fail");
      }
    }
  }

  private ak aIq()
  {
    AppMethodBeat.i(105626);
    if (this.ilv == null)
      this.ilv = new ak(Looper.getMainLooper());
    ak localak = this.ilv;
    AppMethodBeat.o(105626);
    return localak;
  }

  private void stopTimer()
  {
    AppMethodBeat.i(105618);
    ab.i("MicroMsg.Record.AudioRecordMgr", "stopTimer");
    if (this.ikY != null)
      this.ikY.stopTimer();
    this.ikY = null;
    AppMethodBeat.o(105618);
  }

  public final boolean DA()
  {
    if (this.ilp == g.a.ilH);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public final boolean DB()
  {
    if (this.ilp == g.a.ilI);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public final boolean EB()
  {
    AppMethodBeat.i(105621);
    ab.i("MicroMsg.Record.AudioRecordMgr", "stopRecord");
    boolean bool;
    if ((this.ilm == null) && (this.ilq == null))
    {
      ab.e("MicroMsg.Record.AudioRecordMgr", "mRecord is null and mAudioEncoder is null, stop fail");
      bool = false;
      AppMethodBeat.o(105621);
    }
    while (true)
    {
      return bool;
      com.tencent.mm.sdk.g.d.post(new g.10(this), "app_brand_stop_record");
      bool = true;
      AppMethodBeat.o(105621);
    }
  }

  final void aIo()
  {
    AppMethodBeat.i(105624);
    ab.i("MicroMsg.Record.AudioRecordMgr", "pause record in runnable");
    try
    {
      if (DA())
      {
        ab.e("MicroMsg.Record.AudioRecordMgr", "is paused, don't pause again");
        AppMethodBeat.o(105624);
      }
      while (true)
      {
        return;
        if (this.ilm == null)
          break label423;
        bool1 = this.ilm.EB();
        this.ilm = null;
        if ((this.ilo != null) && (this.ilo.imo != null))
        {
          boolean bool2 = this.ilo.imo.aIj();
          ab.i("MicroMsg.Record.AudioRecordMgr", "isInterrupted:%b, interrupted:%b", new Object[] { Boolean.valueOf(this.ilx), Boolean.valueOf(bool2) });
          if ((bool2) && (!this.ilx))
            aIr();
        }
        Object localObject = aIq();
        Runnable local2 = new com/tencent/mm/plugin/appbrand/media/record/g$2;
        local2.<init>(this);
        ((ak)localObject).post(local2);
        long l1 = System.currentTimeMillis();
        long l2 = l1 - this.mStartTime;
        ab.i("MicroMsg.Record.AudioRecordMgr", "currentTime:%d, interval:%d, mRealRecordedTime:%d", new Object[] { Long.valueOf(l1), Long.valueOf(l2), Integer.valueOf(this.ilu) });
        this.ilu = ((int)(this.ilu + l2));
        this.ilt = (this.mDuration - this.ilu);
        ab.i("MicroMsg.Record.AudioRecordMgr", "mLimitTime:%d, mRealRecordTime:%d", new Object[] { Long.valueOf(this.ilt), Integer.valueOf(this.ilu) });
        ab.i("MicroMsg.Record.AudioRecordMgr", "stop:%b", new Object[] { Boolean.valueOf(bool1) });
        if (!bool1)
          break;
        ab.i("MicroMsg.Record.AudioRecordMgr", "onPause");
        this.ilp = g.a.ilH;
        this.mIsRecording = false;
        localObject = new mb();
        ((mb)localObject).cHS.action = 3;
        ((mb)localObject).cHS.state = "pause";
        if (this.ilo != null)
          ((mb)localObject).cHS.appId = this.ilo.appId;
        com.tencent.mm.sdk.b.a.xxA.a((com.tencent.mm.sdk.b.b)localObject, Looper.getMainLooper());
        ab.i("MicroMsg.Record.AudioRecordMgr", "pause record success");
        AppMethodBeat.o(105624);
      }
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.Record.AudioRecordMgr", localException, "_pause", new Object[0]);
        boolean bool1 = false;
        continue;
        onError(8);
        ab.e("MicroMsg.Record.AudioRecordMgr", "pause record fail");
        AppMethodBeat.o(105624);
        continue;
        label423: bool1 = false;
      }
    }
  }

  protected final void aIr()
  {
    AppMethodBeat.i(105628);
    this.ilx = true;
    ab.i("MicroMsg.Record.AudioRecordMgr", "onInterruptionBegin");
    mb localmb = new mb();
    localmb.cHS.action = 6;
    localmb.cHS.state = "interruptionBegin";
    if (this.ilo != null)
      localmb.cHS.appId = this.ilo.appId;
    com.tencent.mm.sdk.b.a.xxA.a(localmb, Looper.getMainLooper());
    AppMethodBeat.o(105628);
  }

  protected final void onError(int paramInt)
  {
    AppMethodBeat.i(105627);
    ab.i("MicroMsg.Record.AudioRecordMgr", "onError errType:%d", new Object[] { Integer.valueOf(paramInt) });
    if (this.ilp != g.a.ilJ)
      j.pj(paramInt);
    this.ilp = g.a.ilJ;
    this.mIsRecording = false;
    mb localmb = new mb();
    localmb.cHS.action = 4;
    localmb.cHS.state = "error";
    if (this.ilo != null)
      localmb.cHS.appId = this.ilo.appId;
    localmb.cHS.errCode = paramInt;
    localmb.cHS.aIm = i.ph(paramInt);
    com.tencent.mm.sdk.b.a.xxA.a(localmb, Looper.getMainLooper());
    AppMethodBeat.o(105627);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.media.record.g
 * JD-Core Version:    0.6.2
 */