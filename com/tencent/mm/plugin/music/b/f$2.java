package com.tencent.mm.plugin.music.b;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.Iterator;
import java.util.LinkedList;

final class f$2
  implements Runnable
{
  f$2(f paramf)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(137271);
    ab.i("MicroMsg.Audio.AudioPlayerMgr", "stopAudioDelayRunnable, run");
    Iterator localIterator = this.oJW.oJz.iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      if (this.oJW.SA(str) == 0)
        this.oJW.SC(str);
    }
    AppMethodBeat.o(137271);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.music.b.f.2
 * JD-Core Version:    0.6.2
 */