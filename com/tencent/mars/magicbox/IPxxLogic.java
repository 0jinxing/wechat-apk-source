package com.tencent.mars.magicbox;

public class IPxxLogic
{
  private static IPxxLogic.ICallBack callBack = null;

  private static String getCrashFilePath(int paramInt)
  {
    if (callBack == null);
    for (String str = null; ; str = callBack.getCrashFilePath(paramInt))
      return str;
  }

  private static String getUplodLogExtrasInfo()
  {
    if (callBack == null);
    for (String str = null; ; str = callBack.getUplodLogExtrasInfo())
      return str;
  }

  public static native void onIPxx(String paramString, int paramInt);

  public static void recoverLinkAddrs()
  {
    if (callBack == null);
    while (true)
    {
      return;
      callBack.recoverLinkAddrs();
    }
  }

  public static void setCallBack(IPxxLogic.ICallBack paramICallBack)
  {
    callBack = paramICallBack;
  }

  public static native void setHost(String paramString);

  private static void setNewDnsDebugHostInfo(String paramString, int paramInt)
  {
    if (callBack == null);
    while (true)
    {
      return;
      callBack.setNewDnsDebugHostInfo(paramString, paramInt);
    }
  }

  public static native void uploadFile(String paramString1, int paramInt, long paramLong, String paramString2);

  public static native void uploadLog(int paramInt, int[] paramArrayOfInt, boolean paramBoolean, long paramLong, String paramString);

  public static void uploadLogFail()
  {
    if (callBack == null);
    while (true)
    {
      return;
      callBack.uploadLogFail();
    }
  }

  public static void uploadLogResponse(long paramLong1, long paramLong2)
  {
    if (callBack == null);
    while (true)
    {
      return;
      callBack.uploadLogResponse(paramLong1, paramLong2);
    }
  }

  public static void uploadLogSuccess()
  {
    if (callBack == null);
    while (true)
    {
      return;
      callBack.uploadLogSuccess();
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mars.magicbox.IPxxLogic
 * JD-Core Version:    0.6.2
 */