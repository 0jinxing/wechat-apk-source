package com.tencent.mm.audio.b;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class h$2
  implements Runnable
{
  h$2(h paramh)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(116496);
    if (!h.k(this.cqN))
    {
      ab.d("MicroMsg.SceneVoice.Recorder", "after start bluetooth, timeout to directly start record");
      h.l(this.cqN);
      AppMethodBeat.o(116496);
    }
    while (true)
    {
      return;
      ab.e("MicroMsg.SceneVoice.Recorder", "mHasBeginRec is true");
      AppMethodBeat.o(116496);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.audio.b.h.2
 * JD-Core Version:    0.6.2
 */