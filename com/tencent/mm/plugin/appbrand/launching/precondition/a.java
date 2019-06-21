package com.tencent.mm.plugin.appbrand.launching.precondition;

import android.content.Context;
import android.content.MutableContextWrapper;
import com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC;
import com.tencent.mm.plugin.appbrand.launching.AppBrandLaunchProxyUI;
import com.tencent.mm.plugin.appbrand.launching.params.LaunchParcel;
import com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.f;
import com.tencent.mm.plugin.appbrand.report.AppBrandStatObject;
import com.tencent.mm.plugin.appbrand.task.h;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.al;
import java.util.LinkedList;
import java.util.Queue;

public abstract class a extends MutableContextWrapper
{
  protected boolean ijC = true;
  final Queue<Runnable> ijD = new LinkedList();
  private al ijE;

  public a()
  {
    super(ah.getContext());
  }

  private void J(Runnable paramRunnable)
  {
    if ((getBaseContext() instanceof AppBrandLaunchProxyUI))
      paramRunnable.run();
    while (true)
    {
      return;
      this.ijD.offer(paramRunnable);
    }
  }

  protected final void a(LaunchParcel paramLaunchParcel, String paramString)
  {
    al localal = new al("AppBrandLaunchProxyUI-PrepareThread");
    this.ijE = localal;
    localal.aa(new a.3(this, paramLaunchParcel, paramString));
  }

  protected abstract String aHK();

  protected final void aHL()
  {
    J(new a.1(this));
  }

  protected Context aHM()
  {
    return null;
  }

  protected final boolean aHN()
  {
    if (((getBaseContext() instanceof AppBrandLaunchProxyUI)) && (((AppBrandLaunchProxyUI)getBaseContext()).isDestroyed()));
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  protected void b(AppBrandInitConfigWC paramAppBrandInitConfigWC, AppBrandStatObject paramAppBrandStatObject)
  {
    if (paramAppBrandInitConfigWC != null)
    {
      Context localContext1 = aHM();
      Context localContext2 = localContext1;
      if (localContext1 == null)
        localContext2 = getBaseContext();
      j.b(localContext2, paramAppBrandInitConfigWC, paramAppBrandStatObject);
    }
    while (true)
    {
      if (this.ijC)
        aHL();
      if (this.ijE != null)
        this.ijE.aa(new a.4(this));
      return;
      this.ijC = true;
    }
  }

  protected boolean c(AppBrandInitConfigWC paramAppBrandInitConfigWC, AppBrandStatObject paramAppBrandStatObject)
  {
    boolean bool = true;
    int i;
    if ((paramAppBrandInitConfigWC.hgI) || (h.DS(paramAppBrandInitConfigWC.appId)) || (paramAppBrandInitConfigWC.xy()) || (paramAppBrandInitConfigWC.hgJ))
    {
      i = 1;
      if ((i | f.d(paramAppBrandInitConfigWC, paramAppBrandStatObject)) != 0)
        break label55;
    }
    while (true)
    {
      return bool;
      i = 0;
      break;
      label55: bool = false;
    }
  }

  protected final void finish()
  {
    b(null, null);
  }

  protected final boolean isFinishing()
  {
    if (((getBaseContext() instanceof AppBrandLaunchProxyUI)) && (((AppBrandLaunchProxyUI)getBaseContext()).isFinishing()));
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public final void setBaseContext(Context paramContext)
  {
    super.setBaseContext(paramContext);
    if ((getBaseContext() instanceof AppBrandLaunchProxyUI))
      while (!this.ijD.isEmpty())
        ((Runnable)this.ijD.poll()).run();
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.launching.precondition.a
 * JD-Core Version:    0.6.2
 */