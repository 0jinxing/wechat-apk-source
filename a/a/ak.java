package a.a;

import a.f.b.j;
import a.l;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Collections;
import java.util.Set;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"setOf", "", "T", "element", "(Ljava/lang/Object;)Ljava/util/Set;", "sortedSetOf", "Ljava/util/TreeSet;", "elements", "", "([Ljava/lang/Object;)Ljava/util/TreeSet;", "comparator", "Ljava/util/Comparator;", "Lkotlin/Comparator;", "(Ljava/util/Comparator;[Ljava/lang/Object;)Ljava/util/TreeSet;", "kotlin-stdlib"}, dWr=1)
public class ak
{
  public static final <T> Set<T> setOf(T paramT)
  {
    AppMethodBeat.i(56072);
    paramT = Collections.singleton(paramT);
    j.o(paramT, "java.util.Collections.singleton(element)");
    AppMethodBeat.o(56072);
    return paramT;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     a.a.ak
 * JD-Core Version:    0.6.2
 */