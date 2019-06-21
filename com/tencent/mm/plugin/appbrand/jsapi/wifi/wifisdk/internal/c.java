package com.tencent.mm.plugin.appbrand.jsapi.wifi.wifisdk.internal;

import android.net.wifi.ScanResult;
import android.net.wifi.WifiConfiguration;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.List;

public final class c
{
  public static WifiManager bCU;

  public static int addNetwork(WifiConfiguration paramWifiConfiguration)
  {
    AppMethodBeat.i(94404);
    try
    {
      i = bCU.addNetwork(paramWifiConfiguration);
      AppMethodBeat.o(94404);
      return i;
    }
    catch (Throwable paramWifiConfiguration)
    {
      while (true)
      {
        int i = d.idD;
        AppMethodBeat.o(94404);
      }
    }
  }

  public static boolean disableNetwork(int paramInt)
  {
    AppMethodBeat.i(94407);
    try
    {
      bool = bCU.disableNetwork(paramInt);
      AppMethodBeat.o(94407);
      return bool;
    }
    catch (Throwable localThrowable)
    {
      while (true)
      {
        boolean bool = false;
        AppMethodBeat.o(94407);
      }
    }
  }

  public static List<WifiConfiguration> getConfiguredNetworks()
  {
    AppMethodBeat.i(94403);
    try
    {
      List localList = bCU.getConfiguredNetworks();
      AppMethodBeat.o(94403);
      return localList;
    }
    catch (Throwable localThrowable)
    {
      while (true)
      {
        Object localObject = null;
        AppMethodBeat.o(94403);
      }
    }
  }

  public static WifiInfo getConnectionInfo()
  {
    AppMethodBeat.i(94409);
    try
    {
      WifiInfo localWifiInfo = bCU.getConnectionInfo();
      AppMethodBeat.o(94409);
      return localWifiInfo;
    }
    catch (Throwable localThrowable)
    {
      while (true)
      {
        Object localObject = null;
        AppMethodBeat.o(94409);
      }
    }
  }

  public static List<ScanResult> getScanResults()
  {
    AppMethodBeat.i(94410);
    try
    {
      List localList = bCU.getScanResults();
      AppMethodBeat.o(94410);
      return localList;
    }
    catch (Throwable localThrowable)
    {
      while (true)
      {
        Object localObject = null;
        AppMethodBeat.o(94410);
      }
    }
  }

  public static boolean isWifiEnabled()
  {
    AppMethodBeat.i(94412);
    try
    {
      bool = bCU.isWifiEnabled();
      AppMethodBeat.o(94412);
      return bool;
    }
    catch (Throwable localThrowable)
    {
      while (true)
      {
        boolean bool = false;
        AppMethodBeat.o(94412);
      }
    }
  }

  public static boolean oH(int paramInt)
  {
    AppMethodBeat.i(94406);
    try
    {
      bool = bCU.enableNetwork(paramInt, true);
      AppMethodBeat.o(94406);
      return bool;
    }
    catch (Throwable localThrowable)
    {
      while (true)
      {
        boolean bool = false;
        AppMethodBeat.o(94406);
      }
    }
  }

  public static int oI(int paramInt)
  {
    if (paramInt <= -100)
      paramInt = 0;
    while (true)
    {
      return paramInt;
      if (paramInt >= -55)
        paramInt = 99;
      else
        paramInt = (int)((paramInt + 100) * 99.0F / 45.0F);
    }
  }

  public static boolean removeNetwork(int paramInt)
  {
    AppMethodBeat.i(94405);
    try
    {
      bool = bCU.removeNetwork(paramInt);
      AppMethodBeat.o(94405);
      return bool;
    }
    catch (Throwable localThrowable)
    {
      while (true)
      {
        boolean bool = false;
        AppMethodBeat.o(94405);
      }
    }
  }

  public static boolean saveConfiguration()
  {
    AppMethodBeat.i(94411);
    try
    {
      bool = bCU.saveConfiguration();
      AppMethodBeat.o(94411);
      return bool;
    }
    catch (Throwable localThrowable)
    {
      while (true)
      {
        boolean bool = false;
        AppMethodBeat.o(94411);
      }
    }
  }

  public static boolean startScan()
  {
    AppMethodBeat.i(94408);
    try
    {
      bool = bCU.startScan();
      AppMethodBeat.o(94408);
      return bool;
    }
    catch (Throwable localThrowable)
    {
      while (true)
      {
        boolean bool = false;
        AppMethodBeat.o(94408);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.wifi.wifisdk.internal.c
 * JD-Core Version:    0.6.2
 */