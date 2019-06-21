package a.i.b.a.c.b.a;

import a.f.b.j;
import a.i.b.a.c.f.b;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Iterator;
import java.util.List;

public final class h
  implements g
{
  private final List<c> BfM;

  public h(List<? extends c> paramList)
  {
    AppMethodBeat.i(119339);
    this.BfM = paramList;
    AppMethodBeat.o(119339);
  }

  public final c i(b paramb)
  {
    AppMethodBeat.i(119340);
    j.p(paramb, "fqName");
    paramb = g.b.a(this, paramb);
    AppMethodBeat.o(119340);
    return paramb;
  }

  public final boolean isEmpty()
  {
    AppMethodBeat.i(119336);
    boolean bool = this.BfM.isEmpty();
    AppMethodBeat.o(119336);
    return bool;
  }

  public final Iterator<c> iterator()
  {
    AppMethodBeat.i(119337);
    Iterator localIterator = this.BfM.iterator();
    AppMethodBeat.o(119337);
    return localIterator;
  }

  public final boolean j(b paramb)
  {
    AppMethodBeat.i(119341);
    j.p(paramb, "fqName");
    boolean bool = g.b.b(this, paramb);
    AppMethodBeat.o(119341);
    return bool;
  }

  public final String toString()
  {
    AppMethodBeat.i(119338);
    String str = this.BfM.toString();
    AppMethodBeat.o(119338);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     a.i.b.a.c.b.a.h
 * JD-Core Version:    0.6.2
 */