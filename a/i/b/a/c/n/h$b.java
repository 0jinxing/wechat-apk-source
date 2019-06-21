package a.i.b.a.c.n;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.ConcurrentModificationException;

final class h$b extends h.c<E>
{
  private final int BNr;

  public h$b(h paramh)
  {
    super((byte)0);
    AppMethodBeat.i(122951);
    this.BNr = h.a(paramh);
    AppMethodBeat.o(122951);
  }

  protected final E ekB()
  {
    AppMethodBeat.i(122952);
    Object localObject = h.b(this.BNs);
    AppMethodBeat.o(122952);
    return localObject;
  }

  protected final void ekC()
  {
    AppMethodBeat.i(122953);
    if (h.c(this.BNs) != this.BNr)
    {
      ConcurrentModificationException localConcurrentModificationException = new ConcurrentModificationException("ModCount: " + h.d(this.BNs) + "; expected: " + this.BNr);
      AppMethodBeat.o(122953);
      throw localConcurrentModificationException;
    }
    AppMethodBeat.o(122953);
  }

  public final void remove()
  {
    AppMethodBeat.i(122954);
    ekC();
    this.BNs.clear();
    AppMethodBeat.o(122954);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     a.i.b.a.c.n.h.b
 * JD-Core Version:    0.6.2
 */