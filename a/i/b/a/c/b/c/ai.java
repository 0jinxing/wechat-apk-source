package a.i.b.a.c.b.c;

import a.i.b.a.c.b.a;
import a.i.b.a.c.b.a.g;
import a.i.b.a.c.b.am;
import a.i.b.a.c.b.au;
import a.i.b.a.c.b.ay;
import a.i.b.a.c.b.az;
import a.i.b.a.c.b.b;
import a.i.b.a.c.b.b.a;
import a.i.b.a.c.b.l;
import a.i.b.a.c.b.n;
import a.i.b.a.c.f.f;
import a.i.b.a.c.l.w;
import a.v;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public final class ai extends aj
  implements au
{
  public static final ai.a BjA;
  private final au Bjv;
  private final boolean Bjw;
  private final boolean Bjx;
  private final boolean Bjy;
  private final w Bjz;
  private final int index;

  static
  {
    AppMethodBeat.i(119634);
    BjA = new ai.a((byte)0);
    AppMethodBeat.o(119634);
  }

  public ai(a parama, au paramau, int paramInt, g paramg, f paramf, w paramw1, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, w paramw2, am paramam)
  {
    super((l)parama, paramg, paramf, paramw1, paramam);
    AppMethodBeat.i(119633);
    this.index = paramInt;
    this.Bjw = paramBoolean1;
    this.Bjx = paramBoolean2;
    this.Bjy = paramBoolean3;
    this.Bjz = paramw2;
    if (paramau == null);
    for (parama = (au)this; ; parama = paramau)
    {
      this.Bjv = parama;
      AppMethodBeat.o(119633);
      return;
    }
  }

  public final au a(a parama, f paramf, int paramInt)
  {
    AppMethodBeat.i(119630);
    a.f.b.j.p(parama, "newOwner");
    a.f.b.j.p(paramf, "newName");
    g localg = dYn();
    a.f.b.j.o(localg, "annotations");
    w localw1 = dZS();
    a.f.b.j.o(localw1, "type");
    boolean bool1 = dZU();
    boolean bool2 = this.Bjx;
    boolean bool3 = this.Bjy;
    w localw2 = this.Bjz;
    am localam = am.BeR;
    a.f.b.j.o(localam, "SourceElement.NO_SOURCE");
    parama = (au)new ai(parama, null, paramInt, localg, paramf, localw1, bool1, bool2, bool3, localw2, localam);
    AppMethodBeat.o(119630);
    return parama;
  }

  public final <R, D> R a(n<R, D> paramn, D paramD)
  {
    AppMethodBeat.i(119629);
    a.f.b.j.p(paramn, "visitor");
    paramn = paramn.a((au)this, paramD);
    AppMethodBeat.o(119629);
    return paramn;
  }

  public final Collection<au> dYX()
  {
    AppMethodBeat.i(119632);
    Collection localCollection = dZT().dYX();
    a.f.b.j.o(localCollection, "containingDeclaration.overriddenDescriptors");
    Object localObject = (Iterable)localCollection;
    localCollection = (Collection)new ArrayList(a.a.j.d((Iterable)localObject));
    Iterator localIterator = ((Iterable)localObject).iterator();
    while (localIterator.hasNext())
    {
      localObject = (a)localIterator.next();
      a.f.b.j.o(localObject, "it");
      localCollection.add((au)((a)localObject).dYV().get(this.index));
    }
    localCollection = (Collection)localCollection;
    AppMethodBeat.o(119632);
    return localCollection;
  }

  public final az dYf()
  {
    AppMethodBeat.i(119631);
    az localaz = ay.Bfb;
    a.f.b.j.o(localaz, "Visibilities.LOCAL");
    AppMethodBeat.o(119631);
    return localaz;
  }

  public final a dZT()
  {
    AppMethodBeat.i(119620);
    Object localObject = super.dXW();
    if (localObject == null)
    {
      localObject = new v("null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.CallableDescriptor");
      AppMethodBeat.o(119620);
      throw ((Throwable)localObject);
    }
    localObject = (a)localObject;
    AppMethodBeat.o(119620);
    return localObject;
  }

  public final boolean dZU()
  {
    AppMethodBeat.i(119622);
    boolean bool;
    if (this.Bjw)
    {
      Object localObject = dZT();
      if (localObject == null)
      {
        localObject = new v("null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.CallableMemberDescriptor");
        AppMethodBeat.o(119622);
        throw ((Throwable)localObject);
      }
      localObject = ((b)localObject).dYZ();
      a.f.b.j.o(localObject, "(containingDeclaration a…bleMemberDescriptor).kind");
      if (((b.a)localObject).dZa())
      {
        bool = true;
        AppMethodBeat.o(119622);
      }
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(119622);
    }
  }

  public final w dZV()
  {
    return this.Bjz;
  }

  public final au dZW()
  {
    AppMethodBeat.i(119623);
    au localau;
    if (this.Bjv == (ai)this)
    {
      localau = (au)this;
      AppMethodBeat.o(119623);
    }
    while (true)
    {
      return localau;
      localau = this.Bjv.dZW();
      AppMethodBeat.o(119623);
    }
  }

  public final boolean dZX()
  {
    return this.Bjx;
  }

  public final boolean dZY()
  {
    return this.Bjy;
  }

  public final boolean dZZ()
  {
    return false;
  }

  public final boolean eac()
  {
    return false;
  }

  public final int getIndex()
  {
    return this.index;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     a.i.b.a.c.b.c.ai
 * JD-Core Version:    0.6.2
 */