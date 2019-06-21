package com.tencent.tencentmap.mapsdk.maps.a;

import android.app.ActivityManager;
import android.app.ActivityManager.RunningAppProcessInfo;
import android.content.Context;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.provider.Settings.Secure;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.Log;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.net.InetAddress;
import java.net.URLEncoder;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;

public final class eu
{
  private static String a = "";
  private static String b = "";
  private static String c = "";
  private static String d = "";

  public static int a(int paramInt1, int paramInt2, int paramInt3)
  {
    AppMethodBeat.i(98844);
    paramInt1 = Math.min(Math.max(paramInt1, paramInt2), paramInt3);
    AppMethodBeat.o(98844);
    return paramInt1;
  }

  public static int a(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    AppMethodBeat.i(98843);
    if (((paramInt1 < paramInt2) || (paramInt1 > paramInt3)) && (paramInt4 >= paramInt2) && (paramInt4 <= paramInt3))
      AppMethodBeat.o(98843);
    while (true)
    {
      return paramInt4;
      paramInt4 = Math.min(Math.max(paramInt1, paramInt2), paramInt3);
      AppMethodBeat.o(98843);
    }
  }

  public static String a()
  {
    int i = 1;
    AppMethodBeat.i(98838);
    try
    {
      Object localObject = a;
      if (localObject == null);
      while (true)
      {
        if (i != 0)
        {
          localObject = (TelephonyManager)bt.a().getSystemService("phone");
          if (localObject != null)
          {
            String str = ((TelephonyManager)localObject).getDeviceId();
            localObject = str;
            if (str == null)
              localObject = "NOIMEI";
            a = (String)localObject;
          }
        }
        label53: localObject = a;
        AppMethodBeat.o(98838);
        return localObject;
        int j = ((String)localObject).trim().length();
        if (j != 0)
          i = 0;
      }
    }
    catch (Throwable localThrowable)
    {
      break label53;
    }
  }

