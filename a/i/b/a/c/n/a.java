package a.i.b.a.c.n;

import a.a.v;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public final class a
{
  public static final <K, V> HashMap<K, V> UP(int paramInt)
  {
    AppMethodBeat.i(122916);
    HashMap localHashMap = new HashMap(UR(paramInt));
    AppMethodBeat.o(122916);
    return localHashMap;
  }

  public static final <E> HashSet<E> UQ(int paramInt)
  {
    AppMethodBeat.i(122917);
    HashSet localHashSet = new HashSet(UR(paramInt));
    AppMethodBeat.o(122917);
    return localHashSet;
  }

  public static final int UR(int paramInt)
  {
    int i = 3;
    if (paramInt < 3);
    for (paramInt = i; ; paramInt = paramInt / 3 + paramInt + 1)
      return paramInt;
  }

  public static final <T> List<T> at(ArrayList<T> paramArrayList)
  {
    AppMethodBeat.i(122918);
    a.f.b.j.p(paramArrayList, "receiver$0");
    switch (paramArrayList.size())
    {
    default:
      paramArrayList.trimToSize();
      paramArrayList = (List)paramArrayList;
      AppMethodBeat.o(122918);
    case 0:
    case 1:
    }
    while (true)
    {
      return paramArrayList;
      paramArrayList = (List)v.AUP;
      AppMethodBeat.o(122918);
      continue;
      paramArrayList = a.a.j.listOf(a.a.j.fJ((List)paramArrayList));
      AppMethodBeat.o(122918);
    }
  }

  public static final <T> void b(Collection<T> paramCollection, T paramT)
  {
    AppMethodBeat.i(122915);
    a.f.b.j.p(paramCollection, "receiver$0");
    if (paramT != null)
      paramCollection.add(paramT);
    AppMethodBeat.o(122915);
  }

  public static final <K> Map<K, Integer> x(Iterable<? extends K> paramIterable)
  {
    AppMethodBeat.i(122914);
    a.f.b.j.p(paramIterable, "receiver$0");
    LinkedHashMap localLinkedHashMap = new LinkedHashMap();
    paramIterable = paramIterable.iterator();
    for (int i = 0; paramIterable.hasNext(); i++)
    {
      Object localObject = paramIterable.next();
      ((Map)localLinkedHashMap).put(localObject, Integer.valueOf(i));
    }
    paramIterable = (Map)localLinkedHashMap;
    AppMethodBeat.o(122914);
    return paramIterable;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     a.i.b.a.c.n.a
 * JD-Core Version:    0.6.2
 */