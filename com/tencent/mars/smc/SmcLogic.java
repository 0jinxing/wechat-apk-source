package com.tencent.mars.smc;

import com.tencent.mars.Mars;
import java.util.ArrayList;

public class SmcLogic
{
  private static final String TAG = "mars.SmcLogic";
  private static ICallBack callBack;

  static
  {
    try
    {
      ArrayList localArrayList = getLoadLibraries();
      Mars.checkLoadedModules(localArrayList, "mars.SmcLogic");
      callBack = null;
      return;
    }
    catch (UnsatisfiedLinkError localUnsatisfiedLinkError)
    {
      while (true)
      {
        Object localObject = null;
        Mars.loadDefaultMarsLibrary();
      }
    }
  }

  public static native void OnPluginMsg(long paramLong1, long paramLong2, long paramLong3, long paramLong4, long paramLong5, long paramLong6);

  public static native void OnReportResp(int paramInt1, int paramInt2, byte[] paramArrayOfByte, int paramInt3);

  private static boolean OnSelfMonitorOpLogReady(byte[] paramArrayOfByte)
  {
    if (callBack == null);
    for (boolean bool = false; ; bool = callBack.OnSelfMonitorOpLogReady(paramArrayOfByte))
      return bool;
  }

  public static native void OnStrategyResp(int paramInt1, int paramInt2, byte[] paramArrayOfByte, int paramInt3);

  public static native void SetDebugFlag(boolean paramBoolean);

  public static native void SetMonitorId(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6);

  private static String getKVCommPath()
  {
    if (callBack == null);
    for (String str = ""; ; str = callBack.getKVCommPath())
      return str;
  }

  private static BaseInfo getKVCommReqBaseInfo()
  {
    if (callBack == null);
    for (BaseInfo localBaseInfo = new BaseInfo(); ; localBaseInfo = callBack.getKVCommReqBaseInfo())
      return localBaseInfo;
  }

  private static native ArrayList<String> getLoadLibraries();

  private static int getSingleReportBufSizeB()
  {
    if (callBack == null);
    for (int i = 0; ; i = callBack.getSingleReportBufSizeB())
      return i;
  }

  public static native ArrayList<Integer> getStrategyVersions();

  private static void onReportDataReady(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2, int paramInt)
  {
    if (callBack == null);
    while (true)
    {
      return;
      callBack.onReportDataReady(paramArrayOfByte1, paramArrayOfByte2, paramInt);
    }
  }

  private static boolean onRequestGetStrategy(byte[] paramArrayOfByte, int paramInt)
  {
    if (callBack == null);
    for (boolean bool = false; ; bool = callBack.onRequestGetStrategy(paramArrayOfByte, paramInt))
      return bool;
  }

  public static native void reportIDKey(long paramLong1, long paramLong2, long paramLong3, boolean paramBoolean);

  public static native void reportListIDKey(IDKey[] paramArrayOfIDKey, boolean paramBoolean);

  public static void setCallBack(ICallBack paramICallBack)
  {
    callBack = paramICallBack;
  }

  public static native void setTimeZone(int paramInt);

  public static native void setUin(long paramLong);

  public static native void writeImportKvData(long paramLong, String paramString, boolean paramBoolean1, boolean paramBoolean2);

  public static native void writeImportKvDataWithType(long paramLong1, long paramLong2, String paramString, boolean paramBoolean1, boolean paramBoolean2);

  public static native void writeImportKvPbData(long paramLong, byte[] paramArrayOfByte, boolean paramBoolean);

  public static native void writeImportKvPbDataWithType(long paramLong1, long paramLong2, byte[] paramArrayOfByte, boolean paramBoolean);

  public static native void writeKvData(long paramLong, String paramString, boolean paramBoolean1, boolean paramBoolean2);

  public static native void writeKvDataWithType(long paramLong1, long paramLong2, String paramString, boolean paramBoolean1, boolean paramBoolean2);

  public static native void writeKvPbData(long paramLong, byte[] paramArrayOfByte, boolean paramBoolean);

  public static native void writeKvPbDataWithType(long paramLong1, long paramLong2, byte[] paramArrayOfByte, boolean paramBoolean);

  public static class BaseInfo
  {
    public String deviceBrand;
    public String deviceModel;
    public String languageVer;
    public String osName;
    public String osVersion;
  }

  public static abstract interface ICallBack
  {
    public abstract boolean OnSelfMonitorOpLogReady(byte[] paramArrayOfByte);

    public abstract String getKVCommPath();

    public abstract SmcLogic.BaseInfo getKVCommReqBaseInfo();

    public abstract int getSingleReportBufSizeB();

    public abstract void onReportDataReady(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2, int paramInt);

    public abstract boolean onRequestGetStrategy(byte[] paramArrayOfByte, int paramInt);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mars.smc.SmcLogic
 * JD-Core Version:    0.6.2
 */