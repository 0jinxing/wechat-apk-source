package a.i.b.a.c.g;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.ListIterator;

final class x$1
  implements ListIterator<String>
{
  ListIterator<String> BAL;

  x$1(x paramx, int paramInt)
  {
    AppMethodBeat.i(121664);
    this.BAL = x.a(this.BAM).listIterator(this.val$index);
    AppMethodBeat.o(121664);
  }

  public final boolean hasNext()
  {
    AppMethodBeat.i(121665);
    boolean bool = this.BAL.hasNext();
    AppMethodBeat.o(121665);
    return bool;
  }

  public final boolean hasPrevious()
  {
    AppMethodBeat.i(121666);
    boolean bool = this.BAL.hasPrevious();
    AppMethodBeat.o(121666);
    return bool;
  }

  public final int nextIndex()
  {
    AppMethodBeat.i(121667);
    int i = this.BAL.nextIndex();
    AppMethodBeat.o(121667);
    return i;
  }

  public final int previousIndex()
  {
    AppMethodBeat.i(121668);
    int i = this.BAL.previousIndex();
    AppMethodBeat.o(121668);
    return i;
  }

  public final void remove()
  {
    AppMethodBeat.i(121669);
    UnsupportedOperationException localUnsupportedOperationException = new UnsupportedOperationException();
    AppMethodBeat.o(121669);
    throw localUnsupportedOperationException;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     a.i.b.a.c.g.x.1
 * JD-Core Version:    0.6.2
 */