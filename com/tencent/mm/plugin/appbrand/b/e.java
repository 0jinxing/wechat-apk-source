package com.tencent.mm.plugin.appbrand.b;

import android.app.Activity;
import android.content.BroadcastReceiver;
import java.lang.ref.WeakReference;

public abstract class e
{
  private final WeakReference<Activity> gWO;
  public final BroadcastReceiver receiver = new e.1(this);

  public e(Activity paramActivity)
  {
    this.gWO = new WeakReference(paramActivity);
  }

  protected abstract void awC();

  protected abstract void awD();
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.b.e
 * JD-Core Version:    0.6.2
 */