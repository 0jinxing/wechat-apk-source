package a.a;

import a.f.b.a.a;
import a.l;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Iterator;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lkotlin/collections/IndexingIterator;", "T", "", "Lkotlin/collections/IndexedValue;", "iterator", "(Ljava/util/Iterator;)V", "index", "", "hasNext", "", "next", "kotlin-stdlib"})
public final class aa<T>
  implements a, Iterator<y<? extends T>>
{
  private final Iterator<T> AUT;
  private int index;

  public aa(Iterator<? extends T> paramIterator)
  {
    AppMethodBeat.i(56027);
    this.AUT = paramIterator;
    AppMethodBeat.o(56027);
  }

  public final boolean hasNext()
  {
    AppMethodBeat.i(56025);
    boolean bool = this.AUT.hasNext();
    AppMethodBeat.o(56025);
    return bool;
  }

  public final void remove()
  {
    AppMethodBeat.i(56028);
    UnsupportedOperationException localUnsupportedOperationException = new UnsupportedOperationException("Operation is not supported for read-only collection");
    AppMethodBeat.o(56028);
    throw localUnsupportedOperationException;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     a.a.aa
 * JD-Core Version:    0.6.2
 */