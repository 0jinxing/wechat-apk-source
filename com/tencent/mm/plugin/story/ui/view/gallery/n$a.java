package com.tencent.mm.plugin.story.ui.view.gallery;

import a.a.j;
import a.f.a.a;
import a.l;
import a.o;
import a.y;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.story.model.d.g;
import com.tencent.mm.plugin.story.model.d.i;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/story/ui/view/gallery/StoryVideoPreloadMgr$GroupData;", "", "groupItems", "", "Lcom/tencent/mm/plugin/story/model/gallery/StoryGalleryItem;", "positionV", "", "positionH", "lastGroup", "skipPosition", "", "(Ljava/util/List;IILcom/tencent/mm/plugin/story/ui/view/gallery/StoryVideoPreloadMgr$GroupData;Z)V", "MAX_PRELOAD_COUNT", "horizontalList", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "produceList", "Lkotlin/Function0;", "Lkotlin/Pair;", "Lcom/tencent/mm/plugin/story/model/gallery/StoryVideoItem;", "Lcom/tencent/mm/plugin/story/ui/view/gallery/StoryVideoPreloadMgr$TaskInfo;", "verticalList", "walkHorizontal", "walkIndex", "walkVertical", "info", "", "isDataChange", "isSame", "galleryItems", "produce", "produceHorizontalVideoItem", "produceVerticalVideoItem", "produceVideoItem", "reset", "", "resetWalk", "Companion", "plugin-story_release"})
public final class n$a
{
  static final String TAG = "MicroMsg.GroupData.StoryVideoPreloadMgr";
  public static final n.a.a squ;
  private final int sqj;
  int sqk;
  int sqm;
  private int sqn;
  private ArrayList<g> sqo;
  private ArrayList<g> sqp;
  List<? extends a<o<i, n.c>>> sqq;
  int sqr;
  int sqs;
  private final boolean sqt;

  static
  {
    AppMethodBeat.i(110872);
    squ = new n.a.a((byte)0);
    TAG = "MicroMsg.GroupData.StoryVideoPreloadMgr";
    AppMethodBeat.o(110872);
  }

  public n$a(List<? extends List<g>> arg1, int paramInt1, int paramInt2, a arg4)
  {
    AppMethodBeat.i(110871);
    this.sqr = paramInt1;
    this.sqs = paramInt2;
    this.sqt = true;
    this.sqj = 15;
    this.sqo = new ArrayList();
    this.sqp = new ArrayList();
    this.sqq = j.listOf(new a[] { (a)new n.a.b(this), (a)new n.a.c(this), (a)new n.a.d(this) });
    if (((??? != null) && (this.sqr != ???.sqr)) || ((??? != null) && (this.sqs != ???.sqs)) || (dL(???)))
      reset();
    this.sqo.clear();
    this.sqp.clear();
    while (true)
    {
      synchronized ((Iterable)???)
      {
        localObject = ???.iterator();
        if (!((Iterator)localObject).hasNext())
          break;
        List localList = (List)((Iterator)localObject).next();
        if (!((Collection)localList).isEmpty())
        {
          paramInt1 = 1;
          if (paramInt1 == 0)
            continue;
          this.sqp.add(localList.get(0));
        }
      }
      paramInt1 = 0;
    }
    Object localObject = y.AUy;
    if (this.sqr < ???.size())
    {
      synchronized ((Iterable)???.get(this.sqr))
      {
        ??? = ???.iterator();
        if (???.hasNext())
        {
          localObject = (g)???.next();
          this.sqo.add(localObject);
        }
      }
      ??? = y.AUy;
      AppMethodBeat.o(110871);
    }
    while (true)
    {
      return;
      AppMethodBeat.o(110871);
    }
  }

