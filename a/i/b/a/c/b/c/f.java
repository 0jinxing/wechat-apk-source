package a.i.b.a.c.b.c;

import a.i.b.a.c.b.a.g;
import a.i.b.a.c.b.ak;
import a.i.b.a.c.b.am;
import a.i.b.a.c.b.ar;
import a.i.b.a.c.b.az;
import a.i.b.a.c.b.b;
import a.i.b.a.c.b.b.a;
import a.i.b.a.c.b.d;
import a.i.b.a.c.b.e;
import a.i.b.a.c.b.k;
import a.i.b.a.c.b.l;
import a.i.b.a.c.b.n;
import a.i.b.a.c.b.t;
import a.i.b.a.c.b.w;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;

public class f extends p
  implements d
{
  private static final a.i.b.a.c.f.f Bhs;
  protected final boolean hEK;

  static
  {
    AppMethodBeat.i(119421);
    if (!f.class.desiredAssertionStatus());
    for (boolean bool = true; ; bool = false)
    {
      $assertionsDisabled = bool;
      Bhs = a.i.b.a.c.f.f.avZ("<init>");
      AppMethodBeat.o(119421);
      return;
    }
  }

  protected f(e parame, k paramk, g paramg, boolean paramBoolean, b.a parama, am paramam)
  {
    super(parame, paramk, paramg, Bhs, parama, paramam);
    this.hEK = paramBoolean;
  }

  public static f a(e parame, g paramg, am paramam)
  {
    AppMethodBeat.i(119397);
    parame = new f(parame, null, paramg, true, b.a.Bej, paramam);
    AppMethodBeat.o(119397);
    return parame;
  }

  public final f a(List<a.i.b.a.c.b.au> paramList, az paramaz)
  {
    AppMethodBeat.i(119399);
    a(paramList, paramaz, ((e)super.dXW()).dYq());
    AppMethodBeat.o(119399);
    return this;
  }

  public final f a(List<a.i.b.a.c.b.au> paramList, az paramaz, List<ar> paramList1)
  {
    AppMethodBeat.i(119398);
    Object localObject = (e)super.dXW();
    if (((e)localObject).dYh())
    {
      localObject = ((e)localObject).dXW();
      if (!(localObject instanceof e));
    }
    for (localObject = ((e)localObject).dZl(); ; localObject = null)
    {
      super.a(null, (ak)localObject, paramList1, paramList, null, w.BeB, paramaz);
      AppMethodBeat.o(119398);
      return this;
    }
  }

  public final d a(l paraml, w paramw, az paramaz, b.a parama, boolean paramBoolean)
  {
    AppMethodBeat.i(119407);
    paraml = (d)super.b(paraml, paramw, paramaz, parama, paramBoolean);
    AppMethodBeat.o(119407);
    return paraml;
  }

  public final d a(a.i.b.a.c.l.au paramau)
  {
    AppMethodBeat.i(119402);
    paramau = (d)super.c(paramau);
    AppMethodBeat.o(119402);
    return paramau;
  }

  public final <R, D> R a(n<R, D> paramn, D paramD)
  {
    AppMethodBeat.i(119403);
    paramn = paramn.a(this, paramD);
    AppMethodBeat.o(119403);
    return paramn;
  }

  protected f b(l paraml, t paramt, b.a parama, a.i.b.a.c.f.f paramf, g paramg, am paramam)
  {
    AppMethodBeat.i(119406);
    if ((parama != b.a.Bej) && (parama != b.a.Bem))
    {
      paraml = new IllegalStateException("Attempt at creating a constructor that is not a declaration: \ncopy from: " + this + "\nnewOwner: " + paraml + "\nkind: " + parama);
      AppMethodBeat.o(119406);
      throw paraml;
    }
    if ((!$assertionsDisabled) && (paramf != null))
    {
      paraml = new AssertionError("Attempt to rename constructor: ".concat(String.valueOf(this)));
      AppMethodBeat.o(119406);
      throw paraml;
    }
    paraml = new f((e)paraml, this, paramg, this.hEK, b.a.Bej, paramam);
    AppMethodBeat.o(119406);
    return paraml;
  }

  public final Collection<? extends t> dYX()
  {
    AppMethodBeat.i(119404);
    Set localSet = Collections.emptySet();
    AppMethodBeat.o(119404);
    return localSet;
  }

  public final d dZj()
  {
    AppMethodBeat.i(119401);
    d locald = (d)super.dZp();
    AppMethodBeat.o(119401);
    return locald;
  }

  public final e eas()
  {
    AppMethodBeat.i(138675);
    e locale = (e)super.dXW();
    AppMethodBeat.o(138675);
    return locale;
  }

  public final void k(Collection<? extends b> paramCollection)
  {
    AppMethodBeat.i(119405);
    if ((!$assertionsDisabled) && (!paramCollection.isEmpty()))
    {
      paramCollection = new AssertionError("Constructors cannot override anything");
      AppMethodBeat.o(119405);
      throw paramCollection;
    }
    AppMethodBeat.o(119405);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     a.i.b.a.c.b.c.f
 * JD-Core Version:    0.6.2
 */