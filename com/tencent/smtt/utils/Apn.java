package com.tencent.smtt.utils;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import com.tencent.matrix.trace.core.AppMethodBeat;

public class Apn
{
  public static final int APN_2G = 1;
  public static final int APN_3G = 2;
  public static final int APN_4G = 4;
  public static final int APN_UNKNOWN = 0;
  public static final int APN_WIFI = 3;

  public static String getApnInfo(Context paramContext)
  {
    AppMethodBeat.i(65169);
    try
    {
      paramContext = ((ConnectivityManager)paramContext.getSystemService("connectivity")).getActiveNetworkInfo();
      int i;
      if ((paramContext != null) && (paramContext.isConnectedOrConnecting()))
        i = paramContext.getType();
      switch (i)
      {
      default:
        label56: paramContext = "unknown";
      case 1:
      case 0:
      }
      while (true)
      {
        AppMethodBeat.o(65169);
        return paramContext;
        paramContext = "wifi";
        continue;
        paramContext = paramContext.getExtraInfo();
      }
    }
    catch (Exception paramContext)
    {
      break label56;
    }
  }

  public static int getApnType(Context paramContext)
  {
    AppMethodBeat.i(65170);
    paramContext = ((ConnectivityManager)paramContext.getSystemService("connectivity")).getActiveNetworkInfo();
    int i;
    if ((paramContext != null) && (paramContext.isConnectedOrConnecting()))
      switch (paramContext.getType())
      {
      default:
        i = 0;
      case 1:
      case 0:
      }
    while (true)
    {
      AppMethodBeat.o(65170);
      return i;
      i = 3;
      continue;
      switch (paramContext.getSubtype())
      {
      default:
        i = 0;
        break;
      case 1:
      case 2:
      case 4:
      case 7:
      case 11:
        i = 1;
        break;
      case 3:
      case 5:
      case 6:
      case 8:
      case 9:
      case 10:
      case 12:
      case 14:
      case 15:
        i = 2;
        break;
      case 13:
        i = 4;
        continue;
        i = 0;
      }
    }
  }

  public static String getWifiSSID(Context paramContext)
  {
    AppMethodBeat.i(65172);
    try
    {
      paramContext = ((WifiManager)paramContext.getSystemService("wifi")).getConnectionInfo();
      if (paramContext != null)
      {
        paramContext = paramContext.getBSSID();
        AppMethodBeat.o(65172);
        return paramContext;
      }
    }
    catch (Throwable paramContext)
    {
      while (true)
      {
        paramContext = "";
        AppMethodBeat.o(65172);
        continue;
        paramContext = null;
      }
    }
  }

  public static boolean isNetworkAvailable(Context paramContext)
  {
    AppMethodBeat.i(65171);
    paramContext = ((ConnectivityManager)paramContext.getSystemService("connectivity")).getActiveNetworkInfo();
    boolean bool;
    if (paramContext == null)
    {
      AppMethodBeat.o(65171);
      bool = false;
    }
    while (true)
    {
      return bool;
      if ((paramContext.isConnected()) || (paramContext.isAvailable()))
      {
        bool = true;
        AppMethodBeat.o(65171);
      }
      else
      {
        AppMethodBeat.o(65171);
        bool = false;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.smtt.utils.Apn
 * JD-Core Version:    0.6.2
 */