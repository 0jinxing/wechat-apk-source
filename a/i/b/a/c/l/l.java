package a.i.b.a.c.l;

import a.f.b.j;
import a.i.b.a.c.b.a.g;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class l extends as
{
  public static final l.a BJl;
  private final as BJj;
  private final as BJk;

  static
  {
    AppMethodBeat.i(122524);
    BJl = new l.a((byte)0);
    AppMethodBeat.o(122524);
  }

  private l(as paramas1, as paramas2)
  {
    this.BJj = paramas1;
    this.BJk = paramas2;
  }

  public static final as a(as paramas1, as paramas2)
  {
    AppMethodBeat.i(122525);
    j.p(paramas1, "first");
    j.p(paramas2, "second");
    if (paramas1.isEmpty())
      AppMethodBeat.o(122525);
    while (true)
    {
      return paramas2;
      if (paramas2.isEmpty())
      {
        AppMethodBeat.o(122525);
        paramas2 = paramas1;
      }
      else
      {
        paramas2 = (as)new l(paramas1, paramas2, (byte)0);
        AppMethodBeat.o(122525);
      }
    }
  }

  public final ap O(w paramw)
  {
    AppMethodBeat.i(122519);
    j.p(paramw, "key");
    ap localap1 = this.BJj.O(paramw);
    ap localap2 = localap1;
    if (localap1 == null)
      localap2 = this.BJk.O(paramw);
    AppMethodBeat.o(122519);
    return localap2;
  }

  public final w a(w paramw, ba paramba)
  {
    AppMethodBeat.i(122520);
    j.p(paramw, "topLevelType");
    j.p(paramba, "position");
    paramw = this.BJk.a(this.BJj.a(paramw, paramba), paramba);
    AppMethodBeat.o(122520);
    return paramw;
  }

  public final boolean ejx()
  {
    AppMethodBeat.i(122522);
    boolean bool;
    if ((this.BJj.ejx()) || (this.BJk.ejx()))
    {
      bool = true;
      AppMethodBeat.o(122522);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(122522);
    }
  }

  public final boolean eki()
  {
    AppMethodBeat.i(122521);
    boolean bool;
    if ((this.BJj.eki()) || (this.BJk.eki()))
    {
      bool = true;
      AppMethodBeat.o(122521);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(122521);
    }
  }

  public final g h(g paramg)
  {
    AppMethodBeat.i(122523);
    j.p(paramg, "annotations");
    paramg = this.BJk.h(this.BJj.h(paramg));
    AppMethodBeat.o(122523);
    return paramg;
  }

  public final boolean isEmpty()
  {
    return false;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     a.i.b.a.c.l.l
 * JD-Core Version:    0.6.2
 */