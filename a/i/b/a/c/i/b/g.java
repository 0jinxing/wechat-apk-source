package a.i.b.a.c.i.b;

import a.i.b.a.c.l.w;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public final class g
{
  public static final g BEO;

  static
  {
    AppMethodBeat.i(122083);
    BEO = new g();
    AppMethodBeat.o(122083);
  }

  private final b a(List<?> paramList, a.i.b.a.c.a.h paramh)
  {
    AppMethodBeat.i(122082);
    Object localObject1 = (Iterable)a.a.j.m((Iterable)paramList);
    paramList = (Collection)new ArrayList();
    localObject1 = ((Iterable)localObject1).iterator();
    while (((Iterator)localObject1).hasNext())
    {
      Object localObject2 = ((Iterator)localObject1).next();
      localObject2 = ((g)this).dQ(localObject2);
      if (localObject2 != null)
        paramList.add(localObject2);
    }
    paramList = new b((List)paramList, (a.f.a.b)new g.b(paramh));
    AppMethodBeat.o(122082);
    return paramList;
  }

  public static b a(List<? extends f<?>> paramList, w paramw)
  {
    AppMethodBeat.i(122080);
    a.f.b.j.p(paramList, "value");
    a.f.b.j.p(paramw, "type");
    paramList = new b(paramList, (a.f.a.b)new g.a(paramw));
    AppMethodBeat.o(122080);
    return paramList;
  }

  public final f<?> dQ(Object paramObject)
  {
    AppMethodBeat.i(122081);
    if ((paramObject instanceof Byte))
    {
      paramObject = (f)new d(((Number)paramObject).byteValue());
      AppMethodBeat.o(122081);
    }
    while (true)
    {
      return paramObject;
      if ((paramObject instanceof Short))
      {
        paramObject = (f)new r(((Number)paramObject).shortValue());
        AppMethodBeat.o(122081);
      }
      else if ((paramObject instanceof Integer))
      {
        paramObject = (f)new l(((Number)paramObject).intValue());
        AppMethodBeat.o(122081);
      }
      else if ((paramObject instanceof Long))
      {
        paramObject = (f)new p(((Number)paramObject).longValue());
        AppMethodBeat.o(122081);
      }
      else if ((paramObject instanceof Character))
      {
        paramObject = (f)new e(((Character)paramObject).charValue());
        AppMethodBeat.o(122081);
      }
      else if ((paramObject instanceof Float))
      {
        paramObject = (f)new k(((Number)paramObject).floatValue());
        AppMethodBeat.o(122081);
      }
      else if ((paramObject instanceof Double))
      {
        paramObject = (f)new h(((Number)paramObject).doubleValue());
        AppMethodBeat.o(122081);
      }
      else if ((paramObject instanceof Boolean))
      {
        paramObject = (f)new c(((Boolean)paramObject).booleanValue());
        AppMethodBeat.o(122081);
      }
      else if ((paramObject instanceof String))
      {
        paramObject = (f)new s((String)paramObject);
        AppMethodBeat.o(122081);
      }
      else if ((paramObject instanceof byte[]))
      {
        paramObject = (f)a(a.a.e.cu((byte[])paramObject), a.i.b.a.c.a.h.BbS);
        AppMethodBeat.o(122081);
      }
      else if ((paramObject instanceof short[]))
      {
        paramObject = (f)a(a.a.e.b((short[])paramObject), a.i.b.a.c.a.h.BbT);
        AppMethodBeat.o(122081);
      }
      else if ((paramObject instanceof int[]))
      {
        paramObject = (f)a(a.a.e.K((int[])paramObject), a.i.b.a.c.a.h.BbU);
        AppMethodBeat.o(122081);
      }
      else if ((paramObject instanceof long[]))
      {
        paramObject = (f)a(a.a.e.g((long[])paramObject), a.i.b.a.c.a.h.BbW);
        AppMethodBeat.o(122081);
      }
      else if ((paramObject instanceof char[]))
      {
        paramObject = (f)a(a.a.e.c((char[])paramObject), a.i.b.a.c.a.h.BbR);
        AppMethodBeat.o(122081);
      }
      else if ((paramObject instanceof float[]))
      {
        paramObject = (f)a(a.a.e.k((float[])paramObject), a.i.b.a.c.a.h.BbV);
        AppMethodBeat.o(122081);
      }
      else if ((paramObject instanceof double[]))
      {
        paramObject = (f)a(a.a.e.e((double[])paramObject), a.i.b.a.c.a.h.BbX);
        AppMethodBeat.o(122081);
      }
      else if ((paramObject instanceof boolean[]))
      {
        paramObject = (f)a(a.a.e.c((boolean[])paramObject), a.i.b.a.c.a.h.BbQ);
        AppMethodBeat.o(122081);
      }
      else if (paramObject == null)
      {
        paramObject = (f)new q();
        AppMethodBeat.o(122081);
      }
      else
      {
        paramObject = null;
        AppMethodBeat.o(122081);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     a.i.b.a.c.i.b.g
 * JD-Core Version:    0.6.2
 */