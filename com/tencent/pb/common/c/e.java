package com.tencent.pb.common.c;

public abstract class e<T>
{
  private T mInstance;

  public final T get()
  {
    try
    {
      if (this.mInstance == null)
        this.mInstance = mG();
      Object localObject1 = this.mInstance;
      return localObject1;
    }
    finally
    {
    }
  }

  protected abstract T mG();
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.pb.common.c.e
 * JD-Core Version:    0.6.2
 */