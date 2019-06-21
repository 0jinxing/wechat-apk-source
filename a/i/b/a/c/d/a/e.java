package a.i.b.a.c.d.a;

import a.a.ad;
import a.a.v;
import a.aa;
import a.i.b.a.c.a.g;
import a.i.b.a.c.a.g.a;
import a.i.b.a.c.b.l;
import a.i.b.a.c.f.c;
import a.i.b.a.c.f.f;
import a.i.b.a.c.i.c.a;
import a.o;
import a.u;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public final class e
{
  private static final Map<a.i.b.a.c.f.b, f> BkV;
  private static final Map<f, List<f>> BkW;
  private static final Set<a.i.b.a.c.f.b> BkX;
  private static final Set<f> BkY;
  public static final e BkZ;

  static
  {
    AppMethodBeat.i(119686);
    BkZ = new e();
    Object localObject1 = g.Bag.BaD;
    a.f.b.j.o(localObject1, "BUILTIN_NAMES._enum");
    localObject1 = u.I(t.b((c)localObject1, "name"), f.avX("name"));
    Object localObject2 = g.Bag.BaD;
    a.f.b.j.o(localObject2, "BUILTIN_NAMES._enum");
    localObject2 = u.I(t.b((c)localObject2, "ordinal"), f.avX("ordinal"));
    Object localObject3 = g.Bag.Bba;
    a.f.b.j.o(localObject3, "BUILTIN_NAMES.collection");
    localObject3 = u.I(t.a((a.i.b.a.c.f.b)localObject3, "size"), f.avX("size"));
    Object localObject4 = g.Bag.Bbe;
    a.f.b.j.o(localObject4, "BUILTIN_NAMES.map");
    localObject4 = u.I(t.a((a.i.b.a.c.f.b)localObject4, "size"), f.avX("size"));
    Object localObject5 = g.Bag.Bar;
    a.f.b.j.o(localObject5, "BUILTIN_NAMES.charSequence");
    localObject5 = u.I(t.b((c)localObject5, "length"), f.avX("length"));
    Object localObject6 = g.Bag.Bbe;
    a.f.b.j.o(localObject6, "BUILTIN_NAMES.map");
    localObject6 = u.I(t.a((a.i.b.a.c.f.b)localObject6, "keys"), f.avX("keySet"));
    a.i.b.a.c.f.b localb = g.Bag.Bbe;
    a.f.b.j.o(localb, "BUILTIN_NAMES.map");
    o localo = u.I(t.a(localb, "values"), f.avX("values"));
    localb = g.Bag.Bbe;
    a.f.b.j.o(localb, "BUILTIN_NAMES.map");
    localObject1 = ad.a(new o[] { localObject1, localObject2, localObject3, localObject4, localObject5, localObject6, localo, u.I(t.a(localb, "entries"), f.avX("entrySet")) });
    BkV = (Map)localObject1;
    localObject2 = (Iterable)((Map)localObject1).entrySet();
    localObject1 = (Collection)new ArrayList(a.a.j.d((Iterable)localObject2));
    localObject2 = ((Iterable)localObject2).iterator();
    while (((Iterator)localObject2).hasNext())
    {
      localObject3 = (Map.Entry)((Iterator)localObject2).next();
      ((Collection)localObject1).add(new o(((a.i.b.a.c.f.b)((Map.Entry)localObject3).getKey()).ByQ.ehK(), ((Map.Entry)localObject3).getValue()));
    }
    localObject1 = (Iterable)localObject1;
    localObject2 = (Map)new LinkedHashMap();
    localObject4 = ((Iterable)localObject1).iterator();
    if (((Iterator)localObject4).hasNext())
    {
      localObject3 = ((Iterator)localObject4).next();
      localObject5 = (f)((o)localObject3).second;
      localObject1 = ((Map)localObject2).get(localObject5);
      if (localObject1 != null)
        break label596;
      localObject1 = new ArrayList();
      ((Map)localObject2).put(localObject5, localObject1);
    }
    label596: 
    while (true)
    {
      ((List)localObject1).add((f)((o)localObject3).first);
      break;
      BkW = (Map)localObject2;
      localObject1 = BkV.keySet();
      BkX = (Set)localObject1;
      localObject2 = (Iterable)localObject1;
      localObject1 = (Collection)new ArrayList(a.a.j.d((Iterable)localObject2));
      localObject2 = ((Iterable)localObject2).iterator();
      while (((Iterator)localObject2).hasNext())
        ((Collection)localObject1).add(((a.i.b.a.c.f.b)((Iterator)localObject2).next()).ByQ.ehK());
      BkY = a.a.j.o((Iterable)localObject1);
      AppMethodBeat.o(119686);
      return;
    }
  }

  public static Set<f> eaW()
  {
    return BkY;
  }

  public static List<f> i(f paramf)
  {
    AppMethodBeat.i(119684);
    a.f.b.j.p(paramf, "name1");
    List localList = (List)BkW.get(paramf);
    paramf = localList;
    if (localList == null)
      paramf = (List)v.AUP;
    AppMethodBeat.o(119684);
    return paramf;
  }

  public static boolean l(a.i.b.a.c.b.b paramb)
  {
    AppMethodBeat.i(119683);
    a.f.b.j.p(paramb, "callableMemberDescriptor");
    boolean bool;
    if (!BkY.contains(paramb.dZg()))
    {
      AppMethodBeat.o(119683);
      bool = false;
    }
    while (true)
    {
      return bool;
      if ((a.a.j.a((Iterable)BkX, a.I((l)paramb))) && (paramb.dYV().isEmpty()))
      {
        AppMethodBeat.o(119683);
        bool = true;
      }
      else
      {
        if (g.b((l)paramb))
        {
          paramb = paramb.dYX();
          a.f.b.j.o(paramb, "overriddenDescriptors");
          paramb = (Iterable)paramb;
          if ((!(paramb instanceof Collection)) || (!((Collection)paramb).isEmpty()))
          {
            paramb = paramb.iterator();
            while (true)
              if (paramb.hasNext())
              {
                a.i.b.a.c.b.b localb = (a.i.b.a.c.b.b)paramb.next();
                a.f.b.j.o(localb, "it");
                if (l(localb))
                {
                  AppMethodBeat.o(119683);
                  bool = true;
                  break;
                }
              }
          }
        }
        AppMethodBeat.o(119683);
        bool = false;
      }
    }
  }

  public static String m(a.i.b.a.c.b.b paramb)
  {
    AppMethodBeat.i(119685);
    a.f.b.j.p(paramb, "receiver$0");
    boolean bool = g.b((l)paramb);
    if ((aa.AUz) && (!bool))
    {
      paramb = (Throwable)new AssertionError("This method is defined only for builtin members, but " + paramb + " found");
      AppMethodBeat.o(119685);
      throw paramb;
    }
    paramb = a.b(a.x(paramb), (a.f.a.b)e.a.Bla);
    if (paramb == null)
    {
      AppMethodBeat.o(119685);
      paramb = null;
    }
    while (true)
    {
      return paramb;
      paramb = (f)BkV.get(a.o((l)paramb));
      if (paramb != null)
      {
        paramb = paramb.name;
        AppMethodBeat.o(119685);
      }
      else
      {
        AppMethodBeat.o(119685);
        paramb = null;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     a.i.b.a.c.d.a.e
 * JD-Core Version:    0.6.2
 */