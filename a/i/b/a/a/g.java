package a.i.b.a.a;

import a.f;
import a.f.a.a;
import a.f.b.j;
import a.f.b.t;
import a.i.b.a.x;
import a.l;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.List;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lkotlin/reflect/jvm/internal/calls/InlineClassAwareCaller;", "M", "Ljava/lang/reflect/Member;", "Lkotlin/reflect/jvm/internal/calls/Caller;", "descriptor", "Lkotlin/reflect/jvm/internal/impl/descriptors/CallableMemberDescriptor;", "caller", "Lkotlin/reflect/jvm/internal/calls/CallerImpl;", "isDefault", "", "(Lorg/jetbrains/kotlin/descriptors/CallableMemberDescriptor;Lkotlin/reflect/jvm/internal/calls/CallerImpl;Z)V", "data", "Lkotlin/reflect/jvm/internal/calls/InlineClassAwareCaller$BoxUnboxData;", "getData", "()Lkotlin/reflect/jvm/internal/calls/InlineClassAwareCaller$BoxUnboxData;", "data$delegate", "Lkotlin/Lazy;", "member", "getMember", "()Ljava/lang/reflect/Member;", "parameterTypes", "", "Ljava/lang/reflect/Type;", "getParameterTypes", "()Ljava/util/List;", "returnType", "getReturnType", "()Ljava/lang/reflect/Type;", "call", "", "args", "", "([Ljava/lang/Object;)Ljava/lang/Object;", "getBoxMethod", "Ljava/lang/reflect/Method;", "Ljava/lang/Class;", "getUnboxMethod", "toInlineClass", "Lkotlin/reflect/jvm/internal/impl/types/KotlinType;", "BoxUnboxData", "kotlin-reflect-api"})
public final class g<M extends Member>
  implements d<M>
{
  private final f AZh;
  private final a.i.b.a.c.b.b AZi;
  final e<M> AZj;
  private final boolean isDefault;

  static
  {
    AppMethodBeat.i(119006);
    eQB = new a.i.k[] { (a.i.k)a.f.b.v.a(new t(a.f.b.v.aN(g.class), "data", "getData()Lkotlin/reflect/jvm/internal/calls/InlineClassAwareCaller$BoxUnboxData;")) };
    AppMethodBeat.o(119006);
  }

  public g(a.i.b.a.c.b.b paramb, e<? extends M> parame, boolean paramBoolean)
  {
    AppMethodBeat.i(119010);
    this.AZi = paramb;
    this.AZj = parame;
    this.isDefault = paramBoolean;
    this.AZh = a.g.a(a.k.AUm, (a)new g.b(this));
    AppMethodBeat.o(119010);
  }

  private final Method aS(Class<?> paramClass)
  {
    AppMethodBeat.i(119008);
    try
    {
      Method localMethod = paramClass.getDeclaredMethod("box-impl", new Class[] { aT(paramClass).getReturnType() });
      j.o(localMethod, "getDeclaredMethod(\"box\" …UnboxMethod().returnType)");
      AppMethodBeat.o(119008);
      return localMethod;
    }
    catch (NoSuchMethodException localNoSuchMethodException)
    {
      paramClass = (Throwable)new x("No box method found in inline class: " + paramClass + " (calling " + this.AZi + ')');
      AppMethodBeat.o(119008);
    }
    throw paramClass;
  }

  private final Method aT(Class<?> paramClass)
  {
    AppMethodBeat.i(119009);
    try
    {
      Method localMethod = paramClass.getDeclaredMethod("unbox-impl", new Class[0]);
      j.o(localMethod, "getDeclaredMethod(\"unbox…FOR_INLINE_CLASS_MEMBERS)");
      AppMethodBeat.o(119009);
      return localMethod;
    }
    catch (NoSuchMethodException localNoSuchMethodException)
    {
      paramClass = (Throwable)new x("No unbox method found in inline class: " + paramClass + " (calling " + this.AZi + ')');
      AppMethodBeat.o(119009);
    }
    throw paramClass;
  }

  public final Object W(Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(119007);
    j.p(paramArrayOfObject, "args");
    Object localObject1 = (g.a)this.AZh.getValue();
    Object localObject2 = ((g.a)localObject1).AZk;
    Method[] arrayOfMethod = ((g.a)localObject1).AZl;
    Method localMethod1 = ((g.a)localObject1).AZm;
    Object[] arrayOfObject = Arrays.copyOf(paramArrayOfObject, paramArrayOfObject.length);
    j.o(arrayOfObject, "java.util.Arrays.copyOf(this, size)");
    if (arrayOfObject == null)
    {
      paramArrayOfObject = new a.v("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
      AppMethodBeat.o(119007);
      throw paramArrayOfObject;
    }
    int i = ((a.h.b)localObject2).AVJ;
    int j = ((a.h.b)localObject2).AVK;
    if (i <= j)
      while (true)
      {
        Method localMethod2 = arrayOfMethod[i];
        localObject1 = paramArrayOfObject[i];
        localObject2 = localObject1;
        if (localMethod2 != null)
        {
          localObject2 = localObject1;
          if (localObject1 != null)
            localObject2 = localMethod2.invoke(localObject1, new Object[0]);
        }
        arrayOfObject[i] = localObject2;
        if (i == j)
          break;
        i++;
      }
    localObject2 = this.AZj.W(arrayOfObject);
    if (localMethod1 != null)
    {
      localObject1 = localMethod1.invoke(null, new Object[] { localObject2 });
      paramArrayOfObject = (Object[])localObject1;
      if (localObject1 != null);
    }
    else
    {
      paramArrayOfObject = (Object[])localObject2;
    }
    AppMethodBeat.o(119007);
    return paramArrayOfObject;
  }

  public final M dXw()
  {
    return this.AZj.AZb;
  }

  public final Type dXx()
  {
    return this.AZj.AZc;
  }

  public final List<Type> dXy()
  {
    return this.AZj.AYH;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     a.i.b.a.a.g
 * JD-Core Version:    0.6.2
 */