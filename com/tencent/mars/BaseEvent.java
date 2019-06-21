package com.tencent.mars;

public class BaseEvent
{
  public static native void onCreate();

  public static native void onDestroy();

  public static native void onExceptionCrash();

  public static native void onForeground(boolean paramBoolean);

  public static native void onNetworkChange();

  public static native void onSingalCrash(int paramInt);
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mars.BaseEvent
 * JD-Core Version:    0.6.2
 */