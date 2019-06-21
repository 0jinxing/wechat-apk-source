package com.tencent.voip.mars.comm;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.telephony.TelephonyManager;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.PrintWriter;
import java.io.StringWriter;

public class PlatformComm$C2Java
{
  private static String exception2String(Exception paramException)
  {
    AppMethodBeat.i(92727);
    StringWriter localStringWriter = new StringWriter();
    paramException.printStackTrace(new PrintWriter(localStringWriter));
    paramException = localStringWriter.toString();
    AppMethodBeat.o(92727);
    return paramException;
  }

  public static PlatformComm.APNInfo getAPNInfo()
  {
    AppMethodBeat.i(92734);
    try
    {
      Object localObject1 = ((ConnectivityManager)PlatformComm.context.getSystemService("connectivity")).getActiveNetworkInfo();
      PlatformComm.APNInfo localAPNInfo = new com/tencent/voip/mars/comm/PlatformComm$APNInfo;
      localAPNInfo.<init>();
      if (localObject1 != null)
      {
        localAPNInfo.netType = ((NetworkInfo)localObject1).getType();
        localAPNInfo.subNetType = ((NetworkInfo)localObject1).getSubtype();
        if (1 != ((NetworkInfo)localObject1).getType())
          if (((NetworkInfo)localObject1).getExtraInfo() == null)
            localObject1 = "";
        for (localAPNInfo.extraInfo = ((String)localObject1); ; localAPNInfo.extraInfo = getCurWifiInfo().ssid)
        {
          AppMethodBeat.o(92734);
          localObject1 = localAPNInfo;
          return localObject1;
          localObject1 = ((NetworkInfo)localObject1).getExtraInfo();
          break;
        }
      }
    }
    catch (Exception localException)
    {
      while (true)
      {
        Object localObject2 = null;
        AppMethodBeat.o(92734);
      }
    }
  }

  public static int getCurRadioAccessNetworkInfo()
  {
    AppMethodBeat.i(92735);
    int i;
    if (PlatformComm.context == null)
    {
      PlatformComm.Assert.assertTrue(false);
      AppMethodBeat.o(92735);
      i = 0;
    }
    while (true)
    {
      return i;
      try
      {
        i = ((TelephonyManager)PlatformComm.context.getSystemService("phone")).getNetworkType();
        AppMethodBeat.o(92735);
      }
      catch (Exception localException)
      {
        PlatformComm.Assert.assertTrue(localException.getClass().getSimpleName() + ":" + localException.getStackTrace()[0] + ", " + localException.getStackTrace()[1], false);
        AppMethodBeat.o(92735);
        i = 0;
      }
    }
  }

  public static PlatformComm.SIMInfo getCurSIMInfo()
  {
    Object localObject1 = null;
    AppMethodBeat.i(92733);
    try
    {
      Object localObject2 = PlatformComm.context;
      if (localObject2 == null)
        AppMethodBeat.o(92733);
      while (true)
      {
        return localObject1;
        int i = NetStatusUtil.getISPCode(PlatformComm.context);
        if (i == 0)
        {
          AppMethodBeat.o(92733);
        }
        else
        {
          localObject2 = new com/tencent/voip/mars/comm/PlatformComm$SIMInfo;
          ((PlatformComm.SIMInfo)localObject2).<init>();
          ((PlatformComm.SIMInfo)localObject2).ispCode = String.valueOf(i);
          ((PlatformComm.SIMInfo)localObject2).ispName = NetStatusUtil.getISPName(PlatformComm.context);
          AppMethodBeat.o(92733);
          localObject1 = localObject2;
        }
      }
    }
    catch (Exception localException)
    {
      while (true)
        AppMethodBeat.o(92733);
    }
  }

