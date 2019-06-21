package a.a;

import a.f.b.j;
import a.l;
import a.o;
import a.v;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"INT_MAX_POWER_OF_TWO", "", "emptyMap", "", "K", "V", "hashMapOf", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "pairs", "", "Lkotlin/Pair;", "([Lkotlin/Pair;)Ljava/util/HashMap;", "linkedMapOf", "Ljava/util/LinkedHashMap;", "Lkotlin/collections/LinkedHashMap;", "([Lkotlin/Pair;)Ljava/util/LinkedHashMap;", "mapCapacity", "expectedSize", "mapOf", "([Lkotlin/Pair;)Ljava/util/Map;", "mutableMapOf", "", "component1", "", "(Ljava/util/Map$Entry;)Ljava/lang/Object;", "component2", "contains", "", "Lkotlin/internal/OnlyInputTypes;", "key", "(Ljava/util/Map;Ljava/lang/Object;)Z", "containsKey", "containsValue", "value", "filter", "predicate", "Lkotlin/Function1;", "filterKeys", "filterNot", "filterNotTo", "M", "destination", "(Ljava/util/Map;Ljava/util/Map;Lkotlin/jvm/functions/Function1;)Ljava/util/Map;", "filterTo", "filterValues", "get", "(Ljava/util/Map;Ljava/lang/Object;)Ljava/lang/Object;", "getOrElse", "defaultValue", "Lkotlin/Function0;", "(Ljava/util/Map;Ljava/lang/Object;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "getOrElseNullable", "getOrPut", "getValue", "ifEmpty", "R", "(Ljava/util/Map;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "isNotEmpty", "isNullOrEmpty", "iterator", "", "", "", "mutableIterator", "mapKeys", "transform", "mapKeysTo", "mapValues", "mapValuesTo", "minus", "(Ljava/util/Map;Ljava/lang/Object;)Ljava/util/Map;", "keys", "(Ljava/util/Map;[Ljava/lang/Object;)Ljava/util/Map;", "", "Lkotlin/sequences/Sequence;", "minusAssign", "", "(Ljava/util/Map;Ljava/lang/Object;)V", "(Ljava/util/Map;[Ljava/lang/Object;)V", "optimizeReadOnlyMap", "orEmpty", "plus", "(Ljava/util/Map;[Lkotlin/Pair;)Ljava/util/Map;", "pair", "map", "plusAssign", "(Ljava/util/Map;[Lkotlin/Pair;)V", "putAll", "remove", "set", "(Ljava/util/Map;Ljava/lang/Object;Ljava/lang/Object;)V", "toMap", "([Lkotlin/Pair;Ljava/util/Map;)Ljava/util/Map;", "(Ljava/lang/Iterable;Ljava/util/Map;)Ljava/util/Map;", "(Ljava/util/Map;Ljava/util/Map;)Ljava/util/Map;", "(Lkotlin/sequences/Sequence;Ljava/util/Map;)Ljava/util/Map;", "toMutableMap", "toPair", "kotlin-stdlib"}, dWr=1)
public class ag extends af
{
  public static final int SI(int paramInt)
  {
    if (paramInt < 3)
      paramInt++;
    while (true)
    {
      return paramInt;
      if (paramInt < 1073741824)
        paramInt = paramInt / 3 + paramInt;
      else
        paramInt = 2147483647;
    }
  }

  public static final <K, V, M extends Map<? super K, ? super V>> M a(Iterable<? extends o<? extends K, ? extends V>> paramIterable, M paramM)
  {
    AppMethodBeat.i(56064);
    j.p(paramIterable, "receiver$0");
    j.p(paramM, "destination");
    ad.a(paramM, paramIterable);
    AppMethodBeat.o(56064);
    return paramM;
  }

