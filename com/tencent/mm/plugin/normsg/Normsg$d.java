package com.tencent.mm.plugin.normsg;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class Normsg$d extends Normsg
{
  public static boolean b(Object paramObject, Class<?> paramClass)
  {
    AppMethodBeat.i(10311);
    boolean bool = Normsg.J2CBridge.access$1400(paramObject, paramClass);
    AppMethodBeat.o(10311);
    return bool;
  }

  public static boolean cg(Object paramObject)
  {
    AppMethodBeat.i(10312);
    boolean bool = Normsg.J2CBridge.access$1500(paramObject);
    AppMethodBeat.o(10312);
    return bool;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.normsg.Normsg.d
 * JD-Core Version:    0.6.2
 */