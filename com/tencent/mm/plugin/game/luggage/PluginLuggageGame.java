package com.tencent.mm.plugin.game.luggage;

import android.content.Context;
import android.content.IntentFilter;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.api.bucket.c;
import com.tencent.mm.kernel.b.f;
import com.tencent.mm.kernel.b.g;
import com.tencent.mm.kernel.e.c;
import com.tencent.mm.plugin.game.luggage.a.a;
import com.tencent.mm.plugin.webview.ui.tools.game.BatteryManager;
import com.tencent.mm.plugin.webview.ui.tools.game.BatteryManager.BatteryChangedReceiver;
import com.tencent.mm.sdk.platformtools.ah;

public class PluginLuggageGame extends f
  implements c, a
{
  public void execute(g paramg)
  {
  }

  public void onAccountInitialized(e.c paramc)
  {
    AppMethodBeat.i(135829);
    if (BatteryManager.uCT == null)
      BatteryManager.uCT = new BatteryManager.BatteryChangedReceiver((byte)0);
    paramc = new IntentFilter();
    paramc.addAction("android.intent.action.BATTERY_OKAY");
    paramc.addAction("android.intent.action.BATTERY_LOW");
    ah.getContext().registerReceiver(BatteryManager.uCT, paramc);
    AppMethodBeat.o(135829);
  }

  public void onAccountRelease()
  {
    AppMethodBeat.i(135830);
    if (BatteryManager.uCT != null)
      ah.getContext().unregisterReceiver(BatteryManager.uCT);
    BatteryManager.uCT = null;
    AppMethodBeat.o(135830);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.game.luggage.PluginLuggageGame
 * JD-Core Version:    0.6.2
 */