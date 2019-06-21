package com.tencent.mm.app.plugin.b;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ap.a;

final class a$f$1
  implements ap.a
{
  a$f$1(a.f paramf)
  {
  }

  public final boolean BI()
  {
    AppMethodBeat.i(15741);
    ab.i("MicroMsg.SubCoreExtAgent", "Voice record timeout.");
    this.chk.chh = true;
    this.chk.stopRecord();
    AppMethodBeat.o(15741);
    return false;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.app.plugin.b.a.f.1
 * JD-Core Version:    0.6.2
 */