package com.tencent.mm.plugin.appbrand.ui;

import android.app.Activity;
import com.tencent.luggage.a.b;
import com.tencent.mm.plugin.appbrand.config.AppBrandInitConfig;
import com.tencent.mm.plugin.appbrand.i;

public abstract interface u extends b
{
  public abstract void a(Activity paramActivity, AppBrandInitConfig paramAppBrandInitConfig);

  public abstract void a(i parami1, i parami2);

  public abstract void a(i parami1, i parami2, Runnable paramRunnable);

  public abstract void k(Activity paramActivity);
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.ui.u
 * JD-Core Version:    0.6.2
 */