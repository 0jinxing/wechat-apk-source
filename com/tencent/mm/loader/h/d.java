package com.tencent.mm.loader.h;

import com.tencent.mm.a.f;
import com.tencent.mm.memory.a.c;

public final class d<K, V>
{
  private f<K, V> eRT;

  public d(int paramInt)
  {
    this.eRT = new c(paramInt);
  }

  public final V ai(K paramK)
  {
    if (this.eRT == null)
      throw new NullPointerException("mData == null");
    return this.eRT.ai(paramK);
  }

  public final boolean aj(K paramK)
  {
    try
    {
      if (this.eRT == null)
      {
        paramK = new java/lang/NullPointerException;
        paramK.<init>("mData == null");
        throw paramK;
      }
    }
    finally
    {
    }
    boolean bool = this.eRT.aj(paramK);
    return bool;
  }

  public final V get(K paramK)
  {
    if (this.eRT == null)
      throw new NullPointerException("mData == null");
    return this.eRT.get(paramK);
  }

  public final V put(K paramK, V paramV)
  {
    if (this.eRT == null)
      throw new NullPointerException("mData == null");
    return this.eRT.put(paramK, paramV);
  }

  public final String toString()
  {
    try
    {
      if (this.eRT == null)
      {
        NullPointerException localNullPointerException = new java/lang/NullPointerException;
        localNullPointerException.<init>("mData == null");
        throw localNullPointerException;
      }
    }
    finally
    {
    }
    String str = this.eRT.toString();
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.loader.h.d
 * JD-Core Version:    0.6.2
 */