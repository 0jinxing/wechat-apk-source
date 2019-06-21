package com.tencent.mm.plugin.freewifi.model;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.net.wifi.WifiManager;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;

public final class h
{
  boolean jER;
  h.a mvZ;
  BroadcastReceiver mwa;

  private h()
  {
    AppMethodBeat.i(20732);
    this.jER = false;
    this.mwa = new h.1(this);
    AppMethodBeat.o(20732);
  }

  public final boolean a(h.a parama)
  {
    AppMethodBeat.i(20733);
    boolean bool;
    if (this.jER)
    {
      AppMethodBeat.o(20733);
      bool = false;
    }
    while (true)
    {
      return bool;
      this.jER = true;
      this.mvZ = parama;
      parama = (WifiManager)ah.getContext().getSystemService("wifi");
      if (parama == null)
      {
        ab.e("MicroMsg.FreeWifi.WifiScanReceiver", "wifiDetectingTask, get wifi manager failed");
        AppMethodBeat.o(20733);
        bool = false;
      }
      else
      {
        IntentFilter localIntentFilter = new IntentFilter("android.net.wifi.SCAN_RESULTS");
        ah.getContext().registerReceiver(this.mwa, localIntentFilter);
        parama.startScan();
        AppMethodBeat.o(20733);
        bool = true;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.freewifi.model.h
 * JD-Core Version:    0.6.2
 */