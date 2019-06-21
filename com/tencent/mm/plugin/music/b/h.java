package com.tencent.mm.plugin.music.b;

import android.net.Uri;
import android.os.Looper;
import android.text.TextUtils;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.u;
import com.tencent.mm.plugin.music.f.a.d.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.ax;
import com.tencent.qqmusic.mediaplayer.AudioFormat.AudioType;
import com.tencent.qqmusic.mediaplayer.CommonPlayer;
import com.tencent.qqmusic.mediaplayer.PlayerListenerCallback;
import com.tencent.qqmusic.mediaplayer.network.IMediaHTTPService;
import java.net.URL;

public final class h extends g
{
  AudioFormat.AudioType audioType;
  int bqQ;
  String ckD;
  String cle;
  protected com.tencent.mm.ag.b csL;
  long eDL;
  boolean fqY;
  ak ilv;
  int lqz;
  com.tencent.mm.plugin.music.b.a.d oJL;
  CommonPlayer oKc;
  private com.tencent.mm.ag.d oKd;
  boolean oKe;
  boolean oKf;
  h.a oKg;
  private IMediaHTTPService oKh;
  boolean oKi;
  private long oKj;
  boolean oKk;
  long oKl;
  private PlayerListenerCallback oKm;
  int startTime;

  public h()
  {
    AppMethodBeat.i(137364);
    this.ckD = "";
    this.oKf = false;
    this.fqY = false;
    this.cle = "";
    this.bqQ = 0;
    this.lqz = 0;
    this.startTime = 0;
    this.oKi = false;
    this.oKj = 0L;
    this.audioType = AudioFormat.AudioType.UNSUPPORT;
    this.oKk = false;
    this.oKl = 0L;
    this.eDL = 0L;
    this.oKm = new h.1(this);
    this.ckD = e.bSy();
    com.tencent.mm.plugin.music.f.a.a.bUE();
    if (android.support.v4.content.b.checkSelfPermission(ah.getContext(), "android.permission.READ_PHONE_STATE") != 0)
      ab.e("MicroMsg.Audio.BaseAudioPlayer", "addPhoneStatusWatcher() not have read_phone_state perm");
    while (true)
    {
      ab.i("MicroMsg.Audio.QQAudioPlayer", "create QQAudioPlayer instance");
      this.ilv = new ak(Looper.myLooper());
      AppMethodBeat.o(137364);
      return;
      this.oJY = new ax();
      this.oJY.gK(ah.getContext());
      this.oJY.a(new g.1(this));
    }
  }

