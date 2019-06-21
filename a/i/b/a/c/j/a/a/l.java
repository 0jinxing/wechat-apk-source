package a.i.b.a.c.j.a.a;

import a.i.b.a.c.a.g;
import a.i.b.a.c.b.am;
import a.i.b.a.c.b.ap;
import a.i.b.a.c.b.ap.a;
import a.i.b.a.c.b.c.b;
import a.i.b.a.c.e.a.aa;
import a.i.b.a.c.e.a.ae;
import a.i.b.a.c.e.a.ae.b;
import a.i.b.a.c.e.a.h;
import a.i.b.a.c.f.f;
import a.i.b.a.c.j.a.k;
import a.i.b.a.c.j.a.t;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public final class l extends b
{
  final k BHj;
  private final a BID;
  final a.ae BIE;

  public l(k paramk, a.ae paramae, int paramInt)
  {
    super(locali, locall, localf, t.b((a.ae.b)localObject), paramae.BvC, paramInt, am.BeR, (ap)ap.a.BeT);
    AppMethodBeat.i(122430);
    this.BHj = paramk;
    this.BIE = paramae;
    this.BID = new a(this.BHj.Brl.Baf, (a.f.a.a)new l.a(this));
    AppMethodBeat.o(122430);
  }

  public final List<a.i.b.a.c.l.w> eaq()
  {
    AppMethodBeat.i(122428);
    Object localObject1 = this.BIE;
    Object localObject2 = this.BHj.AWr;
    a.f.b.j.p(localObject1, "receiver$0");
    a.f.b.j.p(localObject2, "typeTable");
    Object localObject3 = ((a.ae)localObject1).BvE;
    int i;
    if (!((Collection)localObject3).isEmpty())
    {
      i = 1;
      if (i == 0)
        break label155;
    }
    while (true)
    {
      localObject4 = localObject3;
      if (localObject3 != null)
        break label166;
      localObject3 = ((a.ae)localObject1).BvF;
      a.f.b.j.o(localObject3, "upperBoundIdList");
      localObject4 = (Iterable)localObject3;
      localObject3 = (Collection)new ArrayList(a.a.j.d((Iterable)localObject4));
      localObject1 = ((Iterable)localObject4).iterator();
      while (((Iterator)localObject1).hasNext())
      {
        localObject4 = (Integer)((Iterator)localObject1).next();
        a.f.b.j.o(localObject4, "it");
        ((Collection)localObject3).add(((h)localObject2).Uk(((Integer)localObject4).intValue()));
      }
      i = 0;
      break;
      label155: localObject3 = null;
    }
    Object localObject4 = (List)localObject3;
    label166: if (((List)localObject4).isEmpty())
    {
      localObject3 = a.a.j.listOf(a.i.b.a.c.i.c.a.G((a.i.b.a.c.b.l)this).dXN());
      AppMethodBeat.o(122428);
    }
    while (true)
    {
      return localObject3;
      localObject2 = (Iterable)localObject4;
      localObject3 = this.BHj.BHb;
      localObject4 = (Collection)new ArrayList(a.a.j.d((Iterable)localObject2));
      localObject2 = ((Iterable)localObject2).iterator();
      while (((Iterator)localObject2).hasNext())
        ((Collection)localObject4).add(((a.i.b.a.c.j.a.w)localObject3).r((a.aa)((Iterator)localObject2).next()));
      localObject3 = (List)localObject4;
      AppMethodBeat.o(122428);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     a.i.b.a.c.j.a.a.l
 * JD-Core Version:    0.6.2
 */