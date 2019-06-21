package com.tencent.mm.plugin.story.model;

import a.l;
import a.y;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.cd.h;
import com.tencent.mm.model.q;
import com.tencent.mm.plugin.expt.a.a.a;
import com.tencent.mm.plugin.story.c.a.f;
import com.tencent.mm.plugin.story.c.a.f.a;
import com.tencent.mm.plugin.story.h.b;
import com.tencent.mm.plugin.story.h.i;
import com.tencent.mm.plugin.story.h.k;
import com.tencent.mm.plugin.story.h.o;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.z;
import java.util.Map;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/story/model/StoryCore$Companion;", "", "()V", "MULTI_THUMB_IMAGEVIEW_OFFSET", "", "TAG", "", "THUMBNAIL_SIZE_LIMIT", "allReadTime", "", "exptChangeListener", "Lcom/tencent/mm/sdk/event/IListener;", "Lcom/tencent/mm/autogen/events/ExptChangeEvent;", "fileSys", "initAbTest", "", "multiThumbDisplaySize", "screenSize", "Landroid/graphics/Point;", "singleThumbDisplaySize", "storyIsOpen", "getAccStoryCachePath", "getAccStoryPath", "getAllStoryReadTime", "getCore", "Lcom/tencent/mm/plugin/story/model/StoryCore;", "getCropTypeWithCPU", "getDataDB", "Lcom/tencent/mm/storagebase/SqliteDB;", "getRemuxType", "Lcom/tencent/mm/plugin/story/config/moduleconfig/StoryProcessElementConfig$StoryProcessType;", "getSelfName", "getSelfUin", "getStoryAsyncQueueMgr", "Lcom/tencent/mm/plugin/story/model/StoryAsyncQueueMgr;", "getStoryCommentStorage", "Lcom/tencent/mm/plugin/story/storage/StoryCommentStorage;", "getStoryEditorDataStorage", "Lcom/tencent/mm/plugin/story/storage/StoryEditorDataStorage;", "getStoryExtInfoStorage", "Lcom/tencent/mm/plugin/story/storage/StoryExtInfoStorage;", "getStoryHistoryInfoStorage", "Lcom/tencent/mm/plugin/story/storage/StoryHistoryInfoStorage;", "getStoryInfoStorage", "Lcom/tencent/mm/plugin/story/storage/StoryInfoStorage;", "getStoryRoominfoStorage", "Lcom/tencent/mm/plugin/story/storage/StoryRoomInfoStorage;", "getStoryServer", "Lcom/tencent/mm/plugin/story/model/StoryLogic$StoryServer;", "getStoryUploadManager", "Lcom/tencent/mm/plugin/story/model/upload/UploadManager;", "getStoryVideoCacheStorage", "Lcom/tencent/mm/plugin/story/storage/StoryVideoCacheStorage;", "getWorkingHandler", "Lcom/tencent/mm/sdk/platformtools/MMHandler;", "isInValid", "isShowStory", "loadStoryStatus", "", "loader", "Lcom/tencent/mm/loader/Loader;", "Lcom/tencent/mm/plugin/story/model/download/StoryImage;", "loaderOptions", "Lcom/tencent/mm/loader/cfg/ImageLoaderOptions;", "scene", "Lcom/tencent/mm/plugin/story/model/download/LoaderScene;", "setAllStoryReadTime", "time", "plugin-story_release"})
public final class j$a
{
  private static h Ru()
  {
    AppMethodBeat.i(109058);
    h localh = j.f(cxS());
    if (localh == null)
      a.f.b.j.dWJ();
    AppMethodBeat.o(109058);
    return localh;
  }

