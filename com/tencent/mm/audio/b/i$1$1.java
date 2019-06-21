package com.tencent.mm.audio.b;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class i$1$1
  implements Runnable
{
  i$1$1(i.1 param1)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(116516);
    ab.i("MicroMsg.SceneVoiceService", "onSceneEnd fin and try run");
    this.crf.cre.run();
    AppMethodBeat.o(116516);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.audio.b.i.1.1
 * JD-Core Version:    0.6.2
 */