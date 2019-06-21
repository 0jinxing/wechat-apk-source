package com.tencent.mm.plugin.appbrand.jsapi.live;

import android.app.Activity;
import android.support.v4.app.a.a;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.jsapi.c;
import com.tencent.mm.plugin.appbrand.jsapi.m;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;
import org.json.JSONObject;

final class b$3
  implements a.a
{
  b$3(b paramb, Activity paramActivity, c paramc, JSONObject paramJSONObject, int paramInt)
  {
  }

  public final void onRequestPermissionsResult(int paramInt, String[] paramArrayOfString, int[] paramArrayOfInt)
  {
    AppMethodBeat.i(96089);
    ab.i("MicroMsg.JsApiInsertLivePusher", "onRequestPermissionsResult callback requestCode:%d", new Object[] { Integer.valueOf(paramInt) });
    if (paramInt == 117)
      if ((paramArrayOfInt != null) && (paramArrayOfInt.length > 0) && (paramArrayOfInt[0] == 0))
      {
        al.n(new b.3.1(this), 50L);
        AppMethodBeat.o(96089);
      }
    while (true)
    {
      return;
      ab.i("MicroMsg.JsApiInsertLivePusher", "onRequestPermissionsResult callback not grant");
      this.hyd.M(this.eIl, this.hLy.j("fail:system permission denied", null));
      AppMethodBeat.o(96089);
      continue;
      if (paramInt == 118)
      {
        if ((paramArrayOfInt != null) && (paramArrayOfInt.length > 0) && (paramArrayOfInt[0] == 0))
        {
          al.n(new b.3.2(this), 50L);
          AppMethodBeat.o(96089);
        }
        else
        {
          ab.i("MicroMsg.JsApiInsertLivePusher", "onRequestPermissionsResult callback not grant");
          this.hyd.M(this.eIl, this.hLy.j("fail:system permission denied", null));
        }
      }
      else
        AppMethodBeat.o(96089);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.live.b.3
 * JD-Core Version:    0.6.2
 */