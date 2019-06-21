package com.tencent.mm.plugin.story.model.g;

import a.l;
import a.y;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ab.b;
import com.tencent.mm.ai.m;
import com.tencent.mm.g.b.a.ay;
import com.tencent.mm.loader.g.a.g;
import com.tencent.mm.plugin.story.model.j.a;
import com.tencent.mm.protocal.protobuf.cea;
import com.tencent.mm.protocal.protobuf.cek;
import com.tencent.mm.protocal.protobuf.cel;
import com.tencent.mm.protocal.protobuf.cfb;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.at;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.HashSet;
import java.util.LinkedList;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/story/model/upload/UploadManager;", "Lcom/tencent/mm/modelbase/IOnSceneEnd;", "()V", "listeners", "Ljava/util/HashSet;", "Lcom/tencent/mm/plugin/story/api/IStoryPostListener;", "onFakeDataUpdateCallback", "Lkotlin/Function0;", "", "postCallback", "com/tencent/mm/plugin/story/model/upload/UploadManager$postCallback$1", "Lcom/tencent/mm/plugin/story/model/upload/UploadManager$postCallback$1;", "postQueue", "Lcom/tencent/mm/loader/loader/LoaderCore;", "Lcom/tencent/mm/plugin/story/model/upload/PostTask;", "uploadCallback", "com/tencent/mm/plugin/story/model/upload/UploadManager$uploadCallback$1", "Lcom/tencent/mm/plugin/story/model/upload/UploadManager$uploadCallback$1;", "uploadQueue", "Lcom/tencent/mm/plugin/story/model/upload/UploadTask;", "addFakeDataListener", "onFakeDataUpdate", "addPostEndListener", "listener", "checkMixStory", "checkPost", "notifyEndPost", "localId", "", "isOk", "", "notifyEventPost", "notifyStartPost", "onSceneEnd", "errType", "errCode", "errMsg", "", "scene", "Lcom/tencent/mm/modelbase/NetSceneBase;", "removeFakeDataListener", "removePostEndListener", "start", "startPost", "stop", "Companion", "plugin-story_release"})
public final class c
  implements com.tencent.mm.ai.f
{
  public static final c.a rXO;
  private final HashSet<com.tencent.mm.plugin.story.api.j> listeners;
  public com.tencent.mm.loader.g.d<e> rXA;
  public com.tencent.mm.loader.g.d<a> rXK;
  public a.f.a.a<y> rXL;
  public final c.f rXM;
  public final h rXN;

  static
  {
    AppMethodBeat.i(109466);
    rXO = new c.a((byte)0);
    AppMethodBeat.o(109466);
  }

  public c()
  {
    AppMethodBeat.i(109465);
    this.rXK = new com.tencent.mm.loader.g.d((com.tencent.mm.loader.g.a.d)new g((com.tencent.mm.loader.g.a.c)new com.tencent.mm.loader.g.a.a(100), new com.tencent.mm.loader.g.a.h(), "storyPost"));
    this.rXA = new com.tencent.mm.loader.g.d((com.tencent.mm.loader.g.a.d)new g((com.tencent.mm.loader.g.a.c)new com.tencent.mm.loader.g.a.a(100), new com.tencent.mm.loader.g.a.h(), "storyUpload"));
    this.rXM = new c.f(this);
    this.rXN = new h();
    this.listeners = new HashSet();
    AppMethodBeat.o(109465);
  }

  private final void ah(int paramInt, boolean paramBoolean)
  {
    AppMethodBeat.i(109463);
    b.a((a.f.a.a)new c.c(this, paramInt, paramBoolean));
    AppMethodBeat.o(109463);
  }

  private static void czw()
  {
    AppMethodBeat.i(109458);
    com.tencent.mm.plugin.story.proxy.c.a locala = com.tencent.mm.plugin.story.proxy.c.saU;
    com.tencent.mm.plugin.story.proxy.c.a.czN().czM();
    AppMethodBeat.o(109458);
  }

  public final void a(final com.tencent.mm.plugin.story.api.j paramj)
  {
    AppMethodBeat.i(109461);
    b.a((a.f.a.a)new b(this, paramj));
    AppMethodBeat.o(109461);
  }

  public final void b(com.tencent.mm.plugin.story.api.j paramj)
  {
    AppMethodBeat.i(109462);
    b.a((a.f.a.a)new c.g(this, paramj));
    AppMethodBeat.o(109462);
  }

  public final void checkPost()
  {
    AppMethodBeat.i(109457);
    czw();
    Object localObject1 = com.tencent.mm.plugin.story.model.j.rST;
    localObject1 = j.a.cxT().cCc();
    if (localObject1 == null)
    {
      ab.d("MicroMsg.StoryUploadTask", "All has post");
      AppMethodBeat.o(109457);
    }
    while (true)
    {
      return;
      ab.d("MicroMsg.StoryUploadTask", "checking story from db, will post: " + ((com.tencent.mm.plugin.story.h.j)localObject1).field_storyID + ' ' + (int)((com.tencent.mm.plugin.story.h.j)localObject1).xDa + ' ' + ((com.tencent.mm.plugin.story.h.j)localObject1).field_userName + ' ' + ((com.tencent.mm.plugin.story.h.j)localObject1).cBU().eRu);
      Object localObject2 = new a((com.tencent.mm.plugin.story.h.j)localObject1, this.rXA);
      this.rXK.a((com.tencent.mm.loader.g.c)localObject2);
      localObject2 = com.tencent.mm.plugin.story.g.h.scu;
      com.tencent.mm.plugin.story.g.h.EY((int)((com.tencent.mm.plugin.story.h.j)localObject1).xDa).co(bo.anU());
      localObject2 = com.tencent.mm.plugin.story.g.h.scu;
      com.tencent.mm.plugin.story.g.h.EY((int)((com.tencent.mm.plugin.story.h.j)localObject1).xDa).cG(at.gC(ah.getContext()));
      AppMethodBeat.o(109457);
    }
  }

  public final void czx()
  {
    AppMethodBeat.i(109460);
    a.f.a.a locala = this.rXL;
    if (locala != null)
    {
      locala.invoke();
      AppMethodBeat.o(109460);
    }
    while (true)
    {
      return;
      AppMethodBeat.o(109460);
    }
  }

  public final void e(a.f.a.a<y> parama)
  {
    AppMethodBeat.i(109459);
    a.f.b.j.p(parama, "onFakeDataUpdate");
    this.rXL = parama;
    AppMethodBeat.o(109459);
  }

  public final void onSceneEnd(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(109464);
    if (!(paramm instanceof com.tencent.mm.plugin.story.model.a.h));
    for (paramString = null; ; paramString = paramm)
    {
      paramString = (com.tencent.mm.plugin.story.model.a.h)paramString;
      if (paramString != null)
        if ((paramInt1 == 4) || (paramInt2 == 0))
          ah(paramString.cNE, true);
      while (true)
      {
        try
        {
          paramm = com.tencent.mm.plugin.story.model.j.rST;
          paramm = j.a.cxT().Fe(paramString.cNE);
          if (paramm != null)
          {
            com.tencent.mm.plugin.story.g.h localh = com.tencent.mm.plugin.story.g.h.scu;
            com.tencent.mm.plugin.story.g.h.EY(paramString.cNE).fQ(String.valueOf(paramm.field_storyID));
            localh = com.tencent.mm.plugin.story.g.h.scu;
            com.tencent.mm.plugin.story.g.h.EY(paramString.cNE).fO(((cek)paramm.cBR().xeA.wbK.get(0)).Url);
            paramm = com.tencent.mm.plugin.story.g.h.scu;
            com.tencent.mm.plugin.story.g.h.EY(paramString.cNE).cp(bo.anU());
            paramm = com.tencent.mm.plugin.story.g.h.scu;
            com.tencent.mm.plugin.story.g.h.EZ(paramString.cNE);
            paramString = y.AUy;
            AppMethodBeat.o(109464);
            return;
          }
          AppMethodBeat.o(109464);
          continue;
        }
        catch (Exception paramString)
        {
          ab.printErrStackTrace("MicroMsg.StoryUploadTask", (Throwable)paramString, "upload error", new Object[0]);
          paramString = y.AUy;
          AppMethodBeat.o(109464);
          continue;
        }
        ah(paramString.cNE, false);
        AppMethodBeat.o(109464);
      }
    }
  }

  @l(dWo={1, 1, 13}, dWp={""}, dWq={"<anonymous>", "", "invoke"})
  static final class b extends a.f.b.k
    implements a.f.a.a<y>
  {
    b(c paramc, com.tencent.mm.plugin.story.api.j paramj)
    {
      super();
    }
  }

  @l(dWo={1, 1, 13}, dWp={""}, dWq={"com/tencent/mm/plugin/story/model/upload/UploadManager$uploadCallback$1", "Lcom/tencent/mm/loader/loader/LoaderCoreCallback;", "Lcom/tencent/mm/plugin/story/model/upload/UploadTask;", "onLoaderFin", "", "task", "status", "Lcom/tencent/mm/loader/loader/WorkStatus;", "plugin-story_release"})
  public static final class h
    implements com.tencent.mm.loader.g.f<e>
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.story.model.g.c
 * JD-Core Version:    0.6.2
 */