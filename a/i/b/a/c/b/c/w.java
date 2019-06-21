package a.i.b.a.c.b.c;

import a.i.b.a.c.b.a.g.a;
import a.i.b.a.c.b.am;
import a.i.b.a.c.b.ar;
import a.i.b.a.c.b.az;
import a.i.b.a.c.b.d;
import a.i.b.a.c.b.l;
import a.i.b.a.c.i.e.h;
import a.i.b.a.c.i.e.h.b;
import a.i.b.a.c.k.i;
import a.i.b.a.c.l.an;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class w extends g
{
  private final i Baf;
  private List<ar> BeK;
  private final boolean BeM;
  public az BhQ;
  private a.i.b.a.c.b.w Bhv;
  private final a.i.b.a.c.b.f Bhw;
  private an Bhx;
  private final Collection<a.i.b.a.c.l.w> BiV;

  static
  {
    AppMethodBeat.i(119535);
    if (!w.class.desiredAssertionStatus());
    for (boolean bool = true; ; bool = false)
    {
      $assertionsDisabled = bool;
      AppMethodBeat.o(119535);
      return;
    }
  }

  public w(l paraml, a.i.b.a.c.b.f paramf, a.i.b.a.c.f.f paramf1, am paramam, i parami)
  {
    super(parami, paraml, paramf1, paramam);
    AppMethodBeat.i(119527);
    this.BiV = new ArrayList();
    this.Baf = parami;
    if ((!$assertionsDisabled) && (paramf == a.i.b.a.c.b.f.Bew))
    {
      paraml = new AssertionError("Fix isCompanionObject()");
      AppMethodBeat.o(119527);
      throw paraml;
    }
    this.Bhw = paramf;
    this.BeM = false;
    AppMethodBeat.o(119527);
  }

  public final void b(a.i.b.a.c.b.w paramw)
  {
    AppMethodBeat.i(119529);
    if ((!$assertionsDisabled) && (paramw == a.i.b.a.c.b.w.BeC))
    {
      paramw = new AssertionError("Implement getSealedSubclasses() for this class: " + getClass());
      AppMethodBeat.o(119529);
      throw paramw;
    }
    this.Bhv = paramw;
    AppMethodBeat.o(119529);
  }

  public final h dXX()
  {
    return h.b.BGh;
  }

  public final an dXY()
  {
    return this.Bhx;
  }

  public final h dXZ()
  {
    return h.b.BGh;
  }

  public final a.i.b.a.c.b.e dYa()
  {
    return null;
  }

  public final a.i.b.a.c.b.f dYc()
  {
    return this.Bhw;
  }

  public final a.i.b.a.c.b.w dYd()
  {
    return this.Bhv;
  }

  public final d dYe()
  {
    return null;
  }

  public final az dYf()
  {
    return this.BhQ;
  }

  public final boolean dYg()
  {
    return false;
  }

  public final boolean dYh()
  {
    return this.BeM;
  }

  public final boolean dYi()
  {
    return false;
  }

  public final boolean dYj()
  {
    return false;
  }

  public final boolean dYk()
  {
    return false;
  }

  public final boolean dYl()
  {
    return false;
  }

  public final a.i.b.a.c.b.a.g dYn()
  {
    AppMethodBeat.i(119528);
    Object localObject = a.i.b.a.c.b.a.g.BfJ;
    localObject = g.a.eai();
    AppMethodBeat.o(119528);
    return localObject;
  }

  public final Collection<a.i.b.a.c.b.e> dYp()
  {
    AppMethodBeat.i(119532);
    List localList = Collections.emptyList();
    AppMethodBeat.o(119532);
    return localList;
  }

  public final List<ar> dYq()
  {
    return this.BeK;
  }

  public final void eaF()
  {
    AppMethodBeat.i(119531);
    if ((!$assertionsDisabled) && (this.Bhx != null))
    {
      localObject = new AssertionError(this.Bhx);
      AppMethodBeat.o(119531);
      throw ((Throwable)localObject);
    }
    this.Bhx = new a.i.b.a.c.l.e(this, this.BeK, this.BiV, this.Baf);
    Object localObject = Collections.emptySet().iterator();
    while (((Iterator)localObject).hasNext())
      ((f)((Iterator)localObject).next()).BhN = dZf();
    AppMethodBeat.o(119531);
  }

  public final void fV(List<ar> paramList)
  {
    AppMethodBeat.i(119530);
    if (this.BeK != null)
    {
      paramList = new IllegalStateException("Type parameters are already set for " + this.BgZ);
      AppMethodBeat.o(119530);
      throw paramList;
    }
    this.BeK = new ArrayList(paramList);
    AppMethodBeat.o(119530);
  }

  public String toString()
  {
    AppMethodBeat.i(119533);
    String str = j.h(this);
    AppMethodBeat.o(119533);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     a.i.b.a.c.b.c.w
 * JD-Core Version:    0.6.2
 */