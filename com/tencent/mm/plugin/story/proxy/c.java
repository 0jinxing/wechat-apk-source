package com.tencent.mm.plugin.story.proxy;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.story.h.e;
import com.tencent.mm.plugin.story.model.j.a;
import com.tencent.mm.protocal.protobuf.cee;
import com.tencent.mm.sdk.platformtools.ab;

@a.l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/story/proxy/StoryMixHandler;", "", "()V", "mixQueue", "Lcom/tencent/mm/loader/loader/LoaderCore;", "Lcom/tencent/mm/plugin/story/proxy/StoryMixHandler$MixTask;", "reStartMix", "", "storyEditorItem", "Lcom/tencent/mm/plugin/story/storage/StoryEditorData;", "Companion", "MixTask", "plugin-story_release"})
public final class c
{
  private static final String TAG = "MicroMsg.Media.StoryMixHandler";
  private static final a.f eQz;
  public static final c.a saU;
  private com.tencent.mm.loader.g.d<c.c> liD;

  static
  {
    AppMethodBeat.i(109755);
    saU = new c.a((byte)0);
    eQz = a.g.g((a.f.a.a)c.b.saV);
    TAG = "MicroMsg.Media.StoryMixHandler";
    AppMethodBeat.o(109755);
  }

  private c()
  {
    AppMethodBeat.i(109754);
    this.liD = new com.tencent.mm.loader.g.d((com.tencent.mm.loader.g.a.d)new com.tencent.mm.loader.g.a.g((com.tencent.mm.loader.g.a.c)new com.tencent.mm.loader.g.a.a(5), new com.tencent.mm.loader.g.a.h(), "storyMixTask"));
    AppMethodBeat.o(109754);
  }

  public final boolean a(com.tencent.mm.plugin.story.h.d paramd)
  {
    AppMethodBeat.i(109753);
    a.f.b.j.p(paramd, "storyEditorItem");
    ab.i(TAG, "reStart background mix2 " + paramd.xDa + " it " + paramd);
    this.liD.a((com.tencent.mm.loader.g.c)new c.c(paramd), (com.tencent.mm.loader.g.f)new c.e(this, paramd));
    AppMethodBeat.o(109753);
    return true;
  }

  public final boolean czM()
  {
    AppMethodBeat.i(109752);
    Object localObject = com.tencent.mm.plugin.story.model.j.rST;
    localObject = j.a.cxY().cBH();
    if (localObject != null)
    {
      ab.i(TAG, "reStart background mix1 " + ((com.tencent.mm.plugin.story.h.d)localObject).xDa + " it " + localObject);
      this.liD.a((com.tencent.mm.loader.g.c)new c.c((com.tencent.mm.plugin.story.h.d)localObject), (com.tencent.mm.loader.g.f)new c.d(this, (com.tencent.mm.plugin.story.h.d)localObject));
      AppMethodBeat.o(109752);
    }
    while (true)
    {
      return true;
      ab.d(TAG, "mix task is empty");
      AppMethodBeat.o(109752);
    }
  }

  @a.l(dWo={1, 1, 13}, dWp={""}, dWq={"<anonymous>", "", "run"})
  static final class c$a
    implements Runnable
  {
    c$a(c.c paramc)
    {
    }

    public final void run()
    {
      AppMethodBeat.i(109742);
      Object localObject1 = c.saU;
      ab.i(c.a.getTAG(), "call reStart background mix " + this.saX.saW.xDa + " it " + this.saX.saW + " mixRetryTime:" + this.saX.saW.field_mixRetryTime);
      localObject1 = (com.tencent.mm.bt.a)new cee();
      Object localObject3 = this.saX.saW.field_baseItemData;
      try
      {
        ((com.tencent.mm.bt.a)localObject1).parseFrom((byte[])localObject3);
        localObject1 = (cee)localObject1;
        if (localObject1 != null)
        {
          localObject3 = com.tencent.mm.plugin.story.g.f.sbT;
          com.tencent.mm.plugin.story.g.f.lG(((cee)localObject1).fbV);
        }
        if (this.saX.saW.field_mixRetryTime < 3)
        {
          localObject3 = com.tencent.mm.plugin.story.f.l.sac;
          com.tencent.mm.plugin.story.f.l.lg(this.saX.saW.xDa);
          if (localObject1 != null)
          {
            localObject1 = com.tencent.mm.plugin.story.model.j.rST;
            localObject1 = j.a.cxY().ls(this.saX.saW.xDa);
            if (localObject1 != null)
              this.saX.saW = ((com.tencent.mm.plugin.story.h.d)localObject1);
          }
          c.c.a(this.saX);
          AppMethodBeat.o(109742);
          return;
        }
      }
      catch (Exception localException)
      {
        while (true)
        {
          ab.b("safeParser", "", new Object[] { localException });
          Object localObject2 = null;
          continue;
          localObject3 = c.saU;
          ab.i(c.a.getTAG(), "retry mix third and still failed");
          localObject3 = com.tencent.mm.plugin.story.f.l.sac;
          com.tencent.mm.plugin.story.f.l.lf(this.saX.saW.xDa);
          if (localObject2 != null)
          {
            localObject3 = com.tencent.mm.plugin.story.g.f.sbT;
            com.tencent.mm.plugin.story.g.f.lI(localObject2.fbV);
          }
          this.saX.a(com.tencent.mm.loader.g.h.eRk);
          AppMethodBeat.o(109742);
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.story.proxy.c
 * JD-Core Version:    0.6.2
 */