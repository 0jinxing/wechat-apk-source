package com.tencent.mm.plugin.n;

import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.ak.a;
import com.tencent.mm.sdk.platformtools.bo;

public final class j
{
  long aOw;
  public long bfi;
  boolean eif;
  public g orH;
  ak orI;
  ak osb;
  ak osc;
  ak osd;
  long ose;
  boolean osf;
  public k osg;
  boolean osh;
  a osi;
  private ak.a osj;
  private ak.a osk;
  private ak.a osl;
  int state;

  public j(ak paramak, Looper paramLooper1, Looper paramLooper2, Looper paramLooper3)
  {
    AppMethodBeat.i(117895);
    this.osf = false;
    this.osh = false;
    this.osj = new j.1(this);
    this.osk = new j.2(this);
    this.osl = new j.3(this);
    this.orI = paramak;
    this.eif = false;
    this.orH = new g(this.eif);
    this.osd = new ak(paramLooper1, this.osj);
    this.osg = new k(this.orH, this.orI);
    this.osb = new ak(paramLooper2, this.osk);
    if (paramLooper3 != null)
    {
      this.osi = new a(this.orH, this.orI);
      this.osc = new ak(paramLooper3, this.osl);
    }
    AppMethodBeat.o(117895);
  }

  private void a(ak paramak, long paramLong1, long paramLong2)
  {
    AppMethodBeat.i(117905);
    if (d.yD(this.state))
      AppMethodBeat.o(117905);
    while (true)
    {
      return;
      try
      {
        Thread localThread = paramak.getLooper().getThread();
        if (localThread != null)
        {
          boolean bool = localThread.isAlive();
          if (!bool)
            AppMethodBeat.o(117905);
        }
      }
      catch (Exception localException)
      {
        paramak.removeMessages(2);
        paramLong1 = paramLong1 + paramLong2 - SystemClock.elapsedRealtime();
        if (paramLong1 <= 0L)
        {
          paramak.sendEmptyMessage(2);
          AppMethodBeat.o(117905);
        }
        else
        {
          paramak.sendEmptyMessageDelayed(2, paramLong1);
          AppMethodBeat.o(117905);
        }
      }
    }
  }

  public final void bPc()
  {
    AppMethodBeat.i(117896);
    ab.i("MicroMsg.VideoPlayerImpl", "%s reset extractor time[%d]", new Object[] { this.orH.aZm(), Long.valueOf(this.orH.orz) });
    if (this.osg != null)
    {
      this.osg.N(this.orH.orz, -1L);
      this.osg.bOY();
      this.osg.orL = 0L;
    }
    AppMethodBeat.o(117896);
  }

  public final void bPd()
  {
    AppMethodBeat.i(117897);
    if (this.osg != null)
    {
      ab.i("MicroMsg.VideoPlayerImpl", "%s player flush surface", new Object[] { this.orH.aZm() });
      this.osg.setState(10);
      a(this.osb, SystemClock.elapsedRealtime(), 0L);
    }
    AppMethodBeat.o(117897);
  }

  public final void pause()
  {
    AppMethodBeat.i(117899);
    setState(4);
    this.osb.obtainMessage(4).sendToTarget();
    if (this.osi != null)
      this.osc.obtainMessage(4).sendToTarget();
    AppMethodBeat.o(117899);
  }

  public final void release()
  {
    AppMethodBeat.i(117902);
    setState(9);
    this.osd.removeMessages(2);
    this.osd.removeMessages(9);
    this.osb.removeMessages(1);
    this.osb.removeMessages(2);
    this.osb.removeMessages(3);
    this.osb.removeMessages(4);
    this.osb.removeMessages(6);
    this.osb.removeCallbacksAndMessages(null);
    try
    {
      this.osg.setState(9);
      Object localObject = this.osg;
      ab.i("MicroMsg.VideoTrackDataSource", "%s isConfigureSurface [%b]", new Object[] { ((k)localObject).aZm(), Boolean.valueOf(((k)localObject).osn) });
      if ((((k)localObject).osn) && (com.tencent.mm.compatible.util.d.iX(19)))
        this.osg.sI();
      this.osb.obtainMessage(7).sendToTarget();
      if (this.osc != null)
      {
        this.osc.removeMessages(1);
        this.osc.removeMessages(2);
        this.osc.removeMessages(3);
        this.osc.removeMessages(4);
        this.osc.removeMessages(6);
        this.osc.obtainMessage(7).sendToTarget();
      }
      localObject = this.orH;
      ((g)localObject).cTh = 0L;
      ((g)localObject).orx = 0L;
      ((g)localObject).ory = -1L;
      ((g)localObject).aOw = 0L;
      ((g)localObject).orz = 0L;
      ((g)localObject).orA = 0L;
      AppMethodBeat.o(117902);
      return;
    }
    catch (Exception localException)
    {
      while (true)
        ab.printErrStackTrace("MicroMsg.VideoPlayerImpl", localException, "%s release error %s", new Object[] { this.orH.aZm(), localException.toString() });
    }
  }

