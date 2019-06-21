package com.tencent.liteav;

import com.tencent.liteav.videoencoder.TXSVideoEncoderParam;
import com.tencent.matrix.trace.core.AppMethodBeat;

class c$6
  implements Runnable
{
  c$6(c paramc)
  {
  }

  public void run()
  {
    AppMethodBeat.i(67446);
    if (c.b(this.a) != null)
      c.b(this.a).b(true);
    c.a(this.a, c.d(this.a).width, c.d(this.a).height);
    AppMethodBeat.o(67446);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.liteav.c.6
 * JD-Core Version:    0.6.2
 */