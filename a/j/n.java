package a.j;

import a.f.a.b;
import a.f.b.k;
import a.l;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"all", "", "T", "Lkotlin/sequences/Sequence;", "predicate", "Lkotlin/Function1;", "any", "asIterable", "", "asSequence", "associate", "", "K", "V", "transform", "Lkotlin/Pair;", "associateBy", "keySelector", "valueTransform", "associateByTo", "M", "", "destination", "(Lkotlin/sequences/Sequence;Ljava/util/Map;Lkotlin/jvm/functions/Function1;)Ljava/util/Map;", "(Lkotlin/sequences/Sequence;Ljava/util/Map;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Ljava/util/Map;", "associateTo", "associateWith", "valueSelector", "associateWithTo", "average", "", "", "averageOfByte", "averageOfDouble", "", "averageOfFloat", "", "averageOfInt", "", "averageOfLong", "", "averageOfShort", "chunked", "", "size", "R", "contains", "Lkotlin/internal/OnlyInputTypes;", "element", "(Lkotlin/sequences/Sequence;Ljava/lang/Object;)Z", "count", "distinct", "distinctBy", "selector", "drop", "n", "dropWhile", "elementAt", "index", "(Lkotlin/sequences/Sequence;I)Ljava/lang/Object;", "elementAtOrElse", "defaultValue", "(Lkotlin/sequences/Sequence;ILkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "elementAtOrNull", "filter", "filterIndexed", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "filterIndexedTo", "C", "", "(Lkotlin/sequences/Sequence;Ljava/util/Collection;Lkotlin/jvm/functions/Function2;)Ljava/util/Collection;", "filterIsInstance", "Lkotlin/internal/NoInfer;", "filterIsInstanceTo", "(Lkotlin/sequences/Sequence;Ljava/util/Collection;)Ljava/util/Collection;", "filterNot", "filterNotNull", "", "filterNotNullTo", "filterNotTo", "(Lkotlin/sequences/Sequence;Ljava/util/Collection;Lkotlin/jvm/functions/Function1;)Ljava/util/Collection;", "filterTo", "find", "(Lkotlin/sequences/Sequence;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "findLast", "first", "(Lkotlin/sequences/Sequence;)Ljava/lang/Object;", "firstOrNull", "flatMap", "flatMapTo", "fold", "initial", "operation", "acc", "(Lkotlin/sequences/Sequence;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "foldIndexed", "Lkotlin/Function3;", "(Lkotlin/sequences/Sequence;Ljava/lang/Object;Lkotlin/jvm/functions/Function3;)Ljava/lang/Object;", "forEach", "", "action", "forEachIndexed", "groupBy", "groupByTo", "", "groupingBy", "Lkotlin/collections/Grouping;", "indexOf", "(Lkotlin/sequences/Sequence;Ljava/lang/Object;)I", "indexOfFirst", "indexOfLast", "joinTo", "A", "Ljava/lang/Appendable;", "Lkotlin/text/Appendable;", "buffer", "separator", "", "prefix", "postfix", "limit", "truncated", "(Lkotlin/sequences/Sequence;Ljava/lang/Appendable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lkotlin/jvm/functions/Function1;)Ljava/lang/Appendable;", "joinToString", "", "last", "lastIndexOf", "lastOrNull", "map", "mapIndexed", "mapIndexedNotNull", "mapIndexedNotNullTo", "mapIndexedTo", "mapNotNull", "mapNotNullTo", "mapTo", "max", "", "(Lkotlin/sequences/Sequence;)Ljava/lang/Comparable;", "(Lkotlin/sequences/Sequence;)Ljava/lang/Double;", "(Lkotlin/sequences/Sequence;)Ljava/lang/Float;", "maxBy", "maxWith", "comparator", "Ljava/util/Comparator;", "Lkotlin/Comparator;", "(Lkotlin/sequences/Sequence;Ljava/util/Comparator;)Ljava/lang/Object;", "min", "minBy", "minWith", "minus", "(Lkotlin/sequences/Sequence;Ljava/lang/Object;)Lkotlin/sequences/Sequence;", "elements", "", "(Lkotlin/sequences/Sequence;[Ljava/lang/Object;)Lkotlin/sequences/Sequence;", "minusElement", "none", "onEach", "partition", "plus", "plusElement", "reduce", "S", "(Lkotlin/sequences/Sequence;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "reduceIndexed", "(Lkotlin/sequences/Sequence;Lkotlin/jvm/functions/Function3;)Ljava/lang/Object;", "requireNoNulls", "single", "singleOrNull", "sorted", "sortedBy", "sortedByDescending", "sortedDescending", "sortedWith", "sum", "sumOfByte", "sumOfDouble", "sumOfFloat", "sumOfInt", "sumOfLong", "sumOfShort", "sumBy", "sumByDouble", "take", "takeWhile", "toCollection", "toHashSet", "Ljava/util/HashSet;", "Lkotlin/collections/HashSet;", "toList", "toMutableList", "toMutableSet", "", "toSet", "", "windowed", "step", "partialWindows", "withIndex", "Lkotlin/collections/IndexedValue;", "zip", "other", "a", "b", "zipWithNext", "kotlin-stdlib"}, dWr=1)
public class n extends m
{
  public static final <T> h<T> a(h<? extends T> paramh, b<? super T, Boolean> paramb)
  {
    AppMethodBeat.i(55938);
    a.f.b.j.p(paramh, "receiver$0");
    a.f.b.j.p(paramb, "predicate");
    paramh = (h)new e(paramh, true, paramb);
    AppMethodBeat.o(55938);
    return paramh;
  }

  public static final <T, A extends Appendable> A a(h<? extends T> paramh, A paramA, CharSequence paramCharSequence1, CharSequence paramCharSequence2, CharSequence paramCharSequence3, CharSequence paramCharSequence4)
  {
    AppMethodBeat.i(55948);
    a.f.b.j.p(paramh, "receiver$0");
    a.f.b.j.p(paramA, "buffer");
    a.f.b.j.p(paramCharSequence1, "separator");
    a.f.b.j.p(paramCharSequence2, "prefix");
    a.f.b.j.p(paramCharSequence3, "postfix");
    a.f.b.j.p(paramCharSequence4, "truncated");
    paramA.append(paramCharSequence2);
    int i = 0;
    paramCharSequence2 = paramh.iterator();
    while (paramCharSequence2.hasNext())
    {
      paramh = paramCharSequence2.next();
      i++;
      if (i > 1)
        paramA.append(paramCharSequence1);
      a.k.m.a(paramA, paramh, null);
    }
    paramA.append(paramCharSequence3);
    AppMethodBeat.o(55948);
    return paramA;
  }

  public static final <T, C extends Collection<? super T>> C a(h<? extends T> paramh, C paramC)
  {
    AppMethodBeat.i(55941);
    a.f.b.j.p(paramh, "receiver$0");
    a.f.b.j.p(paramC, "destination");
    paramh = paramh.iterator();
    while (paramh.hasNext())
      paramC.add(paramh.next());
    AppMethodBeat.o(55941);
    return paramC;
  }

  public static final <T> h<T> b(h<? extends T> paramh)
  {
    AppMethodBeat.i(55940);
    a.f.b.j.p(paramh, "receiver$0");
    paramh = i.b(paramh, (b)n.b.BOL);
    AppMethodBeat.o(55940);
    return paramh;
  }

  public static final <T> h<T> b(h<? extends T> paramh, b<? super T, Boolean> paramb)
  {
    AppMethodBeat.i(55939);
    a.f.b.j.p(paramh, "receiver$0");
    a.f.b.j.p(paramb, "predicate");
    paramh = (h)new e(paramh, false, paramb);
    AppMethodBeat.o(55939);
    return paramh;
  }

  public static final <T, R> h<R> c(h<? extends T> paramh, b<? super T, ? extends h<? extends R>> paramb)
  {
    AppMethodBeat.i(55944);
    a.f.b.j.p(paramh, "receiver$0");
    a.f.b.j.p(paramb, "transform");
    paramh = (h)new f(paramh, paramb, (b)c.BOM);
    AppMethodBeat.o(55944);
    return paramh;
  }

  public static final <T> List<T> c(h<? extends T> paramh)
  {
    AppMethodBeat.i(55942);
    a.f.b.j.p(paramh, "receiver$0");
    paramh = a.a.j.fI(i.d(paramh));
    AppMethodBeat.o(55942);
    return paramh;
  }

  public static final <T, R> h<R> d(h<? extends T> paramh, b<? super T, ? extends R> paramb)
  {
    AppMethodBeat.i(55945);
    a.f.b.j.p(paramh, "receiver$0");
    a.f.b.j.p(paramb, "transform");
    paramh = (h)new p(paramh, paramb);
    AppMethodBeat.o(55945);
    return paramh;
  }

  public static final <T> List<T> d(h<? extends T> paramh)
  {
    AppMethodBeat.i(55943);
    a.f.b.j.p(paramh, "receiver$0");
    paramh = (List)i.a(paramh, (Collection)new ArrayList());
    AppMethodBeat.o(55943);
    return paramh;
  }

  public static final <T> int e(h<? extends T> paramh)
  {
    AppMethodBeat.i(55947);
    a.f.b.j.p(paramh, "receiver$0");
    int i = 0;
    paramh = paramh.iterator();
    while (paramh.hasNext())
    {
      paramh.next();
      int j = i + 1;
      i = j;
      if (j < 0)
      {
        a.a.j.dWt();
        i = j;
      }
    }
    AppMethodBeat.o(55947);
    return i;
  }

  public static final <T, R> h<R> e(h<? extends T> paramh, b<? super T, ? extends R> paramb)
  {
    AppMethodBeat.i(55946);
    a.f.b.j.p(paramh, "receiver$0");
    a.f.b.j.p(paramb, "transform");
    paramh = i.b((h)new p(paramh, paramb));
    AppMethodBeat.o(55946);
    return paramh;
  }

  public static final <T> Iterable<T> f(h<? extends T> paramh)
  {
    AppMethodBeat.i(55950);
    a.f.b.j.p(paramh, "receiver$0");
    paramh = (Iterable)new n.a(paramh);
    AppMethodBeat.o(55950);
    return paramh;
  }

  @l(dWo={1, 1, 13}, dWp={""}, dWq={"<anonymous>", "", "R", "T", "it", "Lkotlin/sequences/Sequence;", "invoke"})
  static final class c extends k
    implements b<h<? extends R>, Iterator<? extends R>>
  {
    public static final c BOM;

    static
    {
      AppMethodBeat.i(55978);
      BOM = new c();
      AppMethodBeat.o(55978);
    }

    c()
    {
      super();
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     a.j.n
 * JD-Core Version:    0.6.2
 */