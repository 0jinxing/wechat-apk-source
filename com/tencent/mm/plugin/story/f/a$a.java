package com.tencent.mm.plugin.story.f;

import a.f.b.u.c;
import a.l;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ab.b;
import com.tencent.mm.plugin.story.h.k;
import com.tencent.mm.plugin.story.model.j.a;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.List;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"<anonymous>", "", "run"})
final class a$a
  implements Runnable
{
  a$a(a parama)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(109486);
    u.c localc = new u.c();
    j.a locala = com.tencent.mm.plugin.story.model.j.rST;
    localc.AVE = k.a(j.a.cxT(), this.rYe.rYb);
    if (!((List)localc.AVE).isEmpty())
      this.rYe.rYa = ((com.tencent.mm.plugin.story.h.j)a.a.j.fL((List)localc.AVE)).field_storyID;
    ab.d(this.rYe.TAG, "localCachedMinId=" + this.rYe.rYa + " infos.size=" + ((List)localc.AVE).size() + " localMinId=" + this.rYe.rYb);
    b.a((a.f.a.a)new a.a.1(this, localc));
    AppMethodBeat.o(109486);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.story.f.a.a
 * JD-Core Version:    0.6.2
 */