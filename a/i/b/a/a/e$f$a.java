package a.i.b.a.a;

import a.f.b.j;
import a.l;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.lang.reflect.Method;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lkotlin/reflect/jvm/internal/calls/CallerImpl$Method$BoundInstance;", "Lkotlin/reflect/jvm/internal/calls/BoundCaller;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$Method;", "method", "Ljava/lang/reflect/Method;", "boundReceiver", "", "(Ljava/lang/reflect/Method;Ljava/lang/Object;)V", "call", "args", "", "([Ljava/lang/Object;)Ljava/lang/Object;", "kotlin-reflect-api"})
public final class e$f$a extends e.f
  implements c
{
  private final Object AXt;

  public e$f$a(Method paramMethod, Object paramObject)
  {
    super(paramMethod, false, null, 4);
    AppMethodBeat.i(118992);
    this.AXt = paramObject;
    AppMethodBeat.o(118992);
  }

  public final Object W(Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(118991);
    j.p(paramArrayOfObject, "args");
    X(paramArrayOfObject);
    paramArrayOfObject = a(this.AXt, paramArrayOfObject);
    AppMethodBeat.o(118991);
    return paramArrayOfObject;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     a.i.b.a.a.e.f.a
 * JD-Core Version:    0.6.2
 */