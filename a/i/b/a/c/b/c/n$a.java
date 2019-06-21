package a.i.b.a.c.b.c;

import a.i.b.a.c.b.ah;
import a.i.b.a.c.b.al;
import a.i.b.a.c.b.l;
import a.i.b.a.c.c.a.a;
import a.i.b.a.c.i.e.d;
import a.i.b.a.c.i.e.h;
import a.i.b.a.c.i.j;
import a.i.b.a.c.k.c;
import a.i.b.a.c.l.an;
import a.i.b.a.c.l.w;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

final class n$a extends a.i.b.a.c.i.e.i
{
  private final c<a.i.b.a.c.f.f, Collection<al>> BhE;
  private final c<a.i.b.a.c.f.f, Collection<ah>> BhF;
  private final a.i.b.a.c.k.f<Collection<l>> BhG;

  static
  {
    AppMethodBeat.i(119450);
    if (!n.class.desiredAssertionStatus());
    for (boolean bool = true; ; bool = false)
    {
      $assertionsDisabled = bool;
      AppMethodBeat.o(119450);
      return;
    }
  }

  public n$a(n paramn, a.i.b.a.c.k.i parami)
  {
    AppMethodBeat.i(119439);
    this.BhE = parami.f(new n.a.1(this, paramn));
    this.BhF = parami.f(new n.a.2(this, paramn));
    this.BhG = parami.i(new n.a.3(this, paramn));
    AppMethodBeat.o(119439);
  }

  private h eat()
  {
    AppMethodBeat.i(119442);
    Object localObject = this.BhH.Bhx.eap();
    if ((!$assertionsDisabled) && (((Collection)localObject).size() != 1))
    {
      localObject = new AssertionError("Enum entry and its companion object both should have exactly one supertype: ".concat(String.valueOf(localObject)));
      AppMethodBeat.o(119442);
      throw ((Throwable)localObject);
    }
    localObject = ((w)((Collection)localObject).iterator().next()).dXR();
    AppMethodBeat.o(119442);
    return localObject;
  }

  private <D extends a.i.b.a.c.b.b> Collection<D> l(Collection<D> paramCollection)
  {
    AppMethodBeat.i(119443);
    LinkedHashSet localLinkedHashSet = new LinkedHashSet();
    j.a(paramCollection, Collections.emptySet(), this.BhH, new n.a.4(this, localLinkedHashSet));
    AppMethodBeat.o(119443);
    return localLinkedHashSet;
  }

  public final Collection a(a.i.b.a.c.f.f paramf, a parama)
  {
    AppMethodBeat.i(119440);
    paramf = (Collection)this.BhF.am(paramf);
    AppMethodBeat.o(119440);
    return paramf;
  }

  public final Collection<l> a(d paramd, a.f.a.b<? super a.i.b.a.c.f.f, Boolean> paramb)
  {
    AppMethodBeat.i(119444);
    paramd = (Collection)this.BhG.invoke();
    AppMethodBeat.o(119444);
    return paramd;
  }

  public final Collection b(a.i.b.a.c.f.f paramf, a parama)
  {
    AppMethodBeat.i(119441);
    paramf = (Collection)this.BhE.am(paramf);
    AppMethodBeat.o(119441);
    return paramf;
  }

  public final Set<a.i.b.a.c.f.f> eau()
  {
    AppMethodBeat.i(119445);
    Set localSet = (Set)n.a(this.BhH).invoke();
    AppMethodBeat.o(119445);
    return localSet;
  }

  public final Set<a.i.b.a.c.f.f> eav()
  {
    AppMethodBeat.i(119446);
    Set localSet = (Set)n.a(this.BhH).invoke();
    AppMethodBeat.o(119446);
    return localSet;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     a.i.b.a.c.b.c.n.a
 * JD-Core Version:    0.6.2
 */