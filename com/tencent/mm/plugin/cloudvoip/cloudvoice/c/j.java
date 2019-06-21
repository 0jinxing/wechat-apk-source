package com.tencent.mm.plugin.cloudvoip.cloudvoice.c;

import android.content.Context;
import android.os.Bundle;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.SystemClock;
import android.telephony.PhoneStateListener;
import android.telephony.TelephonyManager;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.compatible.e.q;
import com.tencent.mm.compatible.util.b;
import com.tencent.mm.plugin.voip.HeadsetPlugReceiver;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.wxmm.IConfCallBack;
import java.util.ArrayList;
import java.util.Timer;

public enum j
{
  private String hRT;
  private final al kAa;
  j.d kAb;
  private j.a kAc;
  private String kAd;
  private a<j.a> kAe;
  private a<ArrayList<com.tencent.mm.plugin.cloudvoip.cloudvoice.b.a>> kAf;
  private a<ArrayList<com.tencent.mm.plugin.cloudvoip.cloudvoice.b.a>> kAg;
  private f.a kAh;
  private f.a kAi;
  private f.a kAj;
  private f.a kAk;
  private f.a kAl;
  private f.a kAm;
  private f.a kAn;
  private f.a kAo;
  private boolean kAp;
  private boolean kAq;
  private a<String> kAr;
  public long kAs;
  private PhoneStateListener kAt;
  private boolean kAu;
  private boolean kAv;
  private boolean kAw;
  private final int kAx;
  public Runnable kAy;
  private final l kzX;
  private final f kzY;
  private final c kzZ;
  private final e kzd;
  private boolean mIsInit;

  static
  {
    AppMethodBeat.i(135586);
    kzW = new j("INSTANCE");
    kAz = new j[] { kzW };
    AppMethodBeat.o(135586);
  }

  private j()
  {
    AppMethodBeat.i(135556);
    this.kAs = -1L;
    this.kAt = new j.11(this);
    this.kAu = false;
    this.kAv = false;
    this.kAw = false;
    this.kAx = -9999;
    this.kAy = new j.7(this);
    this.kzX = new l();
    this.kzY = new f();
    this.kzd = new e();
    this.kzZ = new c(this.kzd);
    this.kAa = new al("openvoice_voip_worker");
    this.kAb = j.d.kBm;
    this.hRT = null;
    Object localObject = (Bundle)com.tencent.mm.ipcinvoker.f.a("com.tencent.mm", null, j.b.class);
    if (localObject != null)
    {
      localObject = ((Bundle)localObject).getString("device_info", "");
      ab.v("MicroMsg.OpenVoice.OpenVoiceService", "hy: updatad device info %s", new Object[] { localObject });
      q.ku((String)localObject);
    }
    while (true)
    {
      this.kAp = false;
      this.mIsInit = false;
      this.kAq = false;
      this.kAr = null;
      AppMethodBeat.o(135556);
      return;
      ab.e("MicroMsg.OpenVoice.OpenVoiceService", "hy: can not get device info from mm");
    }
  }

  private int HY(String paramString)
  {
    AppMethodBeat.i(135558);
    IConfCallBack localIConfCallBack = this.kzY.fT(true);
    int i = g.a(this.kAd, this.hRT, paramString, localIConfCallBack);
    this.kAk = new j.13(this);
    this.kzY.a(8, this.kAk);
    AppMethodBeat.o(135558);
    return i;
  }

  static int P(byte[] paramArrayOfByte, int paramInt)
  {
    AppMethodBeat.i(135574);
    paramInt = g.O(paramArrayOfByte, paramInt);
    AppMethodBeat.o(135574);
    return paramInt;
  }

  private void S(Runnable paramRunnable)
  {
    AppMethodBeat.i(135563);
    this.kAa.m(paramRunnable, 180000L);
    AppMethodBeat.o(135563);
  }

