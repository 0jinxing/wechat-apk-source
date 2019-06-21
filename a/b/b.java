package a.b;

import a.l;
import com.tencent.matrix.trace.core.AppMethodBeat;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"compareBy", "Ljava/util/Comparator;", "T", "Lkotlin/Comparator;", "selector", "Lkotlin/Function1;", "", "selectors", "", "([Lkotlin/jvm/functions/Function1;)Ljava/util/Comparator;", "K", "comparator", "compareByDescending", "compareValues", "", "a", "b", "(Ljava/lang/Comparable;Ljava/lang/Comparable;)I", "compareValuesBy", "(Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)I", "(Ljava/lang/Object;Ljava/lang/Object;[Lkotlin/jvm/functions/Function1;)I", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/Comparator;Lkotlin/jvm/functions/Function1;)I", "compareValuesByImpl", "compareValuesByImpl$ComparisonsKt__ComparisonsKt", "naturalOrder", "nullsFirst", "", "nullsLast", "reverseOrder", "reversed", "then", "thenBy", "thenByDescending", "thenComparator", "comparison", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "thenDescending", "kotlin-stdlib"}, dWr=1)
public class b
{
  public static final <T extends Comparable<?>> int a(T paramT1, T paramT2)
  {
    AppMethodBeat.i(56020);
    int i;
    if (paramT1 == paramT2)
    {
      i = 0;
      AppMethodBeat.o(56020);
    }
    while (true)
    {
      return i;
      if (paramT1 == null)
      {
        i = -1;
        AppMethodBeat.o(56020);
      }
      else if (paramT2 == null)
      {
        i = 1;
        AppMethodBeat.o(56020);
      }
      else
      {
        i = paramT1.compareTo(paramT2);
        AppMethodBeat.o(56020);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     a.b.b
 * JD-Core Version:    0.6.2
 */