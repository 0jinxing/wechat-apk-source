package com.tencent.mm.plugin.story.f;

import a.f.a.r;
import a.y;
import android.support.v7.h.c.b;
import android.support.v7.h.d;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.p;
import com.tencent.mm.plugin.story.model.d.i;
import com.tencent.mm.plugin.story.model.n.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

@a.l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/story/presenter/SelfGalleryPresenter;", "Lcom/tencent/mm/plugin/story/presenter/IGalleryPresenter;", "Lcom/tencent/mm/modelbase/IOnSceneEnd;", "username", "", "galleryCallback", "Lcom/tencent/mm/plugin/story/presenter/GalleryGroupUpdateCallback;", "(Ljava/lang/String;Lcom/tencent/mm/plugin/story/presenter/GalleryGroupUpdateCallback;)V", "deleteItemIndex", "", "getGalleryCallback", "()Lcom/tencent/mm/plugin/story/presenter/GalleryGroupUpdateCallback;", "galleryItems", "Ljava/util/ArrayList;", "Lcom/tencent/mm/plugin/story/model/gallery/StoryGalleryItem;", "Lkotlin/collections/ArrayList;", "galleryState", "privateItemIndex", "selectedIndex", "storyCommentChangeListener", "Lkotlin/Function4;", "", "", "", "getUsername", "()Ljava/lang/String;", "cancelDeleteItem", "row", "column", "deleteItem", "destroy", "initExpectPosition", "expectPos", "initLoad", "loadMore", "onGalleryState", "state", "onItemRemovedCallback", "isOk", "onSceneEnd", "errType", "errCode", "errMsg", "scene", "Lcom/tencent/mm/modelbase/NetSceneBase;", "onSelected", "onSetFavoriteCallback", "favorite", "onSetPrivacyCallback", "isPrivacy", "pause", "resume", "setFavorite", "nowFavorite", "replaceInfo", "Lcom/tencent/mm/plugin/story/storage/StoryInfo;", "setPrivacy", "nowPrivacy", "setSelectedRead", "updateCommentRead", "Companion", "plugin-story_release"})
public final class j extends h
  implements com.tencent.mm.ai.f
{
  private static final String TAG = "MicroMsg.SelfGalleryPresenter";
  private static boolean rZF;
  public static final j.a rZV;
  private int biG;
  private final r<Long, Boolean, String, String, y> rWK;
  private final ArrayList<com.tencent.mm.plugin.story.model.d.g> rZR;
  private int rZS;
  private int rZT;
  final e rZU;
  private int rZd;
  private final String username;

  static
  {
    AppMethodBeat.i(109639);
    rZV = new j.a((byte)0);
    TAG = "MicroMsg.SelfGalleryPresenter";
    rZF = true;
    AppMethodBeat.o(109639);
  }

  public j(String paramString, e parame)
  {
    AppMethodBeat.i(109638);
    this.username = paramString;
    this.rZU = parame;
    this.rZR = new ArrayList();
    this.rZS = -1;
    this.rZT = -1;
    this.biG = -1;
    this.rWK = ((r)new j.g(this));
    paramString = com.tencent.mm.kernel.g.RO();
    a.f.b.j.o(paramString, "MMKernel.network()");
    paramString.Rg().a(273, (com.tencent.mm.ai.f)this);
    paramString = com.tencent.mm.kernel.g.RO();
    a.f.b.j.o(paramString, "MMKernel.network()");
    paramString.Rg().a(764, (com.tencent.mm.ai.f)this);
    paramString = com.tencent.mm.plugin.story.model.b.b.rVw;
    com.tencent.mm.plugin.story.model.b.b.a(this.rWK);
    this.rZU.EP(1);
    AppMethodBeat.o(109638);
  }

  private final void czA()
  {
    Object localObject1 = null;
    AppMethodBeat.i(109632);
    Object localObject2 = (com.tencent.mm.plugin.story.model.d.g)a.a.j.x((List)this.rZR, this.biG);
    if (localObject2 != null);
    for (localObject2 = ((com.tencent.mm.plugin.story.model.d.g)localObject2).rWa; ; localObject2 = null)
    {
      String str = TAG;
      StringBuilder localStringBuilder = new StringBuilder("setSelectedRead ").append(this.biG).append(", ");
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
          this.rZU.czD();
        }
      }
      czG();
      AppMethodBeat.o(109632);
      return;
    }
  }

  private final void czG()
  {
    AppMethodBeat.i(109633);
    Object localObject = (Iterable)this.rZR;
    if ((!(localObject instanceof Collection)) || (!((Collection)localObject).isEmpty()))
    {
      localObject = ((Iterable)localObject).iterator();
      do
        if (!((Iterator)localObject).hasNext())
          break;
      while (!((com.tencent.mm.plugin.story.model.d.g)((Iterator)localObject).next()).rWa.rVh);
    }
    for (boolean bool1 = true; ; bool1 = false)
    {
      boolean bool2 = this.rZR.isEmpty();
      ab.i(TAG, "LogStory: updateCommentRead " + bool1 + ' ' + bool2);
      localObject = com.tencent.mm.plugin.story.model.b.b.rVw;
      com.tencent.mm.plugin.story.model.b.b.M(bool1, bool2);
      AppMethodBeat.o(109633);
      return;
    }
  }

  private final void ly(boolean paramBoolean)
  {
    AppMethodBeat.i(109623);
    com.tencent.mm.ab.b.a((a.f.a.a)new j.d(this, paramBoolean));
    AppMethodBeat.o(109623);
  }

  public final void EO(int paramInt)
  {
    AppMethodBeat.i(109624);
    this.rZd = paramInt;
    if (paramInt == 0)
    {
      czE();
      AppMethodBeat.o(109624);
    }
    while (true)
    {
      return;
      czA();
      AppMethodBeat.o(109624);
    }
  }

  public final void ET(int paramInt)
  {
  }

  public final void czB()
  {
    AppMethodBeat.i(109628);
    this.rZS = -1;
    n.a locala = com.tencent.mm.plugin.story.model.n.rTi;
    n.a.cyo();
    AppMethodBeat.o(109628);
  }

  public final void czC()
  {
    AppMethodBeat.i(109625);
    ab.i(TAG, "LogStory: initLoad");
    com.tencent.mm.plugin.story.model.d.g localg = (com.tencent.mm.plugin.story.model.d.g)a.a.j.x((List)this.rZR, 0);
    ArrayList localArrayList = h.a.bu(this.username, false);
    ab.i(TAG, "LogStory: preload Db count " + localArrayList.size());
    Object localObject = (com.tencent.mm.plugin.story.model.d.g)a.a.j.x((List)localArrayList, 0);
    if ((localg != null) && (localObject != null) && (localg.rUJ != ((com.tencent.mm.plugin.story.model.d.g)localObject).rUJ))
    {
      this.rZR.clear();
      this.rZR.addAll((Collection)localArrayList);
      this.rZU.j(0, (List)this.rZR);
      this.rZU.ER(0);
      this.rZU.czD();
    }
    while (true)
    {
      czG();
      czE();
      AppMethodBeat.o(109625);
      return;
      localObject = h.a.m((List)this.rZR, (List)localArrayList);
      this.rZR.clear();
      this.rZR.addAll((Collection)localArrayList);
      this.rZU.j(0, (List)this.rZR);
      this.rZU.czD();
      ((c.b)localObject).a((d)new j.c(this));
    }
  }

  public final void czE()
  {
    AppMethodBeat.i(109626);
    if ((rZF) && (this.rZd == 0))
    {
      rZF = false;
      com.tencent.mm.plugin.story.api.e locale = (com.tencent.mm.plugin.story.api.e)com.tencent.mm.kernel.g.M(com.tencent.mm.plugin.story.api.e.class);
      com.tencent.mm.plugin.story.model.j.a locala = com.tencent.mm.plugin.story.model.j.rST;
      locale.loadStory(com.tencent.mm.plugin.story.model.j.a.cnk(), null);
    }
    AppMethodBeat.o(109626);
  }

  public final void destroy()
  {
    AppMethodBeat.i(109636);
    ab.i(TAG, "LogStory: destroy");
    Object localObject = com.tencent.mm.kernel.g.RO();
    a.f.b.j.o(localObject, "MMKernel.network()");
    ((com.tencent.mm.kernel.b)localObject).Rg().b(273, (com.tencent.mm.ai.f)this);
    localObject = com.tencent.mm.kernel.g.RO();
    a.f.b.j.o(localObject, "MMKernel.network()");
    ((com.tencent.mm.kernel.b)localObject).Rg().b(764, (com.tencent.mm.ai.f)this);
    localObject = com.tencent.mm.plugin.story.model.b.b.rVw;
    com.tencent.mm.plugin.story.model.b.b.b(this.rWK);
    AppMethodBeat.o(109636);
  }

  public final void fM(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(109627);
    ab.i(TAG, "LogStory: deleteItem ".concat(String.valueOf(paramInt2)));
    Object localObject1;
    Object localObject2;
    if ((paramInt2 >= 0) && (paramInt2 < this.rZR.size()))
    {
      this.rZS = paramInt2;
      localObject1 = this.rZR.get(paramInt2);
      a.f.b.j.o(localObject1, "galleryItems[column]");
      localObject1 = (com.tencent.mm.plugin.story.model.d.g)localObject1;
      ab.i(TAG, "LogStory: deleteItem1 storyinfo " + localObject1 + " deleteItemIndex " + this.rZS + " localid " + ((com.tencent.mm.plugin.story.model.d.g)localObject1).rVZ.cNE);
      localObject2 = com.tencent.mm.plugin.story.model.j.rST;
      localObject2 = com.tencent.mm.plugin.story.model.j.a.cxT().Fe(((com.tencent.mm.plugin.story.model.d.g)localObject1).rVZ.cNE);
      Object localObject3 = com.tencent.mm.plugin.story.model.j.rST;
      com.tencent.mm.plugin.story.model.j.a.cxT().aba(((com.tencent.mm.plugin.story.model.d.g)localObject1).rVZ.cNE + '_' + ((com.tencent.mm.plugin.story.model.d.g)localObject1).rVZ.fDG);
      if (localObject2 != null)
      {
        ab.i(TAG, "LogStory: deleteItem2 storyinfo " + localObject1 + " deleteItemIndex " + this.rZS + " localid " + ((com.tencent.mm.plugin.story.model.d.g)localObject1).rVZ.cNE + ' ' + ((com.tencent.mm.plugin.story.h.j)localObject2).field_storyID);
        if (((com.tencent.mm.plugin.story.h.j)localObject2).field_storyID == 0L)
          break label329;
        if (this.rZS != -1)
        {
          localObject3 = com.tencent.mm.plugin.story.model.n.rTi;
          n.a.D(((com.tencent.mm.plugin.story.h.j)localObject2).field_storyID, ((com.tencent.mm.plugin.story.model.d.g)localObject1).rVZ.cNE);
        }
      }
    }
    while (true)
    {
      if (((com.tencent.mm.plugin.story.model.d.g)localObject1).rVZ.cze())
      {
        localObject2 = com.tencent.mm.plugin.story.model.j.rST;
        com.tencent.mm.plugin.story.model.j.a.cno().post((Runnable)new j.b((com.tencent.mm.plugin.story.model.d.g)localObject1));
      }
      AppMethodBeat.o(109627);
      return;
      label329: localObject2 = com.tencent.mm.plugin.story.model.n.rTi;
      n.a.EL(((com.tencent.mm.plugin.story.model.d.g)localObject1).rVZ.cNE);
      ly(true);
    }
  }

  public final void fN(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(109629);
    this.biG = paramInt2;
    if (this.rZd == 1)
      czA();
    AppMethodBeat.o(109629);
  }

  public final void n(int paramInt1, int paramInt2, boolean paramBoolean)
  {
    AppMethodBeat.i(109630);
    ab.i(TAG, "LogStory: setPrivacy ".concat(String.valueOf(paramInt2)));
    long l;
    if ((paramInt2 >= 0) && (paramInt2 < this.rZR.size()))
    {
      this.rZT = paramInt2;
      if (!paramBoolean)
      {
        paramBoolean = true;
        Object localObject1 = this.rZR.get(paramInt2);
        a.f.b.j.o(localObject1, "galleryItems[column]");
        localObject1 = (com.tencent.mm.plugin.story.model.d.g)localObject1;
        ab.i(TAG, "LogStory: setPrivacy storyinfo " + localObject1 + " setPrivacyItemIndex " + this.rZT + " localid " + ((com.tencent.mm.plugin.story.model.d.g)localObject1).rVZ.cNE + " targetPrivacy:" + paramBoolean);
        Object localObject2 = com.tencent.mm.plugin.story.model.j.rST;
        localObject1 = com.tencent.mm.plugin.story.model.j.a.cxT().Fe((int)((com.tencent.mm.plugin.story.model.d.g)localObject1).rWb.xDa);
        if (localObject1 == null)
          break label245;
        localObject2 = com.tencent.mm.plugin.story.g.e.sbS;
        com.tencent.mm.plugin.story.g.e.lD(paramBoolean);
        if (!paramBoolean)
          break label237;
        l = 3L;
        label182: localObject2 = com.tencent.mm.plugin.story.g.h.scu;
        com.tencent.mm.plugin.story.g.h.a(l, String.valueOf(((com.tencent.mm.plugin.story.h.j)localObject1).field_storyID), 1L, 0L, 16);
        localObject2 = com.tencent.mm.plugin.story.model.n.rTi;
        n.a.b(((com.tencent.mm.plugin.story.h.j)localObject1).field_storyID, (int)((com.tencent.mm.plugin.story.h.j)localObject1).xDa, paramBoolean, false);
        AppMethodBeat.o(109630);
      }
    }
    while (true)
    {
      return;
      paramBoolean = false;
      break;
      label237: l = 4L;
      break label182;
      label245: AppMethodBeat.o(109630);
    }
  }

  public final void o(int paramInt1, int paramInt2, boolean paramBoolean)
  {
    AppMethodBeat.i(138815);
    ab.i(TAG, "LogStory: setFavorite ".concat(String.valueOf(paramInt2)));
    long l;
    if ((paramInt2 >= 0) && (paramInt2 < this.rZR.size()))
      if (!paramBoolean)
      {
        paramBoolean = true;
        Object localObject1 = this.rZR.get(paramInt2);
        a.f.b.j.o(localObject1, "galleryItems[column]");
        localObject1 = (com.tencent.mm.plugin.story.model.d.g)localObject1;
        ab.i(TAG, "LogStory: setFavorite storyinfo " + localObject1 + " localid " + ((com.tencent.mm.plugin.story.model.d.g)localObject1).rVZ.cNE + " targetFavorite:" + paramBoolean);
        Object localObject2 = com.tencent.mm.plugin.story.model.j.rST;
        localObject1 = com.tencent.mm.plugin.story.model.j.a.cxT().Fe((int)((com.tencent.mm.plugin.story.model.d.g)localObject1).rWb.xDa);
        if (localObject1 == null)
          break label224;
        localObject2 = com.tencent.mm.plugin.story.g.e.sbS;
        com.tencent.mm.plugin.story.g.e.lC(paramBoolean);
        if (!paramBoolean)
          break label216;
        l = 1L;
        label162: localObject2 = com.tencent.mm.plugin.story.g.h.scu;
        com.tencent.mm.plugin.story.g.h.a(l, String.valueOf(((com.tencent.mm.plugin.story.h.j)localObject1).field_storyID), 1L, 0L, 16);
        localObject2 = com.tencent.mm.plugin.story.model.n.rTi;
        n.a.h(((com.tencent.mm.plugin.story.h.j)localObject1).field_storyID, (int)((com.tencent.mm.plugin.story.h.j)localObject1).xDa, paramBoolean);
        AppMethodBeat.o(138815);
      }
    while (true)
    {
      return;
      paramBoolean = false;
      break;
      label216: l = 2L;
      break label162;
      label224: AppMethodBeat.o(138815);
    }
  }

  public final void onSceneEnd(int paramInt1, int paramInt2, String paramString, com.tencent.mm.ai.m paramm)
  {
    final boolean bool = true;
    AppMethodBeat.i(109637);
    ab.i(TAG, "LogStory: " + paramInt1 + ' ' + paramInt2 + ' ' + paramString);
    if (((paramm instanceof com.tencent.mm.plugin.story.model.a.j)) && (bo.isEqual(((com.tencent.mm.plugin.story.model.a.j)paramm).userName, this.username)))
    {
      if ((paramInt1 != 0) && (paramInt1 != 4))
        break label407;
      rZF = false;
      czC();
      AppMethodBeat.o(109637);
    }
    while (true)
    {
      return;
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
            for (bool = true; ; bool = false)
            {
              ly(bool);
              AppMethodBeat.o(109637);
              break;
            }
          }
          n.a locala;
          if ((paramString instanceof com.tencent.mm.plugin.story.model.a.n))
          {
            ab.i(TAG, "onSceneEnd MMSTORY_OBJ_OP_VISIBILITY_TYPE errType:" + paramInt1 + ", errcode:" + paramInt2);
            if (paramInt2 != 0)
              break label392;
            locala = com.tencent.mm.plugin.story.model.n.rTi;
            n.a.fJ(((com.tencent.mm.plugin.story.model.a.g)paramm).cNE, ((com.tencent.mm.plugin.story.model.a.n)paramString).rVf);
            com.tencent.mm.ab.b.a((a.f.a.a)new j.f(this));
            AppMethodBeat.o(109637);
            continue;
          }
          if ((paramString instanceof com.tencent.mm.plugin.story.model.a.l))
          {
            ab.i(TAG, "onSceneEnd update story favorite: errType " + paramInt1 + ", errcode " + paramInt2 + ", localId " + ((com.tencent.mm.plugin.story.model.a.g)paramm).cNE + ", favorite:" + ((com.tencent.mm.plugin.story.model.a.l)paramString).rVe);
            if (paramInt2 == 0)
            {
              locala = com.tencent.mm.plugin.story.model.n.rTi;
              n.a.fK(((com.tencent.mm.plugin.story.model.a.g)paramm).cNE, ((com.tencent.mm.plugin.story.model.a.l)paramString).rVe);
              if (((com.tencent.mm.plugin.story.model.a.l)paramString).rVe != 1)
                break label401;
            }
          }
          while (true)
          {
            com.tencent.mm.ab.b.a((a.f.a.a)new e(this, bool));
            label392: AppMethodBeat.o(109637);
            break;
            label401: bool = false;
          }
        }
      }
      else
      {
        label407: AppMethodBeat.o(109637);
      }
    }
  }

  public final void pause()
  {
    AppMethodBeat.i(109635);
    ab.i(TAG, "LogStory: pause");
    AppMethodBeat.o(109635);
  }

  public final void resume()
  {
    AppMethodBeat.i(109634);
    ab.i(TAG, "LogStory: resume");
    AppMethodBeat.o(109634);
  }

  @a.l(dWo={1, 1, 13}, dWp={""}, dWq={"<anonymous>", "", "invoke"})
  static final class e extends a.f.b.k
    implements a.f.a.a<y>
  {
    e(j paramj, boolean paramBoolean)
    {
      super();
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.story.f.j
 * JD-Core Version:    0.6.2
 */