package com.tencent.mm.memory;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.nio.ByteBuffer;

final class h$1
  implements Runnable
{
  public final void run()
  {
    AppMethodBeat.i(115378);
    for (int i = 0; i < 10; i++)
      h.a(h.fdF, ByteBuffer.allocate(16384));
    AppMethodBeat.o(115378);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.memory.h.1
 * JD-Core Version:    0.6.2
 */