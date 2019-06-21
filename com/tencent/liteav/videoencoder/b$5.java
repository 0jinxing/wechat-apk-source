package com.tencent.liteav.videoencoder;

import com.tencent.matrix.trace.core.AppMethodBeat;

class b$5
  implements Runnable
{
  b$5(b paramb)
  {
  }

  public void run()
  {
    AppMethodBeat.i(67436);
    if (b.e(this.a) != null)
      b.e(this.a).setBitrate(b.g(this.a));
    AppMethodBeat.o(67436);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.liteav.videoencoder.b.5
 * JD-Core Version:    0.6.2
 */