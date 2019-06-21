package a.i.b.a.e;

import a.f.b.j;
import a.i.b.a.c.a.h;
import a.i.b.a.c.d.a.e.u;
import a.i.b.a.c.i.d.c;
import a.l;
import com.tencent.matrix.trace.core.AppMethodBeat;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lkotlin/reflect/jvm/internal/structure/ReflectJavaPrimitiveType;", "Lkotlin/reflect/jvm/internal/structure/ReflectJavaType;", "Lkotlin/reflect/jvm/internal/impl/load/java/structure/JavaPrimitiveType;", "reflectType", "Ljava/lang/Class;", "(Ljava/lang/Class;)V", "getReflectType", "()Ljava/lang/Class;", "type", "Lkotlin/reflect/jvm/internal/impl/builtins/PrimitiveType;", "getType", "()Lorg/jetbrains/kotlin/builtins/PrimitiveType;", "descriptors.runtime"})
public final class v extends w
  implements u
{
  private final Class<?> BOi;

  public v(Class<?> paramClass)
  {
    AppMethodBeat.i(123115);
    this.BOi = paramClass;
    AppMethodBeat.o(123115);
  }

  public final h eca()
  {
    AppMethodBeat.i(123114);
    Object localObject;
    if (j.j(this.BOi, Void.TYPE))
    {
      localObject = null;
      AppMethodBeat.o(123114);
    }
    while (true)
    {
      return localObject;
      localObject = c.awk(this.BOi.getName());
      j.o(localObject, "JvmPrimitiveType.get(reflectType.name)");
      localObject = ((c)localObject).BFq;
      AppMethodBeat.o(123114);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     a.i.b.a.e.v
 * JD-Core Version:    0.6.2
 */