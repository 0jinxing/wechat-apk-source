package a.i.b.a.a;

import a.a.e;
import a.f;
import a.f.b.j;
import a.i.b.a.x;
import a.i.k;
import a.l;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Map;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"<anonymous>", "", "T", "<anonymous parameter 0>", "kotlin.jvm.PlatformType", "method", "Ljava/lang/reflect/Method;", "args", "", "invoke", "(Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;"})
final class b$c
  implements InvocationHandler
{
  b$c(Class paramClass, f paramf1, k paramk1, f paramf2, k paramk2, b.a parama, Map paramMap)
  {
  }

  public final Object invoke(Object paramObject, Method paramMethod, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(118962);
    j.o(paramMethod, "method");
    paramObject = paramMethod.getName();
    if (paramObject == null)
    {
      if ((!j.j(paramObject, "equals")) || (paramArrayOfObject == null) || (paramArrayOfObject.length != 1))
        break label179;
      paramObject = Boolean.valueOf(this.AYZ.dy(e.O(paramArrayOfObject)));
      AppMethodBeat.o(118962);
    }
    while (true)
    {
      return paramObject;
      switch (paramObject.hashCode())
      {
      default:
        break;
      case -1776922004:
        if (!paramObject.equals("toString"))
          break;
        paramObject = this.AYV.getValue();
        AppMethodBeat.o(118962);
        break;
      case 147696667:
        if (!paramObject.equals("hashCode"))
          break;
        paramObject = this.AYX.getValue();
        AppMethodBeat.o(118962);
        break;
      case 1444986633:
        if (!paramObject.equals("annotationType"))
          break;
        paramObject = this.AYS;
        AppMethodBeat.o(118962);
        continue;
        label179: if (!this.AYU.containsKey(paramObject))
          break label211;
        paramObject = this.AYU.get(paramObject);
        AppMethodBeat.o(118962);
      }
    }
    label211: paramMethod = new StringBuilder("Method is not supported: ").append(paramMethod).append(" (args: ");
    paramObject = paramArrayOfObject;
    if (paramArrayOfObject == null)
      paramObject = new Object[0];
    paramObject = (Throwable)new x(e.Q(paramObject) + ')');
    AppMethodBeat.o(118962);
    throw paramObject;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     a.i.b.a.a.b.c
 * JD-Core Version:    0.6.2
 */