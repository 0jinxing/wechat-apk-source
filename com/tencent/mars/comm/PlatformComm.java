package com.tencent.mars.comm;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.telephony.TelephonyManager;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.at;
import java.io.PrintWriter;
import java.io.StringWriter;

public class PlatformComm
{
  static final int EMobile = 2;
  static final int ENoNet = -1;
  static final int EOtherNet = 3;
  static final int EWifi = 1;
  private static final boolean IS_PROXY_ON = false;
  static final int NETTYPE_2G = 3;
  static final int NETTYPE_3G = 4;
  static final int NETTYPE_4G = 5;
  static final int NETTYPE_NON = -1;
  static final int NETTYPE_NOT_WIFI = 0;
  static final int NETTYPE_UNKNOWN = 6;
  static final int NETTYPE_WAP = 2;
  static final int NETTYPE_WIFI = 1;
  private static final String TAG = "PlatformComm";
  private static Context context = null;
  private static ak handler = null;
  public static IResetProcess resetprocessimp = null;

  public static void init(Context paramContext, ak paramak)
  {
    context = paramContext;
    handler = paramak;
    NetworkSignalUtil.InitNetworkSignalUtil(paramContext);
  }

  static class APNInfo
  {
    public String extraInfo;
    public int netType;
    public int subNetType;
  }

  static class Assert
  {
    static void assertTrue(String paramString, boolean paramBoolean)
    {
    }

    static void assertTrue(boolean paramBoolean)
    {
    }
  }

  public static class C2Java
  {
    private static String exception2String(Exception paramException)
    {
      StringWriter localStringWriter = new StringWriter();
      paramException.printStackTrace(new PrintWriter(localStringWriter));
      return localStringWriter.toString();
    }

    public static PlatformComm.APNInfo getAPNInfo()
    {
      try
      {
        Object localObject1 = ((ConnectivityManager)PlatformComm.context.getSystemService("connectivity")).getActiveNetworkInfo();
        PlatformComm.APNInfo localAPNInfo = new com/tencent/mars/comm/PlatformComm$APNInfo;
        localAPNInfo.<init>();
        if (localObject1 != null)
        {
          localAPNInfo.netType = ((NetworkInfo)localObject1).getType();
          localAPNInfo.subNetType = ((NetworkInfo)localObject1).getSubtype();
          if (1 != ((NetworkInfo)localObject1).getType())
            if (((NetworkInfo)localObject1).getExtraInfo() == null)
            {
              localObject1 = "";
              localAPNInfo.extraInfo = ((String)localObject1);
            }
          for (localObject1 = localAPNInfo; ; localObject1 = localAPNInfo)
          {
            return localObject1;
            localObject1 = ((NetworkInfo)localObject1).getExtraInfo();
            break;
            localAPNInfo.extraInfo = getCurWifiInfo().ssid;
          }
        }
      }
      catch (Exception localException)
      {
        while (true)
        {
          ab.printErrStackTrace("PlatformComm", localException, "", new Object[0]);
          Object localObject2 = null;
        }
      }
    }

    public static int getCurRadioAccessNetworkInfo()
    {
      int i;
      if (PlatformComm.context == null)
      {
        PlatformComm.Assert.assertTrue(false);
        i = 0;
      }
      while (true)
      {
        return i;
        try
        {
          i = ((TelephonyManager)PlatformComm.context.getSystemService("phone")).getNetworkType();
        }
        catch (Exception localException)
        {
          ab.e("PlatformComm", exception2String(localException));
          ab.printErrStackTrace("PlatformComm", localException, "", new Object[0]);
          PlatformComm.Assert.assertTrue(localException.getClass().getSimpleName() + ":" + localException.getStackTrace()[0] + ", " + localException.getStackTrace()[1], false);
          i = 0;
        }
      }
    }

