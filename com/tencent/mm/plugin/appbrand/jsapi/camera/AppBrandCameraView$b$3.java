package com.tencent.mm.plugin.appbrand.jsapi.camera;

import com.tencent.matrix.trace.core.AppMethodBeat;

final class AppBrandCameraView$b$3
  implements Runnable
{
  AppBrandCameraView$b$3(AppBrandCameraView.b paramb)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(130916);
    this.hGP.stopRecord();
    AppMethodBeat.o(130916);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.camera.AppBrandCameraView.b.3
 * JD-Core Version:    0.6.2
 */