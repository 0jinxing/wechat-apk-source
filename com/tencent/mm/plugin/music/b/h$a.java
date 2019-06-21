package com.tencent.mm.plugin.music.b;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class h$a
  implements Runnable
{
  boolean isStop = true;

  private h$a(h paramh)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(137363);
    ab.i("MicroMsg.Audio.QQAudioPlayer", "start run play progress task");
    while (true)
      if (!this.isStop)
        try
        {
          if ((this.oKo.oKc != null) && (this.oKo.aie()))
            this.oKo.bTk();
          try
          {
            Thread.sleep(200L);
          }
          catch (InterruptedException localInterruptedException)
          {
          }
        }
        catch (Exception localException)
        {
          while (true)
            ab.e("MicroMsg.Audio.QQAudioPlayer", "PlayProgressTask run exception:" + localException.getMessage());
        }
    AppMethodBeat.o(137363);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.music.b.h.a
 * JD-Core Version:    0.6.2
 */