package com.tencent.mm.d.a;

import android.os.SystemClock;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ap.a;

final class r$a$1
  implements ap.a
{
  r$a$1(r.a parama, r paramr, l paraml)
  {
  }

  public final boolean BI()
  {
    AppMethodBeat.i(113874);
    r.a.a(this.civ, SystemClock.elapsedRealtimeNanos());
    this.cii.chO.k(this.civ);
    AppMethodBeat.o(113874);
    return false;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.d.a.r.a.1
 * JD-Core Version:    0.6.2
 */