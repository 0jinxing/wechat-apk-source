package com.tencent.mm.a;

import com.tencent.mm.sdk.platformtools.ae;

public class h<K, O> extends ae<K, O>
  implements f<K, O>
{
  private f.b<K, O> cbY = null;
  private f.c<K, O> cbZ = null;

  public h(int paramInt)
  {
    super(paramInt);
  }

  public h(int paramInt, f.b<K, O> paramb)
  {
    super(paramInt);
    this.cbY = paramb;
  }

  public h(int paramInt, f.b<K, O> paramb, f.c<K, O> paramc)
  {
    super(paramInt);
    this.cbY = paramb;
    this.cbZ = paramc;
  }

  public void a(f.a<K, O> parama)
  {
    clear();
  }

  public final O ai(K paramK)
  {
    return get(paramK);
  }

  public void clear()
  {
    super.trimToSize(-1);
  }

  public final O create(K paramK)
  {
    return super.create(paramK);
  }

  public void entryRemoved(boolean paramBoolean, K paramK, O paramO1, O paramO2)
  {
    super.entryRemoved(paramBoolean, paramK, paramO1, paramO2);
    if (this.cbY != null)
      this.cbY.c(paramK, paramO1, paramO2);
  }

  public final void k(K paramK, O paramO)
  {
    if ((paramO == null) || (paramK == null));
    while (true)
    {
      return;
      put(paramK, paramO);
    }
  }

  public int sizeOf(K paramK, O paramO)
  {
    if (this.cbZ != null);
    for (int i = this.cbZ.l(paramK, paramO); ; i = super.sizeOf(paramK, paramO))
      return i;
  }

  public final void trimToSize(int paramInt)
  {
    super.trimToSize(paramInt);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.a.h
 * JD-Core Version:    0.6.2
 */