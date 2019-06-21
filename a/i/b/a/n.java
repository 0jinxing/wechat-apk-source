package a.i.b.a;

import a.f.a.m;
import a.f.b.j;
import a.i.b.a.c.b.ad;
import a.i.b.a.c.b.ah;
import a.i.b.a.c.e.a.ag;
import a.i.b.a.c.e.a.s;
import a.i.b.a.c.e.a.u;
import a.i.b.a.c.e.b.a.g;
import a.i.b.a.c.g.i.c;
import a.i.b.a.c.g.i.f;
import a.i.b.a.c.g.q;
import a.l;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Collection;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lkotlin/reflect/jvm/internal/KPackageImpl;", "Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;", "jClass", "Ljava/lang/Class;", "usageModuleName", "", "(Ljava/lang/Class;Ljava/lang/String;)V", "constructorDescriptors", "", "Lkotlin/reflect/jvm/internal/impl/descriptors/ConstructorDescriptor;", "getConstructorDescriptors", "()Ljava/util/Collection;", "data", "Lkotlin/reflect/jvm/internal/ReflectProperties$LazyVal;", "Lkotlin/reflect/jvm/internal/KPackageImpl$Data;", "kotlin.jvm.PlatformType", "getJClass", "()Ljava/lang/Class;", "members", "Lkotlin/reflect/KCallable;", "getMembers", "methodOwner", "getMethodOwner", "scope", "Lkotlin/reflect/jvm/internal/impl/resolve/scopes/MemberScope;", "getScope", "()Lorg/jetbrains/kotlin/resolve/scopes/MemberScope;", "getUsageModuleName", "()Ljava/lang/String;", "equals", "", "other", "", "getFunctions", "Lkotlin/reflect/jvm/internal/impl/descriptors/FunctionDescriptor;", "name", "Lkotlin/reflect/jvm/internal/impl/name/Name;", "getLocalProperty", "Lkotlin/reflect/jvm/internal/impl/descriptors/PropertyDescriptor;", "index", "", "getProperties", "hashCode", "toString", "Data", "kotlin-reflect-api"})
public final class n extends i
{
  final Class<?> AVA;
  private final z.b<a> AWF;
  private final String AXD;

  public n(Class<?> paramClass, String paramString)
  {
    AppMethodBeat.i(118815);
    this.AVA = paramClass;
    this.AXD = paramString;
    paramClass = z.h((a.f.a.a)new n.b(this));
    j.o(paramClass, "ReflectProperties.lazy { Data() }");
    this.AWF = paramClass;
    AppMethodBeat.o(118815);
  }

  private final a.i.b.a.c.i.e.h dXh()
  {
    AppMethodBeat.i(118808);
    a.i.b.a.c.i.e.h localh = ((ad)((a)this.AWF.invoke()).AWG.invoke()).dXR();
    AppMethodBeat.o(118808);
    return localh;
  }

  public final ah SJ(int paramInt)
  {
    AppMethodBeat.i(118811);
    Object localObject1 = (a.t)((a)this.AWF.invoke()).AXG.invoke();
    Object localObject3;
    if (localObject1 != null)
    {
      Object localObject2 = (a.i.b.a.c.e.b.a.h)((a.t)localObject1).first;
      localObject3 = (a.s)((a.t)localObject1).second;
      localObject1 = (g)((a.t)localObject1).AUw;
      Object localObject4 = (i.c)localObject3;
      Object localObject5 = a.i.b.a.c.e.b.b.BxL;
      j.o(localObject5, "JvmProtoBuf.packageLocalVariable");
      localObject5 = (a.u)a.i.b.a.c.e.a.f.a((i.c)localObject4, (i.f)localObject5, paramInt);
      if (localObject5 != null)
      {
        localObject4 = this.AVA;
        localObject5 = (q)localObject5;
        localObject2 = (a.i.b.a.c.e.a.c)localObject2;
        localObject3 = ((a.s)localObject3).BtC;
        j.o(localObject3, "packageProto.typeTable");
        localObject3 = (ah)af.a((Class)localObject4, (q)localObject5, (a.i.b.a.c.e.a.c)localObject2, new a.i.b.a.c.e.a.h((a.ag)localObject3), (a.i.b.a.c.e.a.a)localObject1, (m)n.c.AXK);
        AppMethodBeat.o(118811);
      }
    }
    while (true)
    {
      return localObject3;
      AppMethodBeat.o(118811);
      localObject3 = null;
      continue;
      AppMethodBeat.o(118811);
      localObject3 = null;
    }
  }

  public final Collection<ah> a(a.i.b.a.c.f.f paramf)
  {
    AppMethodBeat.i(118809);
    j.p(paramf, "name");
    paramf = dXh().a(paramf, (a.i.b.a.c.c.a.a)a.i.b.a.c.c.a.c.BjM);
    AppMethodBeat.o(118809);
    return paramf;
  }

  public final Collection<a.i.b.a.c.b.t> b(a.i.b.a.c.f.f paramf)
  {
    AppMethodBeat.i(118810);
    j.p(paramf, "name");
    paramf = dXh().b(paramf, (a.i.b.a.c.c.a.a)a.i.b.a.c.c.a.c.BjM);
    AppMethodBeat.o(118810);
    return paramf;
  }

