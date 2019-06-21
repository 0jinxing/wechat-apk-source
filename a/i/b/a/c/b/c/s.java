package a.i.b.a.c.b.c;

import a.a.j;
import a.i.b.a.c.b.a.g;
import a.i.b.a.c.b.ak;
import a.i.b.a.c.b.am;
import a.i.b.a.c.b.ar;
import a.i.b.a.c.b.az;
import a.i.b.a.c.b.d;
import a.i.b.a.c.b.n;
import a.i.b.a.c.i.e.h;
import a.i.b.a.c.k.b;
import a.i.b.a.c.l.ad;
import a.i.b.a.c.l.an;
import a.i.b.a.c.l.as;
import a.i.b.a.c.l.au;
import a.i.b.a.c.l.av;
import a.i.b.a.c.l.ba;
import a.i.b.a.c.l.k;
import a.i.b.a.c.l.x;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public final class s
  implements a.i.b.a.c.b.e
{
  private an Bhx;
  private final a.i.b.a.c.b.e BiF;
  private final au BiG;
  private au BiH;
  private List<ar> BiI;
  private List<ar> BiJ;

  public s(a.i.b.a.c.b.e parame, au paramau)
  {
    this.BiF = parame;
    this.BiG = paramau;
  }

  private au eay()
  {
    AppMethodBeat.i(119475);
    if (this.BiH == null)
    {
      if (!this.BiG.Bik.isEmpty())
        break label45;
      this.BiH = this.BiG;
    }
    while (true)
    {
      Object localObject = this.BiH;
      AppMethodBeat.o(119475);
      return localObject;
      label45: localObject = this.BiF.dXY().getParameters();
      this.BiI = new ArrayList(((List)localObject).size());
      this.BiH = k.a((List)localObject, this.BiG.Bik, this, this.BiI);
      this.BiJ = j.b(this.BiI, new s.1(this));
    }
  }

  public final h a(as paramas)
  {
    AppMethodBeat.i(119477);
    paramas = this.BiF.a(paramas);
    if (this.BiG.Bik.isEmpty())
      AppMethodBeat.o(119477);
    while (true)
    {
      return paramas;
      paramas = new a.i.b.a.c.i.e.l(paramas, eay());
      AppMethodBeat.o(119477);
    }
  }

  public final <R, D> R a(n<R, D> paramn, D paramD)
  {
    AppMethodBeat.i(119498);
    paramn = paramn.a(this, paramD);
    AppMethodBeat.o(119498);
    return paramn;
  }

  public final a.i.b.a.c.b.l dXW()
  {
    AppMethodBeat.i(119486);
    a.i.b.a.c.b.l locall = this.BiF.dXW();
    AppMethodBeat.o(119486);
    return locall;
  }

  public final h dXX()
  {
    AppMethodBeat.i(119479);
    h localh = this.BiF.dXX();
    AppMethodBeat.o(119479);
    return localh;
  }

  public final an dXY()
  {
    AppMethodBeat.i(119476);
    Object localObject1 = this.BiF.dXY();
    if (this.BiG.Bik.isEmpty())
      AppMethodBeat.o(119476);
    while (true)
    {
      return localObject1;
      if (this.Bhx == null)
      {
        au localau = eay();
        Object localObject2 = ((an)localObject1).eap();
        localObject1 = new ArrayList(((Collection)localObject2).size());
        localObject2 = ((Collection)localObject2).iterator();
        while (((Iterator)localObject2).hasNext())
          ((Collection)localObject1).add(localau.c((a.i.b.a.c.l.w)((Iterator)localObject2).next(), ba.BKh));
        this.Bhx = new a.i.b.a.c.l.e(this, this.BiI, (Collection)localObject1, b.BIH);
      }
      localObject1 = this.Bhx;
      AppMethodBeat.o(119476);
    }
  }

  public final h dXZ()
  {
    AppMethodBeat.i(119478);
    Object localObject = this.BiF.dXZ();
    if (this.BiG.Bik.isEmpty())
      AppMethodBeat.o(119478);
    while (true)
    {
      return localObject;
      localObject = new a.i.b.a.c.i.e.l((h)localObject, eay());
      AppMethodBeat.o(119478);
    }
  }

  public final a.i.b.a.c.b.e dYa()
  {
    AppMethodBeat.i(119487);
    a.i.b.a.c.b.e locale = this.BiF.dYa();
    AppMethodBeat.o(119487);
    return locale;
  }

  public final Collection<d> dYb()
  {
    AppMethodBeat.i(119482);
    Object localObject = this.BiF.dYb();
    ArrayList localArrayList = new ArrayList(((Collection)localObject).size());
    localObject = ((Collection)localObject).iterator();
    while (((Iterator)localObject).hasNext())
    {
      d locald = (d)((Iterator)localObject).next();
      localArrayList.add(locald.a(this, locald.dYd(), locald.dYf(), locald.dYZ(), false).a(eay()));
    }
    AppMethodBeat.o(119482);
    return localArrayList;
  }

  public final a.i.b.a.c.b.f dYc()
  {
    AppMethodBeat.i(119488);
    a.i.b.a.c.b.f localf = this.BiF.dYc();
    AppMethodBeat.o(119488);
    return localf;
  }

  public final a.i.b.a.c.b.w dYd()
  {
    AppMethodBeat.i(119489);
    a.i.b.a.c.b.w localw = this.BiF.dYd();
    AppMethodBeat.o(119489);
    return localw;
  }

  public final d dYe()
  {
    AppMethodBeat.i(119500);
    d locald = this.BiF.dYe();
    AppMethodBeat.o(119500);
    return locald;
  }

  public final az dYf()
  {
    AppMethodBeat.i(119490);
    az localaz = this.BiF.dYf();
    AppMethodBeat.o(119490);
    return localaz;
  }

  public final boolean dYg()
  {
    AppMethodBeat.i(119495);
    boolean bool = this.BiF.dYg();
    AppMethodBeat.o(119495);
    return bool;
  }

  public final boolean dYh()
  {
    AppMethodBeat.i(119491);
    boolean bool = this.BiF.dYh();
    AppMethodBeat.o(119491);
    return bool;
  }

  public final boolean dYi()
  {
    AppMethodBeat.i(119492);
    boolean bool = this.BiF.dYi();
    AppMethodBeat.o(119492);
    return bool;
  }

  public final boolean dYj()
  {
    AppMethodBeat.i(119493);
    boolean bool = this.BiF.dYj();
    AppMethodBeat.o(119493);
    return bool;
  }

  public final boolean dYk()
  {
    AppMethodBeat.i(119496);
    boolean bool = this.BiF.dYk();
    AppMethodBeat.o(119496);
    return bool;
  }

  public final boolean dYl()
  {
    AppMethodBeat.i(119497);
    boolean bool = this.BiF.dYl();
    AppMethodBeat.o(119497);
    return bool;
  }

  public final boolean dYm()
  {
    AppMethodBeat.i(119494);
    boolean bool = this.BiF.dYm();
    AppMethodBeat.o(119494);
    return bool;
  }

  public final g dYn()
  {
    AppMethodBeat.i(119483);
    g localg = this.BiF.dYn();
    AppMethodBeat.o(119483);
    return localg;
  }

  public final am dYo()
  {
    return am.BeR;
  }

  public final Collection<a.i.b.a.c.b.e> dYp()
  {
    AppMethodBeat.i(119502);
    Collection localCollection = this.BiF.dYp();
    AppMethodBeat.o(119502);
    return localCollection;
  }

  public final List<ar> dYq()
  {
    AppMethodBeat.i(119501);
    eay();
    List localList = this.BiJ;
    AppMethodBeat.o(119501);
    return localList;
  }

  public final ad dZf()
  {
    AppMethodBeat.i(119480);
    Object localObject = av.ga(dXY().getParameters());
    localObject = x.a(dYn(), this, (List)localObject);
    AppMethodBeat.o(119480);
    return localObject;
  }

  public final a.i.b.a.c.f.f dZg()
  {
    AppMethodBeat.i(119484);
    a.i.b.a.c.f.f localf = this.BiF.dZg();
    AppMethodBeat.o(119484);
    return localf;
  }

  public final h dZk()
  {
    AppMethodBeat.i(119499);
    h localh = this.BiF.dZk();
    AppMethodBeat.o(119499);
    return localh;
  }

  public final ak dZl()
  {
    AppMethodBeat.i(119481);
    UnsupportedOperationException localUnsupportedOperationException = new UnsupportedOperationException();
    AppMethodBeat.o(119481);
    throw localUnsupportedOperationException;
  }

  public final a.i.b.a.c.b.e dZm()
  {
    AppMethodBeat.i(119485);
    a.i.b.a.c.b.e locale = this.BiF.dZm();
    AppMethodBeat.o(119485);
    return locale;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     a.i.b.a.c.b.c.s
 * JD-Core Version:    0.6.2
 */