package com.facebook.appevents.internal;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Build;
import android.os.Looper;
import com.facebook.FacebookSdk;
import com.facebook.internal.Utility;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AppEventUtility
{
  private static final String regex = "[-+]*\\d+([\\,\\.]\\d+)*([\\.\\,]\\d+)?";

  public static void assertIsMainThread()
  {
  }

  public static void assertIsNotMainThread()
  {
  }

  public static String bytesToHex(byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(72161);
    StringBuffer localStringBuffer = new StringBuffer();
    int i = paramArrayOfByte.length;
    for (int j = 0; j < i; j++)
      localStringBuffer.append(String.format("%02x", new Object[] { Byte.valueOf(paramArrayOfByte[j]) }));
    paramArrayOfByte = localStringBuffer.toString();
    AppMethodBeat.o(72161);
    return paramArrayOfByte;
  }

  public static String getAppVersion()
  {
    AppMethodBeat.i(72164);
    Object localObject = FacebookSdk.getApplicationContext();
    try
    {
      localObject = ((Context)localObject).getPackageManager().getPackageInfo(((Context)localObject).getPackageName(), 0).versionName;
      AppMethodBeat.o(72164);
      return localObject;
    }
    catch (PackageManager.NameNotFoundException localNameNotFoundException)
    {
      while (true)
      {
        String str = "";
        AppMethodBeat.o(72164);
      }
    }
  }

  public static boolean isEmulator()
  {
    AppMethodBeat.i(72162);
    boolean bool;
    if ((Build.FINGERPRINT.startsWith("generic")) || (Build.FINGERPRINT.startsWith("unknown")) || (Build.MODEL.contains("google_sdk")) || (Build.MODEL.contains("Emulator")) || (Build.MODEL.contains("Android SDK built for x86")) || (Build.MANUFACTURER.contains("Genymotion")) || ((Build.BRAND.startsWith("generic")) && (Build.DEVICE.startsWith("generic"))) || ("google_sdk".equals(Build.PRODUCT)))
    {
      bool = true;
      AppMethodBeat.o(72162);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(72162);
    }
  }

  private static boolean isMainThread()
  {
    AppMethodBeat.i(72163);
    boolean bool;
    if (Looper.myLooper() == Looper.getMainLooper())
    {
      bool = true;
      AppMethodBeat.o(72163);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(72163);
    }
  }

  public static double normalizePrice(String paramString)
  {
    double d1 = 0.0D;
    AppMethodBeat.i(72160);
    try
    {
      paramString = Pattern.compile("[-+]*\\d+([\\,\\.]\\d+)*([\\.\\,]\\d+)?", 8).matcher(paramString);
      if (paramString.find())
      {
        paramString = paramString.group(0);
        d2 = NumberFormat.getNumberInstance(Utility.getCurrentLocale()).parse(paramString).doubleValue();
        AppMethodBeat.o(72160);
      }
      while (true)
      {
        return d2;
        AppMethodBeat.o(72160);
        d2 = d1;
      }
    }
    catch (ParseException paramString)
    {
      while (true)
      {
        AppMethodBeat.o(72160);
        double d2 = d1;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.facebook.appevents.internal.AppEventUtility
 * JD-Core Version:    0.6.2
 */