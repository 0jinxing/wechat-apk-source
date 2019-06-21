package a.i.b.a.c.d.a.c.a;

import a.i.b.a.c.b.a.g.a;
import a.i.b.a.c.b.am;
import a.i.b.a.c.b.c.x;
import a.i.b.a.c.b.e;
import a.i.b.a.c.d.b.n;
import a.i.b.a.c.d.b.o;
import a.i.b.a.c.k.i;
import a.i.k;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.List;
import java.util.Map;

public final class h extends x
{
  private final a.i.b.a.c.b.a.g Bfn;
  private final a.i.b.a.c.d.a.c.h Bnn;
  private final a.i.b.a.c.k.f Bop;
  private final d Boq;
  public final a.i.b.a.c.k.f<List<a.i.b.a.c.f.b>> Bor;
  private final a.i.b.a.c.k.f Bos;
  private final a.i.b.a.c.d.a.e.t Bot;

  static
  {
    AppMethodBeat.i(119961);
    eQB = new k[] { (k)a.f.b.v.a(new a.f.b.t(a.f.b.v.aN(h.class), "binaryClasses", "getBinaryClasses$descriptors_jvm()Ljava/util/Map;")), (k)a.f.b.v.a(new a.f.b.t(a.f.b.v.aN(h.class), "partToFacade", "getPartToFacade()Ljava/util/HashMap;")) };
    AppMethodBeat.o(119961);
  }

  public h(a.i.b.a.c.d.a.c.h paramh, a.i.b.a.c.d.a.e.t paramt)
  {
    super(paramh.Bnv.BcH, paramt.dZF());
    AppMethodBeat.i(119966);
    this.Bot = paramt;
    this.Bnn = a.i.b.a.c.d.a.c.a.a(paramh, (a.i.b.a.c.b.g)this, null, 6);
    this.Bop = this.Bnn.Bnv.Baf.i((a.f.a.a)new h.a(this));
    this.Boq = new d(this.Bnn, this.Bot, this);
    this.Bor = this.Bnn.Bnv.Baf.a((a.f.a.a)new h.c(this), (List)a.a.v.AUP);
    if (this.Bnn.Bnv.Bne.Bke)
      paramh = a.i.b.a.c.b.a.g.BfJ;
    for (paramh = g.a.eai(); ; paramh = a.i.b.a.c.d.a.c.f.a(this.Bnn, (a.i.b.a.c.d.a.e.d)this.Bot))
    {
      this.Bfn = paramh;
      this.Bos = this.Bnn.Bnv.Baf.i((a.f.a.a)new h.b(this));
      AppMethodBeat.o(119966);
      return;
    }
  }

  public final e c(a.i.b.a.c.d.a.e.g paramg)
  {
    AppMethodBeat.i(119963);
    a.f.b.j.p(paramg, "jClass");
    j localj = this.Boq.BnN;
    a.f.b.j.p(paramg, "javaClass");
    paramg = localj.a(paramg.dZg(), paramg);
    AppMethodBeat.o(119963);
    return paramg;
  }

  public final a.i.b.a.c.b.a.g dYn()
  {
    return this.Bfn;
  }

  public final am dYo()
  {
    AppMethodBeat.i(119965);
    am localam = (am)new o(this);
    AppMethodBeat.o(119965);
    return localam;
  }

  public final Map<String, n> ebv()
  {
    AppMethodBeat.i(119962);
    Map localMap = (Map)a.i.b.a.c.k.h.a(this.Bop, eQB[0]);
    AppMethodBeat.o(119962);
    return localMap;
  }

  public final String toString()
  {
    AppMethodBeat.i(119964);
    String str = "Lazy Java package fragment: " + this.BfP;
    AppMethodBeat.o(119964);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     a.i.b.a.c.d.a.c.a.h
 * JD-Core Version:    0.6.2
 */