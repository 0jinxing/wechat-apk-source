package com.tencent.mm.plugin.story.f;

import a.y;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.p;
import com.tencent.mm.plugin.story.model.j.a;
import com.tencent.mm.plugin.story.model.n.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

@a.l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/story/presenter/SelfHistoryGalleryPresenter;", "Lcom/tencent/mm/modelbase/IOnSceneEnd;", "Lcom/tencent/mm/plugin/story/presenter/IGalleryPresenter;", "username", "", "dateList", "Ljava/util/ArrayList;", "galleryUserCallback", "Lcom/tencent/mm/plugin/story/presenter/GalleryGroupUpdateCallback;", "(Ljava/lang/String;Ljava/util/ArrayList;Lcom/tencent/mm/plugin/story/presenter/GalleryGroupUpdateCallback;)V", "TAG", "dateGalleryMap", "Lcom/tencent/mm/plugin/story/model/gallery/StoryGalleryItem;", "dateState", "Lcom/tencent/mm/plugin/story/presenter/GalleryUserState;", "deleteColumnIndex", "", "deleteRowIndex", "isLoadNetScene", "", "loadingIndexQueue", "Ljava/util/LinkedList;", "preloadLocalCount", "preloadRemoteCount", "selectedCol", "selectedRow", "cancelDeleteItem", "", "row", "column", "checkLoadMore", "deleteItem", "destroy", "getStoryCountByDate", "date", "initExpectPosition", "expectPos", "initLoad", "loadMore", "loadNextQueuedUser", "loadStoryByDate", "notifyDateUpdate", "userGalleryItems", "", "onGalleryState", "state", "onItemRemovedCallback", "isOk", "onSceneEnd", "errType", "errCode", "errMsg", "scene", "Lcom/tencent/mm/modelbase/NetSceneBase;", "onSelected", "onSetFavoriteCallback", "favorite", "onSetPrivacyCallback", "isPrivacy", "pause", "preloadForUser", "dateIndex", "resume", "setFavorite", "nowFavorite", "replaceInfo", "Lcom/tencent/mm/plugin/story/storage/StoryInfo;", "setPrivacy", "nowPrivacy", "setSelectedRead", "updateUserGalleryItemsFromDb", "plugin-story_release"})
public final class k extends h
  implements com.tencent.mm.ai.f
{
  private final String TAG;
  private final ArrayList<ArrayList<com.tencent.mm.plugin.story.model.d.g>> rYW;
  private final ArrayList<g> rYX;
  private final LinkedList<Integer> rYY;
  private int rYZ;
  private final int rZA;
  private final int rZB;
  private boolean rZD;
  private final ArrayList<String> rZZ;
  private int rZa;
  private int rZb;
  private int rZc;
  private final e rZe;
  private final String username;

  public k(String paramString, ArrayList<String> paramArrayList, e parame)
  {
    AppMethodBeat.i(109662);
    this.username = paramString;
    this.rZZ = paramArrayList;
    this.rZe = parame;
    this.TAG = "MicroMsg.SelfHistoryGalleryPresenter";
    this.rZA = 3;
    this.rZB = 1;
    this.rYW = new ArrayList();
    this.rYX = new ArrayList();
    this.rYY = new LinkedList();
    this.rYZ = -1;
    this.rZa = -1;
    this.rZb = -1;
    this.rZc = -1;
    this.rZe.EP(this.rZZ.size());
    paramArrayList = ((Iterable)this.rZZ).iterator();
    while (paramArrayList.hasNext())
    {
      paramString = (String)paramArrayList.next();
      ab.i(this.TAG, "LogStory: ".concat(String.valueOf(paramString)));
      this.rYW.add(new ArrayList());
      this.rYX.add(new g(paramString));
    }
    paramString = com.tencent.mm.kernel.g.RO();
    a.f.b.j.o(paramString, "network()");
    paramString.Rg().a(764, (com.tencent.mm.ai.f)this);
    paramString = com.tencent.mm.kernel.g.RO();
    a.f.b.j.o(paramString, "network()");
    paramString.Rg().a(529, (com.tencent.mm.ai.f)this);
    AppMethodBeat.o(109662);
  }

  private final void czF()
  {
    AppMethodBeat.i(109661);
    while (true)
    {
      if ((this.rZD) || (this.rYY.size() <= 0))
        AppMethodBeat.o(109661);
      while (true)
      {
        return;
        Object localObject = this.rYY.get(0);
        a.f.b.j.o(localObject, "loadingIndexQueue[0]");
        int i = ((Number)localObject).intValue();
        localObject = this.rZZ.get(i);
        a.f.b.j.o(localObject, "dateList[dateIndex]");
        localObject = (String)localObject;
        ab.i(this.TAG, "LogStory: loadRemoteForDate ".concat(String.valueOf(localObject)));
        if (((g)this.rYX.get(i)).rZv == 2)
          break;
        com.tencent.mm.plugin.story.model.a.e locale = new com.tencent.mm.plugin.story.model.a.e(this.username, (String)localObject);
        localObject = com.tencent.mm.kernel.g.RO();
        a.f.b.j.o(localObject, "MMKernel.network()");
        ((com.tencent.mm.kernel.b)localObject).Rg().d((com.tencent.mm.ai.m)locale);
        this.rZD = true;
        AppMethodBeat.o(109661);
      }
      this.rYY.remove(0);
    }
  }

  private final void ly(final boolean paramBoolean)
  {
    AppMethodBeat.i(109650);
    com.tencent.mm.ab.b.a((a.f.a.a)new e(this, paramBoolean));
    AppMethodBeat.o(109650);
  }

  private final void r(String paramString, List<com.tencent.mm.plugin.story.model.d.g> paramList)
  {
    AppMethodBeat.i(109651);
    int i = this.rZZ.indexOf(paramString);
    if (paramList.isEmpty())
    {
      com.tencent.mm.ab.b.a((a.f.a.a)new k.c(this, i));
      AppMethodBeat.o(109651);
    }
    while (true)
    {
      return;
      com.tencent.mm.ab.b.a((a.f.a.a)new k.d(this, i, paramList));
      AppMethodBeat.o(109651);
    }
  }

  public final void EO(int paramInt)
  {
  }

  public final void ES(int paramInt)
  {
    AppMethodBeat.i(109658);
    j.a locala = com.tencent.mm.plugin.story.model.j.rST;
    j.a.cno().post((Runnable)new k.a(this, paramInt));
    AppMethodBeat.o(109658);
  }

  public final void ET(int paramInt)
  {
  }

  public final void czB()
  {
    AppMethodBeat.i(109652);
    this.rYZ = -1;
    this.rZa = -1;
    n.a locala = com.tencent.mm.plugin.story.model.n.rTi;
    n.a.cyo();
    AppMethodBeat.o(109652);
  }

  public final void czC()
  {
    int i = 0;
    AppMethodBeat.i(109654);
    Iterator localIterator = ((Iterable)this.rZZ).iterator();
    for (int j = 0; localIterator.hasNext(); j++)
    {
      localIterator.next();
      if (j < 0)
        a.a.j.dWs();
      ((g)this.rYX.get(j)).rZv = 1;
    }
    localIterator = ((Iterable)this.rZZ).iterator();
    j = 0;
    Object localObject1;
    Object localObject2;
    while (localIterator.hasNext())
    {
      localIterator.next();
      int k = j + 1;
      if (j < 0)
        a.a.j.dWs();
      localObject1 = this.rZZ.get(j);
      a.f.b.j.o(localObject1, "dateList[dateIndex]");
      localObject2 = (String)localObject1;
      localObject1 = this.rYW.get(j);
      a.f.b.j.o(localObject1, "dateGalleryMap[dateIndex]");
      localObject1 = (ArrayList)localObject1;
      Object localObject3 = this.rYX.get(j);
      a.f.b.j.o(localObject3, "dateState[dateIndex]");
      localObject3 = (g)localObject3;
      Object localObject4 = com.tencent.mm.plugin.story.model.j.rST;
      localObject4 = j.a.cxZ().aaZ((String)localObject2);
      if (localObject4 != null)
      {
        j = ((com.tencent.mm.plugin.story.h.h)localObject4).field_count;
        label211: ab.i(this.TAG, "LogStory: preloadForDate " + (String)localObject2 + " historyCount " + j);
        localObject2 = h.a.gz(this.username, (String)localObject2);
        if (((ArrayList)localObject2).size() <= 0)
          break label339;
        ((ArrayList)localObject1).addAll((Collection)localObject2);
        if (((ArrayList)localObject2).size() != j)
          break label330;
      }
      label330: for (((g)localObject3).rZv = 2; ; ((g)localObject3).rZv = 1)
      {
        ab.i(this.TAG, "LogStory: preload Db data " + ((ArrayList)localObject2).size());
        j = k;
        break;
        j = 0;
        break label211;
      }
      label339: if (j != 0)
      {
        ((g)localObject3).rZv = 1;
        ab.i(this.TAG, "LogStory: initLoad Sync data");
      }
      j = k;
    }
    if (this.rZZ.size() > 0)
    {
      this.rYY.add(Integer.valueOf(0));
      czF();
    }
    localIterator = ((Iterable)this.rZZ).iterator();
    for (j = i; localIterator.hasNext(); j++)
    {
      localIterator.next();
      if (j < 0)
        a.a.j.dWs();
      localObject1 = this.rZZ.get(j);
      a.f.b.j.o(localObject1, "dateList[index]");
      localObject2 = (String)localObject1;
      localObject1 = this.rYW.get(j);
      a.f.b.j.o(localObject1, "dateGalleryMap[index]");
      r((String)localObject2, (List)localObject1);
    }
    AppMethodBeat.o(109654);
  }

  public final void czE()
  {
  }

  public final void destroy()
  {
    AppMethodBeat.i(109653);
    com.tencent.mm.kernel.b localb = com.tencent.mm.kernel.g.RO();
    a.f.b.j.o(localb, "network()");
    localb.Rg().b(529, (com.tencent.mm.ai.f)this);
    localb = com.tencent.mm.kernel.g.RO();
    a.f.b.j.o(localb, "network()");
    localb.Rg().b(764, (com.tencent.mm.ai.f)this);
    AppMethodBeat.o(109653);
  }

  public final void fM(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(109655);
    ab.i(this.TAG, "LogStory: deleteItem ".concat(String.valueOf(paramInt1)));
    if ((paramInt1 >= 0) && (paramInt1 < this.rZZ.size()) && (paramInt2 >= 0) && (paramInt2 < ((ArrayList)this.rYW.get(paramInt1)).size()))
    {
      j.a locala = com.tencent.mm.plugin.story.model.j.rST;
      j.a.cno().post((Runnable)new k.b(this, paramInt1, paramInt2));
    }
    AppMethodBeat.o(109655);
  }

  public final void fN(int paramInt1, int paramInt2)
  {
    Object localObject1 = null;
    AppMethodBeat.i(109656);
    this.rZb = paramInt1;
    this.rZc = paramInt2;
    ab.d(this.TAG, "onSelected row=" + paramInt1 + " column=" + paramInt2);
    Object localObject2 = com.tencent.mm.plugin.story.model.j.rST;
    j.a.cno().post((Runnable)new k.f(this, paramInt1));
    if ((this.rZb >= 0) && (this.rZb < this.rYW.size()))
    {
      localObject2 = this.rYW.get(this.rZb);
      a.f.b.j.o(localObject2, "dateGalleryMap[selectedRow]");
      localObject2 = (com.tencent.mm.plugin.story.model.d.g)a.a.j.x((List)localObject2, this.rZc);
      if (localObject2 == null)
        break label286;
    }
    label286: for (localObject2 = ((com.tencent.mm.plugin.story.model.d.g)localObject2).rWa; ; localObject2 = null)
    {
      String str = this.TAG;
      StringBuilder localStringBuilder = new StringBuilder("setSelectedRead ").append(this.rZc).append(", ");
      if (localObject2 != null)
        localObject1 = Boolean.valueOf(((com.tencent.mm.plugin.story.model.d.f)localObject2).rVh);
      ab.i(str, localObject1);
      if ((localObject2 != null) && (((com.tencent.mm.plugin.story.model.d.f)localObject2).rrj.size() > 0))
      {
        localObject1 = com.tencent.mm.plugin.story.model.b.b.rVw;
        long l = ((com.tencent.mm.plugin.story.model.d.f)localObject2).rUJ;
        localObject1 = ((com.tencent.mm.plugin.story.model.d.f)localObject2).rrj.getLast();
        a.f.b.j.o(localObject1, "comment.commentList.last");
        if (com.tencent.mm.plugin.story.model.b.b.b(l, (com.tencent.mm.plugin.story.model.b.a)localObject1))
        {
          ((com.tencent.mm.plugin.story.model.d.f)localObject2).rVh = false;
          this.rZe.czD();
        }
      }
      AppMethodBeat.o(109656);
      return;
    }
  }

  public final void n(int paramInt1, int paramInt2, boolean paramBoolean)
  {
    AppMethodBeat.i(109657);
    ab.i(this.TAG, "LogStory: setPrivacy row:" + paramInt1 + " column:" + paramInt2);
    long l;
    if ((paramInt1 >= 0) && (paramInt1 < this.rZZ.size()) && (paramInt2 >= 0) && (paramInt2 < ((ArrayList)this.rYW.get(paramInt1)).size()))
      if (!paramBoolean)
      {
        paramBoolean = true;
        Object localObject1 = ((ArrayList)this.rYW.get(paramInt1)).get(paramInt2);
        a.f.b.j.o(localObject1, "dateGalleryMap[row][column]");
        Object localObject2 = (com.tencent.mm.plugin.story.model.d.g)localObject1;
        ab.i(this.TAG, "LogStory: setPrivacy storyinfo " + localObject2 + " targetPrivacy:" + paramBoolean);
        localObject1 = com.tencent.mm.plugin.story.model.j.rST;
        localObject1 = j.a.cxT().Fe((int)((com.tencent.mm.plugin.story.model.d.g)localObject2).rWb.xDa);
        if (localObject1 == null)
          break label264;
        localObject2 = com.tencent.mm.plugin.story.g.e.sbS;
        com.tencent.mm.plugin.story.g.e.lD(paramBoolean);
        if (!paramBoolean)
          break label256;
        l = 3L;
        label195: localObject2 = com.tencent.mm.plugin.story.g.h.scu;
        com.tencent.mm.plugin.story.g.h.a(l, String.valueOf(((com.tencent.mm.plugin.story.h.j)localObject1).field_storyID), 2L, 0L, 16);
        localObject2 = com.tencent.mm.plugin.story.model.n.rTi;
        n.a.b(((com.tencent.mm.plugin.story.h.j)localObject1).field_storyID, (int)((com.tencent.mm.plugin.story.h.j)localObject1).xDa, paramBoolean, ((com.tencent.mm.plugin.story.h.j)localObject1).cBX());
        AppMethodBeat.o(109657);
      }
    while (true)
    {
      return;
      paramBoolean = false;
      break;
      label256: l = 4L;
      break label195;
      label264: AppMethodBeat.o(109657);
    }
  }

  public final void o(int paramInt1, int paramInt2, boolean paramBoolean)
  {
    AppMethodBeat.i(138816);
    ab.i(this.TAG, "LogStory: setFavorite ".concat(String.valueOf(paramInt2)));
    Object localObject1;
    Object localObject2;
    if ((paramInt1 >= 0) && (paramInt1 < this.rZZ.size()) && (paramInt2 >= 0) && (paramInt2 < ((ArrayList)this.rYW.get(paramInt1)).size()))
    {
      if (paramBoolean)
        break label244;
      paramBoolean = true;
      localObject1 = ((ArrayList)this.rYW.get(paramInt1)).get(paramInt2);
      a.f.b.j.o(localObject1, "dateGalleryMap[row][column]");
      localObject1 = (com.tencent.mm.plugin.story.model.d.g)localObject1;
      ab.i(this.TAG, "LogStory: setFavorite storyinfo " + localObject1 + " localid " + ((com.tencent.mm.plugin.story.model.d.g)localObject1).rVZ.cNE + " targetFavorite:" + paramBoolean);
      localObject2 = com.tencent.mm.plugin.story.model.j.rST;
      localObject1 = j.a.cxT().Fe((int)((com.tencent.mm.plugin.story.model.d.g)localObject1).rWb.xDa);
      if (localObject1 != null)
      {
        localObject2 = com.tencent.mm.plugin.story.g.e.sbS;
        com.tencent.mm.plugin.story.g.e.lC(paramBoolean);
        if (!paramBoolean)
          break label249;
      }
    }
    label244: label249: for (long l = 1L; ; l = 2L)
    {
      localObject2 = com.tencent.mm.plugin.story.g.h.scu;
      com.tencent.mm.plugin.story.g.h.a(l, String.valueOf(((com.tencent.mm.plugin.story.h.j)localObject1).field_storyID), 2L, 0L, 16);
      localObject2 = com.tencent.mm.plugin.story.model.n.rTi;
      n.a.h(((com.tencent.mm.plugin.story.h.j)localObject1).field_storyID, (int)((com.tencent.mm.plugin.story.h.j)localObject1).xDa, paramBoolean);
      AppMethodBeat.o(138816);
      return;
      paramBoolean = false;
      break;
    }
  }

  public final void onSceneEnd(int paramInt1, int paramInt2, String paramString, com.tencent.mm.ai.m paramm)
  {
    boolean bool1 = true;
    boolean bool2 = true;
    AppMethodBeat.i(109659);
    a.f.b.j.p(paramm, "scene");
    ab.i(this.TAG, "LogStory: " + paramInt1 + ' ' + paramInt2 + ' ' + paramString);
    if (((paramm instanceof com.tencent.mm.plugin.story.model.a.e)) && (bo.isEqual(((com.tencent.mm.plugin.story.model.a.e)paramm).userName, this.username)))
    {
      paramString = (Integer)this.rYY.poll();
      if (paramString != null)
      {
        paramInt1 = ((Number)paramString).intValue();
        paramInt2 = this.rZZ.size();
        if (paramInt1 < 0)
          AppMethodBeat.o(109659);
      }
    }
    while (true)
    {
      return;
      Object localObject;
      if (paramInt2 > paramInt1)
      {
        ab.d(this.TAG, paramInt1 + ' ' + (String)this.rZZ.get(paramInt1));
        this.rZD = false;
        ((g)this.rYX.get(paramInt1)).rZv = 2;
        ab.i(this.TAG, "LogStory: updateUserGalleryItemsFromDb ".concat(String.valueOf(paramInt1)));
        paramString = this.rZZ.get(paramInt1);
        a.f.b.j.o(paramString, "dateList[dateIndex]");
        paramString = (String)paramString;
        paramm = this.rYW.get(paramInt1);
        a.f.b.j.o(paramm, "dateGalleryMap[dateIndex]");
        localObject = (ArrayList)paramm;
        paramm = h.a.gz(this.username, paramString);
        ((ArrayList)localObject).clear();
        ((ArrayList)localObject).addAll((Collection)paramm);
        ab.i(this.TAG, "LogStory: db data " + paramString + ' ' + ((ArrayList)localObject).size());
        r(paramString, (List)localObject);
        czF();
      }
      AppMethodBeat.o(109659);
      continue;
      AppMethodBeat.o(109659);
      continue;
      if ((paramm instanceof com.tencent.mm.plugin.story.model.a.g))
      {
        paramString = ((com.tencent.mm.plugin.story.model.a.g)paramm).cyX();
        if (paramString != null)
        {
          if ((paramString instanceof com.tencent.mm.plugin.story.model.a.m))
          {
            if (paramInt2 == 0)
            {
              paramString = com.tencent.mm.plugin.story.model.n.rTi;
              n.a.EL(((com.tencent.mm.plugin.story.model.a.g)paramm).cNE);
            }
            if (paramInt2 == 0);
            for (bool2 = true; ; bool2 = false)
            {
              ly(bool2);
              AppMethodBeat.o(109659);
              break;
            }
          }
          if ((paramString instanceof com.tencent.mm.plugin.story.model.a.n))
          {
            ab.i(this.TAG, "onSceneEnd MMSTORY_OBJ_OP_VISIBILITY_TYPE errType:" + paramInt1 + ", errcode:" + paramInt2);
            if (paramInt2 == 0)
            {
              localObject = com.tencent.mm.plugin.story.model.n.rTi;
              n.a.fJ(((com.tencent.mm.plugin.story.model.a.g)paramm).cNE, ((com.tencent.mm.plugin.story.model.a.n)paramString).rVf);
              if ((((com.tencent.mm.plugin.story.model.a.n)paramString).rVf == 1) && (!((com.tencent.mm.plugin.story.model.a.n)paramString).rVg));
              while (true)
              {
                com.tencent.mm.ab.b.a((a.f.a.a)new k.h(this, bool2));
                AppMethodBeat.o(109659);
                break;
                bool2 = false;
              }
            }
          }
          else if ((paramString instanceof com.tencent.mm.plugin.story.model.a.l))
          {
            ab.i(this.TAG, "onSceneEnd update story favorite: errType " + paramInt1 + ", errcode " + paramInt2 + ", localId " + ((com.tencent.mm.plugin.story.model.a.g)paramm).cNE + ", favorite:" + ((com.tencent.mm.plugin.story.model.a.l)paramString).rVe);
            if (paramInt2 == 0)
            {
              localObject = com.tencent.mm.plugin.story.model.n.rTi;
              n.a.fK(((com.tencent.mm.plugin.story.model.a.g)paramm).cNE, ((com.tencent.mm.plugin.story.model.a.l)paramString).rVe);
              if (((com.tencent.mm.plugin.story.model.a.l)paramString).rVe != 1)
                break label688;
            }
          }
          label688: for (bool2 = bool1; ; bool2 = false)
          {
            com.tencent.mm.ab.b.a((a.f.a.a)new k.g(this, bool2));
            AppMethodBeat.o(109659);
            break;
          }
        }
      }
      AppMethodBeat.o(109659);
    }
  }

  public final void pause()
  {
  }

  public final void resume()
  {
  }

  @a.l(dWo={1, 1, 13}, dWp={""}, dWq={"<anonymous>", "", "invoke"})
  static final class e extends a.f.b.k
    implements a.f.a.a<y>
  {
    e(k paramk, boolean paramBoolean)
    {
      super();
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.story.f.k
 * JD-Core Version:    0.6.2
 */