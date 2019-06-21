package com.tencent.liteav;

import com.tencent.liteav.videoencoder.TXSVideoEncoderParam;
import com.tencent.matrix.trace.core.AppMethodBeat;

class c$4
  implements Runnable
{
  c$4(c paramc)
  {
  }

  public void run()
  {
    AppMethodBeat.i(67767);
    try
    {
      if ((this.a.a != null) && (c.b(this.a) != null) && (c.i(this.a) != null))
        this.a.a.a(c.b(this.a).f(), c.i(this.a), c.a(this.a).t, c.d(this.a).width, c.d(this.a).height);
      AppMethodBeat.o(67767);
      return;
    }
    catch (Exception localException)
    {
      while (true)
        AppMethodBeat.o(67767);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.liteav.c.4
 * JD-Core Version:    0.6.2
 */