package a.i.b.a.e;

import a.f.b.j;
import a.i.b.a.c.f.f;
import a.l;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lkotlin/reflect/jvm/internal/structure/ReflectJavaAnnotation;", "Lkotlin/reflect/jvm/internal/structure/ReflectJavaElement;", "Lkotlin/reflect/jvm/internal/impl/load/java/structure/JavaAnnotation;", "annotation", "", "(Ljava/lang/annotation/Annotation;)V", "getAnnotation", "()Ljava/lang/annotation/Annotation;", "arguments", "", "Lkotlin/reflect/jvm/internal/impl/load/java/structure/JavaAnnotationArgument;", "getArguments", "()Ljava/util/Collection;", "classId", "Lkotlin/reflect/jvm/internal/impl/name/ClassId;", "getClassId", "()Lorg/jetbrains/kotlin/name/ClassId;", "equals", "", "other", "", "hashCode", "", "resolve", "Lkotlin/reflect/jvm/internal/structure/ReflectJavaClass;", "toString", "", "descriptors.runtime"})
public final class c extends n
  implements a.i.b.a.c.d.a.e.a
{
  public final Annotation AZp;

  public c(Annotation paramAnnotation)
  {
    AppMethodBeat.i(123029);
    this.AZp = paramAnnotation;
    AppMethodBeat.o(123029);
  }

  public final a.i.b.a.c.f.a dWY()
  {
    AppMethodBeat.i(123024);
    a.i.b.a.c.f.a locala = b.bb(a.f.a.a(a.f.a.a(this.AZp)));
    AppMethodBeat.o(123024);
    return locala;
  }

  public final Collection<a.i.b.a.c.d.a.e.b> ebz()
  {
    AppMethodBeat.i(123023);
    Method[] arrayOfMethod = a.f.a.a(a.f.a.a(this.AZp)).getDeclaredMethods();
    j.o(arrayOfMethod, "annotation.annotationClass.java.declaredMethods");
    Collection localCollection = (Collection)new ArrayList(arrayOfMethod.length);
    int i = arrayOfMethod.length;
    for (int j = 0; j < i; j++)
    {
      Method localMethod = arrayOfMethod[j];
      Object localObject = d.BNS;
      localObject = localMethod.invoke(this.AZp, new Object[0]);
      j.o(localObject, "method.invoke(annotation)");
      j.o(localMethod, "method");
      localCollection.add(d.a.a(localObject, f.avX(localMethod.getName())));
    }
    localCollection = (Collection)localCollection;
    AppMethodBeat.o(123023);
    return localCollection;
  }

  public final boolean equals(Object paramObject)
  {
    AppMethodBeat.i(123026);
    boolean bool;
    if (((paramObject instanceof c)) && (j.j(this.AZp, ((c)paramObject).AZp)))
    {
      bool = true;
      AppMethodBeat.o(123026);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(123026);
    }
  }

  public final int hashCode()
  {
    AppMethodBeat.i(123027);
    int i = this.AZp.hashCode();
    AppMethodBeat.o(123027);
    return i;
  }

  public final String toString()
  {
    AppMethodBeat.i(123028);
    String str = getClass().getName() + ": " + this.AZp;
    AppMethodBeat.o(123028);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     a.i.b.a.e.c
 * JD-Core Version:    0.6.2
 */