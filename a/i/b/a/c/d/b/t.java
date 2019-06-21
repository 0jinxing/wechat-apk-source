package a.i.b.a.c.d.b;

import a.i.b.a.c.b.e;
import a.i.b.a.c.b.l;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;

public final class t
{
  public static final t BrJ;

  static
  {
    AppMethodBeat.i(120319);
    BrJ = new t();
    AppMethodBeat.o(120319);
  }

  public static String a(e parame, String paramString)
  {
    AppMethodBeat.i(120315);
    a.f.b.j.p(parame, "classDescriptor");
    a.f.b.j.p(paramString, "jvmDescriptor");
    a.f.b.j.p(parame, "receiver$0");
    Object localObject = a.i.b.a.c.a.b.c.Bdq;
    localObject = a.i.b.a.c.i.c.a.o((l)parame).ByQ;
    a.f.b.j.o(localObject, "fqNameSafe.toUnsafe()");
    localObject = a.i.b.a.c.a.b.c.c((a.i.b.a.c.f.c)localObject);
    if (localObject != null)
    {
      parame = a.i.b.a.c.i.d.b.h((a.i.b.a.c.f.a)localObject);
      a.f.b.j.o(parame, "JvmClassName.byClassId(it)");
      parame = parame.BrD;
      a.f.b.j.o(parame, "JvmClassName.byClassId(it).internalName");
    }
    while (true)
    {
      parame = iV(parame, paramString);
      AppMethodBeat.o(120315);
      return parame;
      parame = y.a(parame, (u)v.BrL, false);
    }
  }

  public static String[] ad(String[] paramArrayOfString)
  {
    AppMethodBeat.i(120311);
    a.f.b.j.p(paramArrayOfString, "signatures");
    Collection localCollection = (Collection)new ArrayList(paramArrayOfString.length);
    int i = paramArrayOfString.length;
    for (int j = 0; j < i; j++)
    {
      String str = paramArrayOfString[j];
      localCollection.add("<init>(" + str + ")V");
    }
    paramArrayOfString = ((Collection)localCollection).toArray(new String[0]);
    if (paramArrayOfString == null)
    {
      paramArrayOfString = new a.v("null cannot be cast to non-null type kotlin.Array<T>");
      AppMethodBeat.o(120311);
      throw paramArrayOfString;
    }
    paramArrayOfString = (String[])paramArrayOfString;
    AppMethodBeat.o(120311);
    return paramArrayOfString;
  }

  public static String avQ(String paramString)
  {
    AppMethodBeat.i(120308);
    a.f.b.j.p(paramString, "name");
    paramString = "java/lang/".concat(String.valueOf(paramString));
    AppMethodBeat.o(120308);
    return paramString;
  }

  public static String avR(String paramString)
  {
    AppMethodBeat.i(120309);
    a.f.b.j.p(paramString, "name");
    paramString = "java/util/".concat(String.valueOf(paramString));
    AppMethodBeat.o(120309);
    return paramString;
  }

  public static String avS(String paramString)
  {
    AppMethodBeat.i(120310);
    a.f.b.j.p(paramString, "name");
    paramString = "java/util/function/".concat(String.valueOf(paramString));
    AppMethodBeat.o(120310);
    return paramString;
  }

  private static String avT(String paramString)
  {
    AppMethodBeat.i(120318);
    if (paramString.length() > 1)
    {
      paramString = "L" + paramString + ';';
      AppMethodBeat.o(120318);
    }
    while (true)
    {
      return paramString;
      AppMethodBeat.o(120318);
    }
  }

  public static String e(String paramString1, List<String> paramList, String paramString2)
  {
    AppMethodBeat.i(120317);
    a.f.b.j.p(paramString1, "name");
    a.f.b.j.p(paramList, "parameters");
    a.f.b.j.p(paramString2, "ret");
    paramString1 = paramString1 + '(' + a.a.j.a((Iterable)paramList, (CharSequence)"", null, null, 0, null, (a.f.a.b)t.a.BrK, 30) + ')' + avT(paramString2);
    AppMethodBeat.o(120317);
    return paramString1;
  }

  public static String iV(String paramString1, String paramString2)
  {
    AppMethodBeat.i(120316);
    a.f.b.j.p(paramString1, "internalName");
    a.f.b.j.p(paramString2, "jvmDescriptor");
    paramString1 = paramString1 + "." + paramString2;
    AppMethodBeat.o(120316);
    return paramString1;
  }

  public static LinkedHashSet<String> p(String paramString, String[] paramArrayOfString)
  {
    AppMethodBeat.i(120312);
    a.f.b.j.p(paramString, "name");
    a.f.b.j.p(paramArrayOfString, "signatures");
    paramString = r(avQ(paramString), (String[])Arrays.copyOf(paramArrayOfString, paramArrayOfString.length));
    AppMethodBeat.o(120312);
    return paramString;
  }

  public static LinkedHashSet<String> q(String paramString, String[] paramArrayOfString)
  {
    AppMethodBeat.i(120313);
    a.f.b.j.p(paramString, "name");
    a.f.b.j.p(paramArrayOfString, "signatures");
    paramString = r(avR(paramString), (String[])Arrays.copyOf(paramArrayOfString, paramArrayOfString.length));
    AppMethodBeat.o(120313);
    return paramString;
  }

  private static LinkedHashSet<String> r(String paramString, String[] paramArrayOfString)
  {
    AppMethodBeat.i(120314);
    a.f.b.j.p(paramString, "internalName");
    a.f.b.j.p(paramArrayOfString, "signatures");
    Collection localCollection = (Collection)new LinkedHashSet();
    int i = paramArrayOfString.length;
    for (int j = 0; j < i; j++)
    {
      String str = paramArrayOfString[j];
      localCollection.add(paramString + "." + str);
    }
    paramString = (LinkedHashSet)localCollection;
    AppMethodBeat.o(120314);
    return paramString;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     a.i.b.a.c.d.b.t
 * JD-Core Version:    0.6.2
 */