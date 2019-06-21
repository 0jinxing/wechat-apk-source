package com.tencent.mm.plugin.appbrand.jsapi.wifi.wifisdk;

import com.tencent.matrix.trace.core.AppMethodBeat;
import org.json.JSONObject;

public final class b
{
  public String idi = "";
  public String idj = "";
  public int idk;
  public boolean idl = false;
  public boolean idm = false;
  public boolean idn = false;

  public final JSONObject toJSONObject()
  {
    AppMethodBeat.i(94380);
    JSONObject localJSONObject = new JSONObject();
    localJSONObject.put("SSID", this.idi);
    localJSONObject.put("BSSID", this.idj);
    localJSONObject.put("secure", this.idl);
    localJSONObject.put("signalStrength", this.idk);
    AppMethodBeat.o(94380);
    return localJSONObject;
  }

  public final String toString()
  {
    AppMethodBeat.i(94379);
    String str = "WiFiItem{mSsid='" + this.idi + '\'' + ", mBssid='" + this.idj + '\'' + ", mSignalStrength=" + this.idk + ", mSecurity=" + this.idl + '}';
    AppMethodBeat.o(94379);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.wifi.wifisdk.b
 * JD-Core Version:    0.6.2
 */