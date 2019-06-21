package com.tencent.tinker.entry;

import android.content.Context;
import android.content.res.Configuration;

public abstract interface ApplicationLifeCycle
{
  public abstract void onBaseContextAttached(Context paramContext);

  public abstract void onConfigurationChanged(Configuration paramConfiguration);

  public abstract void onCreate();

  public abstract void onLowMemory();

  public abstract void onTerminate();

  public abstract void onTrimMemory(int paramInt);
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.tinker.entry.ApplicationLifeCycle
 * JD-Core Version:    0.6.2
 */