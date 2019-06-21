package com.tencent.mm.plugin.appbrand.jsapi.media;

import android.support.v4.app.a.a;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.jsapi.c;
import com.tencent.mm.plugin.appbrand.jsapi.m;
import org.json.JSONObject;

final class JsApiChooseVideo$3
  implements a.a
{
  JsApiChooseVideo$3(JsApiChooseVideo paramJsApiChooseVideo, c paramc, JSONObject paramJSONObject, int paramInt)
  {
  }

  public final void onRequestPermissionsResult(int paramInt, String[] paramArrayOfString, int[] paramArrayOfInt)
  {
    AppMethodBeat.i(131271);
    if (paramInt != 115)
      AppMethodBeat.o(131271);
    while (true)
    {
      return;
      if ((paramArrayOfInt != null) && (paramArrayOfInt.length > 0) && (paramArrayOfInt[0] == 0))
      {
        this.hPQ.a(this.hxc, this.hsm, this.eIl);
        AppMethodBeat.o(131271);
      }
      else
      {
        this.hxc.M(this.eIl, this.hPQ.j("fail:system permission denied", null));
        AppMethodBeat.o(131271);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.media.JsApiChooseVideo.3
 * JD-Core Version:    0.6.2
 */