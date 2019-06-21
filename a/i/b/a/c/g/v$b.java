package a.i.b.a.c.g;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Map.Entry;

final class v$b
  implements Comparable<v<K, V>.b>, Map.Entry<K, V>
{
  final K BAF;
  private V value;

  v$b(K paramK, V paramV)
  {
    this.BAF = paramV;
    Object localObject;
    this.value = localObject;
  }

  v$b(Map.Entry<K, V> paramEntry)
  {
    this(paramEntry, (Comparable)localObject.getKey(), localObject.getValue());
    AppMethodBeat.i(121626);
    AppMethodBeat.o(121626);
  }

  private static boolean equals(Object paramObject1, Object paramObject2)
  {
    AppMethodBeat.i(121631);
    boolean bool;
    if (paramObject1 == null)
      if (paramObject2 == null)
      {
        bool = true;
        AppMethodBeat.o(121631);
      }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(121631);
      continue;
      bool = paramObject1.equals(paramObject2);
      AppMethodBeat.o(121631);
    }
  }

  public final boolean equals(Object paramObject)
  {
    boolean bool = true;
    AppMethodBeat.i(121628);
    if (paramObject == this)
      AppMethodBeat.o(121628);
    while (true)
    {
      return bool;
      if (!(paramObject instanceof Map.Entry))
      {
        AppMethodBeat.o(121628);
        bool = false;
      }
      else
      {
        paramObject = (Map.Entry)paramObject;
        if ((equals(this.BAF, paramObject.getKey())) && (equals(this.value, paramObject.getValue())))
        {
          AppMethodBeat.o(121628);
        }
        else
        {
          AppMethodBeat.o(121628);
          bool = false;
        }
      }
    }
  }

  public final V getValue()
  {
    return this.value;
  }

  public final int hashCode()
  {
    int i = 0;
    AppMethodBeat.i(121629);
    int j;
    if (this.BAF == null)
    {
      j = 0;
      if (this.value != null)
        break label43;
    }
    while (true)
    {
      AppMethodBeat.o(121629);
      return j ^ i;
      j = this.BAF.hashCode();
      break;
      label43: i = this.value.hashCode();
    }
  }

  public final V setValue(V paramV)
  {
    AppMethodBeat.i(121627);
    v.a(this.BAG);
    Object localObject = this.value;
    this.value = paramV;
    AppMethodBeat.o(121627);
    return localObject;
  }

  public final String toString()
  {
    AppMethodBeat.i(121630);
    String str1 = String.valueOf(String.valueOf(this.BAF));
    String str2 = String.valueOf(String.valueOf(this.value));
    str1 = str1.length() + 1 + str2.length() + str1 + "=" + str2;
    AppMethodBeat.o(121630);
    return str1;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     a.i.b.a.c.g.v.b
 * JD-Core Version:    0.6.2
 */