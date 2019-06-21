package a.i.b.a.e;

import a.f.b.i;
import a.i.b.a.c.b.az;
import a.i.b.a.c.d.a.e.g;
import a.i.b.a.c.f.a;
import a.i.d;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.lang.reflect.Constructor;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

@a.l(dWo={1, 1, 13}, dWp={""}, dWq={"Lkotlin/reflect/jvm/internal/structure/ReflectJavaClass;", "Lkotlin/reflect/jvm/internal/structure/ReflectJavaElement;", "Lkotlin/reflect/jvm/internal/structure/ReflectJavaAnnotationOwner;", "Lkotlin/reflect/jvm/internal/structure/ReflectJavaModifierListOwner;", "Lkotlin/reflect/jvm/internal/impl/load/java/structure/JavaClass;", "klass", "Ljava/lang/Class;", "(Ljava/lang/Class;)V", "constructors", "", "Lkotlin/reflect/jvm/internal/structure/ReflectJavaConstructor;", "getConstructors", "()Ljava/util/List;", "element", "getElement", "()Ljava/lang/Class;", "fields", "Lkotlin/reflect/jvm/internal/structure/ReflectJavaField;", "getFields", "fqName", "Lkotlin/reflect/jvm/internal/impl/name/FqName;", "getFqName", "()Lorg/jetbrains/kotlin/name/FqName;", "innerClassNames", "Lkotlin/reflect/jvm/internal/impl/name/Name;", "getInnerClassNames", "isAnnotationType", "", "()Z", "isEnum", "isInterface", "lightClassOriginKind", "Lkotlin/reflect/jvm/internal/impl/load/java/structure/LightClassOriginKind;", "getLightClassOriginKind", "()Lorg/jetbrains/kotlin/load/java/structure/LightClassOriginKind;", "methods", "Lkotlin/reflect/jvm/internal/structure/ReflectJavaMethod;", "getMethods", "modifiers", "", "getModifiers", "()I", "name", "getName", "()Lorg/jetbrains/kotlin/name/Name;", "outerClass", "getOuterClass", "()Lkotlin/reflect/jvm/internal/structure/ReflectJavaClass;", "supertypes", "", "Lkotlin/reflect/jvm/internal/impl/load/java/structure/JavaClassifierType;", "getSupertypes", "()Ljava/util/Collection;", "typeParameters", "Lkotlin/reflect/jvm/internal/structure/ReflectJavaTypeParameter;", "getTypeParameters", "equals", "other", "", "findInnerClass", "hashCode", "isEnumValuesOrValueOf", "method", "Ljava/lang/reflect/Method;", "toString", "", "descriptors.runtime"})
public final class j extends n
  implements g, f, t
{
  public final Class<?> AZs;

  public j(Class<?> paramClass)
  {
    AppMethodBeat.i(123074);
    this.AZs = paramClass;
    AppMethodBeat.o(123074);
  }

  public final List<x> dYS()
  {
    AppMethodBeat.i(123067);
    Object localObject = this.AZs.getTypeParameters();
    a.f.b.j.o(localObject, "klass.typeParameters");
    Collection localCollection = (Collection)new ArrayList(localObject.length);
    int i = localObject.length;
    for (int j = 0; j < i; j++)
      localCollection.add(new x(localObject[j]));
    localObject = (List)localCollection;
    AppMethodBeat.o(123067);
    return localObject;
  }

  public final az dYf()
  {
    AppMethodBeat.i(123080);
    az localaz = t.a.d(this);
    AppMethodBeat.o(123080);
    return localaz;
  }

  public final a.i.b.a.c.f.b dZF()
  {
    AppMethodBeat.i(123060);
    a.i.b.a.c.f.b localb = b.bb(this.AZs).ehE();
    a.f.b.j.o(localb, "klass.classId.asSingleFqName()");
    AppMethodBeat.o(123060);
    return localb;
  }

  public final a.i.b.a.c.f.f dZg()
  {
    AppMethodBeat.i(123066);
    a.i.b.a.c.f.f localf = a.i.b.a.c.f.f.avX(this.AZs.getSimpleName());
    a.f.b.j.o(localf, "Name.identifier(klass.simpleName)");
    AppMethodBeat.o(123066);
    return localf;
  }

  public final Collection<a.i.b.a.c.d.a.e.j> eap()
  {
    AppMethodBeat.i(123062);
    Object localObject1;
    if (a.f.b.j.j(this.AZs, Object.class))
    {
      localObject1 = (Collection)a.a.v.AUP;
      AppMethodBeat.o(123062);
    }
    while (true)
    {
      return localObject1;
      a.f.b.x localx = new a.f.b.x(2);
      Object localObject2 = this.AZs.getGenericSuperclass();
      localObject1 = localObject2;
      if (localObject2 == null)
        localObject1 = (Type)Object.class;
      localx.add(localObject1);
      localObject1 = this.AZs.getGenericInterfaces();
      a.f.b.j.o(localObject1, "klass.genericInterfaces");
      localx.jdMethod_do(localObject1);
      localObject2 = (Iterable)a.a.j.listOf((Type[])localx.toArray(new Type[localx.ckx.size()]));
      localObject1 = (Collection)new ArrayList(a.a.j.d((Iterable)localObject2));
      localObject2 = ((Iterable)localObject2).iterator();
      while (((Iterator)localObject2).hasNext())
        ((Collection)localObject1).add(new l((Type)((Iterator)localObject2).next()));
      localObject1 = (Collection)localObject1;
      AppMethodBeat.o(123062);
    }
  }

  public final boolean ebH()
  {
    AppMethodBeat.i(138683);
    boolean bool = this.AZs.isAnnotation();
    AppMethodBeat.o(138683);
    return bool;
  }

  public final boolean ebX()
  {
    AppMethodBeat.i(123077);
    boolean bool = t.a.a(this);
    AppMethodBeat.o(123077);
    return bool;
  }

  public final boolean ebY()
  {
    AppMethodBeat.i(123079);
    boolean bool = t.a.c(this);
    AppMethodBeat.o(123079);
    return bool;
  }

  public final boolean equals(Object paramObject)
  {
    AppMethodBeat.i(123071);
    boolean bool;
    if (((paramObject instanceof j)) && (a.f.b.j.j(this.AZs, ((j)paramObject).AZs)))
    {
      bool = true;
      AppMethodBeat.o(123071);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(123071);
    }
  }

  public final int getModifiers()
  {
    AppMethodBeat.i(123058);
    int i = this.AZs.getModifiers();
    AppMethodBeat.o(123058);
    return i;
  }

  public final int hashCode()
  {
    AppMethodBeat.i(123072);
    int i = this.AZs.hashCode();
    AppMethodBeat.o(123072);
    return i;
  }

  public final boolean isEnum()
  {
    AppMethodBeat.i(123070);
    boolean bool = this.AZs.isEnum();
    AppMethodBeat.o(123070);
    return bool;
  }

  public final boolean isInterface()
  {
    AppMethodBeat.i(123068);
    boolean bool = this.AZs.isInterface();
    AppMethodBeat.o(123068);
    return bool;
  }

  public final boolean isStatic()
  {
    AppMethodBeat.i(123078);
    boolean bool = t.a.b(this);
    AppMethodBeat.o(123078);
    return bool;
  }

  public final String toString()
  {
    AppMethodBeat.i(123073);
    String str = getClass().getName() + ": " + this.AZs;
    AppMethodBeat.o(123073);
    return str;
  }

  @a.l(dWo={1, 1, 13}, dWp={""}, dWq={"<anonymous>", "Lkotlin/reflect/jvm/internal/structure/ReflectJavaConstructor;", "p1", "Ljava/lang/reflect/Constructor;", "Lkotlin/ParameterName;", "name", "member", "invoke"})
  static final class b extends i
    implements a.f.a.b<Constructor<?>, m>
  {
    public static final b BNW;

    static
    {
      AppMethodBeat.i(123044);
      BNW = new b();
      AppMethodBeat.o(123044);
    }

    b()
    {
      super();
    }

    public final d dWF()
    {
      AppMethodBeat.i(123043);
      a.i.b localb = a.f.b.v.aN(m.class);
      AppMethodBeat.o(123043);
      return localb;
    }

    public final String due()
    {
      return "<init>(Ljava/lang/reflect/Constructor;)V";
    }

    public final String getName()
    {
      return "<init>";
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     a.i.b.a.e.j
 * JD-Core Version:    0.6.2
 */