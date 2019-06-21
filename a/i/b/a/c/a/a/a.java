package a.i.b.a.c.a.a;

import a.a.x;
import a.i.b.a.c.b.ab;
import a.i.b.a.c.b.ad;
import a.i.b.a.c.b.e;
import a.i.b.a.c.b.y;
import a.i.b.a.c.f.f;
import a.i.b.a.c.k.i;
import a.k.m;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public final class a
  implements a.i.b.a.c.b.b.b
{
  public static final a.a BcI;
  private final i Baf;
  private final y BcH;

  static
  {
    AppMethodBeat.i(119134);
    BcI = new a.a((byte)0);
    AppMethodBeat.o(119134);
  }

  public a(i parami, y paramy)
  {
    AppMethodBeat.i(119133);
    this.Baf = parami;
    this.BcH = paramy;
    AppMethodBeat.o(119133);
  }

  public final boolean a(a.i.b.a.c.f.b paramb, f paramf)
  {
    AppMethodBeat.i(119130);
    a.f.b.j.p(paramb, "packageFqName");
    a.f.b.j.p(paramf, "name");
    paramf = paramf.name;
    a.f.b.j.o(paramf, "name.asString()");
    boolean bool;
    if (((m.jb(paramf, "Function")) || (m.jb(paramf, "KFunction")) || (m.jb(paramf, "SuspendFunction")) || (m.jb(paramf, "KSuspendFunction"))) && (a.a.a(paramf, paramb) != null))
    {
      bool = true;
      AppMethodBeat.o(119130);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(119130);
    }
  }

  public final Collection<e> d(a.i.b.a.c.f.b paramb)
  {
    AppMethodBeat.i(119132);
    a.f.b.j.p(paramb, "packageFqName");
    paramb = (Collection)x.AUR;
    AppMethodBeat.o(119132);
    return paramb;
  }

  public final e e(a.i.b.a.c.f.a parama)
  {
    AppMethodBeat.i(119131);
    a.f.b.j.p(parama, "classId");
    if ((parama.ByO) || (parama.ehD()))
    {
      AppMethodBeat.o(119131);
      parama = null;
    }
    while (true)
    {
      return parama;
      Object localObject1 = parama.ByN.ByQ.ByV;
      a.f.b.j.o(localObject1, "classId.relativeClassName.asString()");
      if (!m.a((CharSequence)localObject1, (CharSequence)"Function", false))
      {
        AppMethodBeat.o(119131);
        parama = null;
      }
      else
      {
        Object localObject2 = parama.BcW;
        a.f.b.j.o(localObject2, "classId.packageFqName");
        localObject1 = a.a.a((String)localObject1, (a.i.b.a.c.f.b)localObject2);
        if (localObject1 == null)
        {
          AppMethodBeat.o(119131);
          parama = null;
        }
        else
        {
          parama = ((a.b)localObject1).BcJ;
          int i = ((a.b)localObject1).AVt;
          localObject1 = (Iterable)this.BcH.g((a.i.b.a.c.f.b)localObject2).getFragments();
          localObject2 = (Collection)new ArrayList();
          Iterator localIterator = ((Iterable)localObject1).iterator();
          while (localIterator.hasNext())
          {
            localObject1 = localIterator.next();
            if ((localObject1 instanceof a.i.b.a.c.a.c))
              ((Collection)localObject2).add(localObject1);
          }
          localObject2 = (a.i.b.a.c.a.c)a.a.j.fJ((List)localObject2);
          parama = (e)new b(this.Baf, (ab)localObject2, parama, i);
          AppMethodBeat.o(119131);
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     a.i.b.a.c.a.a.a
 * JD-Core Version:    0.6.2
 */