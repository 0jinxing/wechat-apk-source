package a.i.b.a.c.i.e;

import a.aa;
import a.f.a.a;
import a.f.b.t;
import a.f.b.v;
import a.i.b.a.c.b.al;
import a.i.b.a.c.b.e;
import a.i.b.a.c.k.h;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.List;

public final class k extends i
{
  private final e BFZ;
  private final a.i.b.a.c.k.f BGi;

  static
  {
    AppMethodBeat.i(122201);
    eQB = new a.i.k[] { (a.i.k)v.a(new t(v.aN(k.class), "functions", "getFunctions()Ljava/util/List;")) };
    AppMethodBeat.o(122201);
  }

  public k(a.i.b.a.c.k.i parami, e parame)
  {
    AppMethodBeat.i(122206);
    this.BFZ = parame;
    if (this.BFZ.dYc() == a.i.b.a.c.b.f.Bet);
    for (int i = 1; (aa.AUz) && (i == 0); i = 0)
    {
      parami = (Throwable)new AssertionError("Class should be an enum: " + this.BFZ);
      AppMethodBeat.o(122206);
      throw parami;
    }
    this.BGi = parami.i((a)new k.a(this));
    AppMethodBeat.o(122206);
  }

  private final List<al> ejO()
  {
    AppMethodBeat.i(122203);
    List localList = (List)h.a(this.BGi, eQB[0]);
    AppMethodBeat.o(122203);
    return localList;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     a.i.b.a.c.i.e.k
 * JD-Core Version:    0.6.2
 */