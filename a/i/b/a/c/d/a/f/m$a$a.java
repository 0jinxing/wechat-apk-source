package a.i.b.a.c.d.a.f;

import a.a.ad;
import a.a.y;
import a.i.b.a.c.d.b.t;
import a.i.b.a.c.i.d.c;
import a.o;
import a.u;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public final class m$a$a
{
  private o<String, r> BqD;
  private final String iBt;
  private final List<o<String, r>> parameters;

  public m$a$a(String paramString)
  {
    AppMethodBeat.i(120183);
    this.iBt = localObject;
    this.parameters = ((List)new ArrayList());
    this.BqD = u.I("V", null);
    AppMethodBeat.o(120183);
  }

  public final void a(c paramc)
  {
    AppMethodBeat.i(120181);
    a.f.b.j.p(paramc, "type");
    this.BqD = u.I(paramc.desc, null);
    AppMethodBeat.o(120181);
  }

  public final void a(String paramString, d[] paramArrayOfd)
  {
    AppMethodBeat.i(120179);
    a.f.b.j.p(paramString, "type");
    a.f.b.j.p(paramArrayOfd, "qualifiers");
    Collection localCollection = (Collection)this.parameters;
    int i;
    if (paramArrayOfd.length == 0)
    {
      i = 1;
      if (i == 0)
        break label64;
    }
    for (paramArrayOfd = null; ; paramArrayOfd = new r(paramArrayOfd))
    {
      localCollection.add(u.I(paramString, paramArrayOfd));
      AppMethodBeat.o(120179);
      return;
      i = 0;
      break;
      label64: Object localObject1 = a.a.e.S(paramArrayOfd);
      paramArrayOfd = (Map)new LinkedHashMap(a.h.e.im(ad.SI(a.a.j.d((Iterable)localObject1)), 16));
      localObject1 = ((Iterable)localObject1).iterator();
      while (((Iterator)localObject1).hasNext())
      {
        Object localObject2 = ((Iterator)localObject1).next();
        paramArrayOfd.put(Integer.valueOf(((y)localObject2).index), (d)((y)localObject2).value);
      }
    }
  }

  public final void b(String paramString, d[] paramArrayOfd)
  {
    AppMethodBeat.i(120180);
    a.f.b.j.p(paramString, "type");
    a.f.b.j.p(paramArrayOfd, "qualifiers");
    Object localObject1 = a.a.e.S(paramArrayOfd);
    paramArrayOfd = (Map)new LinkedHashMap(a.h.e.im(ad.SI(a.a.j.d((Iterable)localObject1)), 16));
    localObject1 = ((Iterable)localObject1).iterator();
    while (((Iterator)localObject1).hasNext())
    {
      Object localObject2 = ((Iterator)localObject1).next();
      paramArrayOfd.put(Integer.valueOf(((y)localObject2).index), (d)((y)localObject2).value);
    }
    this.BqD = u.I(paramString, new r(paramArrayOfd));
    AppMethodBeat.o(120180);
  }

  public final o<String, j> eco()
  {
    AppMethodBeat.i(120182);
    Object localObject1 = t.BrJ;
    String str = this.BqE.className;
    localObject1 = this.iBt;
    Object localObject2 = (Iterable)this.parameters;
    Collection localCollection = (Collection)new ArrayList(a.a.j.d((Iterable)localObject2));
    localObject2 = ((Iterable)localObject2).iterator();
    while (((Iterator)localObject2).hasNext())
      localCollection.add((String)((o)((Iterator)localObject2).next()).first);
    str = t.iV(str, t.e((String)localObject1, (List)localCollection, (String)this.BqD.first));
    localObject1 = (r)this.BqD.second;
    localObject2 = (Iterable)this.parameters;
    localCollection = (Collection)new ArrayList(a.a.j.d((Iterable)localObject2));
    localObject2 = ((Iterable)localObject2).iterator();
    while (((Iterator)localObject2).hasNext())
      localCollection.add((r)((o)((Iterator)localObject2).next()).second);
    localObject1 = u.I(str, new j((r)localObject1, (List)localCollection));
    AppMethodBeat.o(120182);
    return localObject1;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     a.i.b.a.c.d.a.f.m.a.a
 * JD-Core Version:    0.6.2
 */