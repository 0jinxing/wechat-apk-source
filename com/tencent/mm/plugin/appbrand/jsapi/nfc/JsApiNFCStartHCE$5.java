package com.tencent.mm.plugin.appbrand.jsapi.nfc;

import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.HashMap;
import java.util.Map;
import java.util.Timer;

class JsApiNFCStartHCE$5 extends ResultReceiver
{
  JsApiNFCStartHCE$5(d paramd, Handler paramHandler)
  {
    super(paramHandler);
  }

  protected void onReceiveResult(int paramInt, Bundle paramBundle)
  {
    AppMethodBeat.i(137876);
    ab.i("MicroMsg.JsApiNFCStartHCE", "alvinluo mHCEServiceResultReceiver resultCode: %d", new Object[] { Integer.valueOf(paramInt) });
    if ((paramBundle == null) || (paramInt != 10002))
      AppMethodBeat.o(137876);
    int i;
    String str2;
    while (true)
    {
      return;
      i = paramBundle.getInt("key_event_type", -1);
      String str1 = paramBundle.getString("key_appid");
      paramInt = paramBundle.getInt("errCode", -1);
      str2 = paramBundle.getString("errMsg");
      ab.i("MicroMsg.JsApiNFCStartHCE", "alvinluo mHCEServiceResultReceiver onReceiveResult eventType: %d, appId: %s", new Object[] { Integer.valueOf(i), str1 });
      switch (i)
      {
      default:
      case 31:
      case 41:
      case 12:
      }
      do
      {
        AppMethodBeat.o(137876);
        break;
        a.a(this.hSh.hzz, i, paramBundle);
        AppMethodBeat.o(137876);
        break;
      }
      while (paramBundle == null);
      paramBundle = this.hSh;
      synchronized (paramBundle.mLock)
      {
        boolean bool = paramBundle.eTM;
        if (!bool)
          paramBundle.eTM = true;
        if (bool)
        {
          ab.i("MicroMsg.JsApiNFCStartHCE", "alvinluo startHCE onStartHCEFinish has finished, return");
          AppMethodBeat.o(137876);
        }
      }
      if (HCEEventLogic.aEt())
      {
        ab.i("MicroMsg.JsApiNFCStartHCE", "alvinluo startHCE onStartHCEOvertime has stop, return");
        AppMethodBeat.o(137876);
      }
      else
      {
        ??? = new HashMap();
        i = (int)(System.currentTimeMillis() - paramBundle.mStartTime);
        if (paramBundle.mTimer != null)
        {
          ab.d("MicroMsg.JsApiNFCStartHCE", "alvinluo startHCE timer cancel");
          paramBundle.mTimer.cancel();
        }
        if ((str1 == null) || (str1.equals(paramBundle.hzz.getAppId())))
          break;
        ab.e("MicroMsg.JsApiNFCStartHCE", "alvinluo start HCESevice callback appId invalid, appId: %s", new Object[] { str1 });
        ((Map)???).put("errCode", Integer.valueOf(13010));
        com.tencent.mm.plugin.appbrand.jsapi.nfc.hce.a.c.G(paramBundle.hzz.getAppId(), 13010, i);
        paramBundle.AR(paramBundle.j("fail: unknown error", (Map)???));
        AppMethodBeat.o(137876);
      }
    }
    ab.i("MicroMsg.JsApiNFCStartHCE", "alvinluo HCE start HCEService callback onRefreshed errCode: %d, errMsg: %s", new Object[] { Integer.valueOf(paramInt), str2 });
    if (paramInt == 0)
    {
      HCEEventLogic.BE(paramBundle.hzz.getAppId());
      ((Map)???).put("errCode", Integer.valueOf(0));
      paramBundle.AR(paramBundle.j("ok", (Map)???));
    }
    while (true)
    {
      com.tencent.mm.plugin.appbrand.jsapi.nfc.hce.a.c.G(paramBundle.hzz.getAppId(), paramInt, i);
      HCEEventLogic.eo(true);
      break;
      ((Map)???).put("errCode", Integer.valueOf(paramInt));
      paramBundle.AR(paramBundle.j("fail: ".concat(String.valueOf(str2)), (Map)???));
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.nfc.JsApiNFCStartHCE.5
 * JD-Core Version:    0.6.2
 */