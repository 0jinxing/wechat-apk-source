package com.tencent.mm.plugin.story.f;

import a.f.a.r;
import a.y;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.p;
import com.tencent.mm.plugin.story.h.k;
import com.tencent.mm.plugin.story.model.d.g.a;
import com.tencent.mm.plugin.story.model.d.i;
import com.tencent.mm.plugin.story.model.j.a;
import com.tencent.mm.plugin.story.model.n.a;
import com.tencent.mm.protocal.protobuf.cea;
import com.tencent.mm.protocal.protobuf.cek;
import com.tencent.mm.protocal.protobuf.cfb;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

@a.l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/story/presenter/FavStoryPresenter;", "Lcom/tencent/mm/plugin/story/presenter/IGalleryPresenter;", "Lcom/tencent/mm/modelbase/IOnSceneEnd;", "username", "", "dateList", "", "galleryUserCallback", "Lcom/tencent/mm/plugin/story/presenter/GalleryGroupUpdateCallback;", "(Ljava/lang/String;Ljava/util/List;Lcom/tencent/mm/plugin/story/presenter/GalleryGroupUpdateCallback;)V", "TAG", "dateGalleryMap", "Ljava/util/ArrayList;", "Lcom/tencent/mm/plugin/story/model/gallery/StoryGalleryItem;", "dateState", "Lcom/tencent/mm/plugin/story/presenter/GalleryUserState;", "deleteColumnIndex", "", "deleteRowIndex", "galleryState", "isSelf", "", "loadingIndexQueue", "Ljava/util/LinkedList;", "selectedCol", "selectedRow", "storyCommentChangeListener", "Lkotlin/Function4;", "", "", "cancelDeleteItem", "row", "column", "deleteItem", "destroy", "initLoad", "notifyDateUpdate", "userIndex", "userGalleryItems", "onGalleryState", "state", "onItemRemovedCallback", "isOk", "onSceneEnd", "errType", "errCode", "errMsg", "scene", "Lcom/tencent/mm/modelbase/NetSceneBase;", "onSelected", "onSetFavoriteCallback", "favorite", "selectedDate", "onSetPrivacyCallback", "isPrivacy", "preloadForUser", "setFavorite", "nowFavorite", "replaceInfo", "Lcom/tencent/mm/plugin/story/storage/StoryInfo;", "setPrivacy", "nowPrivacy", "setSelectedRead", "plugin-story_release"})
public final class d extends h
  implements com.tencent.mm.ai.f
{
  private final String TAG;
  private boolean czr;
  private final List<String> rVW;
  private final r<Long, Boolean, String, String, y> rWK;
  private final ArrayList<ArrayList<com.tencent.mm.plugin.story.model.d.g>> rYW;
  private final ArrayList<g> rYX;
  private final LinkedList<Integer> rYY;
  private int rYZ;
  private int rZa;
  private int rZb;
  private int rZc;
  private int rZd;
  private final e rZe;
  private final String username;

  public d(String paramString, List<String> paramList, e parame)
  {
    AppMethodBeat.i(109573);
    this.username = paramString;
    this.rVW = paramList;
    this.rZe = parame;
    this.TAG = "MicroMsg.FavStoryPresenter";
    this.rYW = new ArrayList();
    this.rYX = new ArrayList();
    this.rYY = new LinkedList();
    this.rYZ = -1;
    this.rZa = -1;
    this.rZb = -1;
    this.rZc = -1;
    this.rWK = ((r)new d.i(this));
    paramString = com.tencent.mm.plugin.story.model.j.rST;
    this.czr = bo.isEqual(j.a.cnk(), this.username);
    this.rZe.EP(this.rVW.size());
    paramString = ((Iterable)this.rVW).iterator();
    while (paramString.hasNext())
    {
      paramList = (String)paramString.next();
      ab.i(this.TAG, "LogStory: ".concat(String.valueOf(paramList)));
      this.rYW.add(new ArrayList());
      this.rYX.add(new g(paramList));
    }
    if (this.czr)
    {
      paramString = com.tencent.mm.kernel.g.RO();
      a.f.b.j.o(paramString, "MMKernel.network()");
      paramString.Rg().a(764, (com.tencent.mm.ai.f)this);
    }
    paramString = com.tencent.mm.plugin.story.model.b.b.rVw;
    com.tencent.mm.plugin.story.model.b.b.a(this.rWK);
    AppMethodBeat.o(109573);
  }

  private final void czA()
  {
    AppMethodBeat.i(138802);
    if ((this.rZb >= 0) && (this.rZb < this.rYW.size()) && (this.rZc >= 0) && (this.rZc < ((ArrayList)this.rYW.get(this.rZb)).size()))
    {
      Object localObject1 = ((ArrayList)this.rYW.get(this.rZb)).get(this.rZc);
      a.f.b.j.o(localObject1, "dateGalleryMap[selectedRow][selectedCol]");
      localObject1 = ((com.tencent.mm.plugin.story.model.d.g)localObject1).rWa;
      ab.i(this.TAG, "setSelectedRead " + this.rZc + ", " + ((com.tencent.mm.plugin.story.model.d.f)localObject1).rVh);
      if (((com.tencent.mm.plugin.story.model.d.f)localObject1).rrj.size() > 0)
      {
        Object localObject2 = com.tencent.mm.plugin.story.model.b.b.rVw;
        long l = ((com.tencent.mm.plugin.story.model.d.f)localObject1).rUJ;
        localObject2 = ((com.tencent.mm.plugin.story.model.d.f)localObject1).rrj.getLast();
        a.f.b.j.o(localObject2, "comment.commentList.last");
        if (com.tencent.mm.plugin.story.model.b.b.b(l, (com.tencent.mm.plugin.story.model.b.a)localObject2))
        {
          ((com.tencent.mm.plugin.story.model.d.f)localObject1).rVh = false;
          this.rZe.czD();
        }
      }
    }
    AppMethodBeat.o(138802);
  }

  private final void i(int paramInt, List<com.tencent.mm.plugin.story.model.d.g> paramList)
  {
    AppMethodBeat.i(138801);
    if (paramList.isEmpty())
    {
      com.tencent.mm.ab.b.a((a.f.a.a)new d.b(this, paramInt));
      AppMethodBeat.o(138801);
    }
    while (true)
    {
      return;
      com.tencent.mm.ab.b.a((a.f.a.a)new d.c(this, paramInt, paramList));
      AppMethodBeat.o(138801);
    }
  }

  private final void ly(boolean paramBoolean)
  {
    AppMethodBeat.i(109563);
    com.tencent.mm.ab.b.a((a.f.a.a)new d.d(this, paramBoolean));
    AppMethodBeat.o(109563);
  }

  public final void EO(int paramInt)
  {
    AppMethodBeat.i(138803);
    this.rZd = paramInt;
    if (this.rZd == 1)
      czA();
    AppMethodBeat.o(138803);
  }

  public final void czB()
  {
    AppMethodBeat.i(109565);
    this.rYZ = -1;
    this.rZa = -1;
    n.a locala = com.tencent.mm.plugin.story.model.n.rTi;
    n.a.cyo();
    AppMethodBeat.o(109565);
  }

  public final void czC()
  {
    int i = 0;
    AppMethodBeat.i(109567);
    Object localObject1 = ((Iterable)this.rVW).iterator();
    for (int j = 0; ((Iterator)localObject1).hasNext(); j++)
    {
      ((Iterator)localObject1).next();
      if (j < 0)
        a.a.j.dWs();
      ((g)this.rYX.get(j)).rZv = 1;
    }
    Object localObject2 = this.username;
    a.f.b.j.p(localObject2, "username");
    localObject1 = new ArrayList();
    Object localObject3 = com.tencent.mm.plugin.story.model.j.rST;
    Object localObject4 = j.a.cxT();
    localObject3 = com.tencent.mm.plugin.story.model.j.rST;
    localObject3 = ((k)localObject4).bx((String)localObject2, bo.isEqual((String)localObject2, j.a.cnk())).iterator();
    while (((Iterator)localObject3).hasNext())
    {
      localObject4 = (com.tencent.mm.plugin.story.h.j)((Iterator)localObject3).next();
      cfb localcfb = ((com.tencent.mm.plugin.story.h.j)localObject4).cBR();
      if ((localcfb.xeA != null) && (localcfb.xeA.wbK.size() != 0))
      {
        g.a locala = com.tencent.mm.plugin.story.model.d.g.rWe;
        a.f.b.j.o(localObject4, "story");
        ((ArrayList)localObject1).add(g.a.c((com.tencent.mm.plugin.story.h.j)localObject4));
        ab.i(h.TAG, "getFavGalleryItemsFromDb story username " + (String)localObject2 + ' ' + ((ArrayList)localObject1).size() + ' ' + "content " + ((cek)localcfb.xeA.wbK.get(0)).wEH + ' ' + "and " + ((cek)localcfb.xeA.wbK.get(0)).Url + " id:" + ((com.tencent.mm.plugin.story.h.j)localObject4).field_storyID + " storyUsername: " + ((com.tencent.mm.plugin.story.h.j)localObject4).field_userName);
      }
    }
    if (((ArrayList)localObject1).size() > 0)
    {
      localObject2 = ((Iterable)localObject1).iterator();
      for (j = 0; ((Iterator)localObject2).hasNext(); j++)
      {
        localObject3 = ((Iterator)localObject2).next();
        if (j < 0)
          a.a.j.dWs();
        localObject3 = (com.tencent.mm.plugin.story.model.d.g)localObject3;
        if (j < this.rYW.size())
          ((ArrayList)this.rYW.get(j)).add(localObject3);
      }
      ab.i(this.TAG, "LogStory: preload Db data " + ((ArrayList)localObject1).size());
    }
    while (true)
    {
      localObject1 = ((Iterable)this.rVW).iterator();
      for (j = i; ((Iterator)localObject1).hasNext(); j++)
      {
        ((Iterator)localObject1).next();
        if (j < 0)
          a.a.j.dWs();
        localObject2 = this.rYW.get(j);
        a.f.b.j.o(localObject2, "dateGalleryMap[index]");
        i(j, (List)localObject2);
      }
      ab.i(this.TAG, "LogStory: initLoad no data");
    }
    AppMethodBeat.o(109567);
  }

  public final void destroy()
  {
    AppMethodBeat.i(109566);
    if (this.czr)
    {
      localObject = com.tencent.mm.kernel.g.RO();
      a.f.b.j.o(localObject, "MMKernel.network()");
      ((com.tencent.mm.kernel.b)localObject).Rg().b(764, (com.tencent.mm.ai.f)this);
    }
    Object localObject = com.tencent.mm.plugin.story.model.b.b.rVw;
    com.tencent.mm.plugin.story.model.b.b.b(this.rWK);
    AppMethodBeat.o(109566);
  }

  public final void fM(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(109568);
    ab.i(this.TAG, "LogStory: deleteItem ".concat(String.valueOf(paramInt1)));
    if ((paramInt1 >= 0) && (paramInt1 < this.rYW.size()) && (paramInt2 >= 0) && (paramInt2 < ((ArrayList)this.rYW.get(paramInt1)).size()))
    {
      j.a locala = com.tencent.mm.plugin.story.model.j.rST;
      j.a.cno().post((Runnable)new d.a(this, paramInt1, paramInt2));
    }
    AppMethodBeat.o(109568);
  }

  public final void fN(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(109569);
    ab.d(this.TAG, "onSelected row=" + paramInt1 + " column=" + paramInt2);
    this.rZb = paramInt1;
    this.rZc = paramInt2;
    if (this.rZd == 1)
      czA();
    j.a locala = com.tencent.mm.plugin.story.model.j.rST;
    j.a.cno().post((Runnable)new d.e(this, paramInt1));
    AppMethodBeat.o(109569);
  }

  public final void n(int paramInt1, int paramInt2, boolean paramBoolean)
  {
    AppMethodBeat.i(109570);
    ab.i(this.TAG, "LogStory: setPrivacy row:" + paramInt1 + " column:" + paramInt2);
    Object localObject1;
    Object localObject2;
    if ((paramInt1 >= 0) && (paramInt1 < this.rVW.size()) && (paramInt2 >= 0) && (paramInt2 < ((ArrayList)this.rYW.get(paramInt1)).size()))
    {
      if (paramBoolean)
        break label251;
      paramBoolean = true;
      localObject1 = ((ArrayList)this.rYW.get(paramInt1)).get(paramInt2);
      a.f.b.j.o(localObject1, "dateGalleryMap[row][column]");
      localObject1 = (com.tencent.mm.plugin.story.model.d.g)localObject1;
      ab.i(this.TAG, "LogStory: setPrivacy storyinfo " + localObject1 + " targetPrivacy:" + paramBoolean);
      localObject2 = com.tencent.mm.plugin.story.model.j.rST;
      localObject1 = j.a.cxT().Fe((int)((com.tencent.mm.plugin.story.model.d.g)localObject1).rWb.xDa);
      if (localObject1 != null)
      {
        localObject2 = com.tencent.mm.plugin.story.g.e.sbS;
        com.tencent.mm.plugin.story.g.e.lD(paramBoolean);
        if (!paramBoolean)
          break label256;
      }
    }
    label256: for (long l = 3L; ; l = 4L)
    {
      localObject2 = com.tencent.mm.plugin.story.g.h.scu;
      com.tencent.mm.plugin.story.g.h.a(l, String.valueOf(((com.tencent.mm.plugin.story.h.j)localObject1).field_storyID), 0L, 0L, 28);
      localObject2 = com.tencent.mm.plugin.story.model.n.rTi;
      n.a.b(((com.tencent.mm.plugin.story.h.j)localObject1).field_storyID, (int)((com.tencent.mm.plugin.story.h.j)localObject1).xDa, paramBoolean, ((com.tencent.mm.plugin.story.h.j)localObject1).cBX());
      AppMethodBeat.o(109570);
      return;
      label251: paramBoolean = false;
      break;
    }
  }

  public final void o(int paramInt1, int paramInt2, boolean paramBoolean)
  {
    AppMethodBeat.i(138804);
    ab.i(this.TAG, "LogStory: setFavorite ".concat(String.valueOf(paramInt2)));
    Object localObject1;
    Object localObject2;
    if ((paramInt1 >= 0) && (paramInt1 < this.rVW.size()) && (paramInt2 >= 0) && (paramInt2 < ((ArrayList)this.rYW.get(paramInt1)).size()))
    {
      if (paramBoolean)
        break label244;
      paramBoolean = true;
      localObject1 = ((ArrayList)this.rYW.get(paramInt1)).get(paramInt2);
      a.f.b.j.o(localObject1, "dateGalleryMap[row][column]");
      localObject2 = (com.tencent.mm.plugin.story.model.d.g)localObject1;
      ab.i(this.TAG, "LogStory: setFavorite storyinfo " + localObject2 + " localid " + ((com.tencent.mm.plugin.story.model.d.g)localObject2).rVZ.cNE + " targetFavorite:" + paramBoolean);
      localObject1 = com.tencent.mm.plugin.story.model.j.rST;
      localObject1 = j.a.cxT().Fe((int)((com.tencent.mm.plugin.story.model.d.g)localObject2).rWb.xDa);
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
      com.tencent.mm.plugin.story.g.h.a(l, String.valueOf(((com.tencent.mm.plugin.story.h.j)localObject1).field_storyID), 0L, 0L, 28);
      localObject2 = com.tencent.mm.plugin.story.model.n.rTi;
      n.a.h(((com.tencent.mm.plugin.story.h.j)localObject1).field_storyID, (int)((com.tencent.mm.plugin.story.h.j)localObject1).xDa, paramBoolean);
      AppMethodBeat.o(138804);
      return;
      paramBoolean = false;
      break;
    }
  }

  public final void onSceneEnd(int paramInt1, int paramInt2, String paramString, com.tencent.mm.ai.m paramm)
  {
    AppMethodBeat.i(109571);
    a.f.b.j.p(paramm, "scene");
    ab.i(this.TAG, "LogStory: " + paramInt1 + ' ' + paramInt2 + ' ' + paramString);
    com.tencent.mm.plugin.story.model.a.a locala;
    boolean bool;
    if ((paramm instanceof com.tencent.mm.plugin.story.model.a.g))
    {
      locala = ((com.tencent.mm.plugin.story.model.a.g)paramm).cyX();
      if (locala != null)
        if ((locala instanceof com.tencent.mm.plugin.story.model.a.m))
        {
          if (paramInt2 == 0)
          {
            paramString = com.tencent.mm.plugin.story.model.n.rTi;
            n.a.EL(((com.tencent.mm.plugin.story.model.a.g)paramm).cNE);
          }
          if (paramInt2 == 0)
          {
            bool = true;
            ly(bool);
            AppMethodBeat.o(109571);
          }
        }
    }
    while (true)
    {
      return;
      bool = false;
      break;
      if ((locala instanceof com.tencent.mm.plugin.story.model.a.n))
      {
        ab.i(this.TAG, "onSceneEnd MMSTORY_OBJ_OP_VISIBILITY_TYPE errType:" + paramInt1 + ", errcode:" + paramInt2);
        if (paramInt2 == 0)
        {
          paramString = com.tencent.mm.plugin.story.model.n.rTi;
          n.a.fJ(((com.tencent.mm.plugin.story.model.a.g)paramm).cNE, ((com.tencent.mm.plugin.story.model.a.n)locala).rVf);
          if ((((com.tencent.mm.plugin.story.model.a.n)locala).rVf == 1) && (!((com.tencent.mm.plugin.story.model.a.n)locala).rVg));
          for (bool = true; ; bool = false)
          {
            com.tencent.mm.ab.b.a((a.f.a.a)new d.h(this, bool));
            AppMethodBeat.o(109571);
            break;
          }
        }
      }
      else if ((locala instanceof com.tencent.mm.plugin.story.model.a.l))
      {
        ab.i(this.TAG, "onSceneEnd update story favorite: errType " + paramInt1 + ", errcode " + paramInt2 + ", localId " + ((com.tencent.mm.plugin.story.model.a.g)paramm).cNE + ", favorite:" + ((com.tencent.mm.plugin.story.model.a.l)locala).rVe);
        if (paramInt2 == 0)
        {
          paramString = com.tencent.mm.plugin.story.model.n.rTi;
          n.a.fK(((com.tencent.mm.plugin.story.model.a.g)paramm).cNE, ((com.tencent.mm.plugin.story.model.a.l)locala).rVe);
          Iterator localIterator1 = ((Iterable)this.rYW).iterator();
          label374: if (!localIterator1.hasNext())
            break label569;
          Object localObject = localIterator1.next();
          Iterator localIterator2 = ((Iterable)localObject).iterator();
          label408: if (!localIterator2.hasNext())
            break label559;
          paramString = localIterator2.next();
          if ((int)((com.tencent.mm.plugin.story.model.d.g)paramString).rWb.xDa != ((com.tencent.mm.plugin.story.model.a.g)paramm).cNE)
            break label554;
          paramInt1 = 1;
          label450: if (paramInt1 == 0)
            break label557;
          label454: if (paramString == null)
            break label564;
          paramInt1 = 1;
          label460: if (paramInt1 == 0)
            break label567;
          paramString = localObject;
          label467: paramString = (ArrayList)paramString;
          if (((com.tencent.mm.plugin.story.model.a.l)locala).rVe != 1)
            break label574;
        }
      }
      label554: label557: label559: label564: label567: label569: label574: for (bool = true; ; bool = false)
      {
        if ((!bool) && (paramString != null))
        {
          paramInt1 = this.rYW.indexOf(paramString);
          this.rYW.remove(paramString);
          com.tencent.mm.ab.b.a((a.f.a.a)new d.f(paramInt1, this));
        }
        com.tencent.mm.ab.b.a((a.f.a.a)new d.g(this, bool));
        AppMethodBeat.o(109571);
        break;
        paramInt1 = 0;
        break label450;
        break label408;
        paramString = null;
        break label454;
        paramInt1 = 0;
        break label460;
        break label374;
        paramString = null;
        break label467;
      }
      AppMethodBeat.o(109571);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.story.f.d
 * JD-Core Version:    0.6.2
 */