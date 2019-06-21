package com.tencent.mm.plugin.appbrand.jsapi.camera;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.jsapi.ah;
import com.tencent.mm.plugin.appbrand.jsapi.c;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

final class j$3
  implements android.support.v4.app.a.a
{
  j$3(j paramj, c paramc, e parame)
  {
  }

  public final void onRequestPermissionsResult(int paramInt, String[] paramArrayOfString, int[] paramArrayOfInt)
  {
    AppMethodBeat.i(126242);
    if (paramInt == 16)
      if ((paramArrayOfInt != null) && (paramArrayOfInt.length > 0) && (paramArrayOfInt[0] == 0))
      {
        a.a.aDb().hGi = true;
        this.hHc.a(this.hyd, this.hHb);
        AppMethodBeat.o(126242);
      }
    while (true)
    {
      return;
      paramArrayOfString = new HashMap();
      paramArrayOfString.put("cameraId", Integer.valueOf(this.hHb.getCameraId()));
      paramArrayOfString = new JSONObject(paramArrayOfString).toString();
      new g().j(this.hyd).AM(paramArrayOfString).aCj();
      a.a.aDb().hGi = false;
      AppMethodBeat.o(126242);
      continue;
      if (paramInt == 18)
      {
        if ((paramArrayOfInt != null) && (paramArrayOfInt.length > 0) && (paramArrayOfInt[0] == 0))
        {
          a.a.aDb().hGj = true;
          this.hHc.a(this.hyd, this.hHb);
          AppMethodBeat.o(126242);
        }
        else
        {
          paramArrayOfString = new HashMap();
          paramArrayOfString.put("cameraId", Integer.valueOf(this.hHb.getCameraId()));
          paramArrayOfString = new JSONObject(paramArrayOfString).toString();
          new g().j(this.hyd).AM(paramArrayOfString).aCj();
          a.a.aDb().hGj = false;
        }
      }
      else
        AppMethodBeat.o(126242);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.camera.j.3
 * JD-Core Version:    0.6.2
 */