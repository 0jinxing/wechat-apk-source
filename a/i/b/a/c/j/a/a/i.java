package a.i.b.a.c.j.a.a;

import a.f.b.j;
import a.i.b.a.c.b.a.g;
import a.i.b.a.c.b.ah;
import a.i.b.a.c.b.aj;
import a.i.b.a.c.b.am;
import a.i.b.a.c.b.az;
import a.i.b.a.c.b.c.aa;
import a.i.b.a.c.b.c.ak;
import a.i.b.a.c.b.c.z;
import a.i.b.a.c.b.l;
import a.i.b.a.c.b.r;
import a.i.b.a.c.b.w;
import a.i.b.a.c.e.a.u;
import a.i.b.a.c.e.a.c;
import a.i.b.a.c.e.a.h;
import a.i.b.a.c.f.f;
import a.y;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class i extends z
  implements b
{
  public final a.u AWo;
  public final c AWq;
  public final h AWr;
  private f.a BHO;
  private final a.i.b.a.c.e.a.i BHd;
  public final e BHe;

  public i(l paraml, ah paramah, g paramg, w paramw, az paramaz, boolean paramBoolean1, f paramf, a.i.b.a.c.b.b.a parama, boolean paramBoolean2, boolean paramBoolean3, boolean paramBoolean4, boolean paramBoolean5, boolean paramBoolean6, a.u paramu, c paramc, h paramh, a.i.b.a.c.e.a.i parami, e parame)
  {
    super(paraml, paramah, paramg, paramw, paramaz, paramBoolean1, paramf, parama, am.BeR, paramBoolean2, paramBoolean3, paramBoolean6, false, paramBoolean4, paramBoolean5);
    AppMethodBeat.i(122415);
    this.AWo = paramu;
    this.AWq = paramc;
    this.AWr = paramh;
    this.BHd = parami;
    this.BHe = parame;
    this.BHO = f.a.BIi;
    AppMethodBeat.o(122415);
  }

  public final z a(l paraml, w paramw, az paramaz, ah paramah, a.i.b.a.c.b.b.a parama, f paramf)
  {
    AppMethodBeat.i(122413);
    j.p(paraml, "newOwner");
    j.p(paramw, "newModality");
    j.p(paramaz, "newVisibility");
    j.p(parama, "kind");
    j.p(paramf, "newName");
    paraml = (z)new i(paraml, paramah, dYn(), paramw, paramaz, this.BjC, paramf, parama, this.BiY, eab(), dYm(), this.Bja, this.BhV, this.AWo, this.AWq, this.AWr, this.BHd, this.BHe);
    AppMethodBeat.o(122413);
    return paraml;
  }

  public final void a(aa paramaa, aj paramaj, r paramr1, r paramr2, f.a parama)
  {
    AppMethodBeat.i(122412);
    j.p(parama, "isExperimentalCoroutineInReleaseEnvironment");
    super.a(paramaa, paramaj, paramr1, paramr2);
    paramaa = y.AUy;
    this.BHO = parama;
    AppMethodBeat.o(122412);
  }

  public final boolean dYm()
  {
    AppMethodBeat.i(122414);
    Boolean localBoolean = a.i.b.a.c.e.a.b.BwS.Ug(this.AWo.BsW);
    j.o(localBoolean, "Flags.IS_EXTERNAL_PROPERTY.get(proto.flags)");
    boolean bool = localBoolean.booleanValue();
    AppMethodBeat.o(122414);
    return bool;
  }

  public final c ejV()
  {
    return this.AWq;
  }

  public final h ejW()
  {
    return this.AWr;
  }

  public final e ejX()
  {
    return this.BHe;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     a.i.b.a.c.j.a.a.i
 * JD-Core Version:    0.6.2
 */