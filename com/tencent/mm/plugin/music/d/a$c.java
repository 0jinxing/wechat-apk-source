package com.tencent.mm.plugin.music.d;

import android.os.Handler;
import com.google.android.exoplayer2.v;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

public final class a$c
  implements a.b
{
  public a$c(a parama)
  {
  }

  public final void bTK()
  {
    AppMethodBeat.i(137482);
    ab.i("MicroMsg.Music.ExoMusicPlayer", "onPrepared");
    if (this.oLO.oLA != null)
      this.oLO.z(this.oLO.oLA);
    if (this.oLO.startTime > 0)
    {
      ab.i("MicroMsg.Music.ExoMusicPlayer", "onPrepared, seekTo startTime:%d,", new Object[] { Integer.valueOf(this.oLO.startTime) });
      this.oLO.lP(this.oLO.startTime);
    }
    if ((this.oLO.startTime == 0) && (!this.oLO.oLD.pP()))
    {
      ab.i("MicroMsg.Music.ExoMusicPlayer", "onPrepared, set play when ready");
      this.oLO.oLD.aE(true);
    }
    AppMethodBeat.o(137482);
  }

  public final void bTL()
  {
    AppMethodBeat.i(137483);
    ab.i("MicroMsg.Music.ExoMusicPlayer", "onStart");
    if (this.oLO.oLA != null)
      this.oLO.A(this.oLO.oLA);
    AppMethodBeat.o(137483);
  }

  public final void bTM()
  {
    AppMethodBeat.i(137484);
    ab.i("MicroMsg.Music.ExoMusicPlayer", "onPause");
    if ((this.oLO.oLA != null) && (!this.oLO.oLD.pP()))
      this.oLO.C(this.oLO.oLA);
    AppMethodBeat.o(137484);
  }

  public final void bTN()
  {
    AppMethodBeat.i(137485);
    ab.i("MicroMsg.Music.ExoMusicPlayer", "onStop");
    if (this.oLO.oLA != null)
      this.oLO.D(this.oLO.oLA);
    AppMethodBeat.o(137485);
  }

  public final void bTO()
  {
    AppMethodBeat.i(137486);
    ab.i("MicroMsg.Music.ExoMusicPlayer", "onSeekComplete");
    if (this.oLO.oLA != null)
      this.oLO.E(this.oLO.oLA);
    if ((this.oLO.startTime > 0) && (this.oLO.oLD != null) && (!this.oLO.oLD.pP()))
    {
      ab.i("MicroMsg.Music.ExoMusicPlayer", "onSeekComplete, stay play hls");
      this.oLO.startTime = 0;
      this.oLO.oLD.aE(true);
    }
    AppMethodBeat.o(137486);
  }

  public final void bTP()
  {
    AppMethodBeat.i(137487);
    ab.i("MicroMsg.Music.ExoMusicPlayer", "onComplete");
    if (this.oLO.oLA != null)
      this.oLO.G(this.oLO.oLA);
    this.oLO.oKe = false;
    this.oLO.awA.removeMessages(100);
    AppMethodBeat.o(137487);
  }

  public final void eH(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(137489);
    ab.i("MicroMsg.Music.ExoMusicPlayer", "onError what:%d, extra:%d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    if (this.oLO.oLA != null)
      this.oLO.a(this.oLO.oLA, paramInt1, paramInt2);
    if (this.oLO.oLD != null)
    {
      this.oLO.oLD.aE(false);
      this.oLO.oLD.stop();
    }
    this.oLO.oKe = false;
    this.oLO.awA.removeMessages(100);
    a locala = this.oLO;
    locala.bqQ += 1;
    if (this.oLO.bqQ == 1)
      a.a(this.oLO, this.oLO.oLA, paramInt1, paramInt2);
    AppMethodBeat.o(137489);
  }

  public final void zE(int paramInt)
  {
    AppMethodBeat.i(137488);
    ab.i("MicroMsg.Music.ExoMusicPlayer", "onBufferingUpdate, percent:%d", new Object[] { Integer.valueOf(paramInt) });
    AppMethodBeat.o(137488);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.music.d.a.c
 * JD-Core Version:    0.6.2
 */