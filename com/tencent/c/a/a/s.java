package com.tencent.c.a.a;

import android.content.Context;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.wifi.ScanResult;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build.VERSION;
import android.os.Environment;
import android.os.StatFs;
import android.telephony.TelephonyManager;
import android.util.Base64;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.File;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

public final class s
{
  static String Aa()
  {
    AppMethodBeat.i(125768);
    try
    {
      File localFile = Environment.getDataDirectory();
      Object localObject = new android/os/StatFs;
      ((StatFs)localObject).<init>(localFile.getPath());
      long l1 = ((StatFs)localObject).getBlockSize();
      long l2 = ((StatFs)localObject).getBlockCount() * l1 / 1000000L;
      l1 = ((StatFs)localObject).getAvailableBlocks() * l1 / 1000000L;
      localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>(String.valueOf(String.valueOf(l1)));
      localObject = "/" + String.valueOf(l2);
      AppMethodBeat.o(125768);
      return localObject;
    }
    catch (Throwable localThrowable)
    {
      while (true)
      {
        zY();
        String str = "";
        AppMethodBeat.o(125768);
      }
    }
  }

  static g a(g paramg1, g paramg2)
  {
    AppMethodBeat.i(125754);
    if ((paramg1 != null) && (paramg2 != null))
      if (paramg1.a(paramg2) >= 0)
        AppMethodBeat.o(125754);
    while (true)
    {
      return paramg1;
      AppMethodBeat.o(125754);
      paramg1 = paramg2;
      continue;
      if (paramg1 != null)
      {
        AppMethodBeat.o(125754);
      }
      else if (paramg2 != null)
      {
        AppMethodBeat.o(125754);
        paramg1 = paramg2;
      }
      else
      {
        paramg1 = null;
        AppMethodBeat.o(125754);
      }
    }
  }

  static void a(JSONObject paramJSONObject, String paramString1, String paramString2)
  {
    AppMethodBeat.i(125758);
    if (co(paramString2))
      paramJSONObject.put(paramString1, paramString2);
    AppMethodBeat.o(125758);
  }

  static boolean aJ(Context paramContext)
  {
    AppMethodBeat.i(125757);
    try
    {
      paramContext = ((ConnectivityManager)paramContext.getSystemService("connectivity")).getActiveNetworkInfo();
      if ((paramContext != null) && (paramContext.getTypeName() != null))
      {
        bool = paramContext.getTypeName().equalsIgnoreCase("WIFI");
        if (bool)
        {
          bool = true;
          AppMethodBeat.o(125757);
          return bool;
        }
      }
    }
    catch (Exception paramContext)
    {
      while (true)
      {
        boolean bool = false;
        AppMethodBeat.o(125757);
      }
    }
  }

  static String aK(Context paramContext)
  {
    AppMethodBeat.i(125762);
    if (q(paramContext, "android.permission.ACCESS_WIFI_STATE"));
    while (true)
    {
      try
      {
        paramContext = (WifiManager)paramContext.getSystemService("wifi");
        if (paramContext == null)
        {
          paramContext = "";
          AppMethodBeat.o(125762);
          return paramContext;
        }
        paramContext = paramContext.getConnectionInfo().getMacAddress();
        AppMethodBeat.o(125762);
        continue;
      }
      catch (Exception paramContext)
      {
        "get wifi address error".concat(String.valueOf(paramContext));
        zX();
        paramContext = "";
        AppMethodBeat.o(125762);
        continue;
      }
      zX();
      paramContext = "";
      AppMethodBeat.o(125762);
    }
  }

  static String aL(Context paramContext)
  {
    AppMethodBeat.i(125764);
    try
    {
      paramContext = getWifiInfo(paramContext);
      if (paramContext != null)
      {
        paramContext = paramContext.getBSSID();
        AppMethodBeat.o(125764);
        return paramContext;
      }
    }
    catch (Throwable paramContext)
    {
      while (true)
      {
        zY();
        paramContext = null;
        AppMethodBeat.o(125764);
      }
    }
  }

  static String aM(Context paramContext)
  {
    AppMethodBeat.i(125765);
    try
    {
      paramContext = getWifiInfo(paramContext);
      if (paramContext != null)
      {
        paramContext = paramContext.getSSID();
        AppMethodBeat.o(125765);
        return paramContext;
      }
    }
    catch (Throwable paramContext)
    {
      while (true)
      {
        zY();
        paramContext = null;
        AppMethodBeat.o(125765);
      }
    }
  }

