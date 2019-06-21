package a.i.b.a.e;

import a.i.b.a.c.d.a.e.h;
import a.i.b.a.c.d.a.e.v;
import a.i.b.a.c.f.f;
import a.l;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.lang.reflect.Type;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lkotlin/reflect/jvm/internal/structure/ReflectJavaClassObjectAnnotationArgument;", "Lkotlin/reflect/jvm/internal/structure/ReflectJavaAnnotationArgument;", "Lkotlin/reflect/jvm/internal/impl/load/java/structure/JavaClassObjectAnnotationArgument;", "name", "Lkotlin/reflect/jvm/internal/impl/name/Name;", "klass", "Ljava/lang/Class;", "(Lorg/jetbrains/kotlin/name/Name;Ljava/lang/Class;)V", "getReferencedType", "Lkotlin/reflect/jvm/internal/impl/load/java/structure/JavaType;", "descriptors.runtime"})
public final class k extends d
  implements h
{
  private final Class<?> AZs;

  public k(f paramf, Class<?> paramClass)
  {
    super(paramf);
    AppMethodBeat.i(123082);
    this.AZs = paramClass;
    AppMethodBeat.o(123082);
  }

  public final v ebK()
  {
    AppMethodBeat.i(123081);
    Object localObject = w.BOj;
    localObject = (v)w.a.b((Type)this.AZs);
    AppMethodBeat.o(123081);
    return localObject;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     a.i.b.a.e.k
 * JD-Core Version:    0.6.2
 */