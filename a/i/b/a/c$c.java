package a.i.b.a;

import a.l;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.lang.reflect.Method;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lkotlin/reflect/jvm/internal/JvmFunctionSignature$JavaMethod;", "Lkotlin/reflect/jvm/internal/JvmFunctionSignature;", "method", "Ljava/lang/reflect/Method;", "(Ljava/lang/reflect/Method;)V", "getMethod", "()Ljava/lang/reflect/Method;", "asString", "", "kotlin-reflect-api"})
public final class c$c extends c
{
  final Method method;

  public c$c(Method paramMethod)
  {
    super((byte)0);
    AppMethodBeat.i(118676);
    this.method = paramMethod;
    AppMethodBeat.o(118676);
  }

  public final String pq()
  {
    AppMethodBeat.i(118675);
    String str = ae.d(this.method);
    AppMethodBeat.o(118675);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     a.i.b.a.c.c
 * JD-Core Version:    0.6.2
 */