  private void bSZ()
  {
    AppMethodBeat.i(137368);
    ab.i("MicroMsg.Audio.QQAudioPlayer", "initPlayer");
    if ((!TextUtils.isEmpty(this.csL.filePath)) && (this.csL.fqV == null))
    {
      ab.i("MicroMsg.Audio.QQAudioPlayer", "play with local file, filePath:%s", new Object[] { this.csL.filePath });
      if (this.oKc == null)
        this.oKc = new CommonPlayer(this.oKm);
      this.oKc.reset();
    }
    while (true)
    {
      try
      {
        this.oKc.setDataSource(this.csL.filePath);
        this.oKc.prepare();
        AppMethodBeat.o(137368);
        return;
      }
      catch (Exception localException1)
      {
        ab.printErrStackTrace("MicroMsg.Audio.QQAudioPlayer", localException1, "initPlayer exception", new Object[0]);
        zl(501);
        zm(501);
        AppMethodBeat.o(137368);
        continue;
      }
      if ((!TextUtils.isEmpty(this.csL.filePath)) && (this.csL.fqV != null))
      {
        ab.i("MicroMsg.Audio.QQAudioPlayer", "play with inputStream, filePath:%s", new Object[] { this.csL.filePath });
        if (this.oKc == null)
          this.oKc = new CommonPlayer(this.oKm);
        this.oKc.reset();
        com.tencent.mm.plugin.music.g.b localb = new com.tencent.mm.plugin.music.g.b(this.csL.fqV);
        try
        {
          this.oKc.setDataSource(localb);
          this.oKc.prepare();
          AppMethodBeat.o(137368);
        }
        catch (Exception localException2)
        {
          ab.e("MicroMsg.Audio.QQAudioPlayer", "initPlayer exception:" + localException2.getMessage());
          ab.printErrStackTrace("MicroMsg.Audio.QQAudioPlayer", localException2, "initPlayer", new Object[0]);
          zl(501);
          zm(501);
          AppMethodBeat.o(137368);
        }
      }
      else
      {
        ab.i("MicroMsg.Audio.QQAudioPlayer", "play with src url :%s", new Object[] { this.csL.clP });
        bTa();
        try
        {
          URL localURL = new java/net/URL;
          localURL.<init>(this.cle);
          if (localURL == null)
          {
            ab.e("MicroMsg.Audio.QQAudioPlayer", "initPlayer url is null");
            zl(500);
            zm(500);
            AppMethodBeat.o(137368);
          }
        }
        catch (Exception localException3)
        {
          Object localObject;
          while (true)
          {
            ab.printErrStackTrace("MicroMsg.Audio.QQAudioPlayer", localException3, "initPlayer", new Object[0]);
            localObject = null;
          }
          if (this.oKc == null)
            this.oKc = new CommonPlayer(this.oKm);
          this.oKc.reset();
          if (this.oKh == null)
            this.oKh = new com.tencent.mm.plugin.music.g.a.b();
          try
          {
            this.oKc.setDataSource(this.oKh, Uri.parse(localObject.toString()));
            this.oKc.prepare();
            AppMethodBeat.o(137368);
          }
          catch (Exception localException4)
          {
            ab.e("MicroMsg.Audio.QQAudioPlayer", "initPlayer exception:" + localException4.getMessage());
            ab.printErrStackTrace("MicroMsg.Audio.QQAudioPlayer", localException4, "initPlayer", new Object[0]);
            zl(501);
            zm(501);
            AppMethodBeat.o(137368);
          }
        }
      }
    }
  }

  private void bTa()
  {
    AppMethodBeat.i(137369);
    this.cle = this.csL.clP;
    if (com.tencent.mm.plugin.music.h.e.Tw(this.cle))
      ab.i("MicroMsg.Audio.QQAudioPlayer", "can match shake music wifi url");
    for (boolean bool = true; ; bool = false)
    {
      ab.i("MicroMsg.Audio.QQAudioPlayer", "mSrc:%s", new Object[] { this.cle });
      com.tencent.mm.plugin.music.cache.g.SV(this.cle);
      com.tencent.mm.plugin.music.cache.g.aV(this.cle, bool);
      AppMethodBeat.o(137369);
      return;
    }
  }

