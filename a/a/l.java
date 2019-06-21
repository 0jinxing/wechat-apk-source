package a.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@a.l(dWo={1, 1, 13}, dWp={""}, dWq={"indices", "Lkotlin/ranges/IntRange;", "", "getIndices", "(Ljava/util/Collection;)Lkotlin/ranges/IntRange;", "lastIndex", "", "T", "", "getLastIndex", "(Ljava/util/List;)I", "List", "size", "init", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "index", "MutableList", "", "arrayListOf", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "elements", "", "([Ljava/lang/Object;)Ljava/util/ArrayList;", "emptyList", "listOf", "([Ljava/lang/Object;)Ljava/util/List;", "listOfNotNull", "", "element", "(Ljava/lang/Object;)Ljava/util/List;", "mutableListOf", "rangeCheck", "", "fromIndex", "toIndex", "rangeCheck$CollectionsKt__CollectionsKt", "throwCountOverflow", "throwIndexOverflow", "asCollection", "([Ljava/lang/Object;)Ljava/util/Collection;", "binarySearch", "comparator", "Ljava/util/Comparator;", "Lkotlin/Comparator;", "(Ljava/util/List;Ljava/lang/Object;Ljava/util/Comparator;II)I", "comparison", "", "(Ljava/util/List;Ljava/lang/Comparable;II)I", "binarySearchBy", "K", "key", "selector", "(Ljava/util/List;Ljava/lang/Comparable;IILkotlin/jvm/functions/Function1;)I", "containsAll", "", "Lkotlin/internal/OnlyInputTypes;", "ifEmpty", "R", "C", "defaultValue", "Lkotlin/Function0;", "(Ljava/util/Collection;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "isNotEmpty", "isNullOrEmpty", "optimizeReadOnlyList", "orEmpty", "kotlin-stdlib"}, dWr=1)
public class l extends k
{
  public static final <T> ArrayList<T> U(T[] paramArrayOfT)
  {
    AppMethodBeat.i(56208);
    a.f.b.j.p(paramArrayOfT, "elements");
    if (paramArrayOfT.length == 0)
    {
      paramArrayOfT = new ArrayList();
      AppMethodBeat.o(56208);
    }
    while (true)
    {
      return paramArrayOfT;
      paramArrayOfT = new ArrayList((Collection)new d(paramArrayOfT, true));
      AppMethodBeat.o(56208);
    }
  }

  public static final void dWs()
  {
    AppMethodBeat.i(56213);
    Throwable localThrowable = (Throwable)new ArithmeticException("Index overflow has happened.");
    AppMethodBeat.o(56213);
    throw localThrowable;
  }

  public static final void dWt()
  {
    AppMethodBeat.i(56214);
    Throwable localThrowable = (Throwable)new ArithmeticException("Count overflow has happened.");
    AppMethodBeat.o(56214);
    throw localThrowable;
  }

  public static final <T> List<T> dm(T paramT)
  {
    AppMethodBeat.i(56209);
    if (paramT != null)
    {
      paramT = j.listOf(paramT);
      AppMethodBeat.o(56209);
    }
    while (true)
    {
      return paramT;
      paramT = (List)v.AUP;
      AppMethodBeat.o(56209);
    }
  }

  public static final <T> int fH(List<? extends T> paramList)
  {
    AppMethodBeat.i(56211);
    a.f.b.j.p(paramList, "receiver$0");
    int i = paramList.size();
    AppMethodBeat.o(56211);
    return i - 1;
  }

  public static final <T> List<T> fI(List<? extends T> paramList)
  {
    AppMethodBeat.i(56212);
    a.f.b.j.p(paramList, "receiver$0");
    switch (paramList.size())
    {
    default:
      AppMethodBeat.o(56212);
    case 0:
    case 1:
    }
    while (true)
    {
      return paramList;
      paramList = (List)v.AUP;
      AppMethodBeat.o(56212);
      continue;
      paramList = j.listOf(paramList.get(0));
      AppMethodBeat.o(56212);
    }
  }

  public static final a.h.d g(Collection<?> paramCollection)
  {
    AppMethodBeat.i(56210);
    a.f.b.j.p(paramCollection, "receiver$0");
    paramCollection = new a.h.d(0, paramCollection.size() - 1);
    AppMethodBeat.o(56210);
    return paramCollection;
  }

  public static final <T> List<T> listOf(T[] paramArrayOfT)
  {
    AppMethodBeat.i(56207);
    a.f.b.j.p(paramArrayOfT, "elements");
    if (paramArrayOfT.length > 0)
    {
      paramArrayOfT = e.asList(paramArrayOfT);
      AppMethodBeat.o(56207);
    }
    while (true)
    {
      return paramArrayOfT;
      paramArrayOfT = (List)v.AUP;
      AppMethodBeat.o(56207);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     a.a.l
 * JD-Core Version:    0.6.2
 */