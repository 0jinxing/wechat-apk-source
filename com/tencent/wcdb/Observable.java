package com.tencent.wcdb;

import java.util.ArrayList;

public abstract class Observable<T>
{
  protected final ArrayList<T> mObservers = new ArrayList();

  public void registerObserver(T paramT)
  {
    if (paramT == null)
      throw new IllegalArgumentException("The observer is null.");
    synchronized (this.mObservers)
    {
      if (this.mObservers.contains(paramT))
      {
        IllegalStateException localIllegalStateException = new java/lang/IllegalStateException;
        StringBuilder localStringBuilder = new java/lang/StringBuilder;
        localStringBuilder.<init>("Observer ");
        localIllegalStateException.<init>(paramT + " is already registered.");
        throw localIllegalStateException;
      }
    }
    this.mObservers.add(paramT);
  }

  public void unregisterAll()
  {
    synchronized (this.mObservers)
    {
      this.mObservers.clear();
      return;
    }
  }

  public void unregisterObserver(T paramT)
  {
    if (paramT == null)
      throw new IllegalArgumentException("The observer is null.");
    int i;
    synchronized (this.mObservers)
    {
      i = this.mObservers.indexOf(paramT);
      if (i == -1)
      {
        IllegalStateException localIllegalStateException = new java/lang/IllegalStateException;
        StringBuilder localStringBuilder = new java/lang/StringBuilder;
        localStringBuilder.<init>("Observer ");
        localIllegalStateException.<init>(paramT + " was not registered.");
        throw localIllegalStateException;
      }
    }
    this.mObservers.remove(i);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.wcdb.Observable
 * JD-Core Version:    0.6.2
 */