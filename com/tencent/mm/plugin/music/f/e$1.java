package com.tencent.mm.plugin.music.f;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.music.cache.g;
import com.tencent.mm.plugin.music.e.k;
import com.tencent.mm.plugin.music.h.a;
import com.tencent.mm.sdk.g.d;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.at;
import com.tencent.qqmusic.mediaplayer.AudioFormat.AudioType;
import com.tencent.qqmusic.mediaplayer.AudioInformation;
import com.tencent.qqmusic.mediaplayer.BaseMediaPlayer;
import com.tencent.qqmusic.mediaplayer.CommonPlayer;
import com.tencent.qqmusic.mediaplayer.PlayerListenerCallback;

final class e$1
  implements PlayerListenerCallback
{
  com.tencent.mm.aw.e oNK = null;

  e$1(e parame)
  {
  }

  private void bUD()
  {
    AppMethodBeat.i(137609);
    ab.i("MicroMsg.Music.QQMusicPlayer", "_onPrepared");
    if (this.oNL.startTime != 0)
    {
      ab.i("MicroMsg.Music.QQMusicPlayer", "seek to startTime:%d", new Object[] { Integer.valueOf(this.oNL.startTime) });
      this.oNL.lP(this.oNL.startTime);
      AppMethodBeat.o(137609);
    }
    while (true)
    {
      return;
      ab.i("MicroMsg.Music.QQMusicPlayer", "start to play");
      if (k.bUh().requestFocus())
      {
        if (this.oNL.oLA == null)
        {
          ab.e("MicroMsg.Music.QQMusicPlayer", "cbMusic is null");
          AppMethodBeat.o(137609);
        }
        else
        {
          this.oNL.z(this.oNL.oLA);
          try
          {
            if (this.oNL.oKc != null)
            {
              this.oNL.oKc.start();
              if ((this.oNL.oKc.getCurrentAudioInformation() != null) && (this.oNL.oKc.getCurrentAudioInformation().getAudioType() != null))
              {
                ab.i("MicroMsg.Music.QQMusicPlayer", "getAudioType:%d", new Object[] { Integer.valueOf(this.oNL.oKc.getCurrentAudioInformation().getAudioType().getValue()) });
                this.oNL.audioType = this.oNL.oKc.getCurrentAudioInformation().getAudioType();
                e.a(this.oNL);
              }
            }
            this.oNL.oKe = true;
            AppMethodBeat.o(137609);
          }
          catch (Exception localException)
          {
            while (true)
            {
              ab.printErrStackTrace("MicroMsg.Music.QQMusicPlayer", localException, "_onPrepared", new Object[0]);
              this.oNL.d(this.oNL.oLA, 502);
              e.a(this.oNL, this.oNL.oLA, 502);
            }
          }
        }
      }
      else
      {
        ab.e("MicroMsg.Music.QQMusicPlayer", "request focus error");
        AppMethodBeat.o(137609);
      }
    }
  }

  public final void onBufferingUpdate(BaseMediaPlayer paramBaseMediaPlayer, int paramInt)
  {
  }

  public final void onCompletion(BaseMediaPlayer paramBaseMediaPlayer)
  {
    AppMethodBeat.i(137603);
    ab.i("MicroMsg.Music.QQMusicPlayer", "onCompletion");
    AppMethodBeat.o(137603);
  }

  public final void onError(BaseMediaPlayer paramBaseMediaPlayer, int paramInt1, int paramInt2, int paramInt3)
  {
    AppMethodBeat.i(137605);
    ab.e("MicroMsg.Music.QQMusicPlayer", "onError what:%d, extra:%d, errCode:%d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
    paramBaseMediaPlayer = k.bUf().bTQ();
    if (paramBaseMediaPlayer == null)
    {
      ab.e("MicroMsg.Music.QQMusicPlayer", "onError, currentMusic is null");
      AppMethodBeat.o(137605);
    }
    while (true)
    {
      return;
      this.oNK = this.oNL.oLA;
      if (this.oNK == null)
      {
        ab.e("MicroMsg.Music.QQMusicPlayer", "onError, cbMusic is null");
        AppMethodBeat.o(137605);
      }
      else
      {
        boolean bool = at.isNetworkConnected(ah.getContext());
        if ((paramInt2 == 80) && (bool))
          ab.e("MicroMsg.Music.QQMusicPlayer", "connect success, but download is fail!");
        if (this.oNL.bqQ > 0)
        {
          ab.e("MicroMsg.Music.QQMusicPlayer", "errorCount %d", new Object[] { Integer.valueOf(this.oNL.bqQ) });
          AppMethodBeat.o(137605);
        }
        else
        {
          e locale = this.oNL;
          locale.bqQ += 1;
          e.a(this.oNL, this.oNK, paramInt2);
          if (paramBaseMediaPlayer.e(this.oNK))
          {
            this.oNL.stopPlay();
            al.d(new e.1.1(this));
          }
          this.oNL.D(this.oNK);
          this.oNL.d(this.oNK, paramInt2);
          if (this.oNL.oNI != null)
          {
            this.oNL.oNI.isStop = true;
            this.oNL.oNI = null;
          }
          if ((paramInt1 == 91) && (paramInt2 == 55))
          {
            ab.i("MicroMsg.Music.QQMusicPlayer", "unknow format ,delete file");
            g.HS(this.oNL.cle);
          }
          AppMethodBeat.o(137605);
        }
      }
    }
  }

  public final void onPrepared(BaseMediaPlayer paramBaseMediaPlayer)
  {
    AppMethodBeat.i(137606);
    ab.i("MicroMsg.Music.QQMusicPlayer", "onPrepared");
    AppMethodBeat.o(137606);
  }

  public final void onSeekComplete(BaseMediaPlayer paramBaseMediaPlayer, int paramInt)
  {
    AppMethodBeat.i(137604);
    ab.i("MicroMsg.Music.QQMusicPlayer", "onSeekComplete seekPosition:%d", new Object[] { Integer.valueOf(paramInt) });
    if (this.oNL.startTime != 0)
    {
      ab.i("MicroMsg.Music.QQMusicPlayer", "seek complete to startTime :%d", new Object[] { Integer.valueOf(this.oNL.startTime) });
      this.oNL.startTime = 0;
      bUD();
      AppMethodBeat.o(137604);
    }
    while (true)
    {
      return;
      ab.i("MicroMsg.Music.QQMusicPlayer", "_onSeekComplete");
      if (this.oNK == null)
      {
        ab.e("MicroMsg.Music.QQMusicPlayer", "cbMusic is null");
        AppMethodBeat.o(137604);
      }
      else
      {
        this.oNL.E(this.oNK);
        if (this.oNL.aie())
        {
          ab.i("MicroMsg.Music.QQMusicPlayer", "seek end, send play event!");
          this.oNL.B(this.oNK);
        }
        AppMethodBeat.o(137604);
      }
    }
  }

  public final void onStarted(BaseMediaPlayer paramBaseMediaPlayer)
  {
    AppMethodBeat.i(137608);
    ab.i("MicroMsg.Music.QQMusicPlayer", "onStarted");
    AppMethodBeat.o(137608);
  }

  public final void onStateChanged(BaseMediaPlayer paramBaseMediaPlayer, int paramInt)
  {
    AppMethodBeat.i(137607);
    ab.i("MicroMsg.Music.QQMusicPlayer", "onStateChanged state %d", new Object[] { Integer.valueOf(paramInt) });
    if (paramInt == 3)
    {
      ab.i("MicroMsg.Music.QQMusicPlayer", "onStateChanged PREPARING!");
      ab.i("MicroMsg.Music.QQMusicPlayer", "_onPreparing");
      this.oNK = this.oNL.oLA;
      if (this.oNK == null)
      {
        ab.e("MicroMsg.Music.QQMusicPlayer", "cbMusic is null");
        AppMethodBeat.o(137607);
      }
    }
    while (true)
    {
      return;
      this.oNL.y(this.oNK);
      AppMethodBeat.o(137607);
      continue;
      if (paramInt == 2)
      {
        ab.i("MicroMsg.Music.QQMusicPlayer", "onStateChanged PREPARED!");
        bUD();
        AppMethodBeat.o(137607);
      }
      else if (paramInt == 4)
      {
        ab.i("MicroMsg.Music.QQMusicPlayer", "onStateChanged STARTED!");
        ab.i("MicroMsg.Music.QQMusicPlayer", "_onStart");
        this.oNK = this.oNL.oLA;
        if (this.oNK == null)
        {
          ab.e("MicroMsg.Music.QQMusicPlayer", "cbMusic is null");
          AppMethodBeat.o(137607);
        }
        else
        {
          if (this.oNL.oNs == "pause")
            this.oNL.B(this.oNK);
          while (true)
          {
            if (this.oNL.oNI != null)
              this.oNL.oNI.isStop = true;
            this.oNL.oNI = new e.a(this.oNL, (byte)0);
            paramBaseMediaPlayer = this.oNL.oNI;
            paramBaseMediaPlayer.isStop = false;
            d.post(paramBaseMediaPlayer, "music_play_progress_runnable");
            AppMethodBeat.o(137607);
            break;
            this.oNL.A(this.oNK);
          }
        }
      }
      else if (paramInt == 5)
      {
        ab.i("MicroMsg.Music.QQMusicPlayer", "onStateChanged PAUSED!");
        ab.i("MicroMsg.Music.QQMusicPlayer", "_onPause");
        if (this.oNK == null)
        {
          ab.e("MicroMsg.Music.QQMusicPlayer", "cbMusic is null");
          AppMethodBeat.o(137607);
        }
        else
        {
          this.oNL.C(this.oNK);
          AppMethodBeat.o(137607);
        }
      }
      else if (paramInt == 6)
      {
        ab.i("MicroMsg.Music.QQMusicPlayer", "onStateChanged STOPPED!");
        ab.i("MicroMsg.Music.QQMusicPlayer", "_onStop");
        if (this.oNK == null)
        {
          ab.e("MicroMsg.Music.QQMusicPlayer", "cbMusic is null");
          AppMethodBeat.o(137607);
        }
        else
        {
          paramBaseMediaPlayer = k.bUf().bTQ();
          if (paramBaseMediaPlayer == null)
          {
            ab.e("MicroMsg.Music.QQMusicPlayer", "currentMusic is null");
            AppMethodBeat.o(137607);
          }
          else
          {
            if (paramBaseMediaPlayer.e(this.oNK))
              this.oNL.D(this.oNK);
            AppMethodBeat.o(137607);
          }
        }
      }
      else if (paramInt == 7)
      {
        ab.i("MicroMsg.Music.QQMusicPlayer", "onStateChanged PLAYBACKCOMPLETED!");
        ab.i("MicroMsg.Music.QQMusicPlayer", "_onCompletion");
        if (this.oNK == null)
        {
          ab.e("MicroMsg.Music.QQMusicPlayer", "cbMusic is null");
          AppMethodBeat.o(137607);
        }
        else
        {
          this.oNL.oKe = false;
          this.oNL.G(this.oNL.oLA);
          if (this.oNL.oNI != null)
          {
            this.oNL.oNI.isStop = true;
            this.oNL.oNI = null;
          }
          AppMethodBeat.o(137607);
        }
      }
      else if (paramInt == 8)
      {
        ab.i("MicroMsg.Music.QQMusicPlayer", "onStateChanged END!");
        ab.i("MicroMsg.Music.QQMusicPlayer", "_onEnd");
        AppMethodBeat.o(137607);
      }
      else
      {
        if (paramInt == 9)
          ab.i("MicroMsg.Music.QQMusicPlayer", "onStateChanged ERROR!");
        AppMethodBeat.o(137607);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.music.f.e.1
 * JD-Core Version:    0.6.2
 */