  // ERROR //
  public static String a(int paramInt)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_1
    //   2: ldc 83
    //   4: invokestatic 30	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   7: new 85	java/lang/StringBuilder
    //   10: dup
    //   11: ldc 87
    //   13: invokespecial 91	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   16: iload_0
    //   17: invokevirtual 95	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   20: ldc 97
    //   22: invokevirtual 100	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   25: invokevirtual 103	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   28: astore_2
    //   29: new 105	java/io/BufferedReader
    //   32: astore_3
    //   33: new 107	java/io/FileReader
    //   36: astore 4
    //   38: aload 4
    //   40: aload_2
    //   41: invokespecial 108	java/io/FileReader:<init>	(Ljava/lang/String;)V
    //   44: aload_3
    //   45: aload 4
    //   47: invokespecial 111	java/io/BufferedReader:<init>	(Ljava/io/Reader;)V
    //   50: aload_3
    //   51: invokevirtual 114	java/io/BufferedReader:readLine	()Ljava/lang/String;
    //   54: astore 4
    //   56: aload 4
    //   58: invokestatic 120	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   61: ifne +82 -> 143
    //   64: aload 4
    //   66: invokevirtual 73	java/lang/String:trim	()Ljava/lang/String;
    //   69: astore 4
    //   71: aload 4
    //   73: astore_1
    //   74: aload_3
    //   75: invokevirtual 123	java/io/BufferedReader:close	()V
    //   78: ldc 83
    //   80: invokestatic 42	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   83: aload_1
    //   84: areturn
    //   85: astore_3
    //   86: aconst_null
    //   87: astore_3
    //   88: aload_3
    //   89: ifnull +7 -> 96
    //   92: aload_3
    //   93: invokevirtual 123	java/io/BufferedReader:close	()V
    //   96: ldc 83
    //   98: invokestatic 42	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   101: goto -18 -> 83
    //   104: astore_1
    //   105: aconst_null
    //   106: astore_3
    //   107: aload_3
    //   108: ifnull +7 -> 115
    //   111: aload_3
    //   112: invokevirtual 123	java/io/BufferedReader:close	()V
    //   115: ldc 83
    //   117: invokestatic 42	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   120: aload_1
    //   121: athrow
    //   122: astore_3
    //   123: goto -45 -> 78
    //   126: astore_3
    //   127: goto -31 -> 96
    //   130: astore_3
    //   131: goto -16 -> 115
    //   134: astore_1
    //   135: goto -28 -> 107
    //   138: astore 4
    //   140: goto -52 -> 88
    //   143: aload 4
    //   145: astore_1
    //   146: goto -72 -> 74
    //
    // Exception table:
    //   from	to	target	type
    //   29	50	85	java/lang/Exception
    //   29	50	104	finally
    //   74	78	122	java/io/IOException
    //   92	96	126	java/io/IOException
    //   111	115	130	java/io/IOException
    //   50	71	134	finally
    //   50	71	138	java/lang/Exception
  }

  public static String a(long paramLong, String paramString)
  {
    AppMethodBeat.i(98834);
    try
    {
      SimpleDateFormat localSimpleDateFormat = new java/text/SimpleDateFormat;
      localSimpleDateFormat.<init>(paramString);
      paramString = Calendar.getInstance();
      paramString.setTimeInMillis(paramLong);
      paramString = localSimpleDateFormat.format(paramString.getTime());
      AppMethodBeat.o(98834);
      return paramString;
    }
    catch (Exception paramString)
    {
      while (true)
      {
        paramString = "";
        AppMethodBeat.o(98834);
      }
    }
  }

  public static String a(Context paramContext, int paramInt)
  {
    ActivityManager.RunningAppProcessInfo localRunningAppProcessInfo = null;
    AppMethodBeat.i(98841);
    paramContext = paramContext.getSystemService("activity");
    if (paramContext != null);
    while (true)
    {
      try
      {
        paramContext = (ActivityManager)paramContext;
        if (paramContext != null)
          break;
        AppMethodBeat.o(98841);
        paramContext = localRunningAppProcessInfo;
        return paramContext;
      }
      catch (Throwable paramContext)
      {
      }
      paramContext = null;
    }
    paramContext = paramContext.getRunningAppProcesses();
    int j;
    if ((paramContext != null) && (paramContext.size() > 0))
    {
      int i = paramContext.size();
      j = 0;
      label70: if (j < i)
      {
        localRunningAppProcessInfo = (ActivityManager.RunningAppProcessInfo)paramContext.get(j);
        if ((localRunningAppProcessInfo == null) || (localRunningAppProcessInfo.pid != paramInt));
      }
    }
    for (paramContext = localRunningAppProcessInfo.processName; ; paramContext = null)
    {
      AppMethodBeat.o(98841);
      break;
      j++;
      break label70;
    }
  }

  public static String a(Throwable paramThrowable)
  {
    AppMethodBeat.i(98833);
    paramThrowable = Log.getStackTraceString(paramThrowable);
    if (!TextUtils.isEmpty(paramThrowable))
    {
      paramThrowable = paramThrowable.split("\n");
      if (paramThrowable.length >= 2)
      {
        paramThrowable = paramThrowable[0] + paramThrowable[1];
        AppMethodBeat.o(98833);
      }
    }
    while (true)
    {
      return paramThrowable;
      if (paramThrowable.length == 1)
      {
        paramThrowable = paramThrowable[0];
        AppMethodBeat.o(98833);
      }
      else
      {
        paramThrowable = "";
        AppMethodBeat.o(98833);
        continue;
        paramThrowable = "";
        AppMethodBeat.o(98833);
      }
    }
  }

  private static String a(InetAddress paramInetAddress)
  {
    AppMethodBeat.i(98847);
    try
    {
      byte[] arrayOfByte = paramInetAddress.getAddress();
      paramInetAddress = new java/lang/StringBuilder;
      paramInetAddress.<init>();
      int i = 0;
      if (i < arrayOfByte.length)
      {
        StringBuilder localStringBuilder = new java/lang/StringBuilder;
        localStringBuilder.<init>(".");
        if (arrayOfByte[i] < 0);
        for (int j = arrayOfByte[i] + 256; ; j = arrayOfByte[i])
        {
          paramInetAddress.append(j);
          i++;
          break;
        }
      }
      paramInetAddress = paramInetAddress.substring(1);
      AppMethodBeat.o(98847);
      return paramInetAddress;
    }
    catch (Throwable paramInetAddress)
    {
      while (true)
      {
        paramInetAddress = "";
        AppMethodBeat.o(98847);
      }
    }
  }

  public static boolean a(String paramString)
  {
    boolean bool = true;
    AppMethodBeat.i(98835);
    if (paramString == null)
      AppMethodBeat.o(98835);
    while (true)
    {
      return bool;
      if (paramString.trim().length() == 0)
      {
        AppMethodBeat.o(98835);
      }
      else
      {
        bool = false;
        AppMethodBeat.o(98835);
      }
    }
  }

  public static boolean a(byte[] paramArrayOfByte)
  {
    if ((paramArrayOfByte == null) || (paramArrayOfByte.length <= 0));
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public static String b()
  {
    int i = 1;
    AppMethodBeat.i(98839);
    try
    {
      Object localObject = b;
      if (localObject == null);
      while (true)
      {
        if (i != 0)
        {
          localObject = (TelephonyManager)bt.a().getSystemService("phone");
          if (localObject != null)
          {
            String str = ((TelephonyManager)localObject).getSubscriberId();
            localObject = str;
            if (str == null)
              localObject = "NOIMSI";
            b = (String)localObject;
          }
        }
        label53: localObject = b;
        AppMethodBeat.o(98839);
        return localObject;
        int j = ((String)localObject).trim().length();
        if (j != 0)
          i = 0;
      }
    }
    catch (Throwable localThrowable)
    {
      break label53;
    }
  }

  public static String b(String paramString)
  {
    AppMethodBeat.i(98837);
    if (TextUtils.isEmpty(paramString))
    {
      paramString = "";
      AppMethodBeat.o(98837);
    }
    while (true)
    {
      return paramString;
      try
      {
        paramString = URLEncoder.encode(paramString, "UTF-8");
        AppMethodBeat.o(98837);
      }
      catch (Throwable paramString)
      {
        paramString = "";
        AppMethodBeat.o(98837);
      }
    }
  }

  public static String b(byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(98836);
    if (paramArrayOfByte == null)
    {
      paramArrayOfByte = "null";
      AppMethodBeat.o(98836);
    }
    while (true)
    {
      return paramArrayOfByte;
      int i = paramArrayOfByte.length;
      if (paramArrayOfByte == null)
      {
        paramArrayOfByte = "null";
        AppMethodBeat.o(98836);
      }
      else
      {
        int j = Math.min(i, paramArrayOfByte.length);
        StringBuffer localStringBuffer = new StringBuffer("size:" + j + ",content:");
        for (i = 0; i < j; i++)
        {
          localStringBuffer.append(Integer.toHexString(paramArrayOfByte[i] >> 4 & 0xF));
          localStringBuffer.append(Integer.toHexString(paramArrayOfByte[i] & 0xF));
        }
        paramArrayOfByte = localStringBuffer.toString();
        AppMethodBeat.o(98836);
      }
    }
  }

  public static String c()
  {
    int i = 1;
    AppMethodBeat.i(98840);
    try
    {
      Object localObject = c;
      if (localObject == null);
      while (true)
      {
        if (i != 0)
        {
          localObject = (WifiManager)bt.a().getApplicationContext().getSystemService("wifi");
          if (localObject != null)
          {
            localObject = ((WifiManager)localObject).getConnectionInfo();
            if (localObject != null)
            {
              String str = ((WifiInfo)localObject).getMacAddress();
              localObject = str;
              if (str == null)
                localObject = "NOMAC";
              c = (String)localObject;
            }
          }
        }
        label66: localObject = c;
        AppMethodBeat.o(98840);
        return localObject;
        int j = ((String)localObject).trim().length();
        if (j != 0)
          i = 0;
      }
    }
    catch (Throwable localThrowable)
    {
      break label66;
    }
  }

  public static String c(String paramString)
  {
    AppMethodBeat.i(98846);
    String str = "";
    try
    {
      paramString = a(InetAddress.getByName(paramString));
      AppMethodBeat.o(98846);
      return paramString;
    }
    catch (Throwable paramString)
    {
      while (true)
        paramString = str;
    }
  }

  public static String d()
  {
    AppMethodBeat.i(98845);
    try
    {
      Object localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>("");
      ((StringBuilder)localObject).append(a());
      ((StringBuilder)localObject).append(c());
      ((StringBuilder)localObject).append(System.currentTimeMillis());
      ((StringBuilder)localObject).append(b());
      ((StringBuilder)localObject).append((int)(Math.random() * 2147483647.0D));
      localObject = et.a(((StringBuilder)localObject).toString());
      AppMethodBeat.o(98845);
      return localObject;
    }
    catch (Throwable localThrowable)
    {
      while (true)
        String str = "";
    }
  }

  public static boolean d(String paramString)
  {
    boolean bool = false;
    AppMethodBeat.i(98850);
    if (TextUtils.isEmpty(paramString))
      AppMethodBeat.o(98850);
    while (true)
    {
      return bool;
      paramString = paramString.split("\\.");
      if (paramString.length != 4)
      {
        AppMethodBeat.o(98850);
      }
      else
      {
        int i = paramString.length;
        label100: for (int j = 0; ; j++)
        {
          while (true)
          {
            if (j >= i)
              break label106;
            String str = paramString[j];
            try
            {
              int k = Integer.parseInt(str);
              if ((k >= 0) && (k <= 255))
                break label100;
              AppMethodBeat.o(98850);
            }
            catch (NumberFormatException paramString)
            {
              AppMethodBeat.o(98850);
            }
          }
          break;
        }
        label106: bool = true;
        AppMethodBeat.o(98850);
      }
    }
  }

  public static String e()
  {
    int i = 1;
    AppMethodBeat.i(98848);
    try
    {
      String str1 = d;
      if (str1 == null);
      while (true)
      {
        if (i != 0)
          d = Settings.Secure.getString(bt.a().getContentResolver(), "android_id");
        str1 = d;
        AppMethodBeat.o(98848);
        return str1;
        int j = str1.trim().length();
        if (j != 0)
          i = 0;
      }
    }
    catch (Throwable localThrowable)
    {
      while (true)
      {
        String str2 = "";
        AppMethodBeat.o(98848);
      }
    }
  }

  public static String f()
  {
    AppMethodBeat.i(98849);
    try
    {
      Object localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>("35");
      localObject = Build.BOARD.length() % 10 + Build.BRAND.length() % 10 + Build.CPU_ABI.length() % 10 + Build.DEVICE.length() % 10 + Build.DISPLAY.length() % 10 + Build.HOST.length() % 10 + Build.ID.length() % 10 + Build.MANUFACTURER.length() % 10 + Build.MODEL.length() % 10 + Build.PRODUCT.length() % 10 + Build.TAGS.length() % 10 + Build.TYPE.length() % 10 + Build.USER.length() % 10;
      AppMethodBeat.o(98849);
      return localObject;
    }
    catch (Throwable localThrowable)
    {
      while (true)
      {
        String str = "";
        AppMethodBeat.o(98849);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.tencentmap.mapsdk.maps.a.eu
 * JD-Core Version:    0.6.2
 */