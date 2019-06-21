package com.tencent.mm.memory.b;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class a$1
  implements Runnable
{
  a$1(a parama)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(115475);
    ab.d("MicroMsg.MaskBitmapDrawable", "refresh tag=%s", new Object[] { this.feS.tag });
    this.feS.invalidateSelf();
    AppMethodBeat.o(115475);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.memory.b.a.1
 * JD-Core Version:    0.6.2
 */