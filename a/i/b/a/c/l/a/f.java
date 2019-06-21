package a.i.b.a.c.l.a;

import a.a.v;
import a.f.b.j;
import a.i.b.a.c.a.g;
import a.i.b.a.c.b.ar;
import a.i.b.a.c.b.h;
import a.i.b.a.c.l.an;
import a.i.b.a.c.l.ap;
import a.i.b.a.c.l.az;
import a.i.b.a.c.l.c.a;
import a.i.b.a.c.l.w;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.List;

public final class f
  implements an
{
  private final ap BKy;
  List<? extends az> BKz;

  public f(ap paramap, List<? extends az> paramList)
  {
    AppMethodBeat.i(122731);
    this.BKy = paramap;
    this.BKz = paramList;
    AppMethodBeat.o(122731);
  }

  public final h dYs()
  {
    return null;
  }

  public final boolean dYu()
  {
    return false;
  }

  public final g dZD()
  {
    AppMethodBeat.i(122729);
    Object localObject = this.BKy.dZS();
    j.o(localObject, "projection.type");
    localObject = a.aL((w)localObject);
    AppMethodBeat.o(122729);
    return localObject;
  }

  public final List<ar> getParameters()
  {
    return (List)v.AUP;
  }

  public final String toString()
  {
    AppMethodBeat.i(122730);
    String str = "CapturedType(" + this.BKy + ')';
    AppMethodBeat.o(122730);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     a.i.b.a.c.l.a.f
 * JD-Core Version:    0.6.2
 */