package a.i.b.a.c.b.c;

import a.f.a.a;
import a.f.b.t;
import a.i.b.a.c.b.a.g.a;
import a.i.b.a.c.b.ab;
import a.i.b.a.c.b.ad;
import a.i.b.a.c.b.n;
import a.i.b.a.c.f.b;
import a.i.b.a.c.f.c;
import a.i.b.a.c.i.e.g;
import a.i.b.a.c.k.f;
import a.i.b.a.c.k.i;
import a.i.k;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.List;

public final class r extends j
  implements ad
{
  final b BfP;
  private final f BiB;
  private final a.i.b.a.c.i.e.h BiC;
  final v BiD;

  static
  {
    AppMethodBeat.i(119466);
    eQB = new k[] { (k)a.f.b.v.a(new t(a.f.b.v.aN(r.class), "fragments", "getFragments()Ljava/util/List;")) };
    AppMethodBeat.o(119466);
  }

  public r(v paramv, b paramb, i parami)
  {
    super(g.a.eai(), paramb.ByQ.ehL());
    AppMethodBeat.i(119472);
    this.BiD = paramv;
    this.BfP = paramb;
    this.BiB = parami.i((a)new r.a(this));
    this.BiC = ((a.i.b.a.c.i.e.h)new g(parami.i((a)new r.b(this))));
    AppMethodBeat.o(119472);
  }

  public final <R, D> R a(n<R, D> paramn, D paramD)
  {
    AppMethodBeat.i(119471);
    a.f.b.j.p(paramn, "visitor");
    paramn = paramn.a((ad)this, paramD);
    AppMethodBeat.o(119471);
    return paramn;
  }

  public final a.i.b.a.c.i.e.h dXR()
  {
    return this.BiC;
  }

  public final b dZF()
  {
    return this.BfP;
  }

  public final boolean equals(Object paramObject)
  {
    AppMethodBeat.i(119469);
    if (!(paramObject instanceof ad))
      paramObject = null;
    while (true)
    {
      paramObject = (ad)paramObject;
      boolean bool;
      if (paramObject == null)
      {
        AppMethodBeat.o(119469);
        bool = false;
      }
      while (true)
      {
        return bool;
        if ((a.f.b.j.j(this.BfP, paramObject.dZF())) && (a.f.b.j.j(this.BiD, paramObject.dZG())))
        {
          bool = true;
          AppMethodBeat.o(119469);
        }
        else
        {
          AppMethodBeat.o(119469);
          bool = false;
        }
      }
    }
  }

  public final List<ab> getFragments()
  {
    AppMethodBeat.i(119467);
    List localList = (List)a.i.b.a.c.k.h.a(this.BiB, eQB[0]);
    AppMethodBeat.o(119467);
    return localList;
  }

  public final int hashCode()
  {
    AppMethodBeat.i(119470);
    int i = this.BiD.hashCode();
    int j = this.BfP.hashCode();
    AppMethodBeat.o(119470);
    return i * 31 + j;
  }

  public final boolean isEmpty()
  {
    AppMethodBeat.i(119473);
    boolean bool = getFragments().isEmpty();
    AppMethodBeat.o(119473);
    return bool;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     a.i.b.a.c.b.c.r
 * JD-Core Version:    0.6.2
 */