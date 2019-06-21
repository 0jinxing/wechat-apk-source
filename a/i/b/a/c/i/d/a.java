package a.i.b.a.c.i.d;

import a.i.b.a.c.b.e;
import a.i.b.a.c.c.a.c;
import a.i.b.a.c.d.a.e.aa;
import a.i.b.a.c.f.b;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class a
{
  public final a.i.b.a.c.d.a.c.g BFd;
  private final a.i.b.a.c.d.a.a.g BmW;

  public a(a.i.b.a.c.d.a.c.g paramg, a.i.b.a.c.d.a.a.g paramg1)
  {
    AppMethodBeat.i(122155);
    this.BFd = paramg;
    this.BmW = paramg1;
    AppMethodBeat.o(122155);
  }

  public final e b(a.i.b.a.c.d.a.e.g paramg)
  {
    Object localObject1 = null;
    AppMethodBeat.i(122154);
    a.f.b.j.p(paramg, "javaClass");
    b localb = paramg.dZF();
    if ((localb != null) && (aa.Bpv == null))
    {
      AppMethodBeat.o(122154);
      paramg = (a.i.b.a.c.d.a.e.g)localObject1;
    }
    while (true)
    {
      return paramg;
      Object localObject2 = paramg.ebG();
      if (localObject2 != null)
      {
        localObject1 = b((a.i.b.a.c.d.a.e.g)localObject2);
        if (localObject1 != null)
        {
          localObject1 = ((e)localObject1).dZk();
          label70: if (localObject1 == null)
            break label122;
        }
        label122: for (paramg = ((a.i.b.a.c.i.e.h)localObject1).c(paramg.dZg(), (a.i.b.a.c.c.a.a)c.BjX); ; paramg = null)
        {
          localObject1 = paramg;
          if (!(paramg instanceof e))
            localObject1 = null;
          paramg = (e)localObject1;
          AppMethodBeat.o(122154);
          break;
          localObject1 = null;
          break label70;
        }
      }
      if (localb == null)
      {
        AppMethodBeat.o(122154);
        paramg = (a.i.b.a.c.d.a.e.g)localObject1;
      }
      else
      {
        localObject2 = this.BFd;
        localb = localb.ehG();
        a.f.b.j.o(localb, "fqName.parent()");
        localObject2 = (a.i.b.a.c.d.a.c.a.h)a.a.j.fK(((a.i.b.a.c.d.a.c.g)localObject2).h(localb));
        if (localObject2 != null)
        {
          paramg = ((a.i.b.a.c.d.a.c.a.h)localObject2).c(paramg);
          AppMethodBeat.o(122154);
        }
        else
        {
          AppMethodBeat.o(122154);
          paramg = (a.i.b.a.c.d.a.e.g)localObject1;
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     a.i.b.a.c.i.d.a
 * JD-Core Version:    0.6.2
 */