  public static com.tencent.mm.loader.c.e a(com.tencent.mm.plugin.story.model.c.a parama)
  {
    AppMethodBeat.i(109070);
    a.f.b.j.p(parama, "scene");
    com.tencent.mm.kernel.g.RN().QU();
    if (j.p(cxS()) == null)
      j.a(cxS(), new com.tencent.mm.plugin.story.model.c.e());
    com.tencent.mm.plugin.story.model.c.e locale = j.p(cxS());
    if (locale == null)
      a.f.b.j.dWJ();
    a.f.b.j.p(parama, "scene");
    switch (com.tencent.mm.plugin.story.model.c.f.eQZ[parama.ordinal()])
    {
    default:
      parama = new a.m();
      AppMethodBeat.o(109070);
      throw parama;
    case 1:
    case 2:
      parama = locale.rVU;
      AppMethodBeat.o(109070);
    case 3:
    }
    while (true)
    {
      return parama;
      parama = locale.rVT;
      AppMethodBeat.o(109070);
    }
  }

  public static String cnk()
  {
    AppMethodBeat.i(109073);
    Object localObject = com.tencent.mm.kernel.g.RP();
    a.f.b.j.o(localObject, "MMKernel.storage()");
    String str = (String)((com.tencent.mm.kernel.e)localObject).Ry().get(2);
    if (str == null)
      ab.i(j.access$getTAG$cp(), "error getSelfName " + bo.dpG());
    localObject = str;
    if (str == null)
      localObject = "";
    AppMethodBeat.o(109073);
    return localObject;
  }

  public static boolean cnn()
  {
    AppMethodBeat.i(109072);
    cxS();
    boolean bool;
    if (!j.isValid())
    {
      bool = true;
      AppMethodBeat.o(109072);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(109072);
    }
  }

  public static ak cno()
  {
    AppMethodBeat.i(109066);
    Object localObject = com.tencent.mm.kernel.g.RS();
    a.f.b.j.o(localObject, "MMKernel.getPizzaWorkerThread()");
    localObject = ((al)localObject).doN();
    a.f.b.j.o(localObject, "MMKernel.getPizzaWorkerThread().workerHandler");
    AppMethodBeat.o(109066);
    return localObject;
  }

  private static j cxS()
  {
    AppMethodBeat.i(109057);
    j localj = (j)q.Y(j.class);
    if ((localj instanceof j))
    {
      j.a(localj);
      if (!j.b(localj));
    }
    synchronized (j.d(localj))
    {
      Object localObject2 = j.access$getTAG$cp();
      Object localObject3 = new java/lang/StringBuilder;
      ((StringBuilder)localObject3).<init>("getCore need reset DB now ");
      Object localObject4 = Thread.currentThread();
      a.f.b.j.o(localObject4, "Thread.currentThread()");
      localObject4 = ((StringBuilder)localObject3).append(((Thread)localObject4).getName()).append(" ");
      localObject3 = Thread.currentThread();
      a.f.b.j.o(localObject3, "Thread.currentThread()");
      ab.i((String)localObject2, ((Thread)localObject3).getId() + " " + localj.hashCode());
      if (j.b(localj))
      {
        j.e(localj);
        j.c(localj);
        ab.i(j.access$getTAG$cp(), "resetdb done");
      }
      localObject2 = y.AUy;
      a.f.b.j.o(localj, "theCore");
      AppMethodBeat.o(109057);
      return localj;
    }
  }

  public static k cxT()
  {
    AppMethodBeat.i(109059);
    com.tencent.mm.kernel.g.RN().QU();
    if (j.g(cxS()) == null)
      j.a(cxS(), new k((com.tencent.mm.sdk.e.e)Ru()));
    k localk = j.g(cxS());
    if (localk == null)
      a.f.b.j.dWJ();
    AppMethodBeat.o(109059);
    return localk;
  }

  public static com.tencent.mm.plugin.story.h.g cxU()
  {
    AppMethodBeat.i(109060);
    com.tencent.mm.kernel.g.RN().QU();
    if (j.h(cxS()) == null)
      j.a(cxS(), new com.tencent.mm.plugin.story.h.g((com.tencent.mm.sdk.e.e)Ru()));
    com.tencent.mm.plugin.story.h.g localg = j.h(cxS());
    if (localg == null)
      a.f.b.j.dWJ();
    AppMethodBeat.o(109060);
    return localg;
  }

