package a.i.b.a.c.n;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.HashSet;
import java.util.Set;

public final class b$e<N>
  implements b.d<N>
{
  private final Set<N> BML;

  public b$e()
  {
    this(new HashSet());
    AppMethodBeat.i(122921);
    AppMethodBeat.o(122921);
  }

  private b$e(Set<N> paramSet)
  {
    this.BML = paramSet;
  }

  public final boolean dV(N paramN)
  {
    AppMethodBeat.i(122922);
    boolean bool = this.BML.add(paramN);
    AppMethodBeat.o(122922);
    return bool;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     a.i.b.a.c.n.b.e
 * JD-Core Version:    0.6.2
 */