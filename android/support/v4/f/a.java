package android.support.v4.f;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class a<K, V> extends m<K, V>
  implements Map<K, V>
{
  h<K, V> KU;

  public a()
  {
  }

  public a(int paramInt)
  {
    super(paramInt);
  }

  public a(m paramm)
  {
    super(paramm);
  }

  private h<K, V> eg()
  {
    if (this.KU == null)
      this.KU = new h()
      {
        protected final int E(Object paramAnonymousObject)
        {
          return a.this.indexOfKey(paramAnonymousObject);
        }

        protected final int F(Object paramAnonymousObject)
        {
          return a.this.indexOfValue(paramAnonymousObject);
        }

        protected final V a(int paramAnonymousInt, V paramAnonymousV)
        {
          return a.this.setValueAt(paramAnonymousInt, paramAnonymousV);
        }

        protected final void aC(int paramAnonymousInt)
        {
          a.this.removeAt(paramAnonymousInt);
        }

        protected final void d(K paramAnonymousK, V paramAnonymousV)
        {
          a.this.put(paramAnonymousK, paramAnonymousV);
        }

        protected final int eh()
        {
          return a.this.mSize;
        }

        protected final Map<K, V> ei()
        {
          return a.this;
        }

        protected final void ej()
        {
          a.this.clear();
        }

        protected final Object v(int paramAnonymousInt1, int paramAnonymousInt2)
        {
          return a.this.Ld[((paramAnonymousInt1 << 1) + paramAnonymousInt2)];
        }
      };
    return this.KU;
  }

  public Set<Map.Entry<K, V>> entrySet()
  {
    h localh = eg();
    if (localh.Lm == null)
      localh.Lm = new h.b(localh);
    return localh.Lm;
  }

  public Set<K> keySet()
  {
    return eg().getKeySet();
  }

  public void putAll(Map<? extends K, ? extends V> paramMap)
  {
    ensureCapacity(this.mSize + paramMap.size());
    paramMap = paramMap.entrySet().iterator();
    while (paramMap.hasNext())
    {
      Map.Entry localEntry = (Map.Entry)paramMap.next();
      put(localEntry.getKey(), localEntry.getValue());
    }
  }

  public Collection<V> values()
  {
    h localh = eg();
    if (localh.Lo == null)
      localh.Lo = new h.e(localh);
    return localh.Lo;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     android.support.v4.f.a
 * JD-Core Version:    0.6.2
 */