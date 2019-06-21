package a.i.b.a.c.n;

import a.f.b.a.d;
import a.f.b.b;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Iterator;

final class i$a<T>
  implements d, Iterator<T>
{
  private final Iterator<T> BNw;

  public i$a(T[] paramArrayOfT)
  {
    AppMethodBeat.i(122965);
    this.BNw = b.V(paramArrayOfT);
    AppMethodBeat.o(122965);
  }

  public final boolean hasNext()
  {
    AppMethodBeat.i(122962);
    boolean bool = this.BNw.hasNext();
    AppMethodBeat.o(122962);
    return bool;
  }

  public final T next()
  {
    AppMethodBeat.i(122963);
    Object localObject = this.BNw.next();
    AppMethodBeat.o(122963);
    return localObject;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     a.i.b.a.c.n.i.a
 * JD-Core Version:    0.6.2
 */