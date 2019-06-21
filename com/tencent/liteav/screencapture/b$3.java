package com.tencent.liteav.screencapture;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.HashMap;

class b$3
  implements Runnable
{
  b$3(b paramb)
  {
  }

  public void run()
  {
    AppMethodBeat.i(66761);
    synchronized (this.a)
    {
      if (b.f(this.a).size() == 0)
        b.g(this.a);
      AppMethodBeat.o(66761);
      return;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.liteav.screencapture.b.3
 * JD-Core Version:    0.6.2
 */