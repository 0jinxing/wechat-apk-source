package com.tencent.mm.plugin.appbrand.networking;

import a.l;
import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.IntentFilter;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.i;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/appbrand/networking/NetworkServiceBySystemReceiver;", "Lcom/tencent/mm/plugin/appbrand/networking/NetworkServiceImpl;", "rt", "Lcom/tencent/mm/plugin/appbrand/AppBrandRuntime;", "(Lcom/tencent/mm/plugin/appbrand/AppBrandRuntime;)V", "mNetworkStateChangedReceiver", "com/tencent/mm/plugin/appbrand/networking/NetworkServiceBySystemReceiver$mNetworkStateChangedReceiver$1", "Lcom/tencent/mm/plugin/appbrand/networking/NetworkServiceBySystemReceiver$mNetworkStateChangedReceiver$1;", "onRegister", "", "onUnregister", "luggage-wxa-app_release"})
public final class d extends e
{
  private final NetworkServiceBySystemReceiver.mNetworkStateChangedReceiver.1 ipG;

  public d(i parami)
  {
    super(parami);
    AppMethodBeat.i(87583);
    this.ipG = new NetworkServiceBySystemReceiver.mNetworkStateChangedReceiver.1(this);
    AppMethodBeat.o(87583);
  }

  public final void SH()
  {
    AppMethodBeat.i(87581);
    super.SH();
    Activity localActivity = this.gPI.getContext();
    BroadcastReceiver localBroadcastReceiver = (BroadcastReceiver)this.ipG;
    IntentFilter localIntentFilter = new IntentFilter();
    localIntentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
    localActivity.registerReceiver(localBroadcastReceiver, localIntentFilter);
    AppMethodBeat.o(87581);
  }

  public final void SI()
  {
    AppMethodBeat.i(87582);
    super.SI();
    this.gPI.getContext().unregisterReceiver((BroadcastReceiver)this.ipG);
    AppMethodBeat.o(87582);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.networking.d
 * JD-Core Version:    0.6.2
 */