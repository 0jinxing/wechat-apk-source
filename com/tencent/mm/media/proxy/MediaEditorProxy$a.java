package com.tencent.mm.media.proxy;

import a.f.b.j;
import a.l;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.remoteservice.d;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/media/proxy/MediaEditorProxy$Companion;", "", "()V", "RESULT_KEY", "", "TAG", "getTAG", "()Ljava/lang/String;", "instance", "Lcom/tencent/mm/media/proxy/MediaEditorProxy;", "getInstance", "()Lcom/tencent/mm/media/proxy/MediaEditorProxy;", "setInstance", "(Lcom/tencent/mm/media/proxy/MediaEditorProxy;)V", "createInstance", "", "serverProxy", "Lcom/tencent/mm/remoteservice/RemoteServiceProxy;", "plugin-mediaeditor_release"})
public final class MediaEditorProxy$a
{
  private static void a(MediaEditorProxy paramMediaEditorProxy)
  {
    AppMethodBeat.i(13000);
    j.p(paramMediaEditorProxy, "<set-?>");
    MediaEditorProxy.access$setInstance$cp(paramMediaEditorProxy);
    AppMethodBeat.o(13000);
  }

  public static void createInstance(d paramd)
  {
    AppMethodBeat.i(13001);
    a(new MediaEditorProxy(paramd));
    AppMethodBeat.o(13001);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.media.proxy.MediaEditorProxy.a
 * JD-Core Version:    0.6.2
 */