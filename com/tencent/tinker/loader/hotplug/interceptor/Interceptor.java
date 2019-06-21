package com.tencent.tinker.loader.hotplug.interceptor;

public abstract class Interceptor<T_TARGET>
{
  private T_TARGET ADy = null;
  private volatile boolean mInstalled = false;

  protected abstract T_TARGET dSm();

  public final void dSn()
  {
    try
    {
      Object localObject1 = dSm();
      this.ADy = localObject1;
      localObject3 = df(localObject1);
      if (localObject3 != localObject1)
        de(localObject3);
      while (true)
      {
        this.mInstalled = true;
        return;
        localObject3 = new java/lang/StringBuilder;
        ((StringBuilder)localObject3).<init>("target: ");
        ((StringBuilder)localObject3).append(localObject1).append(" was already hooked.");
      }
    }
    catch (Throwable localThrowable)
    {
      this.ADy = null;
      Object localObject3 = new com/tencent/tinker/loader/hotplug/interceptor/InterceptFailedException;
      ((InterceptFailedException)localObject3).<init>(localThrowable);
      throw ((Throwable)localObject3);
    }
    finally
    {
    }
  }

  protected abstract void de(T_TARGET paramT_TARGET);

  protected T_TARGET df(T_TARGET paramT_TARGET)
  {
    return paramT_TARGET;
  }

  public final void uninstall()
  {
    try
    {
      boolean bool = this.mInstalled;
      if (bool);
      try
      {
        de(this.ADy);
        this.ADy = null;
        this.mInstalled = false;
        return;
      }
      catch (Throwable localThrowable)
      {
        InterceptFailedException localInterceptFailedException = new com/tencent/tinker/loader/hotplug/interceptor/InterceptFailedException;
        localInterceptFailedException.<init>(localThrowable);
        throw localInterceptFailedException;
      }
    }
    finally
    {
    }
  }

  protected static abstract interface ITinkerHotplugProxy
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.tinker.loader.hotplug.interceptor.Interceptor
 * JD-Core Version:    0.6.2
 */