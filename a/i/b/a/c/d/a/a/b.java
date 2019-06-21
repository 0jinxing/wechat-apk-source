package a.i.b.a.c.d.a.a;

import a.a.ad;
import a.f.b.t;
import a.f.b.v;
import a.i.b.a.c.b.a.c;
import a.i.b.a.c.b.am;
import a.i.b.a.c.d.a.c.h;
import a.i.b.a.c.d.a.e.l;
import a.i.b.a.c.k.i;
import a.i.k;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Map;

public class b
  implements c
{
  final a.i.b.a.c.f.b BfP;
  private final am Bfq;
  private final a.i.b.a.c.k.f BlR;
  final a.i.b.a.c.d.a.e.b BlS;

  static
  {
    AppMethodBeat.i(119752);
    eQB = new k[] { (k)v.a(new t(v.aN(b.class), "type", "getType()Lorg/jetbrains/kotlin/types/SimpleType;")) };
    AppMethodBeat.o(119752);
  }

  public b(h paramh, a.i.b.a.c.d.a.e.a parama, a.i.b.a.c.f.b paramb)
  {
    AppMethodBeat.i(119755);
    this.BfP = paramb;
    if (parama != null)
    {
      paramb = (am)paramh.Bnv.BmZ.a((l)parama);
      this.Bfq = paramb;
      this.BlR = paramh.Bnv.Baf.i((a.f.a.a)new b.a(this, paramh));
      if (parama == null)
        break label127;
    }
    label127: for (paramh = (a.i.b.a.c.d.a.e.b)a.a.j.f((Iterable)parama.ebz()); ; paramh = null)
    {
      this.BlS = paramh;
      AppMethodBeat.o(119755);
      return;
      paramb = am.BeR;
      a.f.b.j.o(paramb, "SourceElement.NO_SOURCE");
      break;
    }
  }

  public final am dYo()
  {
    return this.Bfq;
  }

  public final a.i.b.a.c.f.b dZF()
  {
    return this.BfP;
  }

  public Map<a.i.b.a.c.f.f, a.i.b.a.c.i.b.f<?>> eah()
  {
    AppMethodBeat.i(119754);
    Map localMap = ad.emptyMap();
    AppMethodBeat.o(119754);
    return localMap;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     a.i.b.a.c.d.a.a.b
 * JD-Core Version:    0.6.2
 */