package com.tencent.liteav;

import com.tencent.liteav.videoencoder.b;
import com.tencent.matrix.trace.core.AppMethodBeat;

class c$1
  implements Runnable
{
  c$1(c paramc, int paramInt1, int paramInt2, int paramInt3)
  {
  }

  public void run()
  {
    AppMethodBeat.i(66385);
    if ((this.a != 0) && (this.b != 0))
    {
      c.a(this.d).a = this.a;
      c.a(this.d).b = this.b;
      if (c.b(this.d) != null)
        c.b(this.d).a(this.a, this.b);
    }
    if ((this.c != 0) && (c.c(this.d) != null))
    {
      c.a(this.d).c = this.c;
      c.c(this.d).a(this.c);
    }
    AppMethodBeat.o(66385);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.liteav.c.1
 * JD-Core Version:    0.6.2
 */