  public static com.tencent.mm.plugin.story.h.m cxV()
  {
    AppMethodBeat.i(109061);
    com.tencent.mm.kernel.g.RN().QU();
    if (j.i(cxS()) == null)
      j.a(cxS(), new com.tencent.mm.plugin.story.h.m((com.tencent.mm.sdk.e.e)Ru()));
    com.tencent.mm.plugin.story.h.m localm = j.i(cxS());
    if (localm == null)
      a.f.b.j.dWJ();
    AppMethodBeat.o(109061);
    return localm;
  }

  public static b cxW()
  {
    AppMethodBeat.i(109062);
    com.tencent.mm.kernel.g.RN().QU();
    if (j.j(cxS()) == null)
      j.a(cxS(), new b((com.tencent.mm.sdk.e.e)Ru()));
    b localb = j.j(cxS());
    if (localb == null)
      a.f.b.j.dWJ();
    AppMethodBeat.o(109062);
    return localb;
  }

  public static o cxX()
  {
    AppMethodBeat.i(109063);
    com.tencent.mm.kernel.g.RN().QU();
    if (j.k(cxS()) == null)
      j.a(cxS(), new o((com.tencent.mm.sdk.e.e)Ru()));
    o localo = j.k(cxS());
    if (localo == null)
      a.f.b.j.dWJ();
    AppMethodBeat.o(109063);
    return localo;
  }

  public static com.tencent.mm.plugin.story.h.e cxY()
  {
    AppMethodBeat.i(109064);
    com.tencent.mm.kernel.g.RN().QU();
    if (j.l(cxS()) == null)
      j.a(cxS(), new com.tencent.mm.plugin.story.h.e((com.tencent.mm.sdk.e.e)Ru()));
    com.tencent.mm.plugin.story.h.e locale = j.l(cxS());
    if (locale == null)
      a.f.b.j.dWJ();
    AppMethodBeat.o(109064);
    return locale;
  }

  public static i cxZ()
  {
    AppMethodBeat.i(109065);
    com.tencent.mm.kernel.g.RN().QU();
    if (j.m(cxS()) == null)
      j.a(cxS(), new i((com.tencent.mm.sdk.e.e)Ru()));
    i locali = j.m(cxS());
    if (locali == null)
      a.f.b.j.dWJ();
    AppMethodBeat.o(109065);
    return locali;
  }

  public static com.tencent.mm.plugin.story.model.g.c cya()
  {
    AppMethodBeat.i(109067);
    com.tencent.mm.kernel.g.RN().QU();
    if (j.n(cxS()) == null)
      j.a(cxS(), new com.tencent.mm.plugin.story.model.g.c());
    com.tencent.mm.plugin.story.model.g.c localc = j.n(cxS());
    if (localc == null)
      a.f.b.j.dWJ();
    AppMethodBeat.o(109067);
    return localc;
  }

  public static e cyb()
  {
    AppMethodBeat.i(109068);
    com.tencent.mm.kernel.g.RN().QU();
    if (j.o(cxS()) == null)
    {
      localObject1 = cxS();
      Object localObject2 = new StringBuilder();
      Object localObject3 = com.tencent.mm.kernel.g.RP();
      a.f.b.j.o(localObject3, "MMKernel.storage()");
      localObject3 = ((StringBuilder)localObject2).append(((com.tencent.mm.kernel.e)localObject3).Rt());
      localObject2 = e.rSo;
      j.a((j)localObject1, new e(e.cxC()));
    }
    Object localObject1 = j.o(cxS());
    if (localObject1 == null)
      a.f.b.j.dWJ();
    AppMethodBeat.o(109068);
    return localObject1;
  }

