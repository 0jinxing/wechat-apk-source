package com.tencent.mm.plugin.story.model.g;

import a.l;
import a.v;
import a.y;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.kernel.g;
import com.tencent.mm.loader.g.c;
import com.tencent.mm.loader.g.d;
import com.tencent.mm.loader.g.h;
import com.tencent.mm.platformtools.ae;
import com.tencent.mm.plugin.story.model.j.a;
import com.tencent.mm.plugin.story.model.p.a;
import com.tencent.mm.protocal.protobuf.cel;
import com.tencent.mm.protocal.protobuf.cfb;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.HashSet;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/story/model/upload/PostTask;", "Lcom/tencent/mm/loader/loader/IWorkTask;", "Lcom/tencent/mm/modelbase/IOnSceneEnd;", "storyInfo", "Lcom/tencent/mm/plugin/story/storage/StoryInfo;", "uploadQueue", "Lcom/tencent/mm/loader/loader/LoaderCore;", "Lcom/tencent/mm/plugin/story/model/upload/UploadTask;", "(Lcom/tencent/mm/plugin/story/storage/StoryInfo;Lcom/tencent/mm/loader/loader/LoaderCore;)V", "listeners", "Ljava/util/HashSet;", "Lcom/tencent/mm/plugin/story/api/IStoryPostListener;", "getStoryInfo", "()Lcom/tencent/mm/plugin/story/storage/StoryInfo;", "setStoryInfo", "(Lcom/tencent/mm/plugin/story/storage/StoryInfo;)V", "uploadCallback", "com/tencent/mm/plugin/story/model/upload/PostTask$uploadCallback$1", "Lcom/tencent/mm/plugin/story/model/upload/PostTask$uploadCallback$1;", "call", "", "notifyError", "errType", "", "errMsg", "", "mediaLocalId", "notifyEventUI", "localId", "isOk", "", "onSceneEnd", "errCode", "scene", "Lcom/tencent/mm/modelbase/NetSceneBase;", "reLoadPostInfo", "Lcom/tencent/mm/protocal/protobuf/StoryMediaPostInfo;", "startPost", "storyPost", "content", "clientId", "tryPost", "postInfo", "uniqueId", "Companion", "plugin-story_release"})
public final class a extends c
  implements com.tencent.mm.ai.f
{
  public static final a.a rXB;
  private final HashSet<com.tencent.mm.plugin.story.api.j> listeners;
  private final d<e> rXA;
  private final a.g rXy;
  com.tencent.mm.plugin.story.h.j rXz;

  static
  {
    AppMethodBeat.i(109440);
    rXB = new a.a((byte)0);
    AppMethodBeat.o(109440);
  }

  public a(com.tencent.mm.plugin.story.h.j paramj, d<e> paramd)
  {
    AppMethodBeat.i(109439);
    this.rXz = paramj;
    this.rXA = paramd;
    this.rXy = new a.g();
    this.listeners = new HashSet();
    AppMethodBeat.o(109439);
  }

  private final void bk(int paramInt, String paramString)
  {
    AppMethodBeat.i(109437);
    ab.i("MicroMsg.StoryPostTask", "processError localId " + (int)this.rXz.xDa + " processError " + paramInt + " errMsg: " + paramString);
    f localf = f.rXY;
    f.a(this.rXz, paramInt, paramString, (a.f.a.a)new a.c(this));
    AppMethodBeat.o(109437);
  }

  private final cel czu()
  {
    AppMethodBeat.i(109433);
    Object localObject1 = new cel().parseFrom(this.rXz.field_postBuf);
    if (localObject1 == null)
    {
      localObject1 = new v("null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.StoryMediaPostInfo");
      AppMethodBeat.o(109433);
      throw ((Throwable)localObject1);
    }
    localObject1 = (cel)localObject1;
    Object localObject2 = this.rXz;
    byte[] arrayOfByte = ((cel)localObject1).toByteArray();
    a.f.b.j.o(arrayOfByte, "postInfo.toByteArray()");
    ((com.tencent.mm.plugin.story.h.j)localObject2).bk(arrayOfByte);
    localObject2 = com.tencent.mm.plugin.story.model.j.rST;
    j.a.cxT().a((int)this.rXz.xDa, this.rXz);
    AppMethodBeat.o(109433);
    return localObject1;
  }

  public final void Pa()
  {
    AppMethodBeat.i(109434);
    Object localObject1 = (cel)com.tencent.mm.ab.b.a((com.tencent.mm.bt.a)new cel(), this.rXz.field_postBuf, (a.f.a.b)new b(this));
    Object localObject2;
    if (localObject1 != null)
    {
      if (com.tencent.mm.plugin.story.h.j.ac(((cel)localObject1).eRu, ((cel)localObject1).wFi))
      {
        localObject2 = com.tencent.mm.plugin.story.h.a.sdm;
        bk(com.tencent.mm.plugin.story.h.a.cBi(), "this item isTimeLimit");
        ab.i("MicroMsg.StoryPostTask", "StoryInfo localId it time limit " + (int)this.rXz.xDa + " is die count " + ((cel)localObject1).eRu + " time: " + ((cel)localObject1).wFi);
        AppMethodBeat.o(109434);
      }
      while (true)
      {
        return;
        int i = ((cel)localObject1).wFD;
        localObject2 = com.tencent.mm.plugin.story.h.a.e.sdz;
        if (i != com.tencent.mm.plugin.story.h.a.e.cBz())
          break label360;
        localObject1 = czu();
        if (com.tencent.mm.plugin.story.h.j.ac(((cel)localObject1).eRu, ((cel)localObject1).wFi))
        {
          localObject2 = com.tencent.mm.plugin.story.h.a.sdm;
          bk(com.tencent.mm.plugin.story.h.a.cBi(), "this item isTimeLimit");
          ab.i("MicroMsg.StoryPostTask", "storyInfo localId it time limit " + (int)this.rXz.xDa + " is die ");
          AppMethodBeat.o(109434);
        }
        else
        {
          cfb localcfb = this.rXz.cBR();
          localObject2 = com.tencent.mm.plugin.story.model.p.rTj;
          localObject2 = p.a.a(localcfb, ((cel)localObject1).xej);
          ab.i("MicroMsg.StoryPostTask", "startPost content " + (String)localObject2 + "  testValue " + ae.gjA);
          if (!a.f.b.j.j(localObject2, ""))
            break;
          localObject2 = com.tencent.mm.plugin.story.h.a.sdm;
          bk(com.tencent.mm.plugin.story.h.a.cBh(), "content is error");
          AppMethodBeat.o(109434);
        }
      }
      if (!ae.gjA)
        break label404;
      localObject2 = "<Test>Android Test Fail</Test>";
    }
    label404: 
    while (true)
    {
      localObject1 = ((cel)localObject1).ptv;
      a.f.b.j.o(localObject1, "postInfo.ClientId");
      com.tencent.mm.ab.b.a((a.f.a.a)new a.e(this, (String)localObject2, (String)localObject1));
      AppMethodBeat.o(109434);
      break;
      label360: localObject2 = com.tencent.mm.plugin.story.h.a.e.sdz;
      this.rXA.a((c)new e(this.rXz), (com.tencent.mm.loader.g.f)new a.f(this));
      AppMethodBeat.o(109434);
      break;
    }
  }

  public final String Pc()
  {
    AppMethodBeat.i(109436);
    int i = (int)this.rXz.xDa;
    AppMethodBeat.o(109436);
    return String.valueOf(i);
  }

  public final void onSceneEnd(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(109435);
    paramString = g.RO();
    a.f.b.j.o(paramString, "MMKernel.network()");
    paramString.Rg().b(351, (com.tencent.mm.ai.f)this);
    a(h.eRj);
    AppMethodBeat.o(109435);
  }

  @l(dWo={1, 1, 13}, dWp={""}, dWq={"<anonymous>", "", "it", "Ljava/lang/Exception;", "invoke"})
  static final class b extends a.f.b.k
    implements a.f.a.b<Exception, y>
  {
    b(a parama)
    {
      super();
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.story.model.g.a
 * JD-Core Version:    0.6.2
 */