package com.tencent.mm.modelvideo;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.f;
import com.tencent.mm.sdk.platformtools.ap.a;

final class g$2
  implements ap.a
{
  g$2(g paramg)
  {
  }

  public final boolean BI()
  {
    AppMethodBeat.i(50696);
    if (this.fVM.a(g.o(this.fVM), g.f(this.fVM)) == -1)
    {
      g.a(this.fVM, 0 - (com.tencent.mm.compatible.util.g.getLine() + 10000));
      g.f(this.fVM).onSceneEnd(3, -1, "doScene failed", this.fVM);
    }
    AppMethodBeat.o(50696);
    return false;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelvideo.g.2
 * JD-Core Version:    0.6.2
 */