    public static PlatformComm.SIMInfo getCurSIMInfo()
    {
      Object localObject1 = null;
      try
      {
        Object localObject2;
        if (PlatformComm.context == null)
          localObject2 = localObject1;
        while (true)
        {
          return localObject2;
          int i = at.getISPCode(PlatformComm.context);
          localObject2 = localObject1;
          if (i != 0)
          {
            localObject2 = new com/tencent/mars/comm/PlatformComm$SIMInfo;
            ((PlatformComm.SIMInfo)localObject2).<init>();
            ((PlatformComm.SIMInfo)localObject2).ispCode = String.valueOf(i);
            ab.d("PlatformComm", "getISPCode MCC_MNC=%s", new Object[] { ((PlatformComm.SIMInfo)localObject2).ispCode });
            ((PlatformComm.SIMInfo)localObject2).ispName = at.getISPName(PlatformComm.context);
          }
        }
      }
      catch (Exception localException)
      {
        while (true)
        {
          ab.printErrStackTrace("PlatformComm", localException, "", new Object[0]);
          Object localObject3 = localObject1;
        }
      }
    }

    public static PlatformComm.WifiInfo getCurWifiInfo()
    {
      try
      {
        Object localObject1;
        if (PlatformComm.context == null)
          localObject1 = null;
        while (true)
        {
          return localObject1;
          localObject1 = (ConnectivityManager)PlatformComm.context.getSystemService("connectivity");
          if (localObject1 == null)
            localObject1 = null;
          else
            try
            {
              localObject1 = ((ConnectivityManager)localObject1).getActiveNetworkInfo();
              if ((localObject1 == null) || (1 != ((NetworkInfo)localObject1).getType()))
                localObject1 = null;
            }
            catch (Exception localException1)
            {
              while (true)
              {
                ab.e("PlatformComm", "getActiveNetworkInfo failed.");
                localWifiInfo = null;
              }
              PlatformComm.WifiInfo localWifiInfo = new com/tencent/mars/comm/PlatformComm$WifiInfo;
              localWifiInfo.<init>();
              localWifiInfo.ssid = at.gE(ah.getContext());
              localWifiInfo.bssid = at.gF(ah.getContext());
            }
        }
      }
      catch (Exception localException2)
      {
        while (true)
        {
          ab.printErrStackTrace("PlatformComm", localException2, "", new Object[0]);
          Object localObject2 = null;
        }
      }
    }

