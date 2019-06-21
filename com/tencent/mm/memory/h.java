package com.tencent.mm.memory;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.c;
import com.tencent.mm.sdk.g.d;
import java.nio.ByteBuffer;

public final class h extends c<ByteBuffer>
{
  public static h fdF;

  static
  {
    AppMethodBeat.i(115379);
    fdF = new h();
    d.post(new h.1(), "DecodeTempStorage_preload");
    AppMethodBeat.o(115379);
  }

  private h()
  {
    super(20);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.memory.h
 * JD-Core Version:    0.6.2
 */