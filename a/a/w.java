package a.a;

import a.f.b.a.a;
import a.f.b.j;
import a.l;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.Serializable;
import java.util.Map;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lkotlin/collections/EmptyMap;", "", "", "", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "()V", "entries", "", "", "getEntries", "()Ljava/util/Set;", "keys", "getKeys", "serialVersionUID", "", "size", "", "getSize", "()I", "values", "", "getValues", "()Ljava/util/Collection;", "containsKey", "", "key", "containsValue", "value", "equals", "other", "get", "hashCode", "isEmpty", "readResolve", "toString", "", "kotlin-stdlib"})
final class w
  implements a, Serializable, Map
{
  public static final w AUQ;

  static
  {
    AppMethodBeat.i(56150);
    AUQ = new w();
    AppMethodBeat.o(56150);
  }

  private final Object readResolve()
  {
    return AUQ;
  }

  public final void clear()
  {
    AppMethodBeat.i(56151);
    UnsupportedOperationException localUnsupportedOperationException = new UnsupportedOperationException("Operation is not supported for read-only collection");
    AppMethodBeat.o(56151);
    throw localUnsupportedOperationException;
  }

  public final boolean containsKey(Object paramObject)
  {
    return false;
  }

  public final boolean containsValue(Object paramObject)
  {
    AppMethodBeat.i(56149);
    if (!(paramObject instanceof Void))
      AppMethodBeat.o(56149);
    while (true)
    {
      return false;
      j.p((Void)paramObject, "value");
      AppMethodBeat.o(56149);
    }
  }

  public final boolean equals(Object paramObject)
  {
    AppMethodBeat.i(56148);
    boolean bool;
    if (((paramObject instanceof Map)) && (((Map)paramObject).isEmpty()))
    {
      bool = true;
      AppMethodBeat.o(56148);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(56148);
    }
  }

  public final int hashCode()
  {
    return 0;
  }

  public final boolean isEmpty()
  {
    return true;
  }

  public final void putAll(Map paramMap)
  {
    AppMethodBeat.i(56152);
    paramMap = new UnsupportedOperationException("Operation is not supported for read-only collection");
    AppMethodBeat.o(56152);
    throw paramMap;
  }

  public final Object remove(Object paramObject)
  {
    AppMethodBeat.i(56153);
    paramObject = new UnsupportedOperationException("Operation is not supported for read-only collection");
    AppMethodBeat.o(56153);
    throw paramObject;
  }

  public final String toString()
  {
    return "{}";
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     a.a.w
 * JD-Core Version:    0.6.2
 */