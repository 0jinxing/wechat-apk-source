package com.tencent.mm.plugin.story.proxy;

import a.f.a.q;
import a.f.b.k;
import a.l;
import a.y;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.loader.g.c;
import com.tencent.mm.plugin.story.e.a;
import com.tencent.mm.protocal.protobuf.cee;
import com.tencent.mm.protocal.protobuf.cei;
import com.tencent.mm.sdk.g.a.e;
import java.util.ArrayList;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/story/proxy/StoryMixHandler$MixTask;", "Lcom/tencent/mm/loader/loader/IWorkTask;", "editorData", "Lcom/tencent/mm/plugin/story/storage/StoryEditorData;", "(Lcom/tencent/mm/plugin/story/storage/StoryEditorData;)V", "isCaptureVideo", "", "location", "Lcom/tencent/mm/protocal/protobuf/StoryLocation;", "startPerformance", "", "call", "", "runMix", "uniqueId", "", "plugin-story_release"})
public final class c$c extends c
{
  int ehv;
  private boolean fbV;
  private cei rWk;
  com.tencent.mm.plugin.story.h.d saW;

  public c$c(com.tencent.mm.plugin.story.h.d paramd)
  {
    AppMethodBeat.i(109746);
    this.saW = paramd;
    AppMethodBeat.o(109746);
  }

  public final void Pa()
  {
    AppMethodBeat.i(109744);
    com.tencent.mm.sdk.g.d.xDG.b((Runnable)new c.c.a(this), "StoryMixHandler");
    AppMethodBeat.o(109744);
  }

  public final String Pc()
  {
    AppMethodBeat.i(109745);
    String str = "mixTask_" + this.saW + ".localId";
    AppMethodBeat.o(109745);
    return str;
  }

  @l(dWo={1, 1, 13}, dWp={""}, dWq={"<anonymous>", "", "mixVideoPath", "", "mixThumb", "ret", "", "invoke", "com/tencent/mm/plugin/story/proxy/StoryMixHandler$MixTask$runMix$1$1"})
  static final class b extends k
    implements q<String, String, Boolean, y>
  {
    b(a parama, ArrayList paramArrayList, c.c paramc, cee paramcee)
    {
      super();
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.story.proxy.c.c
 * JD-Core Version:    0.6.2
 */