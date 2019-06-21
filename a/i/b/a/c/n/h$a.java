package a.i.b.a.c.n;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Iterator;
import java.util.NoSuchElementException;

final class h$a<T>
  implements Iterator<T>
{
  private static final a BNq;

  static
  {
    AppMethodBeat.i(122950);
    BNq = new a();
    AppMethodBeat.o(122950);
  }

  public static <T> a<T> ekA()
  {
    return BNq;
  }

  public final boolean hasNext()
  {
    return false;
  }

  public final T next()
  {
    AppMethodBeat.i(122948);
    NoSuchElementException localNoSuchElementException = new NoSuchElementException();
    AppMethodBeat.o(122948);
    throw localNoSuchElementException;
  }

  public final void remove()
  {
    AppMethodBeat.i(122949);
    IllegalStateException localIllegalStateException = new IllegalStateException();
    AppMethodBeat.o(122949);
    throw localIllegalStateException;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     a.i.b.a.c.n.h.a
 * JD-Core Version:    0.6.2
 */