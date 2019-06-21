package a.i.b.a.a;

import a.f.b.j;
import a.l;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.lang.reflect.Constructor;
import java.lang.reflect.Member;
import java.lang.reflect.Type;
import java.util.Arrays;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lkotlin/reflect/jvm/internal/calls/CallerImpl$Constructor;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl;", "Ljava/lang/reflect/Constructor;", "constructor", "(Ljava/lang/reflect/Constructor;)V", "call", "", "args", "", "([Ljava/lang/Object;)Ljava/lang/Object;", "kotlin-reflect-api"})
public final class e$c extends e<Constructor<?>>
{
  public e$c(Constructor<?> paramConstructor)
  {
  }

  public final Object W(Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(118974);
    j.p(paramArrayOfObject, "args");
    X(paramArrayOfObject);
    paramArrayOfObject = ((Constructor)this.AZb).newInstance(Arrays.copyOf(paramArrayOfObject, paramArrayOfObject.length));
    AppMethodBeat.o(118974);
    return paramArrayOfObject;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     a.i.b.a.a.e.c
 * JD-Core Version:    0.6.2
 */