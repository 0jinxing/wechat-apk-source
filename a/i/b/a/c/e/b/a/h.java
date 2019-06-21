package a.i.b.a.c.e.b.a;

import a.a.ad;
import a.a.x;
import a.a.y;
import a.h.e;
import a.i.b.a.c.e.a.c;
import a.i.b.a.c.e.b.b.g;
import a.i.b.a.c.e.b.b.g.b;
import a.i.b.a.c.e.b.b.g.b.b;
import a.k.m;
import a.v;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class h
  implements c
{
  private static final Map<String, Integer> ByA;
  public static final h.a ByB;
  private static final List<String> Byz;
  private final Set<Integer> Byx;
  private final b.g Byy;
  private final List<b.g.b> kCH;
  private final String[] strings;

  static
  {
    AppMethodBeat.i(121327);
    ByB = new h.a((byte)0);
    Object localObject1 = a.a.j.listOf(new String[] { "kotlin/Any", "kotlin/Nothing", "kotlin/Unit", "kotlin/Throwable", "kotlin/Number", "kotlin/Byte", "kotlin/Double", "kotlin/Float", "kotlin/Int", "kotlin/Long", "kotlin/Short", "kotlin/Boolean", "kotlin/Char", "kotlin/CharSequence", "kotlin/String", "kotlin/Comparable", "kotlin/Enum", "kotlin/Array", "kotlin/ByteArray", "kotlin/DoubleArray", "kotlin/FloatArray", "kotlin/IntArray", "kotlin/LongArray", "kotlin/ShortArray", "kotlin/BooleanArray", "kotlin/CharArray", "kotlin/Cloneable", "kotlin/Annotation", "kotlin/collections/Iterable", "kotlin/collections/MutableIterable", "kotlin/collections/Collection", "kotlin/collections/MutableCollection", "kotlin/collections/List", "kotlin/collections/MutableList", "kotlin/collections/Set", "kotlin/collections/MutableSet", "kotlin/collections/Map", "kotlin/collections/MutableMap", "kotlin/collections/Map.Entry", "kotlin/collections/MutableMap.MutableEntry", "kotlin/collections/Iterator", "kotlin/collections/MutableIterator", "kotlin/collections/ListIterator", "kotlin/collections/MutableListIterator" });
    Byz = (List)localObject1;
    Object localObject2 = a.a.j.p((Iterable)localObject1);
    localObject1 = (Map)new LinkedHashMap(e.im(ad.SI(a.a.j.d((Iterable)localObject2)), 16));
    localObject2 = ((Iterable)localObject2).iterator();
    while (((Iterator)localObject2).hasNext())
    {
      Object localObject3 = ((Iterator)localObject2).next();
      ((Map)localObject1).put((String)((y)localObject3).value, Integer.valueOf(((y)localObject3).index));
    }
    ByA = (Map)localObject1;
    AppMethodBeat.o(121327);
  }

  public h(b.g paramg, String[] paramArrayOfString)
  {
    AppMethodBeat.i(121326);
    this.Byy = paramg;
    this.strings = paramArrayOfString;
    paramg = this.Byy.BxW;
    if (paramg.isEmpty());
    for (paramg = (Set)x.AUR; ; paramg = a.a.j.o((Iterable)paramg))
    {
      this.Byx = paramg;
      paramg = new ArrayList();
      paramArrayOfString = this.Byy.BxV;
      paramg.ensureCapacity(paramArrayOfString.size());
      paramArrayOfString = paramArrayOfString.iterator();
      while (paramArrayOfString.hasNext())
      {
        b.g.b localb = (b.g.b)paramArrayOfString.next();
        a.f.b.j.o(localb, "record");
        int i = localb.BxZ;
        for (int j = 0; j < i; j++)
          paramg.add(localb);
      }
    }
    paramg.trimToSize();
    this.kCH = ((List)paramg);
    AppMethodBeat.o(121326);
  }

  public final String Uh(int paramInt)
  {
    AppMethodBeat.i(121324);
    String str = getString(paramInt);
    AppMethodBeat.o(121324);
    return str;
  }

  public final boolean Ui(int paramInt)
  {
    AppMethodBeat.i(121325);
    boolean bool = this.Byx.contains(Integer.valueOf(paramInt));
    AppMethodBeat.o(121325);
    return bool;
  }

  public final String getString(int paramInt)
  {
    AppMethodBeat.i(121323);
    Object localObject1 = (b.g.b)this.kCH.get(paramInt);
    if (((b.g.b)localObject1).ehm())
      localObject2 = ((b.g.b)localObject1).getString();
    Object localObject4;
    int i;
    while (true)
    {
      localObject3 = localObject2;
      if (((b.g.b)localObject1).ehp() < 2)
        break label272;
      localObject3 = ((b.g.b)localObject1).Byd;
      localObject4 = (Integer)((List)localObject3).get(0);
      Integer localInteger = (Integer)((List)localObject3).get(1);
      a.f.b.j.o(localObject4, "begin");
      localObject3 = localObject2;
      if (a.f.b.j.compare(0, ((Integer)localObject4).intValue()) > 0)
        break label272;
      paramInt = ((Integer)localObject4).intValue();
      a.f.b.j.o(localInteger, "end");
      localObject3 = localObject2;
      if (a.f.b.j.compare(paramInt, localInteger.intValue()) > 0)
        break label272;
      localObject3 = localObject2;
      if (a.f.b.j.compare(localInteger.intValue(), ((String)localObject2).length()) > 0)
        break label272;
      a.f.b.j.o(localObject2, "string");
      paramInt = ((Integer)localObject4).intValue();
      i = localInteger.intValue();
      if (localObject2 != null)
        break;
      localObject2 = new v("null cannot be cast to non-null type java.lang.String");
      AppMethodBeat.o(121323);
      throw ((Throwable)localObject2);
      int j;
      if (((b.g.b)localObject1).ehl())
      {
        j = ((Collection)Byz).size();
        i = ((b.g.b)localObject1).Bya;
        if (i >= 0)
          break label229;
      }
      label229: 
      while (j <= i)
      {
        localObject2 = this.strings[paramInt];
        break;
      }
      localObject2 = (String)Byz.get(((b.g.b)localObject1).Bya);
    }
    Object localObject3 = ((String)localObject2).substring(paramInt, i);
    a.f.b.j.o(localObject3, "(this as java.lang.Strin…ing(startIndex, endIndex)");
    label272: Object localObject2 = localObject3;
    if (((b.g.b)localObject1).ehq() >= 2)
    {
      localObject4 = ((b.g.b)localObject1).Byf;
      localObject2 = (Integer)((List)localObject4).get(0);
      localObject4 = (Integer)((List)localObject4).get(1);
      a.f.b.j.o(localObject3, "string");
      localObject2 = m.a((String)localObject3, (char)((Integer)localObject2).intValue(), (char)((Integer)localObject4).intValue());
    }
    localObject3 = ((b.g.b)localObject1).Byc;
    localObject1 = localObject3;
    if (localObject3 == null)
      localObject1 = b.g.b.b.Byh;
    localObject3 = localObject2;
    switch (i.eQZ[localObject1.ordinal()])
    {
    default:
      localObject3 = localObject2;
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      a.f.b.j.o(localObject3, "string");
      AppMethodBeat.o(121323);
      return localObject3;
      a.f.b.j.o(localObject2, "string");
      localObject3 = m.a((String)localObject2, '$', '.');
      continue;
      localObject3 = localObject2;
      if (((String)localObject2).length() >= 2)
      {
        a.f.b.j.o(localObject2, "string");
        paramInt = ((String)localObject2).length();
        if (localObject2 == null)
        {
          localObject2 = new v("null cannot be cast to non-null type java.lang.String");
          AppMethodBeat.o(121323);
          throw ((Throwable)localObject2);
        }
        localObject3 = ((String)localObject2).substring(1, paramInt - 1);
        a.f.b.j.o(localObject3, "(this as java.lang.Strin…ing(startIndex, endIndex)");
      }
      a.f.b.j.o(localObject3, "string");
      localObject3 = m.a((String)localObject3, '$', '.');
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     a.i.b.a.c.e.b.a.h
 * JD-Core Version:    0.6.2
 */