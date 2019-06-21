package com.tencent.mm.plugin.appbrand.jsapi.contact;

import android.support.v4.app.a.a;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.jsapi.c;
import com.tencent.mm.plugin.appbrand.jsapi.m;
import org.json.JSONObject;

final class f$1
  implements a.a
{
  f$1(f paramf, c paramc, JSONObject paramJSONObject, int paramInt)
  {
  }

  public final void onRequestPermissionsResult(int paramInt, String[] paramArrayOfString, int[] paramArrayOfInt)
  {
    AppMethodBeat.i(126272);
    if (paramInt != 48)
      AppMethodBeat.o(126272);
    while (true)
    {
      return;
      if ((paramArrayOfInt != null) && (paramArrayOfInt.length > 0) && (paramArrayOfInt[0] == 0))
      {
        this.hIM.a(this.hxc, this.hsm, this.eIl);
        AppMethodBeat.o(126272);
      }
      else
      {
        this.hxc.M(this.eIl, this.hIM.j("fail:system permission denied", null));
        AppMethodBeat.o(126272);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.contact.f.1
 * JD-Core Version:    0.6.2
 */