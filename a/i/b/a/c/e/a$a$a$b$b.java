package a.i.b.a.c.e;

import a.i.b.a.c.g.j.a;
import a.i.b.a.c.g.j.b;
import com.tencent.matrix.trace.core.AppMethodBeat;

public enum a$a$a$b$b
  implements j.a
{
  private static j.b<b> Btk;
  final int value;

  static
  {
    AppMethodBeat.i(120395);
    BsX = new b("BYTE", 0, 0);
    BsY = new b("CHAR", 1, 1);
    BsZ = new b("SHORT", 2, 2);
    Bta = new b("INT", 3, 3);
    Btb = new b("LONG", 4, 4);
    Btc = new b("FLOAT", 5, 5);
    Btd = new b("DOUBLE", 6, 6);
    Bte = new b("BOOLEAN", 7, 7);
    Btf = new b("STRING", 8, 8);
    Btg = new b("CLASS", 9, 9);
    Bth = new b("ENUM", 10, 10);
    Bti = new b("ANNOTATION", 11, 11);
    Btj = new b("ARRAY", 12, 12);
    Btl = new b[] { BsX, BsY, BsZ, Bta, Btb, Btc, Btd, Bte, Btf, Btg, Bth, Bti, Btj };
    Btk = new a.a.a.b.b.1();
    AppMethodBeat.o(120395);
  }

  private a$a$a$b$b(int paramInt1, int paramInt2)
  {
    this.value = paramInt1;
  }

  public static b SV(int paramInt)
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
    case 7:
    case 8:
    case 9:
    case 10:
    case 11:
    case 12:
    }
    while (true)
    {
      return localb;
      localb = BsX;
      continue;
      localb = BsY;
      continue;
      localb = BsZ;
      continue;
      localb = Bta;
      continue;
      localb = Btb;
      continue;
      localb = Btc;
      continue;
      localb = Btd;
      continue;
      localb = Bte;
      continue;
      localb = Btf;
      continue;
      localb = Btg;
      continue;
      localb = Bth;
      continue;
      localb = Bti;
      continue;
      localb = Btj;
    }
  }

  public final int edd()
  {
    return this.value;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     a.i.b.a.c.e.a.a.a.b.b
 * JD-Core Version:    0.6.2
 */