package com.tencent.mm.plugin.story.model;

import a.f.b.j;
import a.l;
import a.y;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.story.api.c;
import com.tencent.mm.sdk.platformtools.ab;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"<anonymous>", "", "run"})
final class b$a
  implements Runnable
{
  public static final a rSb;

  static
  {
    AppMethodBeat.i(109002);
    rSb = new a();
    AppMethodBeat.o(109002);
  }

  public final void run()
  {
    AppMethodBeat.i(109001);
    Object localObject1 = b.rSa;
    if (b.cxu())
      AppMethodBeat.o(109001);
    while (true)
    {
      return;
      localObject1 = b.rSa;
      b.lw(true);
      localObject1 = b.rSa;
      b.cxv().clear();
      localObject1 = new ArrayList();
      ??? = new ArrayList();
      ??? = b.rSa;
      ??? = b.cxw();
      j.o(???, "mFavourUserList");
      int i;
      Object localObject8;
      while (true)
      {
        synchronized ((Iterable)???)
        {
          localObject7 = ((Iterable)???).iterator();
          i = 0;
          if (!((Iterator)localObject7).hasNext())
            break;
          localObject8 = (String)((Iterator)localObject7).next();
          localObject9 = f.rSp;
          if (f.a.isStoryUnread((String)localObject8))
          {
            localObject9 = b.rSa;
            ab.d(b.cxx(), "%s has new story", new Object[] { localObject8 });
            i |= 1;
            ((ArrayList)???).add(localObject8);
          }
        }
        Object localObject9 = b.rSa;
        j.o(localObject8, "username");
        int j = i;
        if (b.aal((String)localObject8))
        {
          localObject9 = b.rSa;
          ab.d(b.cxx(), "%s has story", new Object[] { localObject8 });
          j = i | 0x2;
          localObject2.add(localObject8);
        }
        i = j;
      }
      Object localObject7 = y.AUy;
      ??? = b.rSa;
      if (b.cxy() != i)
      {
        ??? = b.rSa;
        b.EJ(i);
      }
      ??? = b.rSa;
      b.cxv().addAll((Collection)???);
      ??? = b.rSa;
      b.cxv().addAll((Collection)localObject2);
      ArrayList localArrayList = new ArrayList();
      ??? = b.rSa;
      ??? = b.cxz();
      j.o(???, "mListeners");
      while (true)
      {
        synchronized ((Iterable)???)
        {
          ??? = ((Iterable)???).iterator();
          if (!((Iterator)???).hasNext())
            break;
          localObject7 = (WeakReference)((Iterator)???).next();
          if ((c)((WeakReference)localObject7).get() == null)
            localArrayList.add(localObject7);
        }
        localObject7 = (c)((WeakReference)localObject7).get();
        if (localObject7 != null)
        {
          localObject8 = b.rSa;
          ((c)localObject7).EH(b.cxy());
        }
      }
      ??? = y.AUy;
      ??? = b.rSa;
      b.cxz().removeAll((Collection)localObject3);
      Object localObject4 = b.rSa;
      b.lw(false);
      localObject4 = b.rSa;
      localObject4 = b.cxx();
      ??? = b.rSa;
      ab.i((String)localObject4, "checkStoryStatus:%s nowState:%s", new Object[] { Integer.valueOf(b.cxy()), Integer.valueOf(i) });
      AppMethodBeat.o(109001);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.story.model.b.a
 * JD-Core Version:    0.6.2
 */