  private void bTh()
  {
    AppMethodBeat.i(137384);
    try
    {
      if (this.oKc != null)
      {
        this.oKc.setVolume(0.0F, 0.0F);
        this.oKc.stop();
      }
      if (this.oKg != null)
      {
        this.oKg.isStop = true;
        this.oKg = null;
      }
      this.oKe = false;
      this.oKf = true;
      this.eDL = System.currentTimeMillis();
      AppMethodBeat.o(137384);
      return;
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.Audio.QQAudioPlayer", localException, "stopPlay", new Object[0]);
        zl(504);
        zm(504);
      }
    }
  }

  private void zm(int paramInt)
  {
    AppMethodBeat.i(137389);
    if (this.oJL != null)
      this.oJL.eD(this.csL.fromScene, paramInt);
    AppMethodBeat.o(137389);
  }

  public final void SN(String paramString)
  {
    AppMethodBeat.i(137365);
    ab.i("MicroMsg.Audio.QQAudioPlayer", "setAudioId:%s", new Object[] { paramString });
    this.ckD = paramString;
    AppMethodBeat.o(137365);
  }

  public final boolean aie()
  {
    boolean bool = false;
    AppMethodBeat.i(137373);
    if (this.oKc != null)
      if (this.oKc.getPlayerState() == 4)
      {
        bool = true;
        AppMethodBeat.o(137373);
      }
    while (true)
    {
      return bool;
      AppMethodBeat.o(137373);
      continue;
      AppMethodBeat.o(137373);
    }
  }

  public final boolean aig()
  {
    AppMethodBeat.i(137379);
    boolean bool;
    if ((this.oKe) && (!bTc()))
    {
      bool = true;
      AppMethodBeat.o(137379);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(137379);
    }
  }

  public final void b(com.tencent.mm.ag.b paramb)
  {
    AppMethodBeat.i(137366);
    this.csL = paramb;
    this.startTime = paramb.startTime;
    this.oKi = paramb.fqK;
    if ((this.oKc != null) && (aie()))
    {
      ab.i("MicroMsg.Audio.QQAudioPlayer", "audioId:%s, param.src:%s setVoume %f", new Object[] { this.ckD, this.cle, Double.valueOf(this.csL.fqN) });
      this.oKc.setVolume((float)this.csL.fqN, (float)this.csL.fqN);
    }
    AppMethodBeat.o(137366);
  }

  public final boolean bSO()
  {
    return true;
  }

  public final String bSQ()
  {
    return this.ckD;
  }

  public final void bTb()
  {
    AppMethodBeat.i(137371);
    ab.i("MicroMsg.Audio.QQAudioPlayer", "pauseAndAbandonFocus");
    pause();
    AppMethodBeat.o(137371);
  }

  public final boolean bTc()
  {
    boolean bool = false;
    AppMethodBeat.i(137374);
    if (this.oKc != null)
      if (this.oKc.getPlayerState() == 3)
      {
        bool = true;
        AppMethodBeat.o(137374);
      }
    while (true)
    {
      return bool;
      AppMethodBeat.o(137374);
      continue;
      AppMethodBeat.o(137374);
    }
  }

  public final boolean bTd()
  {
    boolean bool = false;
    AppMethodBeat.i(137375);
    if (this.oKc != null)
      if (this.oKc.getPlayerState() == 2)
      {
        bool = true;
        AppMethodBeat.o(137375);
      }
    while (true)
    {
      return bool;
      AppMethodBeat.o(137375);
      continue;
      AppMethodBeat.o(137375);
    }
  }

  public final void bTe()
  {
    AppMethodBeat.i(137380);
    ab.i("MicroMsg.Audio.QQAudioPlayer", "setPauseOnBackground");
    this.fqY = true;
    this.oKf = true;
    AppMethodBeat.o(137380);
  }

  public final void bTf()
  {
    AppMethodBeat.i(137381);
    ab.i("MicroMsg.Audio.QQAudioPlayer", "pauseOnBackGround");
    this.fqY = true;
    bTh();
    AppMethodBeat.o(137381);
  }

  public final void bTg()
  {
    AppMethodBeat.i(137382);
    this.fqY = false;
    this.oKf = true;
    bSV();
    this.eDL = System.currentTimeMillis();
    AppMethodBeat.o(137382);
  }

  public final int bTi()
  {
    AppMethodBeat.i(137385);
    int i;
    if (this.oKc != null)
    {
      i = (int)this.oKc.getCurrentPosition();
      AppMethodBeat.o(137385);
    }
    while (true)
    {
      return i;
      i = -1;
      AppMethodBeat.o(137385);
    }
  }

  public final com.tencent.mm.ag.d bTj()
  {
    boolean bool1 = false;
    AppMethodBeat.i(137388);
    if (this.oKd == null)
      this.oKd = new com.tencent.mm.ag.d();
    int i = getDuration();
    int j = bTi();
    boolean bool2 = aie();
    if (this.oKc != null);
    for (int k = this.oKc.getBufferedPercentage(); ; k = 0)
    {
      int m;
      if (k >= 0)
      {
        m = k;
        if (k <= 100);
      }
      else
      {
        m = 0;
      }
      k = m;
      if (m < 0)
        k = 0;
      this.oKd.csK = j;
      this.oKd.duration = i;
      com.tencent.mm.ag.d locald = this.oKd;
      if (bool2)
      {
        locald.rw = bool1;
        this.oKd.fqY = this.fqY;
        this.oKd.fqZ = (k * i / 100);
        if (this.csL == null)
          break label202;
        this.oKd.startTime = this.csL.fqJ;
        this.oKd.ckz = this.csL.clP;
        locald = this.oKd;
        AppMethodBeat.o(137388);
      }
      while (true)
      {
        return locald;
        bool1 = true;
        break;
        label202: locald = null;
        AppMethodBeat.o(137388);
      }
    }
  }

  public final void bTk()
  {
    AppMethodBeat.i(137391);
    if ((this.ckD.equalsIgnoreCase(this.csL.ckD)) && (this.oKc != null) && (aie()))
    {
      int i = (int)this.oKc.getCurrentPosition();
      int j = this.oKc.getDuration();
      if ((i > 0) && (j > 0) && (this.oKa != null))
        this.oKa.dN(i, j);
    }
    AppMethodBeat.o(137391);
  }

  public final String getAppId()
  {
    if (this.csL != null);
    for (String str = this.csL.appId; ; str = "")
      return str;
  }

  public final int getDuration()
  {
    AppMethodBeat.i(137386);
    int i;
    if (this.oKc != null)
    {
      i = this.oKc.getDuration();
      AppMethodBeat.o(137386);
    }
    while (true)
    {
      return i;
      i = -1;
      AppMethodBeat.o(137386);
    }
  }

  public final boolean isCompleted()
  {
    boolean bool = false;
    AppMethodBeat.i(137377);
    if (this.oKc != null)
      if (this.oKc.getPlayerState() == 7)
      {
        bool = true;
        AppMethodBeat.o(137377);
      }
    while (true)
    {
      return bool;
      AppMethodBeat.o(137377);
      continue;
      AppMethodBeat.o(137377);
    }
  }

  public final boolean isPaused()
  {
    boolean bool = false;
    AppMethodBeat.i(137376);
    if (this.oKc != null)
      if (this.oKc.getPlayerState() == 5)
      {
        bool = true;
        AppMethodBeat.o(137376);
      }
    while (true)
    {
      return bool;
      AppMethodBeat.o(137376);
      continue;
      AppMethodBeat.o(137376);
    }
  }

  public final boolean isStopped()
  {
    boolean bool = false;
    AppMethodBeat.i(137378);
    if (this.oKc != null)
      if (this.oKc.getPlayerState() == 6)
      {
        bool = true;
        AppMethodBeat.o(137378);
      }
    while (true)
    {
      return bool;
      AppMethodBeat.o(137378);
      continue;
      AppMethodBeat.o(137378);
    }
  }

  public final void l(com.tencent.mm.ag.b paramb)
  {
    AppMethodBeat.i(137367);
    if (paramb == null)
    {
      ab.i("MicroMsg.Audio.QQAudioPlayer", "startPlay fail, play param is null");
      bSY();
      AppMethodBeat.o(137367);
    }
    while (true)
    {
      return;
      long l1 = System.currentTimeMillis();
      long l2 = l1 - this.oKj;
      if ((this.csL != null) && (this.csL.e(paramb)) && (l2 <= 100L))
      {
        this.csL = paramb;
        this.startTime = paramb.startTime;
        this.oKi = paramb.fqK;
        ab.e("MicroMsg.Audio.QQAudioPlayer", "startPlay, is playing for audio src:%s, don't play again in 3 second, interval:%d", new Object[] { this.cle, Long.valueOf(l2) });
        AppMethodBeat.o(137367);
      }
      else
      {
        this.oJL = ((com.tencent.mm.plugin.music.b.a.d)com.tencent.mm.plugin.music.f.c.b.ar(com.tencent.mm.plugin.music.b.a.d.class));
        if (this.oJL != null)
          this.oJL.zo(paramb.fromScene);
        this.oKj = l1;
        this.csL = paramb;
        ab.i("MicroMsg.Audio.QQAudioPlayer", "startPlay, fromScene:%d, audioId:%s", new Object[] { Integer.valueOf(this.csL.fromScene), this.ckD });
        if ((this.oKc != null) && (aie()))
          this.oKc.stop();
        this.bqQ = 0;
        this.startTime = paramb.startTime;
        this.oKi = paramb.fqK;
        this.audioType = null;
        this.oKk = false;
        this.fqY = false;
        this.oKf = false;
        bSZ();
        AppMethodBeat.o(137367);
      }
    }
  }

  public final boolean lP(int paramInt)
  {
    boolean bool = false;
    AppMethodBeat.i(137387);
    int i = getDuration();
    ab.i("MicroMsg.Audio.QQAudioPlayer", "seekToMusic pos:%d, duration:%d", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(i) });
    if (i < 0)
    {
      ab.e("MicroMsg.Audio.QQAudioPlayer", "position is invalid, position:%d, duration:%d", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(i) });
      stopPlay();
      AppMethodBeat.o(137387);
    }
    while (true)
    {
      return bool;
      if (paramInt > i)
      {
        ab.e("MicroMsg.Audio.QQAudioPlayer", "position is invalid, position:%d, duration:%d", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(i) });
        AppMethodBeat.o(137387);
      }
      else
      {
        if (this.oKc != null)
        {
          ab.i("MicroMsg.Audio.BaseAudioPlayer", "onSeekingEvent");
          u localu = new u();
          localu.csP.action = 10;
          localu.csP.state = "seeking";
          localu.csP.ckD = bSQ();
          localu.csP.appId = getAppId();
          com.tencent.mm.sdk.b.a.xxA.a(localu, Looper.getMainLooper());
          this.oKc.seekTo(paramInt);
        }
        AppMethodBeat.o(137387);
        bool = true;
      }
    }
  }

  public final void pause()
  {
    AppMethodBeat.i(137370);
    ab.i("MicroMsg.Audio.QQAudioPlayer", "pause, audioId:%s", new Object[] { this.ckD });
    this.oKf = true;
    if ((this.oKc != null) && (aie()));
    while (true)
    {
      try
      {
        ab.i("MicroMsg.Audio.QQAudioPlayer", "pause success");
        this.oKc.pause();
        AppMethodBeat.o(137370);
        return;
      }
      catch (Exception localException)
      {
        ab.printErrStackTrace("MicroMsg.Audio.QQAudioPlayer", localException, "pause", new Object[0]);
        zl(503);
        zm(503);
        AppMethodBeat.o(137370);
        continue;
      }
      if ((this.oKc != null) && (isCompleted()))
      {
        ab.i("MicroMsg.Audio.QQAudioPlayer", "pause fail, play complete, set isStartPlaying false");
        this.oKe = false;
      }
      AppMethodBeat.o(137370);
    }
  }

  public final void release()
  {
    AppMethodBeat.i(137390);
    ab.i("MicroMsg.Audio.QQAudioPlayer", "release");
    this.oJR = null;
    if (this.oKc != null)
    {
      this.oKc.release();
      this.oKc = null;
    }
    bSM();
    AppMethodBeat.o(137390);
  }

  public final void resume()
  {
    AppMethodBeat.i(137372);
    this.bqQ = 0;
    boolean bool1 = bTc();
    boolean bool2 = aie();
    this.oKf = false;
    this.fqY = false;
    ab.i("MicroMsg.Audio.QQAudioPlayer", "resume, isPreparing:%b, isPlayingMusic:%b, isStartPlaying:%b, audioId:%s", new Object[] { Boolean.valueOf(bool1), Boolean.valueOf(bool2), Boolean.valueOf(this.oKe), this.ckD });
    if ((this.oKc != null) && (!bTd()) && (!bool1) && (!bool2) && (!this.oKe))
    {
      ab.i("MicroMsg.Audio.QQAudioPlayer", "audio play is complete, need initPlayer again");
      this.startTime = 0;
      this.oKi = true;
      bSZ();
      if (this.oJL == null)
        break label223;
      this.oJL.zo(this.csL.fromScene);
      AppMethodBeat.o(137372);
    }
    while (true)
    {
      return;
      if ((this.oKc != null) && ((isPaused()) || (bTd())) && (!bool2))
        ab.i("MicroMsg.Audio.QQAudioPlayer", "audio play is paused, need start to play");
      try
      {
        this.oKc.setVolume((float)this.csL.fqN, (float)this.csL.fqN);
        this.oKc.start();
        this.oKe = true;
        label223: AppMethodBeat.o(137372);
      }
      catch (Exception localException)
      {
        while (true)
        {
          ab.printErrStackTrace("MicroMsg.Audio.QQAudioPlayer", localException, "resume", new Object[0]);
          zl(502);
          zm(502);
        }
      }
    }
  }

  public final void stopPlay()
  {
    AppMethodBeat.i(137383);
    ab.i("MicroMsg.Audio.QQAudioPlayer", "stopPlay");
    this.fqY = false;
    bTh();
    AppMethodBeat.o(137383);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.music.b.h
 * JD-Core Version:    0.6.2
 */