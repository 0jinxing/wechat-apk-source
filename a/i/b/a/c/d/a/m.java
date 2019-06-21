package a.i.b.a.c.d.a;

import a.f.b.j;
import a.i.b.a.c.a.g;
import a.i.b.a.c.b.a;
import a.i.b.a.c.b.b;
import a.i.b.a.c.b.l;
import a.i.b.a.c.d.b.r;
import a.i.b.a.c.f.f;
import a.i.b.a.c.i.e.a;
import a.i.b.a.c.i.e.b;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class m
  implements a.i.b.a.c.i.e
{
  public static final m.a Blf;

  static
  {
    AppMethodBeat.i(119700);
    Blf = new m.a((byte)0);
    AppMethodBeat.o(119700);
  }

  public final e.b a(a parama1, a parama2, a.i.b.a.c.b.e parame)
  {
    AppMethodBeat.i(119699);
    j.p(parama1, "superDescriptor");
    j.p(parama2, "subDescriptor");
    int i;
    if ((!(parama1 instanceof b)) || (!(parama2 instanceof a.i.b.a.c.b.t)) || (g.b((l)parama2)))
      i = 0;
    label58: b localb;
    boolean bool;
    while (i != 0)
    {
      parama1 = e.b.BEf;
      AppMethodBeat.o(119699);
      return parama1;
      localObject = d.BkH;
      localObject = ((a.i.b.a.c.b.t)parama2).dZg();
      j.o(localObject, "subDescriptor.name");
      if (!d.h((f)localObject))
      {
        localObject = c.Bky;
        localObject = ((a.i.b.a.c.b.t)parama2).dZg();
        j.o(localObject, "subDescriptor.name");
        if (!c.f((f)localObject))
          i = 0;
      }
      else
      {
        localb = t.p((b)parama1);
        bool = ((a.i.b.a.c.b.t)parama2).dZr();
        if ((parama1 instanceof a.i.b.a.c.b.t))
          break label380;
      }
    }
    label219: label380: for (Object localObject = null; ; localObject = parama1)
    {
      localObject = (a.i.b.a.c.b.t)localObject;
      if ((localObject == null) || (bool != ((a.i.b.a.c.b.t)localObject).dZr()));
      for (i = 1; ; i = 0)
      {
        if ((i == 0) || ((localb != null) && (((a.i.b.a.c.b.t)parama2).dZr())))
          break label219;
        i = 1;
        break;
      }
      if ((!(parame instanceof a.i.b.a.c.d.a.b.d)) || (((a.i.b.a.c.b.t)parama2).dZq() != null))
      {
        i = 0;
        break;
      }
      if ((localb == null) || (t.a(parame, (a)localb)))
      {
        i = 0;
        break;
      }
      if (((localb instanceof a.i.b.a.c.b.t)) && ((parama1 instanceof a.i.b.a.c.b.t)) && (d.e((a.i.b.a.c.b.t)localb) != null))
      {
        localObject = r.a((a.i.b.a.c.b.t)parama2, false, false, 2);
        parame = ((a.i.b.a.c.b.t)parama1).dZp();
        j.o(parame, "superDescriptor.original");
        if (j.j(localObject, r.a(parame, false, false, 2)))
        {
          i = 0;
          break;
        }
      }
      i = 1;
      break;
      if (m.a.a(parama1, parama2))
      {
        parama1 = e.b.BEf;
        AppMethodBeat.o(119699);
        break label58;
      }
      parama1 = e.b.BEg;
      AppMethodBeat.o(119699);
      break label58;
    }
  }

  public final e.a eaX()
  {
    return e.a.BDZ;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     a.i.b.a.c.d.a.m
 * JD-Core Version:    0.6.2
 */