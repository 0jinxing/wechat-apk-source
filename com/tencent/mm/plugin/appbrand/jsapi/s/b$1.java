package com.tencent.mm.plugin.appbrand.jsapi.s;

import android.os.Looper;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.d.a.a;
import com.tencent.mm.plugin.appbrand.widget.c.a;
import com.tencent.mm.sdk.platformtools.al;

final class b$1
  implements a.a
{
  b$1(a parama)
  {
  }

  public final void Q(byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(126629);
    paramArrayOfByte = new b.1.1(this, paramArrayOfByte);
    if (Looper.getMainLooper() == Looper.myLooper())
    {
      paramArrayOfByte.run();
      AppMethodBeat.o(126629);
    }
    while (true)
    {
      return;
      al.d(paramArrayOfByte);
      AppMethodBeat.o(126629);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.s.b.1
 * JD-Core Version:    0.6.2
 */