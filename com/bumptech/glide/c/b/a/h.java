package com.bumptech.glide.c.b.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.HashMap;
import java.util.Map;

final class h<K extends m, V>
{
  private final h.a<K, V> aCv;
  private final Map<K, h.a<K, V>> aCw;

  h()
  {
    AppMethodBeat.i(91918);
    this.aCv = new h.a();
    this.aCw = new HashMap();
    AppMethodBeat.o(91918);
  }

  private void a(h.a<K, V> parama)
  {
    AppMethodBeat.i(91923);
    d(parama);
    parama.aCA = this.aCv;
    parama.aCz = this.aCv.aCz;
    c(parama);
    AppMethodBeat.o(91923);
  }

  private void b(h.a<K, V> parama)
  {
    AppMethodBeat.i(91924);
    d(parama);
    parama.aCA = this.aCv.aCA;
    parama.aCz = this.aCv;
    c(parama);
    AppMethodBeat.o(91924);
  }

  private static <K, V> void c(h.a<K, V> parama)
  {
    parama.aCz.aCA = parama;
    parama.aCA.aCz = parama;
  }

  private static <K, V> void d(h.a<K, V> parama)
  {
    parama.aCA.aCz = parama.aCz;
    parama.aCz.aCA = parama.aCA;
  }

  public final void a(K paramK, V paramV)
  {
    AppMethodBeat.i(91919);
    h.a locala = (h.a)this.aCw.get(paramK);
    if (locala == null)
    {
      locala = new h.a(paramK);
      b(locala);
      this.aCw.put(paramK, locala);
    }
    for (paramK = locala; ; paramK = locala)
    {
      paramK.add(paramV);
      AppMethodBeat.o(91919);
      return;
      paramK.mQ();
    }
  }

  public final V b(K paramK)
  {
    AppMethodBeat.i(91920);
    h.a locala = (h.a)this.aCw.get(paramK);
    if (locala == null)
    {
      locala = new h.a(paramK);
      this.aCw.put(paramK, locala);
    }
    for (paramK = locala; ; paramK = locala)
    {
      a(paramK);
      paramK = paramK.removeLast();
      AppMethodBeat.o(91920);
      return paramK;
      paramK.mQ();
    }
  }

  public final V removeLast()
  {
    AppMethodBeat.i(91921);
    Object localObject1 = this.aCv.aCA;
    if (!localObject1.equals(this.aCv))
    {
      Object localObject2 = ((h.a)localObject1).removeLast();
      if (localObject2 != null)
      {
        AppMethodBeat.o(91921);
        localObject1 = localObject2;
      }
    }
    while (true)
    {
      return localObject1;
      d((h.a)localObject1);
      this.aCw.remove(((h.a)localObject1).aCx);
      ((m)((h.a)localObject1).aCx).mQ();
      localObject1 = ((h.a)localObject1).aCA;
      break;
      localObject1 = null;
      AppMethodBeat.o(91921);
    }
  }

  public final String toString()
  {
    AppMethodBeat.i(91922);
    StringBuilder localStringBuilder = new StringBuilder("GroupedLinkedMap( ");
    Object localObject = this.aCv.aCz;
    int i = 0;
    while (!localObject.equals(this.aCv))
    {
      i = 1;
      localStringBuilder.append('{').append(((h.a)localObject).aCx).append(':').append(((h.a)localObject).size()).append("}, ");
      localObject = ((h.a)localObject).aCz;
    }
    if (i != 0)
      localStringBuilder.delete(localStringBuilder.length() - 2, localStringBuilder.length());
    localObject = " )";
    AppMethodBeat.o(91922);
    return localObject;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.bumptech.glide.c.b.a.h
 * JD-Core Version:    0.6.2
 */