  static JSONArray aN(Context paramContext)
  {
    AppMethodBeat.i(125766);
    try
    {
      List localList;
      int i;
      if ((q(paramContext, "android.permission.INTERNET")) && (q(paramContext, "android.permission.ACCESS_NETWORK_STATE")))
      {
        paramContext = (WifiManager)paramContext.getSystemService("wifi");
        if (paramContext == null)
          break label167;
        localList = paramContext.getScanResults();
        if ((localList == null) || (localList.size() <= 0))
          break label167;
        paramContext = new com/tencent/c/a/a/s$1;
        paramContext.<init>();
        Collections.sort(localList, paramContext);
        paramContext = new org/json/JSONArray;
        paramContext.<init>();
        i = 0;
        int j = localList.size();
        if (i >= j)
          label90: AppMethodBeat.o(125766);
      }
      while (true)
      {
        return paramContext;
        if (i >= 10)
          break label90;
        ScanResult localScanResult = (ScanResult)localList.get(i);
        JSONObject localJSONObject = new org/json/JSONObject;
        localJSONObject.<init>();
        localJSONObject.put("bs", localScanResult.BSSID);
        localJSONObject.put("ss", localScanResult.SSID);
        paramContext.put(localJSONObject);
        i++;
        break;
        zX();
        label167: paramContext = null;
        AppMethodBeat.o(125766);
      }
    }
    catch (Throwable paramContext)
    {
      while (true)
        zY();
    }
  }

  static String aO(Context paramContext)
  {
    Object localObject = null;
    AppMethodBeat.i(125767);
    try
    {
      if (q(paramContext, "android.permission.WRITE_EXTERNAL_STORAGE"))
      {
        paramContext = Environment.getExternalStorageState();
        if ((paramContext != null) && (paramContext.equals("mounted")))
        {
          String str = Environment.getExternalStorageDirectory().getPath();
          if (str != null)
          {
            paramContext = new android/os/StatFs;
            paramContext.<init>(str);
            long l1 = paramContext.getBlockCount() * paramContext.getBlockSize() / 1000000L;
            long l2 = paramContext.getAvailableBlocks();
            l2 = paramContext.getBlockSize() * l2 / 1000000L;
            paramContext = new java/lang/StringBuilder;
            paramContext.<init>(String.valueOf(String.valueOf(l2)));
            paramContext = "/" + String.valueOf(l1);
            AppMethodBeat.o(125767);
          }
        }
      }
      else
      {
        while (true)
        {
          return paramContext;
          zX();
          AppMethodBeat.o(125767);
          paramContext = localObject;
        }
      }
    }
    catch (Throwable paramContext)
    {
      while (true)
      {
        zZ();
        AppMethodBeat.o(125767);
        paramContext = localObject;
      }
    }
  }

  static String aP(Context paramContext)
  {
    AppMethodBeat.i(125769);
    try
    {
      String str1;
      String str2;
      if ((q(paramContext, "android.permission.INTERNET")) && (q(paramContext, "android.permission.ACCESS_NETWORK_STATE")))
      {
        paramContext = ((ConnectivityManager)paramContext.getSystemService("connectivity")).getActiveNetworkInfo();
        if ((paramContext == null) || (!paramContext.isConnected()))
          break label129;
        str1 = paramContext.getTypeName();
        str2 = paramContext.getExtraInfo();
        if (str1 == null)
          break label129;
        if (str1.equalsIgnoreCase("WIFI"))
          paramContext = "WIFI";
      }
      while (true)
      {
        AppMethodBeat.o(125769);
        return paramContext;
        if (str1.equalsIgnoreCase("MOBILE"))
        {
          paramContext = str2;
          if (str2 == null)
            paramContext = "MOBILE";
        }
        else
        {
          paramContext = str2;
          if (str2 == null)
          {
            paramContext = str1;
            continue;
            zX();
            paramContext = null;
          }
        }
      }
    }
    catch (Throwable paramContext)
    {
      while (true)
      {
        paramContext = null;
        zY();
        continue;
        label129: paramContext = null;
      }
    }
  }

  static boolean b(g paramg1, g paramg2)
  {
    boolean bool = true;
    AppMethodBeat.i(125755);
    if ((paramg1 != null) && (paramg2 != null))
      if (paramg1.a(paramg2) == 0)
        AppMethodBeat.o(125755);
    while (true)
    {
      return bool;
      AppMethodBeat.o(125755);
      bool = false;
      continue;
      if ((paramg1 == null) && (paramg2 == null))
      {
        AppMethodBeat.o(125755);
      }
      else
      {
        AppMethodBeat.o(125755);
        bool = false;
      }
    }
  }

