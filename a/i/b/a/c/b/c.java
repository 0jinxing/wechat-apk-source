package a.i.b.a.c.b;

import a.f.b.j;
import a.i.b.a.c.b.a.g;
import a.i.b.a.c.f.f;
import a.i.b.a.c.l.ad;
import a.i.b.a.c.l.an;
import a.i.b.a.c.l.ba;
import a.i.b.a.c.l.w;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.List;

final class c
  implements ar
{
  private final ar Beo;
  private final l Bep;
  private final int Beq;

  public c(ar paramar, l paraml, int paramInt)
  {
    AppMethodBeat.i(119252);
    this.Beo = paramar;
    this.Bep = paraml;
    this.Beq = paramInt;
    AppMethodBeat.o(119252);
  }

  public final <R, D> R a(n<R, D> paramn, D paramD)
  {
    AppMethodBeat.i(119254);
    paramn = this.Beo.a(paramn, paramD);
    AppMethodBeat.o(119254);
    return paramn;
  }

  public final List<w> dWP()
  {
    AppMethodBeat.i(119259);
    List localList = this.Beo.dWP();
    AppMethodBeat.o(119259);
    return localList;
  }

  public final l dXW()
  {
    return this.Bep;
  }

  public final an dXY()
  {
    AppMethodBeat.i(119258);
    an localan = this.Beo.dXY();
    AppMethodBeat.o(119258);
    return localan;
  }

  public final g dYn()
  {
    AppMethodBeat.i(119253);
    g localg = this.Beo.dYn();
    AppMethodBeat.o(119253);
    return localg;
  }

  public final am dYo()
  {
    AppMethodBeat.i(119257);
    am localam = this.Beo.dYo();
    AppMethodBeat.o(119257);
    return localam;
  }

  public final boolean dZb()
  {
    return true;
  }

  public final ar dZc()
  {
    AppMethodBeat.i(119247);
    ar localar = this.Beo.dZc();
    j.o(localar, "originalDescriptor.original");
    AppMethodBeat.o(119247);
    return localar;
  }

  public final ad dZf()
  {
    AppMethodBeat.i(119255);
    ad localad = this.Beo.dZf();
    AppMethodBeat.o(119255);
    return localad;
  }

  public final f dZg()
  {
    AppMethodBeat.i(119256);
    f localf = this.Beo.dZg();
    AppMethodBeat.o(119256);
    return localf;
  }

  public final ba dZh()
  {
    AppMethodBeat.i(119260);
    ba localba = this.Beo.dZh();
    AppMethodBeat.o(119260);
    return localba;
  }

  public final boolean dZi()
  {
    AppMethodBeat.i(119261);
    boolean bool = this.Beo.dZi();
    AppMethodBeat.o(119261);
    return bool;
  }

  public final int getIndex()
  {
    AppMethodBeat.i(119250);
    int i = this.Beq;
    int j = this.Beo.getIndex();
    AppMethodBeat.o(119250);
    return i + j;
  }

  public final String toString()
  {
    AppMethodBeat.i(119251);
    String str = this.Beo.toString() + "[inner-copy]";
    AppMethodBeat.o(119251);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     a.i.b.a.c.b.c
 * JD-Core Version:    0.6.2
 */