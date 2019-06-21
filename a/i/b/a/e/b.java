package a.i.b.a.e;

import a.a.ad;
import a.f.a.d;
import a.f.a.g;
import a.f.a.h;
import a.f.a.k;
import a.f.a.n;
import a.f.a.o;
import a.f.a.p;
import a.f.a.q;
import a.f.a.r;
import a.f.a.s;
import a.f.a.t;
import a.f.a.w;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.lang.reflect.Array;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

@a.l(dWo={1, 1, 13}, dWp={""}, dWq={"FUNCTION_CLASSES", "", "Ljava/lang/Class;", "Lkotlin/Function;", "", "PRIMITIVE_CLASSES", "", "Lkotlin/reflect/KClass;", "", "PRIMITIVE_TO_WRAPPER", "WRAPPER_TO_PRIMITIVE", "classId", "Lkotlin/reflect/jvm/internal/impl/name/ClassId;", "getClassId", "(Ljava/lang/Class;)Lorg/jetbrains/kotlin/name/ClassId;", "desc", "", "getDesc", "(Ljava/lang/Class;)Ljava/lang/String;", "functionClassArity", "getFunctionClassArity", "(Ljava/lang/Class;)Ljava/lang/Integer;", "parameterizedTypeArguments", "Ljava/lang/reflect/Type;", "getParameterizedTypeArguments", "(Ljava/lang/reflect/Type;)Ljava/util/List;", "primitiveByWrapper", "getPrimitiveByWrapper", "(Ljava/lang/Class;)Ljava/lang/Class;", "safeClassLoader", "Ljava/lang/ClassLoader;", "getSafeClassLoader", "(Ljava/lang/Class;)Ljava/lang/ClassLoader;", "wrapperByPrimitive", "getWrapperByPrimitive", "createArrayType", "isEnumClassOrSpecializedEnumEntryClass", "", "descriptors.runtime"})
public final class b
{
  private static final List<a.i.b<? extends Object>> BNM;
  private static final Map<Class<? extends Object>, Class<? extends Object>> BNN;
  private static final Map<Class<? extends Object>, Class<? extends Object>> BNO;
  private static final Map<Class<? extends a.c<?>>, Integer> BNP;

  static
  {
    int i = 0;
    AppMethodBeat.i(123022);
    Object localObject1 = a.a.j.listOf(new a.i.b[] { a.f.b.v.aN(Boolean.TYPE), a.f.b.v.aN(Byte.TYPE), a.f.b.v.aN(Character.TYPE), a.f.b.v.aN(Double.TYPE), a.f.b.v.aN(Float.TYPE), a.f.b.v.aN(Integer.TYPE), a.f.b.v.aN(Long.TYPE), a.f.b.v.aN(Short.TYPE) });
    BNM = (List)localObject1;
    Object localObject2 = (Iterable)localObject1;
    localObject1 = (Collection)new ArrayList(a.a.j.d((Iterable)localObject2));
    Object localObject3 = ((Iterable)localObject2).iterator();
    while (((Iterator)localObject3).hasNext())
    {
      localObject2 = (a.i.b)((Iterator)localObject3).next();
      ((Collection)localObject1).add(a.u.I(a.f.a.c((a.i.b)localObject2), a.f.a.b((a.i.b)localObject2)));
    }
    BNN = ad.v((Iterable)localObject1);
    localObject2 = (Iterable)BNM;
    localObject1 = (Collection)new ArrayList(a.a.j.d((Iterable)localObject2));
    localObject2 = ((Iterable)localObject2).iterator();
    while (((Iterator)localObject2).hasNext())
    {
      localObject3 = (a.i.b)((Iterator)localObject2).next();
      ((Collection)localObject1).add(a.u.I(a.f.a.b((a.i.b)localObject3), a.f.a.c((a.i.b)localObject3)));
    }
    BNO = ad.v((Iterable)localObject1);
    localObject2 = (Iterable)a.a.j.listOf(new Class[] { a.f.a.a.class, a.f.a.b.class, a.f.a.m.class, q.class, r.class, s.class, t.class, a.f.a.u.class, a.f.a.v.class, w.class, a.f.a.c.class, d.class, a.f.a.e.class, a.f.a.f.class, g.class, h.class, a.f.a.i.class, a.f.a.j.class, k.class, a.f.a.l.class, n.class, o.class, p.class });
    localObject1 = (Collection)new ArrayList(a.a.j.d((Iterable)localObject2));
    localObject2 = ((Iterable)localObject2).iterator();
    while (((Iterator)localObject2).hasNext())
    {
      localObject3 = ((Iterator)localObject2).next();
      if (i < 0)
        a.a.j.dWs();
      ((Collection)localObject1).add(a.u.I((Class)localObject3, Integer.valueOf(i)));
      i++;
    }
    BNP = ad.v((Iterable)localObject1);
    AppMethodBeat.o(123022);
  }

