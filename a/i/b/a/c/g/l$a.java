package a.i.b.a.c.g;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Map.Entry;

final class l$a<K>
  implements Map.Entry<K, Object>
{
  private Map.Entry<K, l> BAa;

  private l$a(Map.Entry<K, l> paramEntry)
  {
    this.BAa = paramEntry;
  }

  public final K getKey()
  {
    AppMethodBeat.i(121539);
    Object localObject = this.BAa.getKey();
    AppMethodBeat.o(121539);
    return localObject;
  }

  public final Object getValue()
  {
    AppMethodBeat.i(121540);
    Object localObject = (l)this.BAa.getValue();
    if (localObject == null)
    {
      localObject = null;
      AppMethodBeat.o(121540);
    }
    while (true)
    {
      return localObject;
      localObject = ((l)localObject).eiy();
      AppMethodBeat.o(121540);
    }
  }

  public final Object setValue(Object paramObject)
  {
    AppMethodBeat.i(121541);
    if (!(paramObject instanceof q))
    {
      paramObject = new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
      AppMethodBeat.o(121541);
      throw paramObject;
    }
    paramObject = ((l)this.BAa.getValue()).e((q)paramObject);
    AppMethodBeat.o(121541);
    return paramObject;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     a.i.b.a.c.g.l.a
 * JD-Core Version:    0.6.2
 */