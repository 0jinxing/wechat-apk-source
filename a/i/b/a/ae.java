package a.i.b.a;

import a.a.e;
import a.f.b.j;
import a.l;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.lang.reflect.Method;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"signature", "", "Ljava/lang/reflect/Method;", "getSignature", "(Ljava/lang/reflect/Method;)Ljava/lang/String;", "kotlin-reflect-api"})
public final class ae
{
  static final String d(Method paramMethod)
  {
    AppMethodBeat.i(118933);
    StringBuilder localStringBuilder = new StringBuilder().append(paramMethod.getName());
    Object localObject = paramMethod.getParameterTypes();
    j.o(localObject, "parameterTypes");
    localObject = localStringBuilder.append(e.a((Object[])localObject, (CharSequence)"", (CharSequence)"(", (CharSequence)")", 0, null, (a.f.a.b)ae.a.AYD, 24));
    paramMethod = paramMethod.getReturnType();
    j.o(paramMethod, "returnType");
    paramMethod = a.i.b.a.e.b.bc(paramMethod);
    AppMethodBeat.o(118933);
    return paramMethod;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     a.i.b.a.ae
 * JD-Core Version:    0.6.2
 */