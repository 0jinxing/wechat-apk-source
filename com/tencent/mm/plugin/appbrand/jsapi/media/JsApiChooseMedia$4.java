package com.tencent.mm.plugin.appbrand.jsapi.media;

import android.support.v4.app.a.a;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.jsapi.c;
import com.tencent.mm.plugin.appbrand.jsapi.m;
import com.tencent.mm.sdk.platformtools.ab;
import org.json.JSONObject;

final class JsApiChooseMedia$4
  implements a.a
{
  JsApiChooseMedia$4(JsApiChooseMedia paramJsApiChooseMedia, c paramc, JSONObject paramJSONObject, int paramInt)
  {
  }

  public final void onRequestPermissionsResult(int paramInt, String[] paramArrayOfString, int[] paramArrayOfInt)
  {
    AppMethodBeat.i(131157);
    if (paramInt != 119)
    {
      ab.e("MicroMsg.JsApiChooseMedia", "requestCameraPermission requestCode is not for choose media");
      AppMethodBeat.o(131157);
    }
    while (true)
    {
      return;
      if ((paramArrayOfInt != null) && (paramArrayOfInt.length > 0) && (paramArrayOfInt[0] == 0))
      {
        ab.i("MicroMsg.JsApiChooseMedia", "requestCameraPermission permission is grant for choose media");
        this.hPj.a(this.hxc, this.hsm, this.eIl);
        AppMethodBeat.o(131157);
      }
      else
      {
        ab.e("MicroMsg.JsApiChooseMedia", "requestCameraPermission sys perm denied for choose media");
        this.hxc.M(this.eIl, this.hPj.j("fail:system permission denied", null));
        AppMethodBeat.o(131157);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.media.JsApiChooseMedia.4
 * JD-Core Version:    0.6.2
 */