  public static com.tencent.mm.loader.d<com.tencent.mm.plugin.story.model.c.d> cyc()
  {
    AppMethodBeat.i(109069);
    com.tencent.mm.kernel.g.RN().QU();
    if (j.p(cxS()) == null)
      j.a(cxS(), new com.tencent.mm.plugin.story.model.c.e());
    Object localObject = j.p(cxS());
    if (localObject == null)
      a.f.b.j.dWJ();
    localObject = ((com.tencent.mm.plugin.story.model.c.e)localObject).rVR;
    AppMethodBeat.o(109069);
    return localObject;
  }

  public static o.a cyd()
  {
    AppMethodBeat.i(109071);
    com.tencent.mm.kernel.g.RN().QU();
    if (j.q(cxS()) == null)
      j.a(cxS(), new o.a());
    o.a locala = j.q(cxS());
    if (locala == null)
      a.f.b.j.dWJ();
    AppMethodBeat.o(109071);
    return locala;
  }

  public static f.a cye()
  {
    AppMethodBeat.i(109076);
    f.a locala = (f.a)f.rRC.Uw();
    AppMethodBeat.o(109076);
    return locala;
  }

  static void cyf()
  {
    AppMethodBeat.i(109077);
    j.cxP();
    int i = ((com.tencent.mm.plugin.expt.a.a)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.expt.a.a.class)).a(a.a.lFY, 1);
    ab.d(j.access$getTAG$cp(), "loadStoryCheck %s local_debug %s", new Object[] { Integer.valueOf(i), Boolean.FALSE });
    com.tencent.mm.storage.c localc = com.tencent.mm.model.c.c.abi().ll("100481");
    a.f.b.j.o(localc, "abTestItem");
    if ((localc.isValid()) && (a.f.b.j.j("1", (String)localc.dru().get("open"))))
      i = 1;
    while (true)
    {
      if (i == 1);
      for (boolean bool = true; ; bool = false)
      {
        j.lx(bool);
        AppMethodBeat.o(109077);
        return;
      }
    }
  }

  public static boolean cyg()
  {
    AppMethodBeat.i(109078);
    if (!j.cxO())
      cyf();
    boolean bool = j.cxQ();
    AppMethodBeat.o(109078);
    return bool;
  }

  public static long cyh()
  {
    AppMethodBeat.i(109079);
    if (j.cxR() == -1L)
    {
      com.tencent.mm.kernel.e locale = com.tencent.mm.kernel.g.RP();
      a.f.b.j.o(locale, "MMKernel.storage()");
      j.kZ(locale.Ry().a(ac.a.xWT, 0L));
    }
    long l = j.cxR();
    AppMethodBeat.o(109079);
    return l;
  }

  public static String getAccStoryCachePath()
  {
    AppMethodBeat.i(109075);
    Object localObject = com.tencent.mm.kernel.g.M(com.tencent.mm.plugin.story.api.e.class);
    a.f.b.j.o(localObject, "plugin<IPluginStory>(IPluginStory::class.java)");
    localObject = ((com.tencent.mm.plugin.story.api.e)localObject).getAccStoryCachePath();
    a.f.b.j.o(localObject, "plugin<IPluginStory>(IPl…s.java).accStoryCachePath");
    AppMethodBeat.o(109075);
    return localObject;
  }

  public static String getAccStoryPath()
  {
    AppMethodBeat.i(109074);
    Object localObject = com.tencent.mm.kernel.g.M(com.tencent.mm.plugin.story.api.e.class);
    a.f.b.j.o(localObject, "plugin<IPluginStory>(IPluginStory::class.java)");
    localObject = ((com.tencent.mm.plugin.story.api.e)localObject).getAccStoryPath();
    a.f.b.j.o(localObject, "plugin<IPluginStory>(IPl…:class.java).accStoryPath");
    AppMethodBeat.o(109074);
    return localObject;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.story.model.j.a
 * JD-Core Version:    0.6.2
 */