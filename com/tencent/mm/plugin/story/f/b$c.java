package com.tencent.mm.plugin.story.f;

import a.l;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.p;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.story.model.a.f;
import com.tencent.mm.plugin.story.model.j.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"<anonymous>", "", "run"})
final class b$c
  implements Runnable
{
  b$c(b paramb)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(109502);
    Object localObject = b.rYk;
    ab.i(b.access$getTAG$cp(), "loadFpData username=" + b.a(this.rYl) + " maxId=" + b.d(this.rYl));
    localObject = g.RO();
    a.f.b.j.o(localObject, "MMKernel.network()");
    p localp = ((com.tencent.mm.kernel.b)localObject).Rg();
    String str1 = b.a(this.rYl);
    long l = b.d(this.rYl);
    String str2 = b.a(this.rYl);
    localObject = com.tencent.mm.plugin.story.model.j.rST;
    localp.d((m)new f(str1, l, bo.isEqual(str2, j.a.cnk())));
    AppMethodBeat.o(109502);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.story.f.b.c
 * JD-Core Version:    0.6.2
 */