  public static PlatformComm.WifiInfo getCurWifiInfo()
  {
    AppMethodBeat.i(92732);
    try
    {
      Object localObject1 = PlatformComm.context;
      if (localObject1 == null)
      {
        AppMethodBeat.o(92732);
        localObject1 = null;
      }
      while (true)
      {
        return localObject1;
        localObject1 = (ConnectivityManager)PlatformComm.context.getSystemService("connectivity");
        if (localObject1 == null)
        {
          AppMethodBeat.o(92732);
          localObject1 = null;
        }
        else
        {
          localObject1 = ((ConnectivityManager)localObject1).getActiveNetworkInfo();
          if (localObject1 != null)
          {
            int i = ((NetworkInfo)localObject1).getType();
            if (1 == i);
          }
          else
          {
            AppMethodBeat.o(92732);
            localObject1 = null;
            continue;
          }
          localObject1 = (WifiManager)PlatformComm.context.getSystemService("wifi");
          if (localObject1 == null)
          {
            AppMethodBeat.o(92732);
            localObject1 = null;
          }
          else
          {
            WifiInfo localWifiInfo = ((WifiManager)localObject1).getConnectionInfo();
            if (localWifiInfo == null)
            {
              AppMethodBeat.o(92732);
              localObject1 = null;
            }
            else
            {
              localObject1 = new com/tencent/voip/mars/comm/PlatformComm$WifiInfo;
              ((PlatformComm.WifiInfo)localObject1).<init>();
              ((PlatformComm.WifiInfo)localObject1).ssid = localWifiInfo.getSSID();
              ((PlatformComm.WifiInfo)localObject1).bssid = localWifiInfo.getBSSID();
              AppMethodBeat.o(92732);
            }
          }
        }
      }
    }
    catch (Exception localException)
    {
      while (true)
      {
        AppMethodBeat.o(92732);
        Object localObject2 = null;
      }
    }
  }

  public static int getNetInfo()
  {
    AppMethodBeat.i(92728);
    Object localObject = (ConnectivityManager)PlatformComm.context.getSystemService("connectivity");
    int i;
    if (localObject == null)
    {
      AppMethodBeat.o(92728);
      i = -1;
    }
    while (true)
    {
      return i;
      localObject = ((ConnectivityManager)localObject).getActiveNetworkInfo();
      if (localObject == null)
      {
        AppMethodBeat.o(92728);
        i = -1;
      }
      else
      {
        try
        {
          i = ((NetworkInfo)localObject).getType();
          switch (i)
          {
          default:
            AppMethodBeat.o(92728);
            i = 3;
            break;
          case 1:
            i = 1;
            AppMethodBeat.o(92728);
            break;
          case 0:
          case 2:
          case 3:
          case 4:
          case 5:
            i = 2;
            AppMethodBeat.o(92728);
          }
        }
        catch (Exception localException)
        {
          AppMethodBeat.o(92728);
          i = 3;
        }
      }
    }
  }

  public static int getProxyInfo(StringBuffer paramStringBuffer)
  {
    return -1;
  }

  public static long getSignal(boolean paramBoolean)
  {
    long l1 = 0L;
    AppMethodBeat.i(92736);
    try
    {
      if (PlatformComm.context == null)
      {
        PlatformComm.Assert.assertTrue(false);
        AppMethodBeat.o(92736);
      }
      while (true)
      {
        return l1;
        long l2;
        if (paramBoolean)
        {
          l2 = NetworkSignalUtil.getWifiSignalStrength();
          l1 = l2;
          AppMethodBeat.o(92736);
        }
        else
        {
          l2 = NetworkSignalUtil.getGSMSignalStrength();
          l1 = l2;
          AppMethodBeat.o(92736);
        }
      }
    }
    catch (Exception localException)
    {
      while (true)
        AppMethodBeat.o(92736);
    }
  }

  public static int getStatisticsNetType()
  {
    int i = 0;
    AppMethodBeat.i(92729);
    if (PlatformComm.context == null)
    {
      PlatformComm.Assert.assertTrue(false);
      AppMethodBeat.o(92729);
    }
    while (true)
    {
      return i;
      try
      {
        i = NetStatusUtil.getNetType(PlatformComm.context);
        if (i == -1)
        {
          AppMethodBeat.o(92729);
          i = -1;
        }
        else
        {
          boolean bool = NetStatusUtil.is2G(PlatformComm.context);
          if (bool)
          {
            i = 3;
            AppMethodBeat.o(92729);
          }
          else
          {
            bool = NetStatusUtil.is3G(PlatformComm.context);
            if (bool)
            {
              i = 4;
              AppMethodBeat.o(92729);
            }
            else
            {
              bool = NetStatusUtil.is4G(PlatformComm.context);
              if (bool)
              {
                i = 5;
                AppMethodBeat.o(92729);
              }
              else
              {
                bool = NetStatusUtil.isWifi(i);
                if (bool)
                {
                  AppMethodBeat.o(92729);
                  i = 1;
                }
                else
                {
                  bool = NetStatusUtil.isWap(i);
                  if (bool)
                  {
                    i = 2;
                    AppMethodBeat.o(92729);
                  }
                  else
                  {
                    i = 6;
                    AppMethodBeat.o(92729);
                  }
                }
              }
            }
          }
        }
      }
      catch (Exception localException)
      {
        exception2String(localException);
        PlatformComm.Assert.assertTrue(localException.getClass().getSimpleName() + ":" + localException.getStackTrace()[0] + ", " + localException.getStackTrace()[1], false);
        AppMethodBeat.o(92729);
        i = -1;
      }
    }
  }

