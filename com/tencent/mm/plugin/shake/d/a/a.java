package com.tencent.mm.plugin.shake.d.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.p;
import com.tencent.mm.audio.b.c;
import com.tencent.mm.audio.b.c.a;
import com.tencent.mm.model.aw;
import com.tencent.mm.protocal.protobuf.btd;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.qafpapi.QAFPNative;

public final class a
  implements f
{
  c coZ;
  private c.a cqd;
  Object kbe;
  long qtA;
  int qtB;
  private boolean qtC;
  byte[] qtn;
  int qto;
  int qtp;
  long qtq;
  int qtr;
  boolean qts;
  e qtt;
  private a.a qtu;
  boolean qtv;
  boolean qtw;
  int qtx;
  int qty;
  private boolean qtz;

  public a()
  {
    AppMethodBeat.i(24593);
    this.qtn = new byte[10240];
    this.qto = 0;
    this.qtp = 0;
    this.qtq = 0L;
    this.qtr = 0;
    this.qts = false;
    this.qtt = null;
    this.kbe = new Object();
    this.qtu = null;
    this.qtv = false;
    this.qtw = false;
    this.qtx = 0;
    this.qtz = false;
    this.qtC = false;
    this.cqd = new a.1(this);
    AppMethodBeat.o(24593);
  }

  private void a(btd parambtd, long paramLong, boolean paramBoolean)
  {
    try
    {
      AppMethodBeat.i(24600);
      if (!this.qtC)
      {
        this.qtu.b(parambtd, paramLong, paramBoolean);
        this.qtC = true;
        AppMethodBeat.o(24600);
      }
      while (true)
      {
        return;
        ab.w("MicroMsg.MusicFingerPrintRecorder", "hy: already call backed to UI");
        AppMethodBeat.o(24600);
      }
    }
    finally
    {
    }
    throw parambtd;
  }

  private void ks(boolean paramBoolean)
  {
    AppMethodBeat.i(24599);
    ab.d("MicroMsg.MusicFingerPrintRecorder", "tryCallBack, directFail = %s", new Object[] { Boolean.FALSE });
    al.d(new a.2(this, paramBoolean));
    AppMethodBeat.o(24599);
  }

  public final boolean EB()
  {
    AppMethodBeat.i(24596);
    ab.d("MicroMsg.MusicFingerPrintRecorder", "stopRecord now clientid:%d", new Object[] { Integer.valueOf(this.qtx) });
    aw.Rg().b(367, this);
    aw.Rg().b(408, this);
    synchronized (this.qtn)
    {
      this.qto = 0;
      if (this.coZ != null)
      {
        this.coZ.EB();
        this.coZ = null;
      }
      AppMethodBeat.o(24596);
      return true;
    }
  }

  public final boolean a(int paramInt, a.a arg2)
  {
    boolean bool = false;
    AppMethodBeat.i(24597);
    EB();
    while (true)
    {
      synchronized (this.kbe)
      {
        this.qty = QAFPNative.QAFPGetVersion();
        ckt();
        this.qtr = paramInt;
        this.qtu = ???;
        this.qtw = false;
        this.qtv = false;
        this.qts = false;
        this.qtC = false;
        aw.Rg().a(367, this);
        aw.Rg().a(408, this);
        this.qtx = ((int)bo.anU());
        ab.d("MicroMsg.MusicFingerPrintRecorder", "startRecord now clientid:%d", new Object[] { Integer.valueOf(this.qtx) });
        this.coZ = new c(8000, 1, 4);
        this.coZ.cpB = -19;
        this.coZ.cpM = this.cqd;
        if (!this.coZ.EL())
        {
          ab.e("MicroMsg.MusicFingerPrintRecorder", "start record failed");
          reset();
          AppMethodBeat.o(24597);
          return bool;
        }
      }
      synchronized (this.kbe)
      {
        paramInt = QAFPNative.QAFPReset();
        ab.d("MicroMsg.MusicFingerPrintRecorder", "QAFPReset ret:%d", new Object[] { Integer.valueOf(paramInt) });
        if (paramInt < 0)
        {
          ab.e("MicroMsg.MusicFingerPrintRecorder", "init failed QAFPReset:%d clientid:%d", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(this.qtx) });
          reset();
          AppMethodBeat.o(24597);
          continue;
        }
        this.qtq = bo.anU();
        this.qtA = bo.anU();
        this.qtB = 0;
        AppMethodBeat.o(24597);
        bool = true;
      }
    }
  }

  final void agK()
  {
    AppMethodBeat.i(24601);
    aw.RS().aa(new a.3(this));
    AppMethodBeat.o(24601);
  }

  public final boolean ckt()
  {
    boolean bool1 = false;
    boolean bool2 = false;
    AppMethodBeat.i(24594);
    synchronized (this.kbe)
    {
      if (this.qtz)
      {
        ab.d("MicroMsg.MusicFingerPrintRecorder", "QAFPInit already inited");
        AppMethodBeat.o(24594);
        return bool2;
      }
      int i = QAFPNative.QAFPInit();
      ab.d("MicroMsg.MusicFingerPrintRecorder", "QAFPInit ret:%d", new Object[] { Integer.valueOf(i) });
      if (i >= 0)
        this.qtz = true;
      bool2 = bool1;
      if (i >= 0)
        bool2 = true;
      AppMethodBeat.o(24594);
    }
  }

  public final boolean cku()
  {
    boolean bool1 = false;
    boolean bool2 = false;
    AppMethodBeat.i(24595);
    synchronized (this.kbe)
    {
      if (!this.qtz)
      {
        ab.d("MicroMsg.MusicFingerPrintRecorder", "QAFPRelease never inited");
        AppMethodBeat.o(24595);
        return bool2;
      }
      int i = QAFPNative.QAFPRelease();
      ab.d("MicroMsg.MusicFingerPrintRecorder", "QAFPRelease ret:%d", new Object[] { Integer.valueOf(i) });
      bool2 = bool1;
      if (i >= 0)
        bool2 = true;
      AppMethodBeat.o(24595);
    }
  }

  public final void onSceneEnd(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(24602);
    if ((paramm.getType() != 367) && (paramm.getType() != 408))
      AppMethodBeat.o(24602);
    while (true)
    {
      return;
      ab.d("MicroMsg.MusicFingerPrintRecorder", "onSceneEnd errType = %s, errCode = %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
      this.qtv = false;
      if (((e)paramm).ckv())
      {
        ab.d("MicroMsg.MusicFingerPrintRecorder", "NetSceneShakeMedia isRecogSuccess stop now ! clientid:%d", new Object[] { Integer.valueOf(this.qtx) });
        EB();
        this.qtt = ((e)paramm);
        this.qts = true;
        ks(false);
        AppMethodBeat.o(24602);
      }
      else
      {
        if ((this.qto == 0) && (this.qtw))
        {
          ab.d("MicroMsg.MusicFingerPrintRecorder", "recog failed . clientid:%d", new Object[] { Integer.valueOf(this.qtx) });
          this.qtt = null;
          this.qts = true;
          if ((paramInt1 == 0) && (paramInt2 == 0))
            ks(false);
          while (true)
          {
            aw.Rg().b(367, this);
            aw.Rg().b(408, this);
            AppMethodBeat.o(24602);
            break;
            ks(true);
          }
        }
        ab.d("MicroMsg.MusicFingerPrintRecorder", "NetScene try again clientId:%d", new Object[] { Integer.valueOf(this.qtx) });
        agK();
        AppMethodBeat.o(24602);
      }
    }
  }

  final void reset()
  {
    AppMethodBeat.i(24598);
    ab.d("MicroMsg.MusicFingerPrintRecorder", "reset recorder clientid:%d", new Object[] { Integer.valueOf(this.qtx) });
    if (this.coZ != null)
    {
      this.coZ.EB();
      this.coZ = null;
    }
    ks(false);
    AppMethodBeat.o(24598);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.shake.d.a.a
 * JD-Core Version:    0.6.2
 */