  protected final void setState(int paramInt)
  {
    AppMethodBeat.i(117903);
    ab.i("MicroMsg.VideoPlayerImpl", "%s set state old %d new %d stack %s", new Object[] { this.orH.aZm(), Integer.valueOf(this.state), Integer.valueOf(paramInt), bo.dpG() });
    this.state = paramInt;
    this.orH.orB = 0L;
    AppMethodBeat.o(117903);
  }

  public final void start()
  {
    AppMethodBeat.i(117898);
    setState(3);
    this.osb.obtainMessage(3).sendToTarget();
    if (this.osi != null)
      this.osc.obtainMessage(3).sendToTarget();
    AppMethodBeat.o(117898);
  }

  public final void stop()
  {
    AppMethodBeat.i(117901);
    setState(8);
    AppMethodBeat.o(117901);
  }

  public final void yI(int paramInt)
  {
    AppMethodBeat.i(117900);
    ab.i("MicroMsg.VideoPlayerImpl", "%s seek to [%d] is precision[%b]", new Object[] { this.orH.aZm(), Integer.valueOf(paramInt), Boolean.TRUE });
    this.osg.pause();
    this.osb.removeMessages(4);
    if (this.osi != null)
    {
      this.osi.pause();
      this.osc.removeMessages(4);
    }
    if (paramInt >= this.bfi)
    {
      ab.i("MicroMsg.VideoPlayerImpl", "seekTo %d, duration %d ", new Object[] { Integer.valueOf(paramInt), Long.valueOf(this.bfi) });
      setState(6);
      this.osd.obtainMessage(9).sendToTarget();
      AppMethodBeat.o(117900);
      return;
    }
    long l = this.osg.yH(paramInt);
    boolean bool;
    if ((l >= 0L) && (l < paramInt))
    {
      bool = true;
      label167: ab.i("MicroMsg.VideoPlayerImpl", "%s can seek precision[%b] after seek [%d, %d]", new Object[] { this.orH.aZm(), Boolean.valueOf(bool), Long.valueOf(l), Integer.valueOf(paramInt) });
      this.osg.setState(6);
      setState(6);
      if (!bool)
        break label273;
    }
    label273: for (this.orH.ory = paramInt; ; this.orH.ory = l)
    {
      yJ(6);
      a(this.osb, SystemClock.elapsedRealtime(), 0L);
      AppMethodBeat.o(117900);
      break;
      bool = false;
      break label167;
    }
  }

  final void yJ(int paramInt)
  {
    AppMethodBeat.i(117904);
    ab.i("MicroMsg.VideoPlayerImpl", "%s update positions state %d timeline[%d %d %d]", new Object[] { this.orH.aZm(), Integer.valueOf(paramInt), Long.valueOf(this.orH.cTh), Long.valueOf(this.orH.orx), Long.valueOf(this.orH.aOw) });
    switch (paramInt)
    {
    default:
    case 3:
    case 4:
    case 5:
    case 6:
    case 7:
    }
    while (true)
    {
      this.ose = this.orH.cTh;
      this.aOw = this.orH.aOw;
      ab.i("MicroMsg.VideoPlayerImpl", "%s update positions end state[%d] ms[%d, %d]", new Object[] { this.orH.aZm(), Integer.valueOf(paramInt), Long.valueOf(this.ose), Long.valueOf(this.aOw) });
      AppMethodBeat.o(117904);
      return;
      g localg;
      if (this.orH.orx > 0L)
      {
        localg = this.orH;
        localg.aOw += this.orH.orx - this.orH.cTh;
        this.orH.orx = 0L;
      }
      this.orH.cTh = SystemClock.elapsedRealtime();
      continue;
      if (this.orH.cTh <= 0L)
      {
        this.orH.orx = 0L;
      }
      else
      {
        this.orH.orx = SystemClock.elapsedRealtime();
        continue;
        this.orH.aOw = this.orH.ory;
        this.orH.cTh = SystemClock.elapsedRealtime();
        this.orH.orx = 0L;
        localg = this.orH;
        this.orH.orA = 0L;
        localg.orz = 0L;
        continue;
        this.orH.aOw = this.orH.ory;
        localg = this.orH;
        this.orH.orx = 0L;
        localg.cTh = 0L;
        localg = this.orH;
        this.orH.orA = 0L;
        localg.orz = 0L;
        continue;
        this.orH.aOw = this.orH.ory;
        localg = this.orH;
        this.orH.orx = 0L;
        localg.cTh = 0L;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.n.j
 * JD-Core Version:    0.6.2
 */