  public static final List<Type> a(Type paramType)
  {
    AppMethodBeat.i(123021);
    a.f.b.j.p(paramType, "receiver$0");
    if (!(paramType instanceof ParameterizedType))
    {
      paramType = (List)a.a.v.AUP;
      AppMethodBeat.o(123021);
    }
    while (true)
    {
      return paramType;
      if (((ParameterizedType)paramType).getOwnerType() == null)
      {
        paramType = ((ParameterizedType)paramType).getActualTypeArguments();
        a.f.b.j.o(paramType, "actualTypeArguments");
        paramType = a.a.e.Q(paramType);
        AppMethodBeat.o(123021);
      }
      else
      {
        paramType = a.j.i.c(a.j.i.c(a.j.i.a(paramType, (a.f.a.b)b.a.BNQ), (a.f.a.b)b.b.BNR));
        AppMethodBeat.o(123021);
      }
    }
  }

  public static final ClassLoader aX(Class<?> paramClass)
  {
    AppMethodBeat.i(123014);
    a.f.b.j.p(paramClass, "receiver$0");
    ClassLoader localClassLoader = paramClass.getClassLoader();
    paramClass = localClassLoader;
    if (localClassLoader == null)
    {
      paramClass = ClassLoader.getSystemClassLoader();
      a.f.b.j.o(paramClass, "ClassLoader.getSystemClassLoader()");
    }
    AppMethodBeat.o(123014);
    return paramClass;
  }

  public static final boolean aY(Class<?> paramClass)
  {
    AppMethodBeat.i(123015);
    a.f.b.j.p(paramClass, "receiver$0");
    boolean bool = Enum.class.isAssignableFrom(paramClass);
    AppMethodBeat.o(123015);
    return bool;
  }

  public static final Class<?> aZ(Class<?> paramClass)
  {
    AppMethodBeat.i(123016);
    a.f.b.j.p(paramClass, "receiver$0");
    paramClass = (Class)BNN.get(paramClass);
    AppMethodBeat.o(123016);
    return paramClass;
  }

  public static final Class<?> ba(Class<?> paramClass)
  {
    AppMethodBeat.i(123017);
    a.f.b.j.p(paramClass, "receiver$0");
    paramClass = (Class)BNO.get(paramClass);
    AppMethodBeat.o(123017);
    return paramClass;
  }

  public static final a.i.b.a.c.f.a bb(Class<?> paramClass)
  {
    AppMethodBeat.i(123018);
    a.f.b.j.p(paramClass, "receiver$0");
    if (paramClass.isPrimitive())
    {
      paramClass = (Throwable)new IllegalArgumentException("Can't compute ClassId for primitive type: ".concat(String.valueOf(paramClass)));
      AppMethodBeat.o(123018);
      throw paramClass;
    }
    if (paramClass.isArray())
    {
      paramClass = (Throwable)new IllegalArgumentException("Can't compute ClassId for array type: ".concat(String.valueOf(paramClass)));
      AppMethodBeat.o(123018);
      throw paramClass;
    }
    Object localObject;
    int i;
    if ((paramClass.getEnclosingMethod() == null) && (paramClass.getEnclosingConstructor() == null))
    {
      localObject = paramClass.getSimpleName();
      a.f.b.j.o(localObject, "simpleName");
      if (((CharSequence)localObject).length() == 0)
      {
        i = 1;
        if (i == 0)
          break label176;
      }
    }
    else
    {
      paramClass = new a.i.b.a.c.f.b(paramClass.getName());
      paramClass = new a.i.b.a.c.f.a(paramClass.ehG(), a.i.b.a.c.f.b.s(paramClass.ByQ.ehK()), true);
      AppMethodBeat.o(123018);
    }
    while (true)
    {
      return paramClass;
      i = 0;
      break;
      label176: localObject = paramClass.getDeclaringClass();
      if (localObject != null)
      {
        localObject = bb((Class)localObject);
        if (localObject != null)
        {
          paramClass = ((a.i.b.a.c.f.a)localObject).p(a.i.b.a.c.f.f.avX(paramClass.getSimpleName()));
          AppMethodBeat.o(123018);
        }
      }
      else
      {
        paramClass = a.i.b.a.c.f.a.n(new a.i.b.a.c.f.b(paramClass.getName()));
        a.f.b.j.o(paramClass, "ClassId.topLevel(FqName(name))");
        AppMethodBeat.o(123018);
      }
    }
  }

  public static final String bc(Class<?> paramClass)
  {
    AppMethodBeat.i(123019);
    a.f.b.j.p(paramClass, "receiver$0");
    if (a.f.b.j.j(paramClass, Void.TYPE))
    {
      paramClass = "V";
      AppMethodBeat.o(123019);
    }
    while (true)
    {
      return paramClass;
      paramClass = bd(paramClass).getName();
      a.f.b.j.o(paramClass, "createArrayType().name");
      if (paramClass == null)
      {
        paramClass = new a.v("null cannot be cast to non-null type java.lang.String");
        AppMethodBeat.o(123019);
        throw paramClass;
      }
      paramClass = paramClass.substring(1);
      a.f.b.j.o(paramClass, "(this as java.lang.String).substring(startIndex)");
      paramClass = a.k.m.a(paramClass, '.', '/');
      AppMethodBeat.o(123019);
    }
  }

  public static final Class<?> bd(Class<?> paramClass)
  {
    AppMethodBeat.i(123020);
    a.f.b.j.p(paramClass, "receiver$0");
    paramClass = Array.newInstance(paramClass, 0).getClass();
    AppMethodBeat.o(123020);
    return paramClass;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     a.i.b.a.e.b
 * JD-Core Version:    0.6.2
 */