package com.tencent.mm.a;

import java.util.Map;
import java.util.Set;

public abstract interface f<K, O>
{
  public abstract void a(a<K, O> parama);

  public abstract O ai(K paramK);

  public abstract boolean aj(K paramK);

  public abstract boolean ak(K paramK);

  public abstract void clear();

  public abstract int createCount();

  public abstract int evictionCount();

  public abstract O get(K paramK);

  public abstract int hitCount();

  public abstract void k(K paramK, O paramO);

  public abstract Set<K> keySet();

  public abstract int maxSize();

  public abstract int missCount();

  public abstract O put(K paramK, O paramO);

  public abstract int putCount();

  public abstract O remove(K paramK);

  public abstract int size();

  public abstract int sizeOf(K paramK, O paramO);

  public abstract Map<K, O> snapshot();

  public abstract void trimToSize(int paramInt);

  public static abstract interface a<K, O>
  {
  }

  public static abstract interface b<K, O>
  {
    public abstract void c(K paramK, O paramO1, O paramO2);
  }

  public static abstract interface c<K, O>
  {
    public abstract int l(K paramK, O paramO);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.a.f
 * JD-Core Version:    0.6.2
 */