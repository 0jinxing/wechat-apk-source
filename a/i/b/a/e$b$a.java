package a.i.b.a;

import a.b.a;
import a.i.j;
import a.l;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Comparator;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"<anonymous>", "", "T", "a", "kotlin.jvm.PlatformType", "b", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "kotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2"})
public final class e$b$a<T>
  implements Comparator<T>
{
  public final int compare(T paramT1, T paramT2)
  {
    AppMethodBeat.i(118686);
    int i = a.a((Comparable)((j)paramT1).getName(), (Comparable)((j)paramT2).getName());
    AppMethodBeat.o(118686);
    return i;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     a.i.b.a.e.b.a
 * JD-Core Version:    0.6.2
 */