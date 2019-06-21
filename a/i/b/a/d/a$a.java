package a.i.b.a.d;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Iterator;

final class a$a<E>
  implements Iterator<E>
{
  private a<E> BNA;

  public a$a(a<E> parama)
  {
    this.BNA = parama;
  }

  public final boolean hasNext()
  {
    AppMethodBeat.i(122979);
    boolean bool;
    if (a.a(this.BNA) > 0)
    {
      bool = true;
      AppMethodBeat.o(122979);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(122979);
    }
  }

  public final E next()
  {
    Object localObject = this.BNA.first;
    this.BNA = this.BNA.BNz;
    return localObject;
  }

  public final void remove()
  {
    AppMethodBeat.i(122980);
    UnsupportedOperationException localUnsupportedOperationException = new UnsupportedOperationException();
    AppMethodBeat.o(122980);
    throw localUnsupportedOperationException;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     a.i.b.a.d.a.a
 * JD-Core Version:    0.6.2
 */