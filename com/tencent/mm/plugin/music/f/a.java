package com.tencent.mm.plugin.music.f;

import android.os.Looper;
import android.support.v4.content.b;
import com.tencent.mm.g.a.ke;
import com.tencent.mm.g.a.ke.a;
import com.tencent.mm.plugin.music.f.a.d.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.ax;

public abstract class a
  implements com.tencent.mm.plugin.music.f.a.d
{
  public boolean cFK;
  private ax oJY;
  protected boolean oJZ;
  protected d.a oKa;
  protected String oNs = "";
  protected com.tencent.mm.plugin.music.e.d oNt;
  protected com.tencent.mm.plugin.music.e.a oNu;

  public final void A(com.tencent.mm.aw.e parame)
  {
    ab.i("MicroMsg.Music.BaseMusicPlayer", "onStartEvent %b", new Object[] { Boolean.valueOf(aie()) });
    this.oNs = "play";
    ke localke = new ke();
    localke.cFH.action = 0;
    localke.cFH.cFB = parame;
    localke.cFH.state = "play";
    localke.cFH.duration = getDuration();
    localke.cFH.cFJ = bSO();
    com.tencent.mm.sdk.b.a.xxA.a(localke, Looper.getMainLooper());
    if (this.oNu != null)
      this.oNu.k(parame);
  }

  public final void B(com.tencent.mm.aw.e parame)
  {
    ab.i("MicroMsg.Music.BaseMusicPlayer", "onResumeEvent");
    this.oNs = "play";
    ke localke = new ke();
    localke.cFH.action = 1;
    localke.cFH.cFB = parame;
    localke.cFH.state = "play";
    localke.cFH.duration = getDuration();
    localke.cFH.cFJ = bSO();
    com.tencent.mm.sdk.b.a.xxA.a(localke, Looper.getMainLooper());
    if (this.oNu != null)
      this.oNu.l(parame);
  }

  public final void C(com.tencent.mm.aw.e parame)
  {
    ab.i("MicroMsg.Music.BaseMusicPlayer", "onPauseEvent");
    this.oNs = "pause";
    ke localke = new ke();
    localke.cFH.action = 3;
    localke.cFH.cFB = parame;
    localke.cFH.state = "pause";
    localke.cFH.duration = getDuration();
    localke.cFH.cFJ = bSO();
    com.tencent.mm.sdk.b.a.xxA.a(localke, Looper.getMainLooper());
    if (this.oNu != null)
      this.oNu.m(parame);
  }

  public final void D(com.tencent.mm.aw.e parame)
  {
    ab.i("MicroMsg.Music.BaseMusicPlayer", "onStopEvent");
    this.oNs = "stop";
    ke localke = new ke();
    localke.cFH.action = 2;
    localke.cFH.cFB = parame;
    localke.cFH.state = "stop";
    localke.cFH.duration = getDuration();
    localke.cFH.cFJ = bSO();
    ke.a locala = localke.cFH;
    boolean bool = this.cFK;
    this.cFK = false;
    locala.cFK = bool;
    com.tencent.mm.sdk.b.a.xxA.a(localke, Looper.getMainLooper());
    if (this.oNu != null)
      this.oNu.n(parame);
  }

  public final void E(com.tencent.mm.aw.e parame)
  {
    ab.i("MicroMsg.Music.BaseMusicPlayer", "onSeekToEvent");
    this.oNs = "seeked";
    ke localke = new ke();
    localke.cFH.action = 8;
    localke.cFH.cFB = parame;
    localke.cFH.state = "seeked";
    localke.cFH.duration = getDuration();
    localke.cFH.cFJ = bSO();
    com.tencent.mm.sdk.b.a.xxA.a(localke, Looper.getMainLooper());
  }

  public final void F(com.tencent.mm.aw.e parame)
  {
    ab.i("MicroMsg.Music.BaseMusicPlayer", "onSeekingEvent");
    this.oNs = "seeking";
    ke localke = new ke();
    localke.cFH.action = 12;
    localke.cFH.cFB = parame;
    localke.cFH.state = "seeking";
    localke.cFH.duration = getDuration();
    localke.cFH.cFJ = bSO();
    com.tencent.mm.sdk.b.a.xxA.a(localke, Looper.getMainLooper());
  }

  public final void G(com.tencent.mm.aw.e parame)
  {
    ab.i("MicroMsg.Music.BaseMusicPlayer", "onStopEvent");
    this.oNs = "ended";
    ke localke = new ke();
    localke.cFH.action = 7;
    localke.cFH.cFB = parame;
    localke.cFH.state = "ended";
    localke.cFH.duration = getDuration();
    localke.cFH.cFJ = bSO();
    com.tencent.mm.sdk.b.a.xxA.a(localke, Looper.getMainLooper());
    if (this.oNu != null)
      this.oNu.o(parame);
  }

  public final void H(com.tencent.mm.aw.e parame)
  {
    ab.i("MicroMsg.Music.BaseMusicPlayer", "onErrorEvent");
    d(parame, -1);
  }

  public void a(com.tencent.mm.aw.e parame, int paramInt1, int paramInt2)
  {
    ab.i("MicroMsg.Music.BaseMusicPlayer", "onErrorEvent");
    d(parame, -1);
  }

  public final void a(d.a parama)
  {
    this.oKa = parama;
  }

  protected final void bSM()
  {
    if (this.oJY != null)
    {
      this.oJY.end();
      this.oJY.dpf();
      this.oJY = null;
    }
  }

  protected abstract void bTI();

  protected final void bUx()
  {
    if (this.oJY != null);
    while (true)
    {
      return;
      if (b.checkSelfPermission(ah.getContext(), "android.permission.READ_PHONE_STATE") != 0)
      {
        ab.e("MicroMsg.Music.BaseMusicPlayer", "addPhoneStatusWatcher() not have read_phone_state perm");
      }
      else
      {
        this.oJY = new ax();
        this.oJY.gK(ah.getContext());
        this.oJY.a(new a.1(this));
      }
    }
  }

  protected final String bUy()
  {
    return this.oNs;
  }

  public final void d(com.tencent.mm.aw.e parame, int paramInt)
  {
    ab.i("MicroMsg.Music.BaseMusicPlayer", "onErrorEvent with errCode:%d", new Object[] { Integer.valueOf(paramInt) });
    this.oNs = "error";
    ke localke = new ke();
    localke.cFH.action = 4;
    localke.cFH.cFB = parame;
    localke.cFH.state = "error";
    localke.cFH.duration = getDuration();
    localke.cFH.cFJ = bSO();
    localke.cFH.errCode = com.tencent.mm.plugin.music.f.a.e.zS(paramInt);
    localke.cFH.aIm = com.tencent.mm.plugin.music.f.a.e.ph(paramInt);
    com.tencent.mm.sdk.b.a.xxA.a(localke, Looper.getMainLooper());
    if (this.oNu != null)
      this.oNu.a(parame, paramInt);
  }

  public void f(com.tencent.mm.aw.e parame)
  {
    bTI();
  }

  public final void y(com.tencent.mm.aw.e parame)
  {
    ab.i("MicroMsg.Music.BaseMusicPlayer", "onPreparingEvent %b", new Object[] { Boolean.valueOf(aie()) });
    this.oNs = "waiting";
    ke localke = new ke();
    localke.cFH.action = 11;
    localke.cFH.cFB = parame;
    localke.cFH.state = "waiting";
    localke.cFH.duration = getDuration();
    localke.cFH.cFJ = bSO();
    com.tencent.mm.sdk.b.a.xxA.a(localke, Looper.getMainLooper());
  }

  public final void z(com.tencent.mm.aw.e parame)
  {
    ab.i("MicroMsg.Music.BaseMusicPlayer", "onPrepareEvent %b", new Object[] { Boolean.valueOf(aie()) });
    this.oNs = "canplay";
    ke localke = new ke();
    localke.cFH.action = 9;
    localke.cFH.cFB = parame;
    localke.cFH.state = "canplay";
    localke.cFH.duration = getDuration();
    localke.cFH.cFJ = bSO();
    com.tencent.mm.sdk.b.a.xxA.a(localke, Looper.getMainLooper());
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.music.f.a
 * JD-Core Version:    0.6.2
 */