    public static int getNetInfo()
    {
      try
      {
        Object localObject1 = (ConnectivityManager)PlatformComm.context.getSystemService("connectivity");
        if (localObject1 == null);
        for (i = -1; ; i = -1)
        {
          return i;
          localObject1 = ((ConnectivityManager)localObject1).getActiveNetworkInfo();
          if (localObject1 != null)
            break;
        }
      }
      catch (Exception localException1)
      {
        while (true)
        {
          int i;
          Object localObject2 = null;
          continue;
          try
          {
            i = localObject2.getType();
            switch (i)
            {
            default:
              i = 3;
              break;
            case 1:
              i = 1;
              break;
            case 0:
            case 2:
            case 3:
            case 4:
            case 5:
              i = 2;
            }
          }
          catch (Exception localException2)
          {
            ab.printErrStackTrace("PlatformComm", localException2, "", new Object[0]);
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
      try
      {
        if (PlatformComm.context == null)
          PlatformComm.Assert.assertTrue(false);
        while (true)
        {
          return l1;
          long l2;
          if (paramBoolean)
          {
            l2 = NetworkSignalUtil.getWifiSignalStrength();
            l1 = l2;
          }
          else
          {
            l2 = NetworkSignalUtil.getGSMSignalStrength();
            l1 = l2;
          }
        }
      }
      catch (Exception localException)
      {
        while (true)
          ab.printErrStackTrace("PlatformComm", localException, "", new Object[0]);
      }
    }

    public static int getStatisticsNetType()
    {
      int i = 0;
      if (PlatformComm.context == null)
        PlatformComm.Assert.assertTrue(false);
      while (true)
      {
        return i;
        try
        {
          i = at.getNetType(PlatformComm.context);
          if (i == -1)
          {
            i = -1;
          }
          else if (at.is2G(PlatformComm.context))
          {
            i = 3;
          }
          else if (at.is3G(PlatformComm.context))
          {
            i = 4;
          }
          else if (at.is4G(PlatformComm.context))
          {
            i = 5;
          }
          else if (at.isWifi(i))
          {
            i = 1;
          }
          else
          {
            boolean bool = at.isWap(i);
            if (bool)
              i = 2;
            else
              i = 6;
          }
        }
        catch (Exception localException)
        {
          ab.e("PlatformComm", exception2String(localException));
          ab.printErrStackTrace("PlatformComm", localException, "", new Object[0]);
          PlatformComm.Assert.assertTrue(localException.getClass().getSimpleName() + ":" + localException.getStackTrace()[0] + ", " + localException.getStackTrace()[1], false);
          i = -1;
        }
      }
    }

    public static boolean isNetworkConnected()
    {
      boolean bool1 = false;
      if (PlatformComm.context == null)
        PlatformComm.Assert.assertTrue(false);
      while (true)
      {
        return bool1;
        try
        {
          boolean bool2 = at.isNetworkConnected(PlatformComm.context);
          bool1 = bool2;
        }
        catch (Exception localException)
        {
          ab.e("PlatformComm", exception2String(localException));
          ab.printErrStackTrace("PlatformComm", localException, "", new Object[0]);
          PlatformComm.Assert.assertTrue(localException.getClass().getSimpleName() + ":" + localException.getStackTrace()[0] + ", " + localException.getStackTrace()[1], false);
        }
      }
    }

    public static void restartProcess()
    {
      if (PlatformComm.resetprocessimp == null);
      while (true)
      {
        return;
        try
        {
          ak localak = PlatformComm.handler;
          Runnable local1 = new com/tencent/mars/comm/PlatformComm$C2Java$1;
          local1.<init>();
          localak.post(local1);
        }
        catch (Exception localException)
        {
          ab.printErrStackTrace("PlatformComm", localException, "", new Object[0]);
        }
      }
    }

    public static boolean startAlarm(int paramInt1, int paramInt2)
    {
      boolean bool1 = false;
      boolean bool2;
      if (PlatformComm.context == null)
      {
        PlatformComm.Assert.assertTrue(false);
        bool2 = bool1;
      }
      while (true)
      {
        return bool2;
        long l = paramInt1;
        try
        {
          bool2 = Alarm.start(l, paramInt2, PlatformComm.context);
        }
        catch (Exception localException)
        {
          ab.e("PlatformComm", exception2String(localException));
          ab.printErrStackTrace("PlatformComm", localException, "", new Object[0]);
          PlatformComm.Assert.assertTrue(localException.getClass().getSimpleName() + ":" + localException.getStackTrace()[0] + ", " + localException.getStackTrace()[1], false);
          bool2 = bool1;
        }
      }
    }

    public static boolean stopAlarm(int paramInt)
    {
      boolean bool1 = false;
      boolean bool2;
      if (PlatformComm.context == null)
      {
        PlatformComm.Assert.assertTrue(false);
        bool2 = bool1;
      }
      while (true)
      {
        return bool2;
        long l = paramInt;
        try
        {
          bool2 = Alarm.stop(l, PlatformComm.context);
        }
        catch (Exception localException)
        {
          ab.e("PlatformComm", exception2String(localException));
          ab.printErrStackTrace("PlatformComm", localException, "", new Object[0]);
          PlatformComm.Assert.assertTrue(localException.getClass().getSimpleName() + ":" + localException.getStackTrace()[0] + ", " + localException.getStackTrace()[1], false);
          bool2 = bool1;
        }
      }
    }

    public static WakerLock wakeupLock_new()
    {
      Object localObject = null;
      if (PlatformComm.context == null)
        PlatformComm.Assert.assertTrue(false);
      while (true)
      {
        return localObject;
        try
        {
          WakerLock localWakerLock = new com/tencent/mars/comm/WakerLock;
          localWakerLock.<init>(PlatformComm.context, "PlatformComm");
          localObject = localWakerLock;
        }
        catch (Exception localException)
        {
          ab.e("PlatformComm", exception2String(localException));
          ab.printErrStackTrace("PlatformComm", localException, "", new Object[0]);
          PlatformComm.Assert.assertTrue(localException.getClass().getSimpleName() + ":" + localException.getStackTrace()[0] + ", " + localException.getStackTrace()[1], false);
        }
      }
    }
  }

  public static abstract interface IResetProcess
  {
    public abstract void restartProcess();
  }

  static class SIMInfo
  {
    public String ispCode;
    public String ispName;
  }

  static class WifiInfo
  {
    public String bssid;
    public String ssid;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mars.comm.PlatformComm
 * JD-Core Version:    0.6.2
 */