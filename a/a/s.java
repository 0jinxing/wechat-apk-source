package a.a;

import a.f.b.j;
import a.l;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Collections;
import java.util.List;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"filterIsInstance", "", "R", "", "klass", "Ljava/lang/Class;", "filterIsInstanceTo", "C", "", "destination", "(Ljava/lang/Iterable;Ljava/util/Collection;Ljava/lang/Class;)Ljava/util/Collection;", "reverse", "", "T", "", "toSortedSet", "Ljava/util/SortedSet;", "", "comparator", "Ljava/util/Comparator;", "Lkotlin/Comparator;", "kotlin-stdlib"}, dWr=1)
class s extends r
{
  public static final <T> void reverse(List<T> paramList)
  {
    AppMethodBeat.i(56037);
    j.p(paramList, "receiver$0");
    Collections.reverse(paramList);
    AppMethodBeat.o(56037);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     a.a.s
 * JD-Core Version:    0.6.2
 */