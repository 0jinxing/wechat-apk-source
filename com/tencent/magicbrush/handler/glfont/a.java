package com.tencent.magicbrush.handler.glfont;

import com.tencent.magicbrush.a.d.a;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class a
{
  private static d.a bSQ;

  static
  {
    AppMethodBeat.i(115904);
    bSQ = new a.1();
    AppMethodBeat.o(115904);
  }

  public static void a(d.a parama)
  {
    bSQ = parama;
  }

  public static d.a yF()
  {
    return bSQ;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.magicbrush.handler.glfont.a
 * JD-Core Version:    0.6.2
 */