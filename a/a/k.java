package a.a;

import a.f.b.j;
import a.l;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Collections;
import java.util.List;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"checkCountOverflow", "", "count", "checkIndexOverflow", "index", "copyToArrayImpl", "", "", "collection", "", "(Ljava/util/Collection;)[Ljava/lang/Object;", "T", "array", "(Ljava/util/Collection;[Ljava/lang/Object;)[Ljava/lang/Object;", "listOf", "", "element", "(Ljava/lang/Object;)Ljava/util/List;", "copyToArrayOfAny", "isVarargs", "", "([Ljava/lang/Object;Z)[Ljava/lang/Object;", "toList", "Ljava/util/Enumeration;", "kotlin-stdlib"}, dWr=1)
public class k
{
  public static final <T> List<T> listOf(T paramT)
  {
    AppMethodBeat.i(56071);
    paramT = Collections.singletonList(paramT);
    j.o(paramT, "java.util.Collections.singletonList(element)");
    AppMethodBeat.o(56071);
    return paramT;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     a.a.k
 * JD-Core Version:    0.6.2
 */