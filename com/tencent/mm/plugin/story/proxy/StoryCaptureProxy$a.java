package com.tencent.mm.plugin.story.proxy;

import a.f.b.j;
import a.l;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.remoteservice.d;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/story/proxy/StoryCaptureProxy$Companion;", "", "()V", "RESULT_KEY", "", "TAG", "getTAG", "()Ljava/lang/String;", "instance", "Lcom/tencent/mm/plugin/story/proxy/StoryCaptureProxy;", "getInstance", "()Lcom/tencent/mm/plugin/story/proxy/StoryCaptureProxy;", "setInstance", "(Lcom/tencent/mm/plugin/story/proxy/StoryCaptureProxy;)V", "createInstance", "", "serverProxy", "Lcom/tencent/mm/remoteservice/RemoteServiceProxy;", "plugin-story_release"})
public final class StoryCaptureProxy$a
{
  private static void a(StoryCaptureProxy paramStoryCaptureProxy)
  {
    AppMethodBeat.i(109705);
    j.p(paramStoryCaptureProxy, "<set-?>");
    StoryCaptureProxy.access$setInstance$cp(paramStoryCaptureProxy);
    AppMethodBeat.o(109705);
  }

  public static void createInstance(d paramd)
  {
    AppMethodBeat.i(109706);
    a(new StoryCaptureProxy(paramd));
    AppMethodBeat.o(109706);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.story.proxy.StoryCaptureProxy.a
 * JD-Core Version:    0.6.2
 */