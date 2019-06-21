package com.tencent.mm.plugin.appbrand.jsapi.camera;

import android.graphics.Bitmap;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.mmsight.api.MMSightRecordView;
import com.tencent.mm.plugin.mmsight.api.MMSightRecordView.h;
import com.tencent.mm.plugin.sight.base.d;
import com.tencent.mm.sdk.platformtools.ab;

final class AppBrandCameraView$b$2
  implements MMSightRecordView.h
{
  AppBrandCameraView$b$2(AppBrandCameraView.b paramb)
  {
  }

  public final void dX(boolean paramBoolean)
  {
    AppMethodBeat.i(130915);
    ab.i("MicroMsg.AppBrandCameraView", "onRecordFinish error %b", new Object[] { Boolean.valueOf(paramBoolean) });
    if (AppBrandCameraView.f(this.hGP.hGO) == null)
    {
      ab.i("MicroMsg.AppBrandCameraView", "onRecordFinish recordView is null");
      AppBrandCameraView.b.a(this.hGP, -1, "camera is null", null, null);
      AppMethodBeat.o(130915);
      return;
    }
    this.hGP.hGO.hGH = 1;
    if (paramBoolean)
      AppBrandCameraView.b.a(this.hGP, -1, "stop error", null, null);
    while (true)
    {
      AppBrandCameraView.v(this.hGP.hGO);
      AppBrandCameraView.a(this.hGP.hGO, false);
      AppMethodBeat.o(130915);
      break;
      Object localObject = AppBrandCameraView.f(this.hGP.hGO).getVideoFilePath();
      int i = AppBrandCameraView.s(this.hGP.hGO);
      int j = AppBrandCameraView.t(this.hGP.hGO);
      AppBrandCameraView.f(this.hGP.hGO).getCameraRotation();
      localObject = d.ag((String)localObject, i, j);
      this.hGP.a((Bitmap)localObject, AppBrandCameraView.u(this.hGP.hGO));
      AppBrandCameraView.b.a(this.hGP, 0, "", AppBrandCameraView.u(this.hGP.hGO), AppBrandCameraView.f(this.hGP.hGO).getVideoFilePath());
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.camera.AppBrandCameraView.b.2
 * JD-Core Version:    0.6.2
 */