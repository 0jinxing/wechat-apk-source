package com.tencent.mm.plugin.emoji.e;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.g;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.z;

final class e$1
  implements Runnable
{
  e$1(e parame, String paramString)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(52859);
    this.kTN.Jb(this.val$filePath);
    if (this.kTN.kTL)
      g.RP().Ry().set(ac.a.xJq, Long.valueOf(System.currentTimeMillis()));
    AppMethodBeat.o(52859);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.emoji.e.e.1
 * JD-Core Version:    0.6.2
 */