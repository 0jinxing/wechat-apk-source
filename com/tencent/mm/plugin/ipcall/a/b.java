package com.tencent.mm.plugin.ipcall.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.b.c;

public final class b
{
  private static c nvn;

  static
  {
    AppMethodBeat.i(21715);
    nvn = new b.1();
    AppMethodBeat.o(21715);
  }

  public static void init()
  {
    AppMethodBeat.i(21712);
    a.xxA.c(nvn);
    AppMethodBeat.o(21712);
  }

  public static void release()
  {
    AppMethodBeat.i(21713);
    a.xxA.d(nvn);
    AppMethodBeat.o(21713);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.ipcall.a.b
 * JD-Core Version:    0.6.2
 */