package a.i.b.a.c.k;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.concurrent.ConcurrentMap;

final class b$a<K, V> extends b.b<K, V>
  implements a<K, V>
{
  static
  {
    AppMethodBeat.i(122437);
    if (!b.class.desiredAssertionStatus());
    for (boolean bool = true; ; bool = false)
    {
      $assertionsDisabled = bool;
      AppMethodBeat.o(122437);
      return;
    }
  }

  private b$a(b paramb, ConcurrentMap<b.d<K, V>, Object> paramConcurrentMap)
  {
    super(paramb, paramConcurrentMap, (byte)0);
  }

  public final V b(K paramK, a.f.a.a<? extends V> parama)
  {
    AppMethodBeat.i(122436);
    paramK = super.b(paramK, parama);
    if ((!$assertionsDisabled) && (paramK == null))
    {
      paramK = new AssertionError("computeIfAbsent() returned null under " + this.BIQ);
      AppMethodBeat.o(122436);
      throw paramK;
    }
    AppMethodBeat.o(122436);
    return paramK;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     a.i.b.a.c.k.b.a
 * JD-Core Version:    0.6.2
 */