package a.i.b.a;

import a.i.b.a.a.d;
import a.i.b.a.c.b.b;
import a.l;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.List;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lkotlin/reflect/jvm/internal/KCallableImpl;", "R", "Lkotlin/reflect/KCallable;", "()V", "_annotations", "Lkotlin/reflect/jvm/internal/ReflectProperties$LazySoftVal;", "", "", "kotlin.jvm.PlatformType", "_parameters", "Ljava/util/ArrayList;", "Lkotlin/reflect/KParameter;", "_returnType", "Lkotlin/reflect/jvm/internal/KTypeImpl;", "_typeParameters", "Lkotlin/reflect/jvm/internal/KTypeParameterImpl;", "annotations", "getAnnotations", "()Ljava/util/List;", "caller", "Lkotlin/reflect/jvm/internal/calls/Caller;", "getCaller", "()Lkotlin/reflect/jvm/internal/calls/Caller;", "container", "Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;", "getContainer", "()Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;", "defaultCaller", "getDefaultCaller", "descriptor", "Lkotlin/reflect/jvm/internal/impl/descriptors/CallableMemberDescriptor;", "getDescriptor", "()Lorg/jetbrains/kotlin/descriptors/CallableMemberDescriptor;", "isAbstract", "", "()Z", "isAnnotationConstructor", "isBound", "isFinal", "isOpen", "parameters", "getParameters", "returnType", "Lkotlin/reflect/KType;", "getReturnType", "()Lkotlin/reflect/KType;", "typeParameters", "Lkotlin/reflect/KTypeParameter;", "getTypeParameters", "visibility", "Lkotlin/reflect/KVisibility;", "getVisibility", "()Lkotlin/reflect/KVisibility;", "call", "args", "", "", "([Ljava/lang/Object;)Ljava/lang/Object;", "callAnnotationConstructor", "", "(Ljava/util/Map;)Ljava/lang/Object;", "callBy", "callDefaultMethod", "continuationArgument", "Lkotlin/coroutines/Continuation;", "callDefaultMethod$kotlin_reflect_api", "(Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "defaultPrimitiveValue", "type", "Ljava/lang/reflect/Type;", "extractContinuationArgument", "kotlin-reflect-api"})
public abstract class e<R>
  implements a.i.a<R>
{
  private final z.a<List<Annotation>> AWu;
  private final z.a<ArrayList<a.i.j>> AWv;
  private final z.a<u> AWw;
  private final z.a<List<w>> AWx;

  public e()
  {
    z.a locala = z.a(null, (a.f.a.a)new e.a(this));
    a.f.b.j.o(locala, "ReflectProperties.lazySo…or.computeAnnotations() }");
    this.AWu = locala;
    locala = z.a(null, (a.f.a.a)new e.b(this));
    a.f.b.j.o(locala, "ReflectProperties.lazySo…ze()\n        result\n    }");
    this.AWv = locala;
    locala = z.a(null, (a.f.a.a)new e.c(this));
    a.f.b.j.o(locala, "ReflectProperties.lazySo…eturnType\n        }\n    }");
    this.AWw = locala;
    locala = z.a(null, (a.f.a.a)new e.d(this));
    a.f.b.j.o(locala, "ReflectProperties.lazySo…KTypeParameterImpl)\n    }");
    this.AWx = locala;
  }

  public final R W(Object[] paramArrayOfObject)
  {
    a.f.b.j.p(paramArrayOfObject, "args");
    try
    {
      paramArrayOfObject = dWU().W(paramArrayOfObject);
      return paramArrayOfObject;
    }
    catch (IllegalAccessException paramArrayOfObject)
    {
    }
    throw ((Throwable)new a.i.a.a(paramArrayOfObject));
  }

  public abstract b dWT();

  public abstract d<?> dWU();

  public abstract i dWV();

  protected final boolean dWW()
  {
    if ((a.f.b.j.j(getName(), "<init>")) && (dWV().dWH().isAnnotation()));
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public final List<a.i.j> getParameters()
  {
    Object localObject = this.AWv.invoke();
    a.f.b.j.o(localObject, "_parameters()");
    return (List)localObject;
  }

  public abstract boolean isBound();
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     a.i.b.a.e
 * JD-Core Version:    0.6.2
 */