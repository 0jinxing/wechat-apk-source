package com.tencent.mm.plugin.freewifi;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;

final class e$1 extends BroadcastReceiver
{
  e$1(e parame)
  {
  }

  public final void onReceive(Context paramContext, Intent paramIntent)
  {
    AppMethodBeat.i(20571);
    if ("android.net.wifi.WIFI_STATE_CHANGED".equals(paramIntent.getAction()))
    {
      int i = paramIntent.getIntExtra("wifi_state", 0);
      ab.i("MicroMsg.FreeWifi.EnableWifiHelper", "wifi enabled state=".concat(String.valueOf(i)));
      if (i != 3);
    }
    while (true)
    {
      try
      {
        this.mtN.aCZ.lock();
        this.mtN.cbS.signalAll();
        return;
      }
      finally
      {
        this.mtN.byc();
        this.mtN.aCZ.unlock();
        AppMethodBeat.o(20571);
      }
      AppMethodBeat.o(20571);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.freewifi.e.1
 * JD-Core Version:    0.6.2
 */