package a.i.b.a.c.g;

import com.tencent.matrix.trace.core.AppMethodBeat;

final class u$c
  implements d.a
{
  private final u.b BAq;
  private d.a BAr;
  int BAs;

  private u$c(u paramu)
  {
    AppMethodBeat.i(121592);
    this.BAq = new u.b(paramu, (byte)0);
    this.BAr = this.BAq.eiD().ehP();
    this.BAs = paramu.size();
    AppMethodBeat.o(121592);
  }

  public final boolean hasNext()
  {
    if (this.BAs > 0);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public final byte nextByte()
  {
    AppMethodBeat.i(121593);
    if (!this.BAr.hasNext())
      this.BAr = this.BAq.eiD().ehP();
    this.BAs -= 1;
    byte b = this.BAr.nextByte();
    AppMethodBeat.o(121593);
    return b;
  }

  public final void remove()
  {
    AppMethodBeat.i(121594);
    UnsupportedOperationException localUnsupportedOperationException = new UnsupportedOperationException();
    AppMethodBeat.o(121594);
    throw localUnsupportedOperationException;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     a.i.b.a.c.g.u.c
 * JD-Core Version:    0.6.2
 */