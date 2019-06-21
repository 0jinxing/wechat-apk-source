package com.tencent.soter.core.c;

import com.tencent.matrix.trace.core.AppMethodBeat;
import junit.framework.Assert;

public final class h
{
  private static volatile h.a Avj;

  static
  {
    AppMethodBeat.i(73043);
    Avj = new h.1();
    AppMethodBeat.o(73043);
  }

  public static void a(h.a parama)
  {
    AppMethodBeat.i(73040);
    Assert.assertNotNull(parama);
    Avj = parama;
    AppMethodBeat.o(73040);
  }

  public static void dQX()
  {
    AppMethodBeat.i(73041);
    Avj.dQZ();
    AppMethodBeat.o(73041);
  }

  public static boolean dQY()
  {
    AppMethodBeat.i(73042);
    boolean bool = Avj.dQY();
    AppMethodBeat.o(73042);
    return bool;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.soter.core.c.h
 * JD-Core Version:    0.6.2
 */