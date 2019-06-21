package com.tencent.mm.plugin.appbrand.jsapi.camera;

import android.graphics.Bitmap;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.mmsight.api.MMSightRecordView.g;

final class AppBrandCameraView$b$1
  implements MMSightRecordView.g
{
  AppBrandCameraView$b$1(AppBrandCameraView.b paramb)
  {
  }

  public final void F(Bitmap paramBitmap)
  {
    AppMethodBeat.i(130913);
    if (paramBitmap != null)
      if (this.hGP.a(paramBitmap, AppBrandCameraView.l(this.hGP.hGO)))
      {
        AppBrandCameraView.a(this.hGP.hGO, 0, AppBrandCameraView.b.g(AppBrandCameraView.b(this.hGP.hGO), AppBrandCameraView.l(this.hGP.hGO)), "");
        AppMethodBeat.o(130913);
      }
    while (true)
    {
      return;
      AppBrandCameraView.a(this.hGP.hGO, -1, null, "save fail");
      AppMethodBeat.o(130913);
      continue;
      AppBrandCameraView.a(this.hGP.hGO, -1, null, "bitmap is null");
      AppMethodBeat.o(130913);
    }
  }

  public final void aDq()
  {
    AppMethodBeat.i(130914);
    AppBrandCameraView.a(this.hGP.hGO, -1, null, "take picture error");
    AppMethodBeat.o(130914);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.camera.AppBrandCameraView.b.1
 * JD-Core Version:    0.6.2
 */