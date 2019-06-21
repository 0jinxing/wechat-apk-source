package a.i.b.a.c.e;

import a.i.b.a.c.g.j.a;
import a.i.b.a.c.g.j.b;
import com.tencent.matrix.trace.core.AppMethodBeat;

public enum a$aa$a$b
  implements j.a
{
  private static j.b<b> Btk;
  final int value;

  static
  {
    AppMethodBeat.i(120843);
    Bvq = new b("IN", 0, 0);
    Bvr = new b("OUT", 1, 1);
    Bvs = new b("INV", 2, 2);
    Bvt = new b("STAR", 3, 3);
    Bvu = new b[] { Bvq, Bvr, Bvs, Bvt };
    Btk = new a.aa.a.b.1();
    AppMethodBeat.o(120843);
  }

  private a$aa$a$b(int paramInt1, int paramInt2)
  {
    this.value = paramInt1;
  }

  public static b TD(int paramInt)
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
    }
    while (true)
    {
      return localb;
      localb = Bvq;
      continue;
      localb = Bvr;
      continue;
      localb = Bvs;
      continue;
      localb = Bvt;
    }
  }

  public final int edd()
  {
    return this.value;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     a.i.b.a.c.e.a.aa.a.b
 * JD-Core Version:    0.6.2
 */