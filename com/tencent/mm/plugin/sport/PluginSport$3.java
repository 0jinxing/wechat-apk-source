package com.tencent.mm.plugin.sport;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.sport.model.a;
import com.tencent.mm.plugin.sport.model.n;
import com.tencent.mm.sdk.platformtools.ah;

final class PluginSport$3 extends BroadcastReceiver
{
  PluginSport$3(PluginSport paramPluginSport)
  {
  }

  public final void onReceive(Context paramContext, Intent paramIntent)
  {
    AppMethodBeat.i(93606);
    if (("com.tencent.mm.plugin.sport.uploadstep".equals(paramIntent.getAction())) && (n.eU(ah.getContext())) && (n.cvY()))
      this.rOV.getDeviceStepManager().cwd();
    AppMethodBeat.o(93606);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sport.PluginSport.3
 * JD-Core Version:    0.6.2
 */