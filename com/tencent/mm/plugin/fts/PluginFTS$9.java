package com.tencent.mm.plugin.fts;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class PluginFTS$9 extends BroadcastReceiver
{
  PluginFTS$9(PluginFTS paramPluginFTS)
  {
  }

  public final void onReceive(Context paramContext, Intent paramIntent)
  {
    AppMethodBeat.i(136593);
    if ((paramIntent == null) || (paramIntent.getAction() == null))
      AppMethodBeat.o(136593);
    while (true)
    {
      return;
      ab.i("MicroMsg.FTS.PluginFTS", "*** Charging notified: " + paramIntent.getAction());
      if (paramIntent.getAction().equals("android.intent.action.ACTION_POWER_CONNECTED"))
      {
        PluginFTS.access$1602(this.mBO, true);
        AppMethodBeat.o(136593);
      }
      else
      {
        if (paramIntent.getAction().equals("android.intent.action.ACTION_POWER_DISCONNECTED"))
          PluginFTS.access$1602(this.mBO, false);
        AppMethodBeat.o(136593);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fts.PluginFTS.9
 * JD-Core Version:    0.6.2
 */