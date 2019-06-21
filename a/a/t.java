package a.a;

import a.f.a.a;
import a.f.a.b;
import a.f.b.k;
import a.h.e;
import a.j.h;
import a.k.m;
import a.l;
import a.o;
import a.u;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import java.util.Set;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"all", "", "T", "", "predicate", "Lkotlin/Function1;", "any", "asIterable", "asSequence", "Lkotlin/sequences/Sequence;", "associate", "", "K", "V", "transform", "Lkotlin/Pair;", "associateBy", "keySelector", "valueTransform", "associateByTo", "M", "", "destination", "(Ljava/lang/Iterable;Ljava/util/Map;Lkotlin/jvm/functions/Function1;)Ljava/util/Map;", "(Ljava/lang/Iterable;Ljava/util/Map;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Ljava/util/Map;", "associateTo", "associateWith", "valueSelector", "associateWithTo", "average", "", "", "averageOfByte", "averageOfDouble", "", "averageOfFloat", "", "averageOfInt", "", "averageOfLong", "", "averageOfShort", "chunked", "", "size", "R", "component1", "(Ljava/util/List;)Ljava/lang/Object;", "component2", "component3", "component4", "component5", "contains", "Lkotlin/internal/OnlyInputTypes;", "element", "(Ljava/lang/Iterable;Ljava/lang/Object;)Z", "count", "", "distinct", "distinctBy", "selector", "drop", "n", "dropLast", "dropLastWhile", "dropWhile", "elementAt", "index", "(Ljava/lang/Iterable;I)Ljava/lang/Object;", "(Ljava/util/List;I)Ljava/lang/Object;", "elementAtOrElse", "defaultValue", "(Ljava/lang/Iterable;ILkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "(Ljava/util/List;ILkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "elementAtOrNull", "filter", "filterIndexed", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "filterIndexedTo", "C", "", "(Ljava/lang/Iterable;Ljava/util/Collection;Lkotlin/jvm/functions/Function2;)Ljava/util/Collection;", "filterIsInstance", "Lkotlin/internal/NoInfer;", "filterIsInstanceTo", "(Ljava/lang/Iterable;Ljava/util/Collection;)Ljava/util/Collection;", "filterNot", "filterNotNull", "", "filterNotNullTo", "filterNotTo", "(Ljava/lang/Iterable;Ljava/util/Collection;Lkotlin/jvm/functions/Function1;)Ljava/util/Collection;", "filterTo", "find", "(Ljava/lang/Iterable;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "findLast", "(Ljava/util/List;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "first", "(Ljava/lang/Iterable;)Ljava/lang/Object;", "firstOrNull", "flatMap", "flatMapTo", "fold", "initial", "operation", "acc", "(Ljava/lang/Iterable;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "foldIndexed", "Lkotlin/Function3;", "(Ljava/lang/Iterable;Ljava/lang/Object;Lkotlin/jvm/functions/Function3;)Ljava/lang/Object;", "foldRight", "(Ljava/util/List;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "foldRightIndexed", "(Ljava/util/List;Ljava/lang/Object;Lkotlin/jvm/functions/Function3;)Ljava/lang/Object;", "forEach", "", "action", "forEachIndexed", "getOrElse", "getOrNull", "groupBy", "groupByTo", "", "groupingBy", "Lkotlin/collections/Grouping;", "indexOf", "(Ljava/lang/Iterable;Ljava/lang/Object;)I", "(Ljava/util/List;Ljava/lang/Object;)I", "indexOfFirst", "indexOfLast", "intersect", "", "other", "joinTo", "A", "Ljava/lang/Appendable;", "Lkotlin/text/Appendable;", "buffer", "separator", "", "prefix", "postfix", "limit", "truncated", "(Ljava/lang/Iterable;Ljava/lang/Appendable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lkotlin/jvm/functions/Function1;)Ljava/lang/Appendable;", "joinToString", "", "last", "lastIndexOf", "lastOrNull", "map", "mapIndexed", "mapIndexedNotNull", "mapIndexedNotNullTo", "mapIndexedTo", "mapNotNull", "mapNotNullTo", "mapTo", "max", "", "(Ljava/lang/Iterable;)Ljava/lang/Comparable;", "(Ljava/lang/Iterable;)Ljava/lang/Double;", "(Ljava/lang/Iterable;)Ljava/lang/Float;", "maxBy", "maxWith", "comparator", "Ljava/util/Comparator;", "Lkotlin/Comparator;", "(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/lang/Object;", "min", "minBy", "minWith", "minus", "(Ljava/lang/Iterable;Ljava/lang/Object;)Ljava/util/List;", "elements", "", "(Ljava/lang/Iterable;[Ljava/lang/Object;)Ljava/util/List;", "minusElement", "none", "onEach", "(Ljava/lang/Iterable;Lkotlin/jvm/functions/Function1;)Ljava/lang/Iterable;", "partition", "plus", "(Ljava/util/Collection;Ljava/lang/Object;)Ljava/util/List;", "(Ljava/util/Collection;[Ljava/lang/Object;)Ljava/util/List;", "plusElement", "random", "(Ljava/util/Collection;)Ljava/lang/Object;", "Lkotlin/random/Random;", "(Ljava/util/Collection;Lkotlin/random/Random;)Ljava/lang/Object;", "reduce", "S", "(Ljava/lang/Iterable;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "reduceIndexed", "(Ljava/lang/Iterable;Lkotlin/jvm/functions/Function3;)Ljava/lang/Object;", "reduceRight", "(Ljava/util/List;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "reduceRightIndexed", "(Ljava/util/List;Lkotlin/jvm/functions/Function3;)Ljava/lang/Object;", "requireNoNulls", "reversed", "single", "singleOrNull", "slice", "indices", "Lkotlin/ranges/IntRange;", "sortBy", "sortByDescending", "sortDescending", "sorted", "sortedBy", "sortedByDescending", "sortedDescending", "sortedWith", "subtract", "sum", "sumOfByte", "sumOfDouble", "sumOfFloat", "sumOfInt", "sumOfLong", "sumOfShort", "sumBy", "sumByDouble", "take", "takeLast", "takeLastWhile", "takeWhile", "toBooleanArray", "", "toByteArray", "", "toCharArray", "", "", "toCollection", "toDoubleArray", "", "toFloatArray", "", "toHashSet", "Ljava/util/HashSet;", "Lkotlin/collections/HashSet;", "toIntArray", "", "toList", "toLongArray", "", "toMutableList", "toMutableSet", "", "toSet", "toShortArray", "", "union", "windowed", "step", "partialWindows", "withIndex", "Lkotlin/collections/IndexedValue;", "zip", "a", "b", "(Ljava/lang/Iterable;[Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/util/List;", "zipWithNext", "kotlin-stdlib"}, dWr=1)
public class t extends s
{
  public static final <T, A extends Appendable> A a(Iterable<? extends T> paramIterable, A paramA, CharSequence paramCharSequence1, CharSequence paramCharSequence2, CharSequence paramCharSequence3, int paramInt, CharSequence paramCharSequence4, b<? super T, ? extends CharSequence> paramb)
  {
    AppMethodBeat.i(56112);
    a.f.b.j.p(paramIterable, "receiver$0");
    a.f.b.j.p(paramA, "buffer");
    a.f.b.j.p(paramCharSequence1, "separator");
    a.f.b.j.p(paramCharSequence2, "prefix");
    a.f.b.j.p(paramCharSequence3, "postfix");
    a.f.b.j.p(paramCharSequence4, "truncated");
    paramA.append(paramCharSequence2);
    int i = 0;
    paramCharSequence2 = paramIterable.iterator();
    int j;
    while (true)
    {
      j = i;
      if (!paramCharSequence2.hasNext())
        break;
      paramIterable = paramCharSequence2.next();
      i++;
      if (i > 1)
        paramA.append(paramCharSequence1);
      if (paramInt >= 0)
      {
        j = i;
        if (i > paramInt)
          break;
      }
      m.a(paramA, paramIterable, paramb);
    }
    if ((paramInt >= 0) && (j > paramInt))
      paramA.append(paramCharSequence4);
    paramA.append(paramCharSequence3);
    AppMethodBeat.o(56112);
    return paramA;
  }

  public static final <T> String a(Iterable<? extends T> paramIterable, CharSequence paramCharSequence1, CharSequence paramCharSequence2, CharSequence paramCharSequence3, int paramInt, CharSequence paramCharSequence4, b<? super T, ? extends CharSequence> paramb)
  {
    AppMethodBeat.i(56114);
    a.f.b.j.p(paramIterable, "receiver$0");
    a.f.b.j.p(paramCharSequence1, "separator");
    a.f.b.j.p(paramCharSequence2, "prefix");
    a.f.b.j.p(paramCharSequence3, "postfix");
    a.f.b.j.p(paramCharSequence4, "truncated");
    paramIterable = ((StringBuilder)j.a(paramIterable, (Appendable)new StringBuilder(), paramCharSequence1, paramCharSequence2, paramCharSequence3, paramInt, paramCharSequence4, paramb)).toString();
    a.f.b.j.o(paramIterable, "joinTo(StringBuilder(), …ed, transform).toString()");
    AppMethodBeat.o(56114);
    return paramIterable;
  }

  public static final <C extends Collection<? super T>, T> C a(Iterable<? extends T> paramIterable, C paramC)
  {
    AppMethodBeat.i(56092);
    a.f.b.j.p(paramIterable, "receiver$0");
    a.f.b.j.p(paramC, "destination");
    Iterator localIterator = paramIterable.iterator();
    while (localIterator.hasNext())
    {
      paramIterable = localIterator.next();
      if (paramIterable != null)
        paramC.add(paramIterable);
    }
    AppMethodBeat.o(56092);
    return paramC;
  }

  public static final <T> List<T> a(Iterable<? extends T> paramIterable, int paramInt)
  {
    int i = 0;
    AppMethodBeat.i(56093);
    a.f.b.j.p(paramIterable, "receiver$0");
    if (paramInt >= 0);
    for (int j = 1; j == 0; j = 0)
    {
      paramIterable = (Throwable)new IllegalArgumentException(("Requested element count " + paramInt + " is less than zero.").toString());
      AppMethodBeat.o(56093);
      throw paramIterable;
    }
    if (paramInt == 0)
    {
      paramIterable = (List)v.AUP;
      AppMethodBeat.o(56093);
    }
    while (true)
    {
      return paramIterable;
      if ((paramIterable instanceof Collection))
      {
        if (paramInt >= ((Collection)paramIterable).size())
        {
          paramIterable = j.m(paramIterable);
          AppMethodBeat.o(56093);
        }
        else if (paramInt == 1)
        {
          paramIterable = j.listOf(j.e(paramIterable));
          AppMethodBeat.o(56093);
        }
      }
      else
      {
        ArrayList localArrayList = new ArrayList(paramInt);
        Iterator localIterator = paramIterable.iterator();
        for (j = i; localIterator.hasNext(); j++)
        {
          paramIterable = localIterator.next();
          if (j == paramInt)
            break;
          localArrayList.add(paramIterable);
        }
        paramIterable = j.fI((List)localArrayList);
        AppMethodBeat.o(56093);
      }
    }
  }

  public static final <T, R> List<o<T, R>> a(Iterable<? extends T> paramIterable, Iterable<? extends R> paramIterable1)
  {
    AppMethodBeat.i(56111);
    a.f.b.j.p(paramIterable, "receiver$0");
    a.f.b.j.p(paramIterable1, "other");
    Iterator localIterator1 = paramIterable.iterator();
    Iterator localIterator2 = paramIterable1.iterator();
    paramIterable = new ArrayList(Math.min(j.d(paramIterable), j.d(paramIterable1)));
    while ((localIterator1.hasNext()) && (localIterator2.hasNext()))
      paramIterable.add(u.I(localIterator1.next(), localIterator2.next()));
    paramIterable = (List)paramIterable;
    AppMethodBeat.o(56111);
    return paramIterable;
  }

  public static final <T> List<T> a(Collection<? extends T> paramCollection, T paramT)
  {
    AppMethodBeat.i(56109);
    a.f.b.j.p(paramCollection, "receiver$0");
    ArrayList localArrayList = new ArrayList(paramCollection.size() + 1);
    localArrayList.addAll(paramCollection);
    localArrayList.add(paramT);
    paramCollection = (List)localArrayList;
    AppMethodBeat.o(56109);
    return paramCollection;
  }

  public static final <T> boolean a(Iterable<? extends T> paramIterable, T paramT)
  {
    AppMethodBeat.i(56074);
    a.f.b.j.p(paramIterable, "receiver$0");
    boolean bool;
    if ((paramIterable instanceof Collection))
    {
      bool = ((Collection)paramIterable).contains(paramT);
      AppMethodBeat.o(56074);
    }
    while (true)
    {
      return bool;
      if (j.b(paramIterable, paramT) >= 0)
      {
        bool = true;
        AppMethodBeat.o(56074);
      }
      else
      {
        bool = false;
        AppMethodBeat.o(56074);
      }
    }
  }

  public static final <T> int b(Iterable<? extends T> paramIterable, T paramT)
  {
    AppMethodBeat.i(56080);
    a.f.b.j.p(paramIterable, "receiver$0");
    int i;
    if ((paramIterable instanceof List))
    {
      i = ((List)paramIterable).indexOf(paramT);
      AppMethodBeat.o(56080);
    }
    while (true)
    {
      return i;
      i = 0;
      paramIterable = paramIterable.iterator();
      while (true)
      {
        if (!paramIterable.hasNext())
          break label94;
        Object localObject = paramIterable.next();
        if (i < 0)
          j.dWs();
        if (a.f.b.j.j(paramT, localObject))
        {
          AppMethodBeat.o(56080);
          break;
        }
        i++;
      }
      label94: i = -1;
      AppMethodBeat.o(56080);
    }
  }

  public static final <T, C extends Collection<? super T>> C b(Iterable<? extends T> paramIterable, C paramC)
  {
    AppMethodBeat.i(56097);
    a.f.b.j.p(paramIterable, "receiver$0");
    a.f.b.j.p(paramC, "destination");
    paramIterable = paramIterable.iterator();
    while (paramIterable.hasNext())
      paramC.add(paramIterable.next());
    AppMethodBeat.o(56097);
    return paramC;
  }

  public static final <T> List<T> b(Iterable<? extends T> paramIterable, b<? super T, Boolean> paramb)
  {
    AppMethodBeat.i(56090);
    a.f.b.j.p(paramIterable, "receiver$0");
    a.f.b.j.p(paramb, "predicate");
    Collection localCollection = (Collection)new ArrayList();
    paramIterable = paramIterable.iterator();
    while (paramIterable.hasNext())
    {
      Object localObject = paramIterable.next();
      if (((Boolean)paramb.am(localObject)).booleanValue())
        localCollection.add(localObject);
    }
    paramIterable = (List)localCollection;
    AppMethodBeat.o(56090);
    return paramIterable;
  }

  public static final <T> List<T> b(Collection<? extends T> paramCollection, Iterable<? extends T> paramIterable)
  {
    AppMethodBeat.i(56110);
    a.f.b.j.p(paramCollection, "receiver$0");
    a.f.b.j.p(paramIterable, "elements");
    if ((paramIterable instanceof Collection))
    {
      int i = paramCollection.size();
      ArrayList localArrayList = new ArrayList(((Collection)paramIterable).size() + i);
      localArrayList.addAll(paramCollection);
      localArrayList.addAll((Collection)paramIterable);
      paramCollection = (List)localArrayList;
      AppMethodBeat.o(56110);
    }
    while (true)
    {
      return paramCollection;
      paramCollection = new ArrayList(paramCollection);
      j.a((Collection)paramCollection, paramIterable);
      paramCollection = (List)paramCollection;
      AppMethodBeat.o(56110);
    }
  }

  public static final <T, R> List<R> c(Iterable<? extends T> paramIterable, b<? super T, ? extends R> paramb)
  {
    AppMethodBeat.i(56102);
    a.f.b.j.p(paramIterable, "receiver$0");
    a.f.b.j.p(paramb, "transform");
    Collection localCollection = (Collection)new ArrayList(j.d(paramIterable));
    paramIterable = paramIterable.iterator();
    while (paramIterable.hasNext())
      localCollection.add(paramb.am(paramIterable.next()));
    paramIterable = (List)localCollection;
    AppMethodBeat.o(56102);
    return paramIterable;
  }

  public static final <T> List<T> c(Iterable<? extends T> paramIterable, T paramT)
  {
    AppMethodBeat.i(56107);
    a.f.b.j.p(paramIterable, "receiver$0");
    ArrayList localArrayList = new ArrayList(j.d(paramIterable));
    paramIterable = paramIterable.iterator();
    int i = 0;
    label111: 
    while (true)
    {
      if (paramIterable.hasNext())
      {
        Object localObject = paramIterable.next();
        int j;
        if ((i == 0) && (a.f.b.j.j(localObject, paramT)))
        {
          j = 0;
          i = 1;
        }
        while (true)
        {
          if (j == 0)
            break label111;
          ((Collection)localArrayList).add(localObject);
          break;
          j = 1;
        }
      }
      paramIterable = (List)localArrayList;
      AppMethodBeat.o(56107);
      return paramIterable;
    }
  }

  public static final <T> List<T> d(Iterable<? extends T> paramIterable, T paramT)
  {
    AppMethodBeat.i(56108);
    a.f.b.j.p(paramIterable, "receiver$0");
    if ((paramIterable instanceof Collection))
    {
      paramIterable = j.a((Collection)paramIterable, paramT);
      AppMethodBeat.o(56108);
    }
    while (true)
    {
      return paramIterable;
      ArrayList localArrayList = new ArrayList();
      j.a((Collection)localArrayList, paramIterable);
      localArrayList.add(paramT);
      paramIterable = (List)localArrayList;
      AppMethodBeat.o(56108);
    }
  }

  public static final <T> T e(Iterable<? extends T> paramIterable)
  {
    AppMethodBeat.i(56075);
    a.f.b.j.p(paramIterable, "receiver$0");
    if ((paramIterable instanceof List))
    {
      paramIterable = j.fJ((List)paramIterable);
      AppMethodBeat.o(56075);
    }
    while (true)
    {
      return paramIterable;
      paramIterable = paramIterable.iterator();
      if (!paramIterable.hasNext())
      {
        paramIterable = (Throwable)new NoSuchElementException("Collection is empty.");
        AppMethodBeat.o(56075);
        throw paramIterable;
      }
      paramIterable = paramIterable.next();
      AppMethodBeat.o(56075);
    }
  }

  public static final <T> T f(Iterable<? extends T> paramIterable)
  {
    AppMethodBeat.i(56077);
    a.f.b.j.p(paramIterable, "receiver$0");
    if ((paramIterable instanceof List))
      if (((List)paramIterable).isEmpty())
      {
        AppMethodBeat.o(56077);
        paramIterable = null;
      }
    while (true)
    {
      return paramIterable;
      paramIterable = ((List)paramIterable).get(0);
      AppMethodBeat.o(56077);
      continue;
      paramIterable = paramIterable.iterator();
      if (!paramIterable.hasNext())
      {
        AppMethodBeat.o(56077);
        paramIterable = null;
      }
      else
      {
        paramIterable = paramIterable.next();
        AppMethodBeat.o(56077);
      }
    }
  }

  public static final <T> T fJ(List<? extends T> paramList)
  {
    AppMethodBeat.i(56076);
    a.f.b.j.p(paramList, "receiver$0");
    if (paramList.isEmpty())
    {
      paramList = (Throwable)new NoSuchElementException("List is empty.");
      AppMethodBeat.o(56076);
      throw paramList;
    }
    paramList = paramList.get(0);
    AppMethodBeat.o(56076);
    return paramList;
  }

  public static final <T> T fK(List<? extends T> paramList)
  {
    AppMethodBeat.i(56078);
    a.f.b.j.p(paramList, "receiver$0");
    if (paramList.isEmpty())
    {
      paramList = null;
      AppMethodBeat.o(56078);
    }
    while (true)
    {
      return paramList;
      paramList = paramList.get(0);
      AppMethodBeat.o(56078);
    }
  }

  public static final <T> T fL(List<? extends T> paramList)
  {
    AppMethodBeat.i(56082);
    a.f.b.j.p(paramList, "receiver$0");
    if (paramList.isEmpty())
    {
      paramList = (Throwable)new NoSuchElementException("List is empty.");
      AppMethodBeat.o(56082);
      throw paramList;
    }
    paramList = paramList.get(j.fH(paramList));
    AppMethodBeat.o(56082);
    return paramList;
  }

  public static final <T> T fM(List<? extends T> paramList)
  {
    AppMethodBeat.i(56083);
    a.f.b.j.p(paramList, "receiver$0");
    if (paramList.isEmpty())
    {
      paramList = null;
      AppMethodBeat.o(56083);
    }
    while (true)
    {
      return paramList;
      paramList = paramList.get(paramList.size() - 1);
      AppMethodBeat.o(56083);
    }
  }

  public static final <T> T fN(List<? extends T> paramList)
  {
    AppMethodBeat.i(56085);
    a.f.b.j.p(paramList, "receiver$0");
    switch (paramList.size())
    {
    default:
      paramList = (Throwable)new IllegalArgumentException("List has more than one element.");
      AppMethodBeat.o(56085);
      throw paramList;
    case 0:
      paramList = (Throwable)new NoSuchElementException("List is empty.");
      AppMethodBeat.o(56085);
      throw paramList;
    case 1:
    }
    paramList = paramList.get(0);
    AppMethodBeat.o(56085);
    return paramList;
  }

  public static final <T> T fO(List<? extends T> paramList)
  {
    AppMethodBeat.i(56087);
    a.f.b.j.p(paramList, "receiver$0");
    if (paramList.size() == 1)
    {
      paramList = paramList.get(0);
      AppMethodBeat.o(56087);
    }
    while (true)
    {
      return paramList;
      paramList = null;
      AppMethodBeat.o(56087);
    }
  }

  public static final <T> List<T> fP(List<? extends T> paramList)
  {
    AppMethodBeat.i(56089);
    a.f.b.j.p(paramList, "receiver$0");
    paramList = j.a((Iterable)paramList, e.im(paramList.size() - 1, 0));
    AppMethodBeat.o(56089);
    return paramList;
  }

  public static final <T> T g(Iterable<? extends T> paramIterable)
  {
    AppMethodBeat.i(56081);
    a.f.b.j.p(paramIterable, "receiver$0");
    if ((paramIterable instanceof List))
    {
      paramIterable = j.fL((List)paramIterable);
      AppMethodBeat.o(56081);
    }
    while (true)
    {
      return paramIterable;
      Iterator localIterator = paramIterable.iterator();
      if (!localIterator.hasNext())
      {
        paramIterable = (Throwable)new NoSuchElementException("Collection is empty.");
        AppMethodBeat.o(56081);
        throw paramIterable;
      }
      do
        paramIterable = localIterator.next();
      while (localIterator.hasNext());
      AppMethodBeat.o(56081);
    }
  }

  public static final <T> T h(Iterable<? extends T> paramIterable)
  {
    AppMethodBeat.i(56084);
    a.f.b.j.p(paramIterable, "receiver$0");
    if ((paramIterable instanceof List))
    {
      paramIterable = j.fN((List)paramIterable);
      AppMethodBeat.o(56084);
    }
    while (true)
    {
      return paramIterable;
      Iterator localIterator = paramIterable.iterator();
      if (!localIterator.hasNext())
      {
        paramIterable = (Throwable)new NoSuchElementException("Collection is empty.");
        AppMethodBeat.o(56084);
        throw paramIterable;
      }
      paramIterable = localIterator.next();
      if (localIterator.hasNext())
      {
        paramIterable = (Throwable)new IllegalArgumentException("Collection has more than one element.");
        AppMethodBeat.o(56084);
        throw paramIterable;
      }
      AppMethodBeat.o(56084);
    }
  }

  public static final int[] h(Collection<Integer> paramCollection)
  {
    AppMethodBeat.i(56096);
    a.f.b.j.p(paramCollection, "receiver$0");
    int[] arrayOfInt = new int[paramCollection.size()];
    paramCollection = paramCollection.iterator();
    for (int i = 0; paramCollection.hasNext(); i++)
      arrayOfInt[i] = ((Number)paramCollection.next()).intValue();
    AppMethodBeat.o(56096);
    return arrayOfInt;
  }

  public static final <T> T i(Iterable<? extends T> paramIterable)
  {
    AppMethodBeat.i(56086);
    a.f.b.j.p(paramIterable, "receiver$0");
    if ((paramIterable instanceof List))
      if (((List)paramIterable).size() == 1)
      {
        paramIterable = ((List)paramIterable).get(0);
        AppMethodBeat.o(56086);
      }
    while (true)
    {
      return paramIterable;
      AppMethodBeat.o(56086);
      paramIterable = null;
      continue;
      Iterator localIterator = paramIterable.iterator();
      if (!localIterator.hasNext())
      {
        AppMethodBeat.o(56086);
        paramIterable = null;
      }
      else
      {
        paramIterable = localIterator.next();
        if (localIterator.hasNext())
        {
          AppMethodBeat.o(56086);
          paramIterable = null;
        }
        else
        {
          AppMethodBeat.o(56086);
        }
      }
    }
  }

  public static final <T> List<T> i(Collection<? extends T> paramCollection)
  {
    AppMethodBeat.i(56100);
    a.f.b.j.p(paramCollection, "receiver$0");
    paramCollection = (List)new ArrayList(paramCollection);
    AppMethodBeat.o(56100);
    return paramCollection;
  }

  public static final <T> List<T> j(Iterable<? extends T> paramIterable)
  {
    int i = 1;
    AppMethodBeat.i(56088);
    a.f.b.j.p(paramIterable, "receiver$0");
    if ((paramIterable instanceof Collection))
    {
      int j = ((Collection)paramIterable).size() - 1;
      if (j <= 0)
      {
        paramIterable = (List)v.AUP;
        AppMethodBeat.o(56088);
      }
      while (true)
      {
        return paramIterable;
        if (j == 1)
        {
          paramIterable = j.listOf(j.g(paramIterable));
          AppMethodBeat.o(56088);
        }
        else
        {
          localArrayList = new ArrayList(j);
          if (!(paramIterable instanceof List))
            break;
          if ((paramIterable instanceof RandomAccess))
          {
            j = ((Collection)paramIterable).size();
            while (i < j)
            {
              localArrayList.add(((List)paramIterable).get(i));
              i++;
            }
          }
          paramIterable = (Iterator)((List)paramIterable).listIterator(1);
          while (paramIterable.hasNext())
            localArrayList.add(paramIterable.next());
          paramIterable = (List)localArrayList;
          AppMethodBeat.o(56088);
        }
      }
    }
    ArrayList localArrayList = new ArrayList();
    while (true)
    {
      i = 0;
      paramIterable = paramIterable.iterator();
      while (paramIterable.hasNext())
      {
        Object localObject = paramIterable.next();
        if (i > 0)
          localArrayList.add(localObject);
        i++;
      }
      paramIterable = j.fI((List)localArrayList);
      AppMethodBeat.o(56088);
      break;
    }
  }

  public static final <T> List<T> k(Iterable<? extends T> paramIterable)
  {
    AppMethodBeat.i(56091);
    a.f.b.j.p(paramIterable, "receiver$0");
    paramIterable = (List)j.a(paramIterable, (Collection)new ArrayList());
    AppMethodBeat.o(56091);
    return paramIterable;
  }

  public static final <T> List<T> l(Iterable<? extends T> paramIterable)
  {
    AppMethodBeat.i(56095);
    a.f.b.j.p(paramIterable, "receiver$0");
    if (((paramIterable instanceof Collection)) && (((Collection)paramIterable).size() <= 1))
    {
      paramIterable = j.m(paramIterable);
      AppMethodBeat.o(56095);
    }
    while (true)
    {
      return paramIterable;
      paramIterable = j.n(paramIterable);
      j.reverse(paramIterable);
      AppMethodBeat.o(56095);
    }
  }

  public static final <T> List<T> m(Iterable<? extends T> paramIterable)
  {
    AppMethodBeat.i(56098);
    a.f.b.j.p(paramIterable, "receiver$0");
    if ((paramIterable instanceof Collection))
      switch (((Collection)paramIterable).size())
      {
      default:
        paramIterable = j.i((Collection)paramIterable);
        AppMethodBeat.o(56098);
      case 0:
      case 1:
      }
    while (true)
    {
      return paramIterable;
      paramIterable = (List)v.AUP;
      AppMethodBeat.o(56098);
      continue;
      if ((paramIterable instanceof List));
      for (paramIterable = ((List)paramIterable).get(0); ; paramIterable = paramIterable.iterator().next())
      {
        paramIterable = j.listOf(paramIterable);
        AppMethodBeat.o(56098);
        break;
      }
      paramIterable = j.fI(j.n(paramIterable));
      AppMethodBeat.o(56098);
    }
  }

  public static final <T> List<T> n(Iterable<? extends T> paramIterable)
  {
    AppMethodBeat.i(56099);
    a.f.b.j.p(paramIterable, "receiver$0");
    if ((paramIterable instanceof Collection))
    {
      paramIterable = j.i((Collection)paramIterable);
      AppMethodBeat.o(56099);
    }
    while (true)
    {
      return paramIterable;
      paramIterable = (List)j.b(paramIterable, (Collection)new ArrayList());
      AppMethodBeat.o(56099);
    }
  }

  public static final <T> Set<T> o(Iterable<? extends T> paramIterable)
  {
    AppMethodBeat.i(56101);
    a.f.b.j.p(paramIterable, "receiver$0");
    if ((paramIterable instanceof Collection))
      switch (((Collection)paramIterable).size())
      {
      default:
        paramIterable = (Set)j.b(paramIterable, (Collection)new LinkedHashSet(ad.SI(((Collection)paramIterable).size())));
        AppMethodBeat.o(56101);
      case 0:
      case 1:
      }
    while (true)
    {
      return paramIterable;
      paramIterable = (Set)x.AUR;
      AppMethodBeat.o(56101);
      continue;
      if ((paramIterable instanceof List));
      for (paramIterable = ((List)paramIterable).get(0); ; paramIterable = paramIterable.iterator().next())
      {
        paramIterable = aj.setOf(paramIterable);
        AppMethodBeat.o(56101);
        break;
      }
      paramIterable = (Set)j.b(paramIterable, (Collection)new LinkedHashSet());
      a.f.b.j.p(paramIterable, "receiver$0");
      switch (paramIterable.size())
      {
      default:
        AppMethodBeat.o(56101);
        break;
      case 0:
        paramIterable = (Set)x.AUR;
        AppMethodBeat.o(56101);
        break;
      case 1:
        paramIterable = aj.setOf(paramIterable.iterator().next());
        AppMethodBeat.o(56101);
      }
    }
  }

  public static final <T> Iterable<y<T>> p(Iterable<? extends T> paramIterable)
  {
    AppMethodBeat.i(56103);
    a.f.b.j.p(paramIterable, "receiver$0");
    paramIterable = (Iterable)new z((a)new c(paramIterable));
    AppMethodBeat.o(56103);
    return paramIterable;
  }

  public static final <T> Set<T> q(Iterable<? extends T> paramIterable)
  {
    AppMethodBeat.i(56104);
    a.f.b.j.p(paramIterable, "receiver$0");
    if ((paramIterable instanceof Collection))
    {
      paramIterable = (Set)new LinkedHashSet((Collection)paramIterable);
      AppMethodBeat.o(56104);
    }
    while (true)
    {
      return paramIterable;
      paramIterable = (Set)j.b(paramIterable, (Collection)new LinkedHashSet());
      AppMethodBeat.o(56104);
    }
  }

  public static final <T extends Comparable<? super T>> T r(Iterable<? extends T> paramIterable)
  {
    AppMethodBeat.i(56105);
    a.f.b.j.p(paramIterable, "receiver$0");
    Iterator localIterator = paramIterable.iterator();
    if (!localIterator.hasNext())
    {
      paramIterable = null;
      AppMethodBeat.o(56105);
      return paramIterable;
    }
    paramIterable = (Comparable)localIterator.next();
    label49: if (localIterator.hasNext())
    {
      Comparable localComparable = (Comparable)localIterator.next();
      if (paramIterable.compareTo(localComparable) >= 0)
        break label92;
      paramIterable = localComparable;
    }
    label92: 
    while (true)
    {
      break label49;
      AppMethodBeat.o(56105);
      break;
    }
  }

  public static final <T extends Comparable<? super T>> T s(Iterable<? extends T> paramIterable)
  {
    AppMethodBeat.i(56106);
    a.f.b.j.p(paramIterable, "receiver$0");
    Iterator localIterator = paramIterable.iterator();
    if (!localIterator.hasNext())
    {
      paramIterable = null;
      AppMethodBeat.o(56106);
      return paramIterable;
    }
    paramIterable = (Comparable)localIterator.next();
    label49: if (localIterator.hasNext())
    {
      Comparable localComparable = (Comparable)localIterator.next();
      if (paramIterable.compareTo(localComparable) <= 0)
        break label92;
      paramIterable = localComparable;
    }
    label92: 
    while (true)
    {
      break label49;
      AppMethodBeat.o(56106);
      break;
    }
  }

  public static final <T> h<T> t(Iterable<? extends T> paramIterable)
  {
    AppMethodBeat.i(56116);
    a.f.b.j.p(paramIterable, "receiver$0");
    paramIterable = (h)new t.a(paramIterable);
    AppMethodBeat.o(56116);
    return paramIterable;
  }

  public static final int u(Iterable<Integer> paramIterable)
  {
    AppMethodBeat.i(56117);
    a.f.b.j.p(paramIterable, "receiver$0");
    paramIterable = paramIterable.iterator();
    for (int i = 0; paramIterable.hasNext(); i = ((Number)paramIterable.next()).intValue() + i);
    AppMethodBeat.o(56117);
    return i;
  }

  public static final <T> T x(List<? extends T> paramList, int paramInt)
  {
    AppMethodBeat.i(56079);
    a.f.b.j.p(paramList, "receiver$0");
    if ((paramInt >= 0) && (paramInt <= j.fH(paramList)))
    {
      paramList = paramList.get(paramInt);
      AppMethodBeat.o(56079);
    }
    while (true)
    {
      return paramList;
      paramList = null;
      AppMethodBeat.o(56079);
    }
  }

  public static final <T> List<T> y(List<? extends T> paramList, int paramInt)
  {
    AppMethodBeat.i(56094);
    a.f.b.j.p(paramList, "receiver$0");
    if (paramInt >= 0);
    for (int i = 1; i == 0; i = 0)
    {
      paramList = (Throwable)new IllegalArgumentException(("Requested element count " + paramInt + " is less than zero.").toString());
      AppMethodBeat.o(56094);
      throw paramList;
    }
    if (paramInt == 0)
    {
      paramList = (List)v.AUP;
      AppMethodBeat.o(56094);
    }
    while (true)
    {
      return paramList;
      i = paramList.size();
      if (paramInt >= i)
      {
        paramList = j.m((Iterable)paramList);
        AppMethodBeat.o(56094);
      }
      else if (paramInt == 1)
      {
        paramList = j.listOf(j.fL(paramList));
        AppMethodBeat.o(56094);
      }
      else
      {
        ArrayList localArrayList = new ArrayList(paramInt);
        if ((paramList instanceof RandomAccess))
          for (paramInt = i - paramInt; paramInt < i; paramInt++)
            localArrayList.add(paramList.get(paramInt));
        paramList = (Iterator)paramList.listIterator(i - paramInt);
        while (paramList.hasNext())
          localArrayList.add(paramList.next());
        paramList = (List)localArrayList;
        AppMethodBeat.o(56094);
      }
    }
  }

  @l(dWo={1, 1, 13}, dWp={""}, dWq={"<anonymous>", "", "T", "invoke"})
  static final class c extends k
    implements a<Iterator<? extends T>>
  {
    c(Iterable paramIterable)
    {
      super();
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     a.a.t
 * JD-Core Version:    0.6.2
 */