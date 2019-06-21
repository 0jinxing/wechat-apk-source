package a.i.b.a;

import a.f.a.a;
import a.f.b.h;
import a.f.b.v;
import a.i.b.a.a.d;
import a.i.k;
import a.l;
import com.tencent.matrix.trace.core.AppMethodBeat;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lkotlin/reflect/jvm/internal/KFunctionImpl;", "Lkotlin/reflect/jvm/internal/KCallableImpl;", "", "Lkotlin/reflect/KFunction;", "Lkotlin/jvm/internal/FunctionBase;", "Lkotlin/reflect/jvm/internal/FunctionWithAllInvokes;", "container", "Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;", "name", "", "signature", "boundReceiver", "(Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V", "descriptor", "Lkotlin/reflect/jvm/internal/impl/descriptors/FunctionDescriptor;", "(Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;Lorg/jetbrains/kotlin/descriptors/FunctionDescriptor;)V", "descriptorInitialValue", "(Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;Ljava/lang/String;Ljava/lang/String;Lorg/jetbrains/kotlin/descriptors/FunctionDescriptor;Ljava/lang/Object;)V", "arity", "", "getArity", "()I", "caller", "Lkotlin/reflect/jvm/internal/calls/Caller;", "getCaller", "()Lkotlin/reflect/jvm/internal/calls/Caller;", "caller$delegate", "Lkotlin/reflect/jvm/internal/ReflectProperties$LazySoftVal;", "getContainer", "()Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;", "defaultCaller", "getDefaultCaller", "defaultCaller$delegate", "getDescriptor", "()Lorg/jetbrains/kotlin/descriptors/FunctionDescriptor;", "descriptor$delegate", "isBound", "", "()Z", "isExternal", "isInfix", "isInline", "isOperator", "isSuspend", "getName", "()Ljava/lang/String;", "createConstructorCaller", "Lkotlin/reflect/jvm/internal/calls/CallerImpl;", "Ljava/lang/reflect/Constructor;", "member", "createInstanceMethodCaller", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$Method;", "Ljava/lang/reflect/Method;", "createJvmStaticInObjectCaller", "createStaticMethodCaller", "equals", "other", "hashCode", "toString", "kotlin-reflect-api"})
public final class j extends e<Object>
  implements h<Object>, b, a.i.e<Object>
{
  private final z.a AWG;
  private final z.a AXq;
  private final z.a AXr;
  final i AXs;
  private final Object AXt;
  private final String signature;

  static
  {
    AppMethodBeat.i(118759);
    eQB = new k[] { (k)v.a(new a.f.b.t(v.aN(j.class), "descriptor", "getDescriptor()Lorg/jetbrains/kotlin/descriptors/FunctionDescriptor;")), (k)v.a(new a.f.b.t(v.aN(j.class), "caller", "getCaller()Lkotlin/reflect/jvm/internal/calls/Caller;")), (k)v.a(new a.f.b.t(v.aN(j.class), "defaultCaller", "getDefaultCaller()Lkotlin/reflect/jvm/internal/calls/Caller;")) };
    AppMethodBeat.o(118759);
  }

  public j(i parami, a.i.b.a.c.b.t paramt)
  {
    this(parami, str, ad.c(paramt).pq(), paramt);
    AppMethodBeat.i(118772);
    AppMethodBeat.o(118772);
  }

  private j(i parami, String paramString1, String paramString2, a.i.b.a.c.b.t paramt, Object paramObject)
  {
    AppMethodBeat.i(118769);
    this.AXs = parami;
    this.signature = paramString2;
    this.AXt = paramObject;
    this.AWG = z.a(paramt, (a)new j.c(this, paramString1));
    this.AXq = z.a(null, (a)new j.a(this));
    this.AXr = z.a(null, (a)new j.b(this));
    AppMethodBeat.o(118769);
  }

  public j(i parami, String paramString1, String paramString2, Object paramObject)
  {
    this(parami, paramString1, paramString2, null, paramObject);
    AppMethodBeat.i(118771);
    AppMethodBeat.o(118771);
  }

  public final Object a(Object paramObject1, Object paramObject2, Object paramObject3, Object paramObject4)
  {
    AppMethodBeat.i(118777);
    paramObject1 = W(new Object[] { paramObject1, paramObject2, paramObject3, paramObject4 });
    AppMethodBeat.o(118777);
    return paramObject1;
  }

  public final Object am(Object paramObject)
  {
    AppMethodBeat.i(118774);
    paramObject = W(new Object[] { paramObject });
    AppMethodBeat.o(118774);
    return paramObject;
  }

  public final d<?> dWU()
  {
    AppMethodBeat.i(118764);
    d locald = (d)this.AXq.invoke();
    AppMethodBeat.o(118764);
    return locald;
  }

  public final i dWV()
  {
    return this.AXs;
  }

  public final int dWz()
  {
    AppMethodBeat.i(118765);
    int i = a.i.b.a.a.f.a(dWU());
    AppMethodBeat.o(118765);
    return i;
  }

  public final a.i.b.a.c.b.t dXf()
  {
    AppMethodBeat.i(118761);
    a.i.b.a.c.b.t localt = (a.i.b.a.c.b.t)this.AWG.invoke();
    AppMethodBeat.o(118761);
    return localt;
  }

  public final boolean equals(Object paramObject)
  {
    boolean bool = false;
    AppMethodBeat.i(118766);
    paramObject = af.dw(paramObject);
    if (paramObject == null)
      AppMethodBeat.o(118766);
    while (true)
    {
      return bool;
      if ((a.f.b.j.j(this.AXs, paramObject.AXs)) && (a.f.b.j.j(getName(), paramObject.getName())) && (a.f.b.j.j(this.signature, paramObject.signature)) && (a.f.b.j.j(this.AXt, paramObject.AXt)))
      {
        bool = true;
        AppMethodBeat.o(118766);
      }
      else
      {
        AppMethodBeat.o(118766);
      }
    }
  }

  public final Object g(Object paramObject1, Object paramObject2, Object paramObject3)
  {
    AppMethodBeat.i(118776);
    paramObject1 = W(new Object[] { paramObject1, paramObject2, paramObject3 });
    AppMethodBeat.o(118776);
    return paramObject1;
  }

  public final String getName()
  {
    AppMethodBeat.i(118763);
    String str = dXf().dZg().name;
    a.f.b.j.o(str, "descriptor.name.asString()");
    AppMethodBeat.o(118763);
    return str;
  }

  public final int hashCode()
  {
    AppMethodBeat.i(118767);
    int i = this.AXs.hashCode();
    int j = getName().hashCode();
    int k = this.signature.hashCode();
    AppMethodBeat.o(118767);
    return (i * 31 + j) * 31 + k;
  }

  public final Object invoke()
  {
    AppMethodBeat.i(118773);
    Object localObject = W(new Object[0]);
    AppMethodBeat.o(118773);
    return localObject;
  }

  public final boolean isBound()
  {
    AppMethodBeat.i(118760);
    boolean bool = a.f.b.j.j(this.AXt, a.f.b.c.AVy);
    AppMethodBeat.o(118760);
    return bool ^ true;
  }

  public final Object m(Object paramObject1, Object paramObject2)
  {
    AppMethodBeat.i(118775);
    paramObject1 = W(new Object[] { paramObject1, paramObject2 });
    AppMethodBeat.o(118775);
    return paramObject1;
  }

  public final String toString()
  {
    AppMethodBeat.i(118768);
    Object localObject = ab.AYy;
    localObject = ab.a(dXf());
    AppMethodBeat.o(118768);
    return localObject;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     a.i.b.a.j
 * JD-Core Version:    0.6.2
 */