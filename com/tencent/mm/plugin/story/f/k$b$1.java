package com.tencent.mm.plugin.story.f;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.story.model.d.g;
import com.tencent.mm.plugin.story.model.d.i;
import com.tencent.mm.plugin.story.model.n;
import com.tencent.mm.plugin.story.model.n.a;
import com.tencent.mm.sdk.platformtools.ab;

@a.l(dWo={1, 1, 13}, dWp={""}, dWq={"<anonymous>", "", "run"})
final class k$b$1
  implements Runnable
{
  k$b$1(k.b paramb, g paramg)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(109642);
    ab.i(k.f(this.sab.saa), "LogStory: deleteItem fake " + this.rZj);
    Object localObject = n.rTi;
    n.a.EL(this.rZj.rVZ.cNE);
    localObject = l.sac;
    l.li(this.rZj.rVZ.timeStamp);
    localObject = l.sac;
    localObject = l.sac;
    l.b(l.lh(this.rZj.rVZ.timeStamp));
    AppMethodBeat.o(109642);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.story.f.k.b.1
 * JD-Core Version:    0.6.2
 */