package a.j;

import a.f.a.b;
import a.f.b.a.a;
import a.l;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Iterator;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"kotlin/sequences/TransformingSequence$iterator$1", "", "iterator", "getIterator", "()Ljava/util/Iterator;", "hasNext", "", "next", "()Ljava/lang/Object;", "kotlin-stdlib"})
public final class p$a
  implements a, Iterator<R>
{
  private final Iterator<T> AUT;

  p$a()
  {
    AppMethodBeat.i(55968);
    this.AUT = localObject.BOr.iterator();
    AppMethodBeat.o(55968);
  }

  public final boolean hasNext()
  {
    AppMethodBeat.i(55967);
    boolean bool = this.AUT.hasNext();
    AppMethodBeat.o(55967);
    return bool;
  }

  public final R next()
  {
    AppMethodBeat.i(55966);
    Object localObject = this.BOO.BOz.am(this.AUT.next());
    AppMethodBeat.o(55966);
    return localObject;
  }

  public final void remove()
  {
    AppMethodBeat.i(55969);
    UnsupportedOperationException localUnsupportedOperationException = new UnsupportedOperationException("Operation is not supported for read-only collection");
    AppMethodBeat.o(55969);
    throw localUnsupportedOperationException;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     a.j.p.a
 * JD-Core Version:    0.6.2
 */