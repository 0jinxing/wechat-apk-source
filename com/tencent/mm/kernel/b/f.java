package com.tencent.mm.kernel.b;

import com.tencent.mm.kernel.c.e;
import com.tencent.mm.kernel.h;
import com.tencent.mm.kernel.j;
import java.util.HashSet;
import junit.framework.Assert;

public abstract class f
  implements d
{
  private static final String TAG = "MMKernel.Plugin";
  private boolean mConfigured = false;
  private boolean mDependencyMade = false;
  private boolean mInstalled = false;
  private boolean mIsPendingPlugin = false;
  private boolean mMakingDependencies = false;
  private HashSet<c> mPins = new HashSet();

  private void checkIfNeedDefaultDependency()
  {
    Object localObject = h.RT().RL();
    Class localClass = getClass();
    if (!((com.tencent.mm.kernel.c)localObject).eJA.aG(localClass))
    {
      localObject = h.RT().RL().eJD;
      if (localObject != null)
      {
        dependsOn((Class)localObject);
        j.i("MMKernel.Plugin", "plugin[%s] not specific any depOn, we using default one [%s]", new Object[] { this, localObject });
      }
    }
  }

  private final void detectAlias()
  {
    for (Class localClass : getClass().getInterfaces())
      if (a.class.isAssignableFrom(localClass))
        alias(localClass);
  }

  public void alias(Class<? extends a> paramClass)
  {
    Assert.assertNotNull(paramClass);
    Assert.assertTrue(paramClass.isInstance(this));
    h.RT().RL().k(getClass(), paramClass);
  }

  public void configure(g paramg)
  {
  }

  public void dependency()
  {
  }

  protected void dependsOn(Class<? extends a> paramClass)
  {
    if (!this.mMakingDependencies)
      j.w("MMKernel.Plugin", "Ignore this dependency. It's not dependency phase now!", new Object[0]);
    while (true)
    {
      return;
      h.RT().RL().l(getClass(), paramClass);
    }
  }

  protected void dependsOnRoot()
  {
    if (!this.mMakingDependencies)
      j.w("MMKernel.Plugin", "Ignore this dependency. It's not dependency phase now!", new Object[0]);
    while (true)
    {
      return;
      h.RT().RL().l(getClass(), getClass());
    }
  }

  public int hashCode()
  {
    return name().hashCode();
  }

  public String identify()
  {
    return getClass().getSimpleName();
  }

  public void installed()
  {
  }

  public void invokeConfigure(g paramg)
  {
    configure(paramg);
    this.mConfigured = true;
  }

  public void invokeDependency()
  {
    this.mMakingDependencies = true;
    dependency();
    checkIfNeedDefaultDependency();
    this.mDependencyMade = true;
    this.mMakingDependencies = false;
  }

  public void invokeInstalled()
  {
    this.mInstalled = true;
    installed();
    detectAlias();
  }

  public boolean isConfigured()
  {
    return this.mConfigured;
  }

  public boolean isDependencyMade()
  {
    return this.mDependencyMade;
  }

  public boolean isPendingPlugin()
  {
    return this.mIsPendingPlugin;
  }

  public void markAsPendingPlugin()
  {
    this.mIsPendingPlugin = true;
  }

  public String name()
  {
    return toString();
  }

  public String[] ofProcesses()
  {
    return new String[0];
  }

  public void pin(c paramc)
  {
    try
    {
      if (!this.mPins.contains(paramc))
      {
        this.mPins.add(paramc);
        com.tencent.mm.kernel.c localc = h.RT().RL();
        Class localClass = paramc.getClass();
        e locale = new com/tencent/mm/kernel/c/e;
        locale.<init>(paramc);
        localc.a(localClass, locale);
      }
      return;
    }
    finally
    {
      paramc = finally;
    }
    throw paramc;
  }

  public String toString()
  {
    return getClass().getName() + '@' + Integer.toHexString(super.hashCode());
  }

  public void uninstalled()
  {
    this.mConfigured = false;
    this.mInstalled = false;
  }

  public void unpin(c paramc)
  {
    try
    {
      if (this.mPins.contains(paramc))
      {
        this.mPins.remove(paramc);
        h.RT().RL().L(paramc.getClass());
      }
      return;
    }
    finally
    {
      paramc = finally;
    }
    throw paramc;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.kernel.b.f
 * JD-Core Version:    0.6.2
 */