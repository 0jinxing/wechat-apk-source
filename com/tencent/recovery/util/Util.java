package com.tencent.recovery.util;

import android.app.ActivityManager;
import android.app.ActivityManager.RunningAppProcessInfo;
import android.bluetooth.BluetoothAdapter;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.Process;
import android.provider.Settings.Secure;
import com.tencent.recovery.Recovery;
import com.tencent.recovery.log.RecoveryLog;
import java.security.MessageDigest;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

public class Util
{
  private static String processName = "";

  private static String aw(Context paramContext, int paramInt)
  {
    if (Process.myUid() >= 99000)
      paramContext = "ISOLATE_PROCESS";
    while (true)
    {
      return paramContext;
      if (!isNullOrNil(processName))
      {
        paramContext = processName;
      }
      else
      {
        Object localObject = paramContext;
        if (paramContext == null)
          localObject = Recovery.getContext();
        if ((localObject == null) || (paramInt <= 0))
          paramContext = processName;
        else
          try
          {
            localObject = ((ActivityManager)((Context)localObject).getSystemService("activity")).getRunningAppProcesses().iterator();
            while (((Iterator)localObject).hasNext())
            {
              paramContext = (ActivityManager.RunningAppProcessInfo)((Iterator)localObject).next();
              if ((paramContext.pid == paramInt) && (paramContext.processName != null) && (!paramContext.processName.equals("")))
                processName = paramContext.processName;
            }
          }
          catch (Exception paramContext)
          {
            RecoveryLog.printErrStackTrace("Recovery.Util", paramContext, "", new Object[0]);
            paramContext = processName;
          }
      }
    }
  }

  public static final int iB(Context paramContext)
  {
    SharedPreferences localSharedPreferences = paramContext.getSharedPreferences("recovery-info", 0);
    int i = localSharedPreferences.getInt("KeySafeModeUUID", -1);
    int j = i;
    StringBuffer localStringBuffer;
    if (i == -1)
    {
      localStringBuffer = new StringBuffer();
      localStringBuffer.append(Settings.Secure.getString(paramContext.getContentResolver(), "android_id"));
      paramContext = (WifiManager)paramContext.getSystemService("wifi");
      if (paramContext != null)
        break label205;
      paramContext = null;
      if (paramContext == null)
        break label218;
    }
    label205: label213: label218: for (Object localObject = paramContext.getMacAddress(); ; localObject = null)
    {
      paramContext = (Context)localObject;
      if (localObject == null)
      {
        paramContext = BluetoothAdapter.getDefaultAdapter();
        if (paramContext == null)
          break label213;
      }
      for (paramContext = paramContext.getAddress(); ; paramContext = null)
      {
        localObject = paramContext;
        if (paramContext == null)
          localObject = UUID.randomUUID().toString();
        localStringBuffer.append((String)localObject);
        localStringBuffer.append(Build.MANUFACTURER + Build.MODEL);
        j = ("A" + x(localStringBuffer.toString().getBytes()).substring(0, 15)).hashCode();
        localSharedPreferences.edit().putInt("KeySafeModeUUID", j).commit();
        return j;
        paramContext = paramContext.getConnectionInfo();
        break;
      }
    }
  }

  public static String iC(Context paramContext)
  {
    return aw(paramContext, Process.myPid());
  }

  public static final boolean isNullOrNil(String paramString)
  {
    if ((paramString == null) || (paramString.length() == 0));
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public static String nz(long paramLong)
  {
    return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSS").format(new Date(paramLong));
  }

  private static final String x(byte[] paramArrayOfByte)
  {
    char[] arrayOfChar = new char[16];
    char[] tmp6_5 = arrayOfChar;
    tmp6_5[0] = 48;
    char[] tmp11_6 = tmp6_5;
    tmp11_6[1] = 49;
    char[] tmp16_11 = tmp11_6;
    tmp16_11[2] = 50;
    char[] tmp21_16 = tmp16_11;
    tmp21_16[3] = 51;
    char[] tmp26_21 = tmp21_16;
    tmp26_21[4] = 52;
    char[] tmp31_26 = tmp26_21;
    tmp31_26[5] = 53;
    char[] tmp36_31 = tmp31_26;
    tmp36_31[6] = 54;
    char[] tmp42_36 = tmp36_31;
    tmp42_36[7] = 55;
    char[] tmp48_42 = tmp42_36;
    tmp48_42[8] = 56;
    char[] tmp54_48 = tmp48_42;
    tmp54_48[9] = 57;
    char[] tmp60_54 = tmp54_48;
    tmp60_54[10] = 97;
    char[] tmp66_60 = tmp60_54;
    tmp66_60[11] = 98;
    char[] tmp72_66 = tmp66_60;
    tmp72_66[12] = 99;
    char[] tmp78_72 = tmp72_66;
    tmp78_72[13] = 100;
    char[] tmp84_78 = tmp78_72;
    tmp84_78[14] = 101;
    char[] tmp90_84 = tmp84_78;
    tmp90_84[15] = 102;
    tmp90_84;
    try
    {
      Object localObject = MessageDigest.getInstance("MD5");
      ((MessageDigest)localObject).update(paramArrayOfByte);
      paramArrayOfByte = ((MessageDigest)localObject).digest();
      int i = paramArrayOfByte.length;
      localObject = new char[i * 2];
      int j = 0;
      int n;
      for (int k = 0; j < i; k = n + 1)
      {
        int m = paramArrayOfByte[j];
        n = k + 1;
        localObject[k] = ((char)arrayOfChar[(m >>> 4 & 0xF)]);
        localObject[n] = ((char)arrayOfChar[(m & 0xF)]);
        j++;
      }
      paramArrayOfByte = new java/lang/String;
      paramArrayOfByte.<init>((char[])localObject);
      return paramArrayOfByte;
    }
    catch (Exception paramArrayOfByte)
    {
      while (true)
        paramArrayOfByte = null;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.recovery.util.Util
 * JD-Core Version:    0.6.2
 */