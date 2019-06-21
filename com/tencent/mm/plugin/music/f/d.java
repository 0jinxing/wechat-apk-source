package com.tencent.mm.plugin.music.f;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.music.c.b.b;
import com.tencent.mm.plugin.music.e.k;
import com.tencent.mm.sdk.platformtools.ab;

public final class d extends a
{
  boolean oKe;
  com.tencent.mm.aw.e oLA;
  public boolean oLN;
  com.tencent.mm.plugin.music.f.a.b oNA;
  boolean oNB;
  private com.tencent.mm.aw.c oNC;
  b.b oND;
  com.tencent.mm.plugin.music.c.b oNh;

  public d()
  {
    AppMethodBeat.i(137585);
    this.oND = new d.2(this);
    this.oLN = false;
    AppMethodBeat.o(137585);
  }

  private void Ts(String paramString)
  {
    AppMethodBeat.i(137600);
    if (this.oNt != null)
      this.oNt.a(this.oLA, paramString);
    AppMethodBeat.o(137600);
  }

  private int getDownloadPercent()
  {
    AppMethodBeat.i(137597);
    com.tencent.mm.plugin.music.c.b localb;
    int i;
    if (this.oNh != null)
    {
      localb = this.oNh;
      if (localb.mgU)
      {
        ab.v("MicroMsg.Music.MusicDownloadTask", "WifiFileLength: %d downloadLength: %d", new Object[] { Long.valueOf(localb.oLu.oLr), Long.valueOf(localb.oLu.oLp) });
        if (localb.oLu.oLr != 0L)
        {
          i = (int)(localb.oLu.oLp * 100L / localb.oLu.oLr);
          if (i <= 0)
            break label188;
          AppMethodBeat.o(137597);
        }
      }
    }
    while (true)
    {
      return i;
      i = 0;
      break;
      ab.v("MicroMsg.Music.MusicDownloadTask", "fileLength: %d downloadLength: %d", new Object[] { Long.valueOf(localb.oLu.oLo), Long.valueOf(localb.oLu.oLn) });
      if (localb.oLu.oLo != 0L)
      {
        i = (int)(localb.oLu.oLn * 100L / localb.oLu.oLo);
        break;
      }
      i = 0;
      break;
      label188: AppMethodBeat.o(137597);
      i = 0;
      continue;
      AppMethodBeat.o(137597);
      i = 0;
    }
  }

  final void a(com.tencent.mm.aw.e parame, boolean paramBoolean)
  {
    AppMethodBeat.i(137588);
    if (this.oNA == null)
    {
      if ((paramBoolean) || (!com.tencent.mm.compatible.util.d.iX(15)))
        break label71;
      ab.i("MicroMsg.Music.MusicPlayer", "use MMPlayer");
    }
    for (this.oNA = new c(); ; this.oNA = new b())
    {
      this.oNA.J(parame);
      this.oNA.a(new d.1(this));
      AppMethodBeat.o(137588);
      return;
      label71: ab.i("MicroMsg.Music.MusicPlayer", "use MMMediaPlayer");
    }
  }

  public final boolean aie()
  {
    boolean bool1 = false;
    AppMethodBeat.i(137593);
    if (this.oNA != null);
    while (true)
    {
      try
      {
        boolean bool2 = this.oNA.isPlaying();
        bool1 = bool2;
        AppMethodBeat.o(137593);
        return bool1;
      }
      catch (Throwable localThrowable)
      {
        AppMethodBeat.o(137593);
        continue;
      }
      AppMethodBeat.o(137593);
    }
  }

  public final boolean aif()
  {
    if ((this.oKe) && (this.oLN));
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public final boolean aig()
  {
    return this.oKe;
  }

  public final void bSN()
  {
    AppMethodBeat.i(137591);
    this.oLN = true;
    ab.i("MicroMsg.Music.MusicPlayer", "passivePause");
    try
    {
      if ((this.oNA != null) && (this.oNA.isPlaying()))
      {
        this.oNA.pause();
        C(this.oLA);
      }
      AppMethodBeat.o(137591);
      return;
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.Music.MusicPlayer", localException, "passivePause", new Object[0]);
        AppMethodBeat.o(137591);
      }
    }
  }

  public final boolean bSO()
  {
    return false;
  }

  public final com.tencent.mm.aw.c bSP()
  {
    AppMethodBeat.i(137599);
    int i = getDuration();
    int j = bTi();
    int k;
    int m;
    if (aie())
    {
      k = 1;
      ab.i("MicroMsg.Music.MusicPlayer", "get music status = %d", new Object[] { Integer.valueOf(k) });
      m = getDownloadPercent();
      if (i <= 0)
        break label165;
    }
    while (true)
    {
      if (this.oNC != null)
        this.oNC.t(i, j, k, m);
      while (true)
      {
        this.oNC.cFJ = false;
        this.oNC.fJR = bUy();
        com.tencent.mm.aw.c localc = this.oNC;
        AppMethodBeat.o(137599);
        return localc;
        if ((this.oKe) && ((this.oNB) || (this.oJZ)));
        for (k = 1; ; k = 0)
        {
          if (k == 0)
            break label141;
          k = 0;
          break;
        }
        label141: k = 2;
        break;
        this.oNC = new com.tencent.mm.aw.c(i, j, k, m);
      }
      label165: m = 0;
    }
  }

  protected final void bTI()
  {
    AppMethodBeat.i(137587);
    this.oNt = ((com.tencent.mm.plugin.music.e.d)com.tencent.mm.plugin.music.f.c.b.ar(com.tencent.mm.plugin.music.e.d.class));
    this.oNu = k.bUf().oLX;
    AppMethodBeat.o(137587);
  }