  static boolean co(String paramString)
  {
    AppMethodBeat.i(125752);
    boolean bool;
    if ((paramString == null) || (paramString.trim().length() == 0))
    {
      bool = false;
      AppMethodBeat.o(125752);
    }
    while (true)
    {
      return bool;
      bool = true;
      AppMethodBeat.o(125752);
    }
  }

  static boolean cp(String paramString)
  {
    AppMethodBeat.i(125753);
    boolean bool;
    if ((paramString != null) && (paramString.trim().length() >= 40))
    {
      bool = true;
      AppMethodBeat.o(125753);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(125753);
    }
  }

  static String decode(String paramString)
  {
    AppMethodBeat.i(125759);
    if (paramString == null)
    {
      paramString = null;
      AppMethodBeat.o(125759);
    }
    while (true)
    {
      return paramString;
      if (Build.VERSION.SDK_INT < 8)
        AppMethodBeat.o(125759);
      else
        try
        {
          byte[] arrayOfByte = l.encrypt(Base64.decode(paramString.getBytes("UTF-8"), 0), Base64.decode("MDNhOTc2NTExZTJjYmUzYTdmMjY4MDhmYjdhZjNjMDU=", 0));
          String str = new java/lang/String;
          str.<init>(arrayOfByte, "UTF-8");
          str = str.trim().replace("\t", "").replace("\n", "").replace("\r", "");
          paramString = str;
          AppMethodBeat.o(125759);
        }
        catch (Throwable localThrowable)
        {
          zZ();
          AppMethodBeat.o(125759);
        }
    }
  }

  static String encode(String paramString)
  {
    AppMethodBeat.i(125760);
    if (paramString == null)
    {
      paramString = null;
      AppMethodBeat.o(125760);
    }
    while (true)
    {
      return paramString;
      if (Build.VERSION.SDK_INT < 8)
        AppMethodBeat.o(125760);
      else
        try
        {
          byte[] arrayOfByte = Base64.encode(l.encrypt(paramString.getBytes("UTF-8"), Base64.decode("MDNhOTc2NTExZTJjYmUzYTdmMjY4MDhmYjdhZjNjMDU=", 0)), 0);
          String str = new java/lang/String;
          str.<init>(arrayOfByte, "UTF-8");
          str = str.trim().replace("\t", "").replace("\n", "").replace("\r", "");
          paramString = str;
          AppMethodBeat.o(125760);
        }
        catch (Throwable localThrowable)
        {
          zZ();
          AppMethodBeat.o(125760);
        }
    }
  }

  static String getImei(Context paramContext)
  {
    AppMethodBeat.i(125761);
    try
    {
      if (q(paramContext, "android.permission.READ_PHONE_STATE"))
      {
        paramContext = ((TelephonyManager)paramContext.getSystemService("phone")).getDeviceId();
        if (paramContext == null)
          break label45;
        AppMethodBeat.o(125761);
      }
      while (true)
      {
        return paramContext;
        zX();
        label45: paramContext = "";
        AppMethodBeat.o(125761);
      }
    }
    catch (Throwable paramContext)
    {
      while (true)
        zY();
    }
  }

  private static WifiInfo getWifiInfo(Context paramContext)
  {
    AppMethodBeat.i(125763);
    if (q(paramContext, "android.permission.ACCESS_WIFI_STATE"))
    {
      paramContext = (WifiManager)paramContext.getApplicationContext().getSystemService("wifi");
      if (paramContext != null)
      {
        paramContext = paramContext.getConnectionInfo();
        AppMethodBeat.o(125763);
      }
    }
    while (true)
    {
      return paramContext;
      paramContext = null;
      AppMethodBeat.o(125763);
    }
  }

  static boolean q(Context paramContext, String paramString)
  {
    boolean bool = false;
    AppMethodBeat.i(125756);
    try
    {
      int i = paramContext.getPackageManager().checkPermission(paramString, paramContext.getPackageName());
      if (i == 0)
        bool = true;
      AppMethodBeat.o(125756);
      return bool;
    }
    catch (Throwable paramContext)
    {
      while (true)
        zZ();
    }
  }

  static void zX()
  {
    if (i.cbw != null)
      h localh = i.cbw;
  }

  static void zY()
  {
    if (i.cbw != null)
      h localh = i.cbw;
  }

  public static void zZ()
  {
    if (i.cbw != null)
      h localh = i.cbw;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.c.a.a.s
 * JD-Core Version:    0.6.2
 */