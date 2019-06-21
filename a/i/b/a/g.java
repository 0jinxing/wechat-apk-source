package a.i.b.a;

import a.i.b.a.c.b.ah;
import a.i.b.a.c.b.t;
import a.i.b.a.c.e.a.u;
import a.i.b.a.c.g.i.c;
import a.i.b.a.c.g.i.f;
import a.i.b.a.c.g.q;
import a.i.b.a.c.j.a.a.d;
import a.l;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Collection;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lkotlin/reflect/jvm/internal/KClassImpl;", "T", "", "Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;", "Lkotlin/reflect/KClass;", "Lkotlin/reflect/jvm/internal/KClassifierImpl;", "jClass", "Ljava/lang/Class;", "(Ljava/lang/Class;)V", "annotations", "", "", "getAnnotations", "()Ljava/util/List;", "classId", "Lkotlin/reflect/jvm/internal/impl/name/ClassId;", "getClassId", "()Lorg/jetbrains/kotlin/name/ClassId;", "constructorDescriptors", "", "Lkotlin/reflect/jvm/internal/impl/descriptors/ConstructorDescriptor;", "getConstructorDescriptors", "()Ljava/util/Collection;", "constructors", "Lkotlin/reflect/KFunction;", "getConstructors", "data", "Lkotlin/reflect/jvm/internal/ReflectProperties$LazyVal;", "Lkotlin/reflect/jvm/internal/KClassImpl$Data;", "kotlin.jvm.PlatformType", "getData", "()Lkotlin/reflect/jvm/internal/ReflectProperties$LazyVal;", "descriptor", "Lkotlin/reflect/jvm/internal/impl/descriptors/ClassDescriptor;", "getDescriptor", "()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;", "isAbstract", "", "()Z", "isCompanion", "isData", "isFinal", "isInner", "isOpen", "isSealed", "getJClass", "()Ljava/lang/Class;", "memberScope", "Lkotlin/reflect/jvm/internal/impl/resolve/scopes/MemberScope;", "getMemberScope$kotlin_reflect_api", "()Lorg/jetbrains/kotlin/resolve/scopes/MemberScope;", "members", "Lkotlin/reflect/KCallable;", "getMembers", "nestedClasses", "getNestedClasses", "objectInstance", "getObjectInstance", "()Ljava/lang/Object;", "qualifiedName", "", "getQualifiedName", "()Ljava/lang/String;", "sealedSubclasses", "getSealedSubclasses", "simpleName", "getSimpleName", "staticScope", "getStaticScope$kotlin_reflect_api", "supertypes", "Lkotlin/reflect/KType;", "getSupertypes", "typeParameters", "Lkotlin/reflect/KTypeParameter;", "getTypeParameters", "visibility", "Lkotlin/reflect/KVisibility;", "getVisibility", "()Lkotlin/reflect/KVisibility;", "equals", "other", "getFunctions", "Lkotlin/reflect/jvm/internal/impl/descriptors/FunctionDescriptor;", "name", "Lkotlin/reflect/jvm/internal/impl/name/Name;", "getLocalProperty", "Lkotlin/reflect/jvm/internal/impl/descriptors/PropertyDescriptor;", "index", "", "getProperties", "hashCode", "isInstance", "value", "reportUnresolvedClass", "", "toString", "Data", "kotlin-reflect-api"})
public final class g<T> extends i
  implements a.i.b<T>
{
  final Class<T> AVA;
  final z.b<g<T>.a> AWF;

  public g(Class<T> paramClass)
  {
    AppMethodBeat.i(118739);
    this.AVA = paramClass;
    paramClass = z.h((a.f.a.a)new g.b(this));
    a.f.b.j.o(paramClass, "ReflectProperties.lazy { Data() }");
    this.AWF = paramClass;
    AppMethodBeat.o(118739);
  }

  private a.i.b.a.c.b.e dWX()
  {
    AppMethodBeat.i(118727);
    a.i.b.a.c.b.e locale = ((g.a)this.AWF.invoke()).dWX();
    AppMethodBeat.o(118727);
    return locale;
  }

  private final a.i.b.a.c.f.a dWY()
  {
    AppMethodBeat.i(118728);
    Object localObject1 = ad.AYC;
    Object localObject2 = this.AVA;
    a.f.b.j.p(localObject2, "klass");
    if (((Class)localObject2).isArray())
    {
      localObject1 = ((Class)localObject2).getComponentType();
      a.f.b.j.o(localObject1, "klass.componentType");
      localObject1 = ad.aR((Class)localObject1);
      if (localObject1 != null)
      {
        localObject1 = new a.i.b.a.c.f.a(a.i.b.a.c.a.g.AZV, ((a.i.b.a.c.a.h)localObject1).Bca);
        AppMethodBeat.o(118728);
      }
    }
    while (true)
    {
      return localObject1;
      localObject1 = a.i.b.a.c.f.a.n(a.i.b.a.c.a.g.Bag.Bat.ehI());
      a.f.b.j.o(localObject1, "ClassId.topLevel(KotlinB….FQ_NAMES.array.toSafe())");
      AppMethodBeat.o(118728);
      continue;
      if (a.f.b.j.j(localObject2, Void.TYPE))
      {
        localObject1 = ad.AYB;
        AppMethodBeat.o(118728);
      }
      else
      {
        localObject1 = ad.aR((Class)localObject2);
        if (localObject1 != null)
        {
          localObject1 = new a.i.b.a.c.f.a(a.i.b.a.c.a.g.AZV, ((a.i.b.a.c.a.h)localObject1).BbZ);
          AppMethodBeat.o(118728);
        }
        else
        {
          localObject1 = a.i.b.a.e.b.bb((Class)localObject2);
          if (!((a.i.b.a.c.f.a)localObject1).ByO)
          {
            localObject2 = a.i.b.a.c.a.b.c.Bdq;
            localObject2 = ((a.i.b.a.c.f.a)localObject1).ehE();
            a.f.b.j.o(localObject2, "classId.asSingleFqName()");
            localObject2 = a.i.b.a.c.a.b.c.f((a.i.b.a.c.f.b)localObject2);
            if (localObject2 != null)
            {
              AppMethodBeat.o(118728);
              localObject1 = localObject2;
            }
          }
          else
          {
            AppMethodBeat.o(118728);
          }
        }
      }
    }
  }

  public final ah SJ(int paramInt)
  {
    Object localObject1 = null;
    AppMethodBeat.i(118734);
    for (Object localObject2 = this; a.f.b.j.j(((g)localObject2).AVA.getSimpleName(), "DefaultImpls"); localObject2 = (g)localObject2)
    {
      localObject3 = ((g)localObject2).AVA.getDeclaringClass();
      if ((localObject3 == null) || (!((Class)localObject3).isInterface()))
        break;
      localObject2 = a.f.a.aM((Class)localObject3);
      if (localObject2 == null)
      {
        localObject2 = new a.v("null cannot be cast to non-null type kotlin.reflect.jvm.internal.KClassImpl<*>");
        AppMethodBeat.o(118734);
        throw ((Throwable)localObject2);
      }
    }
    Object localObject4 = ((g)localObject2).dWX();
    Object localObject3 = localObject4;
    if (!(localObject4 instanceof d))
      localObject3 = null;
    localObject3 = (d)localObject3;
    if (localObject3 != null)
    {
      localObject4 = (i.c)((d)localObject3).BGD;
      i.f localf = a.i.b.a.c.e.b.b.BxI;
      a.f.b.j.o(localf, "JvmProtoBuf.classLocalVariable");
      localObject4 = (a.u)a.i.b.a.c.e.a.f.a((i.c)localObject4, localf, paramInt);
      if (localObject4 != null)
      {
        localObject2 = (ah)af.a(((g)localObject2).AVA, (q)localObject4, ((d)localObject3).BHj.AWq, ((d)localObject3).BHj.AWr, ((d)localObject3).BGE, (a.f.a.m)g.c.AXd);
        AppMethodBeat.o(118734);
      }
    }
    while (true)
    {
      return localObject2;
      AppMethodBeat.o(118734);
      localObject2 = localObject1;
      continue;
      AppMethodBeat.o(118734);
      localObject2 = localObject1;
    }
  }

  public final Collection<ah> a(a.i.b.a.c.f.f paramf)
  {
    AppMethodBeat.i(118732);
    a.f.b.j.p(paramf, "name");
    paramf = (Collection)a.a.j.b(dWZ().a(paramf, (a.i.b.a.c.c.a.a)a.i.b.a.c.c.a.c.BjM), (Iterable)dXa().a(paramf, (a.i.b.a.c.c.a.a)a.i.b.a.c.c.a.c.BjM));
    AppMethodBeat.o(118732);
    return paramf;
  }

  public final Collection<t> b(a.i.b.a.c.f.f paramf)
  {
    AppMethodBeat.i(118733);
    a.f.b.j.p(paramf, "name");
    paramf = (Collection)a.a.j.b(dWZ().b(paramf, (a.i.b.a.c.c.a.a)a.i.b.a.c.c.a.c.BjM), (Iterable)dXa().b(paramf, (a.i.b.a.c.c.a.a)a.i.b.a.c.c.a.c.BjM));
    AppMethodBeat.o(118733);
    return paramf;
  }

  public final Class<T> dWH()
  {
    return this.AVA;
  }

  public final String dWI()
  {
    AppMethodBeat.i(118735);
    String str = (String)((g.a)this.AWF.invoke()).AWJ.invoke();
    AppMethodBeat.o(118735);
    return str;
  }

  public final Collection<a.i.b.a.c.b.k> dWR()
  {
    AppMethodBeat.i(118731);
    Object localObject = dWX();
    if ((((a.i.b.a.c.b.e)localObject).dYc() == a.i.b.a.c.b.f.Bes) || (((a.i.b.a.c.b.e)localObject).dYc() == a.i.b.a.c.b.f.Bew))
    {
      localObject = (Collection)a.a.v.AUP;
      AppMethodBeat.o(118731);
    }
    while (true)
    {
      return localObject;
      localObject = ((a.i.b.a.c.b.e)localObject).dYb();
      a.f.b.j.o(localObject, "descriptor.constructors");
      AppMethodBeat.o(118731);
    }
  }

  public final a.i.b.a.c.i.e.h dWZ()
  {
    AppMethodBeat.i(118729);
    a.i.b.a.c.i.e.h localh = dWX().dZf().dXR();
    AppMethodBeat.o(118729);
    return localh;
  }

  public final a.i.b.a.c.i.e.h dXa()
  {
    AppMethodBeat.i(118730);
    a.i.b.a.c.i.e.h localh = dWX().dXX();
    a.f.b.j.o(localh, "descriptor.staticScope");
    AppMethodBeat.o(118730);
    return localh;
  }

  public final boolean equals(Object paramObject)
  {
    AppMethodBeat.i(118736);
    boolean bool;
    if (((paramObject instanceof g)) && (a.f.b.j.j(a.f.a.c(this), a.f.a.c((a.i.b)paramObject))))
    {
      bool = true;
      AppMethodBeat.o(118736);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(118736);
    }
  }

  public final int hashCode()
  {
    AppMethodBeat.i(118737);
    int i = a.f.a.c(this).hashCode();
    AppMethodBeat.o(118737);
    return i;
  }

  public final String toString()
  {
    AppMethodBeat.i(118738);
    StringBuilder localStringBuilder = new StringBuilder("class ");
    Object localObject1 = dWY();
    Object localObject2 = ((a.i.b.a.c.f.a)localObject1).BcW;
    a.f.b.j.o(localObject2, "classId.packageFqName");
    if (((a.i.b.a.c.f.b)localObject2).ByQ.ByV.isEmpty());
    for (localObject2 = ""; ; localObject2 = ((a.i.b.a.c.f.b)localObject2).ByQ.ByV + ".")
    {
      localObject1 = ((a.i.b.a.c.f.a)localObject1).ByN.ByQ.ByV;
      a.f.b.j.o(localObject1, "classId.relativeClassName.asString()");
      localObject1 = a.k.m.a((String)localObject1, '.', '$');
      localObject2 = new StringBuilder().append((String)localObject2).append((String)localObject1).toString();
      AppMethodBeat.o(118738);
      return localObject2;
    }
  }

  @l(dWo={1, 1, 13}, dWp={""}, dWq={"<anonymous>", "", "Lkotlin/reflect/jvm/internal/KCallableImpl;", "T", "", "invoke"})
  static final class a$j extends a.f.b.k
    implements a.f.a.a<Collection<? extends e<?>>>
  {
    a$j(g.a parama)
    {
      super();
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     a.i.b.a.g
 * JD-Core Version:    0.6.2
 */