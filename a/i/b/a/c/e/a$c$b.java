package a.i.b.a.c.e;

import a.i.b.a.c.g.j.a;
import a.i.b.a.c.g.j.b;
import com.tencent.matrix.trace.core.AppMethodBeat;

public enum a$c$b
  implements j.a
{
  private static j.b<b> Btk;
  private final int value;

  static
  {
    AppMethodBeat.i(120475);
    BtF = new b("CLASS", 0, 0);
    BtG = new b("INTERFACE", 1, 1);
    BtH = new b("ENUM_CLASS", 2, 2);
    BtI = new b("ENUM_ENTRY", 3, 3);
    BtJ = new b("ANNOTATION_CLASS", 4, 4);
    BtK = new b("OBJECT", 5, 5);
    BtL = new b("COMPANION_OBJECT", 6, 6);
    BtM = new b[] { BtF, BtG, BtH, BtI, BtJ, BtK, BtL };
    Btk = new a.c.b.1();
    AppMethodBeat.o(120475);
  }

  private a$c$b(int paramInt1, int paramInt2)
  {
    this.value = paramInt1;
  }

  public static b Tb(int paramInt)
  {
    b localb;
    switch (paramInt)
    {
    default:
      localb = null;
    case 0:
    case 1:
    case 2:
    case 3:
    case 4:
    case 5:
    case 6:
    }
    while (true)
    {
      return localb;
      localb = BtF;
      continue;
      localb = BtG;
      continue;
      localb = BtH;
      continue;
      localb = BtI;
      continue;
      localb = BtJ;
      continue;
      localb = BtK;
      continue;
      localb = BtL;
    }
  }

  public final int edd()
  {
    return this.value;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     a.i.b.a.c.e.a.c.b
 * JD-Core Version:    0.6.2
 */