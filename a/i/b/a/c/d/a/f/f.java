package a.i.b.a.c.d.a.f;

import a.f.b.j;
import a.i.b.a.c.b.a.g;
import a.i.b.a.c.l.ad;
import a.i.b.a.c.l.av;
import a.i.b.a.c.l.ax;
import a.i.b.a.c.l.c.a;
import a.i.b.a.c.l.i;
import a.i.b.a.c.l.q;
import a.i.b.a.c.l.w;
import a.i.b.a.c.l.x;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class f extends i
  implements a.i.b.a.c.l.f
{
  private final ad BpK;

  public f(ad paramad)
  {
    AppMethodBeat.i(120105);
    this.BpK = paramad;
    AppMethodBeat.o(120105);
  }

  private static ad a(ad paramad)
  {
    AppMethodBeat.i(120099);
    ad localad = paramad.rL(false);
    if (!a.aE((w)paramad))
    {
      AppMethodBeat.o(120099);
      paramad = localad;
    }
    while (true)
    {
      return paramad;
      paramad = (ad)new f(localad);
      AppMethodBeat.o(120099);
    }
  }

  private f c(g paramg)
  {
    AppMethodBeat.i(120100);
    j.p(paramg, "newAnnotations");
    paramg = new f(this.BpK.d(paramg));
    AppMethodBeat.o(120100);
    return paramg;
  }

  public final w R(w paramw)
  {
    AppMethodBeat.i(120098);
    j.p(paramw, "replacement");
    paramw = paramw.ekn();
    if ((!av.aB((w)paramw)) && (!a.aE((w)paramw)))
    {
      paramw = (w)paramw;
      AppMethodBeat.o(120098);
    }
    while (true)
    {
      return paramw;
      if ((paramw instanceof ad))
      {
        paramw = (w)a((ad)paramw);
        AppMethodBeat.o(120098);
      }
      else
      {
        if (!(paramw instanceof q))
          break;
        paramw = (w)ax.b(x.a(a(((q)paramw).BJx), a(((q)paramw).BJy)), ax.aG((w)paramw));
        AppMethodBeat.o(120098);
      }
    }
    paramw = (Throwable)new IllegalStateException("Incorrect type: ".concat(String.valueOf(paramw)).toString());
    AppMethodBeat.o(120098);
    throw paramw;
  }

  public final ad eby()
  {
    return this.BpK;
  }

  public final boolean ech()
  {
    return true;
  }

  public final boolean eci()
  {
    return false;
  }

  public final ad rL(boolean paramBoolean)
  {
    AppMethodBeat.i(120103);
    ad localad;
    if (paramBoolean)
    {
      localad = this.BpK.rL(true);
      AppMethodBeat.o(120103);
    }
    while (true)
    {
      return localad;
      localad = (ad)this;
      AppMethodBeat.o(120103);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     a.i.b.a.c.d.a.f.f
 * JD-Core Version:    0.6.2
 */