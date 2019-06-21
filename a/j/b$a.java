package a.j;

import a.f.b.a.a;
import a.l;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Iterator;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"kotlin/sequences/DropSequence$iterator$1", "", "iterator", "getIterator", "()Ljava/util/Iterator;", "left", "", "getLeft", "()I", "setLeft", "(I)V", "drop", "", "hasNext", "", "next", "()Ljava/lang/Object;", "kotlin-stdlib"})
public final class b$a
  implements a, Iterator<T>
{
  private final Iterator<T> AUT;
  private int left;

  b$a()
  {
    AppMethodBeat.i(55963);
    this.AUT = localObject.BOr.iterator();
    this.left = localObject.count;
    AppMethodBeat.o(55963);
  }

  private final void drop()
  {
    AppMethodBeat.i(55960);
    while ((this.left > 0) && (this.AUT.hasNext()))
    {
      this.AUT.next();
      this.left -= 1;
    }
    AppMethodBeat.o(55960);
  }

  public final boolean hasNext()
  {
    AppMethodBeat.i(55962);
    drop();
    boolean bool = this.AUT.hasNext();
    AppMethodBeat.o(55962);
    return bool;
  }

  public final T next()
  {
    AppMethodBeat.i(55961);
    drop();
    Object localObject = this.AUT.next();
    AppMethodBeat.o(55961);
    return localObject;
  }

  public final void remove()
  {
    AppMethodBeat.i(55964);
    UnsupportedOperationException localUnsupportedOperationException = new UnsupportedOperationException("Operation is not supported for read-only collection");
    AppMethodBeat.o(55964);
    throw localUnsupportedOperationException;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     a.j.b.a
 * JD-Core Version:    0.6.2
 */