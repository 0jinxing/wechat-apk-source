package com.tencent.mm.plugin.appbrand;

import com.tencent.mm.plugin.appbrand.appstorage.p;
import com.tencent.mm.plugin.appbrand.b.c;
import com.tencent.mm.plugin.appbrand.jsapi.j;
import com.tencent.mm.plugin.appbrand.widget.b.k;

public abstract class d extends com.tencent.mm.plugin.appbrand.jsapi.i
{
  public final <T extends com.tencent.luggage.a.b> T B(Class<T> paramClass)
  {
    Object localObject = getRuntime();
    if (localObject != null)
    {
      com.tencent.luggage.a.b localb = (com.tencent.luggage.a.b)((i)localObject).K(paramClass);
      localObject = localb;
      if (localb != null);
    }
    else
    {
      localObject = super.B(paramClass);
    }
    return localObject;
  }

  public final <T extends j> T aa(Class<T> paramClass)
  {
    if (isRunning());
    for (paramClass = getRuntime().aa(paramClass); ; paramClass = super.aa(paramClass))
      return paramClass;
  }

  public final com.tencent.mm.plugin.appbrand.b.b asD()
  {
    if (!isRunning());
    for (com.tencent.mm.plugin.appbrand.b.b localb = com.tencent.mm.plugin.appbrand.b.b.gWw; ; localb = getRuntime().gNN.gWy.awz())
      return localb;
  }

  public final p asE()
  {
    if (!isRunning());
    for (p localp = super.asE(); ; localp = getRuntime().asE())
      return localp;
  }

  public final k asF()
  {
    if (!isRunning());
    for (Object localObject = super.asF(); ; localObject = getRuntime().gNG)
      return localObject;
  }

  public final com.tencent.mm.plugin.appbrand.appcache.o asG()
  {
    return (com.tencent.mm.plugin.appbrand.appcache.o)B(com.tencent.mm.plugin.appbrand.appstorage.o.class);
  }

  public final String getAppId()
  {
    if (getRuntime() == null);
    for (String str = null; ; str = getRuntime().mAppId)
      return str;
  }

  public boolean isRunning()
  {
    i locali = getRuntime();
    if ((locali != null) && (!locali.mFinished));
    for (boolean bool = true; ; bool = false)
      return bool;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.d
 * JD-Core Version:    0.6.2
 */