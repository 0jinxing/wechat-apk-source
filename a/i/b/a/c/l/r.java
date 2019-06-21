package a.i.b.a.c.l;

import a.aa;
import a.f.b.j;
import a.i.b.a.c.b.a.g;
import a.i.b.a.c.b.ar;
import a.i.b.a.c.h.i;
import a.i.b.a.c.l.c.a;
import a.m;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class r extends q
  implements f
{
  public static boolean BJA;
  public static final r.a BJB;
  private boolean BJz;

  static
  {
    AppMethodBeat.i(122585);
    BJB = new r.a((byte)0);
    AppMethodBeat.o(122585);
  }

  public r(ad paramad1, ad paramad2)
  {
    super(paramad1, paramad2);
    AppMethodBeat.i(122584);
    AppMethodBeat.o(122584);
  }

  public final w R(w paramw)
  {
    AppMethodBeat.i(122580);
    j.p(paramw, "replacement");
    az localaz = paramw.ekn();
    if ((localaz instanceof q));
    for (paramw = localaz; ; paramw = x.a((ad)localaz, ((ad)localaz).rL(true)))
    {
      paramw = (w)ax.a(paramw, (w)localaz);
      AppMethodBeat.o(122580);
      return paramw;
      if (!(localaz instanceof ad))
        break;
    }
    paramw = new m();
    AppMethodBeat.o(122580);
    throw paramw;
  }

  public final String a(a.i.b.a.c.h.c paramc, i parami)
  {
    AppMethodBeat.i(122582);
    j.p(paramc, "renderer");
    j.p(parami, "options");
    if (parami.eiS())
    {
      paramc = "(" + paramc.b((w)this.BJx) + ".." + paramc.b((w)this.BJy) + ')';
      AppMethodBeat.o(122582);
    }
    while (true)
    {
      return paramc;
      paramc = paramc.a(paramc.b((w)this.BJx), paramc.b((w)this.BJy), a.aL(this));
      AppMethodBeat.o(122582);
    }
  }

  public final az b(g paramg)
  {
    AppMethodBeat.i(122581);
    j.p(paramg, "newAnnotations");
    paramg = x.a(this.BJx.d(paramg), this.BJy.d(paramg));
    AppMethodBeat.o(122581);
    return paramg;
  }

  public final ad eby()
  {
    int i = 1;
    AppMethodBeat.i(122578);
    if ((!BJA) || (this.BJz));
    boolean bool;
    do
    {
      localObject = this.BJx;
      AppMethodBeat.o(122578);
      return localObject;
      this.BJz = true;
      if (!t.ai((w)this.BJx));
      for (int j = 1; (aa.AUz) && (j == 0); j = 0)
      {
        localObject = (Throwable)new AssertionError("Lower bound of a flexible type can not be flexible: " + this.BJx);
        AppMethodBeat.o(122578);
        throw ((Throwable)localObject);
      }
      if (!t.ai((w)this.BJy));
      for (j = i; (aa.AUz) && (j == 0); j = 0)
      {
        localObject = (Throwable)new AssertionError("Upper bound of a flexible type can not be flexible: " + this.BJy);
        AppMethodBeat.o(122578);
        throw ((Throwable)localObject);
      }
      bool = j.j(this.BJx, this.BJy);
      if ((aa.AUz) && (!(bool ^ true)))
      {
        localObject = (Throwable)new AssertionError("Lower and upper bounds are equal: " + this.BJx + " == " + this.BJy);
        AppMethodBeat.o(122578);
        throw ((Throwable)localObject);
      }
      bool = a.i.b.a.c.l.a.c.BKs.c((w)this.BJx, (w)this.BJy);
    }
    while ((!aa.AUz) || (bool));
    Object localObject = (Throwable)new AssertionError("Lower bound " + this.BJx + " of a flexible type must be a subtype of the upper bound " + this.BJy);
    AppMethodBeat.o(122578);
    throw ((Throwable)localObject);
  }

  public final boolean ech()
  {
    AppMethodBeat.i(122579);
    boolean bool;
    if (((this.BJx.ejw().dYs() instanceof ar)) && (j.j(this.BJx.ejw(), this.BJy.ejw())))
    {
      bool = true;
      AppMethodBeat.o(122579);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(122579);
    }
  }

  public final az rK(boolean paramBoolean)
  {
    AppMethodBeat.i(122583);
    az localaz = x.a(this.BJx.rL(paramBoolean), this.BJy.rL(paramBoolean));
    AppMethodBeat.o(122583);
    return localaz;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     a.i.b.a.c.l.r
 * JD-Core Version:    0.6.2
 */