package com.tencent.voip.mars.xlog;

public class LogLogic
{
  public static native int getAppenderModeFromCfg();

  public static native int getIPxxLogLevel();

  public static native int getLogLevelFromCfg();

  public static native void initIPxxLogInfo();

  public static native void initLogInfo();

  public static native void setIPxxLogML(int paramInt1, int paramInt2);

  public static native void setIsAlphaVersion(boolean paramBoolean);
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.voip.mars.xlog.LogLogic
 * JD-Core Version:    0.6.2
 */