  private static int a(j.a parama)
  {
    int i = 0;
    AppMethodBeat.i(135565);
    switch (j.10.hTp[parama.ordinal()])
    {
    default:
      AppMethodBeat.o(135565);
    case 1:
    case 2:
    case 3:
    case 4:
    case 5:
    case 6:
    case 7:
    }
    while (true)
    {
      return i;
      AppMethodBeat.o(135565);
      continue;
      i = 1;
      AppMethodBeat.o(135565);
      continue;
      i = 6;
      AppMethodBeat.o(135565);
      continue;
      i = 8;
      AppMethodBeat.o(135565);
      continue;
      i = 7;
      AppMethodBeat.o(135565);
    }
  }

  private void a(a<ArrayList<com.tencent.mm.plugin.cloudvoip.cloudvoice.b.a>> parama)
  {
    int i = 1;
    AppMethodBeat.i(135559);
    ab.i("MicroMsg.OpenVoice.OpenVoiceService", "hy: try trigger succ: %b %b %b", new Object[] { Boolean.valueOf(this.kAu), Boolean.valueOf(this.kAv), Boolean.valueOf(this.kAw) });
    int j;
    label152: TelephonyManager localTelephonyManager;
    Object localObject;
    if ((this.kAu) && (this.kAw) && (this.kAv))
    {
      if (this.kAq)
      {
        ab.w("MicroMsg.OpenVoice.OpenVoiceService", "hy: require exit. try exit exit again");
        a(parama, -10086, -9, "interrupted because already cancelled or entered background");
        j = b(this.kAc);
        if (this.kAr != null)
        {
          if (j != 0)
            break label152;
          this.kAr.a(0, 0, "ok", "");
        }
        while (true)
        {
          this.kAq = false;
          this.kAr = null;
          AppMethodBeat.o(135559);
          return;
          this.kAr.a(-10086, -17, "exit failed", "");
        }
      }
      localTelephonyManager = (TelephonyManager)ah.getContext().getSystemService("phone");
      localObject = (Bundle)com.tencent.mm.ipcinvoker.f.a("com.tencent.mm", null, j.c.class);
      if (localObject == null)
        break label485;
    }
    label264: label290: label353: label485: for (boolean bool = ((Bundle)localObject).getBoolean("is_in_voip"); ; bool = false)
    {
      if ((bool) || (localTelephonyManager.getCallState() == 2) || (localTelephonyManager.getCallState() == 1));
      for (j = 1; ; j = 0)
      {
        if (j == 0)
          break label264;
        b(parama);
        AppMethodBeat.o(135559);
        break;
      }
      localObject = this.kzZ;
      if (((c)localObject).kzf != 2)
      {
        ab.e("MicroMsg.OpenVoice.OpenVoiceAudioMgr", "hy: error not init when start record!");
        j = 0;
        bool = this.kzZ.EL();
        k = i;
        if (j != 0)
        {
          k = i;
          if (bool)
            k = 0;
        }
        i.kzN = k;
        if (j != 0)
          break label450;
        localObject = this.kzZ.kza;
        if (((d)localObject).kzq == null)
          break label450;
        k = ((d)localObject).kzq.cIs();
        i.kzP = k;
        if (!bool)
          break label456;
      }
      for (int k = 0; ; k = this.kzZ.kzb.cpq)
      {
        i.kzO = k;
        if ((j == 0) || (!bool))
          break label471;
        a(parama, 0, 0, "ok");
        AppMethodBeat.o(135559);
        break;
        if (((c)localObject).kza.a(new c.2((c)localObject), ((c)localObject).mSampleRate, ((c)localObject).mChannels, ((c)localObject).kzn) <= 0)
        {
          ((c)localObject).kzj = 1;
          j = 0;
          break label290;
        }
        j = 1;
        break label290;
        k = 0;
        break label353;
      }
      b(parama);
      AppMethodBeat.o(135559);
      break;
    }
  }

