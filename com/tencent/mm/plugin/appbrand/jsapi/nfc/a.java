package com.tencent.mm.plugin.appbrand.jsapi.nfc;

import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.jsapi.ah;
import com.tencent.mm.plugin.appbrand.jsapi.c;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.HashMap;
import java.util.Map;

public final class a extends ah
{
  private static final int CTRL_INDEX = 355;
  private static final String NAME = "onHCEMessage";
  private static final a hRS;

  static
  {
    AppMethodBeat.i(137843);
    hRS = new a();
    AppMethodBeat.o(137843);
  }

  static void a(c paramc, int paramInt, Bundle paramBundle)
  {
    try
    {
      AppMethodBeat.i(137842);
      ab.i("MicroMsg.EventOnHCEMessageReceived", "alvinluo EventOnHCEMessageReceived dispatch appId: %s, eventType: %d", new Object[] { paramc.getAppId(), Integer.valueOf(paramInt) });
      HashMap localHashMap;
      if (paramInt == 31)
      {
        if (paramBundle == null)
          break label169;
        paramBundle = paramBundle.getString("key_apdu_command");
        localHashMap = new java/util/HashMap;
        localHashMap.<init>();
        localHashMap.put("messageType", Integer.valueOf(1));
        localHashMap.put("data", paramBundle);
        hRS.j(paramc).t(localHashMap).aCj();
        AppMethodBeat.o(137842);
      }
      while (true)
      {
        return;
        if ((paramInt == 41) && (paramBundle != null))
        {
          localHashMap = new java/util/HashMap;
          localHashMap.<init>();
          localHashMap.put("messageType", Integer.valueOf(2));
          localHashMap.put("reason", Integer.valueOf(paramBundle.getInt("key_on_deactivated_reason")));
          hRS.j(paramc).t(localHashMap).aCj();
        }
        label169: AppMethodBeat.o(137842);
      }
    }
    finally
    {
    }
    throw paramc;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.nfc.a
 * JD-Core Version:    0.6.2
 */