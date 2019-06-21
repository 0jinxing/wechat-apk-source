package com.tencent.mm.plugin.story.f;

import a.f.a.r;
import a.f.b.k;
import a.l;
import a.y;
import android.support.v7.h.c.b;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.p;
import com.tencent.mm.model.cb;
import com.tencent.mm.plugin.story.model.j.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/story/presenter/MultiUserGalleryPresenter;", "Lcom/tencent/mm/modelbase/IOnSceneEnd;", "Lcom/tencent/mm/plugin/story/presenter/IGalleryPresenter;", "users", "", "", "chatRoom", "groupCallback", "Lcom/tencent/mm/plugin/story/presenter/GalleryGroupUpdateCallback;", "isForSns", "", "storyFilterList", "", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "(Ljava/util/List;Ljava/lang/String;Lcom/tencent/mm/plugin/story/presenter/GalleryGroupUpdateCallback;ZLjava/util/Map;)V", "TAG", "expectPos", "", "galleryState", "isLoadNetScene", "loadingUserQueue", "", "Lcom/tencent/mm/plugin/story/presenter/MultiUserGalleryPresenter$UserData;", "kotlin.jvm.PlatformType", "needFilter", "needLoadRemote", "preloadLocalCount", "preloadRemoteCount", "selectedCol", "selectedRow", "storyCommentChangeListener", "Lkotlin/Function4;", "", "userList", "checkLoadMore", "row", "deleteItem", "column", "destroy", "initExpectPosition", "initLoad", "loadMore", "loadNextQueuedUser", "notifyUser", "user", "items", "Lcom/tencent/mm/plugin/story/model/gallery/StoryGalleryItem;", "onGalleryState", "state", "onSceneEnd", "errType", "errCode", "errMsg", "scene", "Lcom/tencent/mm/modelbase/NetSceneBase;", "onSelected", "preloadForUser", "setSelectedRead", "updateUserGalleryItemsFromDb", "UserData", "plugin-story_release"})
public final class i extends h
  implements com.tencent.mm.ai.f
{
  private final String TAG;
  private final List<i.a> fxt;
  private final String gpx;
  private final r<Long, Boolean, String, String, y> rWK;
  private final int rZA;
  private final int rZB;
  private final List<i.a> rZC;
  private boolean rZD;
  private int rZE;
  private boolean rZF;
  private boolean rZG;
  private final e rZH;
  private final boolean rZI;
  private final Map<String, ArrayList<Long>> rZJ;
  private int rZb;
  private int rZc;
  private int rZd;

  public i(List<String> paramList, String paramString, e parame, boolean paramBoolean, Map<String, ? extends ArrayList<Long>> paramMap)
  {
    AppMethodBeat.i(138813);
    this.gpx = paramString;
    this.rZH = parame;
    this.rZI = paramBoolean;
    this.rZJ = paramMap;
    this.TAG = "MicroMsg.MultiUserGalleryPresenter";
    this.rZA = 3;
    this.rZB = 1;
    this.fxt = Collections.synchronizedList((List)new ArrayList());
    this.rZC = Collections.synchronizedList((List)new LinkedList());
    this.rZb = -1;
    this.rZc = -1;
    if (!this.rZJ.isEmpty());
    for (paramBoolean = true; ; paramBoolean = false)
    {
      this.rZG = paramBoolean;
      this.rWK = ((r)new g(this));
      ab.i(this.TAG, "TimeDiff: local: " + System.currentTimeMillis() + ", server: " + cb.aaD());
      ab.i(this.TAG, "chatRoom is " + this.gpx);
      paramString = ((Iterable)paramList).iterator();
      while (paramString.hasNext())
      {
        paramList = (String)paramString.next();
        ab.i(this.TAG, "LogStory: ".concat(String.valueOf(paramList)));
        this.fxt.add(new i.a(paramList, new ArrayList()));
      }
    }
    this.rZH.EP(this.fxt.size());
    paramList = com.tencent.mm.kernel.g.RO();
    a.f.b.j.o(paramList, "network()");
    paramList.Rg().a(273, (com.tencent.mm.ai.f)this);
    paramList = com.tencent.mm.plugin.story.model.b.b.rVw;
    com.tencent.mm.plugin.story.model.b.b.a(this.rWK);
    AppMethodBeat.o(138813);
  }

  private final void a(i.a parama)
  {
    AppMethodBeat.i(109608);
    if (this.fxt.indexOf(parama) < 0)
      AppMethodBeat.o(109608);
    while (true)
    {
      return;
      if (parama.state == 0)
        break;
      ab.i(this.TAG, "LogStory: preloadForUser already preload");
      AppMethodBeat.o(109608);
    }
    ArrayList localArrayList = new ArrayList();
    Object localObject1;
    Object localObject2;
    int i;
    if (this.rZG)
    {
      parama.state = 2;
      localObject1 = parama.username;
      localObject2 = parama.username;
      j.a locala = com.tencent.mm.plugin.story.model.j.rST;
      localObject1 = h.a.b((String)localObject1, bo.isEqual((String)localObject2, j.a.cnk()), (ArrayList)this.rZJ.get(parama.username));
      if (!((Collection)localObject1).isEmpty())
      {
        i = 1;
        label132: if (i != 0)
        {
          ab.i(this.TAG, "LogStory: preload add sync item and local item, " + ((ArrayList)localObject1).size());
          localArrayList.addAll((Collection)localObject1);
        }
      }
    }
    while (true)
    {
      a(parama, localArrayList);
      AppMethodBeat.o(109608);
      break;
      i = 0;
      break label132;
      parama.state = 1;
      ab.i(this.TAG, "LogStory: preloadForUser ".concat(String.valueOf(parama)));
      localObject1 = h.a.bt(parama.username, this.rZI);
      if (localObject1 == null)
      {
        a(parama, localArrayList);
        AppMethodBeat.o(109608);
        break;
      }
      localObject2 = h.a.bu(parama.username, this.rZI);
      if (((ArrayList)localObject2).size() > 0)
      {
        ab.i(this.TAG, "LogStory: preload add sync item and local item, " + ((ArrayList)localObject2).size());
        if (((com.tencent.mm.plugin.story.model.d.g)((ArrayList)localObject2).get(0)).rUJ != ((com.tencent.mm.plugin.story.model.d.g)localObject1).rUJ)
          localArrayList.add(localObject1);
        localArrayList.addAll((Collection)localObject2);
      }
      else
      {
        ab.i(this.TAG, "LogStory: preload add sync item");
        localArrayList.add(localObject1);
      }
    }
  }

  private final void a(i.a parama, final ArrayList<com.tencent.mm.plugin.story.model.d.g> paramArrayList)
  {
    boolean bool1 = false;
    AppMethodBeat.i(109607);
    final int i = this.fxt.indexOf(parama);
    int k;
    boolean bool2;
    label75: Object localObject;
    if (paramArrayList.isEmpty())
    {
      int j = this.rZb;
      k = this.rZb;
      if ((j - 1 > i) || (k + 1 < i))
      {
        bool2 = true;
        if (((Collection)paramArrayList).isEmpty())
          break label290;
        k = 1;
        if ((k != 0) || (this.rZd == 0))
          bool1 = true;
        String str = this.TAG;
        localObject = new StringBuilder("notifyUser: selection ");
        List localList = this.fxt;
        a.f.b.j.o(localList, "userList");
        ab.i(str, (i.a)a.a.j.x(localList, i) + ' ' + i + ' ' + this.rZb + ", " + paramArrayList.size() + ' ' + this.rZd + ", result " + bool2 + ' ' + bool1);
        localObject = parama.cHb;
        parama.V(paramArrayList);
        if (!bool2)
          break label296;
        ab.i(this.TAG, "remove user from gallery " + i + ' ' + parama);
        com.tencent.mm.ab.b.a((a.f.a.a)new i.c(this, i));
        AppMethodBeat.o(109607);
      }
    }
    while (true)
    {
      return;
      bool2 = false;
      break;
      label290: k = 0;
      break label75;
      label296: if (!bool1)
      {
        AppMethodBeat.o(109607);
      }
      else if ((this.rZd == 0) || (i != this.rZb))
      {
        com.tencent.mm.ab.b.a((a.f.a.a)new i.d(this, i, paramArrayList));
        AppMethodBeat.o(109607);
      }
      else
      {
        com.tencent.mm.ab.b.a((a.f.a.a)new e(this, i, paramArrayList, h.a.m((List)localObject, (List)paramArrayList)));
        AppMethodBeat.o(109607);
      }
    }
  }

  private final void czA()
  {
    AppMethodBeat.i(138812);
    j.a locala = com.tencent.mm.plugin.story.model.j.rST;
    j.a.cno().post((Runnable)new f(this));
    AppMethodBeat.o(138812);
  }

  private final void czF()
  {
    AppMethodBeat.i(109609);
    if ((this.rZD) || (this.rZC.size() <= 0))
      AppMethodBeat.o(109609);
    while (true)
    {
      return;
      i.a locala = (i.a)this.rZC.get(0);
      int i = this.fxt.indexOf(locala);
      int j = this.fxt.size();
      if (i < 0);
      while ((j <= i) || (locala.state == 2))
      {
        this.rZC.remove(0);
        break;
      }
      locala.state = 2;
      ab.i(this.TAG, "LogStory: loadRemoteForUser ".concat(String.valueOf(locala)));
      ((com.tencent.mm.plugin.story.api.e)com.tencent.mm.kernel.g.M(com.tencent.mm.plugin.story.api.e.class)).loadStory(locala.username, this.gpx);
      this.rZD = true;
      AppMethodBeat.o(109609);
    }
  }

  public final void EO(int paramInt)
  {
    AppMethodBeat.i(109603);
    this.rZd = paramInt;
    if (this.rZd == 1)
      czA();
    AppMethodBeat.o(109603);
  }

  public final void ES(int paramInt)
  {
    AppMethodBeat.i(109605);
    Object localObject = this.fxt;
    a.f.b.j.o(localObject, "userList");
    localObject = (i.a)a.a.j.x((List)localObject, paramInt);
    if (localObject != null)
      a((i.a)localObject);
    localObject = this.fxt;
    a.f.b.j.o(localObject, "userList");
    localObject = (i.a)a.a.j.x((List)localObject, this.rZA + paramInt);
    List localList = this.fxt;
    a.f.b.j.o(localList, "userList");
    com.tencent.mm.ab.b.a("MultiUserGalleryPresenter_checkLoadMore", (a.f.a.a)new i.b(this, (i.a)localObject, (i.a)a.a.j.x(localList, this.rZB + paramInt)));
    AppMethodBeat.o(109605);
  }

  public final void ET(int paramInt)
  {
    this.rZE = paramInt;
  }

  public final void czC()
  {
    AppMethodBeat.i(109604);
    if (this.fxt.size() <= 3);
    for (int i = this.fxt.size(); ; i = 3)
      for (int j = 0; j < i; j++)
      {
        Object localObject = this.fxt.get(j);
        a.f.b.j.o(localObject, "userList[i]");
        a((i.a)localObject);
      }
    if (this.fxt.size() > 0)
    {
      this.rZC.add(this.fxt.get(0));
      czF();
    }
    AppMethodBeat.o(109604);
  }

  public final void czE()
  {
  }

  public final void destroy()
  {
    AppMethodBeat.i(109602);
    Object localObject = com.tencent.mm.kernel.g.RO();
    a.f.b.j.o(localObject, "network()");
    ((com.tencent.mm.kernel.b)localObject).Rg().b(273, (com.tencent.mm.ai.f)this);
    localObject = com.tencent.mm.plugin.story.model.b.b.rVw;
    com.tencent.mm.plugin.story.model.b.b.b(this.rWK);
    AppMethodBeat.o(109602);
  }

  public final void fM(int paramInt1, int paramInt2)
  {
  }

  public final void fN(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(138811);
    this.rZb = paramInt1;
    this.rZc = paramInt2;
    if (this.rZd == 1)
      czA();
    AppMethodBeat.o(138811);
  }

  public final void onSceneEnd(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(109606);
    a.f.b.j.p(paramm, "scene");
    if (this.rZC.size() <= 0)
      AppMethodBeat.o(109606);
    while (true)
    {
      return;
      i.a locala = (i.a)this.rZC.get(0);
      int i = this.fxt.indexOf(locala);
      int j = this.fxt.size();
      if ((i < 0) || (j <= i))
      {
        this.rZC.remove(0);
        this.rZD = false;
        czF();
        AppMethodBeat.o(109606);
      }
      else
      {
        ab.i(this.TAG, "LogStory: " + paramInt1 + ' ' + paramInt2 + ' ' + paramString + ", " + i + ' ' + locala);
        if ((paramm instanceof com.tencent.mm.plugin.story.model.a.j))
        {
          paramInt1 = this.fxt.size();
          if (i < 0)
          {
            AppMethodBeat.o(109606);
          }
          else if ((paramInt1 > i) && (bo.isEqual(((com.tencent.mm.plugin.story.model.a.j)paramm).userName, locala.username)))
          {
            this.rZC.remove(0);
            this.rZD = false;
            a.f.b.j.o(locala, "user");
            ab.i(this.TAG, "LogStory: updateUserGalleryItemsFromDb " + locala.username + ' ' + this.fxt.indexOf(locala));
            paramString = h.a.bu(locala.username, this.rZI);
            ab.i(this.TAG, "LogStory: db data " + locala + ' ' + paramString.size());
            a(locala, paramString);
            czF();
          }
        }
        else
        {
          AppMethodBeat.o(109606);
        }
      }
    }
  }

  @l(dWo={1, 1, 13}, dWp={""}, dWq={"<anonymous>", "", "invoke"})
  static final class e extends k
    implements a.f.a.a<y>
  {
    e(i parami, int paramInt, ArrayList paramArrayList, c.b paramb)
    {
      super();
    }
  }

  @l(dWo={1, 1, 13}, dWp={""}, dWq={"<anonymous>", "", "run"})
  static final class f
    implements Runnable
  {
    f(i parami)
    {
    }

    public final void run()
    {
      Object localObject1 = null;
      AppMethodBeat.i(138808);
      int i;
      if ((i.c(this.rZK) >= 0) && (i.c(this.rZK) < i.d(this.rZK).size()) && ((i.c(this.rZK) == i.e(this.rZK)) || (i.e(this.rZK) == -1)))
      {
        i = 1;
        if (i != 0)
        {
          localObject2 = (com.tencent.mm.plugin.story.model.d.g)a.a.j.x((List)((i.a)i.d(this.rZK).get(i.c(this.rZK))).cHb, i.g(this.rZK));
          if (localObject2 == null)
            break label272;
        }
      }
      label272: for (Object localObject2 = ((com.tencent.mm.plugin.story.model.d.g)localObject2).rWa; ; localObject2 = null)
      {
        String str = i.h(this.rZK);
        StringBuilder localStringBuilder = new StringBuilder("setSelectedRead ").append(i.g(this.rZK)).append(", ");
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
            com.tencent.mm.ab.b.a((a.f.a.a)new i.f.1(this));
          }
        }
        i.f(this.rZK);
        AppMethodBeat.o(138808);
        return;
        i = 0;
        break;
      }
    }
  }

  @l(dWo={1, 1, 13}, dWp={""}, dWq={"<anonymous>", "", "storyId", "", "isUnread", "", "fromUser", "", "storyOwner", "invoke"})
  static final class g extends k
    implements r<Long, Boolean, String, String, y>
  {
    g(i parami)
    {
      super();
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.story.f.i
 * JD-Core Version:    0.6.2
 */