  private void a(a<ArrayList<com.tencent.mm.plugin.cloudvoip.cloudvoice.b.a>> parama, int paramInt1, int paramInt2, String paramString)
  {
    AppMethodBeat.i(135557);
    this.kAp = false;
    if ((paramInt1 == 0) && (paramInt2 == 0))
      this.kAb = j.d.kBo;
    synchronized (this.kzY)
    {
      this.kzY.b(1, this.kAl);
      this.kzY.b(2, this.kAm);
      this.kzY.b(4, this.kAn);
      this.kzY.b(5, this.kAo);
      this.kAl = null;
      this.kAm = null;
      this.kAn = null;
      this.kAo = null;
      ??? = this.kzd.kzy;
      if (parama != null)
        parama.a(paramInt1, paramInt2, paramString, ???);
      AppMethodBeat.o(135557);
      return;
    }
  }

  static boolean a(com.tencent.mm.plugin.cloudvoip.cloudvoice.b.a parama)
  {
    boolean bool = true;
    AppMethodBeat.i(135571);
    if (g.tA(parama.kyZ) == 1)
      AppMethodBeat.o(135571);
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(135571);
    }
  }

  private int b(j.a parama)
  {
    int i = 0;
    AppMethodBeat.i(135566);
    ab.i("MicroMsg.OpenVoice.OpenVoiceService", "hy: trigger exit with reason: %s", new Object[] { parama });
    this.kAc = parama;
    if (this.kAp)
    {
      ab.w("MicroMsg.OpenVoice.OpenVoiceService", "hy: current joining room. waiting for exiting after joining");
      this.kAq = true;
      i = -9999;
      AppMethodBeat.o(135566);
    }
    while (true)
    {
      return i;
      if (this.kAb == j.d.kBm)
      {
        ab.w("MicroMsg.OpenVoice.OpenVoiceService", "hy: not in room! maybe is joining room");
        AppMethodBeat.o(135566);
      }
      else
      {
        i = g.tB(a(parama));
        bgu();
        AppMethodBeat.o(135566);
      }
    }
  }

  private void b(a<ArrayList<com.tencent.mm.plugin.cloudvoip.cloudvoice.b.a>> parama)
  {
    AppMethodBeat.i(135560);
    a(parama, -10086, -7, "start audio device failed");
    b(j.a.kBg);
    AppMethodBeat.o(135560);
  }

  private void bgs()
  {
    this.kAu = false;
    this.kAv = false;
    this.kAw = false;
  }

  private void bgt()
  {
    AppMethodBeat.i(135561);
    this.kzd.kzy.clear();
    Object localObject1 = this.kzd;
    synchronized (((e)localObject1).kzA)
    {
      ((e)localObject1).kzA.clear();
      if (((e)localObject1).kzB != null)
        ((e)localObject1).kzB.cancel();
      c localc = this.kzZ;
      d locald;
      if (localc.kza != null)
        locald = localc.kza;
      synchronized (locald.kzr)
      {
        ab.i("MicroMsg.OpenVoice.OpenVoiceAudioPlayer", "stopPlay, isStart: %s %s", new Object[] { Boolean.valueOf(locald.cFy), Integer.valueOf(locald.hashCode()) });
        if (locald.cFy)
        {
          com.tencent.mm.plugin.voip.model.c localc1 = locald.kzq;
          if (localc1 != null)
          {
            locald.kzw.evE = SystemClock.elapsedRealtime();
            localc1.cIr();
            localObject1 = new java/lang/StringBuilder;
            ((StringBuilder)localObject1).<init>("stopPlaying cost: ");
            ab.i("MicroMsg.OpenVoice.OpenVoiceAudioPlayer", locald.kzw.Mr());
            localc1.cIo();
            locald.cFy = false;
            locald.kzq = null;
          }
        }
        localc.kzm = false;
        if (localc.kzb != null)
        {
          localc.kzb.EB();
          localc.kzb = null;
          ab.i("MicroMsg.OpenVoice.OpenVoiceAudioMgr", "finish pauseRecord");
        }
        localc.kzf = c.kze;
        ??? = localc.kza;
        com.tencent.mm.compatible.b.g.KK().La();
        com.tencent.mm.compatible.b.g.KK().setMode(0);
        ((d)???).kzs.fa(ah.getContext());
        com.tencent.mm.compatible.b.g.KK().KN();
        com.tencent.mm.compatible.b.g.KK().b((com.tencent.mm.compatible.b.g.a)???);
        ((d)???).gar.Mm();
        this.kAe = null;
        this.kAf = null;
        this.kAg = null;
      }
    }
    synchronized (this.kzY)
    {
      this.kzY.b(6, this.kAh);
      this.kzY.b(7, this.kAi);
      this.kzY.b(3, this.kAj);
      this.kzY.b(8, this.kAk);
      this.kAh = null;
      this.kAi = null;
      this.kAj = null;
      this.kAk = null;
      AppMethodBeat.o(135561);
      return;
      localObject2 = finally;
      AppMethodBeat.o(135561);
      throw localObject2;
      localObject3 = finally;
      AppMethodBeat.o(135561);
      throw localObject3;
    }
  }

  private void bgu()
  {
    AppMethodBeat.i(135567);
    S(this.kAy);
    AppMethodBeat.o(135567);
  }

  static int f(int paramInt1, byte[] paramArrayOfByte, int paramInt2)
  {
    AppMethodBeat.i(135573);
    paramInt1 = g.e(paramInt1, paramArrayOfByte, paramInt2);
    AppMethodBeat.o(135573);
    return paramInt1;
  }

  private int fU(boolean paramBoolean)
  {
    AppMethodBeat.i(135568);
    ab.i("MicroMsg.OpenVoice.OpenVoiceService", "hy: reset sync, sdkReset %b", new Object[] { Boolean.valueOf(paramBoolean) });
    this.kzX.reset(this.hRT);
    i.kzN = 0;
    i.kzO = 0;
    i.kzP = 0;
    i.kzQ = 0;
    i.kzR = 0;
    i.kzS = 0;
    i.kzT = 0;
    i.kzU = 0;
    i.kzV = 0;
    this.hRT = null;
    this.kAd = null;
    bgt();
    this.mIsInit = false;
    Object localObject = h.kzJ;
    h.bgr();
    int i;
    if (paramBoolean)
    {
      i = g.bgq();
      AppMethodBeat.o(135568);
    }
    while (true)
    {
      return i;
      this.kzY.fT(false);
      localObject = (TelephonyManager)ah.getContext().getSystemService("phone");
      if (localObject != null)
        ((TelephonyManager)localObject).listen(this.kAt, 0);
      AppMethodBeat.o(135568);
      i = 0;
    }
  }

  static void t(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(135572);
    g.s(paramArrayOfByte, paramInt1, paramInt2);
    AppMethodBeat.o(135572);
  }

  static void tF(int paramInt)
  {
    AppMethodBeat.i(135575);
    g.tC(paramInt);
    AppMethodBeat.o(135575);
  }

  public final void R(Runnable paramRunnable)
  {
    AppMethodBeat.i(135562);
    if (Thread.currentThread() == this.kAa.oAl.getLooper().getThread())
    {
      paramRunnable.run();
      AppMethodBeat.o(135562);
    }
    while (true)
    {
      return;
      this.kAa.aa(paramRunnable);
      AppMethodBeat.o(135562);
    }
  }

  public final void a(a<String> parama, j.a parama1)
  {
    AppMethodBeat.i(135564);
    ab.i("MicroMsg.OpenVoice.OpenVoiceService", "hy: user triggered exit conference");
    R(new j.6(this, parama1, parama));
    AppMethodBeat.o(135564);
  }

  public final void a(boolean paramBoolean, a<String> parama)
  {
    AppMethodBeat.i(135569);
    ab.i("MicroMsg.OpenVoice.OpenVoiceService", "hy: set mute play: %b", new Object[] { Boolean.valueOf(paramBoolean) });
    R(new j.8(this, parama, paramBoolean));
    AppMethodBeat.o(135569);
  }

  public final void b(boolean paramBoolean, a<String> parama)
  {
    AppMethodBeat.i(135570);
    ab.i("MicroMsg.OpenVoice.OpenVoiceService", "hy: set mute record: %b", new Object[] { Boolean.valueOf(paramBoolean) });
    R(new j.9(this, parama, paramBoolean));
    AppMethodBeat.o(135570);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.cloudvoip.cloudvoice.c.j
 * JD-Core Version:    0.6.2
 */