package com.tencent.mm.plugin.secinforeport.a;

import com.tencent.matrix.trace.core.AppMethodBeat;

public enum d
  implements c
{
  private static c qjq;

  static
  {
    AppMethodBeat.i(126188);
    qjp = new d("INSTANCE");
    qjr = new d[] { qjp };
    qjq = new d.a((byte)0);
    AppMethodBeat.o(126188);
  }

  public static void a(c paramc)
  {
    if (paramc != null)
      qjq = paramc;
  }

  public final void Ch(int paramInt)
  {
    AppMethodBeat.i(126186);
    qjq.Ch(paramInt);
    AppMethodBeat.o(126186);
  }

  public final boolean Y(int paramInt, long paramLong)
  {
    AppMethodBeat.i(126184);
    boolean bool = qjq.Y(paramInt, paramLong);
    AppMethodBeat.o(126184);
    return bool;
  }

  public final void ff(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(126185);
    qjq.ff(paramInt1, paramInt2);
    AppMethodBeat.o(126185);
  }

  public final void o(int paramInt, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(126187);
    qjq.o(paramInt, paramArrayOfByte);
    AppMethodBeat.o(126187);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.secinforeport.a.d
 * JD-Core Version:    0.6.2
 */