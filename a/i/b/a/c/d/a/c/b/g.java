package a.i.b.a.c.d.a.c.b;

import a.aa;
import a.f.a.b;
import a.i.b.a.c.h.i;
import a.i.b.a.c.l.ac;
import a.i.b.a.c.l.ad;
import a.i.b.a.c.l.an;
import a.i.b.a.c.l.as;
import a.i.b.a.c.l.c.a;
import a.i.b.a.c.l.q;
import a.i.b.a.c.l.w;
import a.o;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public final class g extends q
  implements ac
{
  public g(ad paramad1, ad paramad2)
  {
    super(paramad1, paramad2);
    AppMethodBeat.i(120077);
    boolean bool = a.i.b.a.c.l.a.c.BKs.c((w)paramad1, (w)paramad2);
    if ((aa.AUz) && (!bool))
    {
      paramad1 = (Throwable)new AssertionError("Lower bound " + paramad1 + " of a flexible type must be a subtype of the upper bound " + paramad2);
      AppMethodBeat.o(120077);
      throw paramad1;
    }
    AppMethodBeat.o(120077);
  }

  public final String a(a.i.b.a.c.h.c paramc, i parami)
  {
    int i = 0;
    AppMethodBeat.i(120076);
    a.f.b.j.p(paramc, "renderer");
    a.f.b.j.p(parami, "options");
    Object localObject1 = g.a.Bpr;
    Object localObject2 = new g.b(paramc);
    localObject1 = g.c.Bpt;
    String str = paramc.b((w)this.BJx);
    localObject1 = paramc.b((w)this.BJy);
    if (parami.eiS())
    {
      paramc = "raw (" + str + ".." + (String)localObject1 + ')';
      AppMethodBeat.o(120076);
    }
    while (true)
    {
      return paramc;
      if (this.BJy.ejt().isEmpty())
      {
        paramc = paramc.a(str, (String)localObject1, a.aL(this));
        AppMethodBeat.o(120076);
      }
      else
      {
        parami = ((g.b)localObject2).Q((w)this.BJx);
        Object localObject3 = ((g.b)localObject2).Q((w)this.BJy);
        localObject2 = a.a.j.a((Iterable)parami, (CharSequence)", ", null, null, 0, null, (b)g.d.Bpu, 30);
        parami = (Iterable)a.a.j.a((Iterable)parami, (Iterable)localObject3);
        if (!((Collection)parami).isEmpty())
        {
          localObject3 = parami.iterator();
          while (((Iterator)localObject3).hasNext())
          {
            o localo = (o)((Iterator)localObject3).next();
            parami = g.a.Bpr;
            if (!g.a.iR((String)localo.first, (String)localo.second))
              label287: if (i == 0)
                break label333;
          }
        }
        label333: for (parami = g.c.iS((String)localObject1, (String)localObject2); ; parami = (i)localObject1)
        {
          localObject1 = g.c.iS(str, (String)localObject2);
          if (!a.f.b.j.j(localObject1, parami))
            break label339;
          AppMethodBeat.o(120076);
          paramc = (a.i.b.a.c.h.c)localObject1;
          break;
          i = 1;
          break label287;
        }
        label339: paramc = paramc.a((String)localObject1, parami, a.aL(this));
        AppMethodBeat.o(120076);
      }
    }
  }

  public final a.i.b.a.c.i.e.h dXR()
  {
    AppMethodBeat.i(120073);
    a.i.b.a.c.b.h localh = ejw().dYs();
    Object localObject = localh;
    if (!(localh instanceof a.i.b.a.c.b.e))
      localObject = null;
    localObject = (a.i.b.a.c.b.e)localObject;
    if (localObject == null)
    {
      localObject = (Throwable)new IllegalStateException(("Incorrect classifier: " + ejw().dYs()).toString());
      AppMethodBeat.o(120073);
      throw ((Throwable)localObject);
    }
    localObject = ((a.i.b.a.c.b.e)localObject).a((as)e.Bpq);
    a.f.b.j.o(localObject, "classDescriptor.getMemberScope(RawSubstitution)");
    AppMethodBeat.o(120073);
    return localObject;
  }

  public final ad eby()
  {
    return this.BJx;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     a.i.b.a.c.d.a.c.b.g
 * JD-Core Version:    0.6.2
 */