package a.i.b.a.c.n;

import a.f.b.a.d;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Iterator;
import java.util.NoSuchElementException;

final class i$c<T>
  implements d, Iterator<T>
{
  private final T AVE;
  private boolean AVN;

  public i$c(T paramT)
  {
    this.AVE = paramT;
    this.AVN = true;
  }

  public final boolean hasNext()
  {
    return this.AVN;
  }

  public final T next()
  {
    AppMethodBeat.i(122967);
    if (this.AVN)
    {
      this.AVN = false;
      localObject = this.AVE;
      AppMethodBeat.o(122967);
      return localObject;
    }
    Object localObject = (Throwable)new NoSuchElementException();
    AppMethodBeat.o(122967);
    throw ((Throwable)localObject);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     a.i.b.a.c.n.i.c
 * JD-Core Version:    0.6.2
 */