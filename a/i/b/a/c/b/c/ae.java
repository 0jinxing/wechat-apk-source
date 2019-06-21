package a.i.b.a.c.b.c;

import a.a.v;
import a.f.b.j;
import a.i.b.a.c.b.ad;
import a.i.b.a.c.b.l;
import a.i.b.a.c.b.y;
import a.i.b.a.c.f.c;
import a.i.b.a.c.f.f;
import a.i.b.a.c.i.e.c.b;
import a.i.b.a.c.i.e.d;
import a.i.b.a.c.i.e.i;
import a.i.b.a.c.n.a;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public final class ae extends i
{
  private final y Bdv;
  private final a.i.b.a.c.f.b BfP;

  public ae(y paramy, a.i.b.a.c.f.b paramb)
  {
    AppMethodBeat.i(119589);
    this.Bdv = paramy;
    this.BfP = paramb;
    AppMethodBeat.o(119589);
  }

  public final Collection<l> a(d paramd, a.f.a.b<? super f, Boolean> paramb)
  {
    AppMethodBeat.i(119588);
    j.p(paramd, "kindFilter");
    j.p(paramb, "nameFilter");
    Object localObject = d.BFX;
    if (!paramd.UI(d.ejG()))
    {
      paramd = (Collection)v.AUP;
      AppMethodBeat.o(119588);
    }
    while (true)
    {
      return paramd;
      if ((this.BfP.ByQ.ByV.isEmpty()) && (paramd.BFz.contains(c.b.BFx)))
      {
        paramd = (Collection)v.AUP;
        AppMethodBeat.o(119588);
      }
      else
      {
        paramd = this.Bdv.a(this.BfP, paramb);
        ArrayList localArrayList = new ArrayList(paramd.size());
        Iterator localIterator = paramd.iterator();
        while (localIterator.hasNext())
        {
          localObject = ((a.i.b.a.c.f.b)localIterator.next()).ByQ.ehK();
          j.o(localObject, "subFqName.shortName()");
          if (((Boolean)paramb.am(localObject)).booleanValue())
          {
            Collection localCollection = (Collection)localArrayList;
            j.p(localObject, "name");
            if (((f)localObject).ByZ)
              paramd = null;
            while (true)
            {
              a.b(localCollection, paramd);
              break;
              paramd = this.Bdv;
              localObject = this.BfP.q((f)localObject);
              j.o(localObject, "fqName.child(name)");
              localObject = paramd.g((a.i.b.a.c.f.b)localObject);
              paramd = (d)localObject;
              if (((ad)localObject).isEmpty())
                paramd = null;
            }
          }
        }
        paramd = (Collection)localArrayList;
        AppMethodBeat.o(119588);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     a.i.b.a.c.b.c.ae
 * JD-Core Version:    0.6.2
 */