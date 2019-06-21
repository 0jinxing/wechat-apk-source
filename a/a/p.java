package a.a;

import a.f.b.j;
import a.l;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"fill", "", "T", "", "value", "(Ljava/util/List;Ljava/lang/Object;)V", "shuffle", "random", "Ljava/util/Random;", "shuffled", "", "", "sort", "", "comparison", "Lkotlin/Function2;", "", "comparator", "Ljava/util/Comparator;", "Lkotlin/Comparator;", "sortWith", "kotlin-stdlib"}, dWr=1)
public class p extends o
{
  public static final <T> void a(List<T> paramList, Comparator<? super T> paramComparator)
  {
    AppMethodBeat.i(56155);
    j.p(paramList, "receiver$0");
    j.p(paramComparator, "comparator");
    if (paramList.size() > 1)
      Collections.sort(paramList, paramComparator);
    AppMethodBeat.o(56155);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     a.a.p
 * JD-Core Version:    0.6.2
 */