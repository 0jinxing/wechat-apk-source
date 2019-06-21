package com.tencent.mm.plugin.appbrand.jsapi.nfc;

import android.app.Activity;
import android.content.Intent;
import android.os.Looper;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.jsapi.m;
import com.tencent.mm.sdk.platformtools.ak;
import java.util.HashMap;
import java.util.Map;

final class d$1
  implements JsApiAppBrandNFCBase.a
{
  d$1(d paramd)
  {
  }

  public final void T(int paramInt, String paramString)
  {
    AppMethodBeat.i(137872);
    Object localObject = new HashMap();
    ((Map)localObject).put("errCode", Integer.valueOf(paramInt));
    if (paramInt == 0)
    {
      localObject = this.hSh;
      if (!(((d)localObject).hzz.getContext() instanceof Activity))
      {
        ((d)localObject).AR(((m)localObject).j("fail: unknown error", null));
        AppMethodBeat.o(137872);
      }
    }
    while (true)
    {
      return;
      ((d)localObject).gNy = ((Activity)((d)localObject).hzz.getContext());
      paramString = new Intent(((d)localObject).gNy, ((d)localObject).hSe);
      paramString.putExtra("HCE_Result_Receiver", new JsApiNFCStartHCE.2((d)localObject, ak.fetchFreeHandler(Looper.getMainLooper())));
      ((d)localObject).gNy.startActivity(paramString);
      AppMethodBeat.o(137872);
      continue;
      com.tencent.mm.plugin.appbrand.jsapi.nfc.hce.a.c.G(this.hSh.hzz.getAppId(), paramInt, -1);
      this.hSh.AR(this.hSh.j("fail: ".concat(String.valueOf(paramString)), (Map)localObject));
      AppMethodBeat.o(137872);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.nfc.d.1
 * JD-Core Version:    0.6.2
 */