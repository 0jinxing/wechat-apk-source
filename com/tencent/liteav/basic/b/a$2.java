package com.tencent.liteav.basic.b;

import com.tencent.liteav.basic.util.TXCTimeUtil;
import com.tencent.matrix.trace.core.AppMethodBeat;

class a$2
  implements Runnable
{
  a$2(a parama)
  {
  }

  public void run()
  {
    AppMethodBeat.i(66047);
    a.a(this.a, true);
    a.a(this.a, TXCTimeUtil.getTimeTick());
    AppMethodBeat.o(66047);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.liteav.basic.b.a.2
 * JD-Core Version:    0.6.2
 */