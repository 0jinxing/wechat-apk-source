package a.i.b.a.c.b.a;

import a.f.a.a;
import a.f.b.t;
import a.f.b.v;
import a.i.b.a.c.b.am;
import a.i.b.a.c.f.b;
import a.i.b.a.c.l.w;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Map;

public final class j
  implements c
{
  private final a.f BfN;
  private final a.i.b.a.c.a.g BfO;
  final b BfP;
  private final Map<a.i.b.a.c.f.f, a.i.b.a.c.i.b.f<?>> BfQ;

  static
  {
    AppMethodBeat.i(119344);
    eQB = new a.i.k[] { (a.i.k)v.a(new t(v.aN(j.class), "type", "getType()Lorg/jetbrains/kotlin/types/KotlinType;")) };
    AppMethodBeat.o(119344);
  }

  public j(a.i.b.a.c.a.g paramg, b paramb, Map<a.i.b.a.c.f.f, ? extends a.i.b.a.c.i.b.f<?>> paramMap)
  {
    AppMethodBeat.i(119347);
    this.BfO = paramg;
    this.BfP = paramb;
    this.BfQ = paramMap;
    this.BfN = a.g.a(a.k.AUm, (a)new j.a(this));
    AppMethodBeat.o(119347);
  }

  public final am dYo()
  {
    AppMethodBeat.i(119346);
    am localam = am.BeR;
    a.f.b.j.o(localam, "SourceElement.NO_SOURCE");
    AppMethodBeat.o(119346);
    return localam;
  }

  public final b dZF()
  {
    return this.BfP;
  }

  public final w dZS()
  {
    AppMethodBeat.i(119345);
    w localw = (w)this.BfN.getValue();
    AppMethodBeat.o(119345);
    return localw;
  }

  public final Map<a.i.b.a.c.f.f, a.i.b.a.c.i.b.f<?>> eah()
  {
    return this.BfQ;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     a.i.b.a.c.b.a.j
 * JD-Core Version:    0.6.2
 */