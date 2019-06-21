package a.i.b.a.c.g;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

public final class x extends AbstractList<String>
  implements o, RandomAccess
{
  private final o BAK;

  public x(o paramo)
  {
    this.BAK = paramo;
  }

  public final d UC(int paramInt)
  {
    AppMethodBeat.i(121679);
    d locald = this.BAK.UC(paramInt);
    AppMethodBeat.o(121679);
    return locald;
  }

  public final void e(d paramd)
  {
    AppMethodBeat.i(121680);
    paramd = new UnsupportedOperationException();
    AppMethodBeat.o(121680);
    throw paramd;
  }

  public final o eiA()
  {
    return this;
  }

  public final List<?> eiz()
  {
    AppMethodBeat.i(121683);
    List localList = this.BAK.eiz();
    AppMethodBeat.o(121683);
    return localList;
  }

  public final Iterator<String> iterator()
  {
    AppMethodBeat.i(121682);
    x.2 local2 = new x.2(this);
    AppMethodBeat.o(121682);
    return local2;
  }

  public final ListIterator<String> listIterator(int paramInt)
  {
    AppMethodBeat.i(121681);
    x.1 local1 = new x.1(this, paramInt);
    AppMethodBeat.o(121681);
    return local1;
  }

  public final int size()
  {
    AppMethodBeat.i(121678);
    int i = this.BAK.size();
    AppMethodBeat.o(121678);
    return i;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     a.i.b.a.c.g.x
 * JD-Core Version:    0.6.2
 */