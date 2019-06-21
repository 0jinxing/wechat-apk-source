package com.tencent.mm.plugin.appbrand.jsapi.u.b;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ap.a;

final class a$2
  implements ap.a
{
  a$2(a parama)
  {
  }

  public final boolean BI()
  {
    boolean bool1 = false;
    AppMethodBeat.i(117366);
    boolean bool2;
    if (this.idL.idH > 0)
      if (this.idL.idI != null)
      {
        c localc = this.idL.idI;
        if (localc.idR != null)
        {
          bool2 = localc.idR.isPlaying();
          if (!bool2)
            break label77;
          this.idL.aGD();
          AppMethodBeat.o(117366);
          bool2 = bool1;
        }
      }
    while (true)
    {
      return bool2;
      bool2 = false;
      break;
      label77: bool2 = true;
      AppMethodBeat.o(117366);
      continue;
      AppMethodBeat.o(117366);
      bool2 = bool1;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.u.b.a.2
 * JD-Core Version:    0.6.2
 */