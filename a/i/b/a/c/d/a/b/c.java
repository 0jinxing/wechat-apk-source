package a.i.b.a.c.d.a.b;

import a.i.b.a.c.b.a.g;
import a.i.b.a.c.b.am;
import a.i.b.a.c.b.b.a;
import a.i.b.a.c.b.e;
import a.i.b.a.c.b.l;
import a.i.b.a.c.b.t;
import com.tencent.matrix.trace.core.AppMethodBeat;

public class c extends a.i.b.a.c.b.c.f
  implements b
{
  private Boolean Bmy = null;
  private Boolean Bmz = null;

  static
  {
    AppMethodBeat.i(119794);
    if (!c.class.desiredAssertionStatus());
    for (boolean bool = true; ; bool = false)
    {
      $assertionsDisabled = bool;
      AppMethodBeat.o(119794);
      return;
    }
  }

  private c(e parame, c paramc, g paramg, boolean paramBoolean, b.a parama, am paramam)
  {
    super(parame, paramc, paramg, paramBoolean, parama, paramam);
  }

  public static c a(e parame, g paramg, boolean paramBoolean, am paramam)
  {
    AppMethodBeat.i(119785);
    parame = new c(parame, null, paramg, paramBoolean, b.a.Bej, paramam);
    AppMethodBeat.o(119785);
    return parame;
  }

  private c c(l paraml, t paramt, b.a parama, a.i.b.a.c.f.f paramf, g paramg, am paramam)
  {
    AppMethodBeat.i(119790);
    if ((parama != b.a.Bej) && (parama != b.a.Bem))
    {
      paraml = new IllegalStateException("Attempt at creating a constructor that is not a declaration: \ncopy from: " + this + "\nnewOwner: " + paraml + "\nkind: " + parama);
      AppMethodBeat.o(119790);
      throw paraml;
    }
    if ((!$assertionsDisabled) && (paramf != null))
    {
      paraml = new AssertionError("Attempt to rename constructor: ".concat(String.valueOf(this)));
      AppMethodBeat.o(119790);
      throw paraml;
    }
    paraml = new c((e)paraml, (c)paramt, paramg, this.hEK, parama, paramam);
    paraml.rH(eaw());
    paraml.rI(dYW());
    AppMethodBeat.o(119790);
    return paraml;
  }

  public final boolean dYW()
  {
    AppMethodBeat.i(119788);
    if ((!$assertionsDisabled) && (this.Bmz == null))
    {
      AssertionError localAssertionError = new AssertionError("hasSynthesizedParameterNames was not set: ".concat(String.valueOf(this)));
      AppMethodBeat.o(119788);
      throw localAssertionError;
    }
    boolean bool = this.Bmz.booleanValue();
    AppMethodBeat.o(119788);
    return bool;
  }

  public final boolean eaw()
  {
    AppMethodBeat.i(119786);
    if ((!$assertionsDisabled) && (this.Bmy == null))
    {
      AssertionError localAssertionError = new AssertionError("hasStableParameterNames was not set: ".concat(String.valueOf(this)));
      AppMethodBeat.o(119786);
      throw localAssertionError;
    }
    boolean bool = this.Bmy.booleanValue();
    AppMethodBeat.o(119786);
    return bool;
  }

  public final void rH(boolean paramBoolean)
  {
    AppMethodBeat.i(119787);
    this.Bmy = Boolean.valueOf(paramBoolean);
    AppMethodBeat.o(119787);
  }

  public final void rI(boolean paramBoolean)
  {
    AppMethodBeat.i(119789);
    this.Bmz = Boolean.valueOf(paramBoolean);
    AppMethodBeat.o(119789);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     a.i.b.a.c.d.a.b.c
 * JD-Core Version:    0.6.2
 */