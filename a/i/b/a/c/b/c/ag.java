package a.i.b.a.c.b.c;

import a.f.a.a;
import a.f.b.j;
import a.i.b.a.c.b.am;
import a.i.b.a.c.b.aq;
import a.i.b.a.c.b.az;
import a.i.b.a.c.b.b.a;
import a.i.b.a.c.b.d;
import a.i.b.a.c.b.l;
import a.i.b.a.c.b.t.a;
import a.i.b.a.c.f.f;
import a.i.b.a.c.k.i;
import a.i.b.a.c.l.au;
import a.i.k;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class ag extends p
  implements af
{
  public static final ag.a Bjq;
  final i Baf;
  private final a.i.b.a.c.k.g Bjn;
  private d Bjo;
  final aq Bjp;

  static
  {
    AppMethodBeat.i(119592);
    eQB = new k[] { (k)a.f.b.v.a(new a.f.b.t(a.f.b.v.aN(ag.class), "withDispatchReceiver", "getWithDispatchReceiver()Lorg/jetbrains/kotlin/descriptors/impl/TypeAliasConstructorDescriptor;")) };
    Bjq = new ag.a((byte)0);
    AppMethodBeat.o(119592);
  }

  private ag(i parami, aq paramaq, d paramd, af paramaf, a.i.b.a.c.b.a.g paramg, b.a parama, am paramam)
  {
    super((l)paramaq, (a.i.b.a.c.b.t)paramaf, paramg, f.avZ("<init>"), parama, paramam);
    AppMethodBeat.i(119608);
    this.Baf = parami;
    this.Bjp = paramaq;
    this.BhW = this.Bjp.dYl();
    this.Bjn = this.Baf.j((a)new ag.b(this, paramd));
    this.Bjo = paramd;
    AppMethodBeat.o(119608);
  }

  private af d(l paraml, a.i.b.a.c.b.w paramw, az paramaz, b.a parama, boolean paramBoolean)
  {
    AppMethodBeat.i(119604);
    j.p(paraml, "newOwner");
    j.p(paramw, "modality");
    j.p(paramaz, "visibility");
    j.p(parama, "kind");
    paraml = dZw().g(paraml).a(paramw).a(paramaz).a(parama).rG(paramBoolean).dZC();
    if (paraml == null)
    {
      paraml = new a.v("null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.impl.TypeAliasConstructorDescriptor");
      AppMethodBeat.o(119604);
      throw paraml;
    }
    paraml = (af)paraml;
    AppMethodBeat.o(119604);
    return paraml;
  }

  private af eaM()
  {
    AppMethodBeat.i(119594);
    Object localObject = super.dZp();
    if (localObject == null)
    {
      localObject = new a.v("null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.impl.TypeAliasConstructorDescriptor");
      AppMethodBeat.o(119594);
      throw ((Throwable)localObject);
    }
    localObject = (af)localObject;
    AppMethodBeat.o(119594);
    return localObject;
  }

  private af i(au paramau)
  {
    AppMethodBeat.i(119600);
    j.p(paramau, "substitutor");
    paramau = super.c(paramau);
    if (paramau == null)
    {
      paramau = new a.v("null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.impl.TypeAliasConstructorDescriptorImpl");
      AppMethodBeat.o(119600);
      throw paramau;
    }
    paramau = (ag)paramau;
    Object localObject = au.aw(paramau.dYT());
    j.o(localObject, "TypeSubstitutor.create(s…asConstructor.returnType)");
    localObject = this.Bjo.dZj().a((au)localObject);
    if (localObject == null)
    {
      paramau = null;
      AppMethodBeat.o(119600);
    }
    while (true)
    {
      return paramau;
      paramau.Bjo = ((d)localObject);
      paramau = (af)paramau;
      AppMethodBeat.o(119600);
    }
  }

  public final a.i.b.a.c.l.w dYT()
  {
    AppMethodBeat.i(119593);
    a.i.b.a.c.l.w localw = super.dYT();
    if (localw == null)
      j.dWJ();
    AppMethodBeat.o(119593);
    return localw;
  }

  public final d eaL()
  {
    return this.Bjo;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     a.i.b.a.c.b.c.ag
 * JD-Core Version:    0.6.2
 */