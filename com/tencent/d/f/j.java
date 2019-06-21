package com.tencent.d.f;

public abstract class j<T>
{
  private volatile T mInstance;

  public final T get()
  {
    Object localObject1 = this.mInstance;
    Object localObject2 = localObject1;
    if (localObject1 == null);
    try
    {
      localObject1 = this.mInstance;
      localObject2 = localObject1;
      if (localObject1 == null)
      {
        localObject2 = mG();
        this.mInstance = localObject2;
      }
      return localObject2;
    }
    finally
    {
    }
  }

  protected abstract T mG();
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.d.f.j
 * JD-Core Version:    0.6.2
 */