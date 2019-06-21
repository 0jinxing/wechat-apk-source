package com.tencent.mm.audio.b;

import com.tencent.matrix.trace.core.AppMethodBeat;

final class b$2$2
  implements Runnable
{
  b$2$2(b.2 param2)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(116475);
    this.cpj.cpi.EH();
    if (b.a(this.cpj.cpi) != null)
      b.a(this.cpj.cpi).onError();
    AppMethodBeat.o(116475);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.audio.b.b.2.2
 * JD-Core Version:    0.6.2
 */