package a.i.b.a.c.l;

import a.f.a.b;
import a.i.b.a.c.b.a.g.a;
import a.i.b.a.c.b.ah;
import a.i.b.a.c.b.am;
import a.i.b.a.c.b.ar;
import a.i.b.a.c.b.ay;
import a.i.b.a.c.b.b.a;
import a.i.b.a.c.b.c.z;
import a.i.b.a.c.b.e;
import a.i.b.a.c.b.l;
import a.i.b.a.c.b.y;
import a.i.b.a.c.f.f;
import a.i.b.a.c.i.e.d;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;

public final class p
{
  private static final y BJn;
  private static final p.a BJo;
  public static final ad BJp;
  private static final w BJq;
  private static final ah BJr;
  private static final Set<ah> BJs;

  static
  {
    AppMethodBeat.i(122577);
    BJn = new p.1();
    BJo = new p.a(f.avZ("<ERROR CLASS>"));
    BJp = C("<LOOP IN SUPERTYPES>", Collections.emptyList());
    BJq = C("<ERROR PROPERTY TYPE>", Collections.emptyList());
    Object localObject = BJo;
    g.a locala = a.i.b.a.c.b.a.g.BfJ;
    localObject = z.a((l)localObject, g.a.eai(), a.i.b.a.c.b.w.BeD, ay.Bfa, f.avZ("<ERROR PROPERTY>"), b.a.Bej, am.BeR);
    ((z)localObject).a(BJq, Collections.emptyList(), null, null);
    BJr = (ah)localObject;
    BJs = Collections.singleton(localObject);
    AppMethodBeat.o(122577);
  }

  public static ad C(String paramString, List<ap> paramList)
  {
    AppMethodBeat.i(122570);
    paramString = new o(awp(paramString), cw(paramString, false), paramList, false);
    AppMethodBeat.o(122570);
    return paramString;
  }

  public static boolean L(l paraml)
  {
    boolean bool = false;
    AppMethodBeat.i(122573);
    if (paraml == null)
      AppMethodBeat.o(122573);
    while (true)
    {
      return bool;
      if (((paraml instanceof p.a)) || ((paraml.dXW() instanceof p.a)) || (paraml == BJn))
      {
        bool = true;
        AppMethodBeat.o(122573);
      }
      else
      {
        AppMethodBeat.o(122573);
      }
    }
  }

  public static ad a(String paramString, an paraman)
  {
    AppMethodBeat.i(122569);
    paramString = new o(paraman, cw(paramString, false), (byte)0);
    AppMethodBeat.o(122569);
    return paramString;
  }

  private static an a(String paramString, p.a parama)
  {
    AppMethodBeat.i(122572);
    paramString = new p.2(parama, paramString);
    AppMethodBeat.o(122572);
    return paramString;
  }

  public static boolean ah(w paramw)
  {
    AppMethodBeat.i(122574);
    boolean bool;
    if ((paramw != null) && ((paramw.ejw() instanceof d)))
    {
      bool = true;
      AppMethodBeat.o(122574);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(122574);
    }
  }

  public static e awl(String paramString)
  {
    AppMethodBeat.i(122564);
    paramString = new p.a(f.avZ("<ERROR CLASS: " + paramString + ">"));
    AppMethodBeat.o(122564);
    return paramString;
  }

  public static a.i.b.a.c.i.e.h awm(String paramString)
  {
    AppMethodBeat.i(122565);
    paramString = cw(paramString, false);
    AppMethodBeat.o(122565);
    return paramString;
  }

  public static ad awn(String paramString)
  {
    AppMethodBeat.i(122567);
    paramString = C(paramString, Collections.emptyList());
    AppMethodBeat.o(122567);
    return paramString;
  }

  public static ad awo(String paramString)
  {
    AppMethodBeat.i(122568);
    paramString = a(paramString, a(paramString, BJo));
    AppMethodBeat.o(122568);
    return paramString;
  }

  public static an awp(String paramString)
  {
    AppMethodBeat.i(122571);
    paramString = a("[ERROR : " + paramString + "]", BJo);
    AppMethodBeat.o(122571);
    return paramString;
  }

  public static a.i.b.a.c.i.e.h cw(String paramString, boolean paramBoolean)
  {
    AppMethodBeat.i(122566);
    if (paramBoolean)
    {
      paramString = new p.c(paramString, (byte)0);
      AppMethodBeat.o(122566);
    }
    while (true)
    {
      return paramString;
      paramString = new b(paramString, (byte)0);
      AppMethodBeat.o(122566);
    }
  }

  public static y ekj()
  {
    return BJn;
  }

  public static final class b
    implements a.i.b.a.c.i.e.h
  {
    private final String BEz;

    private b(String paramString)
    {
      this.BEz = paramString;
    }

    public final Collection<l> a(d paramd, b<? super f, Boolean> paramb)
    {
      AppMethodBeat.i(122548);
      paramd = Collections.emptyList();
      AppMethodBeat.o(122548);
      return paramd;
    }

    public final a.i.b.a.c.b.h c(f paramf, a.i.b.a.c.c.a.a parama)
    {
      AppMethodBeat.i(122545);
      paramf = p.awl(paramf.name);
      AppMethodBeat.o(122545);
      return paramf;
    }

    public final Set<f> eau()
    {
      AppMethodBeat.i(122546);
      Set localSet = Collections.emptySet();
      AppMethodBeat.o(122546);
      return localSet;
    }

    public final Set<f> eav()
    {
      AppMethodBeat.i(122547);
      Set localSet = Collections.emptySet();
      AppMethodBeat.o(122547);
      return localSet;
    }

    public final String toString()
    {
      AppMethodBeat.i(122549);
      String str = "ErrorScope{" + this.BEz + '}';
      AppMethodBeat.o(122549);
      return str;
    }
  }

  public static final class d
    implements an
  {
    public final ar BJv;
    private final an BJw;

    public final a.i.b.a.c.b.h dYs()
    {
      AppMethodBeat.i(122562);
      a.i.b.a.c.b.h localh = this.BJw.dYs();
      AppMethodBeat.o(122562);
      return localh;
    }

    public final boolean dYu()
    {
      AppMethodBeat.i(122561);
      boolean bool = this.BJw.dYu();
      AppMethodBeat.o(122561);
      return bool;
    }

    public final a.i.b.a.c.a.g dZD()
    {
      AppMethodBeat.i(122563);
      a.i.b.a.c.a.g localg = a.i.b.a.c.i.c.a.G(this.BJv);
      AppMethodBeat.o(122563);
      return localg;
    }

    public final Collection<w> eap()
    {
      AppMethodBeat.i(122560);
      Collection localCollection = this.BJw.eap();
      AppMethodBeat.o(122560);
      return localCollection;
    }

    public final List<ar> getParameters()
    {
      AppMethodBeat.i(122559);
      List localList = this.BJw.getParameters();
      AppMethodBeat.o(122559);
      return localList;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     a.i.b.a.c.l.p
 * JD-Core Version:    0.6.2
 */