package com.tencent.xweb.xwalk;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.File;

final class c$40
  implements Runnable
{
  c$40(c paramc, String paramString)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(85168);
    try
    {
      Thread.sleep(5000L);
      label11: File localFile = new File(this.ARC);
      String str = this.ARC + ".zip";
      o.a(new File[] { localFile }, str);
      AppMethodBeat.o(85168);
      return;
    }
    catch (InterruptedException localInterruptedException)
    {
      break label11;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.xweb.xwalk.c.40
 * JD-Core Version:    0.6.2
 */