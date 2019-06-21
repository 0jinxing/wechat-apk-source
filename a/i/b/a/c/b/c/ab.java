package a.i.b.a.c.b.c;

import a.i.b.a.c.b.ah;
import a.i.b.a.c.b.aj;
import a.i.b.a.c.b.am;
import a.i.b.a.c.b.au;
import a.i.b.a.c.b.az;
import a.i.b.a.c.b.b.a;
import a.i.b.a.c.b.n;
import a.i.b.a.c.f.f;
import a.i.b.a.c.i.c.a;
import a.i.b.a.c.l.ad;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ab extends y
  implements aj
{
  private au Bjk;
  private final aj Bjl;

  static
  {
    AppMethodBeat.i(119572);
    if (!ab.class.desiredAssertionStatus());
    for (boolean bool = true; ; bool = false)
    {
      $assertionsDisabled = bool;
      AppMethodBeat.o(119572);
      return;
    }
  }

  public ab(ah paramah, a.i.b.a.c.b.a.g paramg, a.i.b.a.c.b.w paramw, az paramaz, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, b.a parama, aj paramaj, am paramam)
  {
    super(paramw, paramaz, paramah, paramg, f.avZ("<set-" + paramah.dZg() + ">"), paramBoolean1, paramBoolean2, paramBoolean3, parama, paramam);
    AppMethodBeat.i(119565);
    if (paramaj != null);
    for (paramah = paramaj; ; paramah = this)
    {
      this.Bjl = paramah;
      AppMethodBeat.o(119565);
      return;
    }
  }

  public static ai a(aj paramaj, a.i.b.a.c.l.w paramw, a.i.b.a.c.b.a.g paramg)
  {
    AppMethodBeat.i(119567);
    paramaj = new ai(paramaj, null, 0, paramg, f.avZ("<set-?>"), paramw, false, false, false, null, am.BeR);
    AppMethodBeat.o(119567);
    return paramaj;
  }

  public final <R, D> R a(n<R, D> paramn, D paramD)
  {
    AppMethodBeat.i(119571);
    paramn = paramn.a(this, paramD);
    AppMethodBeat.o(119571);
    return paramn;
  }

  public final void a(au paramau)
  {
    AppMethodBeat.i(119566);
    if ((!$assertionsDisabled) && (this.Bjk != null))
    {
      paramau = new AssertionError();
      AppMethodBeat.o(119566);
      throw paramau;
    }
    this.Bjk = paramau;
    AppMethodBeat.o(119566);
  }

  public final a.i.b.a.c.l.w dYT()
  {
    AppMethodBeat.i(119570);
    ad localad = a.G(this).dXO();
    AppMethodBeat.o(119570);
    return localad;
  }

  public final List<au> dYV()
  {
    AppMethodBeat.i(119569);
    if (this.Bjk == null)
    {
      localObject = new IllegalStateException();
      AppMethodBeat.o(119569);
      throw ((Throwable)localObject);
    }
    Object localObject = Collections.singletonList(this.Bjk);
    AppMethodBeat.o(119569);
    return localObject;
  }

  public final Collection<? extends aj> dYX()
  {
    AppMethodBeat.i(119568);
    Collection localCollection = super.rJ(false);
    AppMethodBeat.o(119568);
    return localCollection;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     a.i.b.a.c.b.c.ab
 * JD-Core Version:    0.6.2
 */