package a.i.b.a.c.e;

import a.i.b.a.c.g.j.a;
import a.i.b.a.c.g.j.b;
import com.tencent.matrix.trace.core.AppMethodBeat;

public enum a$q
  implements j.a
{
  private static j.b<q> Btk;
  private final int value;

  static
  {
    AppMethodBeat.i(120672);
    Buy = new q("DECLARATION", 0, 0);
    Buz = new q("FAKE_OVERRIDE", 1, 1);
    BuA = new q("DELEGATION", 2, 2);
    BuB = new q("SYNTHESIZED", 3, 3);
    BuC = new q[] { Buy, Buz, BuA, BuB };
    Btk = new a.q.1();
    AppMethodBeat.o(120672);
  }

  private a$q(int paramInt1, int paramInt2)
  {
    this.value = paramInt1;
  }

  public static q Tp(int paramInt)
  {
    q localq;
    switch (paramInt)
    {
    default:
      localq = null;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      return localq;
      localq = Buy;
      continue;
      localq = Buz;
      continue;
      localq = BuA;
      continue;
      localq = BuB;
    }
  }

  public final int edd()
  {
    return this.value;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     a.i.b.a.c.e.a.q
 * JD-Core Version:    0.6.2
 */