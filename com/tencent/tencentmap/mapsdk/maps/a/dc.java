package com.tencent.tencentmap.mapsdk.maps.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

final class dc
  implements Runnable
{
  dc(cx paramcx)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(98697);
    if (cx.f(this.a).size() == 0)
    {
      cx.g(this.a).incrementAndGet();
      cx.a(this.a, false, true);
      AppMethodBeat.o(98697);
    }
    while (true)
    {
      return;
      cx.b(this.a, true, true);
      AppMethodBeat.o(98697);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.tencentmap.mapsdk.maps.a.dc
 * JD-Core Version:    0.6.2
 */