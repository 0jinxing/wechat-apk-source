package com.tencent.mm.audio.b;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.modelvoice.m;
import com.tencent.mm.modelvoice.q;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ap.a;

final class h$1
  implements ap.a
{
  h$1(h paramh)
  {
  }

  public final boolean BI()
  {
    AppMethodBeat.i(116495);
    q.a(h.a(this.cqN), this.cqN);
    m.amc().run();
    ab.d("MicroMsg.SceneVoice.Recorder", "Start Send fileName :" + h.a(this.cqN));
    AppMethodBeat.o(116495);
    return false;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.audio.b.h.1
 * JD-Core Version:    0.6.2
 */