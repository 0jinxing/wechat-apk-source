package a.i.b.a.a;

import a.a.v;
import a.f.b.j;
import a.l;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.lang.reflect.Type;
import java.util.List;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lkotlin/reflect/jvm/internal/calls/ThrowingCaller;", "Lkotlin/reflect/jvm/internal/calls/Caller;", "", "()V", "member", "getMember", "()Ljava/lang/Void;", "parameterTypes", "", "Ljava/lang/reflect/Type;", "getParameterTypes", "()Ljava/util/List;", "returnType", "getReturnType", "()Ljava/lang/reflect/Type;", "call", "", "args", "", "([Ljava/lang/Object;)Ljava/lang/Object;", "kotlin-reflect-api"})
public final class i
  implements d
{
  public static final i AZo;

  static
  {
    AppMethodBeat.i(119018);
    AZo = new i();
    AppMethodBeat.o(119018);
  }

  public final Object W(Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(119017);
    j.p(paramArrayOfObject, "args");
    paramArrayOfObject = (Throwable)new UnsupportedOperationException("call/callBy are not supported for this declaration.");
    AppMethodBeat.o(119017);
    throw paramArrayOfObject;
  }

  public final Type dXx()
  {
    AppMethodBeat.i(119016);
    Object localObject = Void.TYPE;
    j.o(localObject, "Void.TYPE");
    localObject = (Type)localObject;
    AppMethodBeat.o(119016);
    return localObject;
  }

  public final List<Type> dXy()
  {
    return (List)v.AUP;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     a.i.b.a.a.i
 * JD-Core Version:    0.6.2
 */