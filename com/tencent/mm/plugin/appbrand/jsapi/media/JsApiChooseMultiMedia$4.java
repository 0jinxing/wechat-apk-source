package com.tencent.mm.plugin.appbrand.jsapi.media;

import android.support.v4.app.a.a;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.jsapi.c;
import com.tencent.mm.plugin.appbrand.jsapi.m;
import org.json.JSONObject;

final class JsApiChooseMultiMedia$4
  implements a.a
{
  JsApiChooseMultiMedia$4(JsApiChooseMultiMedia paramJsApiChooseMultiMedia, c paramc, JSONObject paramJSONObject, int paramInt)
  {
  }

  public final void onRequestPermissionsResult(int paramInt, String[] paramArrayOfString, int[] paramArrayOfInt)
  {
    AppMethodBeat.i(131220);
    if (paramInt != 113)
      AppMethodBeat.o(131220);
    while (true)
    {
      return;
      if ((paramArrayOfInt != null) && (paramArrayOfInt.length > 0) && (paramArrayOfInt[0] == 0))
      {
        this.hPH.a(this.hxc, this.hsm, this.eIl);
        AppMethodBeat.o(131220);
      }
      else
      {
        this.hxc.M(this.eIl, this.hPH.j("fail:system permission denied", null));
        AppMethodBeat.o(131220);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.media.JsApiChooseMultiMedia.4
 * JD-Core Version:    0.6.2
 */