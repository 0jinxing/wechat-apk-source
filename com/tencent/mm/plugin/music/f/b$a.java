package com.tencent.mm.plugin.music.f;

import android.media.MediaPlayer;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class b$a
  implements Runnable
{
  boolean isStop = true;

  private b$a(b paramb)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(137552);
    ab.i("MicroMsg.Music.MMMediaPlayer", "start run play progress task");
    while (true)
      if (!this.isStop)
        try
        {
          if ((this.oNx.gaq != null) && (this.oNx.gaq.isPlaying()))
          {
            int i = this.oNx.gaq.getCurrentPosition();
            int j = this.oNx.gaq.getDuration();
            if ((i > 0) && (j > 0))
            {
              i = i * 100 / j;
              this.oNx.zR(i);
            }
          }
          try
          {
            Thread.sleep(200L);
          }
          catch (InterruptedException localInterruptedException)
          {
            ab.printErrStackTrace("MicroMsg.Music.MMMediaPlayer", localInterruptedException, "sleep", new Object[0]);
          }
        }
        catch (Exception localException)
        {
          while (true)
            ab.printErrStackTrace("MicroMsg.Music.MMMediaPlayer", localException, "onPlayUpdate", new Object[0]);
        }
    AppMethodBeat.o(137552);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.music.f.b.a
 * JD-Core Version:    0.6.2
 */