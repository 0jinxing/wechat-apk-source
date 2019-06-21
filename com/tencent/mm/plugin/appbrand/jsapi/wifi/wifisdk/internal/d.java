package com.tencent.mm.plugin.appbrand.jsapi.wifi.wifisdk.internal;

import android.net.wifi.ScanResult;
import android.net.wifi.WifiConfiguration;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.BitSet;

public final class d
{
  public static int idD = -1;

  public static String Cc(String paramString)
  {
    AppMethodBeat.i(94413);
    if (paramString == null)
    {
      paramString = "";
      AppMethodBeat.o(94413);
    }
    while (true)
    {
      return paramString;
      int i = paramString.length();
      if ((i > 1) && (paramString.charAt(0) == '"') && (paramString.charAt(i - 1) == '"'))
      {
        paramString = paramString.substring(1, i - 1);
        AppMethodBeat.o(94413);
      }
      else
      {
        AppMethodBeat.o(94413);
      }
    }
  }

  public static int a(ScanResult paramScanResult)
  {
    AppMethodBeat.i(94415);
    int i;
    if ((paramScanResult == null) || (paramScanResult.capabilities == null))
    {
      i = -1;
      AppMethodBeat.o(94415);
    }
    while (true)
    {
      return i;
      if (paramScanResult.capabilities.contains("WEP"))
      {
        i = 1;
        AppMethodBeat.o(94415);
      }
      else if (paramScanResult.capabilities.contains("PSK"))
      {
        i = 2;
        AppMethodBeat.o(94415);
      }
      else if (paramScanResult.capabilities.contains("EAP"))
      {
        i = 3;
        AppMethodBeat.o(94415);
      }
      else
      {
        i = 0;
        AppMethodBeat.o(94415);
      }
    }
  }

  public static int c(WifiConfiguration paramWifiConfiguration)
  {
    int i = 2;
    AppMethodBeat.i(94414);
    if (paramWifiConfiguration.allowedKeyManagement.get(1))
      AppMethodBeat.o(94414);
    while (true)
    {
      return i;
      if ((paramWifiConfiguration.allowedKeyManagement.get(2)) || (paramWifiConfiguration.allowedKeyManagement.get(3)))
      {
        AppMethodBeat.o(94414);
        i = 3;
      }
      else if (paramWifiConfiguration.wepKeys[0] != null)
      {
        AppMethodBeat.o(94414);
        i = 1;
      }
      else
      {
        AppMethodBeat.o(94414);
        i = 0;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.wifi.wifisdk.internal.d
 * JD-Core Version:    0.6.2
 */