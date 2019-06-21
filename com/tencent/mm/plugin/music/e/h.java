package com.tencent.mm.plugin.music.e;

import android.os.Looper;
import com.tencent.mm.g.a.ke;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;

public abstract class h
  implements c
{
  private com.tencent.mm.plugin.music.f.d oLS = new com.tencent.mm.plugin.music.f.d();
  private com.tencent.mm.plugin.music.f.e oLT = new com.tencent.mm.plugin.music.f.e();
  private com.tencent.mm.plugin.music.d.a oLU = new com.tencent.mm.plugin.music.d.a();
  private Runnable oLV = new h.1(this);

  private void bUd()
  {
    if (this.oLS.aie())
      this.oLS.stopPlay();
    if (this.oLT.aie())
      this.oLT.stopPlay();
    if (this.oLU.aie())
      this.oLU.stopPlay();
  }

  public static void bUe()
  {
    ab.i("MicroMsg.Music.MusicBasePlayEngine", "sendPreemptedEvent");
    ke localke = new ke();
    localke.cFH.action = 10;
    localke.cFH.state = "preempted";
    localke.cFH.appId = "not from app brand appid";
    localke.cFH.cFJ = true;
    com.tencent.mm.sdk.b.a.xxA.a(localke, Looper.getMainLooper());
  }

  public void aic()
  {
    this.oLS.stopPlay();
    if (this.oLT != null)
      this.oLT.stopPlay();
    if (this.oLU != null)
      this.oLU.stopPlay();
    al.af(this.oLV);
  }

  public com.tencent.mm.aw.e bTQ()
  {
    return null;
  }

  public com.tencent.mm.plugin.music.f.a.d bTS()
  {
    Object localObject = bTQ();
    if (com.tencent.mm.plugin.music.h.c.L((com.tencent.mm.aw.e)localObject))
      localObject = this.oLU;
    while (true)
    {
      return localObject;
      if ((localObject != null) && (com.tencent.mm.plugin.music.h.c.zX(((com.tencent.mm.aw.e)localObject).fJS)))
        localObject = this.oLT;
      else
        localObject = this.oLS;
    }
  }

  public void finish()
  {
    aic();
    release();
  }

  public void ju(boolean paramBoolean)
  {
    if (this.oLS.aie())
      this.oLS.cFK = paramBoolean;
    if (this.oLT.aie())
      this.oLT.cFK = paramBoolean;
    if (this.oLU.aie())
      this.oLU.cFK = paramBoolean;
  }

  public final void q(com.tencent.mm.aw.e parame)
  {
    if (com.tencent.mm.plugin.music.h.c.L(parame))
    {
      ab.i("MicroMsg.Music.MusicBasePlayEngine", "use exoMusicPlayer");
      bUd();
      this.oLU.f(parame);
    }
    while (true)
    {
      if (parame.fJS != 11)
        bUe();
      return;
      if (com.tencent.mm.plugin.music.h.c.zX(parame.fJS))
      {
        ab.i("MicroMsg.Music.MusicBasePlayEngine", "use qqMusicPlayer");
        bUd();
        this.oLT.f(parame);
      }
      else
      {
        ab.i("MicroMsg.Music.MusicBasePlayEngine", "use musicPlayer");
        bUd();
        this.oLS.f(parame);
      }
    }
  }

  public final void r(com.tencent.mm.aw.e parame)
  {
    if (com.tencent.mm.plugin.music.h.c.L(parame))
      this.oLU.H(parame);
    while (true)
    {
      return;
      if ((parame != null) && (com.tencent.mm.plugin.music.h.c.zX(parame.fJS)))
        this.oLT.H(parame);
      else
        this.oLS.H(parame);
    }
  }

  public void release()
  {
    ab.i("MicroMsg.Music.MusicBasePlayEngine", "release");
    if (this.oLT != null)
      this.oLT.release();
    if (this.oLU != null)
      this.oLU.release();
    al.af(this.oLV);
  }

  public void zI(int paramInt)
  {
    ab.i("MicroMsg.Music.MusicBasePlayEngine", "stopMusicDelayIfPaused, delay_ms:%d", new Object[] { Integer.valueOf(paramInt) });
    al.af(this.oLV);
    al.n(this.oLV, paramInt);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.music.e.h
 * JD-Core Version:    0.6.2
 */