  public static final <K, V> Map<K, V> a(o<? extends K, ? extends V>[] paramArrayOfo)
  {
    AppMethodBeat.i(56060);
    j.p(paramArrayOfo, "pairs");
    if (paramArrayOfo.length > 0)
    {
      Map localMap = (Map)new LinkedHashMap(ad.SI(paramArrayOfo.length));
      j.p(paramArrayOfo, "receiver$0");
      j.p(localMap, "destination");
      ad.a(localMap, paramArrayOfo);
      AppMethodBeat.o(56060);
      paramArrayOfo = localMap;
    }
    while (true)
    {
      return paramArrayOfo;
      paramArrayOfo = ad.emptyMap();
      AppMethodBeat.o(56060);
    }
  }

  public static final <K, V> void a(Map<? super K, ? super V> paramMap, Iterable<? extends o<? extends K, ? extends V>> paramIterable)
  {
    AppMethodBeat.i(56062);
    j.p(paramMap, "receiver$0");
    j.p(paramIterable, "pairs");
    Iterator localIterator = paramIterable.iterator();
    while (localIterator.hasNext())
    {
      paramIterable = (o)localIterator.next();
      paramMap.put(paramIterable.first, paramIterable.second);
    }
    AppMethodBeat.o(56062);
  }

  public static final <K, V> void a(Map<? super K, ? super V> paramMap, o<? extends K, ? extends V>[] paramArrayOfo)
  {
    AppMethodBeat.i(56061);
    j.p(paramMap, "receiver$0");
    j.p(paramArrayOfo, "pairs");
    int i = paramArrayOfo.length;
    for (int j = 0; j < i; j++)
    {
      o<? extends K, ? extends V> localo = paramArrayOfo[j];
      paramMap.put(localo.first, localo.second);
    }
    AppMethodBeat.o(56061);
  }

  public static final <K, V> Map<K, V> emptyMap()
  {
    AppMethodBeat.i(56059);
    Object localObject = w.AUQ;
    if (localObject == null)
    {
      localObject = new v("null cannot be cast to non-null type kotlin.collections.Map<K, V>");
      AppMethodBeat.o(56059);
      throw ((Throwable)localObject);
    }
    localObject = (Map)localObject;
    AppMethodBeat.o(56059);
    return localObject;
  }

  public static final <K, V> Map<K, V> v(Iterable<? extends o<? extends K, ? extends V>> paramIterable)
  {
    AppMethodBeat.i(56063);
    j.p(paramIterable, "receiver$0");
    if ((paramIterable instanceof Collection))
      switch (((Collection)paramIterable).size())
      {
      default:
        paramIterable = ad.a(paramIterable, (Map)new LinkedHashMap(ad.SI(((Collection)paramIterable).size())));
        AppMethodBeat.o(56063);
      case 0:
      case 1:
      }
    while (true)
    {
      return paramIterable;
      paramIterable = ad.emptyMap();
      AppMethodBeat.o(56063);
      continue;
      if ((paramIterable instanceof List));
      for (paramIterable = (o)((List)paramIterable).get(0); ; paramIterable = (o)paramIterable.iterator().next())
      {
        paramIterable = ad.a(paramIterable);
        AppMethodBeat.o(56063);
        break;
      }
      paramIterable = ad.a(paramIterable, (Map)new LinkedHashMap());
      j.p(paramIterable, "receiver$0");
      switch (paramIterable.size())
      {
      default:
        AppMethodBeat.o(56063);
        break;
      case 0:
        paramIterable = ad.emptyMap();
        AppMethodBeat.o(56063);
        break;
      case 1:
        j.p(paramIterable, "receiver$0");
        paramIterable = (Map.Entry)paramIterable.entrySet().iterator().next();
        paramIterable = Collections.singletonMap(paramIterable.getKey(), paramIterable.getValue());
        j.o(paramIterable, "java.util.Collections.singletonMap(key, value)");
        j.o(paramIterable, "with(entries.iterator().…ingletonMap(key, value) }");
        AppMethodBeat.o(56063);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     a.a.ag
 * JD-Core Version:    0.6.2
 */