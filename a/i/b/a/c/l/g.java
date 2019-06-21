package a.i.b.a.c.l;

import a.aa;
import a.f.b.j;
import a.i.b.a.c.b.ar;
import a.i.b.a.c.l.a.k;
import a.i.b.a.c.l.a.l;
import a.i.b.a.c.l.c.a;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class g extends i
  implements f
{
  public static final a BJi;
  final ad BJh;

  static
  {
    AppMethodBeat.i(122509);
    BJi = new a((byte)0);
    AppMethodBeat.o(122509);
  }

  private g(ad paramad)
  {
    this.BJh = paramad;
  }

  private g g(a.i.b.a.c.b.a.g paramg)
  {
    AppMethodBeat.i(122503);
    j.p(paramg, "newAnnotations");
    paramg = new g(this.BJh.d(paramg));
    AppMethodBeat.o(122503);
    return paramg;
  }

  public final w R(w paramw)
  {
    AppMethodBeat.i(122502);
    j.p(paramw, "replacement");
    az localaz = paramw.ekn();
    j.p(localaz, "receiver$0");
    paramw = a.a(localaz);
    if (paramw != null);
    for (paramw = (az)paramw; ; paramw = localaz.rK(false))
    {
      paramw = (w)paramw;
      AppMethodBeat.o(122502);
      return paramw;
    }
  }

  protected final ad eby()
  {
    return this.BJh;
  }

  public final boolean ech()
  {
    AppMethodBeat.i(122501);
    boolean bool;
    if (((this.BJh.ejw() instanceof k)) || ((this.BJh.ejw().dYs() instanceof ar)))
    {
      bool = true;
      AppMethodBeat.o(122501);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(122501);
    }
  }

  public final boolean eci()
  {
    return false;
  }

  public final ad rL(boolean paramBoolean)
  {
    AppMethodBeat.i(122506);
    ad localad;
    if (paramBoolean)
    {
      localad = this.BJh.rL(paramBoolean);
      AppMethodBeat.o(122506);
    }
    while (true)
    {
      return localad;
      localad = (ad)this;
      AppMethodBeat.o(122506);
    }
  }

  public final String toString()
  {
    AppMethodBeat.i(122508);
    String str = this.BJh + "!!";
    AppMethodBeat.o(122508);
    return str;
  }

  public static final class a
  {
    public static g a(az paramaz)
    {
      AppMethodBeat.i(122499);
      j.p(paramaz, "type");
      if ((paramaz instanceof g))
      {
        paramaz = (g)paramaz;
        AppMethodBeat.o(122499);
      }
      while (true)
      {
        return paramaz;
        if (b(paramaz))
        {
          if ((paramaz instanceof q))
          {
            boolean bool = j.j(((q)paramaz).BJx.ejw(), ((q)paramaz).BJy.ejw());
            if ((aa.AUz) && (!bool))
            {
              paramaz = (Throwable)new AssertionError("DefinitelyNotNullType for flexible type (" + paramaz + ") can be created only from type variable with the same constructor for bounds");
              AppMethodBeat.o(122499);
              throw paramaz;
            }
          }
          paramaz = new g(t.ak((w)paramaz), (byte)0);
          AppMethodBeat.o(122499);
        }
        else
        {
          paramaz = null;
          AppMethodBeat.o(122499);
        }
      }
    }

    private static boolean b(az paramaz)
    {
      AppMethodBeat.i(122500);
      j.p(paramaz, "type");
      boolean bool;
      if (a.h(paramaz))
      {
        l locall = l.BKB;
        if (!l.d(paramaz))
        {
          bool = true;
          AppMethodBeat.o(122500);
        }
      }
      while (true)
      {
        return bool;
        bool = false;
        AppMethodBeat.o(122500);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     a.i.b.a.c.l.g
 * JD-Core Version:    0.6.2
 */