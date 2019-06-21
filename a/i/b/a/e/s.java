package a.i.b.a.e;

import a.f.b.j;
import a.i.b.a.c.d.a.e.q;
import a.i.b.a.c.d.a.e.y;
import a.l;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lkotlin/reflect/jvm/internal/structure/ReflectJavaMethod;", "Lkotlin/reflect/jvm/internal/structure/ReflectJavaMember;", "Lkotlin/reflect/jvm/internal/impl/load/java/structure/JavaMethod;", "member", "Ljava/lang/reflect/Method;", "(Ljava/lang/reflect/Method;)V", "hasAnnotationParameterDefaultValue", "", "getHasAnnotationParameterDefaultValue", "()Z", "getMember", "()Ljava/lang/reflect/Method;", "returnType", "Lkotlin/reflect/jvm/internal/structure/ReflectJavaType;", "getReturnType", "()Lkotlin/reflect/jvm/internal/structure/ReflectJavaType;", "typeParameters", "", "Lkotlin/reflect/jvm/internal/structure/ReflectJavaTypeParameter;", "getTypeParameters", "()Ljava/util/List;", "valueParameters", "Lkotlin/reflect/jvm/internal/impl/load/java/structure/JavaValueParameter;", "getValueParameters", "descriptors.runtime"})
public final class s extends r
  implements q
{
  public final Method BOh;

  public s(Method paramMethod)
  {
    AppMethodBeat.i(123103);
    this.BOh = paramMethod;
    AppMethodBeat.o(123103);
  }

  public final List<x> dYS()
  {
    AppMethodBeat.i(123102);
    TypeVariable[] arrayOfTypeVariable = this.BOh.getTypeParameters();
    j.o(arrayOfTypeVariable, "member.typeParameters");
    Object localObject = (Collection)new ArrayList(arrayOfTypeVariable.length);
    int i = arrayOfTypeVariable.length;
    for (int j = 0; j < i; j++)
      ((Collection)localObject).add(new x(arrayOfTypeVariable[j]));
    localObject = (List)localObject;
    AppMethodBeat.o(123102);
    return localObject;
  }

  public final List<y> dYV()
  {
    AppMethodBeat.i(123099);
    Type[] arrayOfType = this.BOh.getGenericParameterTypes();
    j.o(arrayOfType, "member.genericParameterTypes");
    Object localObject = this.BOh.getParameterAnnotations();
    j.o(localObject, "member.parameterAnnotations");
    localObject = a(arrayOfType, (Annotation[][])localObject, this.BOh.isVarArgs());
    AppMethodBeat.o(123099);
    return localObject;
  }

  public final boolean ebW()
  {
    AppMethodBeat.i(123101);
    boolean bool;
    if (this.BOh.getDefaultValue() != null)
    {
      bool = true;
      AppMethodBeat.o(123101);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(123101);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     a.i.b.a.e.s
 * JD-Core Version:    0.6.2
 */