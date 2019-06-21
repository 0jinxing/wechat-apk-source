package com.tencent.mm.plugin.webview.ui.tools.game;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class BatteryManager$BatteryChangedReceiver extends BroadcastReceiver
{
  public final void onReceive(Context paramContext, Intent paramIntent)
  {
    AppMethodBeat.i(8633);
    if (paramIntent == null)
      AppMethodBeat.o(8633);
    while (true)
    {
      return;
      if ("android.intent.action.BATTERY_OKAY".equals(paramIntent.getAction()))
      {
        BatteryManager.uCS = false;
        AppMethodBeat.o(8633);
      }
      else
      {
        if ("android.intent.action.BATTERY_LOW".equals(paramIntent.getAction()))
          BatteryManager.uCS = true;
        AppMethodBeat.o(8633);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.game.BatteryManager.BatteryChangedReceiver
 * JD-Core Version:    0.6.2
 */