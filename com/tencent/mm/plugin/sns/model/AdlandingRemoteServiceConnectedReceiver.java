package com.tencent.mm.plugin.sns.model;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.support.v4.content.d;
import com.tencent.matrix.trace.core.AppMethodBeat;

public class AdlandingRemoteServiceConnectedReceiver extends BroadcastReceiver
{
  private Runnable fZM;

  public static void b(d paramd)
  {
    AppMethodBeat.i(36098);
    paramd.c(new Intent("com.tencnet.mm.action.adlanding.connected"));
    AppMethodBeat.o(36098);
  }

  public void onReceive(Context paramContext, Intent paramIntent)
  {
    AppMethodBeat.i(36097);
    if ((paramIntent != null) && ("com.tencnet.mm.action.adlanding.connected".equals(paramIntent.getAction())) && (this.fZM != null))
      this.fZM.run();
    AppMethodBeat.o(36097);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.model.AdlandingRemoteServiceConnectedReceiver
 * JD-Core Version:    0.6.2
 */