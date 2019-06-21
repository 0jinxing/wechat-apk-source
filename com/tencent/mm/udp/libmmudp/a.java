package com.tencent.mm.udp.libmmudp;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class a
{
  private static a.a ydR;

  static
  {
    AppMethodBeat.i(96561);
    ydR = new a.1();
    AppMethodBeat.o(96561);
  }

  public static void a(a.a parama)
  {
    ydR = parama;
  }

  public static void yB()
  {
    AppMethodBeat.i(96560);
    ydR.loadLibrary("mmudp");
    AppMethodBeat.o(96560);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.udp.libmmudp.a
 * JD-Core Version:    0.6.2
 */