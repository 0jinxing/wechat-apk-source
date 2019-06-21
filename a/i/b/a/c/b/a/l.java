package a.i.b.a.c.b.a;

import a.f.b.j;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public final class l
  implements g
{
  private final g BfV;
  private final a.f.a.b<a.i.b.a.c.f.b, Boolean> BfW;

  public l(g paramg, a.f.a.b<? super a.i.b.a.c.f.b, Boolean> paramb)
  {
    AppMethodBeat.i(119362);
    this.BfV = paramg;
    this.BfW = paramb;
    AppMethodBeat.o(119362);
  }

  private final boolean c(c paramc)
  {
    AppMethodBeat.i(119361);
    paramc = paramc.dZF();
    boolean bool;
    if ((paramc != null) && (((Boolean)this.BfW.am(paramc)).booleanValue()))
    {
      bool = true;
      AppMethodBeat.o(119361);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(119361);
    }
  }

  public final c i(a.i.b.a.c.f.b paramb)
  {
    AppMethodBeat.i(119358);
    j.p(paramb, "fqName");
    if (((Boolean)this.BfW.am(paramb)).booleanValue())
    {
      paramb = this.BfV.i(paramb);
      AppMethodBeat.o(119358);
    }
    while (true)
    {
      return paramb;
      paramb = null;
      AppMethodBeat.o(119358);
    }
  }

  public final boolean isEmpty()
  {
    AppMethodBeat.i(119360);
    Object localObject = (Iterable)this.BfV;
    boolean bool;
    if ((!(localObject instanceof Collection)) || (!((Collection)localObject).isEmpty()))
    {
      Iterator localIterator = ((Iterable)localObject).iterator();
      while (localIterator.hasNext())
      {
        localObject = (c)localIterator.next();
        if (((l)this).c((c)localObject))
        {
          bool = true;
          AppMethodBeat.o(119360);
        }
      }
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(119360);
    }
  }

  public final Iterator<c> iterator()
  {
    AppMethodBeat.i(119359);
    Object localObject1 = (Iterable)this.BfV;
    Object localObject2 = (Collection)new ArrayList();
    Iterator localIterator = ((Iterable)localObject1).iterator();
    while (localIterator.hasNext())
    {
      Object localObject3 = localIterator.next();
      localObject1 = (c)localObject3;
      if (((l)this).c((c)localObject1))
        ((Collection)localObject2).add(localObject3);
    }
    localObject2 = ((List)localObject2).iterator();
    AppMethodBeat.o(119359);
    return localObject2;
  }

  public final boolean j(a.i.b.a.c.f.b paramb)
  {
    AppMethodBeat.i(119357);
    j.p(paramb, "fqName");
    boolean bool;
    if (((Boolean)this.BfW.am(paramb)).booleanValue())
    {
      bool = this.BfV.j(paramb);
      AppMethodBeat.o(119357);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(119357);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     a.i.b.a.c.b.a.l
 * JD-Core Version:    0.6.2
 */