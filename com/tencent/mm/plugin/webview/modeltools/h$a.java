package com.tencent.mm.plugin.webview.modeltools;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import java.io.File;

final class h$a
  implements Runnable
{
  private h$a(h paramh)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(7009);
    if (this.upu.upr == null)
      AppMethodBeat.o(7009);
    while (true)
    {
      return;
      File[] arrayOfFile = new File(this.upu.upr).getParentFile().listFiles(new h.a.1(this));
      int i = arrayOfFile.length;
      for (int j = 0; j < i; j++)
        ab.i("MicroMsg.ViewCaptureHelper", "deleteFile result: %b", new Object[] { Boolean.valueOf(arrayOfFile[j].delete()) });
      this.upu.upr = null;
      AppMethodBeat.o(7009);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.modeltools.h.a
 * JD-Core Version:    0.6.2
 */