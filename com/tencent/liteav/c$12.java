package com.tencent.liteav;

import com.tencent.liteav.videoencoder.b;
import com.tencent.matrix.trace.core.AppMethodBeat;

class c$12
  implements Runnable
{
  c$12(c paramc, b paramb)
  {
  }

  public void run()
  {
    AppMethodBeat.i(67705);
    try
    {
      if (this.a != null)
      {
        this.a.a();
        this.a.a(null);
      }
      AppMethodBeat.o(67705);
      return;
    }
    catch (Exception localException)
    {
      while (true)
        AppMethodBeat.o(67705);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.liteav.c.12
 * JD-Core Version:    0.6.2
 */