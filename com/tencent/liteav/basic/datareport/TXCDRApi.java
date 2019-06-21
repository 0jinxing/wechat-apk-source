package com.tencent.liteav.basic.datareport;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.Build.VERSION;
import android.os.Environment;
import android.provider.Settings.Secure;
import android.telephony.TelephonyManager;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.liteav.basic.util.TXCCommonUtil;
import com.tencent.liteav.basic.util.b;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.security.MessageDigest;
import java.util.UUID;

public class TXCDRApi
{
  private static final char[] DIGITS_LOWER;
  static final int NETWORK_TYPE_2G = 4;
  static final int NETWORK_TYPE_3G = 3;
  static final int NETWORK_TYPE_4G = 2;
  static final int NETWORK_TYPE_UNKNOWN = 255;
  static final int NETWORK_TYPE_WIFI = 1;
  static boolean initRpt;
  private static String mAppName;
  private static String mDevId;
  private static String mDevType;
  private static String mDevUUID;
  private static String mMacAddr;
  private static String mNetType;
  private static String mSysVersion;

  static
  {
    AppMethodBeat.i(66308);
    mDevType = "";
    mNetType = "";
    mDevId = "";
    mDevUUID = "";
    mAppName = "";
    mSysVersion = "";
    mMacAddr = "";
    DIGITS_LOWER = new char[] { 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 97, 98, 99, 100, 101, 102 };
    initRpt = false;
    b.e();
    nativeInitDataReport();
    AppMethodBeat.o(66308);
  }

  public static void InitEvent(Context paramContext, String paramString, int paramInt1, int paramInt2, TXCDRExtInfo paramTXCDRExtInfo)
  {
    AppMethodBeat.i(66286);
    setCommonInfo(paramContext);
    if (paramString == null)
      AppMethodBeat.o(66286);
    while (true)
    {
      return;
      nativeInitEventInternal(paramString, paramInt1, paramInt2, paramTXCDRExtInfo);
      AppMethodBeat.o(66286);
    }
  }

  private static String byteArrayToHexString(byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(66297);
    char[] arrayOfChar = new char[paramArrayOfByte.length << 1];
    int i = 0;
    for (int j = 0; j < paramArrayOfByte.length; j++)
    {
      int k = i + 1;
      arrayOfChar[i] = ((char)DIGITS_LOWER[((paramArrayOfByte[j] & 0xF0) >>> 4)]);
      i = k + 1;
      arrayOfChar[k] = ((char)DIGITS_LOWER[(paramArrayOfByte[j] & 0xF)]);
    }
    paramArrayOfByte = new String(arrayOfChar);
    AppMethodBeat.o(66297);
    return paramArrayOfByte;
  }

  public static String doRead(Context paramContext)
  {
    AppMethodBeat.i(66299);
    try
    {
      paramContext = (TelephonyManager)paramContext.getSystemService("phone");
      if (paramContext != null)
      {
        paramContext = paramContext.getDeviceId();
        localObject = paramContext;
        if (paramContext == null)
          localObject = "";
        TXCLog.d("rtmpsdk", "deviceinfo:".concat(String.valueOf(localObject)));
        paramContext = string2Md5((String)localObject);
        AppMethodBeat.o(66299);
        return paramContext;
      }
    }
    catch (Exception paramContext)
    {
      while (true)
      {
        Object localObject = "";
        continue;
        paramContext = "";
      }
    }
  }

  public static String getApplicationNameByPackageName(Context paramContext, String paramString)
  {
    AppMethodBeat.i(66306);
    paramContext = paramContext.getPackageManager();
    try
    {
      paramContext = paramContext.getApplicationLabel(paramContext.getApplicationInfo(paramString, 128)).toString();
      AppMethodBeat.o(66306);
      return paramContext;
    }
    catch (Exception paramContext)
    {
      while (true)
        paramContext = "";
    }
  }

