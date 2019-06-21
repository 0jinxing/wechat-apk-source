package a.i.b.a.c.a.a;

import a.a.y;
import a.i.b.a.c.b.a;
import a.i.b.a.c.b.a.g;
import a.i.b.a.c.b.a.g.a;
import a.i.b.a.c.b.am;
import a.i.b.a.c.b.ar;
import a.i.b.a.c.b.au;
import a.i.b.a.c.b.ay;
import a.i.b.a.c.b.b.a;
import a.i.b.a.c.b.c.ai;
import a.i.b.a.c.b.l;
import a.i.b.a.c.l.ba;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public final class f$a
{
  public static f a(b paramb, boolean paramBoolean)
  {
    AppMethodBeat.i(119158);
    a.f.b.j.p(paramb, "functionClass");
    List localList1 = paramb.parameters;
    f localf = new f((l)paramb, b.a.Bej, paramBoolean);
    paramb = paramb.dZl();
    List localList2 = (List)a.a.v.AUP;
    Object localObject1 = (Iterable)localList1;
    Object localObject2 = new ArrayList();
    localObject1 = ((Iterable)localObject1).iterator();
    Object localObject3;
    if (((Iterator)localObject1).hasNext())
    {
      localObject3 = ((Iterator)localObject1).next();
      if (((ar)localObject3).dZh() == ba.BKi);
      for (int i = 1; ; i = 0)
      {
        if (i == 0)
          break label129;
        ((ArrayList)localObject2).add(localObject3);
        break;
      }
    }
    label129: localObject1 = a.a.j.p((Iterable)localObject2);
    localObject2 = (Collection)new ArrayList(a.a.j.d((Iterable)localObject1));
    Iterator localIterator = ((Iterable)localObject1).iterator();
    while (localIterator.hasNext())
    {
      localObject3 = (y)localIterator.next();
      localObject1 = f.BcZ;
      ((Collection)localObject2).add(a(localf, ((y)localObject3).index, (ar)((y)localObject3).value));
    }
    localf.b(null, paramb, localList2, (List)localObject2, (a.i.b.a.c.l.w)((ar)a.a.j.fL(localList1)).dZf(), a.i.b.a.c.b.w.BeE, ay.Bfa);
    localf.rI(true);
    AppMethodBeat.o(119158);
    return localf;
  }

  private static au a(f paramf, int paramInt, ar paramar)
  {
    AppMethodBeat.i(119159);
    Object localObject1 = paramar.dZg().name;
    a.f.b.j.o(localObject1, "typeParameter.name.asString()");
    switch (((String)localObject1).hashCode())
    {
    default:
    case 84:
      while (localObject1 == null)
      {
        paramf = new a.v("null cannot be cast to non-null type java.lang.String");
        AppMethodBeat.o(119159);
        throw paramf;
        if (((String)localObject1).equals("T"))
          localObject1 = "instance";
      }
    case 69:
    }
    while (true)
    {
      paramf = (a)paramf;
      Object localObject2 = g.BfJ;
      localObject2 = g.a.eai();
      localObject1 = a.i.b.a.c.f.f.avX((String)localObject1);
      a.f.b.j.o(localObject1, "Name.identifier(name)");
      paramar = paramar.dZf();
      a.f.b.j.o(paramar, "typeParameter.defaultType");
      a.i.b.a.c.l.w localw = (a.i.b.a.c.l.w)paramar;
      paramar = am.BeR;
      a.f.b.j.o(paramar, "SourceElement.NO_SOURCE");
      paramf = (au)new ai(paramf, null, paramInt, (g)localObject2, (a.i.b.a.c.f.f)localObject1, localw, false, false, false, null, paramar);
      AppMethodBeat.o(119159);
      return paramf;
      if (!((String)localObject1).equals("E"))
        break;
      localObject1 = "receiver";
      continue;
      localObject1 = ((String)localObject1).toLowerCase();
      a.f.b.j.o(localObject1, "(this as java.lang.String).toLowerCase()");
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     a.i.b.a.c.a.a.f.a
 * JD-Core Version:    0.6.2
 */