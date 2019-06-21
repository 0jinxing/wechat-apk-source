package a.i.b.a.c.e.b.a;

import a.h.b;
import a.h.b.a;
import a.k.m;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public final class c
{
  public static final c Bym;
  private static final Map<String, String> map;

  static
  {
    AppMethodBeat.i(121306);
    Bym = new c();
    Map localMap = (Map)new LinkedHashMap();
    Object localObject1 = a.a.j.listOf(new String[] { "Boolean", "Z", "Char", "C", "Byte", "B", "Short", "S", "Int", "I", "Float", "F", "Long", "J", "Double", "D" });
    Object localObject2 = (b)a.a.j.g((Collection)localObject1);
    a.f.b.j.p(localObject2, "receiver$0");
    a.f.b.j.p((Number)Integer.valueOf(2), "step");
    Object localObject3 = b.AVL;
    int i = ((b)localObject2).AVJ;
    int j = ((b)localObject2).AVK;
    if (((b)localObject2).hzv > 0)
    {
      k = 2;
      localObject2 = b.a.aP(i, j, k);
      k = ((b)localObject2).AVJ;
      j = ((b)localObject2).AVK;
      i = ((b)localObject2).hzv;
      if (i <= 0)
        break label353;
      if (k > j)
        break label363;
    }
    label353: 
    while (k >= j)
    {
      while (true)
      {
        localMap.put("kotlin/" + (String)((List)localObject1).get(k), ((List)localObject1).get(k + 1));
        localMap.put("kotlin/" + (String)((List)localObject1).get(k) + "Array", "[" + (String)((List)localObject1).get(k + 1));
        if (k == j)
          break;
        k += i;
      }
      k = -2;
      break;
    }
    label363: localMap.put("kotlin/Unit", "V");
    localObject1 = new c.a(localMap);
    ((c.a)localObject1).iW("Any", "java/lang/Object");
    ((c.a)localObject1).iW("Nothing", "java/lang/Void");
    ((c.a)localObject1).iW("Annotation", "java/lang/annotation/Annotation");
    localObject2 = a.a.j.listOf(new String[] { "String", "CharSequence", "Throwable", "Cloneable", "Number", "Comparable", "Enum" }).iterator();
    while (((Iterator)localObject2).hasNext())
    {
      localObject3 = (String)((Iterator)localObject2).next();
      ((c.a)localObject1).iW((String)localObject3, "java/lang/".concat(String.valueOf(localObject3)));
    }
    localObject3 = a.a.j.listOf(new String[] { "Iterator", "Collection", "List", "Set", "Map", "ListIterator" }).iterator();
    while (((Iterator)localObject3).hasNext())
    {
      localObject2 = (String)((Iterator)localObject3).next();
      ((c.a)localObject1).iW("collections/".concat(String.valueOf(localObject2)), "java/util/".concat(String.valueOf(localObject2)));
      ((c.a)localObject1).iW("collections/Mutable".concat(String.valueOf(localObject2)), "java/util/".concat(String.valueOf(localObject2)));
    }
    ((c.a)localObject1).iW("collections/Iterable", "java/lang/Iterable");
    ((c.a)localObject1).iW("collections/MutableIterable", "java/lang/Iterable");
    ((c.a)localObject1).iW("collections/Map.Entry", "java/util/Map$Entry");
    ((c.a)localObject1).iW("collections/MutableMap.MutableEntry", "java/util/Map$Entry");
    for (int k = 0; k <= 22; k++)
    {
      ((c.a)localObject1).iW("Function".concat(String.valueOf(k)), "kotlin/jvm/functions/Function".concat(String.valueOf(k)));
      ((c.a)localObject1).iW("reflect/KFunction".concat(String.valueOf(k)), "kotlin/reflect/KFunction");
    }
    localObject3 = a.a.j.listOf(new String[] { "Char", "Byte", "Short", "Int", "Float", "Long", "Double", "String", "Enum" }).iterator();
    while (((Iterator)localObject3).hasNext())
    {
      localObject2 = (String)((Iterator)localObject3).next();
      ((c.a)localObject1).iW((String)localObject2 + ".Companion", "kotlin/jvm/internal/" + (String)localObject2 + "CompanionObject");
    }
    map = localMap;
    AppMethodBeat.o(121306);
  }

  public static final String avV(String paramString)
  {
    AppMethodBeat.i(121305);
    a.f.b.j.p(paramString, "classId");
    String str1 = (String)map.get(paramString);
    String str2 = str1;
    if (str1 == null)
      str2 = "L" + m.a(paramString, '.', '$') + ';';
    AppMethodBeat.o(121305);
    return str2;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     a.i.b.a.c.e.b.a.c
 * JD-Core Version:    0.6.2
 */