package com.google.android.gms.common.util;

import java.util.ArrayList;

public abstract class ObjectPoolBase<T>
{
  private final ArrayList<T> zzaag;
  private final int zzaah;

  public ObjectPoolBase(int paramInt)
  {
    this.zzaag = new ArrayList(paramInt);
    this.zzaah = paramInt;
  }

  public final T aquire()
  {
    synchronized (this.zzaag)
    {
      int i = this.zzaag.size();
      if (i > 0)
      {
        localObject1 = this.zzaag.remove(i - 1);
        return localObject1;
      }
      Object localObject1 = newObject();
    }
  }

  protected boolean cleanUpObject(T paramT)
  {
    return true;
  }

  protected abstract T newObject();

  public final boolean release(T paramT)
  {
    boolean bool = false;
    int i;
    while (true)
    {
      int j;
      synchronized (this.zzaag)
      {
        i = this.zzaag.size();
        j = 0;
        if (j >= i)
          break;
        if (this.zzaag.get(j) == paramT)
        {
          IllegalArgumentException localIllegalArgumentException = new java/lang/IllegalArgumentException;
          paramT = String.valueOf(paramT);
          j = String.valueOf(paramT).length();
          StringBuilder localStringBuilder = new java/lang/StringBuilder;
          localStringBuilder.<init>(j + 25);
          localIllegalArgumentException.<init>("Object released already: " + paramT);
          throw localIllegalArgumentException;
        }
      }
      j++;
    }
    if ((i < this.zzaah) && (cleanUpObject(paramT)))
    {
      this.zzaag.add(paramT);
      bool = true;
    }
    while (true)
      return bool;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.util.ObjectPoolBase
 * JD-Core Version:    0.6.2
 */