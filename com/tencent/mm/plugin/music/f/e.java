package com.tencent.mm.plugin.music.f;

import android.net.Uri;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.aw.c;
import com.tencent.mm.plugin.music.cache.g;
import com.tencent.mm.plugin.music.e.d;
import com.tencent.mm.plugin.music.e.k;
import com.tencent.mm.plugin.music.f.a.d.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.qqmusic.mediaplayer.AudioFormat.AudioType;
import com.tencent.qqmusic.mediaplayer.CommonPlayer;
import com.tencent.qqmusic.mediaplayer.PlayerListenerCallback;
import com.tencent.qqmusic.mediaplayer.network.IMediaHTTPService;
import java.net.URL;

public final class e extends a
{
  AudioFormat.AudioType audioType;
  int bqQ;
  String cle;
  CommonPlayer oKc;
  boolean oKe;
  private IMediaHTTPService oKh;
  private long oKj;
  private boolean oKk;
  private PlayerListenerCallback oKm;
  com.tencent.mm.aw.e oLA;
  private c oLB;
  public boolean oLN;
  e.a oNI;
  private String oNJ;
  int startTime;

  public e()
  {
    AppMethodBeat.i(137611);
    this.cle = "";
    this.bqQ = 0;
    this.startTime = 0;
    this.oKj = 0L;
    this.audioType = AudioFormat.AudioType.UNSUPPORT;
    this.oKk = false;
    this.oLN = false;
    this.oKm = new e.1(this);
    com.tencent.mm.plugin.music.f.a.a.bUE();
    AppMethodBeat.o(137611);
  }

  private boolean bTc()
  {
    boolean bool = false;
    AppMethodBeat.i(137619);
    if (this.oKc != null)
      if (this.oKc.getPlayerState() == 3)
      {
        bool = true;
        AppMethodBeat.o(137619);
      }
    while (true)
    {
      return bool;
      AppMethodBeat.o(137619);
      continue;
      AppMethodBeat.o(137619);
    }
  }

  private void e(com.tencent.mm.aw.e parame, int paramInt)
  {
    AppMethodBeat.i(137628);
    if (this.oNt != null)
      this.oNt.b(parame, paramInt);
    AppMethodBeat.o(137628);
  }

