package com.tencent.mm.plugin.appbrand.b;

import android.app.Activity;
import android.content.BroadcastReceiver;
import java.lang.ref.WeakReference;

public abstract class f
{
  private final WeakReference<Activity> gWO;
  public final BroadcastReceiver gWT = new f.1(this);

  public f(Activity paramActivity)
  {
    this.gWO = new WeakReference(paramActivity);
  }

  protected abstract void awE();
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.b.f
 * JD-Core Version:    0.6.2
 */