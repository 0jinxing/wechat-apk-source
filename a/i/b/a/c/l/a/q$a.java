package a.i.b.a.c.l.a;

import a.i.b.a.c.l.ba;
import com.tencent.matrix.trace.core.AppMethodBeat;

public enum q$a
{
  static
  {
    AppMethodBeat.i(122790);
    BKY = new a("IN", 0);
    BKZ = new a("OUT", 1);
    BLa = new a("INV", 2);
    BLb = new a("STAR", 3);
    BLc = new a[] { BKY, BKZ, BLa, BLb };
    AppMethodBeat.o(122790);
  }

  public static a a(ba paramba)
  {
    AppMethodBeat.i(122789);
    switch (q.1.BKX[paramba.ordinal()])
    {
    default:
      paramba = new IllegalStateException("Unknown variance");
      AppMethodBeat.o(122789);
      throw paramba;
    case 1:
      paramba = BLa;
      AppMethodBeat.o(122789);
    case 2:
    case 3:
    }
    while (true)
    {
      return paramba;
      paramba = BKY;
      AppMethodBeat.o(122789);
      continue;
      paramba = BKZ;
      AppMethodBeat.o(122789);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     a.i.b.a.c.l.a.q.a
 * JD-Core Version:    0.6.2
 */