  public static String getDevUUID(Context paramContext, String paramString)
  {
    AppMethodBeat.i(66303);
    SharedPreferences localSharedPreferences = paramContext.getSharedPreferences("com.tencent.liteav.dev_uuid", 0);
    String str = localSharedPreferences.getString("com.tencent.liteav.key_dev_uuid", "");
    Object localObject1 = "";
    Object localObject2 = localObject1;
    try
    {
      paramContext = new java/lang/StringBuilder;
      localObject2 = localObject1;
      paramContext.<init>();
      localObject2 = localObject1;
      paramContext = Environment.getExternalStorageDirectory().getAbsolutePath() + "/txrtmp/spuid";
      localObject2 = localObject1;
      Object localObject3 = new java/io/File;
      localObject2 = localObject1;
      ((File)localObject3).<init>(paramContext);
      paramContext = (Context)localObject1;
      localObject2 = localObject1;
      if (((File)localObject3).exists())
      {
        localObject2 = localObject1;
        FileInputStream localFileInputStream = new java/io/FileInputStream;
        localObject2 = localObject1;
        localFileInputStream.<init>((File)localObject3);
        localObject2 = localObject1;
        int i = localFileInputStream.available();
        paramContext = (Context)localObject1;
        if (i > 0)
        {
          localObject2 = localObject1;
          localObject3 = new byte[i];
          localObject2 = localObject1;
          localFileInputStream.read((byte[])localObject3);
          localObject2 = localObject1;
          paramContext = new java/lang/String;
          localObject2 = localObject1;
          paramContext.<init>((byte[])localObject3, "UTF-8");
        }
        localObject2 = paramContext;
        localFileInputStream.close();
      }
      localObject1 = "";
      if (!str.isEmpty())
        localObject1 = str;
      if (!paramContext.isEmpty())
        localObject1 = paramContext;
      localObject2 = localObject1;
      if (((String)localObject1).isEmpty())
        localObject2 = string2Md5(paramString + UUID.randomUUID().toString());
      paramString = paramContext;
      if (paramContext.isEmpty());
      try
      {
        paramContext = new java/lang/StringBuilder;
        paramContext.<init>();
        paramContext = Environment.getExternalStorageDirectory().getAbsolutePath() + "/txrtmp";
        paramString = new java/io/File;
        paramString.<init>(paramContext);
        if (!paramString.exists())
          paramString.mkdir();
        paramContext = new java/lang/StringBuilder;
        paramContext.<init>();
        paramString = Environment.getExternalStorageDirectory().getAbsolutePath() + "/txrtmp/spuid";
        paramContext = new java/io/File;
        paramContext.<init>(paramString);
        if (!paramContext.exists())
          paramContext.createNewFile();
        paramString = new java/io/FileOutputStream;
        paramString.<init>(paramContext);
        paramString.write(((String)localObject2).getBytes());
        paramString.close();
        paramString = (String)localObject2;
        if (!str.equals(paramString))
        {
          paramContext = localSharedPreferences.edit();
          paramContext.putString("key_user_id", (String)localObject2);
          paramContext.commit();
        }
        AppMethodBeat.o(66303);
        return localObject2;
      }
      catch (Exception paramContext)
      {
        while (true)
          paramString = (String)localObject2;
      }
    }
    catch (Exception paramContext)
    {
      while (true)
        paramContext = (Context)localObject2;
    }
  }

  public static int getNetworkType(Context paramContext)
  {
    AppMethodBeat.i(66304);
    int i;
    if (paramContext == null)
    {
      AppMethodBeat.o(66304);
      i = 255;
    }
    while (true)
    {
      return i;
      Object localObject = (ConnectivityManager)paramContext.getSystemService("connectivity");
      paramContext = (TelephonyManager)paramContext.getSystemService("phone");
      localObject = ((ConnectivityManager)localObject).getActiveNetworkInfo();
      if (localObject == null)
      {
        AppMethodBeat.o(66304);
        i = 255;
      }
      else if (((NetworkInfo)localObject).getType() == 1)
      {
        AppMethodBeat.o(66304);
        i = 1;
      }
      else if (((NetworkInfo)localObject).getType() == 0)
      {
        switch (paramContext.getNetworkType())
        {
        default:
          AppMethodBeat.o(66304);
          i = 2;
          break;
        case 1:
        case 2:
        case 4:
        case 7:
        case 11:
          i = 4;
          AppMethodBeat.o(66304);
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
          i = 3;
          AppMethodBeat.o(66304);
          break;
        case 13:
          AppMethodBeat.o(66304);
          i = 2;
          break;
        }
      }
      else
      {
        AppMethodBeat.o(66304);
        i = 255;
      }
    }
  }

