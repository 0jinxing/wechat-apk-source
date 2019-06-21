package com.tencent.mm.plugin.appbrand.jsapi.camera;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.jsapi.ah;
import com.tencent.mm.plugin.mmsight.api.MMSightRecordView.d;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

final class AppBrandCameraView$2
  implements MMSightRecordView.d
{
  AppBrandCameraView$2(AppBrandCameraView paramAppBrandCameraView)
  {
  }

  public final void aDo()
  {
    AppMethodBeat.i(130910);
    ab.w("MicroMsg.AppBrandCameraView", "InitErrorCallback");
    Object localObject = new HashMap();
    ((Map)localObject).put("cameraId", Integer.valueOf(AppBrandCameraView.a(this.hGO)));
    localObject = new JSONObject((Map)localObject).toString();
    new g().j(AppBrandCameraView.b(this.hGO)).AM((String)localObject).aCj();
    AppMethodBeat.o(130910);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.camera.AppBrandCameraView.2
 * JD-Core Version:    0.6.2
 */