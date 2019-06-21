package a.i.b.a.c.j.a.a;

import a.a.x;
import a.f.b.j;
import a.i.b.a.c.b.ab;
import a.i.b.a.c.b.l;
import a.i.b.a.c.e.a.s;
import a.i.b.a.c.e.a.c;
import a.i.b.a.c.f.f;
import a.i.b.a.c.j.a.i;
import a.i.b.a.c.j.a.k;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

public final class h extends g
{
  private final ab BIw;
  private final a.i.b.a.c.f.b BcW;

  public h(ab paramab, a.s params, c paramc, a.i.b.a.c.e.a.a parama, e parame, i parami, a.f.a.a<? extends Collection<f>> parama1)
  {
    super(paramc, parama, parame, (Collection)params, parama1);
    AppMethodBeat.i(122411);
    this.BIw = paramab;
    this.BcW = this.BIw.dZF();
    AppMethodBeat.o(122411);
  }

  protected final a.i.b.a.c.f.a A(f paramf)
  {
    AppMethodBeat.i(122407);
    j.p(paramf, "name");
    paramf = new a.i.b.a.c.f.a(this.BcW, paramf);
    AppMethodBeat.o(122407);
    return paramf;
  }

  protected final boolean D(f paramf)
  {
    AppMethodBeat.i(122406);
    j.p(paramf, "name");
    int i;
    if (!super.D(paramf))
    {
      Object localObject = this.BHj.Brl.BGV;
      if ((!(localObject instanceof Collection)) || (!((Collection)localObject).isEmpty()))
      {
        localObject = ((Iterable)localObject).iterator();
        do
          if (!((Iterator)localObject).hasNext())
            break;
        while (!((a.i.b.a.c.b.b.b)((Iterator)localObject).next()).a(this.BcW, paramf));
        i = 1;
        if (i == 0)
          break label109;
      }
    }
    else
    {
      AppMethodBeat.o(122406);
    }
    for (boolean bool = true; ; bool = false)
    {
      return bool;
      i = 0;
      break;
      label109: AppMethodBeat.o(122406);
    }
  }

  public final a.i.b.a.c.b.h c(f paramf, a.i.b.a.c.c.a.a parama)
  {
    AppMethodBeat.i(122408);
    j.p(paramf, "name");
    j.p(parama, "location");
    d(paramf, parama);
    paramf = super.c(paramf, parama);
    AppMethodBeat.o(122408);
    return paramf;
  }

  protected final void c(Collection<l> paramCollection, a.f.a.b<? super f, Boolean> paramb)
  {
    AppMethodBeat.i(122410);
    j.p(paramCollection, "result");
    j.p(paramb, "nameFilter");
    AppMethodBeat.o(122410);
  }

  public final void d(f paramf, a.i.b.a.c.c.a.a parama)
  {
    AppMethodBeat.i(122409);
    j.p(paramf, "name");
    j.p(parama, "location");
    a.i.b.a.c.c.a.a(this.BHj.Brl.Bnc, parama, this.BIw, paramf);
    AppMethodBeat.o(122409);
  }

  protected final Set<f> ejY()
  {
    return (Set)x.AUR;
  }

  protected final Set<f> ejZ()
  {
    return (Set)x.AUR;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     a.i.b.a.c.j.a.a.h
 * JD-Core Version:    0.6.2
 */