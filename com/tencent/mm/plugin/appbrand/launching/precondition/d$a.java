package com.tencent.mm.plugin.appbrand.launching.precondition;

import android.os.Looper;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ap;
import com.tencent.mm.sdk.platformtools.ap.a;

final class d$a extends ap
{
  d$a(String paramString)
  {
    super(Looper.getMainLooper(), new ap.a()
    {
      public final boolean BI()
      {
        AppMethodBeat.i(132068);
        d.Cn(d.a.this);
        AppMethodBeat.o(132068);
        return false;
      }
    }
    , false);
    AppMethodBeat.i(132069);
    AppMethodBeat.o(132069);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.launching.precondition.d.a
 * JD-Core Version:    0.6.2
 */