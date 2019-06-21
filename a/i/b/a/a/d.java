package a.i.b.a.a;

import a.f.b.j;
import a.l;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.lang.reflect.Member;
import java.lang.reflect.Type;
import java.util.List;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lkotlin/reflect/jvm/internal/calls/Caller;", "M", "Ljava/lang/reflect/Member;", "", "member", "getMember", "()Ljava/lang/reflect/Member;", "parameterTypes", "", "Ljava/lang/reflect/Type;", "getParameterTypes", "()Ljava/util/List;", "returnType", "getReturnType", "()Ljava/lang/reflect/Type;", "call", "args", "", "([Ljava/lang/Object;)Ljava/lang/Object;", "checkArguments", "", "([Ljava/lang/Object;)V", "kotlin-reflect-api"})
public abstract interface d<M extends Member>
{
  public abstract Object W(Object[] paramArrayOfObject);

  public abstract M dXw();

  public abstract Type dXx();

  public abstract List<Type> dXy();

  @l(dWo={1, 1, 13})
  public static final class a
  {
    public static <M extends Member> void a(d<? extends M> paramd, Object[] paramArrayOfObject)
    {
      AppMethodBeat.i(118971);
      j.p(paramArrayOfObject, "args");
      if (f.a(paramd) != paramArrayOfObject.length)
      {
        paramd = (Throwable)new IllegalArgumentException("Callable expects " + f.a(paramd) + " arguments, but " + paramArrayOfObject.length + " were provided.");
        AppMethodBeat.o(118971);
        throw paramd;
      }
      AppMethodBeat.o(118971);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     a.i.b.a.a.d
 * JD-Core Version:    0.6.2
 */