package com.tencent.mm.d.a;

import com.eclipsesource.v8.SharedV8ArrayBuffer;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class k$a$1
  implements Runnable
{
  k$a$1(k.a parama)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(113828);
    ab.i("MicroMsg.SharedV8ArrayBufferMgr", "SharedBuffer do release");
    this.chN.chM.manualRelease();
    AppMethodBeat.o(113828);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.d.a.k.a.1
 * JD-Core Version:    0.6.2
 */