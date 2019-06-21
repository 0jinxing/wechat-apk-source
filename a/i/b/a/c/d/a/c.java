package a.i.b.a.c.d.a;

import a.a.ad;
import a.a.v;
import a.f.b.k;
import a.i.b.a.c.a.g;
import a.i.b.a.c.b.al;
import a.i.b.a.c.b.l;
import a.i.b.a.c.f.f;
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

public final class c
{
  private static final r Bkt;
  private static final Map<r, f> Bku;
  private static final Map<String, f> Bkv;
  private static final List<f> Bkw;
  private static final Map<f, List<f>> Bkx;
  public static final c Bky;

  static
  {
    AppMethodBeat.i(119665);
    Bky = new c();
    Object localObject1 = a.i.b.a.c.i.d.c.BFi.desc;
    a.f.b.j.o(localObject1, "JvmPrimitiveType.INT.desc");
    Bkt = t.v("java/util/List", "removeAt", (String)localObject1, "Ljava/lang/Object;");
    localObject1 = a.i.b.a.c.d.b.t.BrJ;
    Object localObject2 = a.i.b.a.c.d.b.t.avQ("Number");
    localObject1 = a.i.b.a.c.i.d.c.BFg.desc;
    a.f.b.j.o(localObject1, "JvmPrimitiveType.BYTE.desc");
    localObject1 = u.I(t.v((String)localObject2, "toByte", "", (String)localObject1), f.avX("byteValue"));
    localObject2 = a.i.b.a.c.d.b.t.avQ("Number");
    Object localObject3 = a.i.b.a.c.i.d.c.BFh.desc;
    a.f.b.j.o(localObject3, "JvmPrimitiveType.SHORT.desc");
    localObject2 = u.I(t.v((String)localObject2, "toShort", "", (String)localObject3), f.avX("shortValue"));
    localObject3 = a.i.b.a.c.d.b.t.avQ("Number");
    Object localObject4 = a.i.b.a.c.i.d.c.BFi.desc;
    a.f.b.j.o(localObject4, "JvmPrimitiveType.INT.desc");
    localObject3 = u.I(t.v((String)localObject3, "toInt", "", (String)localObject4), f.avX("intValue"));
    localObject4 = a.i.b.a.c.d.b.t.avQ("Number");
    Object localObject5 = a.i.b.a.c.i.d.c.BFk.desc;
    a.f.b.j.o(localObject5, "JvmPrimitiveType.LONG.desc");
    localObject4 = u.I(t.v((String)localObject4, "toLong", "", (String)localObject5), f.avX("longValue"));
    String str1 = a.i.b.a.c.d.b.t.avQ("Number");
    localObject5 = a.i.b.a.c.i.d.c.BFj.desc;
    a.f.b.j.o(localObject5, "JvmPrimitiveType.FLOAT.desc");
    localObject5 = u.I(t.v(str1, "toFloat", "", (String)localObject5), f.avX("floatValue"));
    Object localObject6 = a.i.b.a.c.d.b.t.avQ("Number");
    str1 = a.i.b.a.c.i.d.c.BFl.desc;
    a.f.b.j.o(str1, "JvmPrimitiveType.DOUBLE.desc");
    o localo = u.I(t.v((String)localObject6, "toDouble", "", str1), f.avX("doubleValue"));
    localObject6 = u.I(Bkt, f.avX("remove"));
    String str2 = a.i.b.a.c.d.b.t.avQ("CharSequence");
    str1 = a.i.b.a.c.i.d.c.BFi.desc;
    a.f.b.j.o(str1, "JvmPrimitiveType.INT.desc");
    String str3 = a.i.b.a.c.i.d.c.BFf.desc;
    a.f.b.j.o(str3, "JvmPrimitiveType.CHAR.desc");
    localObject2 = ad.a(new o[] { localObject1, localObject2, localObject3, localObject4, localObject5, localo, localObject6, u.I(t.v(str2, "get", str1, str3), f.avX("charAt")) });
    Bku = (Map)localObject2;
    localObject1 = (Map)new LinkedHashMap(ad.SI(((Map)localObject2).size()));
    localObject2 = ((Iterable)((Map)localObject2).entrySet()).iterator();
    while (((Iterator)localObject2).hasNext())
    {
      localObject3 = ((Iterator)localObject2).next();
      ((Map)localObject1).put(((r)((Map.Entry)localObject3).getKey()).signature, ((Map.Entry)localObject3).getValue());
    }
    Bkv = (Map)localObject1;
    localObject2 = (Iterable)Bku.keySet();
    localObject1 = (Collection)new ArrayList(a.a.j.d((Iterable)localObject2));
    localObject2 = ((Iterable)localObject2).iterator();
    while (((Iterator)localObject2).hasNext())
      ((Collection)localObject1).add(((r)((Iterator)localObject2).next()).BgZ);
    Bkw = (List)localObject1;
    localObject2 = (Iterable)Bku.entrySet();
    localObject1 = (Collection)new ArrayList(a.a.j.d((Iterable)localObject2));
    localObject2 = ((Iterable)localObject2).iterator();
    while (((Iterator)localObject2).hasNext())
    {
      localObject3 = (Map.Entry)((Iterator)localObject2).next();
      ((Collection)localObject1).add(new o(((r)((Map.Entry)localObject3).getKey()).BgZ, ((Map.Entry)localObject3).getValue()));
    }
    localObject1 = (Iterable)localObject1;
    localObject2 = (Map)new LinkedHashMap();
    localObject4 = ((Iterable)localObject1).iterator();
    if (((Iterator)localObject4).hasNext())
    {
      localObject3 = ((Iterator)localObject4).next();
      localObject5 = (f)((o)localObject3).second;
      localObject1 = ((Map)localObject2).get(localObject5);
      if (localObject1 == null)
      {
        localObject1 = new ArrayList();
        ((Map)localObject2).put(localObject5, localObject1);
      }
      while (true)
      {
        ((List)localObject1).add((f)((o)localObject3).first);
        break;
      }
    }
    Bkx = (Map)localObject2;
    AppMethodBeat.o(119665);
  }

