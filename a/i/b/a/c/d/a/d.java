package a.i.b.a.c.d.a;

import a.a.ad;
import a.a.aj;
import a.i.b.a.c.f.f;
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
import java.util.Map.Entry;
import java.util.Set;

public final class d
{
  private static final List<r> BkA;
  private static final List<String> BkB;
  private static final List<String> BkC;
  private static final Map<r, d.b> BkD;
  private static final Map<String, d.b> BkE;
  private static final Set<f> BkF;
  private static final Set<String> BkG;
  public static final d BkH;

  static
  {
    AppMethodBeat.i(119679);
    BkH = new d();
    Object localObject1 = (Iterable)aj.setOf(new String[] { "containsAll", "removeAll", "retainAll" });
    Object localObject2 = (Collection)new ArrayList(a.a.j.d((Iterable)localObject1));
    Object localObject3 = ((Iterable)localObject1).iterator();
    while (((Iterator)localObject3).hasNext())
    {
      localObject1 = (String)((Iterator)localObject3).next();
      localObject4 = c.BFe.desc;
      a.f.b.j.o(localObject4, "JvmPrimitiveType.BOOLEAN.desc");
      ((Collection)localObject2).add(t.v("java/util/Collection", (String)localObject1, "Ljava/util/Collection;", (String)localObject4));
    }
    localObject2 = (List)localObject2;
    BkA = (List)localObject2;
    localObject1 = (Iterable)localObject2;
    localObject2 = (Collection)new ArrayList(a.a.j.d((Iterable)localObject1));
    localObject1 = ((Iterable)localObject1).iterator();
    while (((Iterator)localObject1).hasNext())
      ((Collection)localObject2).add(((r)((Iterator)localObject1).next()).signature);
    BkB = (List)localObject2;
    localObject1 = (Iterable)BkA;
    localObject2 = (Collection)new ArrayList(a.a.j.d((Iterable)localObject1));
    localObject1 = ((Iterable)localObject1).iterator();
    while (((Iterator)localObject1).hasNext())
      ((Collection)localObject2).add(((r)((Iterator)localObject1).next()).BgZ.name);
    BkC = (List)localObject2;
    localObject2 = a.i.b.a.c.d.b.t.BrJ;
    localObject2 = a.i.b.a.c.d.b.t.avR("Collection");
    localObject1 = c.BFe.desc;
    a.f.b.j.o(localObject1, "JvmPrimitiveType.BOOLEAN.desc");
    localObject2 = u.I(t.v((String)localObject2, "contains", "Ljava/lang/Object;", (String)localObject1), d.b.BkQ);
    localObject1 = a.i.b.a.c.d.b.t.avR("Collection");
    Object localObject4 = c.BFe.desc;
    a.f.b.j.o(localObject4, "JvmPrimitiveType.BOOLEAN.desc");
    localObject1 = u.I(t.v((String)localObject1, "remove", "Ljava/lang/Object;", (String)localObject4), d.b.BkQ);
    localObject3 = a.i.b.a.c.d.b.t.avR("Map");
    localObject4 = c.BFe.desc;
    a.f.b.j.o(localObject4, "JvmPrimitiveType.BOOLEAN.desc");
    localObject4 = u.I(t.v((String)localObject3, "containsKey", "Ljava/lang/Object;", (String)localObject4), d.b.BkQ);
    Object localObject5 = a.i.b.a.c.d.b.t.avR("Map");
    localObject3 = c.BFe.desc;
    a.f.b.j.o(localObject3, "JvmPrimitiveType.BOOLEAN.desc");
    localObject3 = u.I(t.v((String)localObject5, "containsValue", "Ljava/lang/Object;", (String)localObject3), d.b.BkQ);
    Object localObject6 = a.i.b.a.c.d.b.t.avR("Map");
    localObject5 = c.BFe.desc;
    a.f.b.j.o(localObject5, "JvmPrimitiveType.BOOLEAN.desc");
    o localo1 = u.I(t.v((String)localObject6, "remove", "Ljava/lang/Object;Ljava/lang/Object;", (String)localObject5), d.b.BkQ);
    o localo2 = u.I(t.v(a.i.b.a.c.d.b.t.avR("Map"), "getOrDefault", "Ljava/lang/Object;Ljava/lang/Object;", "Ljava/lang/Object;"), d.b.BkR);
    localObject6 = u.I(t.v(a.i.b.a.c.d.b.t.avR("Map"), "get", "Ljava/lang/Object;", "Ljava/lang/Object;"), d.b.BkO);
    localObject5 = u.I(t.v(a.i.b.a.c.d.b.t.avR("Map"), "remove", "Ljava/lang/Object;", "Ljava/lang/Object;"), d.b.BkO);
    String str1 = a.i.b.a.c.d.b.t.avR("List");
    String str2 = c.BFi.desc;
    a.f.b.j.o(str2, "JvmPrimitiveType.INT.desc");
    o localo3 = u.I(t.v(str1, "indexOf", "Ljava/lang/Object;", str2), d.b.BkP);
    str1 = a.i.b.a.c.d.b.t.avR("List");
    str2 = c.BFi.desc;
    a.f.b.j.o(str2, "JvmPrimitiveType.INT.desc");
    localObject1 = ad.a(new o[] { localObject2, localObject1, localObject4, localObject3, localo1, localo2, localObject6, localObject5, localo3, u.I(t.v(str1, "lastIndexOf", "Ljava/lang/Object;", str2), d.b.BkP) });
    BkD = (Map)localObject1;
    localObject2 = (Map)new LinkedHashMap(ad.SI(((Map)localObject1).size()));
    localObject1 = ((Iterable)((Map)localObject1).entrySet()).iterator();
    while (((Iterator)localObject1).hasNext())
    {
      localObject4 = ((Iterator)localObject1).next();
      ((Map)localObject2).put(((r)((Map.Entry)localObject4).getKey()).signature, ((Map.Entry)localObject4).getValue());
    }
    BkE = (Map)localObject2;
    localObject2 = aj.a(BkD.keySet(), (Iterable)BkA);
    localObject4 = (Iterable)localObject2;
    localObject1 = (Collection)new ArrayList(a.a.j.d((Iterable)localObject4));
    localObject4 = ((Iterable)localObject4).iterator();
    while (((Iterator)localObject4).hasNext())
      ((Collection)localObject1).add(((r)((Iterator)localObject4).next()).BgZ);
    BkF = a.a.j.o((Iterable)localObject1);
    localObject1 = (Iterable)localObject2;
    localObject2 = (Collection)new ArrayList(a.a.j.d((Iterable)localObject1));
    localObject1 = ((Iterable)localObject1).iterator();
    while (((Iterator)localObject1).hasNext())
      ((Collection)localObject2).add(((r)((Iterator)localObject1).next()).signature);
    BkG = a.a.j.o((Iterable)localObject2);
    AppMethodBeat.o(119679);
  }

