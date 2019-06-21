package com.tencent.liteav.basic.util;

import com.tencent.matrix.trace.core.AppMethodBeat;

public class TXCCommonUtil
{
  private static String mAppID;
  private static String mStrAppVersion;
  public static String pituLicencePath;

  static
  {
    AppMethodBeat.i(66029);
    mAppID = "";
    mStrAppVersion = "";
    pituLicencePath = "YTFaceSDK.licence";
    b.e();
    AppMethodBeat.o(66029);
  }

  public static String getAppID()
  {
    return mAppID;
  }

  public static String getAppVersion()
  {
    return mStrAppVersion;
  }

  public static String getFileExtension(String paramString)
  {
    AppMethodBeat.i(66026);
    Object localObject1 = null;
    Object localObject2 = localObject1;
    if (paramString != null)
    {
      localObject2 = localObject1;
      if (paramString.length() > 0)
      {
        int i = paramString.lastIndexOf('.');
        localObject2 = localObject1;
        if (i >= 0)
        {
          localObject2 = localObject1;
          if (i < paramString.length() - 1)
            localObject2 = paramString.substring(i + 1);
        }
      }
    }
    AppMethodBeat.o(66026);
    return localObject2;
  }

  public static int getSDKID()
  {
    AppMethodBeat.i(66025);
    int i = nativeGetSDKID();
    AppMethodBeat.o(66025);
    return i;
  }

  public static int[] getSDKVersion()
  {
    AppMethodBeat.i(66023);
    String[] arrayOfString = nativeGetSDKVersion().split("\\.");
    int[] arrayOfInt = new int[arrayOfString.length];
    int i = 0;
    while (true)
      if (i < arrayOfString.length)
        try
        {
          arrayOfInt[i] = Integer.parseInt(arrayOfString[i]);
          i++;
        }
        catch (NumberFormatException localNumberFormatException)
        {
          while (true)
            arrayOfInt[i] = 0;
        }
    AppMethodBeat.o(66023);
    return arrayOfInt;
  }

  public static String getSDKVersionStr()
  {
    AppMethodBeat.i(66024);
    String str = nativeGetSDKVersion();
    AppMethodBeat.o(66024);
    return str;
  }

  public static String getStreamIDByStreamUrl(String paramString)
  {
    AppMethodBeat.i(66028);
    if ((paramString == null) || (paramString.length() == 0))
    {
      AppMethodBeat.o(66028);
      paramString = null;
      return paramString;
    }
    int i = paramString.indexOf("?");
    if (i != -1);
    for (String str = paramString.substring(0, i); ; str = paramString)
    {
      if ((str == null) || (str.length() == 0))
      {
        AppMethodBeat.o(66028);
        paramString = null;
        break;
      }
      i = str.lastIndexOf("/");
      paramString = str;
      if (i != -1)
        paramString = str.substring(i + 1);
      if ((paramString == null) || (paramString.length() == 0))
      {
        AppMethodBeat.o(66028);
        paramString = null;
        break;
      }
      i = paramString.indexOf(".");
      str = paramString;
      if (i != -1)
        str = paramString.substring(0, i);
      if ((str == null) || (str.length() == 0))
      {
        AppMethodBeat.o(66028);
        paramString = null;
        break;
      }
      AppMethodBeat.o(66028);
      paramString = str;
      break;
    }
  }

  private static native int nativeGetSDKID();

  private static native String nativeGetSDKVersion();

  public static void setAppID(String paramString)
  {
    mAppID = paramString;
  }

  public static void setAppVersion(String paramString)
  {
    mStrAppVersion = paramString;
  }

  public static void setPituLicencePath(String paramString)
  {
    pituLicencePath = paramString;
  }

  public static void sleep(int paramInt)
  {
    AppMethodBeat.i(66027);
    long l = paramInt;
    try
    {
      Thread.sleep(l);
      AppMethodBeat.o(66027);
      return;
    }
    catch (InterruptedException localInterruptedException)
    {
      while (true)
        AppMethodBeat.o(66027);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.liteav.basic.util.TXCCommonUtil
 * JD-Core Version:    0.6.2
 */