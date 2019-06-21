package a.i.b.a.c.l.a;

import a.f.b.j;
import a.i.b.a.c.b.l;
import a.i.b.a.c.l.an;
import a.i.b.a.c.l.ao;
import a.i.b.a.c.l.ao.a;
import a.i.b.a.c.l.ap;
import a.i.b.a.c.l.as;
import a.i.b.a.c.l.au;
import a.i.b.a.c.l.av;
import a.i.b.a.c.l.ba;
import a.i.b.a.c.l.d.a;
import a.i.b.a.c.l.d.b;
import a.i.b.a.c.l.w;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Iterator;

public final class t
{
  public static final w a(w paramw1, w paramw2, r paramr)
  {
    AppMethodBeat.i(122811);
    j.p(paramw1, "subtype");
    j.p(paramw2, "supertype");
    j.p(paramr, "typeCheckingProcedureCallbacks");
    Object localObject1 = new ArrayDeque();
    ((ArrayDeque)localObject1).add(new n(paramw1, null));
    an localan = paramw2.ejw();
    Object localObject2;
    if (!((ArrayDeque)localObject1).isEmpty())
    {
      paramw2 = (n)((ArrayDeque)localObject1).poll();
      paramw1 = paramw2.AYl;
      localObject2 = paramw1.ejw();
      if (paramr.b((an)localObject2, localan))
      {
        boolean bool = paramw1.eci();
        paramw2 = paramw2.BKD;
        if (paramw2 != null)
        {
          localObject1 = paramw2.AYl;
          localObject2 = (Iterable)((w)localObject1).ejt();
          label149: int i;
          if ((!(localObject2 instanceof Collection)) || (!((Collection)localObject2).isEmpty()))
          {
            localObject2 = ((Iterable)localObject2).iterator();
            if (((Iterator)localObject2).hasNext())
              if (((ap)((Iterator)localObject2).next()).ekq() != ba.BKh)
              {
                i = 1;
                label183: if (i == 0)
                  break label257;
                i = 1;
                label191: if (i == 0)
                  break label265;
                localObject2 = ao.BJQ;
                paramw1 = a.i.b.a.c.i.a.a.c.c(ao.a.au((w)localObject1)).ekr().b(paramw1, ba.BKh);
                j.o(paramw1, "TypeConstructorSubstitut…uted, Variance.INVARIANT)");
                paramw1 = aK(paramw1);
                label230: if ((!bool) && (!((w)localObject1).eci()))
                  break label294;
              }
          }
          label257: label265: label294: for (bool = true; ; bool = false)
          {
            paramw2 = paramw2.BKD;
            break;
            i = 0;
            break label183;
            break label149;
            i = 0;
            break label191;
            localObject2 = ao.BJQ;
            paramw1 = ao.a.au((w)localObject1).ekr().b(paramw1, ba.BKh);
            j.o(paramw1, "TypeConstructorSubstitut…uted, Variance.INVARIANT)");
            break label230;
          }
        }
        paramw2 = paramw1.ejw();
        if (!paramr.b(paramw2, localan))
        {
          paramw1 = (Throwable)new AssertionError("Type constructors should be equals!\nsubstitutedSuperType: " + d(paramw2) + ", \n\nsupertype: " + d(localan) + " \n" + paramr.b(paramw2, localan));
          AppMethodBeat.o(122811);
          throw paramw1;
        }
        paramw1 = av.a(paramw1, bool);
        AppMethodBeat.o(122811);
      }
    }
    while (true)
    {
      return paramw1;
      localObject2 = ((an)localObject2).eap().iterator();
      while (((Iterator)localObject2).hasNext())
      {
        paramw1 = (w)((Iterator)localObject2).next();
        j.o(paramw1, "immediateSupertype");
        ((ArrayDeque)localObject1).add(new n(paramw1, paramw2));
      }
      break;
      AppMethodBeat.o(122811);
      paramw1 = null;
    }
  }

  private static final w aK(w paramw)
  {
    AppMethodBeat.i(122812);
    paramw = (w)b.aO(paramw).BLn;
    AppMethodBeat.o(122812);
    return paramw;
  }

  private static final String d(an paraman)
  {
    AppMethodBeat.i(122813);
    StringBuilder localStringBuilder = new StringBuilder();
    t.a locala = new t.a(localStringBuilder);
    locala.awq("type: ".concat(String.valueOf(paraman)));
    locala.awq("hashCode: " + paraman.hashCode());
    locala.awq("javaClass: " + paraman.getClass().getCanonicalName());
    for (paraman = (l)paraman.dYs(); paraman != null; paraman = paraman.dXW())
    {
      locala.awq("fqName: " + a.i.b.a.c.h.c.BBL.k(paraman));
      locala.awq("javaClass: " + paraman.getClass().getCanonicalName());
    }
    paraman = localStringBuilder.toString();
    j.o(paraman, "StringBuilder().apply(builderAction).toString()");
    AppMethodBeat.o(122813);
    return paraman;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     a.i.b.a.c.l.a.t
 * JD-Core Version:    0.6.2
 */