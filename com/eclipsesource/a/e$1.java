package com.eclipsesource.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Iterator;

final class e$1
  implements Iterator<e.b>
{
  e$1(e parame, Iterator paramIterator1, Iterator paramIterator2)
  {
  }

  public final boolean hasNext()
  {
    AppMethodBeat.i(70530);
    boolean bool = this.aLs.hasNext();
    AppMethodBeat.o(70530);
    return bool;
  }

  public final void remove()
  {
    AppMethodBeat.i(70531);
    UnsupportedOperationException localUnsupportedOperationException = new UnsupportedOperationException();
    AppMethodBeat.o(70531);
    throw localUnsupportedOperationException;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.eclipsesource.a.e.1
 * JD-Core Version:    0.6.2
 */