  public final void bTb()
  {
    AppMethodBeat.i(137590);
    ab.i("MicroMsg.Music.MusicPlayer", "pauseAndAbandonFocus");
    pause();
    k.bUh().bSK();
    AppMethodBeat.o(137590);
  }

  public final int bTi()
  {
    AppMethodBeat.i(137595);
    int i;
    if (this.oNA != null)
    {
      i = this.oNA.bUA();
      AppMethodBeat.o(137595);
    }
    while (true)
    {
      return i;
      i = -1;
      AppMethodBeat.o(137595);
    }
  }

  public final void f(com.tencent.mm.aw.e parame)
  {
    AppMethodBeat.i(137586);
    super.f(parame);
    ab.i("MicroMsg.Music.MusicPlayer", "init and start download");
    stopPlay();
    if (parame == null)
    {
      ab.i("MicroMsg.Music.MusicPlayer", "music is null");
      AppMethodBeat.o(137586);
    }
    while (true)
    {
      return;
      this.oNh = new com.tencent.mm.plugin.music.c.b(parame, com.tencent.mm.plugin.music.cache.e.SU(parame.fJU));
      this.oNh.oLy = this.oND;
      if (this.oNt != null)
      {
        this.oNt.s(parame);
        ab.i("MicroMsg.Music.MusicPlayer", "initIdKeyStatData");
        this.oNt.bTT();
        this.oNt.a(this.oNh);
      }
      this.oLA = parame;
      a(parame, false);
      ab.i("MicroMsg.Music.MusicPlayer", "startPlay src:%s,  playUrl:%s", new Object[] { parame.fKa, parame.playUrl });
      this.oNh.start();
      bUx();
      AppMethodBeat.o(137586);
    }
  }

  public final int getDuration()
  {
    AppMethodBeat.i(137596);
    int i;
    if (this.oNA != null)
    {
      i = this.oNA.getDuration();
      AppMethodBeat.o(137596);
    }
    while (true)
    {
      return i;
      i = -1;
      AppMethodBeat.o(137596);
    }
  }

  public final boolean lP(int paramInt)
  {
    boolean bool = true;
    AppMethodBeat.i(137598);
    ab.i("MicroMsg.Music.MusicPlayer", "seekToMusic pos:%d", new Object[] { Integer.valueOf(paramInt) });
    try
    {
      int i = getDuration();
      int j = getDownloadPercent();
      if ((i < 0) || (paramInt > i))
      {
        ab.e("MicroMsg.Music.MusicPlayer", "duration or position is illegal, stop");
        stopPlay();
        AppMethodBeat.o(137598);
        bool = false;
      }
      while (true)
      {
        return bool;
        int k = (int)(j / 100.0D * i);
        i = paramInt;
        if (j != 100)
        {
          i = paramInt;
          if (paramInt > k)
          {
            i = k - 2000;
            ab.i("MicroMsg.Music.MusicPlayer", "on completed seekto, position is %d =", new Object[] { Integer.valueOf(i) });
          }
        }
        if ((this.oNA == null) || (i < 0))
          break;
        this.oNA.seek(i);
        E(this.oLA);
        AppMethodBeat.o(137598);
      }
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.Music.MusicPlayer", localException, "seekTo", new Object[0]);
        AppMethodBeat.o(137598);
        bool = false;
      }
    }
  }

  public final void pause()
  {
    AppMethodBeat.i(137589);
    this.oLN = false;
    ab.i("MicroMsg.Music.MusicPlayer", "pause");
    try
    {
      if ((this.oNA != null) && (this.oNA.isPlaying()))
      {
        this.oNA.pause();
        this.oNB = true;
        C(this.oLA);
      }
      AppMethodBeat.o(137589);
      return;
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.Music.MusicPlayer", localException, "pause", new Object[0]);
        AppMethodBeat.o(137589);
      }
    }
  }

  public final void resume()
  {
    AppMethodBeat.i(137592);
    try
    {
      if ((this.oNA != null) && (!this.oNA.isPlaying()))
      {
        ab.i("MicroMsg.Music.MusicPlayer", "resume");
        if (k.bUh().requestFocus())
        {
          this.oNA.play();
          B(this.oLA);
          AppMethodBeat.o(137592);
        }
        while (true)
        {
          return;
          ab.e("MicroMsg.Music.MusicPlayer", "request focus error");
          AppMethodBeat.o(137592);
        }
      }
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.Music.MusicPlayer", localException, "resume", new Object[0]);
        AppMethodBeat.o(137592);
        continue;
        ab.i("MicroMsg.Music.MusicPlayer", "music is playing");
        AppMethodBeat.o(137592);
      }
    }
  }

  public final void stopPlay()
  {
    AppMethodBeat.i(137594);
    ab.i("MicroMsg.Music.MusicPlayer", "stopPlay");
    if ((this.oNA != null) && ((this.oNA instanceof c)))
      Ts(this.oNA.bUB());
    try
    {
      if (this.oNh != null)
      {
        this.oNh.isStop = true;
        this.oNh = null;
      }
      if (this.oNA != null)
      {
        this.oNA.stop();
        this.oNA = null;
      }
      k.bUh().bSK();
      this.oKe = false;
      this.oLN = false;
      AppMethodBeat.o(137594);
      return;
    }
    catch (Exception localException)
    {
      while (true)
        ab.printErrStackTrace("MicroMsg.Music.MusicPlayer", localException, "stopPlay", new Object[0]);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.music.f.d
 * JD-Core Version:    0.6.2
 */