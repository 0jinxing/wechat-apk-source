package g.a.c;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class a
{
  public short[] BZY;
  public int BZZ;

  public a(int paramInt)
  {
    AppMethodBeat.i(86245);
    this.BZZ = paramInt;
    this.BZY = new short[1 << paramInt];
    AppMethodBeat.o(86245);
  }

  public final int a(b paramb)
  {
    AppMethodBeat.i(86246);
    int i = this.BZZ;
    int j = 1;
    while (i != 0)
    {
      j = paramb.g(this.BZY, j) + (j << 1);
      i--;
    }
    i = this.BZZ;
    AppMethodBeat.o(86246);
    return j - (1 << i);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     g.a.c.a
 * JD-Core Version:    0.6.2
 */