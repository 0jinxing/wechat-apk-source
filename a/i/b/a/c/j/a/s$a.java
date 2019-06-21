package a.i.b.a.c.j.a;

import a.f.b.j;
import a.i.b.a.c.b.am;
import a.i.b.a.c.e.a.c;
import a.i.b.a.c.e.a.c.b;
import a.i.b.a.c.e.a.b.a;
import a.i.b.a.c.e.a.b.c;
import a.i.b.a.c.e.a.c;
import a.i.b.a.c.e.a.h;
import a.i.b.a.c.f.a;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class s$a extends s
{
  private final a.c BGD;
  public final a.c.b BHv;
  public final a BHw;
  public final a BcB;
  public final boolean BeM;

  public s$a(a.c paramc, c paramc1, h paramh, am paramam, a parama)
  {
    super(paramc1, paramh, paramam, (byte)0);
    AppMethodBeat.i(122296);
    this.BGD = paramc;
    this.BHw = parama;
    this.BcB = r.a(paramc1, this.BGD.Btn);
    paramc1 = (a.c.b)a.i.b.a.c.e.a.b.Bwx.get(this.BGD.BsW);
    paramc = paramc1;
    if (paramc1 == null)
      paramc = a.c.b.BtF;
    this.BHv = paramc;
    paramc = a.i.b.a.c.e.a.b.Bwy.Ug(this.BGD.BsW);
    j.o(paramc, "Flags.IS_INNER.get(classProto.flags)");
    this.BeM = paramc.booleanValue();
    AppMethodBeat.o(122296);
  }

  public final a.i.b.a.c.f.b ejR()
  {
    AppMethodBeat.i(122295);
    a.i.b.a.c.f.b localb = this.BcB.ehE();
    j.o(localb, "classId.asSingleFqName()");
    AppMethodBeat.o(122295);
    return localb;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     a.i.b.a.c.j.a.s.a
 * JD-Core Version:    0.6.2
 */