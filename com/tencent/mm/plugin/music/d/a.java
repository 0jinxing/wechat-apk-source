package com.tencent.mm.plugin.music.d;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.h.d.a;
import com.google.android.exoplayer2.h.f.a;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.e.a;
import com.google.android.exoplayer2.source.b.h;
import com.google.android.exoplayer2.source.g.a;
import com.google.android.exoplayer2.v;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.aw.e;
import com.tencent.mm.g.a.ke;
import com.tencent.mm.g.a.ke.a;
import com.tencent.mm.plugin.music.e.d;
import com.tencent.mm.plugin.music.f.c.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;
import java.io.IOException;
import java.util.concurrent.CopyOnWriteArraySet;

public final class a extends com.tencent.mm.plugin.music.f.a
  implements d.a, e.a
{
  Handler awA;
  boolean bjP;
  private long bqO;
  int bqQ;
  private String cle;
  boolean oKe;
  private long oKj;
  e oLA;
  private com.tencent.mm.aw.c oLB;
  int oLC;
  v oLD;
  private com.google.android.exoplayer2.g.c oLE;
  private com.google.android.exoplayer2.h.k oLF;
  private f.a oLG;
  private com.google.android.exoplayer2.source.i oLH;
  a.f oLI;
  a.a oLJ;
  a.e oLK;
  d oLL;
  a.b oLM;
  public boolean oLN;
  int startTime;
  protected String userAgent;

  public a()
  {
    AppMethodBeat.i(137502);
    this.oLC = 0;
    this.cle = "";
    this.bqQ = 0;
    this.startTime = 0;
    this.oKj = 0L;
    this.bjP = false;
    this.oLI = new a.f((byte)0);
    this.oLJ = new a.a(this, (byte)0);
    this.oLK = new a.e(this, (byte)0);
    this.oLL = new d((byte)0);
    this.oLM = new a.c(this);
    this.awA = new a.1(this, Looper.myLooper());
    this.oLN = false;
    com.tencent.mm.plugin.music.f.b.a.bUI();
    AppMethodBeat.o(137502);
  }

  private void b(e parame, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(137524);
    if (this.oNt != null)
      this.oNt.d(parame, paramInt1, paramInt2);
    AppMethodBeat.o(137524);
  }

  private boolean bTc()
  {
    AppMethodBeat.i(137510);
    boolean bool;
    if (this.oLD != null)
    {
      bool = this.oLD.isLoading();
      AppMethodBeat.o(137510);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(137510);
    }
  }

  public final void a(e parame, int paramInt1, int paramInt2)
  {
    int i = 0;
    AppMethodBeat.i(137519);
    ab.i("MicroMsg.Music.ExoMusicPlayer", "onErrorEvent with extra:%d, errCode:%d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    this.oNs = "error";
    ke localke = new ke();
    localke.cFH.action = 4;
    localke.cFH.cFB = parame;
    localke.cFH.state = "error";
    localke.cFH.duration = getDuration();
    localke.cFH.cFJ = true;
    parame = localke.cFH;
    ab.i("MicroMsg.Music.ExoPlayerErrorHandler", "getErrCodeType, errType: %d", new Object[] { Integer.valueOf(paramInt1) });
    ke.a locala;
    switch (paramInt1)
    {
    default:
      paramInt1 = i;
      parame.errCode = paramInt1;
      locala = localke.cFH;
      parame = new StringBuilder();
      parame.append("errCode:" + paramInt2 + ", err:");
      switch (paramInt2)
      {
      default:
      case -2:
      case -3:
      case -10:
      case -11:
      case -12:
      case -13:
      case -30:
      case -4001:
      case -4002:
      case -4003:
      case -4004:
      case -41:
      case -42:
      case -43:
      case -1:
      }
      break;
    case -4000:
    case -4001:
    case -4005:
    case -4004:
    case -4003:
    case -4002:
    case -4999:
    }
    while (true)
    {
      locala.aIm = parame.toString();
      com.tencent.mm.sdk.b.a.xxA.a(localke, Looper.getMainLooper());
      AppMethodBeat.o(137519);
      return;
      paramInt1 = 10002;
      break;
      paramInt1 = 10004;
      break;
      paramInt1 = 10001;
      break;
      paramInt1 = -1;
      break;
      parame.append(" no network");
      continue;
      parame.append("connect fail");
      continue;
      parame.append(" network respCode 403");
      continue;
      parame.append(" network respCode 404");
      continue;
      parame.append(" network respCode 500");
      continue;
      parame.append(" network respCode 502");
      continue;
      parame.append(" network error");
      continue;
      parame.append("UnrecognizedInputFormatException");
      continue;
      parame.append("illegal state exception");
      continue;
      parame.append("MediaCodec decoder init exception");
      continue;
      parame.append("load error");
      continue;
      parame.append("prepare error");
      continue;
      parame.append("stop error");
      continue;
      parame.append("error url format");
      continue;
      parame.append("unknow exception");
    }
  }

  public final boolean aie()
  {
    boolean bool = false;
    AppMethodBeat.i(137509);
    if (this.oLD == null)
      AppMethodBeat.o(137509);
    while (true)
    {
      return bool;
      switch (this.oLD.pO())
      {
      case 2:
      default:
        AppMethodBeat.o(137509);
        break;
      case 1:
      case 3:
        bool = this.oLD.pP();
        AppMethodBeat.o(137509);
      }
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
    AppMethodBeat.i(137511);
    boolean bool;
    if ((this.oKe) && (!bTc()))
    {
      bool = true;
      AppMethodBeat.o(137511);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(137511);
    }
  }

  public final void b(Metadata paramMetadata)
  {
    AppMethodBeat.i(137522);
    ab.i("MicroMsg.Music.ExoMusicPlayer", "onMetadata [");
    com.tencent.mm.plugin.music.f.b.a.a(paramMetadata, "  ");
    ab.i("MicroMsg.Music.ExoMusicPlayer", "]");
    AppMethodBeat.o(137522);
  }

  public final void bSN()
  {
    AppMethodBeat.i(137506);
    this.oLN = true;
    ab.i("MicroMsg.Music.ExoMusicPlayer", "passivePause");
    if (this.oLD != null)
    {
      this.oLC = 2;
      this.oLD.aE(false);
    }
    AppMethodBeat.o(137506);
  }

  public final boolean bSO()
  {
    return true;
  }

  public final com.tencent.mm.aw.c bSP()
  {
    int i = 0;
    int j = 0;
    AppMethodBeat.i(137517);
    int k = getDuration();
    int m = bTi();
    boolean bool = aie();
    int n = getDownloadPercent();
    int i1 = n;
    if (n < 0)
      i1 = 0;
    n = k;
    if ((this.oLH instanceof h))
    {
      n = k;
      if (!this.bjP)
        n = 0;
    }
    com.tencent.mm.aw.c localc;
    if (this.oLB != null)
    {
      localc = this.oLB;
      if (bool)
        j = 1;
      localc.t(n, m, j, i1);
    }
    while (true)
    {
      this.oLB.cFJ = true;
      this.oLB.fJR = bUy();
      localc = this.oLB;
      AppMethodBeat.o(137517);
      return localc;
      j = i;
      if (bool)
        j = 1;
      this.oLB = new com.tencent.mm.aw.c(n, m, j, i1);
    }
  }

  public final void bTI()
  {
    AppMethodBeat.i(137504);
    this.oNt = ((d)b.ar(d.class));
    this.oNu = com.tencent.mm.plugin.music.e.k.bUf().oLX;
    AppMethodBeat.o(137504);
  }

  final String bTJ()
  {
    AppMethodBeat.i(137523);
    String str = com.tencent.mm.plugin.music.f.b.a.jo(SystemClock.elapsedRealtime() - this.bqO);
    AppMethodBeat.o(137523);
    return str;
  }

  public final void bTb()
  {
    AppMethodBeat.i(137507);
    ab.i("MicroMsg.Music.ExoMusicPlayer", "pauseAndAbandonFocus");
    pause();
    com.tencent.mm.plugin.music.e.k.bUh().bSK();
    AppMethodBeat.o(137507);
  }

  public final int bTi()
  {
    AppMethodBeat.i(137513);
    int i;
    if (this.oLD != null)
    {
      i = (int)this.oLD.getCurrentPosition();
      AppMethodBeat.o(137513);
    }
    while (true)
    {
      return i;
      i = 0;
      AppMethodBeat.o(137513);
    }
  }

  final void eF(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(137520);
    ab.i("MicroMsg.Music.ExoMusicPlayer", "notifyOnError what:%d, extra:%d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    if (this.oLM != null)
      this.oLM.eH(paramInt1, paramInt2);
    AppMethodBeat.o(137520);
  }

  final void eG(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(137521);
    ab.i("MicroMsg.Music.ExoMusicPlayer", "notifyOnInfo [" + paramInt1 + "," + paramInt2 + "]");
    if ((this.oLM != null) && ((paramInt1 == 701) || (paramInt1 == 702)))
      this.oLM.zE(paramInt2);
    AppMethodBeat.o(137521);
  }

  public final void f(e parame)
  {
    AppMethodBeat.i(137503);
    super.f(parame);
    long l1 = System.currentTimeMillis();
    long l2 = l1 - this.oKj;
    if ((this.oLA != null) && (this.oLA.e(parame)) && (l2 <= 1000L))
    {
      this.oLA = parame;
      ab.e("MicroMsg.Music.ExoMusicPlayer", "startPlay, is playing for music src:%s, don't play again in 3 second, interval:%d", new Object[] { this.cle, Long.valueOf(l2) });
      AppMethodBeat.o(137503);
    }
    while (true)
    {
      return;
      if (parame == null)
      {
        ab.e("MicroMsg.Music.ExoMusicPlayer", "music is null");
        AppMethodBeat.o(137503);
      }
      else
      {
        if (this.oNt != null)
          this.oNt.s(parame);
        this.oKj = l1;
        ab.i("MicroMsg.Music.ExoMusicPlayer", "startPlay, currentTime:%d, startTime:%d", new Object[] { Long.valueOf(l1), Integer.valueOf(parame.startTime) });
        if ((this.oLD != null) && (aie()))
          this.oLD.stop();
        this.bqQ = 0;
        this.startTime = parame.startTime;
        this.bqO = SystemClock.elapsedRealtime();
        this.oLA = parame;
        y(this.oLA);
        ab.i("MicroMsg.Music.ExoMusicPlayer", "startPlay startTime:%d", new Object[] { Integer.valueOf(this.startTime) });
        al.d(new a.2(this));
        AppMethodBeat.o(137503);
      }
    }
  }

  public final int getDownloadPercent()
  {
    AppMethodBeat.i(137515);
    int i;
    if (this.oLD != null)
    {
      i = this.oLD.getBufferedPercentage();
      AppMethodBeat.o(137515);
    }
    while (true)
    {
      return i;
      i = 0;
      AppMethodBeat.o(137515);
    }
  }

  public final int getDuration()
  {
    AppMethodBeat.i(137514);
    int i;
    if (this.oLD != null)
    {
      i = (int)this.oLD.getDuration();
      AppMethodBeat.o(137514);
    }
    while (true)
    {
      return i;
      i = 0;
      AppMethodBeat.o(137514);
    }
  }

  public final boolean lP(int paramInt)
  {
    boolean bool1 = true;
    boolean bool2 = false;
    AppMethodBeat.i(137516);
    int i = getDuration();
    ab.i("MicroMsg.Music.ExoMusicPlayer", "seekToMusic pos:%d, duration:%d", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(i) });
    if ((i < 0) || (paramInt > i))
    {
      ab.e("MicroMsg.Music.ExoMusicPlayer", "position is invalid, position:%d, duration:%d", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(i) });
      AppMethodBeat.o(137516);
    }
    for (bool2 = false; ; bool2 = bool1)
    {
      return bool2;
      if (this.oLD != null)
      {
        F(this.oLA);
        a.f localf = this.oLI;
        if ((this.oLI.oLP[3] & 0xF0000000) != 0)
          bool2 = true;
        localf.y(bool2, 100);
        this.oLC = 4;
        this.oLD.seekTo(paramInt);
      }
      AppMethodBeat.o(137516);
    }
  }

  public final void pause()
  {
    AppMethodBeat.i(137505);
    this.oLN = false;
    ab.i("MicroMsg.Music.ExoMusicPlayer", "pause");
    if (this.oLD != null)
    {
      this.oLC = 2;
      this.oLD.aE(false);
    }
    AppMethodBeat.o(137505);
  }

  public final void release()
  {
    AppMethodBeat.i(137518);
    ab.i("MicroMsg.Music.ExoMusicPlayer", "release");
    this.awA.removeMessages(100);
    bSM();
    if (this.oLD != null)
    {
      this.oLD.b(this.oLJ);
      this.oLD.aOJ.remove(this);
      this.oLD.release();
      this.oLD = null;
    }
    if (this.oLH != null)
    {
      this.oLH.rY();
      this.oLH = null;
    }
    this.oLE = null;
    this.oLG = null;
    AppMethodBeat.o(137518);
  }

  public final void resume()
  {
    AppMethodBeat.i(137508);
    this.bqQ = 0;
    ab.i("MicroMsg.Music.ExoMusicPlayer", "resume, isPreparing:%b, isPlayingMusic:%b", new Object[] { Boolean.valueOf(bTc()), Boolean.valueOf(aie()) });
    if (this.oLD != null)
    {
      if (!com.tencent.mm.plugin.music.e.k.bUh().requestFocus())
        break label92;
      this.oLC = 1;
      this.oLD.aE(true);
      B(this.oLA);
    }
    while (true)
    {
      this.oKe = true;
      AppMethodBeat.o(137508);
      return;
      label92: ab.e("MicroMsg.Music.ExoMusicPlayer", "request focus error");
    }
  }

  public final void stopPlay()
  {
    AppMethodBeat.i(137512);
    ab.i("MicroMsg.Music.ExoMusicPlayer", "stopPlay");
    try
    {
      if (this.oLD != null)
      {
        this.oLC = 3;
        this.oLD.aE(false);
        this.oLD.stop();
        D(this.oLA);
      }
      com.tencent.mm.plugin.music.e.k.bUh().bSK();
      this.oKe = false;
      this.oLN = false;
      this.awA.removeMessages(100);
      AppMethodBeat.o(137512);
      return;
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.Music.ExoMusicPlayer", localException, "stopPlay", new Object[0]);
        d(this.oLA, 504);
        b(this.oLA, -4005, -42);
      }
    }
  }

  final class d
    implements com.google.android.exoplayer2.source.a, g.a
  {
    private d()
    {
    }

    public final void a(com.google.android.exoplayer2.h.i parami, Format paramFormat, IOException paramIOException)
    {
      AppMethodBeat.i(137490);
      a.a(a.this, "loadError", paramIOException);
      if ((parami != null) && (paramFormat != null))
        ab.e("MicroMsg.Music.ExoMusicPlayer", "uri:%s, Format:%s", new Object[] { parami.uri, paramFormat.toString() });
      a.b(a.this);
      AppMethodBeat.o(137490);
    }

    public final void onLoadError(IOException paramIOException)
    {
      AppMethodBeat.i(137492);
      a.a(a.this, "loadError", paramIOException);
      ab.printErrStackTrace("MicroMsg.Music.ExoMusicPlayer", paramIOException, "onLoadError", new Object[0]);
      a.b(a.this);
      AppMethodBeat.o(137492);
    }

    public final void rO()
    {
      AppMethodBeat.i(137491);
      ab.i("MicroMsg.Music.ExoMusicPlayer", "onLoadCompleted");
      AppMethodBeat.o(137491);
    }

    public final void rP()
    {
      AppMethodBeat.i(137493);
      ab.i("MicroMsg.Music.ExoMusicPlayer", "onHasEndTag");
      a.this.bjP = true;
      AppMethodBeat.o(137493);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.music.d.a
 * JD-Core Version:    0.6.2
 */