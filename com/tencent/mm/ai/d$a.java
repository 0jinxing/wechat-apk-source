package com.tencent.mm.ai;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.concurrent.ConcurrentHashMap;

public final class d$a
{
  private static ConcurrentHashMap<Object, d> fsR;

  static
  {
    AppMethodBeat.i(59944);
    fsR = new ConcurrentHashMap();
    AppMethodBeat.o(59944);
  }

  public static void a(d paramd)
  {
    AppMethodBeat.i(59941);
    ab.i("MicroMsg.IFunctionMessageExtension.Factory", "registerExtensionFor %s, %s", new Object[] { Integer.valueOf(12399999), Integer.valueOf(0) });
    fsR.put(Integer.valueOf(0), paramd);
    e.d.a(Integer.valueOf(12399999), paramd);
    AppMethodBeat.o(59941);
  }

  public static void b(d paramd)
  {
    AppMethodBeat.i(59942);
    ab.i("MicroMsg.IFunctionMessageExtension.Factory", "unregisterExtensionFor %s, %s", new Object[] { Integer.valueOf(12399999), Integer.valueOf(0) });
    fsR.remove(Integer.valueOf(0));
    e.d.b(Integer.valueOf(12399999), paramd);
    AppMethodBeat.o(59942);
  }

  public static d bf(Object paramObject)
  {
    AppMethodBeat.i(59943);
    paramObject = (d)fsR.get(paramObject);
    AppMethodBeat.o(59943);
    return paramObject;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ai.d.a
 * JD-Core Version:    0.6.2
 */