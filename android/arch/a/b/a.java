package android.arch.a.b;

import java.util.HashMap;

public final class a<K, V> extends b<K, V>
{
  public HashMap<K, b.c<K, V>> bR = new HashMap();

  public final boolean contains(K paramK)
  {
    return this.bR.containsKey(paramK);
  }

  protected final b.c<K, V> d(K paramK)
  {
    return (b.c)this.bR.get(paramK);
  }

  public final V putIfAbsent(K paramK, V paramV)
  {
    b.c localc = d(paramK);
    if (localc != null);
    for (paramK = localc.mValue; ; paramK = null)
    {
      return paramK;
      this.bR.put(paramK, b(paramK, paramV));
    }
  }

  public final V remove(K paramK)
  {
    Object localObject = super.remove(paramK);
    this.bR.remove(paramK);
    return localObject;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     android.arch.a.b.a
 * JD-Core Version:    0.6.2
 */