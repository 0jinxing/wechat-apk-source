package a.i.b.a.c.e;

import a.i.b.a.c.g.j.a;
import a.i.b.a.c.g.j.b;
import com.tencent.matrix.trace.core.AppMethodBeat;

public enum a$m$b
  implements j.a
{
  private static j.b<b> Btk;
  final int value;

  static
  {
    AppMethodBeat.i(120625);
    Bun = new b("TRUE", 0, 0);
    Buo = new b("FALSE", 1, 1);
    Bup = new b("NULL", 2, 2);
    Buq = new b[] { Bun, Buo, Bup };
    Btk = new a.m.b.1();
    AppMethodBeat.o(120625);
  }

  private a$m$b(int paramInt1, int paramInt2)
  {
    this.value = paramInt1;
  }

  public static b Tj(int paramInt)
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
      localb = Bun;
      continue;
      localb = Buo;
      continue;
      localb = Bup;
    }
  }

  public final int edd()
  {
    return this.value;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     a.i.b.a.c.e.a.m.b
 * JD-Core Version:    0.6.2
 */