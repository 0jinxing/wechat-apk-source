package a.i.b.a.c.e;

import a.i.b.a.c.g.j.a;
import a.i.b.a.c.g.j.b;
import com.tencent.matrix.trace.core.AppMethodBeat;

public enum a$ak$b
  implements j.a
{
  private static j.b<b> Btk;
  final int value;

  static
  {
    AppMethodBeat.i(121026);
    BvY = new b("WARNING", 0, 0);
    BvZ = new b("ERROR", 1, 1);
    Bwa = new b("HIDDEN", 2, 2);
    Bwb = new b[] { BvY, BvZ, Bwa };
    Btk = new j.b()
    {
    };
    AppMethodBeat.o(121026);
  }

  private a$ak$b(int paramInt1, int paramInt2)
  {
    this.value = paramInt1;
  }

  public static b Ud(int paramInt)
  {
    b localb;
    switch (paramInt)
    {
    default:
      localb = null;
    case 0:
    case 1:
    case 2:
    }
    while (true)
    {
      return localb;
      localb = BvY;
      continue;
      localb = BvZ;
      continue;
      localb = Bwa;
    }
  }

  public final int edd()
  {
    return this.value;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     a.i.b.a.c.e.a.ak.b
 * JD-Core Version:    0.6.2
 */