package com.tencent.mm.plugin.story.f;

import a.f.a.a;
import a.l;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.story.e.b.a;
import com.tencent.mm.plugin.story.h.h;
import com.tencent.mm.plugin.story.h.i;
import com.tencent.mm.plugin.story.h.k;
import com.tencent.mm.plugin.story.model.j.a;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"<anonymous>", "", "run"})
final class b$b
  implements Runnable
{
  b$b(b paramb)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(109499);
    ArrayList localArrayList1 = new ArrayList();
    Object localObject1 = com.tencent.mm.plugin.story.model.j.rST;
    localObject1 = k.a(j.a.cxT(), b.a(this.rYl), b.b(this.rYl));
    if (!((List)localObject1).isEmpty())
      b.a(this.rYl, ((com.tencent.mm.plugin.story.h.j)a.a.j.fL((List)localObject1)).field_storyID);
    ArrayList localArrayList2 = new ArrayList();
    Iterator localIterator = ((Iterable)localObject1).iterator();
    if (localIterator.hasNext())
    {
      com.tencent.mm.plugin.story.h.j localj = (com.tencent.mm.plugin.story.h.j)localIterator.next();
      localObject1 = com.tencent.mm.plugin.story.model.j.rST;
      Object localObject2 = j.a.cxZ();
      localObject1 = com.tencent.mm.plugin.story.e.b.rRO;
      localObject2 = ((i)localObject2).aaZ(b.a.j(Integer.valueOf(localj.field_createTime)));
      localObject1 = b.rYk;
      String str = b.access$getTAG$cp();
      StringBuilder localStringBuilder = new StringBuilder("loadDBData rawLocalId=").append((int)localj.xDa).append(" rawStoryId=").append(localj.field_storyID).append(" date=");
      if (localObject2 != null)
      {
        localObject1 = ((h)localObject2).cBQ();
        label194: localStringBuilder = localStringBuilder.append((String)localObject1).append(" count=");
        if (localObject2 == null)
          break label323;
      }
      label323: for (localObject1 = Integer.valueOf(((h)localObject2).field_count); ; localObject1 = null)
      {
        ab.d(str, localObject1);
        if (localObject2 == null)
          break;
        localObject1 = com.tencent.mm.plugin.story.model.j.rST;
        localj = j.a.cxT().Fe((int)localj.xDa);
        localObject1 = localj;
        if (localj == null)
          localObject1 = new com.tencent.mm.plugin.story.h.j();
        a.f.b.j.p(localObject1, "<set-?>");
        ((h)localObject2).rXz = ((com.tencent.mm.plugin.story.h.j)localObject1);
        if (localArrayList2.contains(((h)localObject2).cBQ()))
          break;
        localArrayList1.add(localObject2);
        localArrayList2.add(((h)localObject2).cBQ());
        break;
        localObject1 = null;
        break label194;
      }
    }
    localObject1 = b.rYk;
    ab.d(b.access$getTAG$cp(), "localCachedMinId=" + b.c(this.rYl) + " infos.size=" + localArrayList1.size() + " localMinId=" + b.b(this.rYl));
    com.tencent.mm.ab.b.a((a)new b.b.1(this, b.a(this.rYl, (List)localArrayList1)));
    AppMethodBeat.o(109499);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.story.f.b.b
 * JD-Core Version:    0.6.2
 */