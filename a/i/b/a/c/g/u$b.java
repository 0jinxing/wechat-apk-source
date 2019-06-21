package a.i.b.a.c.g;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Stack;

final class u$b
  implements Iterator<p>
{
  private final Stack<u> BAo;
  private p BAp;

  private u$b(d paramd)
  {
    AppMethodBeat.i(121586);
    this.BAo = new Stack();
    this.BAp = g(paramd);
    AppMethodBeat.o(121586);
  }

  private p eiC()
  {
    AppMethodBeat.i(121588);
    label66: 
    while (true)
    {
      if (this.BAo.isEmpty())
      {
        localp = null;
        AppMethodBeat.o(121588);
        return localp;
      }
      p localp = g(u.b((u)this.BAo.pop()));
      if (localp.size() == 0);
      for (int i = 1; ; i = 0)
      {
        if (i != 0)
          break label66;
        AppMethodBeat.o(121588);
        break;
      }
    }
  }

  private p g(d paramd)
  {
    AppMethodBeat.i(121587);
    while ((paramd instanceof u))
    {
      paramd = (u)paramd;
      this.BAo.push(paramd);
      paramd = u.a(paramd);
    }
    paramd = (p)paramd;
    AppMethodBeat.o(121587);
    return paramd;
  }

  public final p eiD()
  {
    AppMethodBeat.i(121589);
    if (this.BAp == null)
    {
      localObject = new NoSuchElementException();
      AppMethodBeat.o(121589);
      throw ((Throwable)localObject);
    }
    Object localObject = this.BAp;
    this.BAp = eiC();
    AppMethodBeat.o(121589);
    return localObject;
  }

  public final boolean hasNext()
  {
    if (this.BAp != null);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public final void remove()
  {
    AppMethodBeat.i(121590);
    UnsupportedOperationException localUnsupportedOperationException = new UnsupportedOperationException();
    AppMethodBeat.o(121590);
    throw localUnsupportedOperationException;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     a.i.b.a.c.g.u.b
 * JD-Core Version:    0.6.2
 */