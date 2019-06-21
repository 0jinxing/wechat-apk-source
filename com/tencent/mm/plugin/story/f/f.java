package com.tencent.mm.plugin.story.f;

import a.l;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.b.a.ar;
import com.tencent.mm.plugin.story.api.m.a;
import com.tencent.mm.plugin.story.api.o;
import com.tencent.mm.plugin.story.model.d.a;
import com.tencent.mm.plugin.story.model.d.c;
import com.tencent.mm.plugin.story.model.j.a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/story/presenter/GalleryPresenterFactory;", "", "()V", "getPresenter", "Lcom/tencent/mm/plugin/story/presenter/IGalleryPresenter;", "dataSeed", "groupCallback", "Lcom/tencent/mm/plugin/story/presenter/GalleryGroupUpdateCallback;", "galleryType", "Lcom/tencent/mm/plugin/story/api/IStoryUIFactory$GalleryType;", "chatRoom", "", "isForSns", "", "plugin-story_release"})
public final class f
{
  public static final f rZu;

  static
  {
    AppMethodBeat.i(109577);
    rZu = new f();
    AppMethodBeat.o(109577);
  }

  public static h a(Object paramObject, e parame, m.a parama, String paramString, boolean paramBoolean)
  {
    AppMethodBeat.i(109576);
    a.f.b.j.p(parame, "groupCallback");
    a.f.b.j.p(parama, "galleryType");
    Object localObject;
    if ((paramObject instanceof o))
    {
      paramString = com.tencent.mm.plugin.story.model.d.e.a((o)paramObject);
      parama = (o)paramObject;
      a.f.b.j.p(parama, "dataSeed");
      if ((parama instanceof a))
      {
        parama = ((a)parama).rVV;
        localObject = com.tencent.mm.plugin.story.g.h.scu;
        com.tencent.mm.plugin.story.g.h.cAs().bR(paramString.size());
        if (!(paramObject instanceof c))
          break label125;
        paramObject = (h)new d(((c)paramObject).username, paramString, parame);
        AppMethodBeat.o(109576);
      }
    }
    while (true)
    {
      return paramObject;
      parama = (Map)new HashMap();
      break;
      label125: paramObject = (h)new i(paramString, null, parame, paramBoolean, parama);
      AppMethodBeat.o(109576);
      continue;
      if (a.a.j.listOf(new m.a[] { m.a.rQE, m.a.rQD }).contains(parama))
      {
        if (!(paramObject instanceof String))
          break label501;
        parama = com.tencent.mm.plugin.story.g.h.scu;
        com.tencent.mm.plugin.story.g.h.cAs().bR(1L);
        paramObject = (h)new j((String)paramObject, parame);
        AppMethodBeat.o(109576);
      }
      else if ((parama == m.a.rQG) || (parama == m.a.rQF))
      {
        if (!(paramObject instanceof String))
          break label501;
        parama = new ArrayList();
        parama.add(paramObject);
        paramObject = com.tencent.mm.plugin.story.g.h.scu;
        com.tencent.mm.plugin.story.g.h.cAs().bR(parama.size());
        paramObject = (h)new i((List)parama, paramString, parame, paramBoolean);
        AppMethodBeat.o(109576);
      }
      else if (parama == m.a.rQH)
      {
        parama = new ArrayList();
        if (!(paramObject instanceof Collection))
          break label501;
        localObject = ((Iterable)paramObject).iterator();
        while (((Iterator)localObject).hasNext())
        {
          paramObject = ((Iterator)localObject).next();
          if ((paramObject instanceof String))
            parama.add(paramObject);
        }
        paramObject = com.tencent.mm.plugin.story.g.h.scu;
        com.tencent.mm.plugin.story.g.h.cAs().bR(parama.size());
        paramObject = (h)new i((List)parama, paramString, parame, paramBoolean);
        AppMethodBeat.o(109576);
      }
      else
      {
        if (parama != m.a.rQI)
          break label501;
        parama = new ArrayList();
        if (!(paramObject instanceof Collection))
          break label501;
        paramObject = ((Iterable)paramObject).iterator();
        while (paramObject.hasNext())
        {
          paramString = paramObject.next();
          if ((paramString instanceof String))
            parama.add(paramString);
        }
        paramObject = com.tencent.mm.plugin.story.model.j.rST;
        paramObject = (h)new k(j.a.cnk(), parama, parame);
        AppMethodBeat.o(109576);
      }
    }
    label501: paramObject = (Throwable)new RuntimeException("Cannot handler dataSeed ".concat(String.valueOf(paramObject)));
    AppMethodBeat.o(109576);
    throw paramObject;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.story.f.f
 * JD-Core Version:    0.6.2
 */