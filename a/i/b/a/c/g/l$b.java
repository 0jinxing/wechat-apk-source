package a.i.b.a.c.g;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Iterator;
import java.util.Map.Entry;

final class l$b<K>
  implements Iterator<Map.Entry<K, Object>>
{
  private Iterator<Map.Entry<K, Object>> AUT;

  public l$b(Iterator<Map.Entry<K, Object>> paramIterator)
  {
    this.AUT = paramIterator;
  }

  public final boolean hasNext()
  {
    AppMethodBeat.i(121542);
    boolean bool = this.AUT.hasNext();
    AppMethodBeat.o(121542);
    return bool;
  }

  public final void remove()
  {
    AppMethodBeat.i(121543);
    this.AUT.remove();
    AppMethodBeat.o(121543);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     a.i.b.a.c.g.l.b
 * JD-Core Version:    0.6.2
 */