package a.i.b.a.c.l;

import a.a.v;
import a.f.b.j;
import a.i.b.a.c.b.a.g;
import a.i.b.a.c.b.a.g.a;
import a.i.b.a.c.i.e.h;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.List;

public final class aj extends ad
{
  private final boolean BEI;
  private final an BJO;
  private final an BJm;
  private final h BiC;

  private aj(an paraman1, boolean paramBoolean, an paraman2, h paramh)
  {
    AppMethodBeat.i(122643);
    this.BJO = paraman1;
    this.BEI = paramBoolean;
    this.BJm = paraman2;
    this.BiC = paramh;
    AppMethodBeat.o(122643);
  }

  public final ad d(g paramg)
  {
    AppMethodBeat.i(122638);
    j.p(paramg, "newAnnotations");
    paramg = (Throwable)new IllegalStateException("Shouldn't be called on non-fixed type".toString());
    AppMethodBeat.o(122638);
    throw paramg;
  }

  public final h dXR()
  {
    return this.BiC;
  }

  public final g dYn()
  {
    AppMethodBeat.i(122637);
    Object localObject = g.BfJ;
    localObject = g.a.eai();
    AppMethodBeat.o(122637);
    return localObject;
  }

  public final boolean eci()
  {
    return this.BEI;
  }

  public final List<ap> ejt()
  {
    return (List)v.AUP;
  }

  public final an ejw()
  {
    return this.BJm;
  }

  public final ad rL(boolean paramBoolean)
  {
    AppMethodBeat.i(122640);
    ad localad;
    if (paramBoolean == this.BEI)
    {
      localad = (ad)this;
      AppMethodBeat.o(122640);
    }
    while (true)
    {
      return localad;
      localad = (ad)new aj(this.BJO, paramBoolean, this.BJm, this.BiC);
      AppMethodBeat.o(122640);
    }
  }

  public final String toString()
  {
    AppMethodBeat.i(122642);
    String str = "NonFixed: " + this.BJO;
    AppMethodBeat.o(122642);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     a.i.b.a.c.l.aj
 * JD-Core Version:    0.6.2
 */