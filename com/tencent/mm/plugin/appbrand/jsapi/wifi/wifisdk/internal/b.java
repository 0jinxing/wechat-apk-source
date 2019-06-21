package com.tencent.mm.plugin.appbrand.jsapi.wifi.wifisdk.internal;

import android.net.wifi.WifiConfiguration;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Iterator;
import java.util.List;

public final class b
{
  public static WifiConfiguration a(String paramString, int paramInt, List<WifiConfiguration> paramList)
  {
    AppMethodBeat.i(94401);
    if (paramList != null)
    {
      Iterator localIterator = paramList.iterator();
      while (localIterator.hasNext())
      {
        paramList = (WifiConfiguration)localIterator.next();
        if ((d.Cc(paramList.SSID).compareTo(paramString) == 0) && (d.c(paramList) == paramInt))
        {
          AppMethodBeat.o(94401);
          paramString = paramList;
        }
      }
    }
    while (true)
    {
      return paramString;
      paramString = null;
      AppMethodBeat.o(94401);
    }
  }

  public static int b(WifiConfiguration paramWifiConfiguration)
  {
    AppMethodBeat.i(94399);
    int i;
    if ((paramWifiConfiguration != null) && (paramWifiConfiguration.networkId < 0))
    {
      paramWifiConfiguration.networkId = c.addNetwork(paramWifiConfiguration);
      i = paramWifiConfiguration.networkId;
      AppMethodBeat.o(94399);
    }
    while (true)
    {
      return i;
      i = -1;
      AppMethodBeat.o(94399);
    }
  }

  public static boolean bl(String paramString, int paramInt)
  {
    boolean bool1 = false;
    boolean bool2 = false;
    AppMethodBeat.i(94400);
    if ((paramString == null) || (paramString.length() <= 0))
    {
      AppMethodBeat.o(94400);
      return bool2;
    }
    Object localObject = c.getConfiguredNetworks();
    bool2 = bool1;
    if (localObject != null)
    {
      localObject = ((List)localObject).iterator();
      bool2 = false;
      label50: if (((Iterator)localObject).hasNext())
      {
        WifiConfiguration localWifiConfiguration = (WifiConfiguration)((Iterator)localObject).next();
        if ((d.Cc(localWifiConfiguration.SSID).compareTo(paramString) != 0) || (d.c(localWifiConfiguration) != paramInt))
          break label126;
        bool2 |= c.removeNetwork(localWifiConfiguration.networkId);
      }
    }
    label126: 
    while (true)
    {
      break label50;
      if (bool2)
        c.saveConfiguration();
      AppMethodBeat.o(94400);
      break;
    }
  }

  public static boolean oG(int paramInt)
  {
    AppMethodBeat.i(94402);
    boolean bool = false;
    if ((c.removeNetwork(paramInt)) || (c.disableNetwork(paramInt)))
    {
      bool = true;
      c.saveConfiguration();
    }
    AppMethodBeat.o(94402);
    return bool;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.wifi.wifisdk.internal.b
 * JD-Core Version:    0.6.2
 */