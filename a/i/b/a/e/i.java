package a.i.b.a.e;

import a.f.b.j;
import a.i.b.a.c.d.a.e.f;
import a.l;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lkotlin/reflect/jvm/internal/structure/ReflectJavaArrayType;", "Lkotlin/reflect/jvm/internal/structure/ReflectJavaType;", "Lkotlin/reflect/jvm/internal/impl/load/java/structure/JavaArrayType;", "reflectType", "Ljava/lang/reflect/Type;", "(Ljava/lang/reflect/Type;)V", "componentType", "getComponentType", "()Lkotlin/reflect/jvm/internal/structure/ReflectJavaType;", "getReflectType", "()Ljava/lang/reflect/Type;", "descriptors.runtime"})
public final class i extends w
  implements f
{
  private final w BNT;
  private final Type BNU;

  public i(Type paramType)
  {
    AppMethodBeat.i(123039);
    this.BNU = paramType;
    paramType = this.BNU;
    if ((paramType instanceof GenericArrayType))
    {
      paramType = ((GenericArrayType)paramType).getGenericComponentType();
      j.o(paramType, "genericComponentType");
    }
    for (paramType = w.a.b(paramType); ; paramType = w.a.b((Type)paramType))
    {
      this.BNT = paramType;
      AppMethodBeat.o(123039);
      return;
      if ((!(paramType instanceof Class)) || (!((Class)paramType).isArray()))
        break;
      paramType = ((Class)paramType).getComponentType();
      j.o(paramType, "getComponentType()");
    }
    paramType = (Throwable)new IllegalArgumentException("Not an array type (" + this.BNU.getClass() + "): " + this.BNU);
    AppMethodBeat.o(123039);
    throw paramType;
  }

  protected final Type ekI()
  {
    return this.BNU;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     a.i.b.a.e.i
 * JD-Core Version:    0.6.2
 */