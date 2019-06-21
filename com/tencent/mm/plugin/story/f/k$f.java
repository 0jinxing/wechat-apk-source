package com.tencent.mm.plugin.story.f;

import a.l;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.ArrayList;
import java.util.LinkedList;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"<anonymous>", "", "run"})
final class k$f
  implements Runnable
{
  k$f(k paramk, int paramInt)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(109647);
    if (((g)k.h(this.saa).get(this.rZg)).rZv != 2)
      k.i(this.saa).add(Integer.valueOf(this.rZg));
    int i = this.rZg + 1;
    if (i < k.d(this.saa).size())
    {
      k.i(this.saa).add(Integer.valueOf(i));
      k.j(this.saa);
    }
    AppMethodBeat.o(109647);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.story.f.k.f
 * JD-Core Version:    0.6.2
 */