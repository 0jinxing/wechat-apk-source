package com.tencent.mm.media.widget.camerarecordview.preview.a;

import a.l;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.media.widget.camerarecordview.preview.c;
import com.tencent.mm.plugin.mmsight.model.f;
import com.tencent.mm.sdk.platformtools.ab;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "onFrameData"})
final class b$a
  implements f
{
  b$a(b paramb)
  {
  }

  public final boolean O(byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(13310);
    b localb = this.fcB;
    if (paramArrayOfByte != null)
    {
      com.tencent.mm.media.h.a locala = localb.eXm;
      if (locala != null)
        com.tencent.mm.media.h.a.a(locala, paramArrayOfByte);
      localb.fcu.requestRender();
    }
    while (true)
    {
      AppMethodBeat.o(13310);
      return false;
      ab.v("MicroMsg.CameraPreviewGLSurfaceView", "passing draw");
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.media.widget.camerarecordview.preview.a.b.a
 * JD-Core Version:    0.6.2
 */