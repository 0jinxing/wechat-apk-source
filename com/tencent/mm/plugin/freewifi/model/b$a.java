package com.tencent.mm.plugin.freewifi.model;

import com.tencent.matrix.trace.core.AppMethodBeat;

final class b$a
{
  String bssid = "";
  long mvE;
  String mvF = "";
  String ssid = "";
  int type;

  public final a byG()
  {
    AppMethodBeat.i(20689);
    a locala = new a();
    locala.mvE = this.mvE;
    locala.type = this.type;
    locala.ssid = this.ssid;
    locala.bssid = this.bssid;
    locala.mvF = this.mvF;
    AppMethodBeat.o(20689);
    return locala;
  }

  public final String toString()
  {
    AppMethodBeat.i(20690);
    String str = String.format("NetworkInfoConnectedRecord(timeMillis=%d, type=%d, ssid=%s, bssid=%s, mobileNetworkType=%s)", new Object[] { Long.valueOf(this.mvE), Integer.valueOf(this.type), this.ssid, this.bssid, this.mvF });
    AppMethodBeat.o(20690);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.freewifi.model.b.a
 * JD-Core Version:    0.6.2
 */