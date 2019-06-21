package com.tencent.mm.compatible.loader;

import android.app.Application;
import android.content.res.Configuration;

@Deprecated
public abstract class e
{
  protected Application app;

  public final void b(Application paramApplication)
  {
    this.app = paramApplication;
  }

  public abstract void onConfigurationChanged(Configuration paramConfiguration);

  public abstract void onCreate();

  public void onTerminate()
  {
  }

  public void onTrimMemory(int paramInt)
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.compatible.loader.e
 * JD-Core Version:    0.6.2
 */