  private final o<i, n.c> cCX()
  {
    AppMethodBeat.i(110869);
    while (true)
    {
      if (this.sqt)
        this.sqk += 1;
      Object localObject1;
      if (this.sqk >= this.sqp.size())
      {
        AppMethodBeat.o(110869);
        localObject1 = null;
        return localObject1;
      }
      try
      {
        if (this.sqp.size() > 0)
        {
          localObject1 = ((g)this.sqp.get(this.sqk)).rVZ;
          Object localObject3 = n.sqi;
          if (n.l((i)localObject1));
          while (true)
          {
            if (localObject1 == null)
              break label142;
            localObject3 = new com/tencent/mm/plugin/story/ui/view/gallery/n$c;
            ((n.c)localObject3).<init>(this.sqk, 0, (i)localObject1);
            localObject1 = new o(localObject1, localObject3);
            if (!this.sqt)
              this.sqk += 1;
            AppMethodBeat.o(110869);
            break;
            localObject1 = null;
          }
        }
        label142: if (this.sqt)
          continue;
        this.sqk += 1;
      }
      finally
      {
        if (!this.sqt)
          this.sqk += 1;
        AppMethodBeat.o(110869);
      }
    }
  }

  private final o<i, n.c> cCY()
  {
    AppMethodBeat.i(110870);
    while (true)
    {
      if (this.sqt)
        this.sqm += 1;
      Object localObject1;
      if (this.sqm >= this.sqo.size())
      {
        AppMethodBeat.o(110870);
        localObject1 = null;
        return localObject1;
      }
      try
      {
        if (this.sqo.size() > this.sqm)
        {
          localObject1 = ((g)this.sqo.get(this.sqm)).rVZ;
          Object localObject3 = n.sqi;
          if (n.l((i)localObject1));
          while (true)
          {
            if (localObject1 == null)
              break label149;
            localObject3 = new com/tencent/mm/plugin/story/ui/view/gallery/n$c;
            ((n.c)localObject3).<init>(this.sqk, this.sqm, (i)localObject1);
            localObject1 = new o(localObject1, localObject3);
            if (!this.sqt)
              this.sqm += 1;
            AppMethodBeat.o(110870);
            break;
            localObject1 = null;
          }
        }
        label149: if (this.sqt)
          continue;
        this.sqm += 1;
      }
      finally
      {
        if (!this.sqt)
          this.sqm += 1;
        AppMethodBeat.o(110870);
      }
    }
  }

  private final void reset()
  {
    this.sqk = this.sqr;
    this.sqm = this.sqs;
    this.sqn = 0;
  }

  final o<i, n.c> cCV()
  {
    AppMethodBeat.i(110866);
    try
    {
      Object localObject1;
      if (this.sqn > this.sqj)
      {
        localObject1 = TAG;
        StringBuilder localStringBuilder = new java/lang/StringBuilder;
        localStringBuilder.<init>("stop preload now ");
        ab.i((String)localObject1, this.sqn);
        AppMethodBeat.o(110866);
        localObject1 = null;
      }
      while (true)
      {
        return localObject1;
        localObject1 = (o)((a)this.sqq.get(this.sqn % this.sqq.size())).invoke();
        this.sqn += 1;
        AppMethodBeat.o(110866);
      }
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.printErrStackTrace(TAG, (Throwable)localException, "error on produce", new Object[0]);
        AppMethodBeat.o(110866);
        Object localObject2 = null;
      }
    }
  }

  public final void cCW()
  {
    AppMethodBeat.i(110868);
    ab.i(TAG, "resetWalk");
    reset();
    AppMethodBeat.o(110868);
  }

  final boolean dL(List<? extends List<g>> paramList)
  {
    AppMethodBeat.i(110867);
    int j;
    boolean bool;
    if (paramList.size() == this.sqp.size())
    {
      int i = paramList.size();
      j = 0;
      if (j < i)
        if (((List)paramList.get(j)).isEmpty())
        {
          AppMethodBeat.o(110867);
          bool = true;
        }
    }
    while (true)
    {
      return bool;
      if (((g)this.sqp.get(j)).rVZ.cNE != ((g)((List)paramList.get(j)).get(0)).rVZ.cNE)
      {
        AppMethodBeat.o(110867);
        bool = true;
      }
      else
      {
        j++;
        break;
        AppMethodBeat.o(110867);
        bool = false;
        continue;
        AppMethodBeat.o(110867);
        bool = true;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.story.ui.view.gallery.n.a
 * JD-Core Version:    0.6.2
 */