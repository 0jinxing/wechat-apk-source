package a.i.b.a.b;

import a.f.b.j;
import a.i.b.a.e.b;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

@a.l(dWo={1, 1, 13}, dWp={""}, dWq={"Lkotlin/reflect/jvm/internal/components/SignatureSerializer;", "", "()V", "constructorDesc", "", "constructor", "Ljava/lang/reflect/Constructor;", "fieldDesc", "field", "Ljava/lang/reflect/Field;", "methodDesc", "method", "Ljava/lang/reflect/Method;", "descriptors.runtime"})
final class l
{
  public static final l AZG;

  static
  {
    AppMethodBeat.i(119065);
    AZG = new l();
    AppMethodBeat.o(119065);
  }

  public static String a(Constructor<?> paramConstructor)
  {
    AppMethodBeat.i(119063);
    j.p(paramConstructor, "constructor");
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("(");
    for (Object localObject : paramConstructor.getParameterTypes())
    {
      j.o(localObject, "parameterType");
      localStringBuilder.append(b.bc(localObject));
    }
    localStringBuilder.append(")V");
    paramConstructor = localStringBuilder.toString();
    j.o(paramConstructor, "sb.toString()");
    AppMethodBeat.o(119063);
    return paramConstructor;
  }

  public static String d(Field paramField)
  {
    AppMethodBeat.i(119064);
    j.p(paramField, "field");
    paramField = paramField.getType();
    j.o(paramField, "field.type");
    paramField = b.bc(paramField);
    AppMethodBeat.o(119064);
    return paramField;
  }

  public static String e(Method paramMethod)
  {
    AppMethodBeat.i(119062);
    j.p(paramMethod, "method");
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("(");
    for (Class localClass : paramMethod.getParameterTypes())
    {
      j.o(localClass, "parameterType");
      localStringBuilder.append(b.bc(localClass));
    }
    localStringBuilder.append(")");
    paramMethod = paramMethod.getReturnType();
    j.o(paramMethod, "method.returnType");
    localStringBuilder.append(b.bc(paramMethod));
    paramMethod = localStringBuilder.toString();
    j.o(paramMethod, "sb.toString()");
    AppMethodBeat.o(119062);
    return paramMethod;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     a.i.b.a.b.l
 * JD-Core Version:    0.6.2
 */