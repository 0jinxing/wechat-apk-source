package a.i.b.a.c.j.a.a;

import a.f.b.j;
import a.i.b.a.c.b.a.g;
import a.i.b.a.c.b.am;
import a.i.b.a.c.b.ar;
import a.i.b.a.c.b.as;
import a.i.b.a.c.b.az;
import a.i.b.a.c.b.c.af;
import a.i.b.a.c.b.c.d;
import a.i.b.a.c.b.l;
import a.i.b.a.c.e.a.ab;
import a.i.b.a.c.e.a.c;
import a.i.b.a.c.i.e.h.b;
import a.i.b.a.c.l.ad;
import a.i.b.a.c.l.an;
import a.i.b.a.c.l.av;
import a.i.b.a.c.l.w;
import a.i.b.a.c.l.y;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Collection;
import java.util.List;

public final class k extends d
  implements f
{
  private final c AWq;
  private final a.i.b.a.c.e.a.h AWr;
  private f.a BHO;
  private final a.i.b.a.c.e.a.i BHd;
  private final e BHe;
  private ad BIA;
  private ad BIB;
  private final a.ab BIC;
  private Collection<? extends af> BIy;
  private ad BIz;
  private final a.i.b.a.c.k.i Baf;
  private List<? extends ar> BiI;

  public k(a.i.b.a.c.k.i parami, l paraml, g paramg, a.i.b.a.c.f.f paramf, az paramaz, a.ab paramab, c paramc, a.i.b.a.c.e.a.h paramh, a.i.b.a.c.e.a.i parami1, e parame)
  {
    super(paraml, paramg, paramf, localam, paramaz);
    AppMethodBeat.i(122426);
    this.Baf = parami;
    this.BIC = paramab;
    this.AWq = paramc;
    this.AWr = paramh;
    this.BHd = parami1;
    this.BHe = parame;
    this.BHO = f.a.BIi;
    AppMethodBeat.o(122426);
  }

  public final void a(List<? extends ar> paramList, ad paramad1, ad paramad2, f.a parama)
  {
    AppMethodBeat.i(122421);
    j.p(paramList, "declaredTypeParameters");
    j.p(paramad1, "underlyingType");
    j.p(paramad2, "expandedType");
    j.p(parama, "isExperimentalCoroutineInReleaseEnvironment");
    j.p(paramList, "declaredTypeParameters");
    this.Bhf = paramList;
    this.BIz = paramad1;
    this.BIA = paramad2;
    this.BiI = as.a(this);
    paramad2 = (a.i.b.a.c.b.h)this;
    paramList = dZR();
    if (paramList != null)
    {
      paramad1 = paramList.dXZ();
      paramList = paramad1;
      if (paramad1 != null);
    }
    else
    {
      paramList = (a.i.b.a.c.i.e.h)h.b.BGh;
    }
    paramList = av.a(paramad2, paramList);
    j.o(paramList, "TypeUtils.makeUnsubstitu…ope ?: MemberScope.Empty)");
    this.BIB = paramList;
    this.BIy = eal();
    this.BHO = parama;
    AppMethodBeat.o(122421);
  }

  public final ad dZP()
  {
    AppMethodBeat.i(122419);
    ad localad = this.BIz;
    if (localad == null)
      j.avw("underlyingType");
    AppMethodBeat.o(122419);
    return localad;
  }

  public final ad dZQ()
  {
    AppMethodBeat.i(122420);
    ad localad = this.BIA;
    if (localad == null)
      j.avw("expandedType");
    AppMethodBeat.o(122420);
    return localad;
  }

  public final a.i.b.a.c.b.e dZR()
  {
    Object localObject = null;
    AppMethodBeat.i(122422);
    if (y.an((w)dZQ()))
      AppMethodBeat.o(122422);
    while (true)
    {
      return localObject;
      a.i.b.a.c.b.h localh = dZQ().ejw().dYs();
      localObject = localh;
      if (!(localh instanceof a.i.b.a.c.b.e))
        localObject = null;
      localObject = (a.i.b.a.c.b.e)localObject;
      AppMethodBeat.o(122422);
    }
  }

  public final ad dZf()
  {
    AppMethodBeat.i(122423);
    ad localad = this.BIB;
    if (localad == null)
      j.avw("defaultTypeImpl");
    AppMethodBeat.o(122423);
    return localad;
  }

  public final a.i.b.a.c.k.i eak()
  {
    return this.Baf;
  }

  public final List<ar> eao()
  {
    AppMethodBeat.i(122425);
    List localList = this.BiI;
    if (localList == null)
      j.avw("typeConstructorParameters");
    AppMethodBeat.o(122425);
    return localList;
  }

  public final c ejV()
  {
    return this.AWq;
  }

  public final a.i.b.a.c.e.a.h ejW()
  {
    return this.AWr;
  }

  public final e ejX()
  {
    return this.BHe;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     a.i.b.a.c.j.a.a.k
 * JD-Core Version:    0.6.2
 */