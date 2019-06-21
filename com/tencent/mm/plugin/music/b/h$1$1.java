package com.tencent.mm.plugin.music.b;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class h$1$1
  implements Runnable
{
  h$1$1(h.1 param1, int paramInt)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(137347);
    ab.i("MicroMsg.Audio.QQAudioPlayer", "onSeekComplete, seekPosition:%d", new Object[] { Integer.valueOf(this.oKp) });
    if (this.oKq.oKo.startTime != 0)
    {
      ab.i("MicroMsg.Audio.QQAudioPlayer", "seek complete to startTime :%d", new Object[] { Integer.valueOf(this.oKq.oKo.startTime) });
      this.oKq.oKo.startTime = 0;
      h.1.a(this.oKq);
      AppMethodBeat.o(137347);
    }
    while (true)
    {
      return;
      h.1 local1 = this.oKq;
      ab.i("MicroMsg.Audio.QQAudioPlayer", "_onSeekComplete");
      local1.oKo.bSW();
      if (local1.oKo.aie())
      {
        ab.i("MicroMsg.Audio.QQAudioPlayer", "seek end, send play event!");
        local1.oKo.bST();
      }
      AppMethodBeat.o(137347);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.music.b.h.1.1
 * JD-Core Version:    0.6.2
 */