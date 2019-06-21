package a.i.b.a.c.e;

import a.i.b.a.c.g.j.a;
import a.i.b.a.c.g.j.b;
import com.tencent.matrix.trace.core.AppMethodBeat;

public enum a$r
  implements j.a
{
  private static j.b<r> Btk;
  private final int value;

  static
  {
    AppMethodBeat.i(120676);
    BuD = new r("FINAL", 0, 0);
    BuE = new r("OPEN", 1, 1);
    BuF = new r("ABSTRACT", 2, 2);
    BuG = new r("SEALED", 3, 3);
    BuH = new r[] { BuD, BuE, BuF, BuG };
    Btk = new a.r.1();
    AppMethodBeat.o(120676);
  }

  private a$r(int paramInt1, int paramInt2)
  {
    this.value = paramInt1;
  }

  public static r Tq(int paramInt)
  {
    r localr;
    switch (paramInt)
    {
    default:
      localr = null;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      return localr;
      localr = BuD;
      continue;
      localr = BuE;
      continue;
      localr = BuF;
      continue;
      localr = BuG;
    }
  }

  public final int edd()
  {
    return this.value;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     a.i.b.a.c.e.a.r
 * JD-Core Version:    0.6.2
 */