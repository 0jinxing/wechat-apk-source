package kotlinx.coroutines;

import a.c.c;
import a.f.b.j;
import a.l;
import com.tencent.matrix.trace.core.AppMethodBeat;
import kotlinx.coroutines.a.n;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"DEBUG", "", "getDEBUG", "()Z", "DEBUG_PROPERTY_NAME", "", "DEBUG_PROPERTY_VALUE_AUTO", "DEBUG_PROPERTY_VALUE_OFF", "DEBUG_PROPERTY_VALUE_ON", "classSimpleName", "", "getClassSimpleName", "(Ljava/lang/Object;)Ljava/lang/String;", "hexAddress", "getHexAddress", "toDebugString", "Lkotlin/coroutines/Continuation;", "kotlinx-coroutines-core"})
public final class af
{
  private static final boolean DEBUG;

  static
  {
    AppMethodBeat.i(118546);
    Object localObject = n.awA("kotlinx.coroutines.debug");
    boolean bool;
    if (localObject == null)
    {
      bool = aa.class.desiredAssertionStatus();
      label21: DEBUG = bool;
      AppMethodBeat.o(118546);
      return;
    }
    switch (((String)localObject).hashCode())
    {
    default:
    case 0:
      label76: 
      do
      {
        localObject = (Throwable)new IllegalStateException(("System property 'kotlinx.coroutines.debug' has unrecognized value '" + (String)localObject + '\'').toString());
        AppMethodBeat.o(118546);
        throw ((Throwable)localObject);
      }
      while (!((String)localObject).equals(""));
    case 3005871:
    case 109935:
    case 3551:
    }
    while (true)
    {
      bool = true;
      break label21;
      if (!((String)localObject).equals("auto"))
        break label76;
      break;
      if (!((String)localObject).equals("off"))
        break label76;
      bool = false;
      break label21;
      if (!((String)localObject).equals("on"))
        break label76;
    }
  }

  public static final String d(c<?> paramc)
  {
    AppMethodBeat.i(118544);
    j.p(paramc, "receiver$0");
    if ((paramc instanceof al))
    {
      paramc = paramc.toString();
      AppMethodBeat.o(118544);
    }
    while (true)
    {
      return paramc;
      paramc = paramc + '@' + ee(paramc);
      AppMethodBeat.o(118544);
    }
  }

  public static final String ee(Object paramObject)
  {
    AppMethodBeat.i(118543);
    j.p(paramObject, "receiver$0");
    paramObject = Integer.toHexString(System.identityHashCode(paramObject));
    j.o(paramObject, "Integer.toHexString(System.identityHashCode(this))");
    AppMethodBeat.o(118543);
    return paramObject;
  }

  public static final String ef(Object paramObject)
  {
    AppMethodBeat.i(118545);
    j.p(paramObject, "receiver$0");
    paramObject = paramObject.getClass().getSimpleName();
    j.o(paramObject, "this::class.java.simpleName");
    AppMethodBeat.o(118545);
    return paramObject;
  }

  public static final boolean ela()
  {
    return DEBUG;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     kotlinx.coroutines.af
 * JD-Core Version:    0.6.2
 */