  public static String getOrigAndroidID(Context paramContext)
  {
    AppMethodBeat.i(66300);
    String str = "";
    try
    {
      paramContext = Settings.Secure.getString(paramContext.getContentResolver(), "android_id");
      paramContext = string2Md5(paramContext);
      AppMethodBeat.o(66300);
      return paramContext;
    }
    catch (Throwable paramContext)
    {
      while (true)
        paramContext = str;
    }
  }

  public static String getOrigMacAddr(Context paramContext)
  {
    AppMethodBeat.i(66301);
    try
    {
      paramContext = (WifiManager)paramContext.getSystemService("wifi");
      if (paramContext != null)
      {
        paramContext = paramContext.getConnectionInfo();
        if (paramContext == null)
          break label79;
        localObject = paramContext.getMacAddress();
        label35: paramContext = (Context)localObject;
        if (localObject == null);
      }
    }
    catch (Exception paramContext)
    {
      try
      {
        for (paramContext = string2Md5(((String)localObject).replaceAll(":", "").toUpperCase()); ; paramContext = "")
        {
          localObject = paramContext;
          if (paramContext == null)
            localObject = "";
          AppMethodBeat.o(66301);
          return localObject;
          paramContext = null;
          break;
          label79: localObject = null;
          break label35;
          paramContext = paramContext;
        }
      }
      catch (Exception paramContext)
      {
        while (true)
        {
          Object localObject;
          paramContext = (Context)localObject;
        }
      }
    }
  }

  private static String getPackageName(Context paramContext)
  {
    AppMethodBeat.i(66305);
    String str = "";
    try
    {
      paramContext = paramContext.getPackageManager().getPackageInfo(paramContext.getPackageName(), 0).packageName;
      AppMethodBeat.o(66305);
      return paramContext;
    }
    catch (Exception paramContext)
    {
      while (true)
        paramContext = str;
    }
  }

  public static String getSimulateIDFA(Context paramContext)
  {
    AppMethodBeat.i(66302);
    paramContext = doRead(paramContext) + ";" + getOrigMacAddr(paramContext) + ";" + getOrigAndroidID(paramContext);
    AppMethodBeat.o(66302);
    return paramContext;
  }

  public static int getStatusReportInterval()
  {
    AppMethodBeat.i(66292);
    int i = nativeGetStatusReportInterval();
    AppMethodBeat.o(66292);
    return i;
  }

  public static void initCrashReport(Context paramContext)
  {
    AppMethodBeat.i(66307);
    try
    {
      try
      {
        if ((!initRpt) && (paramContext != null))
        {
          String str = TXCCommonUtil.getSDKVersionStr();
          if (str != null)
          {
            paramContext = paramContext.getSharedPreferences("BuglySdkInfos", 0).edit();
            paramContext.putString("8e50744bf0", str);
            paramContext.commit();
            initRpt = true;
          }
        }
        return;
      }
      finally
      {
        AppMethodBeat.o(66307);
      }
    }
    catch (Exception paramContext)
    {
      while (true)
        AppMethodBeat.o(66307);
    }
  }

  public static native int nativeGetStatusReportInterval();

  private static native void nativeInitDataReport();

  private static native void nativeInitEventInternal(String paramString, int paramInt1, int paramInt2, TXCDRExtInfo paramTXCDRExtInfo);

  private static native void nativeReportDAUInterval(int paramInt1, int paramInt2, String paramString);

  public static native void nativeReportEvent(String paramString, int paramInt);

  public static native void nativeReportEvent40003(String paramString1, int paramInt1, int paramInt2, String paramString2, String paramString3);

  public static native void nativeSetCommonValue(String paramString1, String paramString2);

  private static native void nativeSetEventValueInterval(String paramString1, int paramInt, String paramString2, String paramString3);

