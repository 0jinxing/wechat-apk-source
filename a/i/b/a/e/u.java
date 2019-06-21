package a.i.b.a.e;

import a.a.v;
import a.f.b.j;
import a.i.b.a.c.d.a.e.g;
import a.i.b.a.c.d.a.e.t;
import a.i.b.a.c.f.f;
import a.l;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Collection;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lkotlin/reflect/jvm/internal/structure/ReflectJavaPackage;", "Lkotlin/reflect/jvm/internal/structure/ReflectJavaElement;", "Lkotlin/reflect/jvm/internal/impl/load/java/structure/JavaPackage;", "fqName", "Lkotlin/reflect/jvm/internal/impl/name/FqName;", "(Lorg/jetbrains/kotlin/name/FqName;)V", "annotations", "", "Lkotlin/reflect/jvm/internal/impl/load/java/structure/JavaAnnotation;", "getAnnotations", "()Ljava/util/List;", "getFqName", "()Lorg/jetbrains/kotlin/name/FqName;", "isDeprecatedInJavaDoc", "", "()Z", "subPackages", "", "getSubPackages", "()Ljava/util/Collection;", "equals", "other", "", "findAnnotation", "", "getClasses", "Lkotlin/reflect/jvm/internal/impl/load/java/structure/JavaClass;", "nameFilter", "Lkotlin/Function1;", "Lkotlin/reflect/jvm/internal/impl/name/Name;", "hashCode", "", "toString", "", "descriptors.runtime"})
public final class u extends n
  implements t
{
  private final a.i.b.a.c.f.b BfP;

  public u(a.i.b.a.c.f.b paramb)
  {
    AppMethodBeat.i(123113);
    this.BfP = paramb;
    AppMethodBeat.o(123113);
  }

  public final Collection<g> d(a.f.a.b<? super f, Boolean> paramb)
  {
    AppMethodBeat.i(123108);
    j.p(paramb, "nameFilter");
    paramb = (Collection)v.AUP;
    AppMethodBeat.o(123108);
    return paramb;
  }

  public final a.i.b.a.c.f.b dZF()
  {
    return this.BfP;
  }

  public final Collection<t> ebZ()
  {
    return (Collection)v.AUP;
  }

  public final boolean equals(Object paramObject)
  {
    AppMethodBeat.i(123110);
    boolean bool;
    if (((paramObject instanceof u)) && (j.j(this.BfP, ((u)paramObject).BfP)))
    {
      bool = true;
      AppMethodBeat.o(123110);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(123110);
    }
  }

  public final int hashCode()
  {
    AppMethodBeat.i(123111);
    int i = this.BfP.hashCode();
    AppMethodBeat.o(123111);
    return i;
  }

  public final String toString()
  {
    AppMethodBeat.i(123112);
    String str = getClass().getName() + ": " + this.BfP;
    AppMethodBeat.o(123112);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     a.i.b.a.e.u
 * JD-Core Version:    0.6.2
 */