  public final Class<?> dWH()
  {
    return this.AVA;
  }

  public final Collection<a.i.b.a.c.b.k> dWR()
  {
    return (Collection)a.a.v.AUP;
  }

  protected final Class<?> dXc()
  {
    AppMethodBeat.i(118807);
    Class localClass = (Class)((a)this.AWF.invoke()).AXF.invoke();
    AppMethodBeat.o(118807);
    return localClass;
  }

  public final boolean equals(Object paramObject)
  {
    AppMethodBeat.i(118812);
    boolean bool;
    if (((paramObject instanceof n)) && (j.j(this.AVA, ((n)paramObject).AVA)))
    {
      bool = true;
      AppMethodBeat.o(118812);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(118812);
    }
  }

  public final int hashCode()
  {
    AppMethodBeat.i(118813);
    int i = this.AVA.hashCode();
    AppMethodBeat.o(118813);
    return i;
  }

  public final String toString()
  {
    AppMethodBeat.i(118814);
    Object localObject = a.i.b.a.e.b.bb(this.AVA).BcW;
    j.o(localObject, "jClass.classId.packageFqName");
    StringBuilder localStringBuilder = new StringBuilder("package ");
    if (((a.i.b.a.c.f.b)localObject).ByQ.ByV.isEmpty())
      localObject = "<default>";
    while (true)
    {
      localObject = (String)localObject;
      AppMethodBeat.o(118814);
      return localObject;
      localObject = ((a.i.b.a.c.f.b)localObject).ByQ.ByV;
      j.o(localObject, "fqName.asString()");
    }
  }

  @l(dWo={1, 1, 13}, dWp={""}, dWq={"Lkotlin/reflect/jvm/internal/KPackageImpl$Data;", "Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl$Data;", "Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;", "(Lkotlin/reflect/jvm/internal/KPackageImpl;)V", "descriptor", "Lkotlin/reflect/jvm/internal/impl/descriptors/PackageViewDescriptor;", "getDescriptor", "()Lorg/jetbrains/kotlin/descriptors/PackageViewDescriptor;", "descriptor$delegate", "Lkotlin/reflect/jvm/internal/ReflectProperties$LazySoftVal;", "kotlinClass", "Lkotlin/reflect/jvm/internal/components/ReflectKotlinClass;", "getKotlinClass", "()Lkotlin/reflect/jvm/internal/components/ReflectKotlinClass;", "kotlinClass$delegate", "members", "", "Lkotlin/reflect/jvm/internal/KCallableImpl;", "getMembers", "()Ljava/util/Collection;", "members$delegate", "metadata", "Lkotlin/Triple;", "Lkotlin/reflect/jvm/internal/impl/metadata/jvm/deserialization/JvmNameResolver;", "Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Package;", "Lkotlin/reflect/jvm/internal/impl/metadata/jvm/deserialization/JvmMetadataVersion;", "getMetadata", "()Lkotlin/Triple;", "metadata$delegate", "Lkotlin/reflect/jvm/internal/ReflectProperties$LazyVal;", "methodOwner", "Ljava/lang/Class;", "getMethodOwner", "()Ljava/lang/Class;", "methodOwner$delegate", "kotlin-reflect-api"})
  final class a extends i.b
  {
    final z.a AWG;
    private final z.a AXE;
    final z.b AXF;
    final z.b AXG;
    private final z.a AXH;

    static
    {
      AppMethodBeat.i(118800);
      eQB = new a.i.k[] { (a.i.k)a.f.b.v.a(new a.f.b.t(a.f.b.v.aN(a.class), "kotlinClass", "getKotlinClass()Lkotlin/reflect/jvm/internal/components/ReflectKotlinClass;")), (a.i.k)a.f.b.v.a(new a.f.b.t(a.f.b.v.aN(a.class), "descriptor", "getDescriptor()Lorg/jetbrains/kotlin/descriptors/PackageViewDescriptor;")), (a.i.k)a.f.b.v.a(new a.f.b.t(a.f.b.v.aN(a.class), "methodOwner", "getMethodOwner()Ljava/lang/Class;")), (a.i.k)a.f.b.v.a(new a.f.b.t(a.f.b.v.aN(a.class), "metadata", "getMetadata()Lkotlin/Triple;")), (a.i.k)a.f.b.v.a(new a.f.b.t(a.f.b.v.aN(a.class), "members", "getMembers()Ljava/util/Collection;")) };
      AppMethodBeat.o(118800);
    }

    public a()
    {
      super();
      AppMethodBeat.i(118801);
      this.AXE = z.a(null, (a.f.a.a)new n.a.b(this));
      this.AWG = z.a(null, (a.f.a.a)new n.a.a(this));
      this.AXF = z.h((a.f.a.a)new n.a.e(this));
      this.AXG = z.h((a.f.a.a)new n.a.d(this));
      this.AXH = z.a(null, (a.f.a.a)new n.a.c(this));
      AppMethodBeat.o(118801);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     a.i.b.a.n
 * JD-Core Version:    0.6.2
 */