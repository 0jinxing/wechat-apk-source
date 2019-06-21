package com.tencent.mm.plugin.appbrand.jsapi.contact;

import android.support.v4.app.a.a;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.jsapi.m;
import org.json.JSONObject;

final class c$2
  implements a.a
{
  c$2(c paramc, com.tencent.mm.plugin.appbrand.jsapi.c paramc1, JSONObject paramJSONObject, int paramInt)
  {
  }

  public final void onRequestPermissionsResult(int paramInt, String[] paramArrayOfString, int[] paramArrayOfInt)
  {
    AppMethodBeat.i(126270);
    if (paramInt != 48)
      AppMethodBeat.o(126270);
    while (true)
    {
      return;
      if ((paramArrayOfInt != null) && (paramArrayOfInt.length > 0) && (paramArrayOfInt[0] == 0))
      {
        this.hIj.a(this.hxc, this.hsm, this.eIl);
        AppMethodBeat.o(126270);
      }
      else
      {
        this.hxc.M(this.eIl, this.hIj.j("permission_denied", null));
        AppMethodBeat.o(126270);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.contact.c.2
 * JD-Core Version:    0.6.2
 */