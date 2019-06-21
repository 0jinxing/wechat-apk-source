package com.tencent.mm.plugin.music.f;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.music.c.a;
import com.tencent.mm.plugin.music.e.k;
import com.tencent.mm.plugin.music.f.a.d.a;
import com.tencent.mm.plugin.music.f.a.f;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.at;

final class d$1
  implements f
{
  long oNE;

  d$1(d paramd)
  {
  }

  public final void I(com.tencent.mm.aw.e parame)
  {
    AppMethodBeat.i(137579);
    com.tencent.mm.aw.e locale = k.bUf().bTQ();
    if (locale == null)
    {
      AppMethodBeat.o(137579);
      return;
    }
    int i;
    int j;
    float f1;
    float f2;
    label175: label237: int k;
    if ((locale.e(parame)) && (this.oNF.oNA != null) && (this.oNF.oNA.isPlaying()))
    {
      i = this.oNF.oNA.bUA();
      j = this.oNF.oNA.getDuration();
      if ((i > 0) && (j > 0))
      {
        f1 = i / j;
        if (this.oNF.oNh != null)
        {
          parame = this.oNF.oNh;
          parame.oLv = f1;
          boolean bool = at.isNetworkConnected(ah.getContext());
          if ((parame.isStop) && (bool))
          {
            if (!parame.mgU)
              break label368;
            if (parame.oLu.oLr != 0L)
            {
              f2 = (float)parame.oLu.oLp / (float)parame.oLu.oLr;
              if ((f2 < 1.0F) && (f2 - f1 <= 0.15F) && (bool))
              {
                ab.v("MicroMsg.Music.MusicDownloadTask", "playPercent=%.2f downloadPercent=%.2f isConnectNetwork=%b", new Object[] { Float.valueOf(f1), Float.valueOf(f2), Boolean.valueOf(bool) });
                parame.start();
              }
            }
          }
          if ((this.oNF.oNh != null) && (this.oNF.oNh.isStop))
          {
            parame = this.oNF.oNh;
            if (!parame.mgU)
              break label402;
            if (parame.oLu.oLr == 0L)
              break label453;
            f2 = (float)parame.oLu.oLp / (float)parame.oLu.oLr;
            label306: if (f2 < 1.0F)
              break label436;
            k = 1;
          }
        }
      }
    }
    while (true)
    {
      if (k == 0)
      {
        ab.i("MicroMsg.Music.MusicPlayer", "download percent not enough can not play");
        this.oNF.stopPlay();
      }
      if (this.oNF.oKa != null)
        this.oNF.oKa.dN(i, j);
      AppMethodBeat.o(137579);
      break;
      label368: if (parame.oLu.oLo == 0L)
        break label237;
      f2 = (float)parame.oLu.oLn / (float)parame.oLu.oLo;
      break label175;
      if (parame.oLu.oLo != 0L)
      {
        f2 = (float)parame.oLu.oLn / (float)parame.oLu.oLo;
        break label306;
        if (f2 - f1 > 0.05F)
        {
          k = 1;
          continue;
        }
      }
      label402: label436: label453: k = 0;
    }
  }

  public final void b(com.tencent.mm.aw.e parame, boolean paramBoolean)
  {
    AppMethodBeat.i(137580);
    ab.i("MicroMsg.Music.MusicPlayer", "setEvents, onStop");
    com.tencent.mm.aw.e locale = k.bUf().bTQ();
    if (locale == null)
      AppMethodBeat.o(137580);
    while (true)
    {
      return;
      if (locale.e(parame))
        this.oNF.stopPlay();
      this.oNF.D(this.oNF.oLA);
      if (paramBoolean)
        this.oNF.G(this.oNF.oLA);
      AppMethodBeat.o(137580);
    }
  }

  public final void c(com.tencent.mm.aw.e parame, boolean paramBoolean)
  {
    AppMethodBeat.i(137581);
    com.tencent.mm.aw.e locale = k.bUf().bTQ();
    if (locale == null)
      AppMethodBeat.o(137581);
    while (true)
    {
      return;
      ab.i("MicroMsg.Music.MusicPlayer", "onError, needRetry:%b", new Object[] { Boolean.valueOf(paramBoolean) });
      if (paramBoolean)
        d.a(this.oNF, parame, 20);
      while (true)
        if (locale.e(parame))
        {
          ab.i("MicroMsg.Music.MusicPlayer", "stop");
          this.oNF.stopPlay();
          if (paramBoolean)
          {
            ab.i("MicroMsg.Music.MusicPlayer", "retry system media player again");
            this.oNF.a(locale, true);
            this.oNF.oNh = new com.tencent.mm.plugin.music.c.b(parame, com.tencent.mm.plugin.music.cache.e.SU(parame.fJU));
            this.oNF.oNh.oLy = this.oNF.oND;
            this.oNF.oNh.start();
            if (this.oNF.oNt == null)
              break label249;
            this.oNF.oNt.a(this.oNF.oNh);
            AppMethodBeat.o(137581);
            break;
            d.a(this.oNF, parame, 21);
            continue;
          }
          al.d(new d.1.1(this));
          this.oNF.D(this.oNF.oLA);
          AppMethodBeat.o(137581);
          break;
        }
      ab.i("MicroMsg.Music.MusicPlayer", "send stop event");
      this.oNF.D(this.oNF.oLA);
      label249: AppMethodBeat.o(137581);
    }
  }

  public final void k(com.tencent.mm.aw.e parame)
  {
    AppMethodBeat.i(137578);
    ab.i("MicroMsg.Music.MusicPlayer", "setEvents, onStart");
    this.oNF.A(parame);
    AppMethodBeat.o(137578);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.music.f.d.1
 * JD-Core Version:    0.6.2
 */