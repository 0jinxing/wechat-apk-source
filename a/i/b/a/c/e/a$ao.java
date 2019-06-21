package a.i.b.a.c.e;

import a.i.b.a.c.g.j.a;
import a.i.b.a.c.g.j.b;
import com.tencent.matrix.trace.core.AppMethodBeat;

public enum a$ao
  implements j.a
{
  private static j.b<ao> Btk;
  private final int value;

  static
  {
    AppMethodBeat.i(121064);
    Bwi = new ao("INTERNAL", 0, 0);
    Bwj = new ao("PRIVATE", 1, 1);
    Bwk = new ao("PROTECTED", 2, 2);
    Bwl = new ao("PUBLIC", 3, 3);
    Bwm = new ao("PRIVATE_TO_THIS", 4, 4);
    Bwn = new ao("LOCAL", 5, 5);
    Bwo = new ao[] { Bwi, Bwj, Bwk, Bwl, Bwm, Bwn };
    Btk = new a.ao.1();
    AppMethodBeat.o(121064);
  }

  private a$ao(int paramInt1, int paramInt2)
  {
    this.value = paramInt1;
  }

  public static ao Uf(int paramInt)
  {
    ao localao;
    switch (paramInt)
    {
    default:
      localao = null;
    case 0:
    case 1:
    case 2:
    case 3:
    case 4:
    case 5:
    }
    while (true)
    {
      return localao;
      localao = Bwi;
      continue;
      localao = Bwj;
      continue;
      localao = Bwk;
      continue;
      localao = Bwl;
      continue;
      localao = Bwm;
      continue;
      localao = Bwn;
    }
  }

  public final int edd()
  {
    return this.value;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     a.i.b.a.c.e.a.ao
 * JD-Core Version:    0.6.2
 */