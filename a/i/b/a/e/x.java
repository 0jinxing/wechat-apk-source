package a.i.b.a.e;

import a.f.b.j;
import a.i.b.a.c.d.a.e.w;
import a.l;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.TypeVariable;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lkotlin/reflect/jvm/internal/structure/ReflectJavaTypeParameter;", "Lkotlin/reflect/jvm/internal/structure/ReflectJavaElement;", "Lkotlin/reflect/jvm/internal/impl/load/java/structure/JavaTypeParameter;", "Lkotlin/reflect/jvm/internal/structure/ReflectJavaAnnotationOwner;", "typeVariable", "Ljava/lang/reflect/TypeVariable;", "(Ljava/lang/reflect/TypeVariable;)V", "element", "Ljava/lang/reflect/AnnotatedElement;", "getElement", "()Ljava/lang/reflect/AnnotatedElement;", "name", "Lkotlin/reflect/jvm/internal/impl/name/Name;", "getName", "()Lorg/jetbrains/kotlin/name/Name;", "getTypeVariable", "()Ljava/lang/reflect/TypeVariable;", "upperBounds", "", "Lkotlin/reflect/jvm/internal/structure/ReflectJavaClassifierType;", "getUpperBounds", "()Ljava/util/List;", "equals", "", "other", "", "hashCode", "", "toString", "", "descriptors.runtime"})
public final class x extends n
  implements w, f
{
  private final TypeVariable<?> BOk;

  public x(TypeVariable<?> paramTypeVariable)
  {
    AppMethodBeat.i(123122);
    this.BOk = paramTypeVariable;
    AppMethodBeat.o(123122);
  }

  public final a.i.b.a.c.f.f dZg()
  {
    AppMethodBeat.i(123118);
    a.i.b.a.c.f.f localf = a.i.b.a.c.f.f.avX(this.BOk.getName());
    j.o(localf, "Name.identifier(typeVariable.name)");
    AppMethodBeat.o(123118);
    return localf;
  }

  public final AnnotatedElement ekH()
  {
    TypeVariable localTypeVariable1 = this.BOk;
    TypeVariable localTypeVariable2 = localTypeVariable1;
    if (!(localTypeVariable1 instanceof AnnotatedElement))
      localTypeVariable2 = null;
    return (AnnotatedElement)localTypeVariable2;
  }

  public final boolean equals(Object paramObject)
  {
    AppMethodBeat.i(123119);
    boolean bool;
    if (((paramObject instanceof x)) && (j.j(this.BOk, ((x)paramObject).BOk)))
    {
      bool = true;
      AppMethodBeat.o(123119);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(123119);
    }
  }

  public final int hashCode()
  {
    AppMethodBeat.i(123120);
    int i = this.BOk.hashCode();
    AppMethodBeat.o(123120);
    return i;
  }

  public final String toString()
  {
    AppMethodBeat.i(123121);
    String str = getClass().getName() + ": " + this.BOk;
    AppMethodBeat.o(123121);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     a.i.b.a.e.x
 * JD-Core Version:    0.6.2
 */