package a.i.b.a.c.d.a.c.b;

import a.i.b.a.c.b.e;
import a.i.b.a.c.d.a.a.l;
import a.i.b.a.c.f.b;
import a.i.b.a.c.l.ah;
import a.i.b.a.c.l.ai;
import a.i.b.a.c.l.an;
import a.i.b.a.c.l.ap;
import a.i.b.a.c.l.w;
import a.v;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.List;

public final class d
{
  private static final b Bpm;

  static
  {
    AppMethodBeat.i(120055);
    Bpm = new b("java.lang.Class");
    AppMethodBeat.o(120055);
  }

  public static final ap a(a.i.b.a.c.b.ar paramar, a parama)
  {
    AppMethodBeat.i(120051);
    a.f.b.j.p(paramar, "typeParameter");
    a.f.b.j.p(parama, "attr");
    if (parama.BoW == l.Bmv)
    {
      paramar = (ap)new a.i.b.a.c.l.ar(ai.d(paramar));
      AppMethodBeat.o(120051);
    }
    while (true)
    {
      return paramar;
      paramar = (ap)new ah(paramar);
      AppMethodBeat.o(120051);
    }
  }

  public static final w a(a.i.b.a.c.b.ar paramar1, a.i.b.a.c.b.ar paramar2, a.f.a.a<? extends w> parama)
  {
    AppMethodBeat.i(120053);
    a.f.b.j.p(paramar1, "receiver$0");
    a.f.b.j.p(parama, "defaultValue");
    if (paramar1 == paramar2)
    {
      paramar1 = (w)parama.invoke();
      AppMethodBeat.o(120053);
    }
    Object localObject;
    while (true)
    {
      return paramar1;
      localObject = paramar1.dWP();
      a.f.b.j.o(localObject, "upperBounds");
      localObject = (w)a.a.j.fJ((List)localObject);
      if (!(((w)localObject).ejw().dYs() instanceof e))
        break;
      a.f.b.j.o(localObject, "firstUpperBound");
      paramar1 = a.i.b.a.c.l.c.a.aN((w)localObject);
      AppMethodBeat.o(120053);
    }
    if (paramar2 == null);
    while (true)
    {
      paramar2 = ((w)localObject).ejw().dYs();
      if (paramar2 == null)
      {
        paramar1 = new v("null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.TypeParameterDescriptor");
        AppMethodBeat.o(120053);
        throw paramar1;
      }
      for (paramar2 = (a.i.b.a.c.b.ar)paramar2; ; paramar2 = (a.i.b.a.c.b.ar)paramar2)
      {
        if (!(a.f.b.j.j(paramar2, paramar1) ^ true))
          break label238;
        paramar2 = paramar2.dWP();
        a.f.b.j.o(paramar2, "current.upperBounds");
        paramar2 = (w)a.a.j.fJ(paramar2);
        if ((paramar2.ejw().dYs() instanceof e))
        {
          a.f.b.j.o(paramar2, "nextUpperBound");
          paramar1 = a.i.b.a.c.l.c.a.aN(paramar2);
          AppMethodBeat.o(120053);
          break;
        }
        paramar2 = paramar2.ejw().dYs();
        if (paramar2 == null)
        {
          paramar1 = new v("null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.TypeParameterDescriptor");
          AppMethodBeat.o(120053);
          throw paramar1;
        }
      }
      label238: paramar1 = (w)parama.invoke();
      AppMethodBeat.o(120053);
      break;
      paramar1 = paramar2;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     a.i.b.a.c.d.a.c.b.d
 * JD-Core Version:    0.6.2
 */