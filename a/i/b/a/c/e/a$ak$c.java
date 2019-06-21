package a.i.b.a.c.e;

import a.i.b.a.c.g.j.a;
import a.i.b.a.c.g.j.b;
import com.tencent.matrix.trace.core.AppMethodBeat;

public enum a$ak$c
  implements j.a
{
  private static j.b<c> Btk;
  final int value;

  static
  {
    AppMethodBeat.i(121030);
    Bwc = new c("LANGUAGE_VERSION", 0, 0);
    Bwd = new c("COMPILER_VERSION", 1, 1);
    Bwe = new c("API_VERSION", 2, 2);
    Bwf = new c[] { Bwc, Bwd, Bwe };
    Btk = new a.ak.c.1();
    AppMethodBeat.o(121030);
  }

  private a$ak$c(int paramInt1, int paramInt2)
  {
    this.value = paramInt1;
  }

  public static c Ue(int paramInt)
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
      localc = Bwc;
      continue;
      localc = Bwd;
      continue;
      localc = Bwe;
    }
  }

  public final int edd()
  {
    return this.value;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     a.i.b.a.c.e.a.ak.c
 * JD-Core Version:    0.6.2
 */