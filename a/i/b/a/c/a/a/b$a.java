package a.i.b.a.c.a.a;

import a.i.b.a.c.a.c;
import a.i.b.a.c.a.g;
import a.i.b.a.c.b.ab;
import a.i.b.a.c.b.ad;
import a.i.b.a.c.b.ap;
import a.i.b.a.c.b.ap.a;
import a.i.b.a.c.b.ar;
import a.i.b.a.c.b.y;
import a.i.b.a.c.f.f;
import a.i.b.a.c.i.d;
import a.i.b.a.c.l.w;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

final class b$a extends a.i.b.a.c.l.b
{
  public b$a()
  {
    super(b.c(localb));
    AppMethodBeat.i(119144);
    AppMethodBeat.o(119144);
  }

  private final c e(a.i.b.a.c.f.b paramb)
  {
    AppMethodBeat.i(119141);
    Object localObject = (Iterable)b.a(this.BcO).dZE().g(paramb).getFragments();
    paramb = (Collection)new ArrayList();
    Iterator localIterator = ((Iterable)localObject).iterator();
    while (localIterator.hasNext())
    {
      localObject = localIterator.next();
      if ((localObject instanceof c))
        paramb.add(localObject);
    }
    paramb = (c)a.a.j.fJ((List)paramb);
    AppMethodBeat.o(119141);
    return paramb;
  }

  public final Collection<w> dYr()
  {
    AppMethodBeat.i(119140);
    Object localObject1 = new ArrayList(2);
    b.a.a locala = new b.a.a(this, (ArrayList)localObject1);
    Object localObject2 = this.BcO.BcN;
    Object localObject3;
    switch (c.eQZ[localObject2.ordinal()])
    {
    default:
      localObject3 = b.a(this.BcO);
      localObject2 = f.avX(this.BcO.BcN.BcX);
      a.f.b.j.o(localObject2, "Name.identifier(functionKind.classNamePrefix)");
      locala.a((ab)localObject3, (f)localObject2);
      localObject2 = this.BcO.BcN;
      switch (c.pCY[localObject2.ordinal()])
      {
      default:
      case 1:
      case 2:
      }
      break;
    case 1:
    case 2:
    }
    while (true)
    {
      localObject1 = (Collection)a.a.j.m((Iterable)localObject1);
      AppMethodBeat.o(119140);
      return localObject1;
      localObject2 = g.AZV;
      a.f.b.j.o(localObject2, "BUILT_INS_PACKAGE_FQ_NAME");
      localObject3 = (ab)e((a.i.b.a.c.f.b)localObject2);
      localObject2 = f.avX("Function");
      a.f.b.j.o(localObject2, "Name.identifier(\"Function\")");
      locala.a((ab)localObject3, (f)localObject2);
      break;
      localObject2 = b.a(this.BcO);
      localObject3 = f.avX("KFunction");
      a.f.b.j.o(localObject3, "Name.identifier(\"KFunction\")");
      locala.a((ab)localObject2, (f)localObject3);
      break;
      localObject2 = g.AZV;
      a.f.b.j.o(localObject2, "BUILT_INS_PACKAGE_FQ_NAME");
      locala.a((ab)e((a.i.b.a.c.f.b)localObject2), b.b.BcR.SN(this.BcO.AVt));
      continue;
      localObject2 = d.BDS;
      a.f.b.j.o(localObject2, "COROUTINES_PACKAGE_FQ_NAME_RELEASE");
      locala.a((ab)e((a.i.b.a.c.f.b)localObject2), b.b.BcS.SN(this.BcO.AVt));
    }
  }

  public final boolean dYu()
  {
    return true;
  }

  public final ap dYv()
  {
    return (ap)ap.a.BeT;
  }

  public final List<ar> getParameters()
  {
    AppMethodBeat.i(119142);
    List localList = b.b(this.BcO);
    AppMethodBeat.o(119142);
    return localList;
  }

  public final String toString()
  {
    AppMethodBeat.i(119143);
    String str = this.BcO.toString();
    AppMethodBeat.o(119143);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     a.i.b.a.c.a.a.b.a
 * JD-Core Version:    0.6.2
 */