package a.i.b.a.c.g;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.NoSuchElementException;

final class c$a
  implements d.a
{
  private final int limit;
  private int position;

  private c$a(c paramc)
  {
    AppMethodBeat.i(121411);
    this.position = paramc.Bzn;
    this.limit = (this.position + paramc.size());
    AppMethodBeat.o(121411);
  }

  public final boolean hasNext()
  {
    if (this.position < this.limit);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public final byte nextByte()
  {
    AppMethodBeat.i(121412);
    if (this.position >= this.limit)
    {
      localObject = new NoSuchElementException();
      AppMethodBeat.o(121412);
      throw ((Throwable)localObject);
    }
    Object localObject = this.Bzp.wR;
    int i = this.position;
    this.position = (i + 1);
    byte b = localObject[i];
    AppMethodBeat.o(121412);
    return b;
  }

  public final void remove()
  {
    AppMethodBeat.i(121413);
    UnsupportedOperationException localUnsupportedOperationException = new UnsupportedOperationException();
    AppMethodBeat.o(121413);
    throw localUnsupportedOperationException;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     a.i.b.a.c.g.c.a
 * JD-Core Version:    0.6.2
 */