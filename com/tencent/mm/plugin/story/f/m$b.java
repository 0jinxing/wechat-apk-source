package com.tencent.mm.plugin.story.f;

import a.f.a.a;
import a.f.b.u.c;
import a.l;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ab.b;
import com.tencent.mm.plugin.story.h.k;
import com.tencent.mm.plugin.story.model.j.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"<anonymous>", "", "run"})
final class m$b
  implements Runnable
{
  m$b(m paramm)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(138818);
    ArrayList localArrayList = new ArrayList();
    u.c localc = new u.c();
    Object localObject1 = com.tencent.mm.plugin.story.model.j.rST;
    k localk = j.a.cxT();
    Object localObject2 = m.a(this.sam);
    String str = m.a(this.sam);
    localObject1 = com.tencent.mm.plugin.story.model.j.rST;
    localc.AVE = k.a(localk, (String)localObject2, bo.isEqual(str, j.a.cnk()), m.b(this.sam));
    int i;
    if (!((Collection)localc.AVE).isEmpty())
    {
      i = 1;
      if (i == 0)
        break label222;
      m.a(this.sam, ((com.tencent.mm.plugin.story.h.j)a.a.j.fL((List)localc.AVE)).field_storyID);
    }
    while (true)
    {
      localObject1 = m.sal;
      ab.d(m.access$getTAG$cp(), "localCachedMinId=" + m.c(this.sam) + " infos.size=" + ((List)localc.AVE).size() + " localMinId=" + m.b(this.sam));
      b.a((a)new m.b.1(this, localc, localArrayList));
      AppMethodBeat.o(138818);
      return;
      i = 0;
      break;
      label222: localObject1 = com.tencent.mm.plugin.story.model.j.rST;
      localk = j.a.cxT();
      localObject1 = m.a(this.sam);
      str = m.a(this.sam);
      localObject2 = com.tencent.mm.plugin.story.model.j.rST;
      localArrayList.addAll((Collection)localk.bw((String)localObject1, bo.isEqual(str, j.a.cnk())));
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.story.f.m.b
 * JD-Core Version:    0.6.2
 */