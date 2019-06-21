package com.tencent.mm.plugin.music.b;

import android.os.Looper;
import com.tencent.mm.g.a.u;
import com.tencent.mm.plugin.music.f.a.d;
import com.tencent.mm.plugin.music.f.a.d.a;
import com.tencent.mm.plugin.music.f.a.e;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ax;

public abstract class g
  implements d
{
  protected c oJR = null;
  ax oJY;
  protected boolean oJZ;
  protected d.a oKa;

  public final void a(c paramc)
  {
    this.oJR = paramc;
  }

  public final void a(d.a parama)
  {
    this.oKa = parama;
  }

  public final boolean aif()
  {
    return false;
  }

  protected final void bSM()
  {
    try
    {
      if (this.oJY != null)
      {
        this.oJY.end();
        this.oJY.dpf();
        this.oJY = null;
      }
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public final void bSN()
  {
  }

  public boolean bSO()
  {
    return false;
  }

  public final com.tencent.mm.aw.c bSP()
  {
    return null;
  }

  public abstract String bSQ();

  public final void bSR()
  {
    ab.i("MicroMsg.Audio.BaseAudioPlayer", "onPrepareEvent");
    u localu = new u();
    localu.csP.action = 7;
    localu.csP.state = "canplay";
    localu.csP.duration = getDuration();
    localu.csP.ckD = bSQ();
    localu.csP.appId = getAppId();
    a.xxA.a(localu, Looper.getMainLooper());
  }

  public final void bSS()
  {
    ab.i("MicroMsg.Audio.BaseAudioPlayer", "onStartEvent %b", new Object[] { Boolean.valueOf(aie()) });
    u localu = new u();
    localu.csP.action = 0;
    localu.csP.state = "play";
    localu.csP.ckD = bSQ();
    localu.csP.appId = getAppId();
    a.xxA.a(localu, Looper.getMainLooper());
    if (this.oJR != null)
      this.oJR.onStart(bSQ());
  }

  public final void bST()
  {
    ab.i("MicroMsg.Audio.BaseAudioPlayer", "onResumeEvent");
    u localu = new u();
    localu.csP.action = 1;
    localu.csP.state = "play";
    localu.csP.ckD = bSQ();
    localu.csP.appId = getAppId();
    a.xxA.a(localu, Looper.getMainLooper());
    if (this.oJR != null)
      this.oJR.onStart(bSQ());
  }

  public final void bSU()
  {
    ab.i("MicroMsg.Audio.BaseAudioPlayer", "onPauseEvent");
    u localu = new u();
    localu.csP.action = 2;
    localu.csP.state = "pause";
    localu.csP.ckD = bSQ();
    localu.csP.appId = getAppId();
    a.xxA.a(localu, Looper.getMainLooper());
    if (this.oJR != null)
      this.oJR.Ss(bSQ());
  }

  public final void bSV()
  {
    ab.i("MicroMsg.Audio.BaseAudioPlayer", "onStopEvent");
    u localu = new u();
    localu.csP.action = 3;
    localu.csP.state = "stop";
    localu.csP.ckD = bSQ();
    localu.csP.appId = getAppId();
    a.xxA.a(localu, Looper.getMainLooper());
    if (this.oJR != null)
      this.oJR.Lu(bSQ());
  }

  public final void bSW()
  {
    ab.i("MicroMsg.Audio.BaseAudioPlayer", "onSeekToEvent");
    u localu = new u();
    localu.csP.action = 6;
    localu.csP.state = "seeked";
    localu.csP.ckD = bSQ();
    localu.csP.appId = getAppId();
    a.xxA.a(localu, Looper.getMainLooper());
  }

  public final void bSX()
  {
    ab.i("MicroMsg.Audio.BaseAudioPlayer", "onStopEvent");
    u localu = new u();
    localu.csP.action = 5;
    localu.csP.state = "ended";
    localu.csP.ckD = bSQ();
    localu.csP.appId = getAppId();
    a.xxA.a(localu, Looper.getMainLooper());
    if (this.oJR != null)
      this.oJR.dO(bSQ());
  }

  public final void bSY()
  {
    ab.i("MicroMsg.Audio.BaseAudioPlayer", "onErrorEvent");
    zl(-1);
  }

  public abstract String getAppId();

  public final void zl(int paramInt)
  {
    ab.i("MicroMsg.Audio.BaseAudioPlayer", "onErrorEvent with errCode:%d", new Object[] { Integer.valueOf(paramInt) });
    u localu = new u();
    localu.csP.action = 4;
    localu.csP.state = "error";
    localu.csP.errCode = e.zS(paramInt);
    localu.csP.aIm = e.ph(paramInt);
    localu.csP.ckD = bSQ();
    localu.csP.appId = getAppId();
    a.xxA.a(localu, Looper.getMainLooper());
    if (this.oJR != null)
      this.oJR.onError(bSQ());
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.music.b.g
 * JD-Core Version:    0.6.2
 */