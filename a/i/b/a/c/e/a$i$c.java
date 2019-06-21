package a.i.b.a.c.e;

import a.i.b.a.c.g.j.a;
import a.i.b.a.c.g.j.b;
import com.tencent.matrix.trace.core.AppMethodBeat;

public enum a$i$c
  implements j.a
{
  private static j.b<c> Btk;
  final int value;

  static
  {
    AppMethodBeat.i(120568);
    Bua = new c("AT_MOST_ONCE", 0, 0);
    Bub = new c("EXACTLY_ONCE", 1, 1);
    Buc = new c("AT_LEAST_ONCE", 2, 2);
    Bud = new c[] { Bua, Bub, Buc };
    Btk = new a.i.c.1();
    AppMethodBeat.o(120568);
  }

  private a$i$c(int paramInt1, int paramInt2)
  {
    this.value = paramInt1;
  }

  public static c Te(int paramInt)
  {
    c localc;
    switch (paramInt)
    {
    default:
      localc = null;
    case 0:
    case 1:
    case 2:
    }
    while (true)
    {
      return localc;
      localc = Bua;
      continue;
      localc = Bub;
      continue;
      localc = Buc;
    }
  }

  public final int edd()
  {
    return this.value;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     a.i.b.a.c.e.a.i.c
 * JD-Core Version:    0.6.2
 */