  public static f a(al paramal)
  {
    AppMethodBeat.i(119661);
    a.f.b.j.p(paramal, "functionDescriptor");
    Map localMap = Bkv;
    paramal = a.i.b.a.c.d.b.r.c((a.i.b.a.c.b.a)paramal);
    if (paramal == null)
    {
      paramal = null;
      AppMethodBeat.o(119661);
    }
    while (true)
    {
      return paramal;
      paramal = (f)localMap.get(paramal);
      AppMethodBeat.o(119661);
    }
  }

  public static boolean b(al paramal)
  {
    AppMethodBeat.i(119662);
    a.f.b.j.p(paramal, "functionDescriptor");
    boolean bool;
    if ((g.b((l)paramal)) && (a.i.b.a.c.i.c.a.b((a.i.b.a.c.b.b)paramal, (a.f.a.b)new a(paramal)) != null))
    {
      bool = true;
      AppMethodBeat.o(119662);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(119662);
    }
  }

  public static boolean c(al paramal)
  {
    AppMethodBeat.i(119664);
    a.f.b.j.p(paramal, "receiver$0");
    boolean bool;
    if ((a.f.b.j.j(paramal.dZg().name, "removeAt")) && (a.f.b.j.j(a.i.b.a.c.d.b.r.c((a.i.b.a.c.b.a)paramal), Bkt.signature)))
    {
      bool = true;
      AppMethodBeat.o(119664);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(119664);
    }
  }

  public static List<f> eaU()
  {
    return Bkw;
  }

  public static boolean f(f paramf)
  {
    AppMethodBeat.i(119660);
    a.f.b.j.p(paramf, "receiver$0");
    boolean bool = Bkw.contains(paramf);
    AppMethodBeat.o(119660);
    return bool;
  }

  public static List<f> g(f paramf)
  {
    AppMethodBeat.i(119663);
    a.f.b.j.p(paramf, "name");
    List localList = (List)Bkx.get(paramf);
    paramf = localList;
    if (localList == null)
      paramf = (List)v.AUP;
    AppMethodBeat.o(119663);
    return paramf;
  }

  static final class a extends k
    implements a.f.a.b<a.i.b.a.c.b.b, Boolean>
  {
    a(al paramal)
    {
      super();
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     a.i.b.a.c.d.a.c
 * JD-Core Version:    0.6.2
 */