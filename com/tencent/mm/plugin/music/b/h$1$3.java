package com.tencent.mm.plugin.music.b;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class h$1$3
  implements Runnable
{
  h$1$3(h.1 param1, int paramInt)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(137349);
    String str = this.oKq.oKo.ckD;
    ab.i("MicroMsg.Audio.QQAudioPlayer", "onStateChanged state %d, %s", new Object[] { Integer.valueOf(this.nx), str });
    if (this.nx == 3)
    {
      ab.i("MicroMsg.Audio.QQAudioPlayer", "onStateChanged PREPARING!");
      h.1.b(this.oKq);
      this.oKq.oKo.oKl = System.currentTimeMillis();
      AppMethodBeat.o(137349);
    }
    while (true)
    {
      return;
      if (this.nx == 2)
      {
        ab.i("MicroMsg.Audio.QQAudioPlayer", "onStateChanged PREPARED!");
        ab.i("MicroMsg.Audio.QQAudioPlayer", "preparing cost time :%d!", new Object[] { Long.valueOf(System.currentTimeMillis() - this.oKq.oKo.oKl) });
        h.1.a(this.oKq);
        AppMethodBeat.o(137349);
      }
      else if (this.nx == 4)
      {
        ab.i("MicroMsg.Audio.QQAudioPlayer", "onStateChanged STARTED!");
        ab.i("MicroMsg.Audio.QQAudioPlayer", "start cost time :%d!", new Object[] { Long.valueOf(System.currentTimeMillis() - this.oKq.oKo.oKl) });
        h.1.c(this.oKq);
        AppMethodBeat.o(137349);
      }
      else if (this.nx == 5)
      {
        ab.i("MicroMsg.Audio.QQAudioPlayer", "onStateChanged PAUSED!");
        h.1.d(this.oKq);
        AppMethodBeat.o(137349);
      }
      else if (this.nx == 6)
      {
        ab.i("MicroMsg.Audio.QQAudioPlayer", "onStateChanged STOPPED!");
        h.1.e(this.oKq);
        AppMethodBeat.o(137349);
      }
      else if (this.nx == 7)
      {
        ab.i("MicroMsg.Audio.QQAudioPlayer", "onStateChanged PLAYBACKCOMPLETED!");
        h.1.f(this.oKq);
        AppMethodBeat.o(137349);
      }
      else if (this.nx == 8)
      {
        ab.i("MicroMsg.Audio.QQAudioPlayer", "onStateChanged END!");
        h.1.bTl();
        AppMethodBeat.o(137349);
      }
      else
      {
        if (this.nx == 9)
          ab.i("MicroMsg.Audio.QQAudioPlayer", "onStateChanged ERROR!");
        AppMethodBeat.o(137349);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.music.b.h.1.3
 * JD-Core Version:    0.6.2
 */