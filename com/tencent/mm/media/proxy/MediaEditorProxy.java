package com.tencent.mm.media.proxy;

import a.f.b.j;
import a.l;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.remoteservice.a;
import com.tencent.mm.remoteservice.d;
import com.tencent.mm.remoteservice.f;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/media/proxy/MediaEditorProxy;", "Lcom/tencent/mm/remoteservice/BaseClientRequest;", "serverProxy", "Lcom/tencent/mm/remoteservice/RemoteServiceProxy;", "(Lcom/tencent/mm/remoteservice/RemoteServiceProxy;)V", "getAccPath", "", "getAccPathRemote", "Companion", "plugin-mediaeditor_release"})
public final class MediaEditorProxy extends a
{
  private static final String RESULT_KEY = "result_key";
  private static final String TAG = "MicroMsg.StoryCaptureProxy";
  public static MediaEditorProxy eWY;
  public static final MediaEditorProxy.a eWZ;

  static
  {
    AppMethodBeat.i(13004);
    eWZ = new MediaEditorProxy.a((byte)0);
    TAG = "MicroMsg.StoryCaptureProxy";
    RESULT_KEY = "result_key";
    AppMethodBeat.o(13004);
  }

  public MediaEditorProxy(d paramd)
  {
    super(paramd);
  }

  public static final void createInstance(d paramd)
  {
    AppMethodBeat.i(13006);
    MediaEditorProxy.a.createInstance(paramd);
    AppMethodBeat.o(13006);
  }

  public final String getAccPath()
  {
    AppMethodBeat.i(13002);
    Object localObject = g.RP();
    j.o(localObject, "MMKernel.storage()");
    localObject = ((e)localObject).getAccPath();
    j.o(localObject, "MMKernel.storage().accPath");
    AppMethodBeat.o(13002);
    return localObject;
  }

  @f
  public final String getAccPathRemote()
  {
    AppMethodBeat.i(13003);
    Object localObject = g.RP();
    j.o(localObject, "MMKernel.storage()");
    localObject = ((e)localObject).getAccPath();
    j.o(localObject, "MMKernel.storage().accPath");
    AppMethodBeat.o(13003);
    return localObject;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.media.proxy.MediaEditorProxy
 * JD-Core Version:    0.6.2
 */