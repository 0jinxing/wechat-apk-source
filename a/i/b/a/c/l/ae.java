package a.i.b.a.c.l;

import a.i.b.a.c.b.a.g;
import a.i.b.a.c.b.a.g.a;
import a.i.b.a.c.i.e.h;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.List;

final class ae extends ad
{
  private final boolean BEI;
  private final an BJm;
  private final List<ap> BeP;
  private final h BiC;

  public ae(an paraman, List<? extends ap> paramList, boolean paramBoolean, h paramh)
  {
    AppMethodBeat.i(122622);
    this.BJm = paraman;
    this.BeP = paramList;
    this.BEI = paramBoolean;
    this.BiC = paramh;
    if ((this.BiC instanceof p.b))
    {
      paraman = (Throwable)new IllegalStateException("SimpleTypeImpl should not be created for error type: " + this.BiC + '\n' + this.BJm);
      AppMethodBeat.o(122622);
      throw paraman;
    }
    AppMethodBeat.o(122622);
  }

  public final ad d(g paramg)
  {
    AppMethodBeat.i(122618);
    a.f.b.j.p(paramg, "newAnnotations");
    if (paramg.isEmpty())
    {
      paramg = (ad)this;
      AppMethodBeat.o(122618);
    }
    while (true)
    {
      return paramg;
      paramg = (ad)new d((ad)this, paramg);
      AppMethodBeat.o(122618);
    }
  }

  public final h dXR()
  {
    return this.BiC;
  }

  public final g dYn()
  {
    AppMethodBeat.i(122617);
    Object localObject = g.BfJ;
    localObject = g.a.eai();
    AppMethodBeat.o(122617);
    return localObject;
  }

  public final boolean eci()
  {
    return this.BEI;
  }

  public final List<ap> ejt()
  {
    return this.BeP;
  }

  public final an ejw()
  {
    return this.BJm;
  }

  public final ad rL(boolean paramBoolean)
  {
    AppMethodBeat.i(122620);
    Object localObject;
    if (paramBoolean == this.BEI)
      localObject = this;
    while (true)
    {
      localObject = (ad)localObject;
      AppMethodBeat.o(122620);
      return localObject;
      if (paramBoolean)
        localObject = (j)new ab((ad)this);
      else
        localObject = (j)new aa((ad)this);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     a.i.b.a.c.l.ae
 * JD-Core Version:    0.6.2
 */