package com.tencent.mm.plugin.appbrand.networking;

import a.f.b.j;
import a.l;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"com/tencent/mm/plugin/appbrand/networking/NetworkServiceBySystemReceiver$mNetworkStateChangedReceiver$1", "Landroid/content/BroadcastReceiver;", "onReceive", "", "context", "Landroid/content/Context;", "intent", "Landroid/content/Intent;", "luggage-wxa-app_release"})
public final class NetworkServiceBySystemReceiver$mNetworkStateChangedReceiver$1 extends BroadcastReceiver
{
  public final void onReceive(Context paramContext, Intent paramIntent)
  {
    AppMethodBeat.i(87580);
    j.p(paramContext, "context");
    j.p(paramIntent, "intent");
    d.a(this.ipH);
    AppMethodBeat.o(87580);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.networking.NetworkServiceBySystemReceiver.mNetworkStateChangedReceiver.1
 * JD-Core Version:    0.6.2
 */