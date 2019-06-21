package a.i.b.a.e;

import a.f.b.j;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;

@a.l(dWo={1, 1, 13}, dWp={""}, dWq={"Lkotlin/reflect/jvm/internal/structure/ReflectJavaType$Factory;", "", "()V", "create", "Lkotlin/reflect/jvm/internal/structure/ReflectJavaType;", "type", "Ljava/lang/reflect/Type;", "descriptors.runtime"})
public final class w$a
{
  public static w b(Type paramType)
  {
    AppMethodBeat.i(123116);
    j.p(paramType, "type");
    if (((paramType instanceof Class)) && (((Class)paramType).isPrimitive()))
    {
      paramType = (w)new v((Class)paramType);
      AppMethodBeat.o(123116);
    }
    while (true)
    {
      return paramType;
      if (((paramType instanceof GenericArrayType)) || (((paramType instanceof Class)) && (((Class)paramType).isArray())))
      {
        paramType = (w)new i(paramType);
        AppMethodBeat.o(123116);
      }
      else if ((paramType instanceof WildcardType))
      {
        paramType = (w)new z((WildcardType)paramType);
        AppMethodBeat.o(123116);
      }
      else
      {
        paramType = (w)new l(paramType);
        AppMethodBeat.o(123116);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     a.i.b.a.e.w.a
 * JD-Core Version:    0.6.2
 */