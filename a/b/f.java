package a.b;

import a.l;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Comparator;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lkotlin/comparisons/ReverseOrderComparator;", "Ljava/util/Comparator;", "", "", "Lkotlin/Comparator;", "()V", "compare", "", "a", "b", "reversed", "kotlin-stdlib"})
public final class f
  implements Comparator<Comparable<? super Object>>
{
  public static final f AUW;

  static
  {
    AppMethodBeat.i(56019);
    AUW = new f();
    AppMethodBeat.o(56019);
  }

  public final Comparator<Comparable<Object>> reversed()
  {
    return (Comparator)e.AUV;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     a.b.f
 * JD-Core Version:    0.6.2
 */