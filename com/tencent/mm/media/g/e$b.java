package com.tencent.mm.media.g;

import a.l;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.media.i.c;
import com.tencent.mm.sdk.platformtools.ab;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"<anonymous>", "", "run"})
final class e$b
  implements Runnable
{
  e$b(e parame)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(13042);
    ab.i(e.a(this.eYt), "delay check frameDraw: " + e.f(this.eYt));
    if (!e.f(this.eYt))
    {
      ab.e(e.a(this.eYt), "after " + e.Vb() + " ms, first frame stil not draw!!!");
      c localc = c.faj;
      c.Wd();
    }
    AppMethodBeat.o(13042);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.media.g.e.b
 * JD-Core Version:    0.6.2
 */