  public final boolean aie()
  {
    boolean bool = false;
    AppMethodBeat.i(137618);
    if (this.oKc != null)
      if (this.oKc.getPlayerState() == 4)
      {
        bool = true;
        AppMethodBeat.o(137618);
      }
    while (true)
    {
      return bool;
      AppMethodBeat.o(137618);
      continue;
      AppMethodBeat.o(137618);
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
    AppMethodBeat.i(137620);
    boolean bool;
    if ((this.oKe) && (!bTc()))
    {
      bool = true;
      AppMethodBeat.o(137620);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(137620);
    }
  }

  public final void bSN()
  {
    AppMethodBeat.i(137616);
    this.oLN = true;
    ab.i("MicroMsg.Music.QQMusicPlayer", "passivePause");
    if ((this.oKc != null) && (aie()));
    while (true)
    {
      try
      {
        this.oKc.pause();
        AppMethodBeat.o(137616);
        return;
      }
      catch (Exception localException)
      {
        ab.printErrStackTrace("MicroMsg.Music.QQMusicPlayer", localException, "passivePause", new Object[0]);
        d(this.oLA, 503);
        e(this.oLA, 503);
      }
      AppMethodBeat.o(137616);
    }
  }

  public final boolean bSO()
  {
    return true;
  }

  public final c bSP()
  {
    int i = 0;
    int j = 0;
    AppMethodBeat.i(137625);
    int k = getDuration();
    int m = bTi();
    boolean bool = aie();
    if (this.oKc != null);
    for (int n = this.oKc.getBufferedPercentage(); ; n = 0)
    {
      int i1;
      if (n >= 0)
      {
        i1 = n;
        if (n <= 100);
      }
      else
      {
        i1 = 0;
      }
      n = i1;
      if (i1 < 0)
        n = 0;
      c localc;
      if (this.oLB != null)
      {
        localc = this.oLB;
        i1 = j;
        if (bool)
          i1 = 1;
        localc.t(k, m, i1, n);
      }
      while (true)
      {
        this.oLB.cFJ = true;
        this.oLB.fJR = bUy();
        localc = this.oLB;
        AppMethodBeat.o(137625);
        return localc;
        i1 = i;
        if (bool)
          i1 = 1;
        this.oLB = new c(k, m, i1, n);
      }
    }
  }

  protected final void bTI()
  {
    AppMethodBeat.i(137613);
    this.oNt = ((d)com.tencent.mm.plugin.music.f.c.b.ar(d.class));
    this.oNu = k.bUf().oLX;
    AppMethodBeat.o(137613);
  }

  public final void bTb()
  {
    AppMethodBeat.i(137615);
    ab.i("MicroMsg.Music.QQMusicPlayer", "pauseAndAbandonFocus");
    pause();
    k.bUh().bSK();
    AppMethodBeat.o(137615);
  }

  public final int bTi()
  {
    AppMethodBeat.i(137622);
    int i;
    if (this.oKc != null)
    {
      i = (int)this.oKc.getCurrentPosition();
      AppMethodBeat.o(137622);
    }
    while (true)
    {
      return i;
      i = -1;
      AppMethodBeat.o(137622);
    }
  }

  public final void bTk()
  {
    AppMethodBeat.i(137627);
    com.tencent.mm.aw.e locale = k.bUf().bTQ();
    if (locale == null)
      AppMethodBeat.o(137627);
    while (true)
    {
      return;
      if ((locale.e(this.oLA)) && (this.oKc != null) && (aie()))
      {
        int i = (int)this.oKc.getCurrentPosition();
        int j = this.oKc.getDuration();
        if ((i > 0) && (j > 0) && (this.oKa != null))
          this.oKa.dN(i, j);
      }
      AppMethodBeat.o(137627);
    }
  }

  public final void f(com.tencent.mm.aw.e parame)
  {
    AppMethodBeat.i(137612);
    super.f(parame);
    long l1 = System.currentTimeMillis();
    long l2 = l1 - this.oKj;
    if ((this.oLA != null) && (this.oLA.e(parame)) && (l2 <= 3000L))
    {
      this.oLA = parame;
      ab.e("MicroMsg.Music.QQMusicPlayer", "startPlay, is playing for music src:%s, don't play again in 3 second, interval:%d", new Object[] { this.cle, Long.valueOf(l2) });
      AppMethodBeat.o(137612);
    }
    while (true)
    {
      return;
      if (parame != null)
        break;
      ab.e("MicroMsg.Music.QQMusicPlayer", "music is null");
      AppMethodBeat.o(137612);
    }
    if (this.oNt != null)
      this.oNt.s(parame);
    this.oKj = l1;
    this.oLA = parame;
    ab.i("MicroMsg.Music.QQMusicPlayer", "startPlay, currentTime:%d, startTime:%d", new Object[] { Long.valueOf(l1), Integer.valueOf(parame.startTime) });
    if ((this.oKc != null) && (aie()))
      this.oKc.stop();
    com.tencent.mm.plugin.music.f.a.a.bUF();
    this.bqQ = 0;
    this.startTime = parame.startTime;
    this.audioType = null;
    this.oKk = false;
    ab.i("MicroMsg.Music.QQMusicPlayer", "initPlayer");
    this.cle = this.oLA.playUrl;
    this.oNJ = this.oLA.fKg;
    ab.i("MicroMsg.Music.QQMusicPlayer", "mSrc:%s mSongLocalPath:%s", new Object[] { this.cle, this.oNJ });
    ab.i("MicroMsg.Music.QQMusicPlayer", "field_songWifiUrl:%s", new Object[] { this.oLA.fKa });
    if ((!bo.isNullOrNil(this.cle)) && (bo.isNullOrNil(this.oNJ)))
    {
      g.SV(this.cle);
      g.cI(this.cle, 0);
      g.cJ(this.cle, 0);
    }
    if (!bo.isNullOrNil(this.oNJ))
    {
      ab.i("MicroMsg.Music.QQMusicPlayer", "play with local file, filePath:%s", new Object[] { this.oNJ });
      if (this.oKc == null)
        this.oKc = new CommonPlayer(this.oKm);
      this.oKc.reset();
      if (this.oNJ.startsWith("file://"))
        this.oNJ = this.oNJ.substring(7);
    }
    while (true)
    {
      try
      {
        this.oKc.setDataSource(this.oNJ);
        this.oKc.prepare();
        bUx();
        AppMethodBeat.o(137612);
      }
      catch (Exception parame)
      {
        ab.e("MicroMsg.Music.QQMusicPlayer", "initPlayer exception:" + parame.getMessage());
        ab.printErrStackTrace("MicroMsg.Music.QQMusicPlayer", parame, "initPlayer", new Object[0]);
        d(this.oLA, 501);
        e(this.oLA, 501);
        continue;
      }
      try
      {
        parame = new java/net/URL;
        parame.<init>(this.cle);
        if (parame == null)
        {
          ab.e("MicroMsg.Music.QQMusicPlayer", "initPlayer url is null");
          d(this.oLA, 500);
          e(this.oLA, 500);
        }
      }
      catch (Exception parame)
      {
        while (true)
        {
          ab.printErrStackTrace("MicroMsg.Music.QQMusicPlayer", parame, "initPlayer", new Object[0]);
          ab.e("MicroMsg.Music.QQMusicPlayer", "new URL exception:" + parame.getMessage());
          parame = null;
        }
        if (this.oKc == null)
          this.oKc = new CommonPlayer(this.oKm);
        this.oKc.reset();
        if (this.oKh == null)
          this.oKh = new com.tencent.mm.plugin.music.g.a.b();
        try
        {
          this.oKc.setDataSource(this.oKh, Uri.parse(parame.toString()));
          this.oKc.prepare();
        }
        catch (Exception parame)
        {
          ab.e("MicroMsg.Music.QQMusicPlayer", "initPlayer exception:" + parame.getMessage());
          ab.printErrStackTrace("MicroMsg.Music.QQMusicPlayer", parame, "initPlayer", new Object[0]);
          d(this.oLA, 501);
          e(this.oLA, 501);
        }
      }
    }
  }

  public final int getDuration()
  {
    AppMethodBeat.i(137623);
    int i;
    if (this.oKc != null)
    {
      i = this.oKc.getDuration();
      AppMethodBeat.o(137623);
    }
    while (true)
    {
      return i;
      i = -1;
      AppMethodBeat.o(137623);
    }
  }

  public final boolean lP(int paramInt)
  {
    boolean bool = true;
    AppMethodBeat.i(137624);
    int i = getDuration();
    ab.i("MicroMsg.Music.QQMusicPlayer", "seekToMusic pos:%d, duration:%d", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(i) });
    if ((i < 0) || (paramInt > i))
    {
      ab.e("MicroMsg.Music.QQMusicPlayer", "position is invalid, position:%d, duration:%d", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(i) });
      stopPlay();
      AppMethodBeat.o(137624);
      bool = false;
    }
    while (true)
    {
      return bool;
      if (this.oKc != null)
      {
        F(this.oLA);
        this.oKc.seekTo(paramInt);
      }
      AppMethodBeat.o(137624);
    }
  }

  public final void pause()
  {
    AppMethodBeat.i(137614);
    this.oLN = false;
    ab.i("MicroMsg.Music.QQMusicPlayer", "pause");
    if ((this.oKc != null) && (aie()));
    while (true)
    {
      try
      {
        this.oKc.pause();
        AppMethodBeat.o(137614);
        return;
      }
      catch (Exception localException)
      {
        ab.printErrStackTrace("MicroMsg.Music.QQMusicPlayer", localException, "pause", new Object[0]);
        d(this.oLA, 503);
        e(this.oLA, 503);
      }
      AppMethodBeat.o(137614);
    }
  }

  public final void release()
  {
    AppMethodBeat.i(137626);
    ab.i("MicroMsg.Music.QQMusicPlayer", "release");
    if (this.oKc != null)
    {
      this.oKc.release();
      this.oKc = null;
    }
    bSM();
    AppMethodBeat.o(137626);
  }

  public final void resume()
  {
    AppMethodBeat.i(137617);
    this.bqQ = 0;
    boolean bool1 = bTc();
    boolean bool2 = aie();
    ab.i("MicroMsg.Music.QQMusicPlayer", "resume, isPreparing:%b, isPlayingMusic:%b", new Object[] { Boolean.valueOf(bool1), Boolean.valueOf(bool2) });
    if ((this.oKc == null) || (bool1) || (bool2) || (k.bUh().requestFocus()));
    while (true)
    {
      try
      {
        this.oKc.start();
        this.oKe = true;
        AppMethodBeat.o(137617);
        return;
      }
      catch (Exception localException)
      {
        ab.printErrStackTrace("MicroMsg.Music.QQMusicPlayer", localException, "resume", new Object[0]);
        d(this.oLA, 502);
        e(this.oLA, 502);
        continue;
      }
      ab.e("MicroMsg.Music.QQMusicPlayer", "request focus error");
    }
  }

  public final void stopPlay()
  {
    AppMethodBeat.i(137621);
    ab.i("MicroMsg.Music.QQMusicPlayer", "stopPlay");
    try
    {
      if (this.oKc != null)
        this.oKc.stop();
      if (this.oNI != null)
      {
        this.oNI.isStop = true;
        this.oNI = null;
      }
      k.bUh().bSK();
      this.oKe = false;
      this.oLN = false;
      AppMethodBeat.o(137621);
      return;
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.Music.QQMusicPlayer", localException, "stopPlay", new Object[0]);
        d(this.oLA, 504);
        e(this.oLA, 504);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.music.f.e
 * JD-Core Version:    0.6.2
 */