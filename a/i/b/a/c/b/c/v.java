package a.i.b.a.c.b.c;

import a.a.e;
import a.a.x;
import a.aa;
import a.f.a.a;
import a.i.b.a.c.b.a.g.a;
import a.i.b.a.c.b.ac;
import a.i.b.a.c.b.l;
import a.i.b.a.c.b.n;
import a.i.b.a.c.b.y;
import a.i.b.a.c.k.c;
import a.i.k;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class v extends j
  implements y
{
  private final a.i.b.a.c.k.i Baf;
  private final a.i.b.a.c.a.g BfO;
  private final Map<Object<? extends Object>, Object> BiO;
  private t BiP;
  private ac BiQ;
  private final c<a.i.b.a.c.f.b, a.i.b.a.c.b.ad> BiR;
  private final a.f BiS;
  private final a.i.b.a.c.f.f BiT;
  private boolean bYN;

  static
  {
    AppMethodBeat.i(119509);
    eQB = new k[] { (k)a.f.b.v.a(new a.f.b.t(a.f.b.v.aN(v.class), "packageFragmentProviderForWholeModuleWithDependencies", "getPackageFragmentProviderForWholeModuleWithDependencies()Lorg/jetbrains/kotlin/descriptors/impl/CompositePackageFragmentProvider;")) };
    AppMethodBeat.o(119509);
  }

  public v(a.i.b.a.c.f.f paramf, a.i.b.a.c.k.i parami, a.i.b.a.c.a.g paramg)
  {
    this(paramf, parami, paramg, null, 48);
  }

  private v(a.i.b.a.c.f.f paramf, a.i.b.a.c.k.i parami, a.i.b.a.c.a.g paramg, Map<Object<?>, ? extends Object> paramMap)
  {
    super(g.a.eai(), paramf);
    AppMethodBeat.i(119522);
    this.Baf = parami;
    this.BfO = paramg;
    this.BiT = null;
    if (!paramf.ByZ)
    {
      paramf = (Throwable)new IllegalArgumentException("Module name must be special: ".concat(String.valueOf(paramf)));
      AppMethodBeat.o(119522);
      throw paramf;
    }
    paramf = a.a.ad.emptyMap();
    a.f.b.j.p(paramMap, "receiver$0");
    a.f.b.j.p(paramf, "map");
    parami = new LinkedHashMap(paramMap);
    parami.putAll(paramf);
    this.BiO = ((Map)parami);
    this.bYN = true;
    this.BiR = this.Baf.f((a.f.a.b)new v.b(this));
    this.BiS = a.g.g((a)new v.a(this));
    AppMethodBeat.o(119522);
  }

  private void a(t paramt)
  {
    AppMethodBeat.i(119514);
    a.f.b.j.p(paramt, "dependencies");
    if (this.BiP == null);
    for (int i = 1; (aa.AUz) && (i == 0); i = 0)
    {
      paramt = (Throwable)new AssertionError("Dependencies of " + getId() + " were already set");
      AppMethodBeat.o(119514);
      throw paramt;
    }
    this.BiP = paramt;
    AppMethodBeat.o(119514);
  }

  private void a(List<v> paramList, Set<v> paramSet)
  {
    AppMethodBeat.i(119517);
    a.f.b.j.p(paramList, "descriptors");
    a.f.b.j.p(paramSet, "friends");
    a((t)new u(paramList, paramSet, (List)a.a.v.AUP));
    AppMethodBeat.o(119517);
  }

  private void eaC()
  {
    AppMethodBeat.i(119510);
    if (!this.bYN)
    {
      Throwable localThrowable = (Throwable)new a.i.b.a.c.b.u("Accessing invalid module descriptor ".concat(String.valueOf(this)));
      AppMethodBeat.o(119510);
      throw localThrowable;
    }
    AppMethodBeat.o(119510);
  }

  private final i eaD()
  {
    AppMethodBeat.i(119513);
    i locali = (i)this.BiS.getValue();
    AppMethodBeat.o(119513);
    return locali;
  }

  private void fU(List<v> paramList)
  {
    AppMethodBeat.i(119516);
    a.f.b.j.p(paramList, "descriptors");
    a(paramList, (Set)x.AUR);
    AppMethodBeat.o(119516);
  }

  private final String getId()
  {
    AppMethodBeat.i(119519);
    String str = this.BgZ.toString();
    a.f.b.j.o(str, "name.toString()");
    AppMethodBeat.o(119519);
    return str;
  }

  private final boolean isInitialized()
  {
    if (this.BiQ != null);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public final <R, D> R a(n<R, D> paramn, D paramD)
  {
    AppMethodBeat.i(119524);
    a.f.b.j.p(paramn, "visitor");
    a.f.b.j.p(paramn, "visitor");
    paramn = paramn.a(this, paramD);
    AppMethodBeat.o(119524);
    return paramn;
  }

  public final Collection<a.i.b.a.c.f.b> a(a.i.b.a.c.f.b paramb, a.f.a.b<? super a.i.b.a.c.f.f, Boolean> paramb1)
  {
    AppMethodBeat.i(119512);
    a.f.b.j.p(paramb, "fqName");
    a.f.b.j.p(paramb1, "nameFilter");
    eaC();
    paramb = eaE().a(paramb, paramb1);
    AppMethodBeat.o(119512);
    return paramb;
  }

  public final void a(ac paramac)
  {
    AppMethodBeat.i(119520);
    a.f.b.j.p(paramac, "providerForModuleContent");
    if (!isInitialized());
    for (int i = 1; (aa.AUz) && (i == 0); i = 0)
    {
      paramac = (Throwable)new AssertionError("Attempt to initialize module " + getId() + " twice");
      AppMethodBeat.o(119520);
      throw paramac;
    }
    this.BiQ = paramac;
    AppMethodBeat.o(119520);
  }

  public final void a(v[] paramArrayOfv)
  {
    AppMethodBeat.i(119515);
    a.f.b.j.p(paramArrayOfv, "descriptors");
    fU(e.Q(paramArrayOfv));
    AppMethodBeat.o(119515);
  }

  public final boolean a(y paramy)
  {
    AppMethodBeat.i(119518);
    a.f.b.j.p(paramy, "targetModule");
    if (!a.f.b.j.j((v)this, paramy))
    {
      t localt = this.BiP;
      if (localt == null)
        a.f.b.j.dWJ();
      if (!a.a.j.a((Iterable)localt.eaA(), paramy))
      {
        localt = this.BiP;
        if (localt == null)
        {
          paramy = (Throwable)new AssertionError("Dependencies of module " + getId() + " were not set");
          AppMethodBeat.o(119518);
          throw paramy;
        }
        if (!localt.eaB().contains(paramy))
          break label131;
      }
    }
    boolean bool = true;
    AppMethodBeat.o(119518);
    while (true)
    {
      return bool;
      label131: bool = false;
      AppMethodBeat.o(119518);
    }
  }

  public final l dXW()
  {
    return null;
  }

  public final a.i.b.a.c.a.g dZD()
  {
    return this.BfO;
  }

  public final ac eaE()
  {
    AppMethodBeat.i(119521);
    eaC();
    ac localac = (ac)eaD();
    AppMethodBeat.o(119521);
    return localac;
  }

  public final a.i.b.a.c.b.ad g(a.i.b.a.c.f.b paramb)
  {
    AppMethodBeat.i(119511);
    a.f.b.j.p(paramb, "fqName");
    eaC();
    paramb = (a.i.b.a.c.b.ad)this.BiR.am(paramb);
    AppMethodBeat.o(119511);
    return paramb;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     a.i.b.a.c.b.c.v
 * JD-Core Version:    0.6.2
 */