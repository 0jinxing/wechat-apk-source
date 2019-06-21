package a.i.b.a.c.j.a.a;

import a.i.b.a.c.b.a.a;
import a.i.b.a.c.b.a.g;
import a.i.b.a.c.b.ak;
import a.i.b.a.c.b.al;
import a.i.b.a.c.b.am;
import a.i.b.a.c.b.ar;
import a.i.b.a.c.b.au;
import a.i.b.a.c.b.az;
import a.i.b.a.c.b.b.a;
import a.i.b.a.c.b.c.ad;
import a.i.b.a.c.b.c.p;
import a.i.b.a.c.b.l;
import a.i.b.a.c.b.t;
import a.i.b.a.c.e.a.o;
import a.i.b.a.c.e.a.c;
import a.i.b.a.c.e.a.h;
import a.i.b.a.c.e.a.i;
import a.i.b.a.c.f.f;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.List;
import java.util.Map;

public final class j extends ad
  implements b
{
  private final c AWq;
  private final h AWr;
  private f.a BHO;
  private final i BHd;
  private final e BHe;
  private final a.o BIx;

  private j(l paraml, al paramal, g paramg, f paramf, b.a parama, a.o paramo, c paramc, h paramh, i parami, e parame, am paramam)
  {
  }

  public final ad a(ak paramak1, ak paramak2, List<? extends ar> paramList, List<? extends au> paramList1, a.i.b.a.c.l.w paramw, a.i.b.a.c.b.w paramw1, az paramaz, Map<? extends a.a<?>, ?> paramMap, f.a parama)
  {
    AppMethodBeat.i(122416);
    a.f.b.j.p(paramList, "typeParameters");
    a.f.b.j.p(paramList1, "unsubstitutedValueParameters");
    a.f.b.j.p(paramaz, "visibility");
    a.f.b.j.p(paramMap, "userDataMap");
    a.f.b.j.p(parama, "isExperimentalCoroutineInReleaseEnvironment");
    paramak1 = super.a(paramak1, paramak2, paramList, paramList1, paramw, paramw1, paramaz, paramMap);
    this.BHO = parama;
    a.f.b.j.o(paramak1, "super.initialize(\n      …easeEnvironment\n        }");
    AppMethodBeat.o(122416);
    return paramak1;
  }

  public final p a(l paraml, t paramt, b.a parama, f paramf, g paramg, am paramam)
  {
    AppMethodBeat.i(122417);
    a.f.b.j.p(paraml, "newOwner");
    a.f.b.j.p(parama, "kind");
    a.f.b.j.p(paramg, "annotations");
    a.f.b.j.p(paramam, "source");
    al localal = (al)paramt;
    if (paramf == null)
    {
      paramt = this.BgZ;
      a.f.b.j.o(paramt, "name");
    }
    while (true)
    {
      paraml = new j(paraml, localal, paramg, paramt, parama, this.BIx, this.AWq, this.AWr, this.BHd, this.BHe, paramam);
      paraml.BHO = this.BHO;
      paraml = (p)paraml;
      AppMethodBeat.o(122417);
      return paraml;
      paramt = paramf;
    }
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
 * Qualified Name:     a.i.b.a.c.j.a.a.j
 * JD-Core Version:    0.6.2
 */