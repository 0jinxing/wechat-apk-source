package com.tencent.mm.plugin.wepkg.downloader;

import android.content.Context;
import android.content.IntentFilter;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;

public final class i
{
  private static int kNC = -1;
  private static i.a uWA;

  public static void bgr()
  {
    AppMethodBeat.i(63455);
    if (uWA != null);
    try
    {
      ah.getContext().unregisterReceiver(uWA);
      label20: uWA = null;
      ab.i("MicroMsg.Wepkg.WepkgAutoDownloader", "WepkgAutoDownloader stopListen");
      AppMethodBeat.o(63455);
      return;
    }
    catch (Exception localException)
    {
      break label20;
    }
  }

  public static void bie()
  {
    AppMethodBeat.i(63454);
    if (uWA == null)
      uWA = new i.a((byte)0);
    IntentFilter localIntentFilter = new IntentFilter();
    localIntentFilter.addAction("android.net.wifi.STATE_CHANGE");
    localIntentFilter.addAction("android.net.wifi.WIFI_STATE_CHANGED");
    localIntentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
    try
    {
      ah.getContext().registerReceiver(uWA, localIntentFilter);
      label59: ab.i("MicroMsg.Wepkg.WepkgAutoDownloader", "WepkgAutoDownloader startListen");
      AppMethodBeat.o(63454);
      return;
    }
    catch (Exception localException)
    {
      break label59;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wepkg.downloader.i
 * JD-Core Version:    0.6.2
 */