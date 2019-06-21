package a.b;

import a.l;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Comparator;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lkotlin/comparisons/NaturalOrderComparator;", "Ljava/util/Comparator;", "", "", "Lkotlin/Comparator;", "()V", "compare", "", "a", "b", "reversed", "kotlin-stdlib"})
final class e
  implements Comparator<Comparable<? super Object>>
{
  public static final e AUV;

  static
  {
    AppMethodBeat.i(56017);
    AUV = new e();
    AppMethodBeat.o(56017);
  }

  public final Comparator<Comparable<Object>> reversed()
  {
    return (Comparator)f.AUW;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     a.b.e
 * JD-Core Version:    0.6.2
 */