  private static native void nativeUninitDataReport();

  public static void reportEvent40003(String paramString1, int paramInt1, int paramInt2, String paramString2, String paramString3)
  {
    AppMethodBeat.i(66291);
    nativeReportEvent40003(paramString1, paramInt1, paramInt2, paramString2, paramString3);
    AppMethodBeat.o(66291);
  }

  public static void setCommonInfo(Context paramContext)
  {
    AppMethodBeat.i(66293);
    mDevType = Build.MODEL;
    mNetType = Integer.toString(getNetworkType(paramContext));
    if (mDevId.isEmpty())
      mDevId = getSimulateIDFA(paramContext);
    if (mDevUUID.isEmpty())
      mDevUUID = getDevUUID(paramContext, mDevId);
    String str = getPackageName(paramContext);
    mAppName = getApplicationNameByPackageName(paramContext, str) + ":" + str;
    mSysVersion = String.valueOf(Build.VERSION.SDK_INT);
    mMacAddr = getOrigMacAddr(paramContext);
    txSetCommonInfo();
    AppMethodBeat.o(66293);
  }

  public static String string2Md5(String paramString)
  {
    AppMethodBeat.i(66298);
    String str = "";
    if (paramString == null)
      AppMethodBeat.o(66298);
    while (true)
    {
      return str;
      try
      {
        paramString = byteArrayToHexString(MessageDigest.getInstance("MD5").digest(paramString.getBytes("UTF-8")));
        str = paramString;
        if (paramString == null)
          str = "";
        AppMethodBeat.o(66298);
      }
      catch (Exception paramString)
      {
        while (true)
          paramString = str;
      }
    }
  }

  public static String txCreateToken()
  {
    AppMethodBeat.i(66296);
    String str = UUID.randomUUID().toString();
    AppMethodBeat.o(66296);
    return str;
  }

  public static void txReportDAU(Context paramContext, int paramInt)
  {
    AppMethodBeat.i(66289);
    if (paramContext != null)
      setCommonInfo(paramContext);
    nativeReportDAUInterval(paramInt, 0, "");
    AppMethodBeat.o(66289);
  }

  public static void txReportDAU(Context paramContext, int paramInt1, int paramInt2, String paramString)
  {
    AppMethodBeat.i(66290);
    if (paramContext != null)
      setCommonInfo(paramContext);
    nativeReportDAUInterval(paramInt1, paramInt2, paramString);
    AppMethodBeat.o(66290);
  }

  public static void txSetAppVersion(String paramString)
  {
    AppMethodBeat.i(66295);
    if (paramString != null)
      nativeSetCommonValue(a.k, paramString);
    AppMethodBeat.o(66295);
  }

  public static void txSetCommonInfo()
  {
    AppMethodBeat.i(66294);
    if (mDevType != null)
      nativeSetCommonValue(a.f, mDevType);
    if (mNetType != null)
      nativeSetCommonValue(a.g, mNetType);
    if (mDevId != null)
      nativeSetCommonValue(a.h, mDevId);
    if (mDevUUID != null)
      nativeSetCommonValue(a.i, mDevUUID);
    if (mAppName != null)
      nativeSetCommonValue(a.j, mAppName);
    if (mSysVersion != null)
      nativeSetCommonValue(a.l, mSysVersion);
    if (mMacAddr != null)
      nativeSetCommonValue(a.m, mMacAddr);
    AppMethodBeat.o(66294);
  }

  public static void txSetEventIntValue(String paramString1, int paramInt, String paramString2, long paramLong)
  {
    AppMethodBeat.i(66288);
    nativeSetEventValueInterval(paramString1, paramInt, paramString2, String.valueOf(paramLong));
    AppMethodBeat.o(66288);
  }

  public static void txSetEventValue(String paramString1, int paramInt, String paramString2, String paramString3)
  {
    AppMethodBeat.i(66287);
    nativeSetEventValueInterval(paramString1, paramInt, paramString2, paramString3);
    AppMethodBeat.o(66287);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.liteav.basic.datareport.TXCDRApi
 * JD-Core Version:    0.6.2
 */