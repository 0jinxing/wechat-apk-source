package a.i.b.a.c.j.a;

import a.a.v;
import a.f.a.b;
import a.i.b.a.c.e.a.aa;
import a.i.b.a.c.e.a.aa.a;
import a.i.b.a.c.e.a.g;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Collection;
import java.util.List;

final class w$b extends a.f.b.k
  implements b<a.aa, List<? extends a.aa.a>>
{
  w$b(w paramw)
  {
    super(1);
  }

  public final List<a.aa.a> u(a.aa paramaa)
  {
    AppMethodBeat.i(122309);
    a.f.b.j.p(paramaa, "receiver$0");
    Object localObject = paramaa.BsF;
    a.f.b.j.o(localObject, "argumentList");
    Collection localCollection = (Collection)localObject;
    paramaa = g.b(paramaa, this.BHI.BHj.AWr);
    if (paramaa != null);
    for (paramaa = u(paramaa); ; paramaa = null)
    {
      localObject = paramaa;
      if (paramaa == null)
        localObject = (List)v.AUP;
      paramaa = a.a.j.b(localCollection, (Iterable)localObject);
      AppMethodBeat.o(122309);
      return paramaa;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     a.i.b.a.c.j.a.w.b
 * JD-Core Version:    0.6.2
 */