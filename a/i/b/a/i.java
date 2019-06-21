package a.i.b.a;

import a.f.b.d;
import a.i.b.a.c.b.ah;
import a.i.b.a.c.b.ay;
import a.i.b.a.c.b.b.a;
import a.i.b.a.c.b.n;
import a.i.b.a.c.b.t;
import a.i.b.a.c.f.f;
import a.i.b.a.c.i.e.h;
import a.i.b.a.c.i.e.j.a;
import a.k.m;
import a.v;
import a.y;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.List<+Ljava.lang.Class<*>;>;

@a.l(dWo={1, 1, 13}, dWp={""}, dWq={"Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;", "Lkotlin/jvm/internal/ClassBasedDeclarationContainer;", "()V", "constructorDescriptors", "", "Lkotlin/reflect/jvm/internal/impl/descriptors/ConstructorDescriptor;", "getConstructorDescriptors", "()Ljava/util/Collection;", "methodOwner", "Ljava/lang/Class;", "getMethodOwner", "()Ljava/lang/Class;", "addParametersAndMasks", "", "result", "", "desc", "", "isConstructor", "", "createProperty", "Lkotlin/reflect/jvm/internal/KPropertyImpl;", "descriptor", "Lkotlin/reflect/jvm/internal/impl/descriptors/PropertyDescriptor;", "findConstructorBySignature", "Ljava/lang/reflect/Constructor;", "isPublic", "findDefaultConstructor", "findDefaultMethod", "Ljava/lang/reflect/Method;", "name", "isMember", "findFunctionDescriptor", "Lkotlin/reflect/jvm/internal/impl/descriptors/FunctionDescriptor;", "signature", "findMethodBySignature", "findPropertyDescriptor", "getFunctions", "Lkotlin/reflect/jvm/internal/impl/name/Name;", "getLocalProperty", "index", "", "getMembers", "Lkotlin/reflect/jvm/internal/KCallableImpl;", "scope", "Lkotlin/reflect/jvm/internal/impl/resolve/scopes/MemberScope;", "belonginess", "Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl$MemberBelonginess;", "getProperties", "loadParameterTypes", "", "loadReturnType", "parseType", "begin", "end", "lookupMethod", "parameterTypes", "returnType", "tryGetConstructor", "declared", "tryGetMethod", "", "(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;Ljava/lang/Class;Z)Ljava/lang/reflect/Method;", "Companion", "Data", "MemberBelonginess", "kotlin-reflect-api"})
public abstract class i
  implements d
{
  private static final Class<?> AXe = Class.forName("a.f.b.g");
  static final a.k.k AXf = new a.k.k("<v#(\\d+)>");
  public static final i.a AXg = new i.a((byte)0);

  static Constructor<?> a(Class<?> paramClass, List<? extends Class<?>> paramList, boolean paramBoolean)
  {
    if (paramBoolean)
      try
      {
        paramList = (Collection)paramList;
        if (paramList == null)
        {
          paramClass = new a/v;
          paramClass.<init>("null cannot be cast to non-null type java.util.Collection<T>");
          throw paramClass;
        }
      }
      catch (NoSuchMethodException paramClass)
      {
        paramClass = null;
      }
    while (true)
    {
      return paramClass;
      paramList = paramList.toArray(new Class[0]);
      if (paramList == null)
      {
        paramClass = new a/v;
        paramClass.<init>("null cannot be cast to non-null type kotlin.Array<T>");
        throw paramClass;
      }
      paramList = (Class[])paramList;
      paramClass = paramClass.getDeclaredConstructor((Class[])Arrays.copyOf(paramList, paramList.length));
      continue;
      paramList = (Collection)paramList;
      if (paramList == null)
      {
        paramClass = new a/v;
        paramClass.<init>("null cannot be cast to non-null type java.util.Collection<T>");
        throw paramClass;
      }
      paramList = paramList.toArray(new Class[0]);
      if (paramList == null)
      {
        paramClass = new a/v;
        paramClass.<init>("null cannot be cast to non-null type kotlin.Array<T>");
        throw paramClass;
      }
      paramList = (Class[])paramList;
      paramClass = paramClass.getConstructor((Class[])Arrays.copyOf(paramList, paramList.length));
    }
  }

  private final Method a(Class<?> paramClass1, String paramString, List<? extends Class<?>> paramList, Class<?> paramClass2, boolean paramBoolean)
  {
    Object localObject = (Collection)paramList;
    if (localObject == null)
      throw new v("null cannot be cast to non-null type java.util.Collection<T>");
    localObject = ((Collection)localObject).toArray(new Class[0]);
    if (localObject == null)
      throw new v("null cannot be cast to non-null type kotlin.Array<T>");
    Class[] arrayOfClass = (Class[])localObject;
    localObject = paramClass1;
    if (paramBoolean)
    {
      localObject = a(paramClass1, paramString, arrayOfClass, paramClass2, false);
      if (localObject != null)
        paramList = (List<? extends Class<?>>)localObject;
    }
    while (true)
    {
      return paramList;
      localObject = paramClass1;
      if (paramClass1.isInterface())
      {
        localObject = a(Object.class, paramString, paramList, paramClass2, paramBoolean);
        paramList = (List<? extends Class<?>>)localObject;
        if (localObject != null);
      }
      else
      {
        for (localObject = paramClass1; ; localObject = ((Class)localObject).getSuperclass())
        {
          if (localObject == null)
            break label154;
          paramClass1 = a((Class)localObject, paramString, arrayOfClass, paramClass2, true);
          paramList = paramClass1;
          if (paramClass1 != null)
            break;
        }
        label154: paramList = null;
      }
    }
  }

  private static Method a(Class<?> paramClass1, String paramString, Class<?>[] paramArrayOfClass, Class<?> paramClass2, boolean paramBoolean)
  {
    Object localObject1 = null;
    if (paramBoolean);
    try
    {
      Object localObject2 = paramClass1.getDeclaredMethod(paramString, (Class[])Arrays.copyOf(paramArrayOfClass, paramArrayOfClass.length));
      a.f.b.j.o(localObject2, "result");
      if (a.f.b.j.j(((Method)localObject2).getReturnType(), paramClass2))
        paramClass1 = (Class<?>)localObject2;
      while (true)
      {
        return paramClass1;
        localObject2 = paramClass1.getMethod(paramString, (Class[])Arrays.copyOf(paramArrayOfClass, paramArrayOfClass.length));
        break;
        int j;
        if (paramBoolean)
        {
          localObject2 = paramClass1.getDeclaredMethods();
          a.f.b.j.o(localObject2, "allMethods");
          int i = localObject2.length;
          j = 0;
          label93: if (j >= i)
            break label186;
          paramClass1 = localObject2[j];
          a.f.b.j.o(paramClass1, "method");
          if ((!a.f.b.j.j(paramClass1.getName(), paramString)) || (!a.f.b.j.j(paramClass1.getReturnType(), paramClass2)))
            break label180;
          Class[] arrayOfClass = paramClass1.getParameterTypes();
          if (arrayOfClass == null)
            a.f.b.j.dWJ();
          if (!Arrays.equals(arrayOfClass, paramArrayOfClass))
            break label180;
        }
        label180: for (int k = 1; ; k = 0)
        {
          if (k != 0)
            break label184;
          j++;
          break label93;
          localObject2 = paramClass1.getMethods();
          break;
        }
        label184: continue;
        label186: paramClass1 = null;
      }
    }
    catch (NoSuchMethodException paramClass1)
    {
      while (true)
        paramClass1 = localObject1;
    }
  }

  private final Class<?> aA(String paramString, int paramInt1, int paramInt2)
  {
    switch (paramString.charAt(paramInt1))
    {
    case 'E':
    case 'G':
    case 'H':
    case 'K':
    case 'M':
    case 'N':
    case 'O':
    case 'P':
    case 'Q':
    case 'R':
    case 'T':
    case 'U':
    case 'W':
    case 'X':
    case 'Y':
    default:
      throw ((Throwable)new x("Unknown type prefix in the method signature: ".concat(String.valueOf(paramString))));
    case 'L':
      ClassLoader localClassLoader = a.i.b.a.e.b.aX(dWH());
      if (paramString == null)
        throw new v("null cannot be cast to non-null type java.lang.String");
      paramString = paramString.substring(paramInt1 + 1, paramInt2 - 1);
      a.f.b.j.o(paramString, "(this as java.lang.Strin…ing(startIndex, endIndex)");
      paramString = localClassLoader.loadClass(m.a(paramString, '/', '.'));
      a.f.b.j.o(paramString, "jClass.safeClassLoader.l…d - 1).replace('/', '.'))");
    case '[':
    case 'V':
    case 'Z':
    case 'C':
    case 'B':
    case 'S':
    case 'I':
    case 'F':
    case 'J':
    case 'D':
    }
    while (true)
    {
      return paramString;
      paramString = a.i.b.a.e.b.bd(aA(paramString, paramInt1 + 1, paramInt2));
      continue;
      paramString = Void.TYPE;
      a.f.b.j.o(paramString, "Void.TYPE");
      continue;
      paramString = Boolean.TYPE;
      continue;
      paramString = Character.TYPE;
      continue;
      paramString = Byte.TYPE;
      continue;
      paramString = Short.TYPE;
      continue;
      paramString = Integer.TYPE;
      continue;
      paramString = Float.TYPE;
      continue;
      paramString = Long.TYPE;
      continue;
      paramString = Double.TYPE;
    }
  }

  private final List<Class<?>> avx(String paramString)
  {
    ArrayList localArrayList = new ArrayList();
    int i = 1;
    if (paramString.charAt(i) != ')')
    {
      for (int j = i; paramString.charAt(j) == '['; j++);
      char c = paramString.charAt(j);
      if (m.c((CharSequence)"VZCBSIFJD", c))
        j++;
      while (true)
      {
        localArrayList.add(aA(paramString, i, j));
        i = j;
        break;
        if (c != 'L')
          break label109;
        j = m.a((CharSequence)paramString, ';', i, 4) + 1;
      }
      label109: throw ((Throwable)new x("Unknown type prefix in the method signature: ".concat(String.valueOf(paramString))));
    }
    return (List)localArrayList;
  }

  private final Class<?> avy(String paramString)
  {
    return aA(paramString, m.a((CharSequence)paramString, ')', 0, 6) + 1, paramString.length());
  }

  public final Method H(String paramString1, String paramString2, boolean paramBoolean)
  {
    a.f.b.j.p(paramString1, "name");
    a.f.b.j.p(paramString2, "desc");
    if (a.f.b.j.j(paramString1, "<init>"));
    for (paramString1 = null; ; paramString1 = a(dXc(), paramString1, avx(paramString2), avy(paramString2), paramBoolean))
      return paramString1;
  }

  public abstract ah SJ(int paramInt);

  public abstract Collection<ah> a(f paramf);

  protected final Collection<e<?>> a(h paramh, c paramc)
  {
    a.f.b.j.p(paramh, "scope");
    a.f.b.j.p(paramc, "belonginess");
    i.g localg = new i.g(this);
    paramh = (Iterable)j.a.a(paramh, null, null, 3);
    Collection localCollection = (Collection)new ArrayList();
    Iterator localIterator = paramh.iterator();
    label149: 
    while (localIterator.hasNext())
    {
      paramh = (a.i.b.a.c.b.l)localIterator.next();
      if (((paramh instanceof a.i.b.a.c.b.b)) && ((a.f.b.j.j(((a.i.b.a.c.b.b)paramh).dYf(), ay.Bfd) ^ true)) && (paramc.a((a.i.b.a.c.b.b)paramh)));
      for (paramh = (e)paramh.a((n)localg, y.AUy); ; paramh = null)
      {
        if (paramh == null)
          break label149;
        localCollection.add(paramh);
        break;
      }
    }
    return (Collection)a.a.j.m((Iterable)localCollection);
  }

  public abstract Collection<t> b(f paramf);

  final void c(List<Class<?>> paramList, String paramString, boolean paramBoolean)
  {
    paramString = avx(paramString);
    paramList.addAll((Collection)paramString);
    int i = (paramString.size() + 32 - 1) / 32;
    for (int j = 0; j < i; j++)
    {
      paramString = Integer.TYPE;
      a.f.b.j.o(paramString, "Integer.TYPE");
      paramList.add(paramString);
    }
    if (paramBoolean);
    for (paramString = AXe; ; paramString = Object.class)
    {
      a.f.b.j.o(paramString, "if (isConstructor) DEFAU…RKER else Any::class.java");
      paramList.add(paramString);
      return;
    }
  }

  public final Constructor<?> cu(String paramString, boolean paramBoolean)
  {
    a.f.b.j.p(paramString, "desc");
    Class localClass = dWH();
    paramString = avx(paramString);
    if (!paramBoolean);
    for (paramBoolean = true; ; paramBoolean = false)
      return a(localClass, paramString, paramBoolean);
  }

  public final Method d(String paramString1, String paramString2, boolean paramBoolean1, boolean paramBoolean2)
  {
    a.f.b.j.p(paramString1, "name");
    a.f.b.j.p(paramString2, "desc");
    if (a.f.b.j.j(paramString1, "<init>"));
    ArrayList localArrayList;
    for (paramString1 = null; ; paramString1 = a(dXc(), paramString1 + "$default", (List)localArrayList, avy(paramString2), paramBoolean2))
    {
      return paramString1;
      localArrayList = new ArrayList();
      if (paramBoolean1)
        localArrayList.add(dWH());
      c((List)localArrayList, paramString2, false);
    }
  }

  public abstract Collection<a.i.b.a.c.b.k> dWR();

  protected Class<?> dXc()
  {
    Class localClass1 = a.i.b.a.e.b.ba(dWH());
    Class localClass2 = localClass1;
    if (localClass1 == null)
      localClass2 = dWH();
    return localClass2;
  }

  @a.l(dWo={1, 1, 13}, dWp={""}, dWq={"Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl$MemberBelonginess;", "", "(Ljava/lang/String;I)V", "accept", "", "member", "Lkotlin/reflect/jvm/internal/impl/descriptors/CallableMemberDescriptor;", "DECLARED", "INHERITED", "kotlin-reflect-api"})
  protected static enum c
  {
    static
    {
      AppMethodBeat.i(118743);
      c localc1 = new c("DECLARED", 0);
      AXk = localc1;
      c localc2 = new c("INHERITED", 1);
      AXl = localc2;
      AXm = new c[] { localc1, localc2 };
      AppMethodBeat.o(118743);
    }

    public final boolean a(a.i.b.a.c.b.b paramb)
    {
      boolean bool1 = true;
      AppMethodBeat.i(118744);
      a.f.b.j.p(paramb, "member");
      paramb = paramb.dYZ();
      a.f.b.j.o(paramb, "member.kind");
      boolean bool2 = paramb.dZa();
      if ((c)this == AXk)
      {
        bool3 = true;
        if (bool2 != bool3)
          break label67;
        AppMethodBeat.o(118744);
      }
      for (boolean bool3 = bool1; ; bool3 = false)
      {
        return bool3;
        bool3 = false;
        break;
        label67: AppMethodBeat.o(118744);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     a.i.b.a.i
 * JD-Core Version:    0.6.2
 */