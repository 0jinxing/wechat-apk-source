package a.i.b.a.c.d.a;

import a.f.b.j;
import a.i.b.a.c.a.g;
import a.i.b.a.c.a.g.a;
import a.i.b.a.c.f.b;
import a.o;
import a.u;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class i
{
  private static final HashMap<b, b> Blc;
  public static final i Bld;

  static
  {
    AppMethodBeat.i(119693);
    Bld = new i();
    Blc = new HashMap();
    b localb = g.Bag.Bbj;
    j.o(localb, "FQ_NAMES.mutableList");
    a(localb, ac(new String[] { "java.util.ArrayList", "java.util.LinkedList" }));
    localb = g.Bag.Bbl;
    j.o(localb, "FQ_NAMES.mutableSet");
    a(localb, ac(new String[] { "java.util.HashSet", "java.util.TreeSet", "java.util.LinkedHashSet" }));
    localb = g.Bag.Bbm;
    j.o(localb, "FQ_NAMES.mutableMap");
    a(localb, ac(new String[] { "java.util.HashMap", "java.util.TreeMap", "java.util.LinkedHashMap", "java.util.concurrent.ConcurrentHashMap", "java.util.concurrent.ConcurrentSkipListMap" }));
    a(new b("java.util.function.Function"), ac(new String[] { "java.util.function.UnaryOperator" }));
    a(new b("java.util.function.BiFunction"), ac(new String[] { "java.util.function.BinaryOperator" }));
    AppMethodBeat.o(119693);
  }

  private static void a(b paramb, List<b> paramList)
  {
    AppMethodBeat.i(119691);
    Object localObject = (Iterable)paramList;
    paramList = (Map)Blc;
    Iterator localIterator = ((Iterable)localObject).iterator();
    while (localIterator.hasNext())
    {
      localObject = u.I((b)localIterator.next(), paramb);
      paramList.put(((o)localObject).first, ((o)localObject).second);
    }
    AppMethodBeat.o(119691);
  }

  private static List<b> ac(String[] paramArrayOfString)
  {
    AppMethodBeat.i(119692);
    Collection localCollection = (Collection)new ArrayList(paramArrayOfString.length);
    int i = paramArrayOfString.length;
    for (int j = 0; j < i; j++)
      localCollection.add(new b(paramArrayOfString[j]));
    paramArrayOfString = (List)localCollection;
    AppMethodBeat.o(119692);
    return paramArrayOfString;
  }

  public static b k(b paramb)
  {
    AppMethodBeat.i(119690);
    j.p(paramb, "classFqName");
    paramb = (b)Blc.get(paramb);
    AppMethodBeat.o(119690);
    return paramb;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     a.i.b.a.c.d.a.i
 * JD-Core Version:    0.6.2
 */