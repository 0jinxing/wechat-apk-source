package com.tencent.mm.plugin.appbrand.jsapi.c;

import android.annotation.TargetApi;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@TargetApi(18)
public final class a
{
  public static BroadcastReceiver hDr;
  public static boolean hDs;
  public static Map<String, a.a> map;

  static
  {
    AppMethodBeat.i(94358);
    map = new ConcurrentHashMap();
    AppMethodBeat.o(94358);
  }

  public static a.a AZ(String paramString)
  {
    AppMethodBeat.i(94356);
    paramString = (a.a)map.get(paramString);
    AppMethodBeat.o(94356);
    return paramString;
  }

  public static void a(String paramString, a.a parama)
  {
    AppMethodBeat.i(94355);
    map.put(paramString, parama);
    if (hDr == null)
    {
      ab.i("MicroMsg.BeaconManager", "bluetoothStateListener init");
      hDr = new a.1();
      paramString = new IntentFilter("android.bluetooth.adapter.action.STATE_CHANGED");
      ah.getContext().registerReceiver(hDr, paramString);
    }
    AppMethodBeat.o(94355);
  }

  public static void remove(String paramString)
  {
    AppMethodBeat.i(94357);
    map.remove(paramString);
    ab.i("MicroMsg.BeaconManager", "remove Beacon appid:%s", new Object[] { paramString });
    if ((map.size() == 0) && (hDr != null))
    {
      ab.i("MicroMsg.BeaconManager", "bluetoothStateListener uninit");
      ah.getContext().unregisterReceiver(hDr);
      hDr = null;
    }
    AppMethodBeat.o(94357);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.c.a
 * JD-Core Version:    0.6.2
 */