  public static final a.i.b.a.c.b.t e(a.i.b.a.c.b.t paramt)
  {
    AppMethodBeat.i(119676);
    a.f.b.j.p(paramt, "functionDescriptor");
    f localf = paramt.dZg();
    a.f.b.j.o(localf, "functionDescriptor.name");
    if (!h(localf))
    {
      paramt = null;
      AppMethodBeat.o(119676);
    }
    while (true)
    {
      return paramt;
      paramt = (a.i.b.a.c.b.t)a.i.b.a.c.i.c.a.b((a.i.b.a.c.b.b)paramt, (a.f.a.b)d.c.BkT);
      AppMethodBeat.o(119676);
    }
  }

  public static boolean h(f paramf)
  {
    AppMethodBeat.i(119677);
    a.f.b.j.p(paramf, "receiver$0");
    boolean bool = BkF.contains(paramf);
    AppMethodBeat.o(119677);
    return bool;
  }

  public static final d.a j(a.i.b.a.c.b.b paramb)
  {
    AppMethodBeat.i(119678);
    a.f.b.j.p(paramb, "receiver$0");
    if (!BkF.contains(paramb.dZg()))
    {
      AppMethodBeat.o(119678);
      paramb = null;
    }
    while (true)
    {
      return paramb;
      paramb = a.i.b.a.c.i.c.a.b(paramb, (a.f.a.b)d.d.BkU);
      if (paramb != null)
      {
        paramb = a.i.b.a.c.d.b.r.c((a.i.b.a.c.b.a)paramb);
        if (paramb != null);
      }
      else
      {
        AppMethodBeat.o(119678);
        paramb = null;
        continue;
      }
      if (BkB.contains(paramb))
      {
        paramb = d.a.BkI;
        AppMethodBeat.o(119678);
      }
      else
      {
        paramb = BkE.get(paramb);
        if (paramb == null)
          a.f.b.j.dWJ();
        if ((d.b)paramb == d.b.BkO)
        {
          paramb = d.a.BkK;
          AppMethodBeat.o(119678);
        }
        else
        {
          paramb = d.a.BkJ;
          AppMethodBeat.o(119678);
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     a.i.b.a.c.d.a.d
 * JD-Core Version:    0.6.2
 */