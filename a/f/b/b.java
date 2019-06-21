package a.f.b;

import a.l;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Iterator;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"iterator", "", "T", "array", "", "([Ljava/lang/Object;)Ljava/util/Iterator;", "kotlin-stdlib"})
public final class b
{
  public static final <T> Iterator<T> V(T[] paramArrayOfT)
  {
    AppMethodBeat.i(56232);
    j.p(paramArrayOfT, "array");
    paramArrayOfT = (Iterator)new a(paramArrayOfT);
    AppMethodBeat.o(56232);
    return paramArrayOfT;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     a.f.b.b
 * JD-Core Version:    0.6.2
 */