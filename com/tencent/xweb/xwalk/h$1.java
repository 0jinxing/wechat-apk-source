package com.tencent.xweb.xwalk;

import com.tencent.matrix.trace.core.AppMethodBeat;
import org.xwalk.core.XWalkV8;

final class h$1
  implements Runnable
{
  h$1(h paramh, int paramInt)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(85237);
    if (this.ASe.ASa != null)
      AppMethodBeat.o(85237);
    while (true)
    {
      return;
      this.ASe.ASa = new XWalkV8();
      this.ASe.ASa.init(this.ASd);
      AppMethodBeat.o(85237);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.xweb.xwalk.h.1
 * JD-Core Version:    0.6.2
 */