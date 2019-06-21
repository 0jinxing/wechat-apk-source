package com.tencent.mm.at;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ak;

final class g$2
  implements Runnable
{
  g$2(g paramg, String paramString, float paramFloat, boolean paramBoolean, int paramInt)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(78204);
    this.fEu.a(this.fEv, true, this.ckb, true, false, this.fEw, this.fEx);
    g.a(this.fEu).post(new g.2.1(this));
    AppMethodBeat.o(78204);
  }

  public final String toString()
  {
    AppMethodBeat.i(78205);
    String str = super.toString() + "|loadImginBackground";
    AppMethodBeat.o(78205);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.at.g.2
 * JD-Core Version:    0.6.2
 */