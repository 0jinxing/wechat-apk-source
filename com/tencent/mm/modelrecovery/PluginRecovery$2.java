package com.tencent.mm.modelrecovery;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class PluginRecovery$2 extends BroadcastReceiver
{
  PluginRecovery$2(PluginRecovery paramPluginRecovery)
  {
  }

  public final void onReceive(Context paramContext, Intent paramIntent)
  {
    AppMethodBeat.i(16526);
    if (paramIntent != null)
      if ("com.tecent.recovery.intent.action.LOG".equals(paramIntent.getAction()))
      {
        PluginRecovery.access$000(this.fMH);
        AppMethodBeat.o(16526);
      }
    while (true)
    {
      return;
      if ("com.tecent.mm.intent.action.RECOVERY_STATUS_UPLOAD".equals(paramIntent.getAction()))
        PluginRecovery.access$100(this.fMH);
      AppMethodBeat.o(16526);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelrecovery.PluginRecovery.2
 * JD-Core Version:    0.6.2
 */