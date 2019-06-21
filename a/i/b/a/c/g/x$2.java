package a.i.b.a.c.g;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Iterator;

final class x$2
  implements Iterator<String>
{
  Iterator<String> BzK;

  x$2(x paramx)
  {
    AppMethodBeat.i(121674);
    this.BzK = x.a(this.BAM).iterator();
    AppMethodBeat.o(121674);
  }

  public final boolean hasNext()
  {
    AppMethodBeat.i(121675);
    boolean bool = this.BzK.hasNext();
    AppMethodBeat.o(121675);
    return bool;
  }

  public final void remove()
  {
    AppMethodBeat.i(121676);
    UnsupportedOperationException localUnsupportedOperationException = new UnsupportedOperationException();
    AppMethodBeat.o(121676);
    throw localUnsupportedOperationException;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     a.i.b.a.c.g.x.2
 * JD-Core Version:    0.6.2
 */