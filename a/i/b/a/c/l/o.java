package a.i.b.a.c.l;

import a.i.b.a.c.b.a.g;
import a.i.b.a.c.b.a.g.a;
import a.i.b.a.c.i.e.h;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.List;

public class o extends ad
{
  private final boolean BEI;
  private final an BJm;
  private final List<ap> BeP;
  private final h BiC;

  public o(an paraman, h paramh, byte paramByte)
  {
    this(paraman, paramh);
  }

  public o(an paraman, h paramh, List<? extends ap> paramList, boolean paramBoolean)
  {
    AppMethodBeat.i(122536);
    this.BJm = paraman;
    this.BiC = paramh;
    this.BeP = paramList;
    this.BEI = paramBoolean;
    AppMethodBeat.o(122536);
  }

  public final ad d(g paramg)
  {
    AppMethodBeat.i(122532);
    a.f.b.j.p(paramg, "newAnnotations");
    paramg = (ad)this;
    AppMethodBeat.o(122532);
    return paramg;
  }

  public final h dXR()
  {
    return this.BiC;
  }

  public final g dYn()
  {
    AppMethodBeat.i(122530);
    Object localObject = g.BfJ;
    localObject = g.a.eai();
    AppMethodBeat.o(122530);
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

  public ad rL(boolean paramBoolean)
  {
    AppMethodBeat.i(122534);
    ad localad = (ad)new o(this.BJm, this.BiC, this.BeP, paramBoolean);
    AppMethodBeat.o(122534);
    return localad;
  }

  public String toString()
  {
    AppMethodBeat.i(122531);
    StringBuilder localStringBuilder = new StringBuilder().append(this.BJm.toString());
    if (this.BeP.isEmpty());
    for (String str = ""; ; str = a.a.j.a((Iterable)this.BeP, (CharSequence)", ", (CharSequence)"<", (CharSequence)">", -1, (CharSequence)"...", null))
    {
      str = str;
      AppMethodBeat.o(122531);
      return str;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     a.i.b.a.c.l.o
 * JD-Core Version:    0.6.2
 */