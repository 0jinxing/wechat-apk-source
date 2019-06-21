package com.tencent.mm.network;

import com.tencent.mars.smc.SmcLogic;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class x$1
  implements Runnable
{
  x$1(x paramx, boolean paramBoolean1, long paramLong, String paramString, boolean paramBoolean2)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(72650);
    if (this.gdI)
    {
      SmcLogic.writeImportKvData(this.gdJ, this.gdK, this.gdL, false);
      AppMethodBeat.o(72650);
    }
    while (true)
    {
      return;
      SmcLogic.writeKvData(this.gdJ, this.gdK, this.gdL, false);
      AppMethodBeat.o(72650);
    }
  }

  public final String toString()
  {
    AppMethodBeat.i(72651);
    String str = super.toString() + "|reportKV";
    AppMethodBeat.o(72651);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.network.x.1
 * JD-Core Version:    0.6.2
 */