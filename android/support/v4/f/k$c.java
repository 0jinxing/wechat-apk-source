package android.support.v4.f;

public final class k$c<T> extends k.b<T>
{
  private final Object mLock = new Object();

  public k$c(int paramInt)
  {
    super(paramInt);
  }

  public final T aA()
  {
    synchronized (this.mLock)
    {
      Object localObject2 = super.aA();
      return localObject2;
    }
  }

  public final boolean release(T paramT)
  {
    synchronized (this.mLock)
    {
      boolean bool = super.release(paramT);
      return bool;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     android.support.v4.f.k.c
 * JD-Core Version:    0.6.2
 */