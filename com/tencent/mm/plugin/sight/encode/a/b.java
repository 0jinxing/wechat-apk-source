package com.tencent.mm.plugin.sight.encode.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.al;

public final class b
{
  public static void a(b.a parama, final int paramInt)
  {
    AppMethodBeat.i(70362);
    if (parama == null)
      AppMethodBeat.o(70362);
    while (true)
    {
      return;
      al.d(new Runnable()
      {
        public final void run()
        {
          AppMethodBeat.i(70359);
          this.qAo.onError(paramInt);
          AppMethodBeat.o(70359);
        }
      });
      AppMethodBeat.o(70362);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sight.encode.a.b
 * JD-Core Version:    0.6.2
 */