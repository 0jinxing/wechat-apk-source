package com.tencent.mm.sdk.c;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ak;

final class b$1
  implements Runnable
{
  b$1(b paramb, b.b paramb1, b.c paramc, ak paramak)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(51968);
    this.xxM.a(this.xxK, this.xxL);
    if (this.mrz != null)
    {
      this.mrz.post(new b.1.1(this));
      AppMethodBeat.o(51968);
    }
    while (true)
    {
      return;
      this.xxL.onComplete();
      AppMethodBeat.o(51968);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.sdk.c.b.1
 * JD-Core Version:    0.6.2
 */