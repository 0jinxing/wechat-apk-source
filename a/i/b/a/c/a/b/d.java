package a.i.b.a.c.a.b;

import a.a.aj;
import a.a.x;
import a.f.b.j;
import a.f.b.t;
import a.f.b.v;
import a.i.b.a.c.a.g;
import a.i.b.a.c.a.g.a;
import a.i.b.a.c.b.e;
import a.i.b.a.c.b.l;
import a.i.b.a.c.b.y;
import a.i.b.a.c.f.c;
import a.i.b.a.c.k.i;
import a.i.k;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Collection;

public final class d
  implements a.i.b.a.c.b.b.b
{
  public static final d.a BdA;
  private static final a.i.b.a.c.f.b Bdx;
  private static final a.i.b.a.c.f.f Bdy;
  private static final a.i.b.a.c.f.a Bdz;
  private final a.i.b.a.c.k.f Bdu;
  private final y Bdv;
  private final a.f.a.b<y, l> Bdw;

  static
  {
    AppMethodBeat.i(119194);
    eQB = new k[] { (k)v.a(new t(v.aN(d.class), "cloneable", "getCloneable()Lorg/jetbrains/kotlin/descriptors/impl/ClassDescriptorImpl;")) };
    BdA = new d.a((byte)0);
    Bdx = g.AZV;
    Object localObject = g.Bag.Bao.ehK();
    j.o(localObject, "KotlinBuiltIns.FQ_NAMES.cloneable.shortName()");
    Bdy = (a.i.b.a.c.f.f)localObject;
    localObject = a.i.b.a.c.f.a.n(g.Bag.Bao.ehI());
    j.o(localObject, "ClassId.topLevel(KotlinB…NAMES.cloneable.toSafe())");
    Bdz = (a.i.b.a.c.f.a)localObject;
    AppMethodBeat.o(119194);
  }

  private d(i parami, y paramy, a.f.a.b<? super y, ? extends l> paramb)
  {
    AppMethodBeat.i(119199);
    this.Bdv = paramy;
    this.Bdw = paramb;
    this.Bdu = parami.i((a.f.a.a)new d.b(this, parami));
    AppMethodBeat.o(119199);
  }

  private final a.i.b.a.c.b.c.h dYC()
  {
    AppMethodBeat.i(119195);
    a.i.b.a.c.b.c.h localh = (a.i.b.a.c.b.c.h)a.i.b.a.c.k.h.a(this.Bdu, eQB[0]);
    AppMethodBeat.o(119195);
    return localh;
  }

  public final boolean a(a.i.b.a.c.f.b paramb, a.i.b.a.c.f.f paramf)
  {
    AppMethodBeat.i(119196);
    j.p(paramb, "packageFqName");
    j.p(paramf, "name");
    boolean bool;
    if ((j.j(paramf, Bdy)) && (j.j(paramb, Bdx)))
    {
      bool = true;
      AppMethodBeat.o(119196);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(119196);
    }
  }

  public final Collection<e> d(a.i.b.a.c.f.b paramb)
  {
    AppMethodBeat.i(119198);
    j.p(paramb, "packageFqName");
    if (j.j(paramb, Bdx))
    {
      paramb = (Collection)aj.setOf(dYC());
      AppMethodBeat.o(119198);
    }
    while (true)
    {
      return paramb;
      paramb = (Collection)x.AUR;
      AppMethodBeat.o(119198);
    }
  }

  public final e e(a.i.b.a.c.f.a parama)
  {
    AppMethodBeat.i(119197);
    j.p(parama, "classId");
    if (j.j(parama, Bdz))
    {
      parama = (e)dYC();
      AppMethodBeat.o(119197);
    }
    while (true)
    {
      return parama;
      parama = null;
      AppMethodBeat.o(119197);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     a.i.b.a.c.a.b.d
 * JD-Core Version:    0.6.2
 */