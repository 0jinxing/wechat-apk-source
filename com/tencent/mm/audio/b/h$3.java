package com.tencent.mm.audio.b;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.j.a;
import com.tencent.mm.compatible.util.b;
import com.tencent.mm.modelvoice.q;
import com.tencent.mm.sdk.platformtools.ab;

final class h$3
  implements j.a
{
  h$3(h paramh)
  {
  }

  public final void onError()
  {
    AppMethodBeat.i(116497);
    h.i(this.cqN).Mm();
    ab.e("MicroMsg.SceneVoice.Recorder", "Record Failed file:" + h.a(this.cqN));
    q.uS(h.a(this.cqN));
    if (this.cqN.cqJ != null)
      this.cqN.cqJ.onError();
    AppMethodBeat.o(116497);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.audio.b.h.3
 * JD-Core Version:    0.6.2
 */