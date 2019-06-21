package com.tencent.mm.plugin.mmsight.ui.cameraglview;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.mmsight.model.f;
import com.tencent.mm.sdk.platformtools.ab;

final class a$1
  implements f
{
  a$1(a parama)
  {
  }

  public final boolean O(byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(55309);
    if (this.oDE.oDD != null)
    {
      MMSightCameraGLSurfaceView localMMSightCameraGLSurfaceView = this.oDE.oDD;
      if ((paramArrayOfByte == null) || (localMMSightCameraGLSurfaceView.oDF == null) || (localMMSightCameraGLSurfaceView.oDF.gLv))
        break label76;
      localMMSightCameraGLSurfaceView.oDF.b(paramArrayOfByte, localMMSightCameraGLSurfaceView.gLw, localMMSightCameraGLSurfaceView.gLx, localMMSightCameraGLSurfaceView.fcf, false);
      localMMSightCameraGLSurfaceView.requestRender();
    }
    while (true)
    {
      AppMethodBeat.o(55309);
      return false;
      label76: ab.v("MicroMsg.MMSightCameraGLSurfaceView", "passing draw");
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.mmsight.ui.cameraglview.a.1
 * JD-Core Version:    0.6.2
 */