package a.i.b.a.c.j.a;

import a.i.b.a.c.b.l;
import a.i.b.a.c.e.a.ae;
import a.i.b.a.c.e.a.a;
import a.i.b.a.c.e.a.c;
import a.i.b.a.c.e.a.h;
import a.i.b.a.c.j.a.a.e;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.List;

public final class k
{
  public final c AWq;
  public final h AWr;
  private final a BGE;
  public final w BHb;
  public final q BHc;
  final a.i.b.a.c.e.a.i BHd;
  final e BHe;
  public final l Bht;
  public final i Brl;

  public k(i parami, c paramc, l paraml, h paramh, a.i.b.a.c.e.a.i parami1, a parama, e parame, w paramw, List<a.ae> paramList)
  {
    AppMethodBeat.i(122269);
    this.Brl = parami;
    this.AWq = paramc;
    this.Bht = paraml;
    this.AWr = paramh;
    this.BHd = parami1;
    this.BGE = parama;
    this.BHe = parame;
    this.BHb = new w(this, paramw, paramList, "Deserializer for " + this.Bht.dZg(), (byte)0);
    this.BHc = new q(this);
    AppMethodBeat.o(122269);
  }

  public final k a(l paraml, List<a.ae> paramList, c paramc, h paramh, a.i.b.a.c.e.a.i parami, a parama)
  {
    AppMethodBeat.i(122267);
    a.f.b.j.p(paraml, "descriptor");
    a.f.b.j.p(paramList, "typeParameterProtos");
    a.f.b.j.p(paramc, "nameResolver");
    a.f.b.j.p(paramh, "typeTable");
    a.f.b.j.p(parami, "versionRequirementTable");
    a.f.b.j.p(parama, "metadataVersion");
    i locali = this.Brl;
    a.f.b.j.p(parama, "version");
    if (a.i.b.a.c.e.a.j.a(parama));
    while (true)
    {
      paraml = new k(locali, paramc, paraml, paramh, parami, parama, this.BHe, this.BHb, paramList);
      AppMethodBeat.o(122267);
      return paraml;
      parami = this.BHd;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     a.i.b.a.c.j.a.k
 * JD-Core Version:    0.6.2
 */