package com.tencent.tmassistantsdk.util;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Bundle;
import android.provider.Settings.Secure;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import java.io.File;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class GlobalUtil
{
  static final int NET_TYPE_WIFI = 4;
  protected static final String SharedPreferencesName = "TMAssistantSDKSharedPreference";
  private static final String TAG = "GlobalUtil";
  protected static GlobalUtil mInstance = null;
  protected static int mMemUUID = 0;
  public final int JCE_CMDID_Empty;
  public final int JCE_CMDID_GetAppSimpleDetail;
  public final int JCE_CMDID_GetAppUpdate;
  public final int JCE_CMDID_GetAuthorized;
  public final int JCE_CMDID_GetSettings;
  public final int JCE_CMDID_ReportLog;
  protected Context mContext;
  public HashMap<Integer, String> mJCECmdIdMap;
  public String mQUA;

  protected GlobalUtil()
  {
    AppMethodBeat.i(76235);
    this.mQUA = "";
    this.JCE_CMDID_Empty = 0;
    this.JCE_CMDID_ReportLog = 1;
    this.JCE_CMDID_GetSettings = 2;
    this.JCE_CMDID_GetAppUpdate = 3;
    this.JCE_CMDID_GetAuthorized = 4;
    this.JCE_CMDID_GetAppSimpleDetail = 5;
    this.mJCECmdIdMap = null;
    this.mJCECmdIdMap = new HashMap();
    this.mJCECmdIdMap.put(Integer.valueOf(1), "ReportLog");
    this.mJCECmdIdMap.put(Integer.valueOf(2), "GetSettings");
    this.mJCECmdIdMap.put(Integer.valueOf(3), "GetAppUpdate");
    this.mJCECmdIdMap.put(Integer.valueOf(4), "GetAuthorized");
    this.mJCECmdIdMap.put(Integer.valueOf(5), "GetAppSimpleDetail");
    AppMethodBeat.o(76235);
  }

  public static ArrayList<String> String2List(String paramString)
  {
    AppMethodBeat.i(76250);
    ArrayList localArrayList = new ArrayList();
    if (!TextUtils.isEmpty(paramString))
    {
      paramString = paramString.split(",");
      for (int i = 0; i < paramString.length; i++)
      {
        CharSequence localCharSequence = paramString[i];
        if (!TextUtils.isEmpty(localCharSequence))
          localArrayList.add(localCharSequence);
      }
    }
    AppMethodBeat.o(76250);
    return localArrayList;
  }

  public static int assistantErrorCode2SDKErrorCode(int paramInt)
  {
    int i = 604;
    int j = i;
    switch (paramInt)
    {
    default:
      j = i;
    case -1000:
    case -26:
    case -24:
    case 0:
    case -1:
    case -11:
    case -12:
    case -13:
    case -15:
    case -16:
    case -21:
    case -22:
    case -23:
    case -25:
    case -27:
    case -28:
    }
    while (true)
    {
      return j;
      j = 0;
      continue;
      j = 709;
      continue;
      j = 708;
      continue;
      j = 730;
      continue;
      j = 703;
      continue;
      j = 1;
      continue;
      j = 731;
      continue;
      j = 700;
      continue;
      j = 732;
      continue;
      j = 601;
      continue;
      j = 602;
      continue;
      j = 606;
      continue;
      j = 701;
    }
  }

  public static int assistantState2SDKState(int paramInt)
  {
    switch (paramInt)
    {
    case 5:
    case 7:
    case 8:
    default:
      paramInt = 0;
    case 1:
    case 6:
    case 2:
    case 4:
    case 3:
    case 9:
    }
    while (true)
    {
      return paramInt;
      paramInt = 2;
      continue;
      paramInt = 1;
      continue;
      paramInt = 3;
      continue;
      paramInt = 4;
      continue;
      paramInt = 5;
      continue;
      paramInt = 6;
    }
  }

  public static String calcMD5AsString(String paramString)
  {
    AppMethodBeat.i(76249);
    String str = "";
    Object localObject = str;
    if (!TextUtils.isEmpty(paramString))
      paramString = paramString.getBytes();
    try
    {
      localObject = MessageDigest.getInstance("MD5");
      ((MessageDigest)localObject).reset();
      ((MessageDigest)localObject).update(paramString, 0, paramString.length);
      localObject = ((MessageDigest)localObject).digest();
      paramString = new java/lang/StringBuffer;
      paramString.<init>();
      for (int i = 0; i < localObject.length; i++)
        paramString.append(Integer.toHexString(localObject[i] & 0xFF));
      localObject = paramString.toString();
      AppMethodBeat.o(76249);
      return localObject;
    }
    catch (NoSuchAlgorithmException paramString)
    {
      while (true)
      {
        ab.printErrStackTrace("GlobalUtil", paramString, "", new Object[0]);
        localObject = str;
      }
    }
  }

  public static void deleteOldDB(String paramString)
  {
    AppMethodBeat.i(76256);
    if (getInstance().getContext() != null)
    {
      paramString = getInstance().getContext().getDatabasePath(paramString);
      if (paramString.exists() != true);
    }
    while (true)
    {
      try
      {
        paramString.delete();
        TMLog.i("GlobalUtil", "deleteDB");
        AppMethodBeat.o(76256);
        return;
      }
      catch (Exception paramString)
      {
        TMLog.i("GlobalUtil", "deleteDB failed");
      }
      AppMethodBeat.o(76256);
    }
  }

  public static String getAppPackageName(Context paramContext)
  {
    AppMethodBeat.i(76241);
    if (paramContext != null)
    {
      paramContext = paramContext.getPackageName();
      AppMethodBeat.o(76241);
    }
    while (true)
    {
      return paramContext;
      paramContext = "";
      AppMethodBeat.o(76241);
    }
  }

  public static int getAppVersionCode(Context paramContext)
  {
    int i = 0;
    AppMethodBeat.i(76242);
    PackageManager localPackageManager;
    if (paramContext != null)
      localPackageManager = paramContext.getPackageManager();
    while (true)
    {
      try
      {
        j = localPackageManager.getPackageInfo(paramContext.getPackageName(), 0).versionCode;
        AppMethodBeat.o(76242);
        return j;
      }
      catch (PackageManager.NameNotFoundException paramContext)
      {
        ab.printErrStackTrace("GlobalUtil", paramContext, "", new Object[0]);
        AppMethodBeat.o(76242);
        j = i;
        continue;
      }
      AppMethodBeat.o(76242);
      int j = i;
    }
  }

  public static GlobalUtil getInstance()
  {
    try
    {
      AppMethodBeat.i(76236);
      if (mInstance == null)
      {
        localGlobalUtil = new com/tencent/tmassistantsdk/util/GlobalUtil;
        localGlobalUtil.<init>();
        mInstance = localGlobalUtil;
      }
      GlobalUtil localGlobalUtil = mInstance;
      AppMethodBeat.o(76236);
      return localGlobalUtil;
    }
    finally
    {
    }
  }

  public static int getMemUUID()
  {
    try
    {
      int i = mMemUUID;
      mMemUUID = i + 1;
      return i;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public static boolean isDBExist(String paramString)
  {
    AppMethodBeat.i(76255);
    boolean bool;
    if ((getInstance().getContext() != null) && (getInstance().getContext().getDatabasePath(paramString).exists()))
    {
      bool = true;
      AppMethodBeat.o(76255);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(76255);
    }
  }

  public static void updateFilePathAuthorized(String paramString)
  {
    AppMethodBeat.i(76254);
    Object localObject = new File(paramString);
    String str1 = ((File)localObject).getParent();
    String str2 = new File(str1).getParent();
    paramString = new File(str2).getParent();
    try
    {
      StringBuilder localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>("chmod 777 ");
      localObject = ((File)localObject).getAbsolutePath();
      Runtime.getRuntime().exec((String)localObject);
      str1 = "chmod 777 ".concat(String.valueOf(str1));
      Runtime.getRuntime().exec(str1);
      str2 = "chmod 777 ".concat(String.valueOf(str2));
      Runtime.getRuntime().exec(str2);
      paramString = "chmod 777".concat(String.valueOf(paramString));
      Runtime.getRuntime().exec(paramString);
      AppMethodBeat.o(76254);
      return;
    }
    catch (IOException paramString)
    {
      while (true)
      {
        ab.printErrStackTrace("GlobalUtil", paramString, "", new Object[0]);
        AppMethodBeat.o(76254);
      }
    }
  }

  public boolean canReportValue()
  {
    return false;
  }

  public void destroy()
  {
    this.mContext = null;
    mInstance = null;
  }

  public String getAndroidIdInPhone()
  {
    AppMethodBeat.i(76243);
    String str;
    if (this.mContext == null)
    {
      str = null;
      AppMethodBeat.o(76243);
    }
    while (true)
    {
      return str;
      str = Settings.Secure.getString(getContext().getContentResolver(), "android_id");
      AppMethodBeat.o(76243);
    }
  }

  public Context getContext()
  {
    return this.mContext;
  }

  public String getImei()
  {
    AppMethodBeat.i(76246);
    Object localObject;
    if (this.mContext == null)
    {
      localObject = null;
      AppMethodBeat.o(76246);
    }
    while (true)
    {
      return localObject;
      localObject = (TelephonyManager)getContext().getSystemService("phone");
      try
      {
        localObject = ((TelephonyManager)localObject).getDeviceId();
        AppMethodBeat.o(76246);
      }
      catch (Exception localException)
      {
        while (true)
        {
          ab.printErrStackTrace("GlobalUtil", localException, "getImei:", new Object[0]);
          String str = "";
        }
      }
    }
  }

  public String getImsi()
  {
    AppMethodBeat.i(76247);
    Object localObject;
    if (this.mContext == null)
    {
      localObject = null;
      AppMethodBeat.o(76247);
    }
    while (true)
    {
      return localObject;
      localObject = (TelephonyManager)getContext().getSystemService("phone");
      try
      {
        localObject = ((TelephonyManager)localObject).getSubscriberId();
        AppMethodBeat.o(76247);
      }
      catch (Exception localException)
      {
        while (true)
        {
          ab.printErrStackTrace("GlobalUtil", localException, "getImsi:", new Object[0]);
          String str = "";
        }
      }
    }
  }

  public int getJceCmdIdByClassName(String paramString)
  {
    AppMethodBeat.i(76238);
    int i;
    if (paramString == null)
    {
      AppMethodBeat.o(76238);
      i = 0;
    }
    while (true)
    {
      return i;
      if (this.mJCECmdIdMap != null)
      {
        Iterator localIterator = this.mJCECmdIdMap.entrySet().iterator();
        while (true)
          if (localIterator.hasNext())
          {
            Object localObject = (Map.Entry)localIterator.next();
            if (localObject != null)
            {
              Integer localInteger = (Integer)((Map.Entry)localObject).getKey();
              localObject = (String)((Map.Entry)localObject).getValue();
              if ((localObject != null) && (((String)localObject).equals(paramString)))
              {
                i = localInteger.intValue();
                AppMethodBeat.o(76238);
                break;
              }
            }
          }
      }
      AppMethodBeat.o(76238);
      i = 0;
    }
  }

  public String getMacAddress()
  {
    AppMethodBeat.i(76248);
    Object localObject;
    if (this.mContext == null)
    {
      localObject = null;
      AppMethodBeat.o(76248);
    }
    while (true)
    {
      return localObject;
      try
      {
        localObject = ((WifiManager)getContext().getSystemService("wifi")).getConnectionInfo();
        if (localObject != null)
        {
          localObject = ((WifiInfo)localObject).getMacAddress();
          AppMethodBeat.o(76248);
        }
        else
        {
          localObject = "";
          AppMethodBeat.o(76248);
        }
      }
      catch (Exception localException)
      {
        String str = "";
        AppMethodBeat.o(76248);
      }
    }
  }

  public String getNetworkOperator()
  {
    AppMethodBeat.i(76239);
    String str;
    if (this.mContext == null)
    {
      str = "";
      AppMethodBeat.o(76239);
    }
    while (true)
    {
      return str;
      str = ((TelephonyManager)this.mContext.getSystemService("phone")).getNetworkOperator();
      AppMethodBeat.o(76239);
    }
  }

  public int getNetworkType()
  {
    AppMethodBeat.i(76240);
    int i;
    if (this.mContext == null)
    {
      i = 0;
      AppMethodBeat.o(76240);
    }
    while (true)
    {
      return i;
      i = ((TelephonyManager)this.mContext.getSystemService("phone")).getNetworkType();
      AppMethodBeat.o(76240);
    }
  }

  public String getPhoneGuid()
  {
    AppMethodBeat.i(76244);
    Object localObject;
    if (this.mContext == null)
    {
      localObject = "";
      AppMethodBeat.o(76244);
    }
    while (true)
    {
      return localObject;
      localObject = this.mContext.getSharedPreferences("TMAssistantSDKSharedPreference", 0);
      if (localObject != null)
      {
        localObject = ((SharedPreferences)localObject).getString("TMAssistantSDKPhoneGUID", "");
        AppMethodBeat.o(76244);
      }
      else
      {
        localObject = "";
        AppMethodBeat.o(76244);
      }
    }
  }

  public int getQQDownloaderAPILevel()
  {
    int i = 0;
    AppMethodBeat.i(76252);
    if (this.mContext == null)
      AppMethodBeat.o(76252);
    while (true)
    {
      return i;
      try
      {
        ApplicationInfo localApplicationInfo = this.mContext.getPackageManager().getApplicationInfo("com.tencent.android.qqdownloader", 128);
        if ((localApplicationInfo != null) && (localApplicationInfo.metaData != null))
        {
          int j = localApplicationInfo.metaData.getInt("com.tencent.android.qqdownloader.sdk.apilevel");
          i = j;
          AppMethodBeat.o(76252);
        }
        else
        {
          AppMethodBeat.o(76252);
        }
      }
      catch (Exception localException)
      {
        ab.printErrStackTrace("GlobalUtil", localException, "", new Object[0]);
        AppMethodBeat.o(76252);
      }
    }
  }

  public int getQQDownloaderVersionCode()
  {
    int i = 0;
    AppMethodBeat.i(76253);
    if (this.mContext == null)
      AppMethodBeat.o(76253);
    while (true)
    {
      return i;
      Object localObject = this.mContext.getPackageManager();
      if (localObject != null)
        try
        {
          localObject = ((PackageManager)localObject).getPackageInfo("com.tencent.android.qqdownloader", 0);
          if (localObject == null)
          {
            AppMethodBeat.o(76253);
            continue;
          }
          int j = ((PackageInfo)localObject).versionCode;
          AppMethodBeat.o(76253);
          i = j;
        }
        catch (PackageManager.NameNotFoundException localNameNotFoundException)
        {
          ab.printErrStackTrace("GlobalUtil", localNameNotFoundException, "", new Object[0]);
          AppMethodBeat.o(76253);
        }
      else
        AppMethodBeat.o(76253);
    }
  }

  public void setContext(Context paramContext)
  {
    AppMethodBeat.i(76237);
    this.mContext = paramContext;
    this.mQUA = new QUASetting(paramContext).buildQUA();
    AppMethodBeat.o(76237);
  }

  public void setNetTypeValue(byte paramByte)
  {
    AppMethodBeat.i(76251);
    if (this.mContext == null)
      AppMethodBeat.o(76251);
    while (true)
    {
      return;
      SharedPreferences localSharedPreferences = this.mContext.getSharedPreferences("TMAssistantSDKSharedPreference", 0);
      if ((localSharedPreferences != null) && (Byte.parseByte(localSharedPreferences.getString("TMAssistantSDKNetType", "0")) != paramByte))
        localSharedPreferences.edit().putString("TMAssistantSDKNetType", String.valueOf(paramByte)).commit();
      AppMethodBeat.o(76251);
    }
  }

  public void setPhoneGuid(String paramString)
  {
    AppMethodBeat.i(76245);
    if (this.mContext == null)
      AppMethodBeat.o(76245);
    while (true)
    {
      return;
      if (paramString != null)
      {
        SharedPreferences localSharedPreferences = this.mContext.getSharedPreferences("TMAssistantSDKSharedPreference", 0);
        if (localSharedPreferences != null)
          localSharedPreferences.edit().putString("TMAssistantSDKPhoneGUID", paramString).commit();
      }
      AppMethodBeat.o(76245);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.tmassistantsdk.util.GlobalUtil
 * JD-Core Version:    0.6.2
 */