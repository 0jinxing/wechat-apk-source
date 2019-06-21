package com.tencent.mm.plugin.appbrand.jsapi.audio;

import android.support.v4.app.a.a;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.jsapi.m;
import com.tencent.mm.plugin.appbrand.q;
import org.json.JSONObject;

final class JsApiStartRecordVoice$4
  implements a.a
{
  JsApiStartRecordVoice$4(JsApiStartRecordVoice paramJsApiStartRecordVoice, q paramq, JSONObject paramJSONObject, int paramInt)
  {
  }

  public final void onRequestPermissionsResult(int paramInt, String[] paramArrayOfString, int[] paramArrayOfInt)
  {
    AppMethodBeat.i(130787);
    if (paramInt != 116)
      AppMethodBeat.o(130787);
    while (true)
    {
      return;
      if ((paramArrayOfInt != null) && (paramArrayOfInt.length > 0) && (paramArrayOfInt[0] == 0))
      {
        this.hBk.a(this.hsD, this.hsm, this.eIl);
        AppMethodBeat.o(130787);
      }
      else
      {
        this.hsD.M(this.eIl, this.hBk.j("fail:system permission denied", null));
        AppMethodBeat.o(130787);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.audio.JsApiStartRecordVoice.4
 * JD-Core Version:    0.6.2
 */