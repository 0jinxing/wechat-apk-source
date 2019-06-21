package a.i.b.a.a;

import a.f.b.j;
import a.f.b.x;
import a.l;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.lang.reflect.Method;
import java.util.ArrayList;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lkotlin/reflect/jvm/internal/calls/CallerImpl$Method$BoundStatic;", "Lkotlin/reflect/jvm/internal/calls/BoundCaller;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$Method;", "method", "Ljava/lang/reflect/Method;", "boundReceiver", "", "(Ljava/lang/reflect/Method;Ljava/lang/Object;)V", "call", "args", "", "([Ljava/lang/Object;)Ljava/lang/Object;", "kotlin-reflect-api"})
public final class e$f$c extends e.f
  implements c
{
  private final Object AXt;

  public e$f$c(Method paramMethod, Object paramObject)
  {
  }

  public final Object W(Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(118995);
    j.p(paramArrayOfObject, "args");
    X(paramArrayOfObject);
    x localx = new x(2);
    localx.add(this.AXt);
    localx.jdMethod_do(paramArrayOfObject);
    paramArrayOfObject = a(null, localx.toArray(new Object[localx.ckx.size()]));
    AppMethodBeat.o(118995);
    return paramArrayOfObject;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     a.i.b.a.a.e.f.c
 * JD-Core Version:    0.6.2
 */