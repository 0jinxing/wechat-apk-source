package com.tencent.mm.plugin.appbrand.jsapi.nfc;

import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.HashMap;
import java.util.Map;

class JsApiNFCStartHCE$2 extends ResultReceiver
{
  JsApiNFCStartHCE$2(d paramd, Handler paramHandler)
  {
    super(paramHandler);
  }

  protected void onReceiveResult(int paramInt, Bundle paramBundle)
  {
    AppMethodBeat.i(137873);
    ab.i("MicroMsg.JsApiNFCStartHCE", "alvinluo startHCEUI ResultReceiver resultCode: %d", new Object[] { Integer.valueOf(paramInt) });
    if ((paramBundle == null) || (paramInt != 10001))
      AppMethodBeat.o(137873);
    while (true)
    {
      return;
      paramInt = paramBundle.getInt("errCode", -1);
      String str = paramBundle.getString("errMsg");
      paramBundle = this.hSh;
      ab.i("MicroMsg.JsApiNFCStartHCE", "alvinluo startHCEUI onResult errCode: %d, errMsg: %s", new Object[] { Integer.valueOf(paramInt), str });
      HashMap localHashMap = new HashMap();
      localHashMap.put("errCode", Integer.valueOf(paramInt));
      if (paramInt == 0)
      {
        paramBundle.onSuccess();
        AppMethodBeat.o(137873);
      }
      else
      {
        com.tencent.mm.plugin.appbrand.jsapi.nfc.hce.a.c.G(paramBundle.hzz.getAppId(), paramInt, -1);
        paramBundle.AR(paramBundle.j("fail: ".concat(String.valueOf(str)), localHashMap));
        AppMethodBeat.o(137873);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.nfc.JsApiNFCStartHCE.2
 * JD-Core Version:    0.6.2
 */