  public static boolean isNetworkConnected()
  {
    boolean bool1 = false;
    AppMethodBeat.i(92737);
    if (PlatformComm.context == null)
    {
      PlatformComm.Assert.assertTrue(false);
      AppMethodBeat.o(92737);
    }
    while (true)
    {
      return bool1;
      try
      {
        boolean bool2 = NetStatusUtil.isNetworkConnected(PlatformComm.context);
        bool1 = bool2;
        AppMethodBeat.o(92737);
      }
      catch (Exception localException)
      {
        exception2String(localException);
        PlatformComm.Assert.assertTrue(localException.getClass().getSimpleName() + ":" + localException.getStackTrace()[0] + ", " + localException.getStackTrace()[1], false);
        AppMethodBeat.o(92737);
      }
    }
  }

  public static boolean startAlarm(int paramInt1, int paramInt2)
  {
    boolean bool1 = false;
    AppMethodBeat.i(92730);
    boolean bool2;
    if (PlatformComm.context == null)
    {
      PlatformComm.Assert.assertTrue(false);
      AppMethodBeat.o(92730);
      bool2 = bool1;
    }
    while (true)
    {
      return bool2;
      long l = paramInt1;
      try
      {
        bool2 = Alarm.start(l, paramInt2, PlatformComm.context);
        AppMethodBeat.o(92730);
      }
      catch (Exception localException)
      {
        exception2String(localException);
        PlatformComm.Assert.assertTrue(localException.getClass().getSimpleName() + ":" + localException.getStackTrace()[0] + ", " + localException.getStackTrace()[1], false);
        AppMethodBeat.o(92730);
        bool2 = bool1;
      }
    }
  }

  public static boolean stopAlarm(int paramInt)
  {
    boolean bool1 = false;
    AppMethodBeat.i(92731);
    boolean bool2;
    if (PlatformComm.context == null)
    {
      PlatformComm.Assert.assertTrue(false);
      AppMethodBeat.o(92731);
      bool2 = bool1;
    }
    while (true)
    {
      return bool2;
      long l = paramInt;
      try
      {
        bool2 = Alarm.stop(l, PlatformComm.context);
        AppMethodBeat.o(92731);
      }
      catch (Exception localException)
      {
        exception2String(localException);
        PlatformComm.Assert.assertTrue(localException.getClass().getSimpleName() + ":" + localException.getStackTrace()[0] + ", " + localException.getStackTrace()[1], false);
        AppMethodBeat.o(92731);
        bool2 = bool1;
      }
    }
  }

  public static WakerLock wakeupLock_new()
  {
    Object localObject = null;
    AppMethodBeat.i(92738);
    if (PlatformComm.context == null)
    {
      PlatformComm.Assert.assertTrue(false);
      AppMethodBeat.o(92738);
    }
    while (true)
    {
      return localObject;
      try
      {
        WakerLock localWakerLock = new com/tencent/voip/mars/comm/WakerLock;
        localWakerLock.<init>(PlatformComm.context);
        AppMethodBeat.o(92738);
        localObject = localWakerLock;
      }
      catch (Exception localException)
      {
        exception2String(localException);
        PlatformComm.Assert.assertTrue(localException.getClass().getSimpleName() + ":" + localException.getStackTrace()[0] + ", " + localException.getStackTrace()[1], false);
        AppMethodBeat.o(92738);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.voip.mars.comm.PlatformComm.C2Java
 * JD-Core Version:    0.6.2
 */