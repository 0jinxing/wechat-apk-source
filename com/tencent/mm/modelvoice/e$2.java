package com.tencent.mm.modelvoice;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.f;
import com.tencent.mm.sdk.platformtools.ap.a;

final class e$2
  implements ap.a
{
  e$2(e parame)
  {
  }

  public final boolean BI()
  {
    AppMethodBeat.i(116566);
    if (this.fZd.a(e.a(this.fZd), e.b(this.fZd)) == -1)
      e.b(this.fZd).onSceneEnd(3, -1, "doScene failed", this.fZd);
    AppMethodBeat.o(116566);
    return false;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelvoice.e.2
 * JD-Core Version:    0.6.2
 */