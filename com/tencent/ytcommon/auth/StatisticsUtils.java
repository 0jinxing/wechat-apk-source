package com.tencent.ytcommon.auth;

import android.content.Context;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.provider.Settings.Secure;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class StatisticsUtils
{
  private static String encryptUid(String paramString)
  {
    AppMethodBeat.i(25);
    if (TextUtils.isEmpty(paramString))
    {
      paramString = "";
      AppMethodBeat.o(25);
    }
    while (true)
    {
      return paramString;
      StringBuilder localStringBuilder = new StringBuilder();
      int i = paramString.length();
      for (int j = 0; j < i; j++)
      {
        int k = paramString.charAt(j);
        localStringBuilder.append(k + k % i);
      }
      localStringBuilder.reverse();
      paramString = localStringBuilder.toString();
      AppMethodBeat.o(25);
    }
  }

  private static char getChar(byte paramByte, int paramInt)
  {
    AppMethodBeat.i(24);
    char c = (char)(paramByte - getOffset(paramInt & 0x1));
    AppMethodBeat.o(24);
    return c;
  }

  public static String getDeviceUid(Context paramContext)
  {
    AppMethodBeat.i(20);
    if (paramContext.getPackageName().startsWith("com.tencent"))
    {
      paramContext = "com.tencent";
      AppMethodBeat.o(20);
      return paramContext;
    }
    String str = getIMEI(paramContext.getApplicationContext());
    Object localObject = getMacAddr(paramContext.getApplicationContext());
    int i;
    if (!TextUtils.isEmpty((CharSequence)localObject))
    {
      i = 1;
      label52: paramContext = (Context)localObject;
      if (i != 0)
        paramContext = ((String)localObject).replaceAll(":", "");
      localObject = new StringBuilder().append(str);
      if (i == 0)
        break label111;
    }
    while (true)
    {
      paramContext = toMD5(encryptUid(paramContext));
      AppMethodBeat.o(20);
      break;
      i = 0;
      break label52;
      label111: paramContext = "";
    }
  }

  public static String getIMEI(Context paramContext)
  {
    AppMethodBeat.i(22);
    String str = Settings.Secure.getString(paramContext.getContentResolver(), "android_id");
    if (TextUtils.isEmpty(str))
    {
      paramContext = (TelephonyManager)paramContext.getApplicationContext().getSystemService("phone");
      if (paramContext == null);
    }
    for (paramContext = paramContext.getDeviceId(); ; paramContext = str)
    {
      AppMethodBeat.o(22);
      return paramContext;
    }
  }

  public static String getMacAddr(Context paramContext)
  {
    Object localObject = null;
    AppMethodBeat.i(21);
    if (paramContext == null)
    {
      AppMethodBeat.o(21);
      paramContext = localObject;
      return paramContext;
    }
    paramContext = (WifiManager)paramContext.getApplicationContext().getSystemService("wifi");
    if (paramContext != null)
    {
      paramContext = paramContext.getConnectionInfo();
      if (paramContext == null);
    }
    for (paramContext = paramContext.getMacAddress(); ; paramContext = null)
    {
      AppMethodBeat.o(21);
      break;
    }
  }

  private static byte getOffset(int paramInt)
  {
    if (paramInt == 0);
    for (paramInt = 65; ; paramInt = 97)
      return (byte)paramInt;
  }

  public static String toMD5(String paramString)
  {
    AppMethodBeat.i(23);
    if (TextUtils.isEmpty(paramString))
    {
      paramString = "";
      AppMethodBeat.o(23);
    }
    while (true)
    {
      return paramString;
      try
      {
        Object localObject = MessageDigest.getInstance("MD5");
        ((MessageDigest)localObject).reset();
        ((MessageDigest)localObject).update(paramString.getBytes());
        paramString = new java/math/BigInteger;
        paramString.<init>(1, ((MessageDigest)localObject).digest());
        for (localObject = paramString.toString(16); ; localObject = "0".concat(String.valueOf(localObject)))
        {
          paramString = (String)localObject;
          if (((String)localObject).length() >= 32)
            break;
        }
      }
      catch (NoSuchAlgorithmException paramString)
      {
        paramString = "";
        AppMethodBeat.o(23);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.ytcommon.auth.StatisticsUtils
 * JD-Core Version:    0.6.2
 */