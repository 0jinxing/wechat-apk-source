package a.i.b.a.c.d.a;

import a.aa;
import a.i.b.a.c.a.g;
import a.i.b.a.c.b.al;
import a.i.b.a.c.b.au;
import a.i.b.a.c.b.c.p;
import a.i.b.a.c.b.l;
import a.i.b.a.c.b.t;
import a.i.b.a.c.d.b.j.c;
import a.i.b.a.c.d.b.r;
import a.i.b.a.c.l.an;
import a.i.b.a.c.l.w;
import a.o;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Iterator;
import java.util.List;

public final class m$a
{
  private static a.i.b.a.c.d.b.j a(t paramt, au paramau)
  {
    AppMethodBeat.i(119697);
    if ((r.b((a.i.b.a.c.b.a)paramt)) || (f(paramt)))
    {
      paramt = paramau.dZS();
      a.f.b.j.o(paramt, "valueParameterDescriptor.type");
      paramt = r.V(a.i.b.a.c.l.c.a.az(paramt));
      AppMethodBeat.o(119697);
    }
    while (true)
    {
      return paramt;
      paramt = paramau.dZS();
      a.f.b.j.o(paramt, "valueParameterDescriptor.type");
      paramt = r.V(paramt);
      AppMethodBeat.o(119697);
    }
  }

  public static boolean a(a.i.b.a.c.b.a parama1, a.i.b.a.c.b.a parama2)
  {
    boolean bool1 = false;
    AppMethodBeat.i(119696);
    a.f.b.j.p(parama1, "superDescriptor");
    a.f.b.j.p(parama2, "subDescriptor");
    if ((!(parama2 instanceof a.i.b.a.c.d.a.b.e)) || (!(parama1 instanceof t)))
      AppMethodBeat.o(119696);
    while (true)
    {
      return bool1;
      if (((a.i.b.a.c.d.a.b.e)parama2).BhM.size() == ((t)parama1).dYV().size());
      for (int i = 1; (aa.AUz) && (i == 0); i = 0)
      {
        parama1 = (Throwable)new AssertionError("External overridability condition with CONFLICTS_ONLY should not be run with different value parameters size");
        AppMethodBeat.o(119696);
        throw parama1;
      }
      Object localObject1 = ((a.i.b.a.c.d.a.b.e)parama2).eaK();
      a.f.b.j.o(localObject1, "subDescriptor.original");
      localObject1 = ((al)localObject1).dYV();
      a.f.b.j.o(localObject1, "subDescriptor.original.valueParameters");
      localObject1 = (Iterable)localObject1;
      Object localObject2 = ((t)parama1).dZp();
      a.f.b.j.o(localObject2, "superDescriptor.original");
      localObject2 = ((t)localObject2).dYV();
      a.f.b.j.o(localObject2, "superDescriptor.original.valueParameters");
      localObject1 = a.a.j.a((Iterable)localObject1, (Iterable)localObject2).iterator();
      while (true)
        if (((Iterator)localObject1).hasNext())
        {
          Object localObject3 = (o)((Iterator)localObject1).next();
          localObject2 = (au)((o)localObject3).first;
          localObject3 = (au)((o)localObject3).second;
          t localt = (t)parama2;
          a.f.b.j.o(localObject2, "subParameter");
          boolean bool2 = a(localt, (au)localObject2) instanceof j.c;
          localObject2 = (t)parama1;
          a.f.b.j.o(localObject3, "superParameter");
          if (bool2 != a((t)localObject2, (au)localObject3) instanceof j.c)
          {
            AppMethodBeat.o(119696);
            bool1 = true;
            break;
          }
        }
      AppMethodBeat.o(119696);
    }
  }

  private static boolean f(t paramt)
  {
    AppMethodBeat.i(119698);
    boolean bool;
    if (paramt.dYV().size() != 1)
    {
      AppMethodBeat.o(119698);
      bool = false;
    }
    while (true)
    {
      return bool;
      Object localObject1 = paramt.dXW();
      Object localObject2 = localObject1;
      if (!(localObject1 instanceof a.i.b.a.c.b.e))
        localObject2 = null;
      localObject1 = (a.i.b.a.c.b.e)localObject2;
      if (localObject1 == null)
      {
        AppMethodBeat.o(119698);
        bool = false;
      }
      else
      {
        paramt = paramt.dYV();
        a.f.b.j.o(paramt, "f.valueParameters");
        paramt = a.a.j.fN(paramt);
        a.f.b.j.o(paramt, "f.valueParameters.single()");
        localObject2 = ((au)paramt).dZS().ejw().dYs();
        paramt = (t)localObject2;
        if (!(localObject2 instanceof a.i.b.a.c.b.e))
          paramt = null;
        paramt = (a.i.b.a.c.b.e)paramt;
        if (paramt == null)
        {
          AppMethodBeat.o(119698);
          bool = false;
        }
        else if ((g.d((a.i.b.a.c.b.e)localObject1)) && (a.f.b.j.j(a.i.b.a.c.i.c.a.o((l)localObject1), a.i.b.a.c.i.c.a.o((l)paramt))))
        {
          AppMethodBeat.o(119698);
          bool = true;
        }
        else
        {
          AppMethodBeat.o(119698);
          bool = false;
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     a.i.b.a.c.d.a.m.a
 * JD-Core Version:    0.6.2
 */