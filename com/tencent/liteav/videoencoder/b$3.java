package com.tencent.liteav.videoencoder;

import com.tencent.liteav.beauty.b.k;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

class b$3
  implements Runnable
{
  b$3(b paramb, com.tencent.liteav.basic.e.b paramb1)
  {
  }

  public void run()
  {
    AppMethodBeat.i(67362);
    b.d(this.b).clear();
    if (b.e(this.b) != null)
      b.e(this.b).stop();
    if (b.b(this.b) != null)
    {
      b.b(this.b).d();
      b.a(this.b, null);
    }
    if (this.a != null)
      this.a.b();
    AppMethodBeat.o(67362);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.liteav.videoencoder.b.3
 * JD-Core Version:    0.6.2
 */