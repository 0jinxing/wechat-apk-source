package a.i.b.a.c.m;

import a.i.b.a.c.a.i;
import a.i.b.a.c.b.ar;
import a.i.b.a.c.b.au;
import a.i.b.a.c.b.l;
import a.i.b.a.c.b.s;
import a.i.b.a.c.b.t;
import a.i.b.a.c.b.y;
import a.i.b.a.c.l.ah;
import a.i.b.a.c.l.an;
import a.i.b.a.c.l.w;
import a.i.b.a.c.l.x;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.List;

final class e
  implements b
{
  public static final e BLC;
  private static final String description = "second parameter must be of type KProperty<*> or its supertype";

  static
  {
    AppMethodBeat.i(122865);
    BLC = new e();
    description = "second parameter must be of type KProperty<*> or its supertype";
    AppMethodBeat.o(122865);
  }

  public final String getDescription()
  {
    return description;
  }

  public final boolean h(t paramt)
  {
    AppMethodBeat.i(122864);
    a.f.b.j.p(paramt, "functionDescriptor");
    Object localObject1 = (au)paramt.dYV().get(1);
    paramt = i.Bcn;
    a.f.b.j.o(localObject1, "secondParameter");
    Object localObject2 = a.i.b.a.c.i.c.a.F((l)localObject1);
    a.f.b.j.p(localObject2, "module");
    paramt = a.i.b.a.c.a.g.Bag.Bbw;
    a.f.b.j.o(paramt, "KotlinBuiltIns.FQ_NAMES.kProperty");
    paramt = s.a((y)localObject2, paramt);
    boolean bool;
    if (paramt == null)
    {
      paramt = null;
      if (paramt == null)
        break label191;
      localObject1 = ((au)localObject1).dZS();
      a.f.b.j.o(localObject1, "secondParameter.type");
      bool = a.i.b.a.c.l.c.a.c(paramt, a.i.b.a.c.l.c.a.aA((w)localObject1));
      AppMethodBeat.o(122864);
    }
    while (true)
    {
      return bool;
      localObject2 = a.i.b.a.c.b.a.g.BfJ;
      localObject2 = a.i.b.a.c.b.a.g.a.eai();
      Object localObject3 = paramt.dXY();
      a.f.b.j.o(localObject3, "kPropertyClass.typeConstructor");
      localObject3 = ((an)localObject3).getParameters();
      a.f.b.j.o(localObject3, "kPropertyClass.typeConstructor.parameters");
      localObject3 = a.a.j.fN((List)localObject3);
      a.f.b.j.o(localObject3, "kPropertyClass.typeConstructor.parameters.single()");
      paramt = (w)x.a((a.i.b.a.c.b.a.g)localObject2, paramt, a.a.j.listOf(new ah((ar)localObject3)));
      break;
      label191: bool = false;
      AppMethodBeat.o(122864);
    }
  }

  public final String i(t paramt)
  {
    AppMethodBeat.i(122866);
    a.f.b.j.p(paramt, "functionDescriptor");
    paramt = b.a.a(this, paramt);
    AppMethodBeat.o(122866);
    return paramt;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     a.i.b.a.c.m.e
 * JD-Core Version:    0.6.2
 */