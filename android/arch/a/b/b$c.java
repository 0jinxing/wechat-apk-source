package android.arch.a.b;

import java.util.Map.Entry;

public final class b$c<K, V>
  implements Map.Entry<K, V>
{
  final K bV;
  c<K, V> bW;
  public c<K, V> bX;
  final V mValue;

  b$c(K paramK, V paramV)
  {
    this.bV = paramK;
    this.mValue = paramV;
  }

  public final boolean equals(Object paramObject)
  {
    boolean bool = true;
    if (paramObject == this);
    while (true)
    {
      return bool;
      if (!(paramObject instanceof c))
      {
        bool = false;
      }
      else
      {
        paramObject = (c)paramObject;
        if ((!this.bV.equals(paramObject.bV)) || (!this.mValue.equals(paramObject.mValue)))
          bool = false;
      }
    }
  }

  public final K getKey()
  {
    return this.bV;
  }

  public final V getValue()
  {
    return this.mValue;
  }

  public final V setValue(V paramV)
  {
    throw new UnsupportedOperationException("An entry modification is not supported");
  }

  public final String toString()
  {
    return this.bV + "=" + this.mValue;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     android.arch.a.b.b.c
 * JD-Core Version:    0.6.2
 */