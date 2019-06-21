package a.a;

import a.f.b.j;
import a.l;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Set;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"emptySet", "", "T", "hashSetOf", "Ljava/util/HashSet;", "Lkotlin/collections/HashSet;", "elements", "", "([Ljava/lang/Object;)Ljava/util/HashSet;", "linkedSetOf", "Ljava/util/LinkedHashSet;", "Lkotlin/collections/LinkedHashSet;", "([Ljava/lang/Object;)Ljava/util/LinkedHashSet;", "mutableSetOf", "", "([Ljava/lang/Object;)Ljava/util/Set;", "setOf", "optimizeReadOnlySet", "orEmpty", "kotlin-stdlib"}, dWr=1)
public class al extends ak
{
  public static final <T> Set<T> setOf(T[] paramArrayOfT)
  {
    AppMethodBeat.i(56188);
    j.p(paramArrayOfT, "elements");
    if (paramArrayOfT.length > 0)
    {
      paramArrayOfT = e.R(paramArrayOfT);
      AppMethodBeat.o(56188);
    }
    while (true)
    {
      return paramArrayOfT;
      paramArrayOfT = (Set)x.AUR;
      AppMethodBeat.o(56188);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     a.a.al
 * JD-Core Version:    0.6.2
 */