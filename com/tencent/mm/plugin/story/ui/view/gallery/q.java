package com.tencent.mm.plugin.story.ui.view.gallery;

import a.l;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.story.g.b;
import com.tencent.mm.plugin.story.g.b.a;
import com.tencent.mm.plugin.story.g.b.b;
import com.tencent.mm.plugin.story.g.c;
import com.tencent.mm.plugin.story.h.f;
import com.tencent.mm.plugin.story.model.d.g;
import com.tencent.mm.plugin.story.model.d.g.a;
import com.tencent.mm.plugin.story.model.k;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/story/ui/view/gallery/StoryVideoViewMgrPreLoad;", "", "()V", "TAG", "", "pool", "", "Lcom/tencent/mm/plugin/story/ui/view/gallery/StoryVideoViewMgr;", "kotlin.jvm.PlatformType", "", "clean", "", "get", "preload", "", "username", "plugin-story_release"})
public final class q
{
  private static List<p> sru;
  public static final q srv;

  static
  {
    AppMethodBeat.i(111005);
    srv = new q();
    sru = Collections.synchronizedList((List)new LinkedList());
    AppMethodBeat.o(111005);
  }

  public static boolean abg(String paramString)
  {
    AppMethodBeat.i(111002);
    a.f.b.j.p(paramString, "username");
    ab.i("MicroMsg.StoryVideoViewMgrPreLoad", "preLoad " + paramString + " pool " + sru.size());
    Object localObject1;
    boolean bool;
    if (sru.size() > 0)
    {
      localObject1 = k.rTc;
      localObject1 = k.aap(paramString);
      if (((f)localObject1).isValid())
      {
        paramString = g.rWe;
        paramString = g.a.a((f)localObject1);
        localObject1 = sru;
        a.f.b.j.o(localObject1, "pool");
        localObject1 = (p)a.a.j.fK((List)localObject1);
        if (localObject1 != null)
          ((p)localObject1).o(paramString.rVZ);
      }
      AppMethodBeat.o(111002);
      bool = false;
    }
    while (true)
    {
      return bool;
      localObject1 = k.rTc;
      paramString = k.aap(paramString);
      localObject1 = c.sbQ;
      c.lj(paramString.field_syncId);
      localObject1 = b.sbw;
      b.lj(paramString.field_syncId);
      if (paramString.cBL() > 0L)
      {
        localObject1 = b.sbw;
        b.czQ();
      }
      if (paramString.isValid())
      {
        localObject1 = g.rWe;
        localObject1 = g.a.a(paramString);
        Object localObject2 = b.sbw;
        a.f.b.j.p(localObject1, "galleryItem");
        a.f.b.j.p(paramString, "extinfo");
        b.sbn = (g)localObject1;
        b.sbj = new b.a(paramString.getUserName(), b.b.sbE);
        if (paramString.cBL() > 0L)
        {
          b.l(b.lhy, 4L, 1L);
          localObject2 = b.sbj;
          if (localObject2 != null)
          {
            ((b.a)localObject2).koC = false;
            ((b.a)localObject2).sbB = bo.anU();
          }
        }
        while (true)
        {
          if (((g)localObject1).rVZ != null)
          {
            if (paramString.cBN())
            {
              b.l(b.lhy, 140L, 1L);
              if (paramString.cBL() > 0L)
                b.l(b.lhy, 142L, 1L);
            }
            if (b.c(((g)localObject1).rVZ) == 1)
            {
              b.l(b.lhy, 5L, 1L);
              if (paramString.cBN())
                b.l(b.lhy, 141L, 1L);
            }
          }
          localObject2 = new p();
          if (((p)localObject2).sqW == null)
          {
            paramString = ah.getContext();
            a.f.b.j.o(paramString, "MMApplicationContext.getContext()");
            ((p)localObject2).eX(paramString);
          }
          ((p)localObject2).setMute(true);
          ((p)localObject2).o(((g)localObject1).rVZ);
          ((p)localObject2).cDe();
          sru.add(localObject2);
          AppMethodBeat.o(111002);
          bool = true;
          break;
          localObject2 = b.sbj;
          if (localObject2 != null)
          {
            ((b.a)localObject2).koC = true;
            ((b.a)localObject2).sbB = bo.anU();
          }
        }
      }
      AppMethodBeat.o(111002);
      bool = false;
    }
  }

  public static p cDg()
  {
    AppMethodBeat.i(111003);
    ab.i("MicroMsg.StoryVideoViewMgrPreLoad", "StoryVideoViewMgrPreLoad get " + sru.size());
    Object localObject = sru;
    a.f.b.j.o(localObject, "pool");
    localObject = (p)a.a.j.fK((List)localObject);
    if (localObject != null)
      sru.remove(localObject);
    AppMethodBeat.o(111003);
    return localObject;
  }

  public static void clean()
  {
    AppMethodBeat.i(111004);
    ab.i("MicroMsg.StoryVideoViewMgrPreLoad", "StoryVideoViewMgrPreLoad clean " + sru.size());
    Object localObject = sru;
    a.f.b.j.o(localObject, "pool");
    Iterator localIterator = ((Iterable)localObject).iterator();
    while (localIterator.hasNext())
    {
      localObject = ((p)localIterator.next()).sqW;
      if (localObject != null)
        ((StoryVideoView)localObject).stop();
    }
    sru.clear();
    AppMethodBeat.o(111004);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.story.ui.view.gallery.q
 * JD-Core Version:    0.6.2
 */