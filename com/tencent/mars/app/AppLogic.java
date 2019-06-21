package com.tencent.mars.app;

public class AppLogic
{
  private static final String TAG = "mars.app.NativeAppJni$C2Java";
  private static AppLogic.ICallBack callBack = null;

  private static AppLogic.AccountInfo getAccountInfo()
  {
    if (callBack == null);
    for (AppLogic.AccountInfo localAccountInfo = null; ; localAccountInfo = callBack.getAccountInfo())
      return localAccountInfo;
  }

  public static String getAppFilePath()
  {
    String str = null;
    if (callBack != null)
      str = callBack.getAppFilePath();
    return str;
  }

  private static int getClientVersion()
  {
    if (callBack == null);
    for (int i = 0; ; i = callBack.getClientVersion())
      return i;
  }

  private static String getCurLanguage()
  {
    if (callBack == null);
    for (String str = null; ; str = callBack.getCurLanguage())
      return str;
  }

  private static AppLogic.DeviceInfo getDeviceType()
  {
    if (callBack == null);
    for (AppLogic.DeviceInfo localDeviceInfo = null; ; localDeviceInfo = callBack.getDeviceType())
      return localDeviceInfo;
  }

  public static void setCallBack(AppLogic.ICallBack paramICallBack)
  {
    callBack = paramICallBack;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mars.app.AppLogic
 * JD-Core Version:    0.6.2
 */