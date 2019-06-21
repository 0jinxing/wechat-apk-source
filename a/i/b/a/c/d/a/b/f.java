package a.i.b.a.c.d.a.b;

import a.i.b.a.c.b.a.a;
import a.i.b.a.c.b.a.g.a;
import a.i.b.a.c.b.ah;
import a.i.b.a.c.b.aj;
import a.i.b.a.c.b.am;
import a.i.b.a.c.b.au;
import a.i.b.a.c.b.az;
import a.i.b.a.c.b.b.a;
import a.i.b.a.c.b.c.aa;
import a.i.b.a.c.b.c.ab;
import a.i.b.a.c.b.c.ak;
import a.i.b.a.c.b.c.y;
import a.i.b.a.c.b.c.z;
import a.i.b.a.c.b.l;
import a.i.b.a.c.d.a.f.s;
import a.i.b.a.c.i.c;
import a.o;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.List;

public final class f extends z
  implements b
{
  private final boolean BmJ;
  private final o<a.a<?>, ?> BmK;

  private f(l paraml, a.i.b.a.c.b.a.g paramg, a.i.b.a.c.b.w paramw, az paramaz, boolean paramBoolean1, a.i.b.a.c.f.f paramf, am paramam, ah paramah, b.a parama, boolean paramBoolean2, o<a.a<?>, ?> paramo)
  {
    super(paraml, paramah, paramg, paramw, paramaz, paramBoolean1, paramf, parama, paramam, false, false, false, false, false, false);
    this.BmJ = paramBoolean2;
    this.BmK = paramo;
  }

  public static f a(l paraml, a.i.b.a.c.b.a.g paramg, a.i.b.a.c.b.w paramw, az paramaz, boolean paramBoolean1, a.i.b.a.c.f.f paramf, am paramam, boolean paramBoolean2)
  {
    AppMethodBeat.i(119806);
    paraml = new f(paraml, paramg, paramw, paramaz, paramBoolean1, paramf, paramam, null, b.a.Bej, paramBoolean2, null);
    AppMethodBeat.o(119806);
    return paraml;
  }

  public final z a(l paraml, a.i.b.a.c.b.w paramw, az paramaz, ah paramah, b.a parama, a.i.b.a.c.f.f paramf)
  {
    AppMethodBeat.i(119807);
    paraml = new f(paraml, dYn(), paramw, paramaz, this.BjC, paramf, am.BeR, paramah, parama, this.BmJ, this.BmK);
    AppMethodBeat.o(119807);
    return paraml;
  }

  public final b a(a.i.b.a.c.l.w paramw1, List<j> paramList, a.i.b.a.c.l.w paramw2, o<a.a<?>, ?> paramo)
  {
    AppMethodBeat.i(119808);
    l locall = dXW();
    Object localObject1 = dYn();
    Object localObject2 = this.Bhv;
    az localaz = this.BhQ;
    boolean bool = this.BjC;
    a.i.b.a.c.f.f localf = this.BgZ;
    am localam = dYo();
    if (dZL() == this)
    {
      paramList = null;
      localObject1 = new f(locall, (a.i.b.a.c.b.a.g)localObject1, (a.i.b.a.c.b.w)localObject2, localaz, bool, localf, localam, paramList, this.Bif, this.BmJ, paramo);
      paramo = this.Bjb;
      if (paramo == null)
        break label381;
      paramList = new aa((ah)localObject1, paramo.dYn(), paramo.Bhv, paramo.BhQ, paramo.isDefault, paramo.Bhu, paramo.BhT, this.Bif, paramo, paramo.dYo());
      paramList.Big = paramo.Big;
      paramList.K(paramw2);
    }
    while (true)
    {
      paramo = null;
      localObject2 = this.Bjc;
      if (localObject2 != null)
      {
        paramo = new ab((ah)localObject1, ((aj)localObject2).dYn(), ((aj)localObject2).dYd(), ((aj)localObject2).dYf(), ((aj)localObject2).isDefault(), ((aj)localObject2).dYm(), ((aj)localObject2).dYj(), this.Bif, (aj)localObject2, ((aj)localObject2).dYo());
        paramo.Big = paramo.Big;
        paramo.a((au)((aj)localObject2).dYV().get(0));
      }
      ((f)localObject1).a(paramList, paramo, this.Bje, this.Bjf);
      ((z)localObject1).Bjd = this.Bjd;
      if (this.BjD != null)
        ((f)localObject1).a(this.BjD);
      ((z)localObject1).BiW = dYX();
      if (paramw1 == null);
      for (paramw1 = null; ; paramw1 = c.a(this, paramw1, g.a.eai()))
      {
        ((f)localObject1).a(paramw2, this.BeK, this.BhP, paramw1);
        AppMethodBeat.o(119808);
        return localObject1;
        paramList = dZL();
        break;
        paramList = a.i.b.a.c.b.a.g.BfJ;
      }
      label381: paramList = null;
    }
  }

  public final <V> V a(a.a<V> parama)
  {
    AppMethodBeat.i(119810);
    if ((this.BmK != null) && (((a.a)this.BmK.first).equals(parama)))
    {
      parama = this.BmK.second;
      AppMethodBeat.o(119810);
    }
    while (true)
    {
      return parama;
      parama = null;
      AppMethodBeat.o(119810);
    }
  }

  public final boolean dYW()
  {
    return false;
  }

  public final boolean eab()
  {
    AppMethodBeat.i(119809);
    a.i.b.a.c.l.w localw = dZS();
    boolean bool;
    if ((this.BmJ) && (a.i.b.a.c.b.j.H(localw)) && ((!s.U(localw)) || (a.i.b.a.c.a.g.E(localw))))
    {
      bool = true;
      AppMethodBeat.o(119809);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(119809);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     a.i.b.a.c.d.a.b.f
 * JD-Core Version:    0.6.2
 */